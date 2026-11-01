package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acpw {
    public static final defpackage.ayy a = defpackage.den.bb(8.0f, 2);

    public static final defpackage.amu a(boolean z, boolean z2, defpackage.cav cavVar) {
        boolean z3;
        defpackage.cbd cbdVar = defpackage.bqx.a;
        long jI = defpackage.abrz.i(((defpackage.bqv) cavVar.e(cbdVar)).a, 24);
        long jI2 = defpackage.abrz.i(((defpackage.bqv) cavVar.e(cbdVar)).a, 17);
        float fD = defpackage.cqg.d(jI2);
        float fC = defpackage.cqg.c(jI2);
        float fB = defpackage.cqg.b(jI2);
        float[] fArr = defpackage.crp.a;
        long jN = defpackage.cfd.N(fD, fC, fB, 0.12f, defpackage.crp.y[(int) (jI2 & 63)]);
        int i = defpackage.bpm.a;
        if (true != z) {
            jI = jN;
        }
        if (z2) {
            jI = 0;
            z3 = true;
        } else {
            z3 = false;
        }
        return new defpackage.amu(true != z3 ? 1.0f : 0.0f, new defpackage.crf(jI));
    }
}
