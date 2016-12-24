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
package com.amazonaws.services.opsworks.model.transform;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.*;

/**
 * DeregisterElasticIpResult JSON Unmarshaller
 */
public class DeregisterElasticIpResultJsonUnmarshaller implements Unmarshaller<DeregisterElasticIpResult, JsonUnmarshallerContext> {

    public DeregisterElasticIpResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeregisterElasticIpResult deregisterElasticIpResult = new DeregisterElasticIpResult();

        return deregisterElasticIpResult;
    }

    private static DeregisterElasticIpResultJsonUnmarshaller instance;

    public static DeregisterElasticIpResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeregisterElasticIpResultJsonUnmarshaller();
        return instance;
    }
}
