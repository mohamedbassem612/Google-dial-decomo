package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class appu {
    public int a;
    public java.lang.Object b;

    public appu() {
        this.b = new defpackage.apow[8];
    }

    public final defpackage.apow a() {
        return ((defpackage.apow[]) this.b)[1];
    }

    public final void b(int i, defpackage.apow apowVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 != 0) {
                defpackage.apow apowVar2 = ((defpackage.apow[]) this.b)[i2];
                if (apowVar2 == null) {
                    defpackage.aooh.g();
                }
                if (defpackage.aooh.b(0L, apowVar.j - apowVar2.j) <= 0) {
                    break;
                }
                apowVar2.i = i;
                ((defpackage.apow[]) this.b)[i] = apowVar2;
                i = i2;
            } else {
                break;
            }
        }
        ((defpackage.apow[]) this.b)[i] = apowVar;
        apowVar.i = i;
    }

    public final void c(defpackage.apow apowVar) {
        defpackage.apow apowVar2;
        int i = apowVar.i;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.a;
        defpackage.apow apowVar3 = ((defpackage.apow[]) this.b)[i2];
        if (apowVar3 == null) {
            defpackage.aooh.g();
        }
        apowVar.i = -1;
        defpackage.apow[] apowVarArr = (defpackage.apow[]) this.b;
        apowVarArr[i2] = null;
        this.a = i2 - 1;
        if (apowVar != apowVar3) {
            int iB = defpackage.aooh.b(0L, apowVar3.j - apowVar.j);
            if (iB == 0) {
                apowVarArr[i] = apowVar3;
                apowVar3.i = i;
                return;
            }
            if (iB >= 0) {
                b(i, apowVar3);
                return;
            }
            while (true) {
                int i3 = i << 1;
                int i4 = i3 + 1;
                int i5 = this.a;
                if (i4 <= i5) {
                    apowVar2 = ((defpackage.apow[]) this.b)[i3];
                    if (apowVar2 == null) {
                        defpackage.aooh.g();
                    }
                    defpackage.apow apowVar4 = ((defpackage.apow[]) this.b)[i4];
                    if (apowVar4 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.aooh.b(0L, apowVar4.j - apowVar2.j) >= 0) {
                        apowVar2 = apowVar4;
                    }
                } else {
                    if (i3 > i5) {
                        break;
                    }
                    apowVar2 = ((defpackage.apow[]) this.b)[i3];
                    if (apowVar2 == null) {
                        defpackage.aooh.g();
                    }
                }
                if (defpackage.aooh.b(0L, apowVar2.j - apowVar3.j) <= 0) {
                    break;
                }
                int i6 = apowVar2.i;
                apowVar2.i = i;
                ((defpackage.apow[]) this.b)[i] = apowVar2;
                i = i6;
            }
            ((defpackage.apow[]) this.b)[i] = apowVar3;
            apowVar3.i = i;
        }
    }

    public final int d(int i) {
        int i2 = this.a - 1;
        return i2 >= 0 ? ((int[]) this.b)[i2] : i;
    }

    public final int e() {
        java.lang.Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void f() {
        this.a = 0;
    }

    public final void g(int i) {
        java.lang.Object objCopyOf = this.b;
        int i2 = this.a;
        int[] iArr = (int[]) objCopyOf;
        int length = iArr.length;
        if (i2 >= length) {
            objCopyOf = java.util.Arrays.copyOf(iArr, length << 1);
            defpackage.aooh.e(objCopyOf, "copyOf(...)");
            this.b = objCopyOf;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        ((int[]) objCopyOf)[i3] = i;
    }

    public appu(byte[] bArr) {
        this.a = 3;
    }

    public appu(byte[] bArr, byte[] bArr2) {
        this.b = new int[10];
    }
}
