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

package io.elasticjob.lite.console.domain;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 事件追踪数据源配置根对象.
 *  EventTraceDataSourceConfiguration 配置组对象
 * @author zhangxinguo
 */
@Getter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public final class EventTraceDataSourceConfigurations {
    
    private Set<EventTraceDataSourceConfiguration> eventTraceDataSourceConfiguration = new LinkedHashSet<>();
}
