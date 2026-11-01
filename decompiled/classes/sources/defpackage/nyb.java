package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nyb implements defpackage.rnt {
    private final defpackage.aogc a;

    public nyb(defpackage.aogc aogcVar) {
        if (aogcVar == null) {
            defpackage.aooh.i("duoAvailabilityAsyncUpdater");
        }
        this.a = aogcVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.emj
    public final void e(defpackage.emx emxVar) throws java.io.IOException {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(388, "DuoAvailabilityAsyncUpdater_updateDuoAvailabilityAsync", defpackage.ahot.a, true);
        defpackage.aogc aogcVar = this.a;
        try {
            defpackage.nya nyaVar = new defpackage.nya(aogcVar, 0);
            ?? r5 = aogcVar.a;
            long j = defpackage.ahqx.a;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), nyaVar, 0));
            r5.execute(ajdkVar);
            defpackage.agsm.i(1315, ajdkVar, "DuoAvailabilityAsyncUpdater_updateDuoAvailabilityAsync", new java.lang.Object[0]);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void fn(defpackage.emx emxVar) {
    }
}
