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
package com.amazonaws.services.workspaces.model.transform;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.*;

/**
 * DeleteTagsResult JSON Unmarshaller
 */
public class DeleteTagsResultJsonUnmarshaller implements Unmarshaller<DeleteTagsResult, JsonUnmarshallerContext> {

    public DeleteTagsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteTagsResult deleteTagsResult = new DeleteTagsResult();

        return deleteTagsResult;
    }

    private static DeleteTagsResultJsonUnmarshaller instance;

    public static DeleteTagsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteTagsResultJsonUnmarshaller();
        return instance;
    }
}
