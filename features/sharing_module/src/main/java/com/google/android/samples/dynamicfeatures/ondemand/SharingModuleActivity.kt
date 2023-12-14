/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.samples.dynamicfeatures.ondemand

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.samples.dynamicfeatures.BaseSplitActivity
import com.google.android.samples.dynamicfeatures.ondemand.kotlin.R


/** A simple Activity displaying some text, written in Kotlin. */
class SharingModuleActivity : BaseSplitActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_sharing_module)

        val a:Int= ClassJava().input()
       // val b:Int= ClassKotlin().input()
        val b: Int= SharingClass().input()
       // val c= ClassTest().input()

        val bundle = intent.extras
        val value = bundle!!.getString("DATE_SHARE")

        findViewById<TextView>(R.id.sharingOutput).text= "$value Java module input is:${a} , Kotlin module input is: ${b}, sum is: ${a+b}"

        findViewById<TextView>(R.id.sharingOutput).setOnClickListener {
            Intent(this,KotlinSampleActivity::class.java)
                .also {
                    it.putExtra("DATE_SHARE","Hello Featurs Module")
                    startActivity(it)
                }
        }
      //  findViewById<ImageView>(R.id.sharingIcon).setImageResource(R.drawable.ic_home)
    //    findViewById<ImageView>(R.id.sharingIcon).setImageResource(R.drawable.ic_kotlin)
       // findViewById<ImageView>(R.id.sharingIcon).setImageResource(R.drawable.ic_java)
    }

}
