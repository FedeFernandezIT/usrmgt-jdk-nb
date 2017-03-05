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

/** 
 * (ES) Interfaz básica de un Repositorio. Captura el tipo de entidad del
 * dominio que gestiona. <p>
 * (EN) Basic interface of a Repository. Captures the entity type of  the domain
 * that it manages.<p>
 * @param <T> entity type of the domain that the repository manages.
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 5 de marzo de 2017 9:58:53 ART
 */
public interface Repository <T> {

    void save(T entity);

}
