package camp.bso.inf.project1bsocamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;

public class ListPertandingan extends AppCompatActivity {
    private final LinkedList<String> mWordList1 = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();
    private int mCount = 0;
    String timkita[] = {"Persib", "Persib", "Persib"};
    String timlawan[] = {"PSM", "Persija", "Persipura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_team);
        for (int i = 0; i < 3; i++) {
            mWordList1.addLast(timkita[i]);
            mWordList2.addLast(timlawan[i]);
            Log.d("WordList", mWordList1.getLast());
        }

// Get a handle to the RecyclerView.
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        WordListAdapter mAdapter = new WordListAdapter(this, mWordList1, mWordList2);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

