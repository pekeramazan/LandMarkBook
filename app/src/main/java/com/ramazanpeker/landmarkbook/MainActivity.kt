package com.ramazanpeker.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var landmarkNames= ArrayList<String>()
        landmarkNames.add("Pisa")
        landmarkNames.add("Colosseum")
        landmarkNames.add("Eiffel")
        landmarkNames.add("London Bridge")

    val pisaId=R.drawable.pisa
    val colosseumId=R.drawable.pisa
    val eiffelId=R.drawable.pisa
    val londonbridgeId=R.drawable.pisa

    var landmarkImageIds= ArrayList<Int>()
    landmarkImageIds.add(pisaId)
    landmarkImageIds.add(colosseumId)
    landmarkImageIds.add(eiffelId)
    landmarkImageIds.add(londonbridgeId)




        //val pisa=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
       // val colosseum=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.colosseum)
       // val eiffel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
       // val londonBridge=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.londonbridge)

      /*  var landmarkImage=ArrayList<Bitmap>()
        landmarkImage.add(pisa)
        landmarkImage.add(colosseum)
        landmarkImage.add(eiffel)
        landmarkImage.add(londonBridge)*/



        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext,ShowDetail::class.java)

            intent.putExtra("name",landmarkNames[position])

            intent.putExtra("image",landmarkImageIds[position])
            //Singeleton.selectedImage=landmarkImage[position]


            //val singleton = Singleton.Selected
            //singleton.selectedImage = landmarkImages[position]



            startActivity(intent)
        }




    }
}
