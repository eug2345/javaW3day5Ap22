package com.qa.main.pizz;

public class Pizza {

	
	private String type;
	private int size;
	
	private boolean stufffedCrust;
	
		public Pizza(String type, int size, boolean stufffedCrust) {
			super();
			this.type = type;
			this.size = size;
			this.stufffedCrust = stufffedCrust;
	
	
			}

		public Pizza(String string, boolean b) {
			
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
			if(size >= 7 && size <= 15) {
				this.size = size;
			}else {
				System.out.println("this is not the right size, make it between 7 - 15!!!");
			}
		}

		public boolean isStufffedCrust() {
			return stufffedCrust;
		}

		public void setStufffedCrust(boolean stufffedCrust) {
			this.stufffedCrust = stufffedCrust;
		}	
	
	

}
