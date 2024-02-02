package produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT p FROM Produto p WHERE p.estoque > 0")
    List<Produto> findAllComEstoque();

    @Query("SELECT p FROM Produto p WHERE p.estoque <= 0")
    List<Produto> findAllSemEstoque();

   


}
