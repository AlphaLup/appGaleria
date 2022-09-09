package amancio.breno.galeria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define a toolbar para ser a actionbar padrão
        Toolbar toolbar_main = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Cria as opções de menudefinidas no arquivo de menu setado
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_tb, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // pega o id de um item e vai conferir se é igual ao da camera ou não
        switch (item.getItemId()) {
            case R.id.opCamera:
                //caso seja, chamará o método definido
                dispatchTakePictureIntent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}