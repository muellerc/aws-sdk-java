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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

/**
 * DescribeLoadBalancerPoliciesResult StAX Unmarshaller
 */
public class DescribeLoadBalancerPoliciesResultStaxUnmarshaller implements Unmarshaller<DescribeLoadBalancerPoliciesResult, StaxUnmarshallerContext> {

    public DescribeLoadBalancerPoliciesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeLoadBalancerPoliciesResult describeLoadBalancerPoliciesResult = new DescribeLoadBalancerPoliciesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeLoadBalancerPoliciesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PolicyDescriptions", targetDepth)) {
                    describeLoadBalancerPoliciesResult.withPolicyDescriptions(new ArrayList<PolicyDescription>());
                    continue;
                }

                if (context.testExpression("PolicyDescriptions/member", targetDepth)) {
                    describeLoadBalancerPoliciesResult.withPolicyDescriptions(PolicyDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeLoadBalancerPoliciesResult;
                }
            }
        }
    }

    private static DescribeLoadBalancerPoliciesResultStaxUnmarshaller instance;

    public static DescribeLoadBalancerPoliciesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLoadBalancerPoliciesResultStaxUnmarshaller();
        return instance;
    }
}
