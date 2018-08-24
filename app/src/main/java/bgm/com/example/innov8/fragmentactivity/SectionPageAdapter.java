package bgm.com.example.innov8.fragmentactivity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragments = new ArrayList<>();
    private final List<String> mfragmentsTitlelist = new ArrayList<>();


    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragments(Fragment fragment, String s) {

        mfragments.add(fragment);
        mfragmentsTitlelist.add(s);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragments.get(position);
    }

    @Override
    public int getCount() {
        return mfragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentsTitlelist.get(position);
    }
}
