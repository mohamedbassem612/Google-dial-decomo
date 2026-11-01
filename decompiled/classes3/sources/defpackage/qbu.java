package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbu extends amzm {
    private final amzg b;
    private final amzg c;

    public qbu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(0);
        defpackage.amoq amoqVar = (defpackage.amoq) list.get(1);
        jxb jxbVarA = jxa.a(details.getIntentExtras());
        if (jxbVarA == null) {
            akzx akzxVarM = jxb.b.m();
            akzxVarM.u();
            jxb jxbVar = akzxVarM.b;
            jxbVar.d = 12;
            jxbVar.c |= 1;
            jxbVarA = (jxb) akzxVarM.p();
        }
        if (amoqVar == defpackage.amoq.INCOMING_CALL) {
            akzx akzxVarP = jxbVarA.p();
            akzxVarP.u();
            jxb jxbVar2 = akzxVarP.b;
            jxbVar2.d = 1;
            jxbVar2.c |= 1;
            jxbVarA = akzxVarP.p();
        }
        return aiql.z(jxbVarA);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
