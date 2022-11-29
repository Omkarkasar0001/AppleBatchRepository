package inhritance.parentchild;
//A
public class MyDate {
int DD,MM,YY;

public int getDD() {
	return DD;
}

public void setDD(int dD) {
	DD = dD;
}

public int getMM() {
	return MM;
}

public void setMM(int mM) {
	MM = mM;
}

public int getYY() {
	return YY;
}

public void setYY(int yY) {
	YY = yY;
}
void display1(){
		System.out.println(DD+"/"+MM+"/"+YY);
	}

}
