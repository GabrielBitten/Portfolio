package vendas;

import clientes.Cliente;
import clientes.ClienteRepository;
import ingredientes.Ingrediente;
import ingredientes.IngredienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import produtos.Produto;
import produtos.ProdutoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VendaService {
    private final VendaRepository vendaRepository;
    private final IngredienteRepository ingredienteRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;

    public  VendaService(VendaRepository vendaRepository,ProdutoRepository produtoRepository, IngredienteRepository ingredienteRepository,ClienteRepository clienteRepository){
        this.vendaRepository = vendaRepository;
        this.produtoRepository = produtoRepository;
        this.ingredienteRepository = ingredienteRepository;
        this.clienteRepository = clienteRepository;
    }


    @Transactional
    public void cadastrarVenda(Venda venda) {
        Cliente cliente = clienteRepository.findById(venda.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));


        if (cliente.getCredito() < venda.getValorTotal()) {
            throw new RuntimeException("Cliente não possui créditos suficientes para realizar a compra");
        }


        cliente.setCredito(cliente.getCredito() - venda.getValorTotal());

        venda.setCliente(cliente);

        List<ItemVenda> itens = venda.getItens();

        venda.setDataVenda(LocalDateTime.now());

        for (ItemVenda itemVenda : itens) {
            if (itemVenda.getProduto() != null) {
                Produto produto = produtoRepository.findById(itemVenda.getProduto().getId())
                        .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

                itemVenda.setProduto(produto);
                itemVenda.setIngrediente(null);

            } else if (itemVenda.getIngrediente() != null) {
                Ingrediente ingrediente = ingredienteRepository.findById(itemVenda.getIngrediente().getId())
                        .orElseThrow(() -> new RuntimeException("Ingrediente não encontrado"));

                itemVenda.setIngrediente(ingrediente);
                itemVenda.setProduto(null);
            } else {
                throw new RuntimeException("Item de venda inválido");
            }

            itemVenda.setVenda(venda);
        }

        vendaRepository.save(venda);

        clienteRepository.save(cliente);
    }


    public Double calcularValorTotalVendasPorPeriodo(LocalDateTime startDate, LocalDateTime endDate) {
        List<Venda> vendasNoPeriodo = vendaRepository.findVendasByIntervaloDatas(startDate, endDate);

        Double valorTotal = vendasNoPeriodo.stream()
                .mapToDouble(Venda::getValorTotal)
                .sum();

        return valorTotal;
    }

    public List<Venda> historicoDeVendasPorCliente(Long clienteId) {
        return vendaRepository.findByCliente_Id(clienteId);
    }

    public List<String> clientesQueCompraramProduto(Long produtoId) {
        return vendaRepository.findClientesQueCompraramProduto(produtoId);
    }

}
