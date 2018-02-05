package com.panera.api.domain.item;

/**
 * Created by sjain on 2/1/18.
 */
public class ItemInventory {

    private final float theoriticalQuantity;
    private final float alowedTargetLeftOverQuantity;
    private final float actualQuantity;
    private final float purchaseQuantity;
    private final float transferQuantity;
    private final float beginningInvoiceCount;
    private final float leftOverIssueQuantity;
    private final ItemInventotyDollars itemInventotyDollars;


    public ItemInventory(float theoriticalQuantity, float alowedTargetLeftOverQuantity, float actualQuantity, float purchaseQuantity, float transferQuantity, float beginningInvoiceCount, float leftOverIssueQuantity, ItemInventotyDollars itemInventotyDollars) {
        this.theoriticalQuantity = theoriticalQuantity;
        this.alowedTargetLeftOverQuantity = alowedTargetLeftOverQuantity;
        this.actualQuantity = actualQuantity;
        this.purchaseQuantity = purchaseQuantity;
        this.transferQuantity = transferQuantity;
        this.beginningInvoiceCount = beginningInvoiceCount;
        this.leftOverIssueQuantity = leftOverIssueQuantity;
        this.itemInventotyDollars = itemInventotyDollars;
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

    public ItemInventotyDollars getItemInventotyDollars() {
        return itemInventotyDollars;
    }

    @Override
    public String toString() {
        return "ItemInventory{" +
                "theoriticalQuantity=" + theoriticalQuantity +
                ", alowedTargetLeftOverQuantity=" + alowedTargetLeftOverQuantity +
                ", actualQuantity=" + actualQuantity +
                ", purchaseQuantity=" + purchaseQuantity +
                ", transferQuantity=" + transferQuantity +
                ", beginningInvoiceCount=" + beginningInvoiceCount +
                ", leftOverIssueQuantity=" + leftOverIssueQuantity +
                ", itemInventotyDollars=" + itemInventotyDollars +
                '}';
    }
}
