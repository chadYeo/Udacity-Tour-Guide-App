package android.example.com.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private CategoryAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate a ViewPager and a PagerAdapter
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        // Tab Layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_Layout);
        tabLayout.setupWithViewPager(mPager);

    }
}
