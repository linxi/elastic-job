/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 *
 */

package com.dangdang.ddframe.job.spring.namespace.parser.script;

import com.dangdang.ddframe.job.spring.namespace.parser.common.AbstractJobBeanDefinitionParser;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;

/**
 * 脚本作业的命名空间解析器.
 * 
 * @author caohao
 */
public class ScriptJobBeanDefinitionParser extends AbstractJobBeanDefinitionParser {
    
    @Override
    protected Class<ScriptJobConfigurationDto> getJobConfigurationDTO() {
        return ScriptJobConfigurationDto.class;
    }
    
    @Override
    protected void setPropertiesValue(final Element element, final BeanDefinitionBuilder factory) {
        addPropertyValueIfNotEmpty("scriptCommandLine", element, factory);
    }
}
