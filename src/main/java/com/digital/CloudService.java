package com.digital;
import com.digital.model.CloudType;

import java.util.ArrayList;
import java.util.List;
public class CloudService {

    public List getAvailableProducts(CloudType type){

        List products = new ArrayList();

        if(type.equals(CloudType.AWS)){
            products.add("dynamo db");
            products.add("red shift");
            products.add("s3");



        }else if(type.equals(CloudType.AZURE)){
            products.add("cosmos db");
            products.add("cognitive functions");

        }else if(type.equals(CloudType.GCP)){
            products.add("Compute engine");
            products.add("app engine");
            products.add("app engine");

        }else {


            products.add("No Brand Available");
        }
        return products;
    }

}
