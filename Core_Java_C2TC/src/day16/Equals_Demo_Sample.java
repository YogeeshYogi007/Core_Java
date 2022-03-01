package day16;

public class Equals_Demo_Sample {
	private String objName= null;
	
		public Equals_Demo_Sample(String name) {
			this.objName=name;
		}
		
		public void setName(String name) {
			this.objName=name;
		}
			
		public String getName() {
			return this.objName;
		}
		
		@Override
	public boolean equals(Object obj) {
			if(obj instanceof Equals_Demo_Sample) {
				Equals_Demo_Sample equalsSample=(Equals_Demo_Sample) obj;
				if(equalsSample.getName().equals(this.getName())) {
					return true;
				}
			}
					return false;
					
				}
				
		}
