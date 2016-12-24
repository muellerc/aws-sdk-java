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
package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.*;

/**
 * DeleteDocumentationPartResult JSON Unmarshaller
 */
public class DeleteDocumentationPartResultJsonUnmarshaller implements Unmarshaller<DeleteDocumentationPartResult, JsonUnmarshallerContext> {

    public DeleteDocumentationPartResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteDocumentationPartResult deleteDocumentationPartResult = new DeleteDocumentationPartResult();

        return deleteDocumentationPartResult;
    }

    private static DeleteDocumentationPartResultJsonUnmarshaller instance;

    public static DeleteDocumentationPartResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteDocumentationPartResultJsonUnmarshaller();
        return instance;
    }
}
