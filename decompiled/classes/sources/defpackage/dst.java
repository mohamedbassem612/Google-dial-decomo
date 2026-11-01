package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dst implements java.lang.Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    defpackage.dsp[] j = new defpackage.dsp[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public dst(int i) {
        this.n = i;
    }

    public final void a(defpackage.dsp dspVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            defpackage.dsp[] dspVarArr = this.j;
            if (i >= i2) {
                int length = dspVarArr.length;
                if (i2 >= length) {
                    dspVarArr = (defpackage.dsp[]) java.util.Arrays.copyOf(dspVarArr, length << 1);
                    this.j = dspVarArr;
                }
                int i3 = this.k;
                dspVarArr[i3] = dspVar;
                this.k = i3 + 1;
                return;
            }
            if (dspVarArr[i] == dspVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(defpackage.dsp dspVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == dspVar) {
                while (i2 < i - 1) {
                    defpackage.dsp[] dspVarArr = this.j;
                    int i3 = i2 + 1;
                    dspVarArr[i2] = dspVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        java.util.Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.c - ((defpackage.dst) obj).c;
    }

    public final void d(defpackage.dsq dsqVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(dsqVar, this, false);
        }
        this.k = 0;
    }

    public final void e(defpackage.dsq dsqVar, defpackage.dsp dspVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(dsqVar, dspVar, false);
        }
        this.k = 0;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.c);
    }
}
