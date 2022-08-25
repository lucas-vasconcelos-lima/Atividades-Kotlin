import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ClienteTest{

    val cliente1 = Cliente(
        "Lucas",
        "210511501",
        "Rua flor"
    )

    @BeforeEach

    fun adcList(){
        cliente1.adcList("Cimento")
        cliente1.adcList("Areia")
        cliente1.adcList("Bianco")
    }
    @Test
    fun adcClienteTest (){

        var erro = false

        try {
            val client = Cliente("", "", "")
        }catch (e: Exception){
            erro = true
        }
        assertTrue(erro)
    }
    @Test
    fun adcListTest () {
        assertEquals(3, cliente1.listaDecompras.size)

    }
    @Test
    fun reoverItemTest () {
        cliente1.removerItem("Bianco")
        assertEquals(2, cliente1.listaDecompras.size)

    }

}