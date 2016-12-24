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
package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ActivitiesResponseMarshaller
 */
public class ActivitiesResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivitiesResponse activitiesResponse, StructuredJsonGenerator jsonGenerator) {

        if (activitiesResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<ActivityResponse> itemList = activitiesResponse.getItem();
            if (itemList != null) {
                jsonGenerator.writeFieldName("Item");
                jsonGenerator.writeStartArray();
                for (ActivityResponse itemListValue : itemList) {
                    if (itemListValue != null) {

                        ActivityResponseJsonMarshaller.getInstance().marshall(itemListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivitiesResponseJsonMarshaller instance;

    public static ActivitiesResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivitiesResponseJsonMarshaller();
        return instance;
    }

}
