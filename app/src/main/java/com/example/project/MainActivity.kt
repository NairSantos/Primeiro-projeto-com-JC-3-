package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.project.ui.theme.ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        TelaPrincipalDoApp()
        }
    }
}//termina a classe da MainActivitu


@Composable
fun TelaPrincipalDoApp() {
    ProjectTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            SaudarUsuarioLogado("Zecas")
        }
        Text("Lenovo")
    }
}


@Composable
fun SaudarUsuarioLogado(nomedoUsuarioLogado: String) {
    Text(text = "Hello $nomedoUsuarioLogado!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TelaPrincipalDoApp()
}