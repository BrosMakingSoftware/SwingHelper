/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.brosmakingsoftware.swing;

/**
 *
 * @author Diego Hernandez Perez (<a href="https://github.com/iampeluca">iampeluca</a> on Github) - <a href="https://github.com/BrosMakingSoftware">BrosMakingSoftware</a>
 */
public class Customer {
    
    private Long id;
    private String name;
    private Integer views;
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the views
     */
    public int getViews() {
        return views;
    }

    /**
     * @param views the views to set
     */
    public void setViews(Integer views) {
        this.views = views;
    }
    
    

}
