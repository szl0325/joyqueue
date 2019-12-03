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
package io.chubao.joyqueue.nsr.event;

import io.chubao.joyqueue.event.EventType;
import io.chubao.joyqueue.event.MetaEvent;
import io.chubao.joyqueue.nsr.nameservice.NameServiceCache;

/**
 * CompensateEvent
 * author: gaohaoxiang
 * date: 2019/10/18
 */
public class CompensateEvent extends MetaEvent {

    private NameServiceCache oldCache;
    private NameServiceCache newCache;

    public CompensateEvent() {

    }

    public CompensateEvent(NameServiceCache oldCache, NameServiceCache newCache) {
        this.oldCache = oldCache;
        this.newCache = newCache;
    }

    public NameServiceCache getOldCache() {
        return oldCache;
    }

    public void setOldCache(NameServiceCache oldCache) {
        this.oldCache = oldCache;
    }

    public NameServiceCache getNewCache() {
        return newCache;
    }

    public void setNewCache(NameServiceCache newCache) {
        this.newCache = newCache;
    }

    @Override
    public String getTypeName() {
        return EventType.COMPENSATE.name();
    }
}