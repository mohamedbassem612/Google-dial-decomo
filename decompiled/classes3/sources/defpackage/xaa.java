package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xaa implements defpackage.ahjd {
    private static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsGatewayHandler");
    private final defpackage.wzz b;
    private final wyc c;
    private final aaco d;
    private final rlv e;

    public xaa(defpackage.wzz wzzVar, wyc wycVar, aaco aacoVar, rlv rlvVar) {
        this.b = wzzVar;
        this.c = wycVar;
        this.d = aacoVar;
        this.e = rlvVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        aaco aacoVar = this.d;
        java.lang.Object obj = apjbVar.b;
        if (!aacoVar.b((java.lang.String) obj)) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(obj)));
        }
        if (!this.c.a()) {
            a.d().l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsGatewayHandler", "getRedirector", 61, "AtlasPixelTipsGatewayHandler.java").v("Cannot handle action. Atlas is disabled");
            return null;
        }
        java.lang.String action = ((android.content.Intent) apjbVar.a).getAction();
        if ("com.android.dialer.atlas.pixeltipsintegration.ACTION_SET_ATLAS_DEFAULT_SETTINGS".equals(action)) {
            this.e.o(rmx.eL);
            return this.b;
        }
        a.d().l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsGatewayHandler", "getRedirector", 71, "AtlasPixelTipsGatewayHandler.java").y("Cannot handle action: [%s]", action);
        return null;
    }
}
