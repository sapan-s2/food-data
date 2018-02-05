package com.panera.api.domain;

import com.panera.api.domain.item.Item;

public class FoodReportBuilder {
    private String storeNumber;
    private String id;
    private String name;
    private String descriptipon;
    private String bussinessDate;
    private String itemId;
    private String itemCode;
    private String itemDescription;
    private String itemMajorCategoryId;
    private String itemMajorCategoryDescription;
    private String itemIdUserTypeDescription;
    private String itemUserTypeCode;
    private String itemcategoryCode;
    private String itemcategoryDscription;
    private String cntGroupName;
    private float theoriticalQuantity;
    private float alowedTargetLeftOverQuantity;
    private float actualQuantity;
    private float purchaseQuantity;
    private float transferQuantity;
    private float beginningInvoiceCount;
    private float leftOverIssueQuantity;
    private float theoriticalDollars;
    private float alowedTargetLeftOverDollars;
    private float actualDollars;
    private float purchaseDollars;
    private float transferDollars;
    private float beginningInvoiceDollars;
    private float endingInvoiceDollars;
    private float leftOverIssueDollars;
    private String loadId;
    private String batchId;
    private String insertDate;
    private String lastUpdatedDate;
    private String version;

    public FoodReportBuilder setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
        return this;
    }

    public FoodReportBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public FoodReportBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FoodReportBuilder setDescriptipon(String descriptipon) {
        this.descriptipon = descriptipon;
        return this;
    }

    public FoodReportBuilder setBussinessDate(String bussinessDate) {
        this.bussinessDate = bussinessDate;
        return this;
    }

    public FoodReportBuilder setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public FoodReportBuilder setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public FoodReportBuilder setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public FoodReportBuilder setItemMajorCategoryId(String itemMajorCategoryId) {
        this.itemMajorCategoryId = itemMajorCategoryId;
        return this;
    }

    public FoodReportBuilder setItemMajorCategoryDescription(String itemMajorCategoryDescription) {
        this.itemMajorCategoryDescription = itemMajorCategoryDescription;
        return this;
    }

    public FoodReportBuilder setItemIdUserTypeDescription(String itemIdUserTypeDescription) {
        this.itemIdUserTypeDescription = itemIdUserTypeDescription;
        return this;
    }

    public FoodReportBuilder setItemUserTypeCode(String itemUserTypeCode) {
        this.itemUserTypeCode = itemUserTypeCode;
        return this;
    }

    public FoodReportBuilder setItemcategoryCode(String itemcategoryCode) {
        this.itemcategoryCode = itemcategoryCode;
        return this;
    }

    public FoodReportBuilder setItemcategoryDscription(String itemcategoryDscription) {
        this.itemcategoryDscription = itemcategoryDscription;
        return this;
    }

    public FoodReportBuilder setCNTGroupName(String cntGroupName) {
        this.cntGroupName = cntGroupName;
        return this;
    }

    public FoodReportBuilder setTheoriticalQuantity(float theoriticalQuantity) {
        this.theoriticalQuantity = theoriticalQuantity;
        return this;
    }

    public FoodReportBuilder setAlowedTargetLeftOverQuantity(float alowedTargetLeftOverQuantity) {
        this.alowedTargetLeftOverQuantity = alowedTargetLeftOverQuantity;
        return this;
    }

    public FoodReportBuilder setActualQuantity(float actualQuantity) {
        this.actualQuantity = actualQuantity;
        return this;
    }

    public FoodReportBuilder setPurchaseQuantity(float purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
        return this;
    }

    public FoodReportBuilder setTransferQuantity(float transferQuantity) {
        this.transferQuantity = transferQuantity;
        return this;
    }

    public FoodReportBuilder setBeginningInvoiceCount(float beginningInvoiceCount) {
        this.beginningInvoiceCount = beginningInvoiceCount;
        return this;
    }

    public FoodReportBuilder setLeftOverIssueQuantity(float leftOverIssueQuantity) {
        this.leftOverIssueQuantity = leftOverIssueQuantity;
        return this;
    }

    public FoodReportBuilder setTheoriticalDollars(float theoriticalDollars) {
        this.theoriticalDollars = theoriticalDollars;
        return this;
    }

    public FoodReportBuilder setAlowedTargetLeftOverDollars(float alowedTargetLeftOverDollars) {
        this.alowedTargetLeftOverDollars = alowedTargetLeftOverDollars;
        return this;
    }

    public FoodReportBuilder setActualDollars(float actualDollars) {
        this.actualDollars = actualDollars;
        return this;
    }

    public FoodReportBuilder setPurchaseDollars(float purchaseDollars) {
        this.purchaseDollars = purchaseDollars;
        return this;
    }

    public FoodReportBuilder setTransferDollars(float transferDollars) {
        this.transferDollars = transferDollars;
        return this;
    }

    public FoodReportBuilder setBeginningInvoiceDollars(float beginningInvoiceDollars) {
        this.beginningInvoiceDollars = beginningInvoiceDollars;
        return this;
    }

    public FoodReportBuilder setEndingInvoiceDollars(float endingInvoiceDollars) {
        this.endingInvoiceDollars = endingInvoiceDollars;
        return this;
    }

    public FoodReportBuilder setLeftOverIssueDollars(float leftOverIssueDollars) {
        this.leftOverIssueDollars = leftOverIssueDollars;
        return this;
    }

    public FoodReportBuilder setLoadId(String loadId) {
        this.loadId = loadId;
        return this;
    }

    public FoodReportBuilder setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public FoodReportBuilder setInsertDate(String insertDate) {
        this.insertDate = insertDate;
        return this;
    }

    public FoodReportBuilder setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    public FoodReportBuilder setVersion(String version) {
        this.version = version;
        return this;
    }

    public FoodReportBuilder setFoodReportFlat(Item item) {
        this.storeNumber = item.getStoreNumber();
        this.id = item.getFranchise().getId();
        this.version = item.getFranchise().getName();
        this.name = item.getFranchise().getName();
        this.descriptipon = item.getFranchise().getDescriptipon();
        this.bussinessDate = item.getFranchise().getBussinessDate();
        this.itemId = item.getItemId();
        this.itemCode = item.getItemCode();
        this.itemDescription = item.getItemDescription();
        this.itemMajorCategoryId = item.getItemMajor().getItemMajorCategoryId();
        this.itemMajorCategoryDescription = item.getItemMajor().getItemMajorCategoryDescription();
        this.itemUserTypeCode = item.getItemUserType().getItemUserTypeCode();
        this.itemIdUserTypeDescription = item.getItemUserType().getItemIdUserTypeDescription();
        this.cntGroupName = item.getCNTGroupName();
        this.theoriticalQuantity = item.getItemInventory().getTheoriticalQuantity();
        this.alowedTargetLeftOverQuantity = item.getItemInventory().getAlowedTargetLeftOverQuantity();
        this.actualQuantity = item.getItemInventory().getActualQuantity();
        this.purchaseQuantity = item.getItemInventory().getPurchaseQuantity();
        this.transferQuantity = item.getItemInventory().getTransferQuantity();
        this.beginningInvoiceCount = item.getItemInventory().getBeginningInvoiceCount();
        this.leftOverIssueQuantity = item.getItemInventory().getLeftOverIssueQuantity();
        return this;
    }

    public FoodReport createFoodReport() {
        return new FoodReport(storeNumber, id, name, descriptipon, bussinessDate, itemId, itemCode, itemDescription, itemMajorCategoryId, itemMajorCategoryDescription, itemIdUserTypeDescription, itemUserTypeCode, itemcategoryCode, itemcategoryDscription, cntGroupName, theoriticalQuantity, alowedTargetLeftOverQuantity, actualQuantity, purchaseQuantity, transferQuantity, beginningInvoiceCount, leftOverIssueQuantity, theoriticalDollars, alowedTargetLeftOverDollars, actualDollars, purchaseDollars, transferDollars, beginningInvoiceDollars, endingInvoiceDollars, leftOverIssueDollars, loadId, batchId, insertDate, lastUpdatedDate, version);
    }
}