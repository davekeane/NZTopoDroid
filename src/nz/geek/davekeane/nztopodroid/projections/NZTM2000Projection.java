package nz.geek.davekeane.nztopodroid.projections;

import com.jhlabs.map.proj.Ellipsoid;
import com.jhlabs.map.proj.TransverseMercatorProjection;

public class NZTM2000Projection extends TransverseMercatorProjection {

	private static final Ellipsoid ELLIPSOID = Ellipsoid.GRS_1980;
	private static final Double ORIGIN_LONG = Math.toRadians(173);
	private static final Double ORIGIN_LAT = Math.toRadians(0);
	private static final Double SCALE_FACTOR = 0.9996;
	private static final Double FALSE_EASTING = 1600000.0D;
	private static final Double FALSE_NORTHING = 10000000.0D;

	public NZTM2000Projection() {
		super(NZTM2000Projection.ELLIPSOID, NZTM2000Projection.ORIGIN_LONG,
				NZTM2000Projection.ORIGIN_LAT, NZTM2000Projection.SCALE_FACTOR,
				NZTM2000Projection.FALSE_EASTING,
				NZTM2000Projection.FALSE_NORTHING);
	}
}
