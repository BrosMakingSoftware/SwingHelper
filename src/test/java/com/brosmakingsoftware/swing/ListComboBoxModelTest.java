/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brosmakingsoftware.swing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Hernandez Perez (<a href="https://github.com/iampeluca">iampeluca</a> on Github) - <a href="https://github.com/BrosMakingSoftware">BrosMakingSoftware</a>
 */
public class ListComboBoxModelTest {
    
    public ListComboBoxModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testListComboBoxModel(){
        LanguageSelectorJDialog dialog = new LanguageSelectorJDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }
}