# Desafios Beca (NTT DATA Europe & LATAM).
# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
# Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________

![Monique GitHub stats](https://github-readme-stats.vercel.app/api?username=MoniqueParente&show_icons=true&theme=radical)
______________________________________________________________________________________________________________________________________________________________________________

⭕ Implementar as interfaces com os métodos utilizados.
⭕ Criação de services funcionais.
⭕ Integração da camada controller.


Implementar as interfaces com os métodos utilizados

public interface /Nome para interface/ </Nome ou letra para identificar/> {

/Nome ou letra para identificar/ criar(/Nome ou letra para identificar/ objeto);
/Nome ou letra para identificar/ atualizar(/Nome ou letra para identificar/ objeto ,Integer id);
void deletar(Integer id);
List</Nome ou letra para identificar/> listar() ;
/Nome ou letra para identificar/ obter(Integer id);

}

Criação de services funcionais.

Para identificar uma classe service é necessário a assinatura: @Service

public class /Nome da classe service/ implements /nome da interface/ <Nome da Classe>{
  
      public Cliente criar(Cliente cliente) {
        cliente.setId(1);

        return cliente;
    }
}



Integração da camada controller.

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


