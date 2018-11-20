package pe.edu.upeu.pedrokasistenciaqr;


/*import android.content.Context;
import android.net.Uri;*/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class QrFragment extends Fragment {

    private Button btnCaptureCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        View myFragmenView=inflater.inflate(R.layout.fragment_qr, container, false);

        btnCaptureCode =(Button) myFragmenView.findViewById(R.id.btnCaptureCode);
        //btnCaptureCode.setOnClickListener(this);

        btnCaptureCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SimpleScannerActivity.class);
                startActivity(intent);
            }
        });
        return myFragmenView;
    }



    }

