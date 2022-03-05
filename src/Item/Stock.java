package Item;

public class Stock {		// 빨대 홀더 포크
	String Name;
	static int Straw = 10;
	static int CupAndHolder = 10;
	static int Fork = 10;
	
	void DrinkUsed() {
		Straw -= 1;
		CupAndHolder -=1;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static int getStraw() {
		return Straw;
	}

	public static void setStraw(int straw) {
		Straw = straw;
	}

	public static int getCupAndHolder() {
		return CupAndHolder;
	}

	public static void setCupAndHolder(int cupAndHolder) {
		CupAndHolder = cupAndHolder;
	}

	public static int getFork() {
		return Fork;
	}

	public static void setFork(int fork) {
		Fork = fork;
	}

	void EatUsed() {
		Fork -= 1;
	}

}