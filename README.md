# Desafio de Modelagem de Domínio em Kotlin

## 📚 Descrição do Projeto

Este projeto foi desenvolvido como parte de um desafio proposto pela plataforma **Digital Innovation One (DIO)** com o objetivo de aplicar conceitos fundamentais da linguagem Kotlin, especialmente:

* Modelagem de domínio
* Programação orientada a objetos
* Data classes
* Enum classes
* Coleções
* Funções e controle de fluxo

O desafio consiste em simular o funcionamento de **formações educacionais**, onde alunos podem se matricular em trilhas de aprendizado compostas por conteúdos educacionais.

---

# 🧠 Modelagem do Domínio

O domínio foi modelado considerando os seguintes elementos principais:

## Usuário

Representa um aluno que pode se matricular em uma formação.

A classe `Usuario` possui as seguintes propriedades:

* **nome** → Nome do aluno
* **email** → Email do aluno
* **formacaoAtual** → Formação em que o aluno está matriculado
* **formacoesConcluidas** → Lista de formações concluídas
* **ultimoAcesso** → Data do último acesso do aluno
* **progressoPorFormacao** → Controle de progresso do aluno dentro de cada formação

Esse último campo foi adicionado para permitir acompanhar quantas aulas o aluno já concluiu.

---

## Conteúdo Educacional

Representa uma aula ou módulo dentro de uma formação.

A classe `ConteudoEducacional` contém:

* **nome** → Nome do conteúdo
* **duracao** → Duração em minutos

Cada formação possui uma lista de conteúdos educacionais.

---

## Formação

Uma formação representa uma trilha de aprendizado composta por vários conteúdos.

A classe `Formacao` possui:

* **nome** → Nome da formação
* **nivel** → Nível da formação
* **conteudos** → Lista de conteúdos educacionais
* **inscritos** → Lista de usuários matriculados

Também possui o comportamento:

### Função `matricular(usuario)`

Responsável por:

* Adicionar o usuário à lista de inscritos
* Definir a formação atual do aluno
* Inicializar o progresso do aluno na formação

---

## Enum Nivel

Para representar os níveis de formação foi criada uma **enum class**:

```
enum class Nivel {
    BASICO,
    DATA,
    BACKEND
}
```

Essa abordagem evita uso de strings soltas e melhora a segurança do código.

---

# ⚙️ Simulação no Método Main

No método `main` foi realizada uma simulação completa do domínio.

Foram criadas três formações:

* Kotlin Básico
* Kotlin Data
* Kotlin Backend

Cada formação possui **4 conteúdos educacionais**.

---

# 👨‍🎓 Alunos Simulados

Para demonstrar o funcionamento do sistema foram criados três alunos:

| Aluno   | Formação       | Progresso |
| ------- | -------------- | --------- |
| Alex    | Kotlin Básico  | 100%      |
| João    | Kotlin Data    | 50%       |
| Alberto | Kotlin Backend | 75%       |

O progresso foi calculado com base no número de conteúdos concluídos em relação ao total da formação.

---

# 📊 Exibição do Progresso

O sistema imprime no console:

* Nome do aluno
* Email
* Formação atual
* Conteúdos concluídos
* Porcentagem de progresso

Exemplo de saída:

```
Inscritos na formação Kotlin Backend:

Nome: Alberto
Email: alberto@uol.com
Formação Atual: Kotlin Backend

Conteúdos Concluídos:
- Programação Orientada a Objetos
- Construção de APIs REST
- Integração com Banco de Dados

Progresso: 75%
```

---

# 🧩 Conceitos de Kotlin Utilizados

Durante o desenvolvimento foram utilizados diversos recursos da linguagem:

* `data class`
* `enum class`
* `MutableList`
* `MutableMap`
* `forEach`
* `when`
* `take()`
* `LocalDate`
* Null Safety (`?`)

---

# 🚀 Possíveis Melhorias

Algumas evoluções possíveis para o projeto seriam:

* Criar sistema de **conclusão automática de formação**
* Persistir dados em **banco de dados**
* Criar **API REST em Kotlin + Spring Boot**
* Criar **interface web ou mobile**
* Adicionar **controle de aulas concluídas dinamicamente**

---

# 👨‍💻 Autor

**Alexandre Drummond Rizzato**

Desenvolvedor de Software
Java | Python | Kotlin | APIs | Backend

GitHub:
https://github.com/Aledrizzato78

LinkedIn:
https://www.linkedin.com/in/alexandre-drummond-rizzato-524a3724
