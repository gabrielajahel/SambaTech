# SambaTech

Meu projeto de Testes Automatizados tem como objetivo testar dois cenários de testes diferentes na tela de Login do Sistema SambaTech utilizando o Cucumber, Java, JUnit e Selenium WebDriver. 

Segue abaixo os dois cenários de testes automatizados:
*Caminho Feliz: Logar no sistema com email e senha corretos = O sistema deverá logar corretamente abrindo a sua página inicial (Classe: LoginTest.java).
*Caminho Infeliz: Tentativa de logar no sistema com email em branco e senha correta = O Sistema deveria apresentar um alerta ao usuário informando que o campo email é obrigatório, o teste irá falar nesse cenário pois o sistema atual não está exibindo este alerta ao usuário (Classe: EmailBrancoTest.java).

Neste projeto é utilizado BDD Cucumber para descrever de maneira mais clara e objetiva os cenários de testes que foram automatizados. Criei várias classes javas com sufixos específicos para melhor organização da estrutura do teste automatizado, o que nos auxiliará no futuro a eventual manutenção delas, bem como uma melhor reutilização de métodos. Além disso, a estrutura criada poderá facilitar o entendimento do meu teste para outras pessoas que forem efetuar manutenção nele de modo que não encontrem dificuldades.

*Classes .feature : Classes onde descreve os cenários baseados em chamadas de steps
*Classes sufixo “Steps” : Classes que contem os metodos chamados por passos de testes do Cucumber (Implementações dos Steps).
*Classe com sufixo “ElementMap” : Classes que contém informações dos objetos que foram mapeados na tela do sistema.
*Classes com sufixo “Test” : São as classes responsáveis por executarem os testes propriamente dito, nelas são indicadas as features que serão chamadas por ela.
*Classes com sufixo “Page” : Classes que contém todos os métodos que serão utilizados pelas classes com sufixo “Steps”, e são responsáveis ´por chamar os objetos contidos nas classes de sufixo “ElementMap”.
*Classe TestRule : Classe que contém todos os métodos comuns a todos os cenários de testes, que são pré requisitos antes e/ou depois da execução dos mesmos.
