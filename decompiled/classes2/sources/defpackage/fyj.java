package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fyj {
    public static final /* synthetic */ int a = 0;
    private static final cbd b = den.ad(defpackage.fyl.a);

    public static final fxz a(cav cavVar) {
        cbt cbtVar;
        fxz fxzVar = (fxz) cavVar.e(b);
        if (fxzVar == null) {
            cavVar.u(950835668);
            android.content.Context baseContext = (android.content.Context) cavVar.e(dep.b);
            while (true) {
                if (!(baseContext instanceof android.content.ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof fxz) {
                    break;
                }
                baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
            }
            fxzVar = (fxz) baseContext;
            cbtVar = (cbt) cavVar;
        } else {
            cavVar.u(950834211);
            cbtVar = (cbt) cavVar;
        }
        cbtVar.W(false);
        return fxzVar;
    }
}
