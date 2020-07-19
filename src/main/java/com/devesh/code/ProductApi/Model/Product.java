package com.devesh.code.ProductApi.Model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ProductAPI")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="Prod_Name")
    private String name;

    @Column(name ="Prod_ModelNumber")
    private String modelNumber;

   private  MetaData metaData;

    private PricingInformation pricingInformation;

    private ProductDescription productDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

   @Embedded
   public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Embedded
    public PricingInformation getPricingInformation() {
        return pricingInformation;
    }

    public void setPricingInformation(PricingInformation pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    @Embedded
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", metaData=").append(metaData);
        sb.append(", pricingInformation=").append(pricingInformation);
        sb.append(", productDescription=").append(productDescription);
        sb.append('}');
        return sb.toString();
    }
}
