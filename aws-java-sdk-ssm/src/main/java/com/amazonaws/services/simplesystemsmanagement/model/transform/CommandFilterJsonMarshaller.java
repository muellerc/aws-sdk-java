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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.protocol.json.*;

/**
 * CommandFilterMarshaller
 */
public class CommandFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CommandFilter commandFilter, StructuredJsonGenerator jsonGenerator) {

        if (commandFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (commandFilter.getKey() != null) {
                jsonGenerator.writeFieldName("key").writeValue(commandFilter.getKey());
            }
            if (commandFilter.getValue() != null) {
                jsonGenerator.writeFieldName("value").writeValue(commandFilter.getValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandFilterJsonMarshaller instance;

    public static CommandFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandFilterJsonMarshaller();
        return instance;
    }

}
