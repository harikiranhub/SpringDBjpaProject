package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

public class NameRepoImpl implements NameCustom {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Name> getAllNames() {
        StoredProcedureQuery findByYearProcedure =
              em.createNamedStoredProcedureQuery("getAllNames");
      //Declare the parameters in the same order
        findByYearProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        
        //Pass the parameter values
        findByYearProcedure.setParameter(1, "Sachin");
        
        //Execute query
        findByYearProcedure.execute();
        return findByYearProcedure.getResultList();
    }
}

