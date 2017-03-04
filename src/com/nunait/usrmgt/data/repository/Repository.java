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

package com.nunait.usrmgt.data.repository;

import com.nunait.usrmgt.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** 
 * (ES)
 * <p>
 * (EN)
 * <p>
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 3 de marzo de 2017 12:42:02 ART
 */
public class Repository {
    private Collection<User> dao = new HashSet<>();
    
    public void save(User user) {
        dao.add( user );
    }
    
    public int size() {
        return dao.size();
    }
}
