package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agop extends defpackage.agoo {
    public static final /* synthetic */ int a = 0;
    private final defpackage.agov b;
    private final defpackage.aoin c;
    private final defpackage.adag d;

    static {
        j$.time.Duration.ofDays(365L);
    }

    public agop(defpackage.adag adagVar, defpackage.agov agovVar, defpackage.aoin aoinVar) {
        this.d = adagVar;
        this.b = agovVar;
        this.c = aoinVar;
    }

    @Override // defpackage.agoo
    public final /* bridge */ /* synthetic */ defpackage.agxi a() {
        return (agow) this.c.a();
    }

    @Override // defpackage.agoo
    public final defpackage.ajcq b(com.google.apps.tiktok.account.AccountId accountId) {
        return defpackage.ahvr.H(this.d.g(accountId), new defpackage.aeqw(12), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.agoo
    public final defpackage.ajcq c() {
        return this.d.i();
    }

    @Override // defpackage.agoo
    public final defpackage.ajcq d() {
        return this.b.a();
    }

    @Override // defpackage.agoo
    public final defpackage.ajcq e(com.google.apps.tiktok.account.AccountId accountId) {
        return defpackage.ahvr.H(this.d.g(accountId), new defpackage.aeqw(13), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.agoo
    public final agon f(com.google.apps.tiktok.account.AccountId accountId) {
        try {
            java.lang.Object obj = ((defpackage.adai) this.d.a).a;
            java.lang.Object obj2 = ((defpackage.aogc) obj).c;
            java.lang.Object obj3 = ((defpackage.aogc) obj).a;
            j$.util.Objects.requireNonNull(obj3);
            return defpackage.aogc.H(defpackage.adai.m((defpackage.agqk) ((defpackage.adnp) obj2).c(new adbi(obj3, 8)), accountId));
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.lang.RuntimeException(e.getCause());
        }
    }
}
