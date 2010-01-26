package com.jhlabs.map;

public class Point2D {

	public static class Double {
		public double x;
		public double y;

		public Double(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public Double() {
			this(0,0);
		}
		
		public Double(Long l){
			this.x = l.x;
			this.y = l.y;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Point2D.Double " + x + "," + y;
		}
	}

	public static class Long {
		public long x;
		public long y;

		public Long(long x, long y) {
			this.x = x;
			this.y = y;
		}

		public Long() {
			this(0,0);
		}
		
		public Long(Double d){
			this.x = Math.round(d.x);
			this.y = Math.round(d.y);
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Point2D.Long " + x + "," + y;
		}
	}
}
