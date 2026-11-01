package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acm {
    public int[] a;
    public int b;

    public acm(int i) {
        this.a = i == 0 ? defpackage.acr.a : new int[i];
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            defpackage.un.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            defpackage.un.d("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i, (length * 3) / 2));
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
    }

    public final void d(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            defpackage.un.c("Index must be between 0 and size");
        }
        if (i2 < i) {
            defpackage.un.a("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = this.b;
            if (i2 < i4) {
                int[] iArr = this.a;
                defpackage.ajsz.db(iArr, iArr, i, i2, i4);
            }
            this.b -= i2 - i;
        }
    }

    public final void e() {
        int i = this.b;
        if (i != 0) {
            int[] iArr = this.a;
            defpackage.aooh.f(iArr, "<this>");
            java.util.Arrays.sort(iArr, 0, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acm)) {
            return false;
        }
        defpackage.acm acmVar = (defpackage.acm) obj;
        int i = acmVar.b;
        int i2 = this.b;
        if (i != i2) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = acmVar.a;
        defpackage.aopq aopqVarC = defpackage.aooc.C(0, i2);
        int i3 = aopqVarC.a;
        int i4 = aopqVarC.b;
        if (i3 <= i4) {
            while (iArr[i3] == iArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        c(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void g(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (i == iArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            h(i3);
        }
    }

    public final void h(int i) {
        if (i < 0 || i >= this.b) {
            defpackage.un.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            defpackage.ajsz.db(iArr, iArr, i, i + 1, i3);
        }
        this.b--;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i < 0 || i >= this.b) {
            defpackage.un.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }
}
