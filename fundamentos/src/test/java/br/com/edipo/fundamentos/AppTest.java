package br.com.edipo.fundamentos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void deveMontarSaudacaoComONome() {
        assertEquals("Olá, Edipo! Bem-vindo ao Java.", App.saudacao("Edipo"));
    }
}
