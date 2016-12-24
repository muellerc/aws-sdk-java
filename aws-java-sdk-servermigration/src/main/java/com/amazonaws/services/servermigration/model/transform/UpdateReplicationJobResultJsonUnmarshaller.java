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
package com.amazonaws.services.servermigration.model.transform;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.*;

/**
 * UpdateReplicationJobResult JSON Unmarshaller
 */
public class UpdateReplicationJobResultJsonUnmarshaller implements Unmarshaller<UpdateReplicationJobResult, JsonUnmarshallerContext> {

    public UpdateReplicationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateReplicationJobResult updateReplicationJobResult = new UpdateReplicationJobResult();

        return updateReplicationJobResult;
    }

    private static UpdateReplicationJobResultJsonUnmarshaller instance;

    public static UpdateReplicationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateReplicationJobResultJsonUnmarshaller();
        return instance;
    }
}
