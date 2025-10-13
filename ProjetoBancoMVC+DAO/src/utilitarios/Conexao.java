/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
        public static void main(String[] args) {
        obterConexao();
        System.out.println("Conectado com sucesso");
    }
    static Connection con = null;
    //Configurações para conexão MySQL
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/projeto";
    static String usuario = "root";
    static String senha = "";
    
    public static Connection obterConexao(){
        try {
            if (con == null) {
                //Carregar o driver do MYSQL
                Class.forName(driver);
                //Conectar ao banco de dados
                con = DriverManager.getConnection(url,usuario,senha);
            }
        } catch (ClassNotFoundException e){
            throw new RuntimeException("Driver não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão com banco de dados", e);
        }
        return con;
    }
}