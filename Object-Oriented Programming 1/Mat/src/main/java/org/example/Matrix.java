package org.example;

public class Matrix {
    private int n=100, m=100;
    private int[][] a = new int[this.n][this.m];
    private int[][] b = new int[this.n][this.m];
    private int[][] c = new int[this.n][this.m];
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
    }
    public void setValueA(int i, int j, int value){//добавить элемент в первую матрицу
        this.a[i][j] = value;
    }

    public void setValueB(int i, int j, int value){//добавить элемент в вторую матрицу
        this.b[i][j] = value;
    }

    public void Sum(){//сложение первой и второй матрицы
        for (int i = 0; i < this.n; i++ ){
            for (int j = 0; j < this.m; j++ ){
                this.c[i][j] = this.a[i][j] + this.b[i][j];
            }
        }
    }

    public void Ym(int g) {//умножение первой матрицы на число
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.c[i][j] = this.a[i][j]*g;
            }
        }
    }
    public void Ym() {//умножение первой матрицы на вторую
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                for (int k = 0; k < this.m; k++) {
                    this.c[i][j] += this.a[i][k]*this.b[k][j];
                }
            }
        }
    }

    public void print(){//вывод матрицы с после математических операций над матрицами а и б
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print(this.c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
