package offpay.fintech.com.offpay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import offpay.fintech.com.offpay.Fragments.ProfileFragment;
import offpay.fintech.com.offpay.Fragments.TransferFragment;

/**
 * Created by BhargavBV on 04-11-2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TransferFragment tab1 = new TransferFragment();
                return tab1;
            case 1:
                ProfileFragment tab2 = new ProfileFragment();
                return tab2;
            case 2:
                TransferFragment tab3 = new TransferFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}