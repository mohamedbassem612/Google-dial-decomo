package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogo {
    public final appa b;
    defpackage.aogn[] e;
    int f;
    public final java.util.List a = new java.util.ArrayList();
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public aogo(apqd apqdVar) {
        defpackage.aogn[] aognVarArr = new defpackage.aogn[8];
        this.e = aognVarArr;
        this.f = aognVarArr.length - 1;
        this.b = new appx(apqdVar);
    }

    public static final boolean g(int i) {
        if (i >= 0) {
            int length = defpackage.aogq.b.length;
            if (i <= 60) {
                return true;
            }
        }
        return false;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        java.util.Arrays.fill(this.e, (java.lang.Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            defpackage.aogn[] aognVarArr = this.e;
            int i5 = i2 + 1;
            java.lang.System.arraycopy(aognVarArr, i5, aognVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) throws java.io.IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        do {
            int iH = h();
            if ((iH & 128) == 0) {
                return i2 + (iH << i4);
            }
            i2 += (iH & 127) << i4;
            i4 += 7;
        } while (i4 < 28);
        throw new java.io.IOException("Varint overflowed");
    }

    public final appb c(int i) throws java.io.IOException {
        if (g(i)) {
            return defpackage.aogq.b[i].f;
        }
        int length = defpackage.aogq.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            defpackage.aogn[] aognVarArr = this.e;
            if (iA < aognVarArr.length) {
                return aognVarArr[iA].f;
            }
        }
        throw new java.io.IOException("Header index too large " + (i + 1));
    }

    final appb d() {
        int i;
        int i2;
        int iH = h();
        int i3 = iH & 128;
        long jB = b(iH, 127);
        appx appxVar = this.b;
        if (i3 != 128) {
            return appxVar.s(jB);
        }
        defpackage.aogx aogxVar = defpackage.aogx.a;
        appx appxVar2 = appxVar;
        appxVar2.z(jB);
        byte[] bArrE = appxVar2.b.E(jB);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        defpackage.aogw aogwVar = aogxVar.b;
        int i4 = 0;
        defpackage.aogw aogwVar2 = aogwVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < bArrE.length) {
            int i7 = bArrE[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    aogwVar2 = ((defpackage.aogw[]) aogwVar2.c)[(i2 >>> i9) & 255];
                    if (aogwVar2.c == null) {
                        byteArrayOutputStream.write(aogwVar2.a);
                        i6 -= aogwVar2.b;
                        aogwVar2 = aogwVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i2;
        }
        while (i6 > 0) {
            defpackage.aogw aogwVar3 = ((defpackage.aogw[]) aogwVar2.c)[(i5 << (8 - i6)) & 255];
            if (aogwVar3.c != null || (i = aogwVar3.b) > i6) {
                break;
            }
            byteArrayOutputStream.write(aogwVar3.a);
            i6 -= i;
            aogwVar2 = aogwVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        appb appbVar = appb.a;
        return aoov.aR(byteArray);
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(defpackage.aogn aognVar) {
        this.a.add(aognVar);
        int i = aognVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        defpackage.aogn[] aognVarArr = this.e;
        int length = aognVarArr.length;
        if (i3 > length) {
            defpackage.aogn[] aognVarArr2 = new defpackage.aogn[length << 1];
            java.lang.System.arraycopy(aognVarArr, 0, aognVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = aognVarArr2;
            aognVarArr = aognVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        aognVarArr[i4] = aognVar;
        this.g++;
        this.h += i;
    }
}
