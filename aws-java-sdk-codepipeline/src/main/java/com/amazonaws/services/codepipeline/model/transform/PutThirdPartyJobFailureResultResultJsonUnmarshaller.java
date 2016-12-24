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
package com.amazonaws.services.codepipeline.model.transform;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.*;

/**
 * PutThirdPartyJobFailureResultResult JSON Unmarshaller
 */
public class PutThirdPartyJobFailureResultResultJsonUnmarshaller implements Unmarshaller<PutThirdPartyJobFailureResultResult, JsonUnmarshallerContext> {

    public PutThirdPartyJobFailureResultResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResultResult = new PutThirdPartyJobFailureResultResult();

        return putThirdPartyJobFailureResultResult;
    }

    private static PutThirdPartyJobFailureResultResultJsonUnmarshaller instance;

    public static PutThirdPartyJobFailureResultResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutThirdPartyJobFailureResultResultJsonUnmarshaller();
        return instance;
    }
}
