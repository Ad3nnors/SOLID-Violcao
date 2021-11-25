import br.ufscar.dc.dsw.domain.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
	Cliente findById(long id);

	Cliente findBycpf(String cpf);

	List<Cliente> findAll();

	Cliente save(Cliente cliente);

	void deleteById(Long id);
}
