package tress2;

public class expana {

	public static void main(String[] args) {
		extree tre=new extree();
		tre.create("23*84/+");
		tre.preorder(tre.root);
		System.out.println();
		tre.inorder(tre.root);
		System.out.println();
		tre.postorder(tre.root);
	}

}
