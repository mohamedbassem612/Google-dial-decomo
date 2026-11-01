package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahep implements defpackage.afam {
    private final j$.util.Optional a;
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;

    public ahep(j$.util.Optional optional, j$.util.Optional optional2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        if (optional == null) {
            defpackage.aooh.i("disableListener");
        }
        if (optional2 == null) {
            defpackage.aooh.i("enableListenerForTests");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("retryOnFailure");
        }
        this.a = optional;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
    }

    @Override // defpackage.afam
    public final void a() {
        this.a.isPresent();
        if (defpackage.agab.ao()) {
            java.lang.Object obj = ((defpackage.amyw) this.d).b;
            defpackage.aooh.e(obj, "get(...)");
            defpackage.aoin aoinVar = this.e;
            java.lang.Object objA = aoinVar.a();
            defpackage.aooh.e(objA, "get(...)");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) obj, defpackage.aooh.p((j$.util.Optional) objA, bool))).booleanValue()) {
                aheo aheoVar = (aheo) this.b.a();
                if (aheoVar.l.r()) {
                    aheoVar.a(true);
                    return;
                } else {
                    boolean z = aheoVar.i;
                    return;
                }
            }
            java.lang.Object objA2 = aoinVar.a();
            defpackage.aooh.e(objA2, "get(...)");
            boolean zBooleanValue = ((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) objA2, bool)).booleanValue();
            defpackage.ahew ahewVar = (defpackage.ahew) this.c.a();
            android.content.Context context = ahewVar.a;
            if (defpackage.agab.ap() == null) {
                ((defpackage.aimw) ahewVar.h.d().l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 118, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                return;
            }
            if (!ahewVar.m.r()) {
                boolean z2 = ahewVar.i;
                return;
            }
            defpackage.aher aherVar = new defpackage.aher(ahewVar, zBooleanValue, 1);
            defpackage.ajcu ajcuVar = ahewVar.c;
            long j = defpackage.ahqx.a;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), aherVar, 0));
            ajcuVar.execute(ajdkVar);
            defpackage.agsm.i(1379, ajdkVar, "StartupAfterPackageReplacedListenerWithRetryRunner infrastructure failure.", new java.lang.Object[0]);
        }
    }
}
