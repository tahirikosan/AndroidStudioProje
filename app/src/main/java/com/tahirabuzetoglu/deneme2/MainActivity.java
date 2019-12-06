package com.tahirabuzetoglu.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*** Beni Oku ***/
    /** Kullanıcı arayüzüne açmak için  res->layout kısmını açınız **/

    //Layout kısmındaki yapılarımızla işlem yapabilmek için onlar için değişken tanımlıyoruz.
    TextView tv_deneme;
    EditText et_deneme;
    Button btn_deneme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Layout kısmındaki yapılarımızda değişiklik yapabilmek için onları değişkenlerimize bağlıyoruz.
        tv_deneme = findViewById(R.id.tv_deneme);
        et_deneme = findViewById(R.id.et_deneme);
        btn_deneme = findViewById(R.id.btn_deneme);


        //btn_deneme'ye bastığımızda alttaki yapı devreye girecek.
        btn_deneme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //*************** 'btn_deneme'ye basıldığında bu part çalışacak *************** \\

                //et_deneme'den gelecek yazıları gidecekMesaj'a atıyoruz.
                String gidecekMesaj = et_deneme.getText().toString();

                //Page2'ye geçmek için bir Intent yapıyıyoruz ve içine 'gidecekMesaj'ı ekliyoruz.
                Intent amac = new Intent(MainActivity.this, Page2.class);
                amac.putExtra("DENEME", gidecekMesaj);
                startActivity(amac);
            }
        });



    }
}
