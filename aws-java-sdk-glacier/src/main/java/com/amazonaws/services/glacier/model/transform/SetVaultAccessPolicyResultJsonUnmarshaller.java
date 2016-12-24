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
package com.amazonaws.services.glacier.model.transform;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.*;

/**
 * SetVaultAccessPolicyResult JSON Unmarshaller
 */
public class SetVaultAccessPolicyResultJsonUnmarshaller implements Unmarshaller<SetVaultAccessPolicyResult, JsonUnmarshallerContext> {

    public SetVaultAccessPolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SetVaultAccessPolicyResult setVaultAccessPolicyResult = new SetVaultAccessPolicyResult();

        return setVaultAccessPolicyResult;
    }

    private static SetVaultAccessPolicyResultJsonUnmarshaller instance;

    public static SetVaultAccessPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SetVaultAccessPolicyResultJsonUnmarshaller();
        return instance;
    }
}
