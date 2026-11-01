package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbr implements defpackage.pzs {
    private final aoin a;
    private final aoin b;
    private final defpackage.qzn c;

    public pbr(aoin aoinVar, aoin aoinVar2, defpackage.qzn qznVar) {
        aooh.f(aoinVar, "enableBackNavigation");
        aooh.f(aoinVar2, "enableIncomingCallLandscape");
        aooh.f(qznVar, "voiceScreenAllowOrientationChange");
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = qznVar;
    }

    @Override // defpackage.pzs
    public final aw a() {
        defpackage.pbj pbjVar = new defpackage.pbj();
        amxr.g(pbjVar);
        return pbjVar;
    }

    @Override // defpackage.pzs
    public final defpackage.pzp b() {
        return defpackage.pzp.ANSWER_SCREEN;
    }

    @Override // defpackage.pzs
    public final /* synthetic */ j$.util.Optional c(defpackage.abvz abvzVar, long j) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.pzs
    public final boolean d() {
        java.lang.Object objA = this.a.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    @Override // defpackage.pzs
    public final boolean e() {
        return ((java.lang.Boolean) this.b.a()).booleanValue() && this.c.a();
    }

    @Override // defpackage.pzs
    public final /* synthetic */ boolean f() {
        return false;
    }
}
