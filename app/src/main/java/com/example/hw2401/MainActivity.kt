package com.example.hw2401

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw2401.ui.theme.HW2401Theme
import timber.log.Timber
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import android.content.Intent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.d("MainActivity успішно запущена!")
        Timber.d("MainActivity: onCreate()")

        enableEdgeToEdge()

        setContent {
            HW2401Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        Greeting(
                            name = "Android"
                        )

                        Button(
                            onClick = {
                                Timber.d("ауч")
                                (application as MyApplication).startCount ++
                                Timber.d((application as MyApplication).startCount.toString())
                            }
                        ) {
                            Text("Натисни мене")
                        }

                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                                startActivity(intent)
                            }
                        ) {
                            Text("Перейти на SecondActivity")
                        }
                    }
                }
            }
        }
    }
    //onStart()
    //onResume()
    //onPause()
    //onStop()
    //onDestroy()

    //turning orientation onPause onStop onDestroy onCreate onStart onResume

    override fun onStart() {
        super.onStart()
        Timber.d("MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("MainActivity: onDestroy")
    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HW2401Theme {
        Greeting("Android")
    }
}
