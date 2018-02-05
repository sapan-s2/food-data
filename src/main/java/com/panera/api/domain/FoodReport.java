package com.panera.api.domain;

import com.panera.api.domain.item.*;

/**
 * Created by sjain on 2/2/18.
 */

public class FoodReport {
    private final String storeNumber;
    private String id;
    private String name;
    private String descriptipon;
    private String bussinessDate;
    private final String itemId;
    private final String itemCode;
    private final String itemDescription;
    private final String itemMajorCategoryId;
    private final String itemMajorCategoryDescription;
    private final String itemIdUserTypeDescription;
    private final String itemUserTypeCode;
    private final String itemcategoryCode;
    private final String itemcategoryDscription;
    private final String CNTGroupName;
    private final float theoriticalQuantity;
    private final float alowedTargetLeftOverQuantity;
    private final float actualQuantity;
    private final float purchaseQuantity;
    private final float transferQuantity;
    private final float beginningInvoiceCount;
    private final float leftOverIssueQuantity;
    private final float theoriticalDollars;
    private final float alowedTargetLeftOverDollars;
    private final float actualDollars;
    private final float purchaseDollars;
    private final float transferDollars;
    private final float beginningInvoiceDollars;
    private final float endingInvoiceDollars;
    private final float leftOverIssueDollars;
    private final String loadId;
    private final String batchId;
    private final String insertDate;
    private final String lastUpdatedDate;
    private final String version;


    public FoodReport(String storeNumber, String id, String name, String descriptipon, String bussinessDate, String itemId, String itemCode, String itemDescription, String itemMajorCategoryId, String itemMajorCategoryDescription, String itemIdUserTypeDescription, String itemUserTypeCode, String itemcategoryCode, String itemcategoryDscription, String CNTGroupName, float theoriticalQuantity, float alowedTargetLeftOverQuantity, float actualQuantity, float purchaseQuantity, float transferQuantity, float beginningInvoiceCount, float leftOverIssueQuantity, float theoriticalDollars, float alowedTargetLeftOverDollars, float actualDollars, float purchaseDollars, float transferDollars, float beginningInvoiceDollars, float endingInvoiceDollars, float leftOverIssueDollars, String loadId, String batchId, String insertDate, String lastUpdatedDate, String version) {
        this.storeNumber = storeNumber;
        this.id = id;
        this.name = name;
        this.descriptipon = descriptipon;
        this.bussinessDate = bussinessDate;
        this.itemId = itemId;
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemMajorCategoryId = itemMajorCategoryId;
        this.itemMajorCategoryDescription = itemMajorCategoryDescription;
        this.itemIdUserTypeDescription = itemIdUserTypeDescription;
        this.itemUserTypeCode = itemUserTypeCode;
        this.itemcategoryCode = itemcategoryCode;
        this.itemcategoryDscription = itemcategoryDscription;
        this.CNTGroupName = CNTGroupName;
        this.theoriticalQuantity = theoriticalQuantity;
        this.alowedTargetLeftOverQuantity = alowedTargetLeftOverQuantity;
        this.actualQuantity = actualQuantity;
        this.purchaseQuantity = purchaseQuantity;
        this.transferQuantity = transferQuantity;
        this.beginningInvoiceCount = beginningInvoiceCount;
        this.leftOverIssueQuantity = leftOverIssueQuantity;
        this.theoriticalDollars = theoriticalDollars;
        this.alowedTargetLeftOverDollars = alowedTargetLeftOverDollars;
        this.actualDollars = actualDollars;
        this.purchaseDollars = purchaseDollars;
        this.transferDollars = transferDollars;
        this.beginningInvoiceDollars = beginningInvoiceDollars;
        this.endingInvoiceDollars = endingInvoiceDollars;
        this.leftOverIssueDollars = leftOverIssueDollars;
        this.loadId = loadId;
        this.batchId = batchId;
        this.insertDate = insertDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.version = version;
    }


    public String getStoreNumber() {
        return storeNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescriptipon() {
        return descriptipon;
    }

    public String getBussinessDate() {
        return bussinessDate;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemMajorCategoryId() {
        return itemMajorCategoryId;
    }

    public String getItemMajorCategoryDescription() {
        return itemMajorCategoryDescription;
    }

    public String getItemIdUserTypeDescription() {
        return itemIdUserTypeDescription;
    }

    public String getItemUserTypeCode() {
        return itemUserTypeCode;
    }

    public String getItemcategoryCode() {
        return itemcategoryCode;
    }

    public String getItemcategoryDscription() {
        return itemcategoryDscription;
    }

    public String getCNTGroupName() {
        return CNTGroupName;
    }

    public float getTheoriticalQuantity() {
        return theoriticalQuantity;
    }

    public float getAlowedTargetLeftOverQuantity() {
        return alowedTargetLeftOverQuantity;
    }

    public float getActualQuantity() {
        return actualQuantity;
    }

    public float getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public float getTransferQuantity() {
        return transferQuantity;
    }

    public float getBeginningInvoiceCount() {
        return beginningInvoiceCount;
    }

    public float getLeftOverIssueQuantity() {
        return leftOverIssueQuantity;
    }

    public float getTheoriticalDollars() {
        return theoriticalDollars;
    }

    public float getAlowedTargetLeftOverDollars() {
        return alowedTargetLeftOverDollars;
    }

    public float getActualDollars() {
        return actualDollars;
    }

    public float getPurchaseDollars() {
        return purchaseDollars;
    }

    public float getTransferDollars() {
        return transferDollars;
    }

    public float getBeginningInvoiceDollars() {
        return beginningInvoiceDollars;
    }

    public float getEndingInvoiceDollars() {
        return endingInvoiceDollars;
    }

    public float getLeftOverIssueDollars() {
        return leftOverIssueDollars;
    }

    public String getLoadId() {
        return loadId;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "FoodReport{" +
                "storeNumber='" + storeNumber + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", descriptipon='" + descriptipon + '\'' +
                ", bussinessDate='" + bussinessDate + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemMajorCategoryId='" + itemMajorCategoryId + '\'' +
                ", itemMajorCategoryDescription='" + itemMajorCategoryDescription + '\'' +
                ", itemIdUserTypeDescription='" + itemIdUserTypeDescription + '\'' +
                ", itemUserTypeCode='" + itemUserTypeCode + '\'' +
                ", itemcategoryCode='" + itemcategoryCode + '\'' +
                ", itemcategoryDscription='" + itemcategoryDscription + '\'' +
                ", CNTGroupName='" + CNTGroupName + '\'' +
                ", theoriticalQuantity=" + theoriticalQuantity +
                ", alowedTargetLeftOverQuantity=" + alowedTargetLeftOverQuantity +
                ", actualQuantity=" + actualQuantity +
                ", purchaseQuantity=" + purchaseQuantity +
                ", transferQuantity=" + transferQuantity +
                ", beginningInvoiceCount=" + beginningInvoiceCount +
                ", leftOverIssueQuantity=" + leftOverIssueQuantity +
                ", theoriticalDollars=" + theoriticalDollars +
                ", alowedTargetLeftOverDollars=" + alowedTargetLeftOverDollars +
                ", actualDollars=" + actualDollars +
                ", purchaseDollars=" + purchaseDollars +
                ", transferDollars=" + transferDollars +
                ", beginningInvoiceDollars=" + beginningInvoiceDollars +
                ", endingInvoiceDollars=" + endingInvoiceDollars +
                ", leftOverIssueDollars=" + leftOverIssueDollars +
                ", loadId='" + loadId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", insertDate='" + insertDate + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
