package com.mycompany.eyemarket;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {

    public static void main(String[] args) {
        Conexao connect = new Conexao();
        JdbcTemplate banco = connect.getConnection();
        TelaLogin telaLogin = new TelaLogin();
        var idMaquina = 20;
        Boolean isExiste = false;

        List<Totem> listaTotem = banco.query("SELECT idTotem,hd,processador,sistemaOperacional FROM totem",
                new BeanPropertyRowMapper<>(Totem.class));

       
        for (Totem totem : listaTotem) {
            if (totem.getIdTotem() == idMaquina) {
                System.out.println("Esse totem já é cadastrado");
                isExiste = true;
            }
        }
        
        if(!isExiste){
            System.out.println("Entrei aqui");
            banco.execute("USE EyeMarket;");
            banco.execute(
                        String.format("INSERT INTO Totem VALUES(%d,20.00,'Processador AMOOOO','Linux','0000-00-00',true);",idMaquina)
                );
        }
        telaLogin.setVisible(true);
    }
}
