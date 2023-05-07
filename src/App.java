public class App {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        printNode(treeBuild(array), " ");
    }

    static void printNode(Node node, String sp) {
        if (node != null) {
            System.out.println(sp + node.value);
            printNode(node.right, sp + "R ");
            printNode(node.left, sp + "L ");
        }
    }

    static Node treeBuild(int... array) {
        return _treeBuild(array, 0, array.length - 1);
    }

    private static Node _treeBuild(int[] array, int indexStart, int indexEnd) {
        Node node = null;
        if (indexEnd < indexStart) {
            return null;
        }
        int mid = (indexStart + indexEnd) / 2;
        node = new Node(array[mid]);

        node.left = _treeBuild(array, indexStart, mid - 1);
        node.right = _treeBuild(array, mid + 1, indexEnd);

        return node;
    }
}