package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(produces = "text/plain")
public final class HelloWorldController {

    @GetMapping("/HelloWorld")
    String saluda(@RequestParam Optional<String> nom) {
        return "Hola, " + nom.filter(s -> !s.isEmpty()).orElse("UNKNOWN") + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{nom}")
    String saluda2(@PathVariable String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

}