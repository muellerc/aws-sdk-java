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
package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.*;

/**
 * DeleteSubscriptionFilterResult JSON Unmarshaller
 */
public class DeleteSubscriptionFilterResultJsonUnmarshaller implements Unmarshaller<DeleteSubscriptionFilterResult, JsonUnmarshallerContext> {

    public DeleteSubscriptionFilterResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteSubscriptionFilterResult deleteSubscriptionFilterResult = new DeleteSubscriptionFilterResult();

        return deleteSubscriptionFilterResult;
    }

    private static DeleteSubscriptionFilterResultJsonUnmarshaller instance;

    public static DeleteSubscriptionFilterResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteSubscriptionFilterResultJsonUnmarshaller();
        return instance;
    }
}
