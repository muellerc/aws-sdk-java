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
package com.amazonaws.services.support.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.protocol.json.*;

/**
 * TrustedAdvisorResourcesSummaryMarshaller
 */
public class TrustedAdvisorResourcesSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TrustedAdvisorResourcesSummary trustedAdvisorResourcesSummary, StructuredJsonGenerator jsonGenerator) {

        if (trustedAdvisorResourcesSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trustedAdvisorResourcesSummary.getResourcesProcessed() != null) {
                jsonGenerator.writeFieldName("resourcesProcessed").writeValue(trustedAdvisorResourcesSummary.getResourcesProcessed());
            }
            if (trustedAdvisorResourcesSummary.getResourcesFlagged() != null) {
                jsonGenerator.writeFieldName("resourcesFlagged").writeValue(trustedAdvisorResourcesSummary.getResourcesFlagged());
            }
            if (trustedAdvisorResourcesSummary.getResourcesIgnored() != null) {
                jsonGenerator.writeFieldName("resourcesIgnored").writeValue(trustedAdvisorResourcesSummary.getResourcesIgnored());
            }
            if (trustedAdvisorResourcesSummary.getResourcesSuppressed() != null) {
                jsonGenerator.writeFieldName("resourcesSuppressed").writeValue(trustedAdvisorResourcesSummary.getResourcesSuppressed());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustedAdvisorResourcesSummaryJsonMarshaller instance;

    public static TrustedAdvisorResourcesSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorResourcesSummaryJsonMarshaller();
        return instance;
    }

}
