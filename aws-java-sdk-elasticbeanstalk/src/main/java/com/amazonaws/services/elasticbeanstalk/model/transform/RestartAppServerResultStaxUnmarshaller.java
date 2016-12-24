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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

/**
 * RestartAppServerResult StAX Unmarshaller
 */
public class RestartAppServerResultStaxUnmarshaller implements Unmarshaller<RestartAppServerResult, StaxUnmarshallerContext> {

    public RestartAppServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RestartAppServerResult restartAppServerResult = new RestartAppServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return restartAppServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return restartAppServerResult;
                }
            }
        }
    }

    private static RestartAppServerResultStaxUnmarshaller instance;

    public static RestartAppServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestartAppServerResultStaxUnmarshaller();
        return instance;
    }
}
