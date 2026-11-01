package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public xdc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.xdh xdhVar = (defpackage.xdh) list.get(1);
        defpackage.qix qixVar = (defpackage.qix) list.get(2);
        int iJ = wsc.j(xdhVar.c.c);
        if (iJ == 0) {
            throw null;
        }
        if (iJ - 1 == 2 && qixVar == defpackage.qix.b) {
            defpackage.qif qifVar = new defpackage.qif();
            qifVar.e(defpackage.qid.CANCEL_ATLAS);
            qifVar.d(defpackage.qic.b);
            qifVar.c(context.getString(android.R.string.cancel));
            qifVar.g(j$.util.Optional.of(java.lang.Integer.valueOf(urg.b(context))));
            qifVar.b(2131232022);
            qifVar.f(false);
            optionalOf = j$.util.Optional.of(qifVar.a());
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
