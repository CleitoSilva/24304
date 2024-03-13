package com.example24303.cleiton24304

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyLogin()
        }
    }
}

@Composable
fun MyLogin() {
    Surface(
        color = Color.Gray,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        )
        {
            topPart()
            MyLoginBox()
            buttonsPart()
            bottomPart()
        }
    }
}

@Composable
fun MyLoginBox() {
    Box(
        Modifier
            .height(150.dp)
            .width(300.dp)
            .background(Color.White)
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            TextField(value = "User name", onValueChange = {})
            TextField(value = "Password", onValueChange = {})
        }
    }
}

@Composable
fun buttonsPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ){
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Red,
            ),
        ) {
            Text("Cancel")
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Red,
            ),
        ) {
            Text("Login")
        }

    }
}



@Composable
fun topPart() {
    Spacer(modifier = Modifier.height(20.dp))
    Text(text = "M", fontSize = 80.sp, color = Color.White)
    Text(
        text = "Mobile Server Name",
        fontSize = 30.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Please provide your information",
        fontSize = 20.sp,
        color = Color.White
    )
}

@Composable
fun bottomPart() {
    Spacer(modifier = Modifier.height(5.dp))
    Text(
        text = "Footer text goes here",
        fontSize = 20.sp,
        color = Color.White,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MyLogin()
}