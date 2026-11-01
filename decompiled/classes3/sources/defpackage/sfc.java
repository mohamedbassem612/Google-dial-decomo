package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfc implements defpackage.ahjd {
    private static final aimz a = aimz.i("com/android/dialer/patrick/impl/settings/gateway/CallingCardSettingsGateway");
    private final aaco b;
    private final smx c;
    private final rlv d;
    private final ipc e;

    public sfc(aaco aacoVar, smx smxVar, ipc ipcVar, rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.b = aacoVar;
        this.c = smxVar;
        this.e = ipcVar;
        this.d = rlvVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        if (!this.c.a()) {
            a.b().l("com/android/dialer/patrick/impl/settings/gateway/CallingCardSettingsGateway", "isValidSource", 51, "CallingCardSettingsGateway.kt").v("Calling card is not enabled.");
            return null;
        }
        java.lang.Object obj = apjbVar.b;
        if (!aooh.n(obj, "com.google.android.contacts")) {
            a.b().l("com/android/dialer/patrick/impl/settings/gateway/CallingCardSettingsGateway", "isValidSource", 59, "CallingCardSettingsGateway.kt").v("Calling package is not Contacts.");
            return null;
        }
        java.lang.Object obj2 = apjbVar.a;
        if (!aooh.n(obj2 != null ? ((android.content.Intent) obj2).getAction() : null, "com.android.dialer.patrick.impl.settings.gateway.ACTION_OPEN_CALLING_CARD_SETTINGS")) {
            a.b().l("com/android/dialer/patrick/impl/settings/gateway/CallingCardSettingsGateway", "isValidSource", 63, "CallingCardSettingsGateway.kt").v("Invalid action.");
            return null;
        }
        if (!this.b.b((java.lang.String) obj)) {
            a.b().l("com/android/dialer/patrick/impl/settings/gateway/CallingCardSettingsGateway", "isValidSource", 67, "CallingCardSettingsGateway.kt").v("The calling package is not a signed Google app.");
            return null;
        }
        this.d.o(rmx.yF);
        ipc ipcVar = this.e;
        defpackage.ryg rygVarAU = pez.aU(defpackage.rvq.a.m());
        defpackage.ryg rygVarAS = pez.aS(defpackage.rvo.a.m());
        rygVarAS.k(defpackage.rvc.PATRICK);
        rygVarAU.o(rygVarAS.i());
        return new iwz(ipcVar.aL(rygVarAU.n()), 8);
    }
}
