package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syj extends amzm {
    private final amzg b;
    private final amzg c;

    public syj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.syj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        if (((java.lang.Boolean) list.get(1)).booleanValue()) {
            optionalOf = j$.util.Optional.empty();
        } else {
            defpackage.qif qifVar = new defpackage.qif();
            qifVar.e(defpackage.qid.REVELIO_ANSWER);
            qifVar.d(defpackage.qic.c);
            qifVar.c(context.getString(2132019490));
            qifVar.h(j$.util.Optional.of(java.lang.Integer.valueOf(context.getColor(2131102102))));
            qifVar.b(2131232043);
            qifVar.f(true);
            optionalOf = j$.util.Optional.of(qifVar.a());
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
