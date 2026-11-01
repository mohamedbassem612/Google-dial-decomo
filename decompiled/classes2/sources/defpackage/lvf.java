package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lvf implements rvd {
    public static final aimz a = aimz.i("com/android/dialer/contactringtones/settings/impl/ContactRingtonesSettingsIntegration");
    public final android.content.Context b;
    public final aolr c;
    private final aoss d;
    private final java.util.concurrent.Executor e;

    public lvf(android.content.Context context, aolr aolrVar, aoss aossVar, java.util.concurrent.Executor executor) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(executor, "lightweightExecutor");
        this.b = context;
        this.c = aolrVar;
        this.d = aossVar;
        this.e = executor;
    }

    public final android.content.Intent a() {
        return new android.content.Intent("com.google.android.apps.contacts.action.MANAGE_RINGTONE");
    }

    public final aw b() {
        throw new java.lang.IllegalStateException("This method is not expected to be called.");
    }

    public final /* synthetic */ aw c(rvq rvqVar) {
        return b();
    }

    public final ajcq d() {
        defpackage.hgw hgwVarBu = pez.bu(ruy.a.m());
        hgwVarBu.B(pez.bs(rux.a.m()).x());
        return aiql.z(hgwVarBu.z());
    }

    public final ajcq e() {
        return ahvr.H(aosv.F(this.d, 0, new defpackage.lve(this, (aoln) null, 0), 3), new defpackage.lgd(new defpackage.lvd(this, 0), 19), this.e);
    }
}
