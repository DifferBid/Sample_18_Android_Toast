package develop.differ.bid;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityToast extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "LENGTH SHORT", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "LENGTH LONG", Toast.LENGTH_LONG).show();
    }

    private void customToast(String forText){

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.toast_container));

        // Заполните компоненты тоста
        ImageView image = layout.findViewById(R.id.toast_image);
        image.setImageResource(R.drawable.ic_fab_add);
        TextView text = layout.findViewById(R.id.toast_text);
        text.setText(forText);
        // Создайте и настройте тост
        Toast customToast = new Toast(getApplicationContext());
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.setView(layout);
        customToast.setGravity(Gravity.CENTER, 0, 0);
        customToast.show();

    }

}
