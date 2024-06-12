package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class HighestTreeValues {
    public static List<Integer> getTreeHighestValues(Tree tree) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        solveTree(tree.rootNode, 0, list);

        return list;
    }

    private static void solveTree(final Tree.Node node, final int nodeLevel, final ArrayList<Integer> list) {
        if (node == null) return;

        if (nodeLevel == list.size()) {
            list.add(node.getValue());
        } else {
            list.set(nodeLevel, Math.max(list.get(nodeLevel), node.getValue()));
        }

        solveTree(node.leftNode, nodeLevel + 1, list);
        solveTree(node.rightNode, nodeLevel + 1, list);
    }
}
