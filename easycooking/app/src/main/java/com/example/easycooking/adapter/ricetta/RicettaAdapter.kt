package com.example.easycooking.adapter.ricetta








import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.easycooking.R
import com.example.easycooking.view.Activity_ricetta
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import kotlinx.android.synthetic.main.cards.view.*


class RicettaAdapter(val items: ArrayList<Ricetta>, val context: Context) : RecyclerView.Adapter<RicettaAdapter.RicettaViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RicettaViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.cards, parent, false)
        return RicettaViewHolder(layout)
    }

    override fun getItemCount(): Int = items.size

    val storage = Firebase.storage

    override fun onBindViewHolder(holder: RicettaViewHolder, position: Int) {
        val currentitem = items.get(position)
        holder.nomeRicetta.text = currentitem.nome
        val n_image = "images/".plus(currentitem.image)
        val imagereference = storage.reference.child(n_image)
        imagereference.downloadUrl.addOnSuccessListener { uri ->
            Glide.with(holder.itemView)
                .load(uri)
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.ALL) //ALL or NONE as your requirement
                .into(holder.itemView.foto_ricetta_cerca)
        }.addOnFailureListener { // Handle any errors
            Glide.with(holder.itemView)
                .load(R.drawable.coltforc)
                .fitCenter()
                .into(holder.itemView.foto_ricetta_cerca)
        }

        /*holder.itemView.setOnClickListener{

            var intent= Intent(this.context, Activity_ricetta::class.java)
            intent.putExtra("Nome Ricetta", currentitem.nome)
            startActivity(intent)
        }*/
/*(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val activity = v!!.context as AppCompatActivity
                val fragment = SingolaRicetta()
                activity.supportFragmentManager.beginTransaction().replace(R.id.rv, fragment)
                    .addToBackStack(null).commit()


                //  holder.nomeRicetta.text = "cliccato"
            }
        })*/


        //holder.ingredienti.text = currentitem.toString()
        //holder.id.text = currentitem.id
        // holder.cookTime.text = currentitem.cookTime
        //holder.prepTime.text = currentitem.prepTime
        //holder.totalTime.text = currentitem.totalTime
        // holder.Immagine.text = currentitem.image
        //holder.intolleranze.text = currentitem.intolleranze
        //holder.keywords.text = currentitem.keywords
        //holder.porzione.text = currentitem.porzioni
        //holder.quantità. = currentitem.quantita
        //holder.misura.text = currentitem.unita
        //holder.vegano.text = currentitem.vegano
        //holder.preparazione.text = currentitem.preparazione
        //holder.categoria.text = currentitem.recipeCategory
        // holder.paese.text = currentitem.recipeCuisine
        //holder.descrizione.text = currentitem.descrizione
        //var puttt:String=(qua_dis.toString())+" "+um_dis
        //holder.textView2.text = puttt



    }
   inner class RicettaViewHolder(row: View) : RecyclerView.ViewHolder(row) {

        /*
        val ingredienti = row.findViewById<TextView>(R.id.ingr)
        val id = row.findViewById<TextView>(R.id.id)
        val cookTime = row.findViewById<TextView>(R.id.cook_time)
        val prepTime = row.findViewById<TextView>(R.id.prep_time)
        val totalTime = row.findViewById<TextView>(R.id.total_time)
        val Immagine = row.findViewById<TextView>(R.id.immagine)
        val intolleranze = row.findViewById<TextView>(R.id.intolleranze)
        val keywords = row.findViewById<TextView>(R.id.keywords)
        val porzione = row.findViewById<TextView>(R.id.porzioni)
        val quantità = row.findViewById<TextView>(R.id.quant)
        val misura = row.findViewById<TextView>(R.id.misura)
        val vegano = row.findViewById<TextView>(R.id.vegano)
        val preparazione = row.findViewById<TextView>(R.id.prep)
        val categoria = row.findViewById<TextView>(R.id.categoria)
        val paese = row.findViewById<TextView>(R.id.country)
        val descrizione = row.findViewById<TextView>(R.id.descr)

         */
        val intent: Intent? = null
        val nomeRicetta = row.findViewById<TextView>(R.id.nome_ric)
        val Immagine1 = row.findViewById<ImageView>(R.id.foto_ricetta_cerca)
        val textView2 = row.findViewById<TextView>(R.id.prodotto_quant)

        init {
            row.setOnClickListener { context.startActivity(Intent(context,Activity_ricetta::class.java)) }
        }

    }


}




