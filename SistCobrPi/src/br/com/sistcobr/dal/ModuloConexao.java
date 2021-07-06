/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistcobr.dal;

import java.sql.*;

/**
 *
 * @author Emile
 */
public class ModuloConexao {
    //metódo responsável por estabelecer a conexão cm o banco!
    public static Connection conector(){
        java.sql.Connection conexao =null;
        //a linha abaixo chama o driver
        String driver ="com.mysql.jdbc.Driver";
        // aemazenando informações referentes  ao banco
        String url ="jdbc:mysql://localhost:3306/bdcob";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println("Banco desconectado + " e);
            return null;
        }
   
    }
    
    
    
}
