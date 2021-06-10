package come.javaex.ex20;

public abstract class Shape {

	//filed
		protected String fillColor;
		protected String lineColor;

	//constructor
		public Shape() {
		//	System.out.println("Shape()");
		}
		
		public Shape(String fillColor, String lineColor) {
			super();
			this.fillColor = fillColor;
			this.lineColor = lineColor;
			//System.out.println("shape(2)");
		}
		
	//method -g/s
		public String getFillColor() {
			return fillColor;
		}

		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}

		public String getLineColor() {
			return lineColor;
		}

		public void setLineColor(String lineColor) {
			this.lineColor = lineColor;
		}


		@Override
		public String toString() {
			return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
		}
		
		
	//method-generic
		public void draw() {
			System.out.println("[면색 : " + fillColor + ", 선색 : " + lineColor + "] 을 그렸습니당");
		}
		
		public abstract double area();
}
