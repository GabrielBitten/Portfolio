package ingredientes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    private final IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService){
        this.ingredienteService = ingredienteService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Ingrediente> cadastrarIngrediente(@RequestBody Ingrediente ingrediente) {
        Ingrediente ingredienteCadastrado = ingredienteService.cadastrarIngrediente(ingrediente);
        return ResponseEntity.status(HttpStatus.CREATED).body(ingredienteCadastrado);
    }
}
