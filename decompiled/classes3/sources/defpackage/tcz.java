package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tcz implements defpackage.ahjd {
    public static final aimz a = aimz.i("com/android/dialer/rtt/settings/impl/gateway/RttSettingsGatewayHandler");
    public final ajct b;
    public final ipc c;
    private final zjm d;

    public tcz(zjm zjmVar, ipc ipcVar, ajct ajctVar) {
        this.d = zjmVar;
        this.c = ipcVar;
        this.b = ajctVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        j$.util.Optional optionalG = this.d.g();
        if (!optionalG.isPresent()) {
            a.bI(a.c().m(aioa.b), "RTT visibility setting is not enabled", "com/android/dialer/rtt/settings/impl/gateway/RttSettingsGatewayHandler", "getRedirector", 'G', "RttSettingsGatewayHandler.java", zct.b);
            return null;
        }
        java.lang.String action = ((android.content.Intent) apjbVar.a).getAction();
        if (action != null && action.equals("com.android.dialer.rtt.settings.impl.gateway.ACTION_OPEN_RTT_SETTINGS")) {
            return new defpackage.rjh(this, ahvr.H(((aogc) optionalG.orElseThrow()).aA(), new defpackage.tcy(this, 0), this.b), 2);
        }
        a.bt(a.c().m(aioa.b), "Cannot handle action: %s", action, "com/android/dialer/rtt/settings/impl/gateway/RttSettingsGatewayHandler", "getRedirector", 'X', "RttSettingsGatewayHandler.java", zct.b);
        return null;
    }
}
