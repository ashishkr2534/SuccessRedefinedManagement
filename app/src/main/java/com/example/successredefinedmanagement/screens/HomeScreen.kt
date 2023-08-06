package com.example.successredefinedmanagement.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.successredefinedmanagement.R
import androidx.compose.ui.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold() {
        Surface() {
            Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Success Redefined")
                Text(text = "Home DashBoard")

                Spacer(modifier = Modifier.size(20.dp))
                Image(painter = painterResource(
                    id = R.drawable.success_redefined_main_image),
                    contentDescription ="success redefined homeScreen hero Image" ,)
            }
        }
        
    }
}