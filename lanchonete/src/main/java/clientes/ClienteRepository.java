package clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT cliente.credito FROM Cliente cliente WHERE cliente.id = :clienteId")
    Double getCreditoCliente(@Param("clienteId") Long clienteId);

}
