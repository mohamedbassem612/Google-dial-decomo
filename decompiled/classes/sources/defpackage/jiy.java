package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jiy implements defpackage.rvd {
    public final android.content.Context a;
    private final defpackage.ajct b;

    public jiy(android.content.Context context, defpackage.ajct ajctVar) {
        this.a = context;
        this.b = ajctVar;
    }

    @Override // defpackage.rvd
    public final android.content.Intent a() {
        defpackage.zjs zjsVarDO = hhk.d(this.a).dO();
        defpackage.zjv.i(zjsVarDO.g, defpackage.mgv.TELECOM_CREATE_MANAGE_BLOCKED_NUMBERS_INTENT, null, null, 0, 30);
        android.content.Intent intentM = fh$.ExternalSyntheticApiModelOutline0.m(zjsVarDO.i);
        defpackage.aooh.e(intentM, "createManageBlockedNumbersIntent(...)");
        return intentM.setFlags(536870912);
    }

    @Override // defpackage.rvd
    public final defpackage.aw b() {
        throw new java.lang.IllegalStateException("This method is not expected to be called.");
    }

    @Override // defpackage.rvd
    public final /* synthetic */ defpackage.aw c(rvq rvqVar) {
        return b();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq d() {
        return defpackage.afsq.cb();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq e() {
        return defpackage.ahvr.F(new hkx(this, 10), this.b);
    }
}
