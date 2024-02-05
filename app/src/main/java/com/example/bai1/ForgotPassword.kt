package com.example.bai1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordScreen() {
    var email by rememberSaveable {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.Top
        ) {
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 2.dp)) {
                Icon(Icons.Default.ArrowBackIosNew, contentDescription = "")
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.8f)
                .clip(RoundedCornerShape(12.dp))
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .size(160.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Quên mật khẩu", style = MaterialTheme.typography.titleLarge)
            }
            Spacer(modifier = Modifier.height(25.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
//                    .background(color = Color.Red)
            ) {
                Row() {
                    Text(text = "Email", style = MaterialTheme.typography.titleSmall)
                    Text(text = "*", style = TextStyle(color = Color.Red))
                }
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(13.dp),
                    placeholder = {
                        Text(
                            text = "Nhập email",
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                )
                Spacer(modifier = Modifier.height(60.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0092FF)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.5f)
                    ) {
                        Text(
                            text = "Xác nhận", style = MaterialTheme.typography.titleMedium
                        )
                    }
                }
            }
        }
    }
}