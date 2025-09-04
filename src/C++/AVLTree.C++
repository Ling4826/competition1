#include <iostream>
#include <vector>
#include <fstream>
#include <string>

using namespace std;    
struct Node {

    int key;
    Node* left;
    Node* right;
    int height;



    Node() {                // 👈 default constructor

        key = 0;

        left = nullptr;

        right = nullptr;

        height = 1;

    }



    Node(int k) {           // 👈 constructor ที่รับค่า

        key = k;

        left = nullptr;

        right = nullptr;

        height = 1;

    }

};
    int height(Node* N)

{

    if (N == NULL)

    {

        return 0;

    }

    return N->height;  

}
    int max(int a , int b)

    {

      return (a > b) ? a:b;

    }
    Node* rightRotate(Node* y) {

    // y is the root of the subtree to be rotated

    Node* x = y->left;

    Node* T2 = x->right;



    // Perform rotation

    x->right = y;

    y->left = T2;



    // Update heights

    y->height = max(height(y->left), height(y->right)) + 1;

    x->height = max(height(x->left), height(x->right)) + 1;



    // Return the new root

    return x;

}
    Node* leftRotate(Node* x) {

    // x is the root of the subtree to be rotated

    Node* y = x->right; // Should be the right child

    Node* T2 = y->left;



    // Perform rotation

    y->left = x;

    x->right = T2;



    // Update heights (order matters: update children first)

    x->height = max(height(x->left), height(x->right)) + 1;

    y->height = max(height(y->left), height(y->right)) + 1;



    // Return the new root

    return y;

}
    int getBalance(Node* N) {

        if (N == NULL)

            return 0;

        return height(N->left) - height(N->right);

    }
    Node* insert(Node* node, int key) {
        if (node == NULL)
            return (new Node(key));
        if (key < node->key)
            node->left = insert(node->left, key);
        else if (key > node->key)
            node->right = insert(node->right, key);
        else 
            return node;
        node->height = 1 + max(height(node->left), height(node->right));
        int balance = getBalance(node);
        if (balance > 1 && key < node->left->key)
            return rightRotate(node);
        if (balance < -1 && key > node->right->key)
            return leftRotate(node);
        if (balance > 1 && key > node->left->key) {
            node->left = leftRotate(node->left);
            return rightRotate(node);
        }
        if (balance < -1 && key < node->right->key) {
            node->right = rightRotate(node->right);
            return leftRotate(node);
        }
        return node;
    }
    void preOrder(Node* node) {

    if (node != NULL) {

        // 1. Visit the Root node (print its key)

        cout << node->key << " ";

       

        // 2. Traverse the left subtree

        preOrder(node->left);

       

        // 3. Traverse the right subtree

        preOrder(node->right);

    }

}

int main() {
    Node* root = nullptr;
    // Constructing tree given in the above figure
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 30);
    root = insert(root, 40);
    root = insert(root, 50);
    root = insert(root, 25);
    /* The constructed AVL Tree would be
              30
            /   \
          20     40
         /  \      \
       10   25     50
    */
    // Preorder traversal
    preOrder(root);
    return 0;
}