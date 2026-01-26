package Mamontov.App.Tree;

/**
 * Класс Mamontov.App.Tree.BinTree представляет бинарное дерево поиска.
 */
public class BinTree {

    /**
     * Внутренний класс Узел.
     */
    private static class Node {
        int value;
        Node parent;
        Node left;
        Node right;

        Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
        }
    }

    /** Корень дерева */
    private Node root;

    /**
     * Конструктор без аргументов.
     * Создаёт пустое дерево.
     */
    public BinTree() {
        root = null;
    }

    /**
     * Добавляет значение в дерево.
     *
     * @param value добавляемое значение
     */
    public void add(int value) {
        if (root == null) {
            root = new Node(value, null);
            return;
        }

        Node current = root;

        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Node(value, current);
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Node(value, current);
                    return;
                }
                current = current.right;
            }
        }
    }

    /**
     * Проверяет, содержится ли значение в дереве.
     *
     * @param value искомое значение
     * @return true, если найдено
     */
    public boolean contains(int value) {
        return findNode(value) != null;
    }

    /**
     * Удаляет значение из дерева.
     *
     * @param value значение для удаления
     */
    public void remove(int value) {
        Node node = findNode(value);
        if (node == null) {
            return;
        }

        // Случай 1: нет потомков
        if (node.left == null && node.right == null) {
            replaceNode(node, null);
        }
        // Случай 2: один потомок
        else if (node.left == null) {
            replaceNode(node, node.right);
        }
        else if (node.right == null) {
            replaceNode(node, node.left);
        }
        // Случай 3: два потомка
        else {
            Node successor = findMin(node.right);
            node.value = successor.value;
            replaceNode(successor, successor.right);
        }
    }

    /**
     * Возвращает строковое представление дерева
     * (значения в отсортированном порядке).
     *
     * @return строка значений
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        inorderTraversal(root, sb);
        return sb.toString().trim();
    }

    /* ===== ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ ===== */

    private Node findNode(int value) {
        Node current = root;
        while (current != null) {
            if (value == current.value) {
                return current;
            }
            current = value < current.value
                    ? current.left
                    : current.right;
        }
        return null;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private void replaceNode(Node node, Node newNode) {
        if (node.parent == null) {
            root = newNode;
        } else if (node == node.parent.left) {
            node.parent.left = newNode;
        } else {
            node.parent.right = newNode;
        }

        if (newNode != null) {
            newNode.parent = node.parent;
        }
    }

    private void inorderTraversal(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, sb);
        sb.append(node.value).append(" ");
        inorderTraversal(node.right, sb);
    }

    /**
     * Демонстрация работы бинарного дерева.
     */
    public static void demo() {
        BinTree tree = new BinTree();

        tree.add(3);
        tree.add(5);
        tree.add(4);
        tree.add(7);
        tree.add(1);
        tree.add(2);

        System.out.println("Дерево:");
        System.out.println(tree);
    }
}
