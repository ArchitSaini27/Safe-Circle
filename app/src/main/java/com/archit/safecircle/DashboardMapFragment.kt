package com.archit.safecircle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.archit.safecircle.BuildConfig.CREDENTIALS_KEY
import com.microsoft.maps.MapRenderMode
import com.microsoft.maps.MapView


class DashboardMapFragment : Fragment() {

    private var mMapView: MapView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dashboard_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mMapView = MapView(activity, MapRenderMode.VECTOR);  // or use MapRenderMode.RASTER for 2D map
        mMapView?.setCredentialsKey(CREDENTIALS_KEY);
        requireView().findViewById<FrameLayout>(R.id.map_view).addView(mMapView);
        mMapView?.onCreate(savedInstanceState);
    }

    companion object {

        @JvmStatic
        fun newInstance() =DashboardMapFragment()

    }
}