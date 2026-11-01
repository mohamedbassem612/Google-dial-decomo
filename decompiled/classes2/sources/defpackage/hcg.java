package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcg extends cmv implements dbd {
    public int a;
    public int b;

    public hcg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        long jC;
        aooh.f(cydVar, "measurable");
        int i = this.a;
        int i2 = this.b;
        int iA = dpd.a(j);
        long jD = dpe.d(j, (((long) i) << 32) | (((long) i2) & 4294967295L));
        if (iA != Integer.MAX_VALUE || dpd.b(j) == Integer.MAX_VALUE) {
            int i3 = (int) (4294967295L & jD);
            if (dpd.b(j) != Integer.MAX_VALUE || dpd.a(j) == Integer.MAX_VALUE) {
                int i4 = (int) (jD >> 32);
                jC = dpe.c(i4, i4, i3, i3);
            } else {
                int i5 = (i * i3) / i2;
                jC = dpe.c(i5, i5, i3, i3);
            }
        } else {
            int i6 = (int) (jD >> 32);
            int i7 = (i2 * i6) / i;
            jC = dpe.c(i6, i6, i7, i7);
        }
        czc czcVarV = cydVar.v(jC);
        return den.z(cyiVar, czcVarV.a, czcVarV.b, new defpackage.fxs(czcVarV, 15));
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.f(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.g(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.h(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.i(this, cxfVar, cxeVar, i);
    }
}
