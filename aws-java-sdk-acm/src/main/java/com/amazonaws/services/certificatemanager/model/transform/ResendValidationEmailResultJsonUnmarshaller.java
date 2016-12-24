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
package com.amazonaws.services.certificatemanager.model.transform;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.*;

/**
 * ResendValidationEmailResult JSON Unmarshaller
 */
public class ResendValidationEmailResultJsonUnmarshaller implements Unmarshaller<ResendValidationEmailResult, JsonUnmarshallerContext> {

    public ResendValidationEmailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResendValidationEmailResult resendValidationEmailResult = new ResendValidationEmailResult();

        return resendValidationEmailResult;
    }

    private static ResendValidationEmailResultJsonUnmarshaller instance;

    public static ResendValidationEmailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResendValidationEmailResultJsonUnmarshaller();
        return instance;
    }
}
