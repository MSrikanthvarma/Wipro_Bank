import java.util.HashMap;
import java.util.Map;

public class MapKey {
	public static void main(String args[]) {
		abc key = new abc(1, 2, 3);
		valueClass value = new valueClass("5", "6");
		Map<abc, valueClass> map = new HashMap<>();
		map.put(key, value);
	}
}

class abc {
	int a;
	int b;
	int c;

	abc(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		abc other = (abc) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		return true;
	}
}

class valueClass {
	String k, v;

	valueClass(String k, String v) {
		this.k = k;
		this.v = v;
	}
}
