package co.develhope.democontrollerconqueryparameter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ControllerConQueryParameter {
    @GetMapping("ciao")
    public String ritornaNomeProvincia(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
