package com.devesh.code.ProductApi.Model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.PROPERTY)
public class MetaData {

    private String pageTitle;

    private String siteName;

    private String prod_description;

    private String prod_keywords;

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getProd_description() {
        return prod_description;
    }

    public void setProd_description(String prod_description) {
        this.prod_description = prod_description;
    }

    public String getProd_keywords() {
        return prod_keywords;
    }

    public void setProd_keywords(String prod_keywords) {
        this.prod_keywords = prod_keywords;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MetaData{");
        sb.append("pageTitle='").append(pageTitle).append('\'');
        sb.append(", siteName='").append(siteName).append('\'');
        sb.append(", prod_description='").append(prod_description).append('\'');
        sb.append(", prod_keywords='").append(prod_keywords).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
