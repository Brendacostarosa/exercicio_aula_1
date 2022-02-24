import kotlin.math.pow

class calcularfisica {

    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun forcaCentripeta(massa: Float, velocidade: Double, raioDaCurva: Float): Double {
        return massa * ((velocidade * velocidade / raioDaCurva)
    }

    fun forcaimpulso(forca: Float, deltaT: Float, deltaF: Float, deltaI: Float): Float {
        return forca * (deltaT - deltaI)
    }

    fun forcaelastica(constante: Float, deformacao: Float): Float {
        return constante * deformacao
    }

    fun velocidademedia(intervaloI: Float, intervaloF: Float, tempoI: Float, tempoF: Float): Float {
        return (intervaloF - intervaloI) / (tempoF - tempoI)
    }

    fun mru(deltasF: Float, deltasI: Float, velocidade: Float, tempo: Float): Float {
        return (deltasF - deltasI) + velocidade * tempo
    }

    fun mruv(s: Float, deltaV: Float, a: Float, tempoT: Float, tempoFloat): Float {
        return s + deltaV * tempo + (a * (tempoT * tempoT) / 2)
    }

}