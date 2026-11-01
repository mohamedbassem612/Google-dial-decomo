package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abks implements cye {
    final /* synthetic */ long a;

    public abks(long j) {
        this.a = j;
    }

    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        return vn.f(this, cxfVar, list, i);
    }

    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        return vn.g(this, cxfVar, list, i);
    }

    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        return vn.h(this, cxfVar, list, i);
    }

    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        return vn.i(this, cxfVar, list, i);
    }

    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        aooh.f(cyiVar, "$this$Layout");
        long jDr = cyiVar.dr(this.a);
        int i = (int) (jDr >> 32);
        long jB = (((long) dpd.b(j)) << 32) | ((long) dpd.a(j));
        int i2 = (int) (jDr & 4294967295L);
        float fMin = java.lang.Math.min(((int) (jB >> 32)) / java.lang.Float.intBitsToFloat(i), ((int) (jB & 4294967295L)) / java.lang.Float.intBitsToFloat(i2));
        czc czcVarV = ((cyd) ajsz.bE(list)).v(dpe.l((int) java.lang.Float.intBitsToFloat(i), (int) java.lang.Float.intBitsToFloat(i2)));
        long jBm = mni.bm(jDr, fMin);
        return den.z(cyiVar, (int) java.lang.Float.intBitsToFloat((int) (jBm >> 32)), (int) java.lang.Float.intBitsToFloat((int) (jBm & 4294967295L)), new defpackage.arg(czcVarV, fMin, 3));
    }
}
