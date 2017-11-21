package com.brownstonetech.uel;

import java.beans.FeatureDescriptor;
import java.util.Iterator;
import java.util.Map;

import javax.el.ELContext;
import javax.el.MapELResolver;

public class MapContextELResolver extends MapELResolver {

	private Map<?, ?> contextVariables;

	public MapContextELResolver(Map<?, ?> contextVariables, boolean isReadOnly) {
		super(isReadOnly);
		this.contextVariables = contextVariables;
	}

	@Override
	public Object getValue(ELContext context, Object base, Object property) {
		if(base==null) {
			base = contextVariables;
		}
		return super.getValue(context, base, property);
	}

	@Override
	public Class<?> getCommonPropertyType(ELContext context, Object base) {
		if(base==null) {
			base = contextVariables;
		}
		return super.getCommonPropertyType(context, base);
	}

	@Override
	public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext context,
			Object base) {
		if(base==null) {
			base = contextVariables;
		}
		return super.getFeatureDescriptors(context, base);
	}

	@Override
	public Class<?> getType(ELContext context, Object base, Object property) {
		if(base==null) {
			base = contextVariables;
		}
		return super.getType(context, base, property);
	}

	@Override
	public boolean isReadOnly(ELContext context, Object base, Object property) {
		if(base==null) {
			base = contextVariables;
		}
		return super.isReadOnly(context, base, property);
	}

	@Override
	public void setValue(ELContext context, Object base, Object property, Object value) {
		if(base==null) {
			base = contextVariables;
		}
		super.setValue(context, base, property, value);
	}

}
