package clientes;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  private final ClienteService clienteService;

  public ClienteController(ClienteService clienteService){
      this.clienteService = clienteService;
  }


    @PostMapping("/cadastrar")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente){
      Cliente clienteCadastrado = clienteService.cadastrarCliente(cliente);
      return ResponseEntity.status(HttpStatus.CREATED).body(clienteCadastrado);
    }

  @GetMapping("/verificarCredito/{clienteId}")
  public ResponseEntity<Double> obterCreditoDoCliente(@PathVariable Long clienteId) {
    Double credito = clienteService.obterCreditoDoCliente(clienteId);
    if (credito != null) {
      return ResponseEntity.ok(credito);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
