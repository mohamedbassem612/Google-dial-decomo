package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affq implements afef {
    private final albn a;
    private final akzq b = akzq.a;

    public affq(albn albnVar) {
        this.a = albnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(ahbz ahbzVar) throws java.io.IOException {
        java.io.InputStream inputStreamC = new affr().c(ahbzVar);
        try {
            java.lang.Object objI = this.a.i(inputStreamC, this.b);
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            return objI;
        } catch (java.lang.Throwable th) {
            if (inputStreamC != null) {
                try {
                    inputStreamC.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
