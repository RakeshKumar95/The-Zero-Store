///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package session;
//
//import entity.Category;
//import entity.Product;
//import java.math.BigDecimal;
//import javax.ejb.Stateless;
//import javax.ejb.TransactionManagement;
//import javax.ejb.TransactionManagementType;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
///**
// *
// * @author Rakesh Kumar
// */
//@Stateless
//@TransactionManagement(TransactionManagementType.CONTAINER)
//public class ProductManager {
//    Product product = new Product();
//    @PersistenceContext(unitName = "AffableBeanPU")
// 
//    private EntityManager em;
//    
//    public int addProduct(String name,BigDecimal price,String description, Category category_id){
//        try{
//        
//        
//        product.setName(name);
//        product.setPrice(price);
//        product.setDescription(description);
//        product.setCategory(category_id);
//        
//        em.persist(product);
//        em.flush();
//        return product.getId();
//    }catch(Exception ex){
//        ex.printStackTrace();
//    }
//       return 0;
//    }
//}
