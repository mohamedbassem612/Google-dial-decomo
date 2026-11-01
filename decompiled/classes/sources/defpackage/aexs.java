package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexs implements defpackage.afef {
    @Override // defpackage.afef
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.ahbz ahbzVar) throws java.io.IOException {
        java.io.InputStream inputStreamA = new defpackage.affr().a(ahbzVar);
        try {
            defpackage.aext aextVarC = defpackage.aext.c(defpackage.akzf.J(inputStreamA, 4096));
            defpackage.ajsz.ak(inputStreamA, null);
            return aextVarC;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(inputStreamA, th);
                throw th2;
            }
        }
    }
}
