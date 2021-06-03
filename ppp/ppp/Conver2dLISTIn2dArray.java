package ppp;

import java.util.List;

public class CondArray {
	public static Integer[][] toArray(List<List<Integer>> list) {
	    Integer[][] r = new Integer[list.size()][];
	    int i = 0;
	    for (List<Integer> next : list) {
	       r[i++] = next.toArray(new Integer[next.size()]);
	    }
	    return r;
}
