package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public vsq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Intent intent = (android.content.Intent) list.get(0);
        android.content.Intent intent2 = (android.content.Intent) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        defpackage.vrq vrqVarA = defpackage.vru.a();
        vrqVarA.e(intent);
        vrqVarA.b(intent2);
        vrqVarA.i(optional);
        return aiql.z(vrqVarA.a());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
