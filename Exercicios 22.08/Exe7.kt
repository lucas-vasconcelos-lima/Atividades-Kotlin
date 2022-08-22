


fun main (){

    /*
        7) Crie uma classe paciente e apresente os atributos e métodos referentes
        esta classe, em seguida crie um objeto paciente, defina as instancias deste
        objeto e apresente as informações deste objeto no console.
     */

    val paciente1 = Pacientes ()

    println("Digite o nome do paciente: ")
    val nome = readln()
    paciente1.nome = nome

    println("Digite a idade do paciente: ")
    val idade = readln().toInt()
    paciente1.idade = idade

    println("Digite o sexo do paciente: ")
    val sexo = readln()
    paciente1.sexo = sexo

    println("Digite a especialidade que o $nome precisa ser atendido: ")
    val esp = readln()
    paciente1.especiadlidade = esp
    println()
    println("O paciente $nome tem $idade anos de idade e é do sexo $sexo")
    println("Está agendando consulta para o/a $esp")





}