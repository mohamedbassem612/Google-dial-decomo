package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dty {
    int[] a = new int[10];
    int[] b = new int[10];
    int c = 0;
    int[] d = new int[10];
    float[] e = new float[10];
    int f = 0;
    int[] g = new int[5];
    java.lang.String[] h = new java.lang.String[5];
    int i = 0;
    int[] j = new int[4];
    boolean[] k = new boolean[4];
    int l = 0;

    final void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i2 >= length) {
            this.d = java.util.Arrays.copyOf(iArr, length << 1);
            float[] fArr = this.e;
            this.e = java.util.Arrays.copyOf(fArr, fArr.length << 1);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i3 >= length) {
            this.a = java.util.Arrays.copyOf(iArr, length << 1);
            int[] iArr2 = this.b;
            this.b = java.util.Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    final void c(int i, java.lang.String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        int length = iArr.length;
        if (i2 >= length) {
            this.g = java.util.Arrays.copyOf(iArr, length << 1);
            java.lang.String[] strArr = this.h;
            this.h = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length << 1);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        java.lang.String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        int length = iArr.length;
        if (i2 >= length) {
            this.j = java.util.Arrays.copyOf(iArr, length << 1);
            boolean[] zArr = this.k;
            this.k = java.util.Arrays.copyOf(zArr, zArr.length << 1);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }
}
