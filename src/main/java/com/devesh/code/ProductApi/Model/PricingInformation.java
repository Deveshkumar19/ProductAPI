package com.devesh.code.ProductApi.Model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.PROPERTY)
public class PricingInformation {

    private float standardPrice;

    private float standardPriceNoVat;

    private float currentPrice;

    public float getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(float standardPrice) {
        this.standardPrice = standardPrice;
    }

    public float getStandardPriceNoVat() {
        return standardPriceNoVat;
    }

    public void setStandardPriceNoVat(float standardPriceNoVat) {
        this.standardPriceNoVat = standardPriceNoVat;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MetaData{");
        sb.append("standardPrice=").append(standardPrice);
        sb.append(", standardPriceNoVat=").append(standardPriceNoVat);
        sb.append(", currentPrice=").append(currentPrice);
        sb.append('}');
        return sb.toString();
    }
}
