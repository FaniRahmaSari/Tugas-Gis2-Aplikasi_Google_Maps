package com.example.mymapsfani;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
// Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    /**
     *	Manipulates the map once available.
     *	This callback is triggered when the map is ready to be used.
     *	This is where we can add markers or lines, add listeners or move the camera. In this case,
     *	we just add a marker near Sydney, Australia.
     *	If Google Play services is not installed on the device, the user will be prompted to install
     *	it inside the SupportMapFragment. This method will only be triggered once the user has
     *	installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

// Add a marker in USM and move the camera
        LatLng usm = new LatLng(-6.982128, 110.452207);
        googleMap.addMarker(new MarkerOptions().position(usm).title("Saya berada di USM")); googleMap.moveCamera(CameraUpdateFactory.newLatLng(usm));

        // Add a marker in Masjid Agung Jawa Tengah and move the camera
        LatLng masjidagung = new LatLng(-6.984195, 110.445446);
        googleMap.addMarker(new MarkerOptions().position(masjidagung).title("Saya di Masjid Agung Jateng"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(masjidagung));

// Add a marker in Tugu Muda and move the camera
        LatLng tugumuda = new LatLng(-6.983792, 110.409490);
        googleMap.addMarker(new MarkerOptions().position(tugumuda).title("Tugu Muda Semarang")); googleMap.moveCamera(CameraUpdateFactory.newLatLng(tugumuda));
    }
}
