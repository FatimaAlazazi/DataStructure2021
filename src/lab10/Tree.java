

package lab10;

/**
 * Created by fatima on 26/03/2021.
 */
public class Tree<E> {
    private Node<E> root = null;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    protected Node<E> createNode(E element, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<E>(element, parent, left, right);
    }
    protected Node<E> validateNode(Position<E>p) {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("not a valid argument");
        Node<E>node=(Node<E>)p;
        if (node.getParent()==node)
        throw new IllegalArgumentException("p is no longer in tree");
    return node;
}

    public Position<E>root()
    {
        return root;
    }
    public Position<E>parent(Position<E>p) {
        Node<E>node=validateNode(p);
        return node.getParent();
    }
    public Position<E> left(Position<E>p) {
        Node<E>node=validateNode(p);
        return node.getLeft();
    }
    public Position<E>right(Position<E>p) {
        Node<E>node=validateNode(p);
        return node.getRight();
    }
    public int numOfChildren(Position<E>p){
        int count=0;
        if (left(p)!=null)
            count++;
        if (right(p)!=null)
            count++;
        return count;
    }

    public Position<E> addRoot(E element) {
        if (!isEmpty())throw new IllegalStateException("Tree is not empty");
        root = createNode(element, null, null, null);
        size=1;
        return root;
    }
    public Position<E> addLeft(Position<E>p,E element) {
        Node<E>parent=validateNode(p);
        if(parent.getLeft()!=null)
        throw new IllegalArgumentException("p already has a left child");
        Node<E>child=createNode(element,parent,null,null);
        parent.setLeft(child);
        size++;
        return child;
}
    public Position<E>addRight(Position<E>p, E element) {
        Node<E>parent= validateNode(p);
        if ((parent.getRight()!= null))
        throw new IllegalArgumentException("p already has a right child");
        Node<E>child=createNode(element,parent,null,null);
        parent.setRight(child);
        size++;
        return child;
    }


    public E set(Position<E>p,E element) {
        Node<E>node=validateNode(p);
        E deleted= node.getElement();
        node.setElement(element);
        return deleted;
    }
    public  E remove(Position<E>p)
    {
        Node<E>node=validateNode(p);
        if(numOfChildren(p)==2)
            throw new IllegalArgumentException("p has tow childs");
        Node<E>child=(node.getLeft()!=null?node.getLeft():node.getRight());
       if (child!=null)
        child.setParent(node.getParent());
        if (node==root)
            root=child;
        else
        {
            Node<E>parent=node.getParent();
            if (node==parent.getLeft())
                parent.setLeft(child);
            else
                parent.setRight(child);
        }
        size--;
        E del=node.getElement();
        node.setElement(null);
        node.setParent(node);
        node.setLeft(null);
        node.setRight(null);
        return del;
    }
    public void printInOrder(Position<E> root)
    {
        Node<E> n=(Node<E>)root;
        if (n==null)
            return;
        printInOrder(n.left);
        System.out.println(n.element);
        printInOrder(n.right);
    }





    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        @Override
        public E getElement() {
            return element;
        }
    }
}
