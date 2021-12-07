package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import info.jeovani.recyclerview.adaptadores.AdaptadorPeliculas
import info.jeovani.recyclerview.clasesdatos.Pelicula
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvPeliculas.layoutManager = LinearLayoutManager(this)
        amRvPeliculas.adapter = AdaptadorPeliculas(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Pelicula>{
        val lista = ArrayList<Pelicula>()
        lista.add(Pelicula(R.drawable.interestelar, "Interestelar", "Christopher Nolan", "Ciencia ficción", 4.3, 169, "2014"))
        lista.add(Pelicula(R.drawable.forma_agua, "La forma del agua", "Guillermo del Toro", "Cine fantástico", 3.65, 123, "2017"))
        lista.add(Pelicula(R.drawable.extraordinario, "Extraordinario", "Stephen Chbosky", "Drama", 4.0, 113, "2017"))
        lista.add(Pelicula(R.drawable.la_llegada, "La llegada", "Denis Villeneuve", "Ciencia ficción", 3.95, 116, "2016"))
        lista.add(Pelicula(R.drawable.ex_maquina, "Ex-Máquina", "Alex Garland", "Ciencia ficción", 3.85, 108, "2015"))
        lista.add(Pelicula(R.drawable.jumanji, "Jumanji: En la selva", "Jake Kasdan", "Acción", 3.5, 119, "2017"))

        return lista
    }

}
