package structural_patterns.flyweight.tree_example.fixed;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    // The Factory! We introduce a caching layer (HashMap) to intercept "new" calls.
    // This physically prevents the client from creating duplicate heavy objects.

    private static final Map<String, ITree> treeStorage = new HashMap<>(); //acts like a RAM / cache

    public static ITree getTree(String type) {
        //It'll get tree from treeStorage by "type" String

        //key line:
        ITree pineTree = treeStorage.get(type); // If it exists, get me that tree

        if (pineTree == null) {
            byte[] heavyDataTexture = new byte[1000000];
            pineTree = new PineTree(heavyDataTexture);
            treeStorage.put("Pine tree", pineTree);
        }

        return pineTree;
    }

}
