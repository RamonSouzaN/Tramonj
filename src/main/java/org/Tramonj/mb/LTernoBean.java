/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Tramonj.mb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.Tramonj.dao.TernoDAO;
import java.util.List;
import org.Tramonj.model.TernoM;
/**
 *
 * @author Ramon
 */
@Named(value = "ListarTernoBean")
@RequestScoped
public class LTernoBean {
    
    @Inject
    private TernoDAO dao;
    private List<TernoM> ternos;

    @PostConstruct
    private void init(){
        this.ternos = dao.buscarTodos();
    }
    
    public List<TernoM> getTernos() {
        return ternos;
    }
    
}
