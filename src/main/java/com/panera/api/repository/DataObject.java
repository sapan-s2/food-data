package com.panera.api.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sjain on 2/5/18.
 */

@Entity
public class DataObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer queryId;

    private  Boolean storeNumber;
    private Boolean id;
    private Boolean name;
    private Boolean descriptipon;
    private Boolean bussinessDate;
    private  Boolean itemId;
    private  Boolean itemCode;
    private  Boolean itemDescription;
    private  Boolean itemMajorCategoryId;
    private  Boolean itemMajorCategoryDescription;
    private  Boolean itemIdUserTypeDescription;
    private  Boolean itemUserTypeCode;
    private  Boolean itemcategoryCode;
    private  Boolean itemcategoryDscription;
    private  Boolean CNTGroupName;
    private  Boolean theoriticalQuantity;
    private  Boolean alowedTargetLeftOverQuantity;
    private  Boolean actualQuantity;
    private  Boolean purchaseQuantity;
    private  Boolean transferQuantity;
    private  Boolean beginningInvoiceCount;
    private  Boolean leftOverIssueQuantity;
    private  Boolean theoriticalDollars;
    private  Boolean alowedTargetLeftOverDollars;
    private  Boolean actualDollars;
    private  Boolean purchaseDollars;
    private  Boolean transferDollars;
    private  Boolean beginningInvoiceDollars;
    private  Boolean endingInvoiceDollars;
    private  Boolean leftOverIssueDollars;
    private  Boolean loadId;
    private  Boolean batchId;
    private  Boolean insertDate;
    private  Boolean lastUpdatedDate;
    private  Boolean version;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public Boolean getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Boolean storeNumber) {
        this.storeNumber = storeNumber;
    }

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }

    public Boolean getName() {
        return name;
    }

    public void setName(Boolean name) {
        this.name = name;
    }

    public Boolean getDescriptipon() {
        return descriptipon;
    }

    public void setDescriptipon(Boolean descriptipon) {
        this.descriptipon = descriptipon;
    }

    public Boolean getBussinessDate() {
        return bussinessDate;
    }

    public void setBussinessDate(Boolean bussinessDate) {
        this.bussinessDate = bussinessDate;
    }

    public Boolean getItemId() {
        return itemId;
    }

    public void setItemId(Boolean itemId) {
        this.itemId = itemId;
    }

    public Boolean getItemCode() {
        return itemCode;
    }

    public void setItemCode(Boolean itemCode) {
        this.itemCode = itemCode;
    }

    public Boolean getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(Boolean itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Boolean getItemMajorCategoryId() {
        return itemMajorCategoryId;
    }

    public void setItemMajorCategoryId(Boolean itemMajorCategoryId) {
        this.itemMajorCategoryId = itemMajorCategoryId;
    }

    public Boolean getItemMajorCategoryDescription() {
        return itemMajorCategoryDescription;
    }

    public void setItemMajorCategoryDescription(Boolean itemMajorCategoryDescription) {
        this.itemMajorCategoryDescription = itemMajorCategoryDescription;
    }

    public Boolean getItemIdUserTypeDescription() {
        return itemIdUserTypeDescription;
    }

    public void setItemIdUserTypeDescription(Boolean itemIdUserTypeDescription) {
        this.itemIdUserTypeDescription = itemIdUserTypeDescription;
    }

    public Boolean getItemUserTypeCode() {
        return itemUserTypeCode;
    }

    public void setItemUserTypeCode(Boolean itemUserTypeCode) {
        this.itemUserTypeCode = itemUserTypeCode;
    }

    public Boolean getItemcategoryCode() {
        return itemcategoryCode;
    }

    public void setItemcategoryCode(Boolean itemcategoryCode) {
        this.itemcategoryCode = itemcategoryCode;
    }

    public Boolean getItemcategoryDscription() {
        return itemcategoryDscription;
    }

    public void setItemcategoryDscription(Boolean itemcategoryDscription) {
        this.itemcategoryDscription = itemcategoryDscription;
    }

    public Boolean getCNTGroupName() {
        return CNTGroupName;
    }

    public void setCNTGroupName(Boolean CNTGroupName) {
        this.CNTGroupName = CNTGroupName;
    }

    public Boolean getTheoriticalQuantity() {
        return theoriticalQuantity;
    }

    public void setTheoriticalQuantity(Boolean theoriticalQuantity) {
        this.theoriticalQuantity = theoriticalQuantity;
    }

    public Boolean getAlowedTargetLeftOverQuantity() {
        return alowedTargetLeftOverQuantity;
    }

    public void setAlowedTargetLeftOverQuantity(Boolean alowedTargetLeftOverQuantity) {
        this.alowedTargetLeftOverQuantity = alowedTargetLeftOverQuantity;
    }

    public Boolean getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(Boolean actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public Boolean getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Boolean purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Boolean getTransferQuantity() {
        return transferQuantity;
    }

    public void setTransferQuantity(Boolean transferQuantity) {
        this.transferQuantity = transferQuantity;
    }

    public Boolean getBeginningInvoiceCount() {
        return beginningInvoiceCount;
    }

    public void setBeginningInvoiceCount(Boolean beginningInvoiceCount) {
        this.beginningInvoiceCount = beginningInvoiceCount;
    }

    public Boolean getLeftOverIssueQuantity() {
        return leftOverIssueQuantity;
    }

    public void setLeftOverIssueQuantity(Boolean leftOverIssueQuantity) {
        this.leftOverIssueQuantity = leftOverIssueQuantity;
    }

    public Boolean getTheoriticalDollars() {
        return theoriticalDollars;
    }

    public void setTheoriticalDollars(Boolean theoriticalDollars) {
        this.theoriticalDollars = theoriticalDollars;
    }

    public Boolean getAlowedTargetLeftOverDollars() {
        return alowedTargetLeftOverDollars;
    }

    public void setAlowedTargetLeftOverDollars(Boolean alowedTargetLeftOverDollars) {
        this.alowedTargetLeftOverDollars = alowedTargetLeftOverDollars;
    }

    public Boolean getActualDollars() {
        return actualDollars;
    }

    public void setActualDollars(Boolean actualDollars) {
        this.actualDollars = actualDollars;
    }

    public Boolean getPurchaseDollars() {
        return purchaseDollars;
    }

    public void setPurchaseDollars(Boolean purchaseDollars) {
        this.purchaseDollars = purchaseDollars;
    }

    public Boolean getTransferDollars() {
        return transferDollars;
    }

    public void setTransferDollars(Boolean transferDollars) {
        this.transferDollars = transferDollars;
    }

    public Boolean getBeginningInvoiceDollars() {
        return beginningInvoiceDollars;
    }

    public void setBeginningInvoiceDollars(Boolean beginningInvoiceDollars) {
        this.beginningInvoiceDollars = beginningInvoiceDollars;
    }

    public Boolean getEndingInvoiceDollars() {
        return endingInvoiceDollars;
    }

    public void setEndingInvoiceDollars(Boolean endingInvoiceDollars) {
        this.endingInvoiceDollars = endingInvoiceDollars;
    }

    public Boolean getLeftOverIssueDollars() {
        return leftOverIssueDollars;
    }

    public void setLeftOverIssueDollars(Boolean leftOverIssueDollars) {
        this.leftOverIssueDollars = leftOverIssueDollars;
    }

    public Boolean getLoadId() {
        return loadId;
    }

    public void setLoadId(Boolean loadId) {
        this.loadId = loadId;
    }

    public Boolean getBatchId() {
        return batchId;
    }

    public void setBatchId(Boolean batchId) {
        this.batchId = batchId;
    }

    public Boolean getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Boolean insertDate) {
        this.insertDate = insertDate;
    }

    public Boolean getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Boolean lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Boolean getVersion() {
        return version;
    }

    public void setVersion(Boolean version) {
        this.version = version;
    }
}
