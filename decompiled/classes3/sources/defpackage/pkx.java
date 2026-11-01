package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pkx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        aify aifyVar = (aify) list.get(1);
        java.lang.String str = (java.lang.String) ((j$.util.Optional) list.get(2)).orElse("");
        if (!str.isEmpty()) {
            aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.pgq(context, str, 5, null)).collect(aido.a);
        }
        return aiql.z(aifyVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
