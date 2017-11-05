package offpay.fintech.com.offpay.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import offpay.fintech.com.offpay.R;
//import offpay.fintech.com.offpay.Fragments.wifidirect.WifiDirectActivity;
import offpay.fintech.com.offpay.Fragments.wifidirect.WiFiDirectActivity;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TransferFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TransferFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TransferFragment extends Fragment implements View.OnClickListener{
    public TransferFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TransferFragment.
     */
    // TODO: Rename and change types and number of parameters

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.main_fragment_page, container, false);
        ImageView transfer = (ImageView)view.findViewById(R.id.transfer_money);
        ImageView recieve = (ImageView)view.findViewById(R.id.recieve_money);
        recieve.setOnClickListener(this);
        transfer.setOnClickListener(this);

        /*String networkSSID = "test";
        String networkPass = "pass";

        WifiConfiguration conf = new WifiConfiguration();
        conf.SSID = "\"" + networkSSID + "\"";
        conf.wepKeys[0] = "\"" + networkPass + "\"";
        conf.wepTxKeyIndex = 0;
        conf.allowedKeyManagement.set(WifiConfiguration.KeyMgmt.NONE);
        conf.allowedGroupCiphers.set(WifiConfiguration.GroupCipher.WEP40);
        conf.preSharedKey = "\""+ networkPass +"\"";
        conf.allowedKeyManagement.set(WifiConfiguration.KeyMgmt.NONE);

        WifiManager wifiManager = (WifiManager)getContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.addNetwork(conf);

        List<WifiConfiguration> list = wifiManager.getConfiguredNetworks();
        for( WifiConfiguration i : list ) {
            if(i.SSID != null && i.SSID.equals("\"" + networkSSID + "\"")) {
                Log.i("Hello",networkSSID);
                wifiManager.disconnect();
                wifiManager.enableNetwork(i.networkId, true);
                wifiManager.reconnect();

                break;
            }
        }*/

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.transfer_money:
                /*try {
                    File root = new File(Environment.getExternalStorageDirectory()+ "/"
                            + getContext().getPackageName() , "Notes");
                    if (!root.exists()) {
                        root.mkdirs();
                    }
                    for(int i = 0;i<40;i++) {
                        File gpxfile = new File(root, "cert"+i+".txt");
                        FileWriter writer = new FileWriter(gpxfile);
                        writer.append("Hellomaga");
                        writer.flush();
                        writer.close();
                        Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                startActivity(new Intent(getActivity(),WiFiDirectActivity.class));
                break;

            case R.id.recieve_money:
                startActivity(new Intent(getActivity(), offpay.fintech.com.offpay.RecieveWifi.WiFiDirectActivity.class));
        }
    }
}
