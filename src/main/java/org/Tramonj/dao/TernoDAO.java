/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Tramonj.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Tramonj.model.TernoM;

/**
 *
 * @author Ramon
 */
public class TernoDAO {
    
    @PersistenceContext
    private EntityManager em;

    /**
     *
     * @param terno
     */
    @Transactional
    public void salvar(TernoM terno) {
        em.persist(terno);
    }

    public List<TernoM> buscarTodos() {
        TypedQuery<TernoM> query = em.
                createQuery("select c from Terno c", TernoM.class);
        return query.getResultList();
    }

}

