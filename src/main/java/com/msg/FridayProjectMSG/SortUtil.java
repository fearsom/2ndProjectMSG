package com.msg.FridayProjectMSG;

import java.util.Collections;
import java.util.List;

public interface SortUtil {

	default void sortMethodUsingInterface(List<Produs> productlist) {

		Collections.sort(productlist, (s1, s2) -> Double.compare(s1.getPretFaraTVA(), s2.getPretFaraTVA()));
	}
}
