package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hkz implements defpackage.rvd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/accessibility/settings/impl/AccessibilitySettingsIntegration");
    public final android.content.Context b;
    public final defpackage.zjs c;
    private final defpackage.ajct d;
    private final defpackage.oko e;
    private final android.os.UserManager f;
    private final defpackage.zjm g;

    public hkz(android.content.Context context, defpackage.zjm zjmVar, defpackage.ajct ajctVar, defpackage.zjs zjsVar, defpackage.oko okoVar, android.os.UserManager userManager) {
        this.b = context;
        this.g = zjmVar;
        this.d = ajctVar;
        this.c = zjsVar;
        this.e = okoVar;
        this.f = userManager;
    }

    private final defpackage.ajcq f() {
        defpackage.zjm zjmVar = this.g;
        if (zjmVar.g().isPresent()) {
            return defpackage.ahvr.H(((defpackage.aogc) zjmVar.g().orElseThrow()).aA(), new exn(5), defpackage.ajbm.INSTANCE);
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/accessibility/settings/impl/AccessibilitySettingsIntegration", "isRttEnabledAndSupported", 164, "AccessibilitySettingsIntegration.java")).v("RTT is not enabled");
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.rvd
    public final android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent("android.telecom.action.SHOW_CALL_ACCESSIBILITY_SETTINGS");
        intent.setFlags(536870912);
        return intent;
    }

    @Override // defpackage.rvd
    public final defpackage.aw b() {
        return tdf.aW();
    }

    @Override // defpackage.rvd
    public final /* synthetic */ defpackage.aw c(rvq rvqVar) {
        return tdf.aW();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq d() {
        return defpackage.ahvr.H(f(), new exn(6), this.d);
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.oko okoVar = this.e;
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(okoVar.d, 0, new ogf(okoVar, (defpackage.aoln) null, 15, (int[]) null), 3);
        hky hkyVar = new hky(this, 1);
        defpackage.ajct ajctVar = this.d;
        arrayList.add(defpackage.ahvr.I(ajcqVarF, hkyVar, ajctVar));
        arrayList.add(f());
        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(defpackage.aiql.F(arrayList), new hup(this, 1), ajctVar);
        android.os.UserManager userManager = this.f;
        j$.util.Objects.requireNonNull(userManager);
        return defpackage.ahvr.I(ajctVar.submit(defpackage.ahqx.i(new hkx(userManager, 0))), new hky(ajcqVarH, 0), defpackage.ajbm.INSTANCE);
    }
}
