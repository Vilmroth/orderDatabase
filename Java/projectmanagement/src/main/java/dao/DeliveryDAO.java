package dao;

import model.Delivery;

public class DeliveryDAO {
    public void addDelivery(Delivery delivery){
        try {
            delivery.save();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
