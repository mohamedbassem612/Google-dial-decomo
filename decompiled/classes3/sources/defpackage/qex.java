package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qex extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public qex(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.qex.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        ajct ajctVar = (ajct) list.get(3);
        ahoq ahoqVarW = ahvr.W(599, "AnswerAsRttProducerModule_produceAnswerAsRttChip");
        try {
            defpackage.uyg uygVarJ = defpackage.uyg.J(new defpackage.qwg(zBooleanValue, zBooleanValue2, this.c, context, ajctVar, 1));
            ahoqVarW.close();
            return aiql.z(uygVarJ);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar2.d(), amzgVar.d()});
    }
}
