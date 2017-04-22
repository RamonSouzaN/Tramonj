/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Tramonj.mb;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.Tramonj.dao.TernoDAO;
import org.Tramonj.model.TernoM;

/**
 *
 * @author Rejane
 */
@Named(value = "cadastrarTerno")
@RequestScoped
public class CTernoBean implements Serializable{


    TernoM terno = new TernoM();
    @Inject 
    TernoDAO ternoDAO;
    
    public TernoM getTernoM() {
        return terno;
    }
    public void add() {
        ternoDAO.salvar(terno);
        
    }
} 
