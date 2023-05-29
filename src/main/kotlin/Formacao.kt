import java.util.Date

data class Formacao(val nome:String, val sobre:String, val data:Date,val conteudos:List<Conteudo>) {

    // crie e ja inicializei a lista de Aluno
    val inscritos:MutableList<Aluno> = mutableListOf()


    fun matriclarAluno(aluno:Aluno){

        inscritos.add(aluno)
    }

    fun listaInscrito(){
        for (x in inscritos){
            println(x)
        }
    }

    fun ListaConteudo(){
        for (y in conteudos){
            println(y)
        }
    }








}