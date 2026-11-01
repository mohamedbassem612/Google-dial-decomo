package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swj implements rvd {
    private final android.content.Context a;
    private final int b = 3;

    public swj(android.content.Context context, int i) {
        this.a = context;
    }

    public final android.content.Intent a() {
        return new android.content.Intent("android.telecom.action.SHOW_RESPOND_VIA_SMS_SETTINGS").setFlags(536870912);
    }

    public final aw b() {
        throw new java.lang.IllegalStateException("This method is not expected to be called.");
    }

    public final /* synthetic */ aw c(defpackage.rvq rvqVar) {
        return b();
    }

    public final ajcq d() {
        return afsq.cb();
    }

    public final ajcq e() {
        defpackage.rus rusVar = new defpackage.rus();
        rusVar.d(defpackage.ruz.GENERAL);
        rusVar.c(defpackage.rvc.QUICK_REPLIES);
        rusVar.e(new defpackage.rva(2132019897));
        rusVar.b(this.a.getDrawable(2131231939));
        return aiql.z(j$.util.Optional.of(rusVar.a()));
    }
}
