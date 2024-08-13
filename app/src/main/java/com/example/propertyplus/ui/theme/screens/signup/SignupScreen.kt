package com.example.propertyplus.ui.theme.screens.signup

import androidx.compose.foundation.Image


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_DETAIL
import com.example.propertyplus.ui.theme.NewGreen
import androidx.compose.ui.tooling.preview.Preview as Preview

@Composable
fun SignupScreen(navController: NavController){

    Column(modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)

        {
            Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.property),
                contentDescription = "home",
                modifier = androidx.compose.ui.Modifier
                    .size(200.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

            Text(
                text = "PropertyPlus",
                fontSize = 60.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta,
            )

            var name by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("")}
            var password by remember { mutableStateOf("") }
            var confpassword by remember { mutableStateOf("")}

            OutlinedTextField(
                value = name,
                onValueChange ={name=it},
                label = { Text(text = "Fullname")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


            OutlinedTextField(
                value = email,
                onValueChange ={name=email},
                label = { Text(text = "email Address")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


            OutlinedTextField(
                value = password,
                onValueChange ={name=password},
                label = { Text(text = "Password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                visualTransformation = PasswordVisualTransformation

            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


            OutlinedTextField(
                value = confpassword,
                onValueChange ={name=it},
                label = { Text(text = "confirm Password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                visualTransformation = PasswordVisualTransformation
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


            Button(
                onClick = { navController.navigate(ROUT_DETAIL)},
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(NewGreen),
                shape = RoundedCornerShape(10.dp)

            ) {
                Text(text = "Register")
            }

            Button(
                onClick = { },
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(NewGreen),
                shape = RoundedCornerShape(10.dp)

            ) {
                Text(text = "Login")
            }


        }

}


@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}
