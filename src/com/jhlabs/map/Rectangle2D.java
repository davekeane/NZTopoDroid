package com.jhlabs.map;

public abstract class Rectangle2D {

	public static class Double extends Rectangle2D {

		private double xCoord = 0;
		private double yCoord = 0;
		private double height = 0;
		private double width = 0;

		public Double(double x, double y, double w, double h) {
			setRect(x, y, w, h);
		}

		@Override
		public double getWidth() {
			return width;
		}

		@Override
		public double getHeight() {
			return height;
		}

		@Override
		public double getX() {
			return xCoord;
		}

		@Override
		public double getY() {
			return yCoord;
		}

		@Override
		public void setRect(double x, double y, double w, double h) {
			xCoord = x;
			yCoord = y;
			height = h;
			width = w;
		}

	}


	public abstract double getX();

	public abstract double getY();
	
	public abstract double getWidth();

	public abstract double getHeight();
	
	public double getMinX() {
		return getX();
	}

	public double getMinY() {
		return getY();
	}

	public double getMaxX() {
		return getX() + getWidth();
	}

	public double getMaxY() {
		return getY() + getHeight();
	}
	
	public abstract void setRect(double x, double y, double w, double h);

	public void add(double x, double y) {
		double minX = Math.min(getMinX(), x);
		double maxX = Math.max(getMaxX(), x);
		double minY = Math.min(getMinX(), y);
		double maxY = Math.max(getMaxX(), y);
		setRect(minX, minY, maxX-minX, maxY-minY);
	}

}
