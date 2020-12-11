package controllers;

import dao.DeliveryDAO;
import model.Delivery;
import utils.DateTimeUtils;
import java.util.Date;

public class DeliveryController {

        DeliveryDAO deliveryDAO = new DeliveryDAO();

        public void addDelivery(Date deliveryDate, String deliveryAddress, Integer maxWeight) {
            try {
                Delivery delivery = new Delivery();
                delivery.setDeliveryDate(deliveryDate);
                delivery.setDeliveryAddress(deliveryAddress);
                delivery.setMaxWeight(maxWeight);
                deliveryDAO.addDelivery(delivery);
            } catch (Exception e) {
                System.out.println("Virhe: " + e.getMessage());
            }
        }

}
