/*
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
package com.facebook.presto.execution.resourceGroups;

import io.airlift.units.DataSize;
import io.airlift.units.Duration;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public interface ResourceGroup
{
    ResourceGroupId getId();

    DataSize getSoftMemoryLimit();

    void setSoftMemoryLimit(DataSize limit);

    Duration getSoftCpuLimit();

    void setSoftCpuLimit(Duration limit);

    Duration getHardCpuLimit();

    void setHardCpuLimit(Duration limit);

    long getCpuQuotaGenerationMillisPerSecond();

    void setCpuQuotaGenerationMillisPerSecond(long rate);

    int getMaxRunningQueries();

    void setMaxRunningQueries(int maxRunningQueries);

    int getMaxQueuedQueries();

    void setMaxQueuedQueries(int maxQueuedQueries);

    int getSchedulingWeight();

    void setSchedulingWeight(int weight);

    SchedulingPolicy getSchedulingPolicy();

    void setSchedulingPolicy(SchedulingPolicy policy);

    boolean getJmxExport();

    void setJmxExport(boolean export);
}
