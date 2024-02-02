package clientes;

import ingredientes.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }


    public Double obterCreditoDoCliente(Long clienteId) {
        return clienteRepository.getCreditoCliente(clienteId);
    }
}
