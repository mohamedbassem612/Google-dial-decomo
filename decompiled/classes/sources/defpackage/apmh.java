package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmh {
    public int a = 4096;
    public final java.util.List b = new java.util.ArrayList();
    public long c;
    public final defpackage.appa d;
    public defpackage.apmg[] e;
    public int f;
    public int g;
    private int h;

    public apmh(defpackage.apqd apqdVar) {
        this.d = new defpackage.appx(apqdVar);
        defpackage.apmg[] apmgVarArr = new defpackage.apmg[8];
        this.e = apmgVarArr;
        this.h = apmgVarArr.length - 1;
    }

    public static final boolean i(int i) {
        if (i >= 0) {
            defpackage.apmg[] apmgVarArr = defpackage.apmj.a;
            int length = defpackage.apmj.a.length;
            if (i <= 60) {
                return true;
            }
        }
        return false;
    }

    private final int j() {
        byte bD = this.d.d();
        int i = defpackage.apjv.a;
        return bD & 255;
    }

    public final int a(int i) {
        return this.h + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            int iJ = j();
            i4++;
            long j2 = ((long) (iJ & 127)) << i5;
            if (j2 > 2147483647L - j) {
                throw new java.io.IOException("HPACK integer overflow");
            }
            j += j2;
            if ((iJ & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        throw new java.io.IOException("HPACK integer overflow");
    }

    public final defpackage.appb c(int i) throws java.io.IOException {
        if (i(i)) {
            defpackage.apmg[] apmgVarArr = defpackage.apmj.a;
            return defpackage.apmj.a[i].g;
        }
        defpackage.apmg[] apmgVarArr2 = defpackage.apmj.a;
        int length = defpackage.apmj.a.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            defpackage.apmg[] apmgVarArr3 = this.e;
            if (iA < apmgVarArr3.length) {
                defpackage.apmg apmgVar = apmgVarArr3[iA];
                if (apmgVar == null) {
                    defpackage.aooh.g();
                }
                return apmgVar.g;
            }
        }
        throw new java.io.IOException("Header index too large " + (i + 1));
    }

    public final defpackage.appb d() {
        int i;
        int i2;
        int iJ = j();
        int i3 = iJ & 128;
        long jB = b(iJ, 127);
        if (this.c + jB > 262144) {
            throw new java.io.IOException("header byte count limit of 262144 exceeded");
        }
        if (i3 != 128) {
            return this.d.s(jB);
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        int[] iArr = defpackage.apnc.a;
        defpackage.appa appaVar = this.d;
        defpackage.apnb apnbVar = defpackage.apnc.c;
        int i4 = 0;
        defpackage.apnb apnbVar2 = apnbVar;
        long j = 0;
        int i5 = 0;
        while (j < jB) {
            byte bD = appaVar.d();
            int i6 = defpackage.apjv.a;
            int i7 = bD & 255;
            int i8 = i4 << 8;
            i5 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i5 >= 8) {
                    int i9 = i5 - 8;
                    int i10 = (i2 >>> i9) & 255;
                    java.lang.Object obj = apnbVar2.c;
                    if (obj == null) {
                        defpackage.aooh.g();
                    }
                    apnbVar2 = ((defpackage.apnb[]) obj)[i10];
                    if (apnbVar2 == null) {
                        defpackage.aooh.g();
                    }
                    if (apnbVar2.c == null) {
                        apoyVar.N(apnbVar2.a);
                        i5 -= apnbVar2.b;
                        apnbVar2 = apnbVar;
                    } else {
                        i5 = i9;
                    }
                }
            }
            j++;
            i4 = i2;
        }
        while (i5 > 0) {
            int i11 = (i4 << (8 - i5)) & 255;
            java.lang.Object obj2 = apnbVar2.c;
            if (obj2 == null) {
                defpackage.aooh.g();
            }
            defpackage.apnb apnbVar3 = ((defpackage.apnb[]) obj2)[i11];
            if (apnbVar3 == null) {
                defpackage.aooh.g();
            }
            if (apnbVar3.c != null || (i = apnbVar3.b) > i5) {
                break;
            }
            apoyVar.N(apnbVar3.a);
            i5 -= i;
            apnbVar2 = apnbVar;
        }
        return apoyVar.r();
    }

    public final void e(defpackage.apmg apmgVar) {
        this.b.add(apmgVar);
        long jC = this.c + ((long) (apmgVar.g.c() + apmgVar.h.c()));
        this.c = jC;
        if (jC > 262144) {
            throw new java.io.IOException("header byte count limit of 262144 exceeded");
        }
    }

    public final void f() {
        defpackage.ajsz.dn(this.e);
        this.h = this.e.length - 1;
        this.f = 0;
        this.g = 0;
    }

    public final void g(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.h;
                if (length < i2 || i <= 0) {
                    break;
                }
                defpackage.apmg apmgVar = this.e[length];
                if (apmgVar == null) {
                    defpackage.aooh.g();
                }
                int i4 = apmgVar.i;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            defpackage.apmg[] apmgVarArr = this.e;
            int i5 = i2 + 1;
            java.lang.System.arraycopy(apmgVarArr, i5, apmgVarArr, i5 + i3, this.f);
            this.h += i3;
        }
    }

    public final void h(defpackage.apmg apmgVar) {
        e(apmgVar);
        int i = apmgVar.i;
        int i2 = this.a;
        if (i > i2) {
            f();
            return;
        }
        g((this.g + i) - i2);
        int i3 = this.f + 1;
        defpackage.apmg[] apmgVarArr = this.e;
        int length = apmgVarArr.length;
        if (i3 > length) {
            defpackage.apmg[] apmgVarArr2 = new defpackage.apmg[length << 1];
            java.lang.System.arraycopy(apmgVarArr, 0, apmgVarArr2, length, length);
            this.h = this.e.length - 1;
            this.e = apmgVarArr2;
            apmgVarArr = apmgVarArr2;
        }
        int i4 = this.h;
        this.h = i4 - 1;
        apmgVarArr[i4] = apmgVar;
        this.f++;
        this.g += i;
    }
}
