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
package com.amazonaws.services.simpleemail.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

/**
 * CreateReceiptRuleSetResult StAX Unmarshaller
 */
public class CreateReceiptRuleSetResultStaxUnmarshaller implements Unmarshaller<CreateReceiptRuleSetResult, StaxUnmarshallerContext> {

    public CreateReceiptRuleSetResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateReceiptRuleSetResult createReceiptRuleSetResult = new CreateReceiptRuleSetResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createReceiptRuleSetResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createReceiptRuleSetResult;
                }
            }
        }
    }

    private static CreateReceiptRuleSetResultStaxUnmarshaller instance;

    public static CreateReceiptRuleSetResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateReceiptRuleSetResultStaxUnmarshaller();
        return instance;
    }
}
