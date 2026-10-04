package br.com.edipo.fundamentos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void deveMontarSaudacaoComONome() {
        assertEquals("Olá, Edipo! Bem-vindo ao Java.", App.saudacao("Edipo"));
    }

    @Test 
    void deveMontarDespedidaComEdipo() {
        assertEquals("Até logo, Edipo!", App.despedida("Edipo"));
    }
    
    @Test 
    void deveMontarDespedidaComMaria() {
        assertEquals("Até logo, Maria!", App.despedida("Maria"));
    }
}
