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
package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.protocol.json.*;

/**
 * FaceMatchMarshaller
 */
public class FaceMatchJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FaceMatch faceMatch, StructuredJsonGenerator jsonGenerator) {

        if (faceMatch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (faceMatch.getSimilarity() != null) {
                jsonGenerator.writeFieldName("Similarity").writeValue(faceMatch.getSimilarity());
            }
            if (faceMatch.getFace() != null) {
                jsonGenerator.writeFieldName("Face");
                FaceJsonMarshaller.getInstance().marshall(faceMatch.getFace(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FaceMatchJsonMarshaller instance;

    public static FaceMatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceMatchJsonMarshaller();
        return instance;
    }

}
