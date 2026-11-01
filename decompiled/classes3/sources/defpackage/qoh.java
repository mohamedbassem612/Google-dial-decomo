package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qoh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public qoh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.qoh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(1);
        java.lang.String str2 = (java.lang.String) list.get(2);
        int iIntValue = ((java.lang.Integer) list.get(3)).intValue();
        boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(5)).booleanValue();
        defpackage.qmu qmuVarA = defpackage.qmy.a();
        qmuVarA.a = defpackage.qmz.BUTTON_AUDIO_ROUTE;
        qmuVarA.d(str);
        qmuVarA.b(str2);
        qmuVarA.c(iIntValue);
        defpackage.qmv qmvVarA = defpackage.qmw.a();
        qmvVarA.b(zBooleanValue);
        qmvVarA.e(zBooleanValue2);
        qmuVarA.b = qmvVarA.a();
        return aiql.z(j$.util.Optional.of(qmuVarA.a()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
