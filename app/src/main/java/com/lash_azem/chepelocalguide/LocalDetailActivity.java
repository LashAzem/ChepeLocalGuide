package com.lash_azem.chepelocalguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lash_azem.chepelocalguide.dummy.DummyContent;

/**
 * An activity representing a single Local detail screen. This
 * activity is only used narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link LocalListActivity}.
 */
public class LocalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);


        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(LocalDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(LocalDetailFragment.ARG_ITEM_ID));
            LocalDetailFragment fragment = new LocalDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.local_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            navigateUpTo(new Intent(this, LocalListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
