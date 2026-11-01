package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxy implements defpackage.ahjd {
    private static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/gateway/RevelioGatewayHandler");
    private final swq b;
    private final aaco c;
    private final defpackage.wzz d;

    public sxy(defpackage.wzz wzzVar, swq swqVar, aaco aacoVar) {
        this.d = wzzVar;
        this.b = swqVar;
        this.c = aacoVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        aaco aacoVar = this.c;
        java.lang.Object obj = apjbVar.b;
        if (!aacoVar.b((java.lang.String) obj)) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(obj)));
        }
        if (!this.b.a()) {
            a.bI(a.d(), "Cannot handle action. Tidepods Revelio is disabled", "com/android/dialer/revelio/impl/tidepods/impl/gateway/RevelioGatewayHandler", "getRedirector", '?', "RevelioGatewayHandler.java", zct.b);
            return null;
        }
        java.lang.String action = ((android.content.Intent) apjbVar.a).getAction();
        if (action.hashCode() == -2000884749 && action.equals("com.android.dialer.revelio.ACTION_SET_DEFAULT_REVELIO_SETTINGS")) {
            return this.d;
        }
        a.bt(a.d(), "Cannot handle this action: [%s]", action, "com/android/dialer/revelio/impl/tidepods/impl/gateway/RevelioGatewayHandler", "getRedirector", 'K', "RevelioGatewayHandler.java", zct.b);
        return null;
    }
}
