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
package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.*;

/**
 * DisassociateProductFromPortfolioResult JSON Unmarshaller
 */
public class DisassociateProductFromPortfolioResultJsonUnmarshaller implements Unmarshaller<DisassociateProductFromPortfolioResult, JsonUnmarshallerContext> {

    public DisassociateProductFromPortfolioResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisassociateProductFromPortfolioResult disassociateProductFromPortfolioResult = new DisassociateProductFromPortfolioResult();

        return disassociateProductFromPortfolioResult;
    }

    private static DisassociateProductFromPortfolioResultJsonUnmarshaller instance;

    public static DisassociateProductFromPortfolioResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateProductFromPortfolioResultJsonUnmarshaller();
        return instance;
    }
}
