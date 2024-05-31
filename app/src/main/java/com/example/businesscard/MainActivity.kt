package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface (){
                    BusinessInfo(name = "TEST", email = "TEST", social = "TEST")
                }
            }
        }
    }
}

@Composable
fun BusinessInfo(name: String, email: String, social: String, modifier: Modifier = Modifier){
    Column (verticalArrangement = Arrangement.Bottom,
        modifier = modifier){
        Text(text = name)
        Text(text = email)
        Text(text = social)
    }
}

@Preview
@Composable
fun BusinessPreview(){
    BusinessInfo(name = "TEST", email = "TEST", social = "TEST")
}