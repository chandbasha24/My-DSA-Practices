
public class BinaryTree {
    private TreeNode root;
    private  class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
         this.data=data;
        }
    }

    public void createBinaryTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth =new TreeNode(5);
        TreeNode sixth=new TreeNode(6);
        TreeNode seventh=new TreeNode(7);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // public void Preorder(){
    //     if(root==null){
    //         return;
    //     }
    //     Stack <TreeNode> stack = new Stack<>();
    //     stack.push(root); 
    //     while(!stack.isEmpty()){
    //         TreeNode temp= stack.pop();
    //         System.out.print(temp.data+" ");
    //         if(temp.right!=null){
    //             stack.push(temp.right);
    //         }
    //         if(temp.left!=null){
    //             stack.push(temp.left);
    //         }
    //     }
    // }

   
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");  //method call, line, root

    }
    // public void levelOrder(){
    //     if(root==null){
    //         return;
    //     }
    //     Queue <TreeNode> queue=new LinkedList<>();
        
    //     queue.offer(root);
    //     while(!queue.isEmpty()){
    //         TreeNode temp=queue.poll();
    //         System.out.print(temp.data+" ");
    //         if(temp.left!=null){
    //             queue.offer(temp.left);
    //         }
    //         if(temp.right!=null){
    //             queue.offer(temp.right);
    //         }
    //     }
    // }
    public int MaxValue(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=MaxValue(root.left);
        int right=MaxValue(root.right);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }return result;
    }

    public static void main (String args[]){
    BinaryTree bt=new BinaryTree();
    bt.createBinaryTree();
    bt.preorder(bt.root);
    // bt.Preorder();
    System.out.println();
    bt.inOrder(bt.root);
    System.out.println();
    bt.postOrder(bt.root);
    System.out.println();
    // bt.levelOrder();
    int MaxValue=bt.MaxValue(bt.root);
    System.out.println("max value "+ MaxValue);
   

    }
}