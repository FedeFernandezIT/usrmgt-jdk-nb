/*
 * Copyright 2017 NunaIT.
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
package com.nunait.usrmgt;

/** 
 * (ES) Proporciona información básica del usuario.
 * <p>
 * (EN) Provides core user information.
 * <p> 
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 27 de febrero de 2017 18:19:22 ART
 */
public interface UserDetails {
    
    /**
     * (ES) Retorna el username utilizado para autenticar al usuario. No puede ser <code>null</code>.
     * <p>
     * (EN) Returns the username used to authenticate the user. Can't be <code>null</code>.
     * @return username (never <code>null</code>)
     */
    String getUsername();
    
    /**
     * (ES) Retorna la contraseña utilizada para autenticar al usuario.
     * <p>
     * (EN) Returns the password used to authenticate the user.
     * <p>
     * @return username (never null)
     */
    String getPassword();
}
