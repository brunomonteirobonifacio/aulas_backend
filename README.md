# Aulas Backend
Repositório para salvar as atividades das aulas_backend.aulas de Backend 2025

## Configurando dependência
Para permitir a exibição dos menus, fiz uso da lib [simple-aulas_backend.menu](https://github.com/brunomonteirobonifacio/simple-menu).  
Para evitar o uso do Maven nesse caso que é uma única dependência e pequena, o arquivo .jar foi adicionado à pasta lib.

### Configurar o projeto no IntelliJ
Caso queira rodar o projeto pelo IntelliJ é necessário configurar o projeto em `Project Structure` > `Libraries` para ele reconhecer a biblioteca.

### Rodar o projeto por linha de comando (bash)
Caso queira rodar o projeto no bash, utilize os seguintes comandos:
```bash
javac -cp "lib/*" -d bin $(find src -name "*.java")   # para compilar
java -cp "bin:lib/*" aulas_backend.Main               # para executar
```