package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qrd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qrd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qrd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        java.lang.Boolean bool = (java.lang.Boolean) new mgf((mgu) list.get(3), zpoVar.equals(defpackage.zpo.c) || zpoVar.equals(defpackage.zpo.d) || ((java.lang.Boolean) list.get(1)).booleanValue() || ((java.lang.Boolean) list.get(2)).booleanValue()).a(mfy.cP).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
