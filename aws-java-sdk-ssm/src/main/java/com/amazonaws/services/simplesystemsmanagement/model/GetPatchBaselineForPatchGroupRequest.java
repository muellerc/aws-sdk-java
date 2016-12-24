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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class GetPatchBaselineForPatchGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     */
    private String patchGroup;

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group whose patch baseline should be retrieved.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @return The name of the patch group whose patch baseline should be retrieved.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group whose patch baseline should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineForPatchGroupRequest withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPatchBaselineForPatchGroupRequest == false)
            return false;
        GetPatchBaselineForPatchGroupRequest other = (GetPatchBaselineForPatchGroupRequest) obj;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetPatchBaselineForPatchGroupRequest clone() {
        return (GetPatchBaselineForPatchGroupRequest) super.clone();
    }

}
