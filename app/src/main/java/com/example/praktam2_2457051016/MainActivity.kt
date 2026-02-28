package com.example.praktam2_2457051016

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.praktam2_2457051016.ui.theme.PrakTAM2_2457051016Theme
// Sesuaikan import ini dengan package data class dan object Anda
import com.PrakTAM2_2457051016.model.Kuliah
import com.example.PrakTAM2_2457051016.model.KuliahSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM2_2457051016Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(
                            name = "ZamZawi Lutfi",
                            npm = "2457051016"
                        )

                        KuliahList(kuliahList = KuliahSource.dummyKuliah)
                    }
                }
            }
        }
    }
}

@Composable
fun KuliahList(kuliahList: List<Kuliah>) {
    LazyColumn {
        items(kuliahList) { kuliah ->
            KuliahCard(kuliah = kuliah)
        }
    }
}

@Composable
fun KuliahCard(kuliah: Kuliah) {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = kuliah.imageRes),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Nama: ${kuliah.nama}")
                Text(text = "Deskripsi: ${kuliah.deskripsi}")
                Text(text = "SKS: ${kuliah.harga}")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, npm: String) {
    Text(
        text = "Halo, Saya $name dengan npm $npm siap belajar Compose!",
        modifier = modifier.padding(16.dp)
    )
}