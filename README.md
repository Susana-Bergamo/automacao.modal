# Teste Automatizado: validação do comportamento dos modais do DemoQA <img align="right" width="200" height="200" src="https://github.com/Susana-Bergamo/automacao.modal/blob/b17fbd180eb2255bf5dec131bc61aa59e55cb3a8/modal.png">

Este projeto implementa testa automaticamente todas as janelas pop-up ("modais") na página "Modal Dialogs" do DemoQA.
A estrutura do projeto segue os princípios de desenvolvimento ágil e...

## utiliza as seguintes tecnologias:
* Java: A linguagem de programação principal usada para desenvolver os testes.
* Maven: Uma ferramenta para gerenciar bibliotecas e dependências do projeto.
* Selenium WebDriver: Uma biblioteca Java que permite automatizar interações com navegadores web.
* Page Object Model (POM): Uma abordagem para organizar o código de teste separando a lógica de teste da estrutura da página web. Isso melhora a legibilidade e manutenção do código.
* JUnit 4: Uma estrutura de testes para Java que auxilia na escrita e execução de testes unitários.

## Tratamento de Exceções Robusto:
O pacote metodos implementa mecanismos robustos de tratamento de exceções utilizando blocos try...catch. Em caso de erros durante a execução dos testes, as seguintes informações serão registradas no console, auxiliando na depuração:
* Etapa do teste onde ocorreu a exceção: Permite a rápida localização do erro.
* Causa da exceção (quando disponível): Identifica a origem do problema.
* Mensagem de erro: Fornece detalhes sobre o erro.
  
Essa abordagem de tratamento de exceções facilita a identificação e resolução de problemas por desenvolvedores, independentemente de seu nível de familiaridade com o código-fonte.

## Evidências dos Testes:
Para complementar a análise dos testes, a pasta evidencias na raiz do projeto armazena screenshots capturados durante a execução. As subpastas small e large organizam as evidências dos testes do modal pequeno e grande, respectivamente.

## Execução dos Testes:
* Clone o repositório Git do projeto ou baixe o arquivo ZIP.
* Abra um terminal ou prompt de comando e navegue até o diretório do projeto.
  * Java instalado 
  * Maven instalado 
  * ChromeDriver compatível com seu navegador.
  * Extraia o arquivo para uma pasta acessível pelo sistema.

 ## ✨ Considerações finais:
Este projeto é uma boa base para testar modais automaticamente. É fácil de usar e pode ser adaptado para outros sites. Melhora a experiência do usuário. Testar como os modais funcionam com outros sistemas.
Desafio proposto pela [E2E Coders](https://ead.e2etreinamentos.com.br/)
