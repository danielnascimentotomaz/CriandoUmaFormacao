import java.util.*

fun main(){

    val conteudos : MutableList<Conteudo> = mutableListOf()

    val cursoPython = Conteudo("Curso Python","xxxxxxxxxxx",54.0)
    conteudos.add(cursoPython)

    val formacaoBackEnd = Formacao("Formação Beckend","Uma formação sobre Backend", Date(),conteudos)

    // criacao dos alunos
    val aluno1 = Aluno("João", 25, "Masculino")
    val aluno2 = Aluno("Maria", 30, "Feminino")

    // fazendo matricula dos alunos

    formacaoBackEnd.matriclarAluno(aluno1)
    formacaoBackEnd.matriclarAluno(aluno2)


    /////////////////////////////////////////////////////
   println("Formação")
    formacaoBackEnd.ListaConteudo()


    println("========================")

    println("Alumo escritos")
    formacaoBackEnd.listaInscrito()












}