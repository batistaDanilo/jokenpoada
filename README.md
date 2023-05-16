# jokenpoada

## Introdução
Projeto Final do Módulo Testes Automatizados I - Jornada do Conhecimento Backend Java - F1rst Tecnologia e Inovação e Ada.

## Projeto
Uma empresa de games solicitou a criação de uma aplicação backend a qual será responsável pelo gerenciamento do jogo JOKENPO

Porém este jokenpo é diferente: além dos tradicionais “pedra”, “papel” e “tesoura”, temos os novos movimentos “Spock” e “Lagarto”

A tesoura corta o papel e mata o lagarto
O papel refuta o Spock e cobre a pedra
A pedra esmaga o lagarto e quebra a tesoura
O lagarto envenena o Spock e come o papel
O Spock quebra a tesoura e vaporiza a pedra
Um dos requisitos que a empresa contratante solicitou foi a utilização de testes automatizados para verificar se os métodos criados para o jogo estão funcionando corretamente.

Somos o time de testes, então iremos realizar o desenvolvimento dos testes a seguir:

Testes Unitários (Camada de Serviço)
Testes de Integração (Camada de Controle)
O time de desenvolvimento não desenvolveu o recurso de Ranking do jogo. Fomos designados para utilizar o TDD para criação desta funcionalidade
Realizar alguns testes com o BDD (Cucumber)
Realizar a cobertura de testes (Jacoco ou do próprio Intellij)
PLUS: Utilizar o SonarCloud para Code Review

## Desenvolvimento

1) Testes Unitários (Camada de Serviço)
- Fizemos testes unitários usando Mockito para o pacote services. Cobrimos todo o pacote com 100% de cobertura de linhas.
2) Testes de Integração (Camada de Controle)
- Fizemos testes de integração usando MockMvc para o pacote controllers. Cobrimos todo o pacote com 100% de cobertura de linhas.
3) O time de desenvolvimento não desenvolveu o recurso de Ranking do jogo. Fomos designados para utilizar o TDD para criação desta funcionalidade
- Usamos TDD para criar os métodos de teste sobre o ranking na classe GameServiceTest. Inicialmente, na etapa RED, codificamos os métodos de teste. 
Em seguida, na etapa GREEN, implementamos as funcionalidades para atender os testes. Finalmente, na etapa REFACTORING, nós melhoramos o código da funcionalidade 
de ranking. Utilizamos a tabela GAME_WINNERS, que já estava mapeada na classe Game. Em GameRepository, criamos um novo método com query nativa para obtermos
a lista de tuplas e para mapearmos a lista de registros retornados para o nosso dto.
4) Realizar alguns testes com o BDD (Cucumber)
- Implementamos 7 cenários da classe MoveService. A classe está no pacote tech.ada.games.jokenpo.acceptance dentro do diretório de testes. 
O arquivo de feature está dentro da pasta resources/features.
5) Realizar a cobertura de testes (Jacoco ou do próprio Intellij)
- Estamos com 93% de cobertura de linhas do código usando o runner do Intellij e com 91% de cobertura de linhas do código usando o jacoco. O relatório pode ser 
visto na pasta src/test/resources/coverage_reports/htmlReport/index.html. Após criamos os testes das principais classes (serviços e controladores), criamos 
mais algumas classes de testes a fim de aumentar a cobertura de todo o projeto.
6) PLUS: Utilizar o SonarCloud para Code Review
- Integramos o nosso repositório do github com o sonar cloud para realizarmos o code review do projeto.

## Equipe
Cesar Augusto, Daniel Baião, Danilo Batista, Juliana Aquino, Mateus Moura e Leonardo Locatti.
