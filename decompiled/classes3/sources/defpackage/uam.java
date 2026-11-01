package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uam extends amzm {
    private final amzg b;

    public uam(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.uam.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.zpo zpoVar = (defpackage.zpo) obj;
        akzx akzxVarM = defpackage.uap.a.m();
        defpackage.zpo zpoVar2 = defpackage.zpo.f;
        akzxVarM.u();
        defpackage.uap uapVar = (defpackage.uap) akzxVarM.b;
        uapVar.b |= 1;
        uapVar.c = zpoVar == zpoVar2;
        return aiql.z(j$.util.Optional.of((defpackage.uap) akzxVarM.p()));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
