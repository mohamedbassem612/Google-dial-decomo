package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qon extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qon(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qon.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        if (!zBooleanValue || (!optional.isPresent() || optional.orElseThrow() == defpackage.zcy.a ? !zBooleanValue2 : !((defpackage.zcy) optional.orElseThrow()).f())) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
