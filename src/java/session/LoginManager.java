/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rakesh Kumar
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class LoginManager {
    Login login = new Login();
   @PersistenceContext(unitName = "AffableBeanPU")
   
   private EntityManager em;
   public int Register(String name, String email, String password, String confirmPassword){
    try{
        
        
        login.setName(name);
        login.setEmail(email);
        login.setPassword(password);
        login.setConfirmPassword(confirmPassword);
        
        em.persist(login);
        em.flush();
        return login.getId();
    }catch(Exception ex){
        ex.printStackTrace();
    }
       return 0;
}


    public List getDetails() { 
      return em.createQuery("select l from Login l")
              .getResultList();
   }
    
   }
  

