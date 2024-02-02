package vendas;

import jakarta.transaction.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    private final VendaService vendaService;

    public VendaController(VendaService vendaService){
        this.vendaService = vendaService;
    }

    @PostMapping("/cadastrar")
    @Transactional
    public ResponseEntity<String> cadastrarVenda(@RequestBody Venda venda) {
        try {
            vendaService.cadastrarVenda(venda);
            return ResponseEntity.ok("Venda cadastrada com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar venda: " + e.getMessage());
        }
    }
    @GetMapping("/calcular-valor-total")
    public ResponseEntity<Double> calcularValorTotalVendasPorPeriodo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataInicial,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataFinal) {
        Double valorTotal = vendaService.calcularValorTotalVendasPorPeriodo(dataInicial, dataFinal);
        return ResponseEntity.ok(valorTotal);
    }
    @PostMapping("/vendasPorCliente/{clienteId}")
    public ResponseEntity<List<Venda>> historicoVendasCliente(@PathVariable Long clienteId) {
        List<Venda> historicoVendas = vendaService.historicoDeVendasPorCliente(clienteId);
        return ResponseEntity.ok(historicoVendas);
    }

    @GetMapping("/clientes-que-compraram/{produtoId}")
    public ResponseEntity<List<String>> clientesQueCompraramProduto(@PathVariable Long produtoId) {
        List<String> clientes = vendaService.clientesQueCompraramProduto(produtoId);
        return ResponseEntity.ok(clientes);
    }

}
