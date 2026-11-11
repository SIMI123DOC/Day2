# Binary Search Tree (BST)

- BST is a type of binary tree.
- Each node contains data, left child and right child.
- Left subtree contains values smaller than the root.
- Right subtree contains values greater than the root.
- Duplicate values are generally not allowed.
- Searching, insertion and deletion are the main operations.

## Tree Traversals

- Inorder:Left → Root → Right (gives sorted order).
- Preorder:Root → Left → Right (root is visited first).
- Postorder: Left → Right → Root (root is visited last).

## Time Complexity

- Average time complexity for search, insertion and deletion: O(log n).
- Worst-case time complexity: O(n) when the tree becomes skewed.