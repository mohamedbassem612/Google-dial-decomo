package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public mxj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.mxj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) list.get(2);
        aooh.f(optional, "contentTitle");
        aooh.f(charSequence, "contentText");
        aooh.f(charSequence2, "androidAutoContentText");
        return aiql.z(new qin(qio.b, (java.lang.CharSequence) aooh.q(optional), (java.lang.CharSequence) null, charSequence, charSequence2));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
