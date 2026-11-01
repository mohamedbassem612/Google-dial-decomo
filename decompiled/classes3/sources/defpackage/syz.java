package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syz extends amzm {
    private final amzg b;
    private final amzg c;

    public syz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.syz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        defpackage.qig qigVar = new defpackage.qig();
        qigVar.c(defpackage.qio.REVELIO_SCREENING);
        qigVar.d(optional);
        qigVar.e(optional);
        qigVar.b(charSequence);
        return aiql.z(qigVar.a());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
