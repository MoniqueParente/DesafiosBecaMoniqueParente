# Desafios Beca (NTT DATA Europe & LATAM).
# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
# Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________

![Monique GitHub stats](https://github-readme-stats.vercel.app/api?username=MoniqueParente&show_icons=true&theme=radical)
______________________________________________________________________________________________________________________________________________________________________________

⭕ Implementar as interfaces com os métodos utilizados.

⭕ Criação de services funcionais.

⭕ Integração da camada controller.

______________________________________________________________________________________________________________________________________________________________________________

⚜ Implementar as interfaces com os métodos utilizados

Exemplo:

public interface MPPecasInterface <T> {

    T criar (T objeto);
    T atualizar (T objeto ,Integer id);
    void deletar (Integer id);
    List<T> listar() ;
    T obter (Integer id);       }

⚜ Criação de services funcionais.

Para identificar uma classe service é necessário a assinatura: @Service

Exemplo:

@Service
public class ClienteService implements MPPecasInterface <Cliente> {

    public Cliente criar(Cliente cliente) {
        cliente.setId(1);

        return cliente;
    }

  
 ‼ Obs: A criação de services consiste em ter a implementação CRUD.


⚜ Integração da camada controller.

Para identificar uma classe controller é necessário a assinatura: @RestController
 
Exemplo:

@RestController   
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente clienteCriado = clienteService.criar(cliente);

        return ResponseEntity.created(null).body(clienteCriado);
    }

 ‼ Obs: A criação de controller consiste em ter a implementação CRUD.
______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
