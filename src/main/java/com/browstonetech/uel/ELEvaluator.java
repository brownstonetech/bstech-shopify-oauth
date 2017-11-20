package com.browstonetech.uel;

import java.util.Map;

import javax.el.ArrayELResolver;
import javax.el.BeanELResolver;
import javax.el.CompositeELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.ExpressionFactory;
import javax.el.FunctionMapper;
import javax.el.ListELResolver;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

public class ELEvaluator {

	private static final ExpressionFactory expressionFactory = ExpressionFactory.newInstance();
	
	public static <T> T eval(String el, Map<?,?> variables, Class<T> expectedType) {
		final VariableMapper variableMapper = new VariableMapperImpl();
		final FunctionMapper functionMapper = new FunctionMapperImpl();
		final CompositeELResolver compositeELResolver = new CompositeELResolver();
	    compositeELResolver.add(new ArrayELResolver());
	    compositeELResolver.add(new ListELResolver());
	    compositeELResolver.add(new BeanELResolver());
	    compositeELResolver.add(new MapContextELResolver(variables,true));
	    
	    ELContext context = new ELContext() {
	    	@Override
	    	public ELResolver getELResolver() {
	    		return compositeELResolver;
	    	}
	    	@Override
	    	public FunctionMapper getFunctionMapper() {
	    		return functionMapper;
	    	}
	    	@Override
	    	public VariableMapper getVariableMapper() {
	    		return variableMapper;
	    	}
	    };

	    ValueExpression ve = expressionFactory.createValueExpression(context, el, expectedType);

	    @SuppressWarnings("unchecked")
		T result = (T)ve.getValue(context);
	    return result;
	    
	}
}
