//package com.example.trial_project
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.database.DataSetObserver
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.ImageView
//import android.widget.ListAdapter
//import android.widget.TextView
//
//class CustomAdapter (val context: Context, val DataList:List<Datamodel>): BaseAdapter(),
//    ListAdapter {
//
//
//    override fun getCount(): Int {
//        return DataList.size
//    }
//
//    override fun getItem(position: Int): Any {
//        return DataList[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
////    override fun hasStableIds(): Boolean {
////        TODO("Not yet implemented")
////    }
//
//    @SuppressLint("ViewHolder", "MissingInflatedId")
//    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
//
//
//        val rowview = LayoutInflater.from(context).inflate(R.layout.list_layout, parent, false)
//
//        val data = DataList[position]
//        val Image = rowview.findViewById<ImageView>(R.id.image)
//        val Name = rowview.findViewById<TextView>(R.id.my_name)
//        val Email = rowview.findViewById<TextView>(R.id.my_email)
////
////        Glide.with(context).load(data.image).into(Image)
//
//        Name.setText(data.toString())
//        Email.setText(data.toString() )
//
//        return rowview
//
//    }
//}