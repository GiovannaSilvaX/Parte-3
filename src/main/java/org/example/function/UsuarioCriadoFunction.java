package org.example.function;

import org.example.function.dto.UsuarioCriadoMensagemDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class UsuarioCriadoFunction {
    @Bean
    public Consumer<UsuarioCriadoMensagemDto> usuarioCriadoConsumer() {
        return order -> {
            System.out.println("Mensagem de usuário criado recebida: " + order);
        };
    }
}
