package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ixa implements ahjd {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/settings/gateway/BeeslySettingsGatewayHandler");
    public final ipc b;
    private final iqm c;
    private final zjm d;

    public ixa(ipc ipcVar, zjm zjmVar, iqm iqmVar) {
        this.b = ipcVar;
        this.d = zjmVar;
        this.c = iqmVar;
    }

    public final ahjc a(apjb apjbVar) {
        iqm iqmVar = this.c;
        if (iqmVar.a() && (iqmVar.b() || this.d.g().isPresent())) {
            return new defpackage.iwz(this, 0);
        }
        a.b().l("com/android/dialer/beesly/impl/settings/gateway/BeeslySettingsGatewayHandler", "getRedirector", 47, "BeeslySettingsGatewayHandler.kt").v("Beesly is not enabled, returning null redirector");
        return null;
    }
}
