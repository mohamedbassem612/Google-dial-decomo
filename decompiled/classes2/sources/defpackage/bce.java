package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bce {
    public final int a;
    public final defpackage.bcc[] b;
    public final int c;
    public final int d;
    private final java.util.List e;
    private final int f;
    private final vx g;

    public bce(int i, defpackage.bcc[] bccVarArr, vx vxVar, java.util.List list, int i2) {
        this.a = i;
        this.b = bccVarArr;
        this.g = vxVar;
        this.e = list;
        this.f = i2;
        int iMax = 0;
        for (defpackage.bcc bccVar : bccVarArr) {
            iMax = java.lang.Math.max(iMax, bccVar.g);
        }
        this.c = iMax;
        int i3 = iMax + this.f;
        this.d = i3 >= 0 ? i3 : 0;
    }

    public final defpackage.bcc[] a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            defpackage.bcc[] bccVarArr = this.b;
            if (i4 >= bccVarArr.length) {
                return bccVarArr;
            }
            defpackage.bcc bccVar = bccVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((defpackage.bbl) this.e.get(i5)).a;
            bccVar.o(i, ((int[]) this.g.a)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
    }
}
