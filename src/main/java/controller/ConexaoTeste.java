package controller;

import java.sql.Connection;

public class ConexaoTeste {
    public static void main(String[] args){
        Connection con = Conexao.conectar();
        if (con != null){
            System.out.println("Conexão realizada com sucesso!");
            Conexao.desconectar(con);
        }
    }
    
}
