package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahp {
    private static final aku a = new aku(1.0f, 1500.0f, (java.lang.Object) null);

    public static final cer a(long j, aiq aiqVar, cav cavVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aiqVar = a;
        }
        aiq aiqVar2 = aiqVar;
        float[] fArr = crp.a;
        crn[] crnVarArr = crp.y;
        int i3 = (int) (63 & j);
        boolean zB = cavVar.B(crnVarArr[i3]);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == cau.a) {
            objG = defpackage.afn.a.a(crnVarArr[i3]);
            cavVar.w(objG);
        }
        return aim.c(new cqg(j), (nf) objG, aiqVar2, (java.lang.Object) null, "ColorAnimation", cavVar, i & 14, 8);
    }
}
