package com.example.trial_project

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class Image_Fragment<Buttom> : Fragment() {

//    private lateinit var Buttom: Buttom
    private lateinit var imageView: ImageView

    private val REQUEST_PERMISSION_CODE = 1

    companion object {
        val IMAGE_REQUEST_CODE = 100
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_, container, false)

//        button = findViewById(R.id.gallery)
//
//        button.setOnClickListener {
//
//            pickImageGallery()
//        }

    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
        }

        imageView.setImageURI(data?.data)
    }
}
