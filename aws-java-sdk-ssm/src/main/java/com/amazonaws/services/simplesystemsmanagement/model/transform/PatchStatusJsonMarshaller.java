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
 * PatchStatusMarshaller
 */
public class PatchStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PatchStatus patchStatus, StructuredJsonGenerator jsonGenerator) {

        if (patchStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (patchStatus.getDeploymentStatus() != null) {
                jsonGenerator.writeFieldName("DeploymentStatus").writeValue(patchStatus.getDeploymentStatus());
            }
            if (patchStatus.getApprovalDate() != null) {
                jsonGenerator.writeFieldName("ApprovalDate").writeValue(patchStatus.getApprovalDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PatchStatusJsonMarshaller instance;

    public static PatchStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchStatusJsonMarshaller();
        return instance;
    }

}
