fun main(args: Array<String>) {
    val calculadora: calculadora = calculadora()

    val resultadoPeso: Float = calculadora.forcaPeso(3f, 5f)
    println("O resultado é $resultadoPeso")

    val resultadoCentripeta: Double = calculadora.forcaCentripeta(2f, 5, 2f)
    println("O resultado é $resultadoCentripeta")

    val resultadoImpulso: Float = calculadora.forcaimpulso()
    println("O resultado é $resultadoImpulso")

    val resultadoelastica: Float = calculadora.forcaimpulso()
    println("O resultado é $resultadoelastica")

    val resultadovelocidade: Float = calculadora.velocidademedia()
    println("O resultado é $resultadovelocidade")

    val resultadomru: Float = calculadora.mru()
    println("O resultado é $resultadomru")

    val resultadomruv: Float = calculadora.mruv()
    println("O resultado é $resultadomruv")
}
