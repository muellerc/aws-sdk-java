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
package com.amazonaws.services.opsworkscm.model.transform;

import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.transform.*;

/**
 * RestoreServerResult JSON Unmarshaller
 */
public class RestoreServerResultJsonUnmarshaller implements Unmarshaller<RestoreServerResult, JsonUnmarshallerContext> {

    public RestoreServerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreServerResult restoreServerResult = new RestoreServerResult();

        return restoreServerResult;
    }

    private static RestoreServerResultJsonUnmarshaller instance;

    public static RestoreServerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreServerResultJsonUnmarshaller();
        return instance;
    }
}
