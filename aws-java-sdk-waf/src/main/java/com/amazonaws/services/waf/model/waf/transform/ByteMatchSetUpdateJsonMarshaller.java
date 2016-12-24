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
package com.amazonaws.services.waf.model.waf.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ByteMatchSetUpdateMarshaller
 */
public class ByteMatchSetUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ByteMatchSetUpdate byteMatchSetUpdate, StructuredJsonGenerator jsonGenerator) {

        if (byteMatchSetUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (byteMatchSetUpdate.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(byteMatchSetUpdate.getAction());
            }
            if (byteMatchSetUpdate.getByteMatchTuple() != null) {
                jsonGenerator.writeFieldName("ByteMatchTuple");
                ByteMatchTupleJsonMarshaller.getInstance().marshall(byteMatchSetUpdate.getByteMatchTuple(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ByteMatchSetUpdateJsonMarshaller instance;

    public static ByteMatchSetUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ByteMatchSetUpdateJsonMarshaller();
        return instance;
    }

}
