package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pzw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pzw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.pzt pztVar = (defpackage.pzt) list.get(1);
        mgu mguVar = (mgu) list.get(2);
        if (optional.isPresent()) {
            defpackage.pzp pzpVar = (defpackage.pzp) optional.orElseThrow();
            aoin aoinVar = (aoin) pztVar.a.get(pzpVar);
            if (aoinVar == null) {
                throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
            }
            if (((defpackage.pzs) aoinVar.a()).e()) {
                z = true;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.cJ).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
