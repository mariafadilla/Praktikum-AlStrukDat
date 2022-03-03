//Praktikum ASD JS 2 Tugas No.2

import java.util.Scanner;
class Pacman {
    int x, y, width, height;

    void moveLeft(int a) {
        x -= 1;
    }

    void moveRight(int a) {
        x += 1;
    }

    void moveUp(int a) {
        y += 1;
    }

    void moveDown(int a) {
        y -= 1;
    }

    void printPosition(int a, int b) {
        System.out.println("\nPacman pada posisi (x,y) = " + x + "," + y);
    }
}

public class PacmanMain {
    public static void main(String[] args) {
        Pacman p = new Pacman();
        Scanner sc = new Scanner(System.in);
        p.x = 0;
        p.y = 0;

        System.out.print("Masukkan batas x = ");
        p.width = sc.nextInt();
        System.out.print("Masukkan batas y = ");
        p.height = sc.nextInt();

        for (;;) {
            System.out.print(
                    "\nPilih action : \n1.Move Left\n2.Move Right\n3.Move Up\n4.Move Down\n5.Exit\nJawaban anda = ");
            int input = sc.nextInt();
            if (p.x == 0 && input == 1) {
                System.out.println("\nPacman kurang atau melebihi batas");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == 0 && input == 4) {
                System.out.println("\nPacman kurang atau melebihi batas");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.x == p.width && input == 2) {
                System.out.println("\nPacman kurang atau melebihi batas");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == p.height && input == 3) {
                System.out.println("\nPacman kurang atau melebihi batas");
                p.printPosition(p.x, p.y);
                continue;
            }

            if (input == 1) {
                p.moveLeft(p.x);
                p.printPosition(p.x, p.y);
            } else if (input == 2) {
                p.moveRight(p.x);
                p.printPosition(p.x, p.y);
            } else if (input == 3) {
                p.moveUp(p.y);
                p.printPosition(p.x, p.y);
            } else if (input == 4) {
                p.moveDown(p.y);
                p.printPosition(p.x, p.y);
            } else {
                System.out.println("\nTERIMA KASIH\n");
                break;
            }

        }

    }
}