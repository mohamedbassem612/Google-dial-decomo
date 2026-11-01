package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdr extends amzm {
    private final amzg b;
    private final amzg c;

    public jdr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.jdr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(0);
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) list.get(1);
        aooh.f(charSequence, "notificationContentTitle");
        aooh.f(charSequence2, "notificationContenText");
        return aiql.z(new qin(qio.k, charSequence, (java.lang.CharSequence) null, charSequence2, charSequence2));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
