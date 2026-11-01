package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dow {
    static final /* synthetic */ defpackage.dow a = new defpackage.dow();

    public static final defpackage.doy a(long j) {
        return j != 16 ? new defpackage.dom(j) : defpackage.dox.a;
    }

    public static final defpackage.doy b(defpackage.cqd cqdVar, float f) {
        if (cqdVar == null) {
            return defpackage.dox.a;
        }
        if (!(cqdVar instanceof defpackage.crf)) {
            if (cqdVar instanceof defpackage.crb) {
                return new defpackage.dol((defpackage.crb) cqdVar, f);
            }
            throw new defpackage.aois();
        }
        long jN = ((defpackage.crf) cqdVar).a;
        if (!java.lang.Float.isNaN(f) && f < 1.0f) {
            float fA = defpackage.cqg.a(jN) * f;
            float fD = defpackage.cqg.d(jN);
            float fC = defpackage.cqg.c(jN);
            float fB = defpackage.cqg.b(jN);
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(fD, fC, fB, fA, defpackage.crp.y[(int) (jN & 63)]);
        }
        return a(jN);
    }
}
