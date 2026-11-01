package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bsw {
    public static final defpackage.cbd a = new defpackage.cbn(defpackage.cdu.c, new defpackage.ns(16));
    public static final defpackage.cbd b = new defpackage.cbf(new defpackage.aln(17));
    private static final defpackage.bsx c = new defpackage.bsx(true, Float.NaN, defpackage.cfd.S(), null, true, true);
    private static final defpackage.bsx d = new defpackage.bsx(false, Float.NaN, defpackage.cfd.S(), null, true, true);

    public static /* synthetic */ defpackage.any a(boolean z, float f, defpackage.crd crdVar, boolean z2, int i) {
        long jN;
        if ((i & 4) != 0) {
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN = 0;
        }
        long j = jN;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        int i2 = (i & 1) | (z ? 1 : 0);
        if ((i & 8) != 0) {
            crdVar = null;
        }
        defpackage.crd crdVar2 = crdVar;
        boolean z3 = (i & 16) != 0;
        boolean z4 = (!((i & 32) == 0)) | z2;
        if (java.lang.Float.compare(f2, Float.NaN) == 0) {
            float[] fArr2 = defpackage.crp.a;
            if (j == defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u) && crdVar2 == null && z3 && z4) {
                return i2 != 0 ? c : d;
            }
        }
        return new defpackage.bsx(1 == i2, f2, j, crdVar2, z3, z4);
    }
}
