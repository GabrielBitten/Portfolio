package vendas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    @Query("SELECT v FROM Venda v WHERE v.dataVenda BETWEEN :startDate AND :endDate")
    List<Venda> findVendasByIntervaloDatas(@Param("dataInicio") LocalDateTime dataInicio, @Param("dataFinal") LocalDateTime dataFinal);

    List<Venda> findByCliente_Id(Long clienteId);
    @Query("SELECT DISTINCT v.cliente.nome FROM Venda v JOIN v.itens i WHERE i.produto.id = :produtoId")
    List<String> findClientesQueCompraramProduto(@Param("produtoId") Long produtoId);



}
