/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.elasticjob.lite.console.repository;

import io.elasticjob.lite.console.domain.GlobalConfiguration;

/**
 * 基于XML的全局配置数据访问器.
 * 1、程序会生成 Configurations.xml 的文件
 * 1.1、Configurations.xml内容：zookeeper相关配置信息，数据源配置信息
 *
 * @author zhangliang
 */
public interface ConfigurationsXmlRepository extends XmlRepository<GlobalConfiguration> {
}
