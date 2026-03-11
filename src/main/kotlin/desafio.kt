
import java.time.LocalDate

enum class Nivel { BASICO, DATA, BACKEND }

data class Usuario(
    val nome: String,
    val email: String,
    var formacaoAtual: Formacao?,
    val formacoesConcluidas: MutableList<Formacao> = mutableListOf(),
    var ultimoAcesso: LocalDate,
)

data class ConteudoEducacional(val nome: String , val duracao: Int = 100)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        usuario.formacaoAtual = this
    }
}

fun main() {
    val conteudosBasico = listOf(
                ConteudoEducacional("Variáveis e Tipos de Dados", 25),
                ConteudoEducacional("Estruturas Condicionais (if / when)", 25),
                ConteudoEducacional("Funções em Kotlin", 25),
                ConteudoEducacional("Coleções (List, Set, Map)",25)
    )
    val conteudosData = listOf(
                ConteudoEducacional("Manipulação de Coleções e Streams", 25),
                ConteudoEducacional("Data Classes e Modelagem de Dados", 25),
                ConteudoEducacional("Transformação de Dados (map, filter, reduce)", 25),
                ConteudoEducacional("Leitura e Processamento de Arquivos/JSON",25)
    )

    val conteudosBackend = listOf(
                ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 25),
                ConteudoEducacional("Construção de APIs REST", 25),
                ConteudoEducacional("Integração com Banco de Dados", 25),
                ConteudoEducacional("Tratamento de Erros e Boas Práticas de Backend",25)
    )

    val formacaoBasico = Formacao("kotlin Basico", Nivel.BASICO, conteudos = conteudosBasico)
    val formacaoData = Formacao("kotlin Data", Nivel.DATA, conteudos = conteudosData)
    val formacaoBackend = Formacao("kotlin Backend", Nivel.BACKEND, conteudos = conteudosBackend)


    val novoAluno = Usuario(
        nome = "Alex",
        email = "ale@uol.com",
        formacaoAtual = null,
        ultimoAcesso = LocalDate.of(2025, 12, 12),
    )
    formacaoBasico.matricular(novoAluno)

    println("Inscritos na formação ${formacaoBasico.nome}:")
    formacaoBasico.inscritos.forEach { aluno ->
        println("Nome: ${aluno.nome}, Email: ${aluno.email}, Último Acesso: ${aluno.ultimoAcesso}")
        println("Formação Atual: ${aluno.formacaoAtual?.nome} [${aluno.formacaoAtual?.nivel}]")
        println("Conteúdos:")
        aluno.formacaoAtual?.conteudos?.forEach { conteudo ->
            println("- ${conteudo.nome} (${conteudo.duracao}min)")
        }
        println()
    }
}
