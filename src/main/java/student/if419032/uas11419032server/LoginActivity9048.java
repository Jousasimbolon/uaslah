

package student.if419032.uas11419032server;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import uts.nim11419048.uts11419048.R;

public class LoginActivity9048 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login9048);

        Button login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( LoginActivity9048.this ,student.if419032.uas11419032server.PendataanKeluargaActivity9048.class);
                startActivity(intent);
            }
        });

    }
}

// "Gagal beribu kali Lebih baik daripada menyerah meskipun hanya sekali"
// NIM : 11419048
// Nama : Gahasa Timothius B.P. Purba
// Alamat : Jln. Naboi Maju, No. 7, Komplek Bulu Nauli, Desa Sosor Gonting, Kec. Dolok Sanggul, Kab. Humbang Hasundutan, Sumatera Utara