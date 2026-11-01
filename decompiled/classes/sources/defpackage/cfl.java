package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfl {
    public final defpackage.cfm a;
    public final int[] b;
    public final int c;
    public final int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    private java.lang.Object[] m;
    private final defpackage.appu n;

    public cfl(defpackage.cfm cfmVar) {
        this.a = cfmVar;
        this.b = cfmVar.a;
        int i = cfmVar.b;
        this.c = i;
        this.m = cfmVar.c;
        this.d = cfmVar.d;
        this.g = i;
        this.h = -1;
        this.n = new defpackage.appu(null, null);
    }

    private final java.lang.Object C(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return defpackage.cau.a;
        }
        java.lang.Object[] objArr = this.m;
        int length = iArr.length;
        if (i2 < length) {
            length = iArr[i2 + 4] + java.lang.Integer.bitCount(i3 >> 29);
        }
        return objArr[length];
    }

    public final boolean A() {
        return x() || this.f == this.g;
    }

    public final boolean B(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final int a() {
        int i = this.f;
        if (i < this.g) {
            return this.b[i * 5];
        }
        return 0;
    }

    public final int b(int i) {
        return this.b[i * 5];
    }

    public final int c(int i) {
        return this.b[(i * 5) + 3];
    }

    public final int d(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final int e(int i) {
        return this.b[(i * 5) + 2];
    }

    public final int f() {
        if (this.i != 0) {
            defpackage.cax.b("Cannot skip while in an empty region");
        }
        int[] iArr = this.b;
        int i = this.f;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f = i + iArr[i2 + 3];
        return i4;
    }

    public final defpackage.cfh g(int i) {
        java.util.ArrayList arrayList = this.a.h;
        int iC = defpackage.cfo.c(arrayList, i, this.c);
        if (iC >= 0) {
            return (defpackage.cfh) arrayList.get(iC);
        }
        defpackage.cfh cfhVar = new defpackage.cfh(i);
        arrayList.add(-(iC + 1), cfhVar);
        return cfhVar;
    }

    public final java.lang.Object h() {
        int i = this.f;
        if (i < this.g) {
            return C(this.b, i);
        }
        return 0;
    }

    public final java.lang.Object i() {
        int i = this.f;
        if (i < this.g) {
            return p(this.b, i);
        }
        return null;
    }

    public final java.lang.Object j(int i) {
        return C(this.b, i);
    }

    public final java.lang.Object k(int i) {
        return l(this.f, i);
    }

    public final java.lang.Object l(int i, int i2) {
        int[] iArr = this.b;
        int iD = defpackage.cfo.d(iArr, i);
        int i3 = i + 1;
        int i4 = iD + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.d) ? this.m[i4] : defpackage.cau.a;
    }

    public final java.lang.Object m(int i) {
        return p(this.b, i);
    }

    public final java.lang.Object n() {
        int i;
        if (this.i > 0 || (i = this.j) >= this.k) {
            this.l = false;
            return defpackage.cau.a;
        }
        this.l = true;
        java.lang.Object[] objArr = this.m;
        this.j = i + 1;
        return objArr[i];
    }

    public final java.lang.Object o(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.m[iArr[i2 + 4]] : defpackage.cau.a;
        }
        return null;
    }

    public final java.lang.Object p(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.m[defpackage.cfo.b(iArr, i)];
        }
        return null;
    }

    public final void q() {
        this.i++;
    }

    public final void r() {
        this.e = true;
        defpackage.cfm cfmVar = this.a;
        if (cfmVar.e <= 0) {
            defpackage.cax.b("Unexpected reader close()");
        }
        cfmVar.e--;
        this.m = new java.lang.Object[0];
    }

    public final void s() {
        int i;
        if (this.i == 0) {
            if (this.f != this.g) {
                defpackage.cax.b("endGroup() not called at the end of a group");
            }
            int[] iArr = this.b;
            int i2 = iArr[(this.h * 5) + 2];
            this.h = i2;
            this.g = i2 < 0 ? this.c : iArr[(i2 * 5) + 3] + i2;
            int iE = this.n.e();
            if (iE < 0) {
                i = 0;
                this.j = 0;
            } else {
                this.j = iE;
                i = i2 >= this.c + (-1) ? this.d : iArr[((i2 + 1) * 5) + 4];
            }
            this.k = i;
        }
    }

    public final void t(int i) {
        if (this.i != 0) {
            defpackage.cax.b("Cannot reposition while in an empty region");
        }
        this.f = i;
        int i2 = this.c;
        int i3 = i < i2 ? this.b[(i * 5) + 2] : -1;
        if (i3 != this.h) {
            this.h = i3;
            if (i3 < 0) {
                this.g = i2;
            } else {
                this.g = i3 + this.b[(i3 * 5) + 3];
            }
            this.j = 0;
            this.k = 0;
        }
    }

    public final java.lang.String toString() {
        return "SlotReader(current=" + this.f + ", key=" + a() + ", parent=" + this.h + ", end=" + this.g + ')';
    }

    public final void u() {
        if (this.i != 0) {
            defpackage.cax.b("Cannot skip the enclosing group while in an empty region");
        }
        this.f = this.g;
        this.j = 0;
        this.k = 0;
    }

    public final void v() {
        if (this.i <= 0) {
            int i = this.h;
            int i2 = this.f;
            int i3 = i2 * 5;
            int[] iArr = this.b;
            if (iArr[i3 + 2] != i) {
                defpackage.cdh.a("Invalid slot table detected");
            }
            defpackage.appu appuVar = this.n;
            int i4 = this.j;
            int i5 = this.k;
            if (i4 != 0) {
                appuVar.g(i4);
            } else if (i5 == 0) {
                appuVar.g(-1);
            } else {
                i4 = 0;
                appuVar.g(i4);
            }
            this.h = i2;
            this.g = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f = i6;
            this.j = defpackage.cfo.d(iArr, i2);
            this.k = i2 >= this.c + (-1) ? this.d : iArr[(i6 * 5) + 4];
        }
    }

    public final boolean w(int i) {
        return (this.b[(i * 5) + 1] & 67108864) != 0;
    }

    public final boolean x() {
        return this.i > 0;
    }

    public final boolean y(int i) {
        return (this.b[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean z(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }
}
