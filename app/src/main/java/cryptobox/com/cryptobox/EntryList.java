package cryptobox.com.cryptobox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_entry_list)
public class EntryList extends RoboActivity {
    @InjectView(R.id.list_view_entries)
    ListView listViewEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = new String[]{"hello", "world", "my","name", "is", "!!!"};
        System.out.println("IM HERE");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.entry_list_item, R.id.label, list);

        listViewEntries.setAdapter(adapter);
    }
}
