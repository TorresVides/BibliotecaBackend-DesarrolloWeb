package com.example.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlleRestBiblio {
    
    @PostMapping ("/bibliotecas")
    public String registrarBiblioteca() {
        
        return "bibliotecas"; 
    }

    @GetMapping ("/bibliotecas")
    public String consultarBibliotecas() {
        
        
        return "bibliotecas"; 
    }

}
