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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

/**
 * DescribeTargetGroupAttributesResult StAX Unmarshaller
 */
public class DescribeTargetGroupAttributesResultStaxUnmarshaller implements Unmarshaller<DescribeTargetGroupAttributesResult, StaxUnmarshallerContext> {

    public DescribeTargetGroupAttributesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeTargetGroupAttributesResult describeTargetGroupAttributesResult = new DescribeTargetGroupAttributesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeTargetGroupAttributesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Attributes", targetDepth)) {
                    describeTargetGroupAttributesResult.withAttributes(new ArrayList<TargetGroupAttribute>());
                    continue;
                }

                if (context.testExpression("Attributes/member", targetDepth)) {
                    describeTargetGroupAttributesResult.withAttributes(TargetGroupAttributeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeTargetGroupAttributesResult;
                }
            }
        }
    }

    private static DescribeTargetGroupAttributesResultStaxUnmarshaller instance;

    public static DescribeTargetGroupAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTargetGroupAttributesResultStaxUnmarshaller();
        return instance;
    }
}
