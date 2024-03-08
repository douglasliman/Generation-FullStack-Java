package com.generation.helloword.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World !!!";
    }


    @GetMapping("/bsm")
    public String[] getBSMs() {
        String[] bsms = {
                "TRABALHO EM EQUIPE",
                "ORIENTAÇÃO AOS DETALHES",
                "PROATIVIDADE",
                "COMUNICAÇÃO",
                "PERSISTÊNCIA",
                "RESPONSABILIDADE PESSOAL",
                "ORIENTAÇÃO AO FUTURO",
                "MENTALIDADE DE CRESCIMENTO"
        };

        return bsms;

    }
    @GetMapping("/goals")
    public List<String> myGoals() {
        return Arrays.asList(
                "Mentalidade de Crescimento, correr mais riscos para crescer afinal só aprendemos de verdade quando erramos, e tentar buscar mais feedbacks de meus colegas.",
                "aprender novas habilidades técnicas e não técnicas, de forma proativa, para melhorar seu desempenho"

        );
    }

}
