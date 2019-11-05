package com.example.vikas.runtimepermissionsghostel2;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AbstractRunTimepermission {

    private static final int REQEST_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestAppPermissions(new String[]{Manifest.permission.READ_CONTACTS,
                Manifest.permission.WRITE_EXTERNAL_STORAGE}, R.string.permissionMessage, REQEST_PERMISSION);
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        Toast.makeText(this, "all permissions granted", Toast.LENGTH_SHORT).show();
    }
}
