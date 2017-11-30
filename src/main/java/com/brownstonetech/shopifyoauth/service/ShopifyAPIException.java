/**
 *       Copyright 2010 Newcastle University
 *
 *          http://research.ncl.ac.uk/smart/
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.brownstonetech.shopifyoauth.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 *
 */
public class ShopifyAPIException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> errorMessages;
	private List<String> warningMessages;
	private List<String> infoMessages;
	
	public ShopifyAPIException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShopifyAPIException(String s) {
        super(s);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShopifyAPIException(String s, Throwable throwable) {
        super(s, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShopifyAPIException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }
    
    public ShopifyAPIException error(String... messages) {
    	if ( errorMessages == null ) {
    		errorMessages = new ArrayList<String>(Arrays.asList(messages));
    	} else {
    		errorMessages.addAll(Arrays.asList(messages));
    	}
    	return this;
    }

    public ShopifyAPIException warn(String... messages) {
    	if ( warningMessages == null ) {
    		warningMessages = new ArrayList<String>(Arrays.asList(messages));
    	} else {
    		warningMessages.addAll(Arrays.asList(messages));
    	}
    	return this;
    }

    public ShopifyAPIException info(String... messages) {
    	if ( infoMessages == null ) {
    		infoMessages = new ArrayList<String>(Arrays.asList(messages));
    	} else {
    		infoMessages.addAll(Arrays.asList(messages));
    	}
    	return this;
    }
    
    public List<String> getErrorMessages() {
    	if ( errorMessages == null ) return Collections.emptyList();
    	return errorMessages;
    }
    
    public List<String> getWarningMessages() {
    	if ( warningMessages == null ) return Collections.emptyList();
    	return warningMessages;
    }

    public List<String> getInfoMessages() {
    	if ( infoMessages == null ) return Collections.emptyList();
    	return infoMessages;
    }
    
}
