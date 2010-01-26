package nz.geek.davekeane.nztopodroid;

import nz.geek.davekeane.nztopodroid.projections.NZTM2000Projection;

import com.jhlabs.map.Point2D;
import com.jhlabs.map.proj.Projection;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CoordView extends Activity {

	private Point2D.Double latLongLocation = new Point2D.Double();
	private Point2D.Long nztm2000Location = new Point2D.Long();
	private Projection nztm2000;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        nztm2000 = new NZTM2000Projection();
        Point2D.Double testPoint = new Point2D.Double(172.03277,-41.82246);
        updateSourceLocation(testPoint);
        populateFields();
    }
    
    private void populateFields(){
    	TextView sc = (TextView) findViewById(R.id.sourcecoords);
    	sc.setText(latLongLocation.x + ", " + latLongLocation.y);
    	TextView oc = (TextView) findViewById(R.id.outcoords);
    	oc.setText(nztm2000Location.x + ", " + nztm2000Location.y);
    }
    
    private void updateSourceLocation(Point2D.Double coords){
    	this.latLongLocation.x = coords.x;
    	this.latLongLocation.y = coords.y;
    	recalculate();
    }

	private void recalculate() {
		nztm2000Location = new Point2D.Long(nztm2000.transform(latLongLocation, new Point2D.Double()));
	}
}