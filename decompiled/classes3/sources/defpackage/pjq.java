package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public pjq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final j$.util.Optional optional = (j$.util.Optional) list.get(1);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(3);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        return aiql.z((j$.util.Optional) ((mgu) list.get(5)).b(new java.util.function.Function() { // from class: pix
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                java.lang.String string = (java.lang.String) optional.orElse((java.lang.Object) null);
                if (string == null || zBooleanValue) {
                    amdxVar.a = "empty";
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optional4 = optional2;
                amdxVar.a = "FormattedNumber";
                java.lang.String str = (java.lang.String) optional4.orElse((java.lang.Object) null);
                if (str != null) {
                    android.content.Context context2 = context;
                    amdxVar.a = "ChildNumber";
                    string = context2.getString(2132018023, str);
                } else {
                    java.lang.String str2 = (java.lang.String) optional3.orElse((java.lang.Object) null);
                    if (str2 != null) {
                        amdxVar.a = "LastForwardedNumber";
                        string = str2;
                    }
                }
                return j$.util.Optional.ofNullable(dxt.a().d(string, dxv.a));
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.aN));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
