#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Teste de logar no sistema com email em branco
  O ssitema devera exibir um alerta informando que o campo email � obrigatorio

  @tag1
  Scenario: Tentativa de logar no Sistema com Email em Branco
    Given Informei email em branco e senha valida
    When Cliquei no botao Logar
    Then O sistema devera apresentar uma mensagem informando que o campo email � obrigatorio
