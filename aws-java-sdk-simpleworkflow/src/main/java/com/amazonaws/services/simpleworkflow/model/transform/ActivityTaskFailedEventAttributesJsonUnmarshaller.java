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
package com.amazonaws.services.simpleworkflow.model.transform;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActivityTaskFailedEventAttributes JSON Unmarshaller
 */
public class ActivityTaskFailedEventAttributesJsonUnmarshaller implements Unmarshaller<ActivityTaskFailedEventAttributes, JsonUnmarshallerContext> {

    public ActivityTaskFailedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes = new ActivityTaskFailedEventAttributes();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    activityTaskFailedEventAttributes.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    activityTaskFailedEventAttributes.setDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduledEventId", targetDepth)) {
                    context.nextToken();
                    activityTaskFailedEventAttributes.setScheduledEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("startedEventId", targetDepth)) {
                    context.nextToken();
                    activityTaskFailedEventAttributes.setStartedEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activityTaskFailedEventAttributes;
    }

    private static ActivityTaskFailedEventAttributesJsonUnmarshaller instance;

    public static ActivityTaskFailedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityTaskFailedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
