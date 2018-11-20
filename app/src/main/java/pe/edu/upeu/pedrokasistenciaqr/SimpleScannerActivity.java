package pe.edu.upeu.pedrokasistenciaqr;


import android.app.Activity;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;



public class SimpleScannerActivity extends Activity implements ZBarScannerView.ResultHandler {
    private ZBarScannerView mScannerView;

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        mScannerView = new ZBarScannerView(this);    // Programmatically initialize the scanner view
        setContentView(mScannerView);                // Set the scanner view as the content view
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
//        // Do something with the result here
//        Log.v(TAG, rawResult.getContents()); // Prints scan results
//        Log.v(TAG, rawResult.getBarcodeFormat().getName()); // Prints the scan format (qrcode, pdf417 etc.)
        Toast.makeText(getApplicationContext(), rawResult.getContents(), Toast.LENGTH_LONG).show();
        // If you would like to resume scanning, call this method below:
        mScannerView.resumeCameraPreview(this);
    }
}