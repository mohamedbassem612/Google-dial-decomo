package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uyu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uyu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        defpackage.uyy uyyVar = (defpackage.uyy) list.get(2);
        akzx akzxVarM = defpackage.uyq.a.m();
        akzxVarM.u();
        defpackage.uyq uyqVar = (defpackage.uyq) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        uyqVar.b |= 1;
        uyqVar.c = str;
        akzxVarM.u();
        defpackage.uyq uyqVar2 = (defpackage.uyq) akzxVarM.b;
        uyqVar2.b |= 2;
        uyqVar2.d = zBooleanValue;
        akzxVarM.u();
        defpackage.uyq uyqVar3 = (defpackage.uyq) akzxVarM.b;
        j$.util.Objects.requireNonNull(uyyVar);
        uyqVar3.e = uyyVar;
        uyqVar3.b |= 4;
        return aiql.z(j$.util.Optional.of((defpackage.uyq) akzxVarM.p()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
