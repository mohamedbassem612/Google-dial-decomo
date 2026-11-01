package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public lfx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.lfx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        zdl zdlVar = (zdl) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        if (!optional.isPresent()) {
            return aiql.z(j$.util.Optional.empty());
        }
        defpackage.llw llwVarX = ((pgi) optional.orElseThrow()).x(defpackage.lll.LOCAL_CONTACT);
        return ahvr.H(zdlVar.a(llwVarX.a), new defpackage.kxn(llwVarX, 19), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
