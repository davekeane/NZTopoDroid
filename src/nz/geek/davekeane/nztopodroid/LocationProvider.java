package nz.geek.davekeane.nztopodroid;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.location.LocationManager;

public class LocationProvider {
	
	private Context appContext;
	private LocationManager locationManager;
	
	private LocationProvider(){
		
	}
	
	private LocationProvider(Context c) {
		appContext = c;
		locationManager = (LocationManager) c.getSystemService(Context.LOCATION_SERVICE);
	}



	private static Map<Context,LocationProvider> instances = new HashMap<Context, LocationProvider>();
	
	public static LocationProvider getInstance(Context c){
		if (instances.get(c) == null){
			instances.put(c, new LocationProvider(c));
		}
		return instances.get(c);
	}
}
