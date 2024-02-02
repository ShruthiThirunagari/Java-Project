package functionalinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverser {
            public static List reverseArrayList(List list) {
            List reversedList = new ArrayList(list);
            Collections.reverse(reversedList);
            return reversedList;
        }
}

