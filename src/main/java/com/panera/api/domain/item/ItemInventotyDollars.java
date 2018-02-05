package com.panera.api.domain.item;

/**
 * Created by sjain on 2/1/18.
 */
public class ItemInventotyDollars {

    private final float theoriticalDollars;
    private final float alowedTargetLeftOverDollars;
    private final float actualDollars;
    private final float purchaseDollars;
    private final float transferDollars;
    private final float beginningInvoiceDollars;
    private final float endingInvoiceDollars;
    private final float leftOverIssueDollars;

    public ItemInventotyDollars(float theoriticalDollars, float alowedTargetLeftOverDollars, float actualDollars, float purchaseDollars, float transferDollars, float beginningInvoiceDollars, float endingInvoiceDollars, float leftOverIssueDollars) {
        this.theoriticalDollars = theoriticalDollars;
        this.alowedTargetLeftOverDollars = alowedTargetLeftOverDollars;
        this.actualDollars = actualDollars;
        this.purchaseDollars = purchaseDollars;
        this.transferDollars = transferDollars;
        this.beginningInvoiceDollars = beginningInvoiceDollars;
        this.endingInvoiceDollars = endingInvoiceDollars;
        this.leftOverIssueDollars = leftOverIssueDollars;
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

    @Override
    public String toString() {
        return "ItemInventotyDollars{" +
                "theoriticalDollars=" + theoriticalDollars +
                ", alowedTargetLeftOverDollars=" + alowedTargetLeftOverDollars +
                ", actualDollars=" + actualDollars +
                ", purchaseDollars=" + purchaseDollars +
                ", transferDollars=" + transferDollars +
                ", beginningInvoiceDollars=" + beginningInvoiceDollars +
                ", endingInvoiceDollars=" + endingInvoiceDollars +
                ", leftOverIssueDollars=" + leftOverIssueDollars +
                '}';
    }
}
