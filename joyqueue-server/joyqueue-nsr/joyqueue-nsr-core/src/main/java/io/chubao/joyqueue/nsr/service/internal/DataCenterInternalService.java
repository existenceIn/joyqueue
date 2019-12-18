/**
 * Copyright 2019 The JoyQueue Authors.
 *
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
 */
package io.chubao.joyqueue.nsr.service.internal;

import io.chubao.joyqueue.domain.DataCenter;

import java.util.List;

public interface DataCenterInternalService {

    /**
     * 获取所有
     *
     * @return
     */
    List<DataCenter> getAll();

    /**
     * 根据ID获取
     *
     * @param id
     * @return
     */
    DataCenter getById(String id);

    /**
     * 添加
     *
     * @param dataCenter
     */
    DataCenter add(DataCenter dataCenter);

    /**
     * 根据id更新
     *
     * @param dataCenter
     */
    DataCenter update(DataCenter dataCenter);

    /**
     * 根据id删除
     *
     * @param id
     */
    void delete(String id);
}
