package dao;

import model.Storages;
public class StoragesDAO{

    public void addStorages(Storages storages){
        try {
            storages.save();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}