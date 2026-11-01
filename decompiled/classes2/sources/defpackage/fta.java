package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fta {
    public java.lang.String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public java.lang.String l;
    public android.text.Layout.Alignment o;
    public android.text.Layout.Alignment p;
    public defpackage.fsv r;
    public java.lang.String t;
    public java.lang.String u;
    public java.lang.String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (this.i == 1 ? 2 : 0) | (i == 1 ? 1 : 0);
    }

    public final void b(defpackage.fta ftaVar) {
        int i;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        java.lang.String str;
        if (ftaVar != null) {
            if (!this.c && ftaVar.c) {
                d(ftaVar.b);
            }
            if (this.h == -1) {
                this.h = ftaVar.h;
            }
            if (this.i == -1) {
                this.i = ftaVar.i;
            }
            if (this.a == null && (str = ftaVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ftaVar.f;
            }
            if (this.g == -1) {
                this.g = ftaVar.g;
            }
            if (this.n == -1) {
                this.n = ftaVar.n;
            }
            if (this.o == null && (alignment2 = ftaVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ftaVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ftaVar.q;
            }
            if (this.j == -1) {
                this.j = ftaVar.j;
                this.k = ftaVar.k;
            }
            if (this.r == null) {
                this.r = ftaVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ftaVar.s;
            }
            if (this.t == null) {
                this.t = ftaVar.t;
            }
            if (this.u == null) {
                this.u = ftaVar.u;
            }
            if (this.v == null) {
                this.v = ftaVar.v;
            }
            if (!this.e && ftaVar.e) {
                c(ftaVar.d);
            }
            if (this.m != -1 || (i = ftaVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }

    public final void c(int i) {
        this.d = i;
        this.e = true;
    }

    public final void d(int i) {
        this.b = i;
        this.c = true;
    }
}
