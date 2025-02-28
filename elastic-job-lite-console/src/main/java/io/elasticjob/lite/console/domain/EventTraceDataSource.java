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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 事件追踪数据源.
 * 用于构造配置，初始化对象
 *
 * @author zhangxinguo
 */
@Slf4j
public final class EventTraceDataSource {
    
    @Getter(AccessLevel.PROTECTED)
    private EventTraceDataSourceConfiguration eventTraceDataSourceConfiguration;
    
    public EventTraceDataSource(final EventTraceDataSourceConfiguration eventTraceDataSourceConfiguration) {
        this.eventTraceDataSourceConfiguration = eventTraceDataSourceConfiguration;
    }
    
    /**
     * 初始化.
     * 1、获取已配置的数据追踪源参数
     * 2、进行数据库连接
     */
    public void init() {
        log.debug("Elastic job: data source init, connection url is: {}.", eventTraceDataSourceConfiguration.getUrl());
        try {
            Class.forName(eventTraceDataSourceConfiguration.getDriver());
            DriverManager.getConnection(eventTraceDataSourceConfiguration.getUrl(), eventTraceDataSourceConfiguration.getUsername(), eventTraceDataSourceConfiguration.getPassword());
        } catch (final ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
