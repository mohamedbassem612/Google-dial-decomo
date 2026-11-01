package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxi extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public mxi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.mxi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        aify aifyVarQ;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        int iIntValue = ((java.lang.Integer) list.get(3)).intValue();
        aooh.f(context, "appContext");
        if (zBooleanValue) {
            aifyVarQ = aike.a;
            aooh.e(aifyVarQ, "of(...)");
        } else if (zBooleanValue2) {
            qid qidVar = qid.e;
            qic qicVar = qic.a;
            java.lang.String string = context.getString(iIntValue);
            aooh.e(string, "getString(...)");
            qib qibVar = new qib(qidVar, qicVar, string, java.lang.Integer.valueOf(context.getColor(2131099848)), (java.lang.Integer) null, 2131232043, false, (java.lang.Integer) null);
            qid qidVar2 = qid.c;
            qic qicVar2 = qic.c;
            java.lang.String string2 = context.getString(2132019490);
            aooh.e(string2, "getString(...)");
            aifyVarQ = aify.q(qibVar, new qib(qidVar2, qicVar2, string2, java.lang.Integer.valueOf(context.getColor(2131102102)), (java.lang.Integer) null, 2131232043, false, (java.lang.Integer) null));
        } else {
            aifyVarQ = aike.a;
            aooh.e(aifyVarQ, "of(...)");
        }
        return aiql.z(aifyVarQ);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
