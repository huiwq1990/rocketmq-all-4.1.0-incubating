/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.common.admin;

/**
 * 按时间回溯消费进度
 */
public class RollbackStats {
    private String brokerName;
    private long queueId;
    private long brokerOffset;
    private long consumerOffset;
    private long timestampOffset;
    private long rollbackOffset;

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public long getQueueId() {
        return queueId;
    }

    public void setQueueId(long queueId) {
        this.queueId = queueId;
    }

    public long getBrokerOffset() {
        return brokerOffset;
    }

    public void setBrokerOffset(long brokerOffset) {
        this.brokerOffset = brokerOffset;
    }

    public long getConsumerOffset() {
        return consumerOffset;
    }

    public void setConsumerOffset(long consumerOffset) {
        this.consumerOffset = consumerOffset;
    }

    public long getTimestampOffset() {
        return timestampOffset;
    }

    public void setTimestampOffset(long timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    public long getRollbackOffset() {
        return rollbackOffset;
    }

    public void setRollbackOffset(long rollbackOffset) {
        this.rollbackOffset = rollbackOffset;
    }
}
