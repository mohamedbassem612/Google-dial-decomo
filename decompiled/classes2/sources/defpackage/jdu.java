package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public jdu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.jdu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        qke qkeVar = (qke) list.get(2);
        izg izgVar = (izg) list.get(3);
        zjm zjmVar = (zjm) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(qkeVar, "callStatusTextGenerator");
        aooh.f(izgVar, "beeslyCallScopeState");
        aooh.f(zjmVar, "triggerExtensionProvider");
        return aosv.F(aossVar, 0, new defpackage.jdm(izgVar, context, zjmVar, qkeVar, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
