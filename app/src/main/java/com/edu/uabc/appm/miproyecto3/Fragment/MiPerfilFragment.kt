package com.edu.uabc.appm.miproyecto3.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.edu.uabc.appm.miproyecto3.R
import kotlinx.android.synthetic.main.fragment_mi_perfil.*

class MiPerfilFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mi_perfil, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Datos.text="Lic. Informática \n"+
                   "Correo: sramirez66@uabc.edu.mx \n"+
                   "Dirección:Valle de puebla"

            hob2.text= "Programar \n"
            hob3.text= "Correr\n"
            hob4.text="Computadoras"

    }

}
