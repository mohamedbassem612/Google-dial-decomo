package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;
    private final amzg e;
    private final amyz f;
    private final amzg g;

    public jwr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3, amzg amzgVar3, amyz amyzVar4, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.jwr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
        this.e = amzs.b(amzgVar3);
        this.f = amyzVar4;
        this.g = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        long jLongValue = ((java.lang.Long) list.get(2)).longValue();
        ajct ajctVar = (ajct) list.get(3);
        amyz amyzVar = this.d;
        j$.util.Objects.requireNonNull(amyzVar);
        return aiql.z(uyg.L(new defpackage.iwm(amyzVar, 6), new ahll(zBooleanValue, this.f, jLongValue, context, 1), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
