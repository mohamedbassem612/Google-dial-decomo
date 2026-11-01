package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amve {
    public final defpackage.amvd a;
    public final int[] b;

    public amve(defpackage.amvd amvdVar, int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = amvdVar;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        java.lang.System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public final int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final defpackage.amve c(defpackage.amve amveVar) {
        defpackage.amvd amvdVar = this.a;
        if (!amvdVar.equals(amveVar.a)) {
            throw new java.lang.IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return amveVar;
        }
        if (amveVar.e()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = amveVar.b;
        if (iArr.length > iArr2.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int length = iArr2.length;
        int length2 = length - iArr.length;
        int[] iArr3 = new int[length];
        java.lang.System.arraycopy(iArr2, 0, iArr3, 0, length2);
        for (int i = length2; i < iArr2.length; i++) {
            int i2 = iArr[i - length2];
            int i3 = iArr2[i];
            defpackage.amvd amvdVar2 = defpackage.amvd.a;
            iArr3[i] = i2 ^ i3;
        }
        return new defpackage.amve(amvdVar, iArr3);
    }

    public final defpackage.amve d(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.j;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        int i3 = 0;
        while (true) {
            defpackage.amvd amvdVar = this.a;
            if (i3 >= length) {
                return new defpackage.amve(amvdVar, iArr2);
            }
            iArr2[i3] = amvdVar.a(iArr[i3], i2);
            i3++;
        }
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final java.lang.String toString() {
        if (e()) {
            return "0";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(b() << 3);
        for (int iB = b(); iB >= 0; iB--) {
            int iA = a(iB);
            if (iA != 0) {
                if (iA < 0) {
                    if (iB == b()) {
                        sb.append('-');
                    } else {
                        sb.append(" - ");
                    }
                    iA = -iA;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || iA != 1) {
                    defpackage.amvd amvdVar = this.a;
                    if (iA == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int i = amvdVar.i[iA];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
