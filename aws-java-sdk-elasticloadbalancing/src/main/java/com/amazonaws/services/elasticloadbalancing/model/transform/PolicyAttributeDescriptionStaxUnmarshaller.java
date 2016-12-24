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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PolicyAttributeDescription StAX Unmarshaller
 */
public class PolicyAttributeDescriptionStaxUnmarshaller implements Unmarshaller<PolicyAttributeDescription, StaxUnmarshallerContext> {

    public PolicyAttributeDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        PolicyAttributeDescription policyAttributeDescription = new PolicyAttributeDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return policyAttributeDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AttributeName", targetDepth)) {
                    policyAttributeDescription.setAttributeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttributeValue", targetDepth)) {
                    policyAttributeDescription.setAttributeValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return policyAttributeDescription;
                }
            }
        }
    }

    private static PolicyAttributeDescriptionStaxUnmarshaller instance;

    public static PolicyAttributeDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyAttributeDescriptionStaxUnmarshaller();
        return instance;
    }
}
