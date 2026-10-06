public static boolean contem(int[] v, int tam, int x) {
    for (int i = 0; i < tam; i+=1)
        if (v[i] == x)
            return true;
    return false;
}

public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
    int tam = 0;
    for (int i = 0; i < tamV; i+=1) {
        if (!contem(vsr, tam, v[i])) {
            vsr[tam] = v[i];
            tam+=1;
        }
    }
    return tam;
}

public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
    int tamU = gerarVetorSemRepeticao(a, tamA, u);
    for (int i = 0; i < tamB; i+=1) {
        if (!contem(u, tamU, b[i])) { 
            u[tamU] = b[i];
            tamU+=1;
        }
    }
    return tamU;
}

public static void ordenar(int[] v, int n) {
    int chave, j;
    for (int i = 1; i <= n -1; i+=1) {
        chave = v[i];
        j = i - 1;
        while (j >= 0 && chave < v[j]) {
            v[j + 1] = v[j];
            j-=1;
        }
        v[j + 1] = chave;
    }
}

public static void inverter(int[] v, int inicio, int fim) {
    while (inicio < fim) {
        int aux = v[inicio];
        v[inic] = v[fim];
        v[fim] = aux;
        inicio+=1;
        fim-=1;
    }
}

public static void rotacionar(int[] v, int tam, int k) {
    if (tam <= 1) return;
    k = k % tam;
    if (k < 0) k = k + tam;
    if (k == 0) return;
    inverter(v, 0, k - 1);
    inverter(v, k, tam - 1);
    inverter(v, 0, tam - 1);
}