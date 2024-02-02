package produtos;

import ingredientes.Ingrediente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;
    private final ProdutoRepository produtoRepository;

    public ProdutoController (ProdutoService produtoService, ProdutoRepository produtoRepository){
        this.produtoService = produtoService;
        this.produtoRepository =  produtoRepository;
    }


    @PostMapping("/cadastrar")
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto,
                                                    @RequestBody List<Ingrediente> ingredientes) {
        Produto produtoCadastrado = produtoService.cadastrarProduto(produto, ingredientes);

        return new ResponseEntity<>(produtoCadastrado, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }
    @GetMapping("/com-estoque")
    public List<Produto> getProdutosComEstoque() {
        return produtoRepository.findAllComEstoque();
    }
    @GetMapping("/sem-estoque")
    public List<Produto> getProdutosSemEstoque() {
        return produtoRepository.findAllSemEstoque();
    }
}
