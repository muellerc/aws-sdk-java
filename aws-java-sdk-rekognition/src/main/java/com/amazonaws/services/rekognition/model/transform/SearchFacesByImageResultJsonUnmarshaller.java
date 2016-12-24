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
package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchFacesByImageResult JSON Unmarshaller
 */
public class SearchFacesByImageResultJsonUnmarshaller implements Unmarshaller<SearchFacesByImageResult, JsonUnmarshallerContext> {

    public SearchFacesByImageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchFacesByImageResult searchFacesByImageResult = new SearchFacesByImageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SearchedFaceBoundingBox", targetDepth)) {
                    context.nextToken();
                    searchFacesByImageResult.setSearchedFaceBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SearchedFaceConfidence", targetDepth)) {
                    context.nextToken();
                    searchFacesByImageResult.setSearchedFaceConfidence(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("FaceMatches", targetDepth)) {
                    context.nextToken();
                    searchFacesByImageResult.setFaceMatches(new ListUnmarshaller<FaceMatch>(FaceMatchJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchFacesByImageResult;
    }

    private static SearchFacesByImageResultJsonUnmarshaller instance;

    public static SearchFacesByImageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchFacesByImageResultJsonUnmarshaller();
        return instance;
    }
}
