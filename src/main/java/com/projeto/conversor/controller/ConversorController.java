package com.projeto.conversor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping(value = "/conversor")
    public void conversor() {

        String encoded= "Ã¼zÃ¼m baÄlarÄ±úÚÙÈéÀáÌ";

        StringBuilder ostr = new StringBuilder();

        for(int i=0; i<encoded.length();i++){
            char ch = encoded.charAt(i);

            if((ch >= 0x0020) && (ch <= 0x007e)){
                ostr.append(ch);
            }

            else{
                ostr.append("?");
            }
        }

        String resultado = new String(ostr);

        System.out.println(resultado);

    }

}
