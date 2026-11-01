package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qol extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public qol(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.qol.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        return aiql.z(defpackage.uyg.K(new java.util.concurrent.Callable() { // from class: qob
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                if (!zBooleanValue) {
                    return j$.util.Optional.empty();
                }
                boolean z = zBooleanValue2;
                android.content.Context context2 = context;
                defpackage.qmu qmuVarA = defpackage.qmy.a();
                qmuVarA.a = defpackage.qmz.BUTTON_FLIP_CAMERA;
                qmuVarA.d(context2.getString(2132020774));
                qmuVarA.c(2131231724);
                qmuVarA.b(context2.getString(2132019047));
                defpackage.qmv qmvVarA = defpackage.qmw.a();
                boolean z2 = false;
                if (z && zBooleanValue3) {
                    z2 = true;
                }
                qmvVarA.c(z2);
                qmuVarA.b = qmvVarA.a();
                return j$.util.Optional.of(qmuVarA.a());
            }
        }, (ajct) list.get(4)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
