import java.math.BigDecimal
import java.math.RoundingMode

fun bigDecimal(){
    val salarios = bigDecimalArrayof("1500.55", "2000.0", "5000.66")
    println(salarios.contentToString())

val aumento = "1.1".toBigDecimal()

val salarioComAumento = salarios
    .map{ salario -> calculaAumentoRelativo(salario, aumento)

}.toTypedArray()
    println("esse é o  saalario com aumento:${salarioComAumento.contentToString()}")


    val gastoInicial = salarioComAumento.somando()

}




private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal? =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayof(vararg valores:String):Array<BigDecimal> {
return Array(valores.size) { i -> valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somando(): BigDecimal {
    return this.reduce {valorVazio, valorVerdade ->
        valorVazio + valorVerdade
    }
}


