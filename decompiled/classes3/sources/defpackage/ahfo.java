package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahfo implements eoe {
    final /* synthetic */ defpackage.ahfp a;
    private final com.google.apps.tiktok.account.AccountId b;

    public ahfo(defpackage.ahfp ahfpVar, com.google.apps.tiktok.account.AccountId accountId) {
        j$.util.Objects.requireNonNull(ahfpVar);
        this.a = ahfpVar;
        this.b = accountId;
    }

    public final /* synthetic */ eoa a(java.lang.Class cls) {
        return enn.d(cls);
    }

    public final eoa b(java.lang.Class cls, eoq eoqVar) {
        ahvr.bY(cls.equals(defpackage.ahfn.class));
        enr enrVarA = env.a(eoqVar);
        amyl amylVar = (amyl) eoqVar.a(defpackage.ahgf.a);
        if (amylVar == null) {
            amylVar = amyl.a;
        }
        amyl amylVar2 = amylVar;
        defpackage.ahfp ahfpVar = this.a;
        com.google.apps.tiktok.account.AccountId accountId = this.b;
        ahgd ahgdVar = ahfpVar.a;
        if (ahgdVar instanceof amyq) {
            return new defpackage.ahfn(enrVarA, ahfpVar.b, accountId, ahgdVar.b().b(), amylVar2);
        }
        throw new java.lang.IllegalStateException("Host is not a Hilt activity or FragmentHost: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ahgdVar))));
    }

    public final /* synthetic */ eoa c(aopu aopuVar, eoq eoqVar) {
        return enn.c(this, aopuVar, eoqVar);
    }
}
