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
package com.amazonaws.services.batch.model;

import java.io.Serializable;

/**
 * 
 */
public class RegisterJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job definition to register.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The type of job definition.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * An object with various properties specific for container-based jobs. This parameter is required if the
     * <code>type</code> parameter is <code>container</code>.
     * </p>
     */
    private ContainerProperties containerProperties;

    /**
     * <p>
     * The name of the job definition to register.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to register.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to register.
     * </p>
     * 
     * @return The name of the job definition to register.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to register.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @see JobDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @return The type of job definition.
     * @see JobDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobDefinitionType
     */

    public RegisterJobDefinitionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @see JobDefinitionType
     */

    public void setType(JobDefinitionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobDefinitionType
     */

    public RegisterJobDefinitionRequest withType(JobDefinitionType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @return Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *         key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *         parameter defaults from the job definition.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @param parameters
     *        Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *        key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *        parameter defaults from the job definition.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @param parameters
     *        Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *        key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *        parameter defaults from the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public RegisterJobDefinitionRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * An object with various properties specific for container-based jobs. This parameter is required if the
     * <code>type</code> parameter is <code>container</code>.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific for container-based jobs. This parameter is required if the
     *        <code>type</code> parameter is <code>container</code>.
     */

    public void setContainerProperties(ContainerProperties containerProperties) {
        this.containerProperties = containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific for container-based jobs. This parameter is required if the
     * <code>type</code> parameter is <code>container</code>.
     * </p>
     * 
     * @return An object with various properties specific for container-based jobs. This parameter is required if the
     *         <code>type</code> parameter is <code>container</code>.
     */

    public ContainerProperties getContainerProperties() {
        return this.containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific for container-based jobs. This parameter is required if the
     * <code>type</code> parameter is <code>container</code>.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific for container-based jobs. This parameter is required if the
     *        <code>type</code> parameter is <code>container</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withContainerProperties(ContainerProperties containerProperties) {
        setContainerProperties(containerProperties);
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
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getContainerProperties() != null)
            sb.append("ContainerProperties: ").append(getContainerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterJobDefinitionRequest == false)
            return false;
        RegisterJobDefinitionRequest other = (RegisterJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getContainerProperties() == null ^ this.getContainerProperties() == null)
            return false;
        if (other.getContainerProperties() != null && other.getContainerProperties().equals(this.getContainerProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getContainerProperties() == null) ? 0 : getContainerProperties().hashCode());
        return hashCode;
    }

    @Override
    public RegisterJobDefinitionRequest clone() {
        return (RegisterJobDefinitionRequest) super.clone();
    }

}
