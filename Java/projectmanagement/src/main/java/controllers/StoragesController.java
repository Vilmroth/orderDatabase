package controllers;

import dao.StoragesDAO;
import model.Storages;




public class StoragesController {

    StoragesrDAO storagesDAO = new StoragesDAO();

    public void addStorages(Integer capacity, String productname) {
        try{
            Storages storages = new Storages();
            storages.setCapacity(capacity);
            storages.setProductname(productname);
            storagesDAO.addCStorages(storages);
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
    } 


}