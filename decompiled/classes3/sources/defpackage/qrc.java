package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qrc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qrc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qrc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        java.lang.Boolean bool = (java.lang.Boolean) ((mgu) list.get(3)).a(new java.util.function.Supplier() { // from class: qqt
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                if (!zBooleanValue) {
                    return java.lang.Boolean.FALSE;
                }
                boolean z = true;
                if (!zBooleanValue2 && !zBooleanValue3) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).a(mfy.cT).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
