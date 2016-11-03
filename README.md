[![CircleCI](https://circleci.com/gh/mensonones/arq-monolitica-manutencao/tree/master.svg?style=svg)](https://circleci.com/gh/mensonones/arq-monolitica-manutencao/tree/master)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/52a65b2b14fd47dbba0bcc9e6402915b)](https://www.codacy.com/app/mensones-1/arq-monolitica-manutencao_2?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mensonones/arq-monolitica-manutencao&amp;utm_campaign=Badge_Grade)

#Arquitetura
![alt tag](https://github.com/emmanuelneri/arquitetura-monolitica/blob/master/arquitetura-monolotica.png)

#Requisitos
- Postgres 9.3+
- Wildfly 8.0.2.Final
- Java 8

# Configurando Projeto
1 - Adicionar módulo Postgres no Wildfly
  - Adicionar jar do Posgres em  modules/system/layers/base/org/postgresql
  - Configurar driver no standalone/configuration/standalone.xml
  
  ```
  <datasources>
    <driver name="postgresql" module="org.postgresql">
      <xa-datasource-class>org.postgresql.Driver</xa-datasource-class>
    </driver>
 </datasources>
 ```

2 - Configurar DataSource no Wildfly
  - Adicionar nova configuração de datasource
  
  ```
  <datasources>
     <datasource jta="true" jndi-name="java:jboss/datasources/MonoliticaDS" pool-name="MonoliticaDS" enabled="true" use-java-context="true" use-ccm="true">
      <connection-url>jdbc:postgresql://localhost:5432/monolitica</connection-url>
      <driver>postgresql</driver>
      <security>
        <user-name>postgres</user-name>
        <password>postgres</password>
      </security>
    </datasource>
 </datasources>
 ```
 Obs: O Datasource está configurado para acessar a porta padrão do Postgres e como usuário e senha "postgres"
 
3 - Criar o Banco
  - Criar um banco no postgres chamado "monolitica"
  
# Utilizando Aplicação

1 - Logar no sistema
- email: teste@gmail.com
- senha: 123

  
