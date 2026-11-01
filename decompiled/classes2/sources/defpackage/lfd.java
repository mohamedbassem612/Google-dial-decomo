package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfd extends amzm {
    private final amzg b;
    private final amzg c;

    public lfd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lfd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.lel lelVar = (defpackage.lel) list.get(1);
        int iOrdinal = lelVar.ordinal();
        if (iOrdinal == 0) {
            optionalEmpty = j$.util.Optional.empty();
        } else {
            if (iOrdinal != 1) {
                throw new java.lang.IllegalStateException("Invalid callScreenActionButtonType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(lelVar))));
            }
            qif qifVar = new qif();
            qifVar.e(qid.v);
            qifVar.d(qic.b);
            qifVar.c(context.getString(2132017811));
            qifVar.h(j$.util.Optional.of(java.lang.Integer.valueOf(urg.c(context, 2130969025))));
            qifVar.g(j$.util.Optional.of(java.lang.Integer.valueOf(urg.c(context, 2130969025))));
            qifVar.b(2131231550);
            qifVar.f(true);
            optionalEmpty = j$.util.Optional.of(qifVar.a());
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
