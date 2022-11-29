package inhritance.parentchild;
//A
public class MyTime extends MyDate{
	int HRS,MINS,SECS;

	public int getHRS() {
		return HRS;
	}

	public void setHRS(int hRS) {
		HRS = hRS;
	}

	public int getMINS() {
		return MINS;
	}

	public void setMINS(int mINS) {
		MINS = mINS;
	}

	public int getSECS() {
		return SECS;
	}

	public void setSECS(int sECS) {
		SECS = sECS;
	}
	void display2(){
		System.out.println(HRS+":"+MINS+":"+SECS);
	}
	

}
