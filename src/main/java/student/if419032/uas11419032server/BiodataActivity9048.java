
package student.if419032.uas11419032server;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import uts.nim11419048.uts11419048.R;

public class BiodataActivity9048 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata9048);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menu_option, menu );
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.pendataan_keluarga: {
                Intent intent = new Intent( BiodataActivity9048.this , PendataanKeluargaActivity9048.class);
                startActivity(intent);
                break;
            }
            case R.id.about_developer: {
                Intent intent = new Intent( BiodataActivity9048.this , BiodataActivity9048.class);
                startActivity(intent);
                break;
            }
            case R.id.button_logout: {
                Intent intent = new Intent( BiodataActivity9048.this , LoginActivity9048.class);
                startActivity(intent);
                break;
            }
        }
        return super.onOptionsItemSelected ( item );
    }
}

// "Jangan Pernah Mengatakan aku menyerah"
// NIM : 11419032
// Nama : Josua Simbolon
