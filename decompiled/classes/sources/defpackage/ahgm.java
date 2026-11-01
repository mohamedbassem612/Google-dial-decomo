package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahgm extends defpackage.amxy {
    @Override // defpackage.amxy
    protected final defpackage.hko a() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1389, "Scr#Comp", defpackage.ahot.a, true);
        try {
            defpackage.hko hkoVarA = super.a();
            ahoqVarX.close();
            return hkoVarA;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
