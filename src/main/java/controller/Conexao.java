package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private static final String HOST = "localhost:5432";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "password";
    private static final String DATABASE = "PROJETO_FARMACIA";
    
    private static final String URL =
            "jdbc:postgresql://" + HOST + "/" + DATABASE;
    
    public static Connection conectar(){
        try{
            return DriverManager.getConnection(
                    URL,
                    USUARIO,
                    SENHA
            );
        }catch(Exception e){
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con){
        try{
            if (con != null){
                con.close();
            }
        }catch(Exception e){
              System.err.println("Erro: " + e.getMessage());
        }
    }
    
}
