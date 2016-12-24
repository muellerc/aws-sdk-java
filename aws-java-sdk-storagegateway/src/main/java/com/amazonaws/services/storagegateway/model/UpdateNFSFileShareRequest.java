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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * UpdateNFSFileShareInput
 * </p>
 */
public class UpdateNFSFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     */
    private String fileShareARN;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     */
    private String defaultStorageClass;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be updated.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file share to be updated.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @param kMSKey
     *        The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *        true. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @return The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *         true. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @param kMSKey
     *        The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *        true. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        The default values for the file share. Optional.
     */

    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @return The default values for the file share. Optional.
     */

    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return this.nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        The default values for the file share. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        setNFSFileShareDefaults(nFSFileShareDefaults);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *         S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *         Optional.
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNFSFileShareRequest == false)
            return false;
        UpdateNFSFileShareRequest other = (UpdateNFSFileShareRequest) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNFSFileShareRequest clone() {
        return (UpdateNFSFileShareRequest) super.clone();
    }

}
