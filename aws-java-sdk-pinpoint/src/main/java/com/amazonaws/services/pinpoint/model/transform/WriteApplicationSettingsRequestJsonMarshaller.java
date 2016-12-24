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
 * WriteApplicationSettingsRequestMarshaller
 */
public class WriteApplicationSettingsRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WriteApplicationSettingsRequest writeApplicationSettingsRequest, StructuredJsonGenerator jsonGenerator) {

        if (writeApplicationSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (writeApplicationSettingsRequest.getLimits() != null) {
                jsonGenerator.writeFieldName("Limits");
                CampaignLimitsJsonMarshaller.getInstance().marshall(writeApplicationSettingsRequest.getLimits(), jsonGenerator);
            }
            if (writeApplicationSettingsRequest.getQuietTime() != null) {
                jsonGenerator.writeFieldName("QuietTime");
                QuietTimeJsonMarshaller.getInstance().marshall(writeApplicationSettingsRequest.getQuietTime(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WriteApplicationSettingsRequestJsonMarshaller instance;

    public static WriteApplicationSettingsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteApplicationSettingsRequestJsonMarshaller();
        return instance;
    }

}
