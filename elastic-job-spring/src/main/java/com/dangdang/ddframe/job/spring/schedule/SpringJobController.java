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
 */

package com.dangdang.ddframe.job.spring.schedule;

import com.dangdang.ddframe.job.spring.namespace.parser.common.AbstractJobConfigurationDto;
import com.dangdang.ddframe.reg.base.CoordinatorRegistryCenter;


/**
 * 基于Spring的作业启动器.
 *
 * <p>
 * <strong>包结构调整, 作业类型全部迁移至plugin包. 未来版本将删除, 请从旧版本升级的程序升级.</strong>
 * </p>
 * @see com.dangdang.ddframe.job.spring.schedule.SpringJobScheduler
 * @author caohao
 * 
 * @deprecated .
 */
@Deprecated
public class SpringJobController extends SpringJobScheduler {
    
    public SpringJobController(final CoordinatorRegistryCenter coordinatorRegistryCenter, final AbstractJobConfigurationDto jobConfigurationDto) {
        super(coordinatorRegistryCenter, jobConfigurationDto);
    }
}
