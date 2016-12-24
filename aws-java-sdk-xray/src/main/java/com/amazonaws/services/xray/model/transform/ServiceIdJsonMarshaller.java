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
package com.amazonaws.services.xray.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ServiceIdMarshaller
 */
public class ServiceIdJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ServiceId serviceId, StructuredJsonGenerator jsonGenerator) {

        if (serviceId == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (serviceId.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(serviceId.getName());
            }

            java.util.List<String> namesList = serviceId.getNames();
            if (namesList != null) {
                jsonGenerator.writeFieldName("Names");
                jsonGenerator.writeStartArray();
                for (String namesListValue : namesList) {
                    if (namesListValue != null) {
                        jsonGenerator.writeValue(namesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (serviceId.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(serviceId.getAccountId());
            }
            if (serviceId.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(serviceId.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServiceIdJsonMarshaller instance;

    public static ServiceIdJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceIdJsonMarshaller();
        return instance;
    }

}
