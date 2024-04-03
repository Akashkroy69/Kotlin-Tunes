# Binary Search Tree
A binary search tree (BST) is a hierarchical data structure used for organizing and storing data in a sorted manner. It provides efficient insertion, deletion, and searching operations. Here's a comprehensive overview of binary search trees:

### 1. Definition:
- A binary search tree is a binary tree where each node has at most two children (left and right), and the key (or value) of nodes in the left subtree is less than the key of the root, and the key of nodes in the right subtree is greater than the key of the root.

### 2. Properties:
- **Binary Tree Structure:** Each node has at most two children: a left child and a right child.
- **Ordering Property:** For any node `n`, all nodes in its left subtree have keys less than `n`, and all nodes in its right subtree have keys greater than `n`.
- **Unique Keys:** No two nodes in the tree can have the same key (ensuring uniqueness).
- **Balancedness (Optional):** While not a strict requirement, balanced binary search trees (e.g., AVL trees, Red-Black trees) maintain a balanced structure to ensure efficient operations.

### 3. Operations:
- **Insertion:** To insert a new node into the BST while maintaining its ordering property.
- **Deletion:** To remove a node from the BST while maintaining its ordering property.
- **Searching:** To search for a given key in the BST efficiently.
- **Traversal:** Different methods to visit all nodes in the BST, such as in-order, pre-order, and post-order traversals.

### 4. Time Complexity:
- **Average Case:**
    - Insertion, deletion, and searching operations have an average time complexity of O(log n) in a balanced BST.
- **Worst Case:**
    - In an unbalanced BST, the time complexity can degrade to O(n) for insertion, deletion, and searching (similar to a linked list).

### 5. Implementation:
- **Node Structure:** Each node in the BST typically contains data (key) and references to its left and right children.
- **BST Class:** A class that encapsulates the operations and maintains the root node of the BST.
- **Recursive Approach:** Many BST operations are implemented using recursive algorithms, which leverage the self-similar structure of the tree.

### 6. Use Cases:
- Binary search trees are commonly used in databases, file systems, and compilers for efficient searching and indexing operations.
- They are also used in various algorithms and data structures, such as binary search, balanced binary trees (e.g., AVL trees, Red-Black trees), and priority queues.

### Example:
Here's a simple example of a binary search tree:

```
          10
         /  \
        5    15
       / \   / \
      3   7 12  18
```

In this example:
- The root node has the key 10.
- Nodes with keys less than 10 are in the left subtree.
- Nodes with keys greater than 10 are in the right subtree.

Binary search trees provide efficient searching, insertion, and deletion operations, making them a fundamental data structure in computer science with various practical applications.