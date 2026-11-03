package com.day3.task_3;

public class TowerOfHanoi {
    private int moveCount = 0;

    /**
     * Solves the Tower of Hanoi for 'n' disks moving from source to target.
     *
     * @param n Number of disks to move
     * @param source The origin peg (e.g., 'A')
     * @param target The destination peg (e.g., 'C')
     * @param auxiliary The temporary buffer peg (e.g., 'B')
     */
    public void solve(int n, char source, char target, char auxiliary) {
        // 1. Base Case: if n == 1:
        if (n == 1) {
            moveCount++;
            System.out.println("Step " + moveCount + ": Move disk 1 from Rod " + source + " -> Rod " + target);
            return;
        }

        // 2. Recursive Step 1: Move top n-1 disks from source to auxiliary using target
        solve(n - 1, source, auxiliary, target);

        // 3. Move the nth disk:
        moveCount++;
        System.out.println("Step " + moveCount + ": Move disk " + n + " from Rod " + source + " -> Rod " + target);

        // 4. Recursive Step 2: Move n-1 disks from auxiliary to target using source
        solve(n - 1, auxiliary, target, source);
    }

    public int getMoveCount() {
        return moveCount;
    }
}
