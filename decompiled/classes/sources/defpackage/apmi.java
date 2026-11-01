package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmi {
    public final defpackage.apoy a;
    public boolean c;
    public defpackage.apmg[] e;
    public int f;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;

    public apmi(defpackage.apoy apoyVar) {
        this.a = apoyVar;
        defpackage.apmg[] apmgVarArr = new defpackage.apmg[8];
        this.e = apmgVarArr;
        this.f = apmgVarArr.length - 1;
    }

    public final void a() {
        defpackage.ajsz.dn(this.e);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(defpackage.apmg apmgVar) {
        int i = apmgVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        defpackage.apmg[] apmgVarArr = this.e;
        int length = apmgVarArr.length;
        if (i3 > length) {
            defpackage.apmg[] apmgVarArr2 = new defpackage.apmg[length << 1];
            java.lang.System.arraycopy(apmgVarArr, 0, apmgVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = apmgVarArr2;
            apmgVarArr = apmgVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        apmgVarArr[i4] = apmgVar;
        this.g++;
        this.h += i;
    }

    public final void c(defpackage.appb appbVar) {
        long j;
        if (appbVar == null) {
            defpackage.aooh.i("data");
        }
        int[] iArr = defpackage.apnc.a;
        if (appbVar == null) {
            defpackage.aooh.i("bytes");
        }
        int iC = appbVar.c();
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            byte bA = appbVar.a(i2);
            int i3 = defpackage.apjv.a;
            j3 += (long) defpackage.apnc.b[bA & 255];
        }
        if (((int) ((j3 + 7) >> 3)) >= appbVar.c()) {
            d(appbVar.c(), 127, 0);
            this.a.J(appbVar);
            return;
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        if (appbVar == null) {
            defpackage.aooh.i("source");
        }
        int iC2 = appbVar.c();
        int i4 = 0;
        while (i < iC2) {
            byte bA2 = appbVar.a(i);
            int i5 = defpackage.apjv.a;
            int i6 = bA2 & 255;
            int i7 = defpackage.apnc.a[i6];
            byte b = defpackage.apnc.b[i6];
            long j4 = j2 << b;
            long j5 = i7;
            i4 += b;
            while (true) {
                j = j4 | j5;
                if (i4 >= 8) {
                    i4 -= 8;
                    apoyVar.N((int) (j >> i4));
                }
            }
            i++;
            j2 = j;
        }
        if (i4 > 0) {
            apoyVar.N((int) ((j2 << (8 - i4)) | (255 >>> i4)));
        }
        defpackage.appb appbVarR = apoyVar.r();
        d(appbVarR.c(), 127, 128);
        this.a.J(appbVarR);
    }

    public final void d(int i, int i2, int i3) {
        defpackage.apoy apoyVar = this.a;
        if (i < i2) {
            apoyVar.N(i3 | i);
            return;
        }
        apoyVar.N(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            apoyVar.N((i4 & 127) | 128);
            i4 >>>= 7;
        }
        apoyVar.N(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                defpackage.apmg apmgVar = this.e[length];
                if (apmgVar == null) {
                    defpackage.aooh.g();
                }
                i -= apmgVar.i;
                int i4 = this.h;
                defpackage.apmg apmgVar2 = this.e[length];
                if (apmgVar2 == null) {
                    defpackage.aooh.g();
                }
                this.h = i4 - apmgVar2.i;
                this.g--;
                i3++;
                length--;
            }
            defpackage.apmg[] apmgVarArr = this.e;
            int i5 = i2 + 1;
            java.lang.System.arraycopy(apmgVarArr, i5, apmgVarArr, i5 + i3, this.g);
            defpackage.apmg[] apmgVarArr2 = this.e;
            int i6 = this.f + 1;
            java.util.Arrays.fill(apmgVarArr2, i6, i6 + i3, (java.lang.Object) null);
            this.f += i3;
        }
    }
}
