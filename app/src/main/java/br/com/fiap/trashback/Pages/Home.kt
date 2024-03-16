package br.com.fiap.trashback.Pages

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController) {
    Text(text = "Esse é o login")
    Button(onClick = { navController.navigate("Login") }) {
        Text(text = "Cadastro")
    }
}