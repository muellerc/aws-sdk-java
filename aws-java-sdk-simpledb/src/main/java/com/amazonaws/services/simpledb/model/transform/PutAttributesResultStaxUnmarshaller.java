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
package com.amazonaws.services.simpledb.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

/**
 * PutAttributesResult StAX Unmarshaller
 */
public class PutAttributesResultStaxUnmarshaller implements Unmarshaller<PutAttributesResult, StaxUnmarshallerContext> {

    public PutAttributesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        PutAttributesResult putAttributesResult = new PutAttributesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return putAttributesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return putAttributesResult;
                }
            }
        }
    }

    private static PutAttributesResultStaxUnmarshaller instance;

    public static PutAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutAttributesResultStaxUnmarshaller();
        return instance;
    }
}
