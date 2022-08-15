# Spring Basico
 
 - A primeira versão do Spring foi lançada em 2002
 - Criador: Rod Johnson (Autraliano)
 - O Spring é baseado em Java mas atualmente pode ser utilizado com o Kotlin.
 
 ## Apache Maven
 
 - Gerenciador de dependências
  - **Dependências:** Complementos que a aplicação pode ter

## Acoplamento  e Coesão

- Acoplamento: significa o tanto que uma classe depende da outra classe para funcionar.
- Coesão: é a responsabilidade que cada classe possui
- **Obs:** O Spring utiliza o padrão de alta coesão e baixo acoplamento

## Injeção de dependências

- Tem a finalidade de criar métodos que podem ser executados por determinadas classes.
- Utilizadas em repositórios para criar ações como:
  - Cadastros
  - Alterações
  - Seleções
  - Exclusões
  - Filtragrem de dados
## Repositórios

- Repositórios podem ser **classes** ou **interfaces** que definem um conjunto de métodos que serão utilizados por outras classes.
- Principais repositórios:
  - CrudRepository
  - JPARepository
  - Repostirory
- Exemplos do uso de repositórios:
``` SQL
SELECT * FROM PRODUTOS; => findAll()
``` 
``` SQL
INSERT INTO produtos VALUES (1, "Café", 5); => save(Objeto)
``` 

## JPA
- O JPA (Jpava Persistence API) é o padrão que o Java utiliza par ao ORM
- ORM (Object Relational Mapping) é a criação de tableas por meio de classes e pode realizar ações como: 
  - Selecionar
  - Cadastrar
  - Alterar 
  - Ecluir

## Arquitetura MVC
- Model: São entidades
- View: Exibir a estrutura das páginas
- Controller: Intermediário entre a Model e a View
<br>
![image](https://user-images.githubusercontent.com/78964459/184640785-cf4fb56a-bc76-4869-a7e6-a9a83506c817.png)
<br>

## Framework
- Vantagens
  - Padronizar projetos
  - Métodos pré-moldados
  - Velocidade na elaboração de projetos
  - Segurança
  - Performace
  - Documentação

- Desvantagens: 
  - Estudar o framework
  - Limitação de ações/métodos
  - Obrigatório seguir as regras estabelecidadas
  - Ficar dependente do framework

## Rest
- São princicípios de arquitetura, para os desenvolvedores criarem suas APIs
  - RestFul: é a utlização da arquitetura recomandada ao criar APIs

## Dependências
- É um padrão de projeto que utiliza recursos externos para deixar o código desacoplado
- Principais dependências:
  - DevTools
    - Compilar o projeto automaticamente ao salvar
  - Spring Web
    - Cria um servidor com o Apache Tomcat e a arquitetura para trabalhar com MVC e RestFul
  - JPA
    - Transforma classes em tabelas (Mapeamento do Objeto Relacional)
  - MySQL Driver
    - Faz a conexão entre o Spring e o banco de dados
  
## Modelos
- Pricipais funcionalidades:
  - Criar tabelas:
  - Manipular dados para cadastrar, selecionar ou excluir
  
## Anotations 
- São complementos que uma classe, um método ou atributo pode ter



  
  
  
  
  
  
  
  
  
  
  
  
  
  


