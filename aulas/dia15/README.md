## Aula 15 - 17/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Verbos http

#### Material Base
[Base de API](https://www.linkedin.com/posts/walter-paulo-37b215117_base-para-api-activity-6927166536197517312-HMQT?utm_source=share&utm_medium=member_desktop)

#### Get

Retorna os dados para o cliente.

* ProfissionalController.java

```java
@RestController
public class ProfissionalController {

  @GetMapping("/profissionais") 
  public ResponseEntity<List<profissional>> listaProfissionla(){
    var profissionais = ProfissionalSevice.getInstancia().getProfissionais();
    return ResponseEntity.status(200).body(profissionais);
  }

  @PostMapping("/profissionais") 
  public ResponseEntity<profissional> criar(@RequestBody profissional profissiona){
    ProfissionalSevice.getInstancia().adicionar(profissiona);
    return ResponseEntity.status(201).body(profissiona);
  }
}

```

* ProfissionalService.java
```java
public class ProfissionalSevice {

  private ProfissionalSevice() {

  }

  private List<profissional> profissionals;
  private static ProfissionalSevice profissionalService;

  public static ProfissionalSevice getInstancia() {
    if (profissionalService == null)
      profissionalService = new ProfissionalSevice();
    return profissionalService;
  }

  public List<profissional> getProfissionais() {
    if (this.profissionals == null)
      this.profissionals = new ArrayList<>();
    return this.profissionals;
  }

  public void adicionar(profissional profissional) {
    this.profissionals.add(profissional);
  }
}
```

#### Testar

* PostMan [https://www.postman.com/](https://www.postman.com/);
* Insomnia [https://insomnia.rest/](https://insomnia.rest/);
* terminal/Bash(Examplo abaixo)

```s
# Post/Salvar
curl -d '{"id":"1", "nome":"Pedro"}' -H "Content-Type: application/json" -X POST http://localhost:8080

# Get/Consula
curl -H "Content-Type: application/json" -X GET localhost:8080/profissionais
```