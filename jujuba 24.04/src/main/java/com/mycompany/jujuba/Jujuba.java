package com.mycompany.jujuba;

import classe.Categoria;
import classe.Produto;

public class Jujuba {

    public static void main(String[] args) {

        Produto produto = new Produto(2);
        System.out.println(produto.getNome());

        Categoria categoria = new Categoria(2);
        System.out.println(categoria.getNome());
        
     
        
        
        
        
        
//Categoria cat2 = new Categoria(1, "Cao1");
//System.out.println(cat2.getId());
//Produto pro2 = new Produto(1, 3, "Kasa", 87.52, 4);
//System.out.println(pro2.getPreco());
//        Categoria cat = new Categoria();
//        cat.setId(5657896);
//        cat.setNome("Jujuh");
//        
//        Produto pro = new Produto();
//        pro.setId(95687);
//        pro.setCategoria_id(6868);
//        pro.setNome("Caio");
//        pro.setPreco(10);
//        pro.setQuantidade(5);
    }
}
