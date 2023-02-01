package com.example.mylib

import android.content.Context
import android.widget.Toast

open class MyLib {

  companion object fun getToast(context:Context,text:String){
   Toast.makeText(context, "$text", Toast.LENGTH_SHORT).show()
  }


}