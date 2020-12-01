package com.bcopstein;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ProdutoTest{
    
    @ParameterizedTest  
    @CsvSource({
        "10,prod10,32,89",
        "10,prod10,50,130",
        "10,prod10,98,18",
        "10,prod10,98,-18",

          
    })
    public void setPreco(int a,String b,double c,double res){
        Produto p= new Produto(a,b,c);
        p.setPreco(res);
        double atual = p.getPreco();
        Assertions.assertEquals(atual, res);
    }
}
