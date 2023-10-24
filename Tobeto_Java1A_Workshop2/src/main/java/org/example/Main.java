package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "Vade orani: ";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("img1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("img2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("img3.jpg");

        Product[] products = {product1,product2,product3};

        for(Product product : products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05554443322");
        individualCustomer.setCustomerNumber("112233");
        individualCustomer.setFirstName("Yasin");
        individualCustomer.setLastName("Ozcelik");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("04443332211");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("98765");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}