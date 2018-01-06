/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.datasource;

import java.util.Properties;
import javax.sql.DataSource;

/**
 * @author Clinton Begin
 */

/**----------------定义了一个数据源工厂接口---------------------*/

/**
 *  1. setProperties 数据源配置
 *  2. getDataSource 获取数据源
 */
public interface DataSourceFactory {


  void setProperties(Properties props);

  DataSource getDataSource(); /** 数据源是java1.4开始的接口，有获取连接方法，实现时必须带有无参构造器 */

}
