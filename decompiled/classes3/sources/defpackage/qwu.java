package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qwu extends amzm {
    private final amyz b;
    private final amzg c;

    public qwu(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qwu.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z = false;
        if (!((java.lang.Boolean) this.b.a()).booleanValue() && zBooleanValue) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.c.d();
    }
}
