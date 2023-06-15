#include <queue>
#include <climits>

class Solution {
public:
    int maxLevelSum(TreeNode* root) {
        if (!root) {
            return 0; // Return 0 for an empty tree
        }

        int maxSum = INT_MIN;
        int maxLevel = 0;
        std::queue<TreeNode*> que;
        que.push(root);

        int level = 1;

        while (!que.empty()) {
            int size = que.size();
            int sum = 0; // Initialize sum for each level

            while (size--) {
                TreeNode* node = que.front();
                que.pop();
                sum += node->val;

                if (node->left) {
                    que.push(node->left);
                }
                if (node->right) {
                    que.push(node->right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }

            level++;
        }

        return maxLevel;
    }
};
