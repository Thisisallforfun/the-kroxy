/*
 * Copyright Kroxylicious Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.kroxylicious.sample.config;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleFilterConfigTest {

    private static final String CONFIG_FIND_VALUE = "from";
    private static final String CONFIG_REPLACE_VALUE = "to";

    @Test
    void validateSampleFetchResponseConfigTest() {
        SampleFilterConfig config = new SampleFilterConfig(CONFIG_FIND_VALUE, CONFIG_REPLACE_VALUE);
        assertThat(config.getFindValue()).isEqualTo(CONFIG_FIND_VALUE);
        assertThat(config.getReplacementValue()).isEqualTo(CONFIG_REPLACE_VALUE);
    }

    @Test
    void validateSampleFetchResponseConfigEmptyReplacementValueTest() {
        SampleFilterConfig config = new SampleFilterConfig(CONFIG_FIND_VALUE, null);
        assertThat(config.getFindValue()).isEqualTo(CONFIG_FIND_VALUE);
        assertThat(config.getReplacementValue()).isEqualTo("");
    }
}
