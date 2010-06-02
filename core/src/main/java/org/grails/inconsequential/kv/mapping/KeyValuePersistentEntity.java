/* Copyright (C) 2010 SpringSource
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
package org.grails.inconsequential.kv.mapping;

import org.grails.inconsequential.mapping.*;

/**
 * @author Graeme Rocher
 * @since 1.0
 */
public class KeyValuePersistentEntity<KeyValueMapping> extends AbstractPersistentEntity{
    public KeyValuePersistentEntity(Class javaClass, MappingContext context) {
        super(javaClass, context);
    }

    @Override
    public ClassMapping<KeyValueMapping> getMapping() {
        return new KeyValueClassMapping(this, context);
    }

    public class KeyValueClassMapping extends AbstractClassMapping<KeyValueMapping> {
        public KeyValueClassMapping(PersistentEntity entity, MappingContext context) {
            super(entity, context);
        }
        public KeyValueMapping getMappedForm() {
            return (KeyValueMapping) context.getMappingFactory().createMappedForm(KeyValuePersistentEntity.this);
        }
    }
}
