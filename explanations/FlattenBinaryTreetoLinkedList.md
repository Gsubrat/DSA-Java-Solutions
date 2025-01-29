# Flatten Binary Tree to Linked List

## Problem Statement
Given the root of a binary tree, flatten the tree into a "linked list" in place. The "linked list" should use the same `TreeNode` class, where the `right` child pointer points to the next node in the list and the `left` child pointer is always `null`. The nodes should appear in the same order as a **pre-order traversal** of the binary tree.

## Approach
The problem can be solved using a **pre-order traversal** of the binary tree. The steps are as follows:

1. **Pre-order Traversal**:
    - Traverse the tree in pre-order (root, left, right).
    - Store the nodes in a queue during the traversal.

2. **Flatten the Tree**:
    - After the traversal, the queue contains the nodes in the correct order.
    - Iterate through the queue and rearrange the tree nodes to form a right-skewed linked list:
        - Set the `right` child of each node to the next node in the queue.
        - Set the `left` child of each node to `null`.

### Why It Works
The pre-order traversal ensures that the nodes are processed in the correct order (root first, then left subtree, then right subtree). By storing the nodes in a queue and then reassigning the `right` pointers, we can flatten the tree into a linked list in place.

## Key Steps in the Implementation
1. **Queue Initialization**:
    - A global queue is used to store the nodes during the pre-order traversal.

2. **Pre-order Traversal**:
    - A helper function recursively traverses the tree in pre-order and adds each node to the queue.

3. **Flattening the Tree**:
    - The `flatten` method processes the queue:
        - For each node, set its `right` child to the next node in the queue.
        - Set its `left` child to `null`.

4. **Testing the Code**:
    - A sample binary tree is created for testing.
    - After flattening, the tree is printed as a right-skewed linked list.




## Time and Space Complexity
- **Time Complexity**: `O(n)` - Each node is visited once during the pre-order traversal and once during the flattening process.
- **Space Complexity**: `O(n)` - The queue stores all `n` nodes of the tree.

## Conclusion
This approach efficiently flattens a binary tree into a linked list using a pre-order traversal and a queue. The algorithm ensures that the tree is modified in place, and the resulting linked list maintains the correct order of nodes.