/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 202227858
 */
public class DB {

    public static String servidor = "127.0.0:3306";
    public static String usuario = "root";
    public static String senha = "";
    public static String nome_banco = "crud";

    public static Connection conexao() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql;//" + servidor + "/" + nome_banco + "?useSSl=false&useTimezone=true&serverTimezone=UTC", usuario, senha
            );
        } catch (SQLException e) {
            System.out.println("Erro de conexão" + e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexao;
    }
}
