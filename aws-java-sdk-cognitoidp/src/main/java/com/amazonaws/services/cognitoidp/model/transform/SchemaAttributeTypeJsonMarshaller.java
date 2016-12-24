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
package com.amazonaws.services.cognitoidp.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.protocol.json.*;

/**
 * SchemaAttributeTypeMarshaller
 */
public class SchemaAttributeTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SchemaAttributeType schemaAttributeType, StructuredJsonGenerator jsonGenerator) {

        if (schemaAttributeType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (schemaAttributeType.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(schemaAttributeType.getName());
            }
            if (schemaAttributeType.getAttributeDataType() != null) {
                jsonGenerator.writeFieldName("AttributeDataType").writeValue(schemaAttributeType.getAttributeDataType());
            }
            if (schemaAttributeType.getDeveloperOnlyAttribute() != null) {
                jsonGenerator.writeFieldName("DeveloperOnlyAttribute").writeValue(schemaAttributeType.getDeveloperOnlyAttribute());
            }
            if (schemaAttributeType.getMutable() != null) {
                jsonGenerator.writeFieldName("Mutable").writeValue(schemaAttributeType.getMutable());
            }
            if (schemaAttributeType.getRequired() != null) {
                jsonGenerator.writeFieldName("Required").writeValue(schemaAttributeType.getRequired());
            }
            if (schemaAttributeType.getNumberAttributeConstraints() != null) {
                jsonGenerator.writeFieldName("NumberAttributeConstraints");
                NumberAttributeConstraintsTypeJsonMarshaller.getInstance().marshall(schemaAttributeType.getNumberAttributeConstraints(), jsonGenerator);
            }
            if (schemaAttributeType.getStringAttributeConstraints() != null) {
                jsonGenerator.writeFieldName("StringAttributeConstraints");
                StringAttributeConstraintsTypeJsonMarshaller.getInstance().marshall(schemaAttributeType.getStringAttributeConstraints(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SchemaAttributeTypeJsonMarshaller instance;

    public static SchemaAttributeTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SchemaAttributeTypeJsonMarshaller();
        return instance;
    }

}
