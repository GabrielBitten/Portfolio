package produtos;

import ingredientes.Ingrediente;
import ingredientes.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    private final IngredienteRepository ingredienteRepository;
    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository, IngredienteRepository ingredienteRepository){
        this.produtoRepository = produtoRepository;
        this.ingredienteRepository = ingredienteRepository;
    }


    public Produto cadastrarProduto(Produto produto, List<Ingrediente> ingredientes) {

        if (ingredientes.stream().anyMatch(ingrediente -> ingrediente.getEstoque() <= 0)) {
            throw new RuntimeException("Um ou mais ingredientes não têm unidades em estoque.");
        }
            produto.setIngredientes(ingredientes);

        return produtoRepository.save(produto);
    }
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

}
