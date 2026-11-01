package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public pgu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        amyz amyzVar = this.d;
        aooh.f(amyzVar, "enablePhoneLookupPrefetching");
        return ((java.lang.Boolean) amyzVar.a()).booleanValue() ? this.c.d() : this.b.d();
    }

    protected final ajcq c() {
        return aiql.z((java.lang.Object) null);
    }
}
