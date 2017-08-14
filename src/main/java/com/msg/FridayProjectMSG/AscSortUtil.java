package com.msg.FridayProjectMSG;

import java.util.Collections;
import java.util.List;

public interface AscSortUtil extends SortUtil {

	@Override
	default void sortMethodUsingInterface(List<Produs> productlist) {

		Collections.sort(productlist, (s1, s2) -> Double.compare(s2.getPretFaraTVA(), s1.getPretFaraTVA()));
	}
}
