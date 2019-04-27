package com.edu.uabc.appm.miproyecto3.Fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.edu.uabc.appm.miproyecto3.R
import kotlinx.android.synthetic.main.fragment_inicio.*
import kotlinx.android.synthetic.main.fragment_inicio.view.*
import kotlinx.android.synthetic.main.nav_header_main.view.*

class InicioFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //var txtprimero: TextView
        primerpa.text="Es un nuevo lenguaje de programación funcional, desarrollado por el equipo de JetBrains," +
                " el cuál ha ido tomando peso, debido a que entró a formar parte oficialmente como lenguaje Android" +
                " en 2017, proporcionando ventajas sobre Java 6."
        //var txtsegundo:TextView
        segundopa.text="Es un lenguaje simple, elegante, fácil de leer y de escribir. Kotlin toma lo mejor de Java " +
                "y elimina aquello que le “sobra”, para enfocarse en la productividad. Algunas de ellas son: \n"+
                "Proporciona seguridad sobre los nulos\n" +
                "Ofrece una 100% interoperable con Java, pudiendo hacer uso de cualquier librería escrita en Java.\n" +
                "No tiene primitivos.\n" +
                "Las clases de Kotlin tienen propiedades, no campos simples.\n"+
                "No chequea las excepciones."
        tercerpa.text="Un lenguaje funcional es aquel dónde las variables no tienen estado, no hay cambios en éstas a " +
                "lo largo del tiempo y son inmutables. Es decir, no pueden cambiarse los valores a lo largo de la ejecución. "


    }


}
