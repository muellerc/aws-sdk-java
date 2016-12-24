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
package com.amazonaws.services.iot.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.protocol.json.*;

/**
 * CloudwatchMetricActionMarshaller
 */
public class CloudwatchMetricActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CloudwatchMetricAction cloudwatchMetricAction, StructuredJsonGenerator jsonGenerator) {

        if (cloudwatchMetricAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cloudwatchMetricAction.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(cloudwatchMetricAction.getRoleArn());
            }
            if (cloudwatchMetricAction.getMetricNamespace() != null) {
                jsonGenerator.writeFieldName("metricNamespace").writeValue(cloudwatchMetricAction.getMetricNamespace());
            }
            if (cloudwatchMetricAction.getMetricName() != null) {
                jsonGenerator.writeFieldName("metricName").writeValue(cloudwatchMetricAction.getMetricName());
            }
            if (cloudwatchMetricAction.getMetricValue() != null) {
                jsonGenerator.writeFieldName("metricValue").writeValue(cloudwatchMetricAction.getMetricValue());
            }
            if (cloudwatchMetricAction.getMetricUnit() != null) {
                jsonGenerator.writeFieldName("metricUnit").writeValue(cloudwatchMetricAction.getMetricUnit());
            }
            if (cloudwatchMetricAction.getMetricTimestamp() != null) {
                jsonGenerator.writeFieldName("metricTimestamp").writeValue(cloudwatchMetricAction.getMetricTimestamp());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CloudwatchMetricActionJsonMarshaller instance;

    public static CloudwatchMetricActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudwatchMetricActionJsonMarshaller();
        return instance;
    }

}
