/*
 * Copyright Kroxylicious Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.kroxylicious.proxy.internal.filter;

import io.kroxylicious.proxy.filter.Filter;
import io.kroxylicious.proxy.filter.FilterFactory;
import io.kroxylicious.proxy.filter.FilterFactoryContext;
import io.kroxylicious.proxy.plugin.Plugin;
import io.kroxylicious.proxy.plugin.PluginConfigurationException;

import edu.umd.cs.findbugs.annotations.NonNull;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Plugin(configType = FieldInjectionConfig.class)
public class FieldInjection implements FilterFactory<FieldInjectionConfig, String> {
    @Override
    public String initialize(FilterFactoryContext context, FieldInjectionConfig config) throws PluginConfigurationException {
        assertEquals("hello, world", config.str());
        return config.str();
    }

    @NonNull
    @Override
    public Filter createFilter(FilterFactoryContext context, String str) {
        throw new RuntimeException("Not expected to be called");
    }
}
