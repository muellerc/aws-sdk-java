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
package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.protocol.json.*;

/**
 * BranchInfoMarshaller
 */
public class BranchInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BranchInfo branchInfo, StructuredJsonGenerator jsonGenerator) {

        if (branchInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (branchInfo.getBranchName() != null) {
                jsonGenerator.writeFieldName("branchName").writeValue(branchInfo.getBranchName());
            }
            if (branchInfo.getCommitId() != null) {
                jsonGenerator.writeFieldName("commitId").writeValue(branchInfo.getCommitId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BranchInfoJsonMarshaller instance;

    public static BranchInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BranchInfoJsonMarshaller();
        return instance;
    }

}
