// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val contato: String, val id: Number)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun imprimeInscritos(): MutableList<Usuario> {
        return inscritos
    }
}

fun main() {
    //usuários
    val usuario  = Usuario("Alexandre", "alexandre@gmail.com", 1)
    val usuario2 = Usuario("Sueli", "sueli@gmail.com", 2)

    //conteúdos
    val conteudo  = ConteudoEducacional("Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Java", 60)
    val listaConteudos = mutableListOf<ConteudoEducacional>()
    listaConteudos.add(conteudo)
    listaConteudos.add(conteudo2)

    //formação
    val formacao = Formacao("Desenvolvimento Android", listaConteudos, Nivel.BASICO)

    formacao.matricular(usuario)
    formacao.matricular(usuario2)

    println("Formacao: ${formacao.toString()}")
    println("Conteudos: $listaConteudos")
    println("Inscritos da formacao: ${formacao.imprimeInscritos()}")
}
