package com.example.bitekotlinproject_kobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name=intent.getStringExtra("name")

        if(name=="কাজী নজরুল ইসলাম"){
            nameView.text=name
            imageView.setImageResource(R.drawable.kazi)
            val details= getString(R.string.kazi)
            detailsView.text=details
            setTitle(name)


        }
        else if(name=="রবীন্দ্রনাথ ঠাকুর"){
            nameView.text=name
            imageView.setImageResource(R.drawable.rabi)
            val details= getString(R.string.rabindra)
            detailsView.text=details
            setTitle(name)

        }
        else if(name=="হুমায়ূন আহমেদ"){
            nameView.text=name
            imageView.setImageResource(R.drawable.humayun)
            val details= getString(R.string.humayun)
            detailsView.text=details
            setTitle(name)

        }
        else if(name=="সুফিয়া কামাল"){
            nameView.text=name
            imageView.setImageResource(R.drawable.sufia)
            val details= getString(R.string.sufia)
            detailsView.text=details
            setTitle(name)

        }
        else if(name=="সুকুমার রায়"){
            nameView.text=name
            imageView.setImageResource(R.drawable.sukumar)
            val details= getString(R.string.sufia)
            detailsView.text=details
            setTitle(name)

        }
        else if(name=="জহির রায়হান"){
            nameView.text=name
            imageView.setImageResource(R.drawable.johir)
            val details= getString(R.string.johir)
            detailsView.text=details
            setTitle(name)

        }
        else if(name=="বলাইচাঁদ মুখোপাধ্যায়"){
            nameView.text=name
            imageView.setImageResource(R.drawable.bolai)
            val details= getString(R.string.bolai)
            detailsView.text=details
            setTitle(name)

        }
    }
}