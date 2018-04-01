class SumInLeavesVisitor extends TreeVis {
	private int leavesSum = 0;

	@Override
	public int getResult() {
		// implement this
		return leavesSum;
	}

	@Override
	public void visitNode(TreeNode node) {
		// implement this
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// implement this
		leavesSum += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
    private int redProduct = 1;
    
    public int getResult() {
      	//implement this
        return redProduct;
    }

    public void visitNode(TreeNode node) {
      	//implement this 
        if (node.getColor() == Color.RED) {
			multiplyValue(node.getValue());
		}
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        if (leaf.getColor() == Color.RED) {
			multiplyValue(leaf.getValue());
		}
    }
    
    private void multiplyValue(int value) {
		if (value == 0) {
			return;
		}
		redProduct = (int) ((long) redProduct * value % 1000000007);
	}
}

class FancyVisitor extends TreeVis {
    private int evenSum = 0;
	private int greenSum = 0;
    
    public int getResult() {
      	//implement this
        return Math.abs(evenSum - greenSum);
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if (node.getDepth() % 2 == 0) {
			evenSum += node.getValue();
		}
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if (leaf.getColor() == Color.GREEN) {
			greenSum += leaf.getValue();
		}
    }
}

public class Solution {
  
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] values = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			values[i] = sc.nextInt();
		}
      
        Color[] colors = new Color[n + 1];
		for (int i = 1; i <= n; i++) {
			colors[i] = (sc.nextInt() == 0) ? Color.RED : Color.GREEN;
		}
        
        List<Integer>[] adjacentsList = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			adjacentsList[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			adjacentsList[u].add(v);
			adjacentsList[v].add(u);
		}
		sc.close();
        
        		List<Integer>[] childrenList = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			childrenList[i] = new ArrayList<Integer>();
		}

		int[] depths = new int[n + 1];
		boolean[] visited = new boolean[n + 1];

		Queue<Integer> queue = new LinkedList<Integer>();
		depths[1] = 0;
		queue.offer(1);
		while (!queue.isEmpty()) {
			int head = queue.poll();

			if (visited[head]) {
				continue;
			}
			visited[head] = true;

			for (int adjacent : adjacentsList[head]) {
				if (!visited[adjacent]) {
					childrenList[head].add(adjacent);
					depths[adjacent] = depths[head] + 1;
					queue.offer(adjacent);
				}
			}
		}
        
        Tree[] nodes = new Tree[n + 1];
		for (int i = 1; i <= n; i++) {
			if (childrenList[i].isEmpty()) {
				nodes[i] = new TreeLeaf(values[i], colors[i], depths[i]);
			} else {
				nodes[i] = new TreeNode(values[i], colors[i], depths[i]);
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int child : childrenList[i]) {
				((TreeNode) nodes[i]).addChild(nodes[child]);
			}
		}

		return nodes[1];
	}   
}