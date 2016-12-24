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
package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.protocol.json.*;

/**
 * DatasetMarshaller
 */
public class DatasetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Dataset dataset, StructuredJsonGenerator jsonGenerator) {

        if (dataset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (dataset.getIdentityId() != null) {
                jsonGenerator.writeFieldName("IdentityId").writeValue(dataset.getIdentityId());
            }
            if (dataset.getDatasetName() != null) {
                jsonGenerator.writeFieldName("DatasetName").writeValue(dataset.getDatasetName());
            }
            if (dataset.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(dataset.getCreationDate());
            }
            if (dataset.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(dataset.getLastModifiedDate());
            }
            if (dataset.getLastModifiedBy() != null) {
                jsonGenerator.writeFieldName("LastModifiedBy").writeValue(dataset.getLastModifiedBy());
            }
            if (dataset.getDataStorage() != null) {
                jsonGenerator.writeFieldName("DataStorage").writeValue(dataset.getDataStorage());
            }
            if (dataset.getNumRecords() != null) {
                jsonGenerator.writeFieldName("NumRecords").writeValue(dataset.getNumRecords());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DatasetJsonMarshaller instance;

    public static DatasetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonMarshaller();
        return instance;
    }

}
