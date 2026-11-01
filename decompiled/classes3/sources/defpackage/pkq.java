package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pkq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.Boolean bool = (java.lang.Boolean) new mgf((mgu) list.get(2), ((java.lang.Boolean) list.get(0)).booleanValue() || ((java.lang.Boolean) list.get(1)).booleanValue()).a(mfy.aH).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
