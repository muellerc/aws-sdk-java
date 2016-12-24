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
package com.amazonaws.services.lambda.model.transform;

import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.protocol.json.*;

/**
 * EnvironmentResponseMarshaller
 */
public class EnvironmentResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EnvironmentResponse environmentResponse, StructuredJsonGenerator jsonGenerator) {

        if (environmentResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalMap<String, String> variablesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) environmentResponse
                    .getVariables();
            if (!variablesMap.isEmpty() || !variablesMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Variables");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> variablesMapValue : variablesMap.entrySet()) {
                    if (variablesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(variablesMapValue.getKey());

                        jsonGenerator.writeValue(variablesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (environmentResponse.getError() != null) {
                jsonGenerator.writeFieldName("Error");
                EnvironmentErrorJsonMarshaller.getInstance().marshall(environmentResponse.getError(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EnvironmentResponseJsonMarshaller instance;

    public static EnvironmentResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentResponseJsonMarshaller();
        return instance;
    }

}
