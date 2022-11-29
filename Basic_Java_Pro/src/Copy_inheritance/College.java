package Copy_inheritance;

	public class College {

		private int code;
		private String name,adress;
		
		Department dept;
		Library lb;
		
		
		public int getCode() {
			return code;
		}


		public void setCode(int code) {
			this.code = code;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAdress() {
			return adress;
		}


		public void setAdress(String adress) {
			this.adress = adress;
		}


		public Department getDept() {
			return dept;
		}


		public void setDept(Department dept) {
			this.dept = dept;
		}


		public Library getLb() {
			return lb;
		}


		public void setLb(Library lb) {
			this.lb = lb;
		}
		public String toString()
		{
			return code+" "+name+" "+adress;
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

}
