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
package com.amazonaws.services.simpleworkflow.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ActivityTaskCompletedEventAttributesMarshaller
 */
public class ActivityTaskCompletedEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (activityTaskCompletedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityTaskCompletedEventAttributes.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(activityTaskCompletedEventAttributes.getResult());
            }
            if (activityTaskCompletedEventAttributes.getScheduledEventId() != null) {
                jsonGenerator.writeFieldName("scheduledEventId").writeValue(activityTaskCompletedEventAttributes.getScheduledEventId());
            }
            if (activityTaskCompletedEventAttributes.getStartedEventId() != null) {
                jsonGenerator.writeFieldName("startedEventId").writeValue(activityTaskCompletedEventAttributes.getStartedEventId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityTaskCompletedEventAttributesJsonMarshaller instance;

    public static ActivityTaskCompletedEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityTaskCompletedEventAttributesJsonMarshaller();
        return instance;
    }

}
