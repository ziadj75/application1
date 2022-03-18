package com.example.myapplication.service;

import com.example.myapplication.beans.Acteur;
import com.example.myapplication.dao.IDao;

import java.util.ArrayList;
import java.util.List;


public class ActeurService implements IDao<Acteur> {

    private List<Acteur> Acteurs;
    private static ActeurService instance;

    private ActeurService() {
        this.Acteurs = new ArrayList<>();
    }

    @Override
    public boolean create(Acteur o) {
        return Acteurs.add(o);
    }

    @Override
    public boolean update(Acteur o) {
        return false;
    }

    @Override
    public boolean delete(Acteur o) {
        return Acteurs.remove(o);
    }

    @Override
    public Acteur findById(int id) {
        for(Acteur f : Acteurs){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    @Override
    public List<Acteur> findAll() {
        return Acteurs;
    }

    public synchronized static ActeurService getInstance() {
        if(instance == null)
            instance = new ActeurService();
        return instance;
    }
}
