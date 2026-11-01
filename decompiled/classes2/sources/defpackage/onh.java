package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public onh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.onh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.omy omyVar = (defpackage.omy) list.get(1);
        return aiql.z(uyg.L(new defpackage.nfp(omyVar, 8), new defpackage.lly(omyVar, context, 12, null), (ajct) list.get(2)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
