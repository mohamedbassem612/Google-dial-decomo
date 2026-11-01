package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qwr extends amzm {
    private final amyz b;
    private final amyz c;
    private final amyz d;
    private final amzg e;
    private final amzg f;

    public qwr(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amyz amyzVar4, amyz amyzVar5, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qwr.class), amyzVar);
        this.b = amyzVar3;
        this.c = amyzVar4;
        this.d = amyzVar5;
        this.e = amzs.b(amzgVar);
        this.f = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        if ((!((java.lang.Boolean) this.b.a()).booleanValue() && !((java.lang.Boolean) this.c.a()).booleanValue()) || ((!((java.lang.Boolean) this.d.a()).booleanValue() || !zBooleanValue) && !zBooleanValue2)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.e.d(), this.f.d()});
    }
}
