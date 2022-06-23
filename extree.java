package tress2;

import java.util.Stack;





public class extree {
	 enode root;

	 public extree() {
	 	root=null;
	 }
	 void create(String s) {
		 Stack<enode> stk=new Stack<enode>();
		 s=s+"&";
		
		 int i=0;
		 char c=s.charAt(i);
		 enode yeninod;
		 while(c!='&') {
			 if(c>='0' && c<='9') {
				 yeninod=new enode(c);
				 stk.push(yeninod);
				 
			 }
			 else if(c=='+' || c=='-' || c=='*' || c=='/' ) {
				 yeninod=new enode(c);
				 enode right=stk.pop();
				 enode left=stk.pop();
				yeninod.rightc=right;
				 yeninod.leftc=left;
				 stk.push(yeninod);
				 
			 }
			 c=s.charAt(i++);
		 }
		 root=stk.pop();
	 }
	 void preorder(enode root) {
			if(root!=null) {
			System.out.print(root.veri + " ");
			preorder(root.leftc);
			preorder(root.rightc);
			}
	 }
	 void inorder(enode root) {
			if(root!=null) {
			
			inorder(root.leftc);
			System.out.print(root.veri + " ");
			inorder(root.rightc);
			}
		}
	 void postorder(enode root) {
			if(root!=null) {
			
			postorder(root.leftc);
			
			postorder(root.rightc);
			System.out.print(root.veri + " ");
			}
		}
}
