package _06_minion;

public class Minion {
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
	
		public Minion(String name, int eyes, String color, String master) {
			// TODO Auto-generated constructor stub
			this.master = master;
			this.eyes = eyes;
			this.name = name;
			this.color = color;
		}
		
		public String getMaster() {
			return master;
		}
		public void setMaster(String master) {
			this.master = master;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getEyes() {
			return eyes;
		}
		public void setEyes(int eyes) {
			this.eyes = eyes;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}






}

