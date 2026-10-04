# QA to Dev ☕

Minha jornada de QA para desenvolvedor backend Java, estudando 1 hora por dia durante 20 semanas.
O plano é acompanhado no Jira: cada commit leva a chave da tarefa (ex.: `Q2D-12`).

## Estrutura

| Pasta | Conteúdo | Semanas |
|---|---|---|
| `fundamentos/` | Lógica, POO, Collections, exceções e Java moderno | 1 a 5 |
| `sql/` | Modelagem e consultas no PostgreSQL | 6 e 7 |
| `techmarket-api/` | Projeto 1: API REST com Spring Boot | 8 a 11 |
| `urbanswift-api/` | Projeto 2: segurança com JWT e testes | 12 a 15 |
| `anotacoes-api/` | Projeto final: Docker, CI e deploy | 16 a 20 |

As pastas das APIs serão criadas pelo Spring Initializr quando chegar a semana delas.

## Como rodar os fundamentos

```bash
cd fundamentos
mvn test          # roda os testes
mvn compile exec:java   # roda o App
```

## Stack
Java 25 · Maven · JUnit 5 · Spring Boot · PostgreSQL · Docker
