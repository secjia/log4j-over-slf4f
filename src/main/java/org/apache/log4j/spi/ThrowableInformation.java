/*
 * Copyright 2011 QOS.ch.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log4j.spi;

import org.apache.log4j.Category;

/**
 * Classe implementada para atender problena de utiliza��o do Log4j pelo Filenet 
 * P8
 */
public class ThrowableInformation {
    
    private Throwable throwable;
    private Category category;
    private String[] rep;
    
    public ThrowableInformation() {
        
    }
    
    public ThrowableInformation(Throwable throwable) {
        this.throwable = throwable;
    }
    
    public ThrowableInformation(Throwable throwable, Category category) {
        this.throwable = throwable;
        this.category = category;
    }
    
    public Throwable getThrowable() {
        return throwable;
    }
    
    public String[] getThrowableStrRep() {
        if (throwable != null) {
            rep = new String[1];
            rep[0] = throwable.toString();
        }
        return rep;
    }
}
