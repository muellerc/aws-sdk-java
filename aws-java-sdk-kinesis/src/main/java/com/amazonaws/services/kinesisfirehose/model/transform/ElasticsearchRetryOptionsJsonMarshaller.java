/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ElasticsearchRetryOptionsMarshaller
 */
public class ElasticsearchRetryOptionsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchRetryOptions elasticsearchRetryOptions, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchRetryOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchRetryOptions.getDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("DurationInSeconds").writeValue(elasticsearchRetryOptions.getDurationInSeconds());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchRetryOptionsJsonMarshaller instance;

    public static ElasticsearchRetryOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchRetryOptionsJsonMarshaller();
        return instance;
    }

}
