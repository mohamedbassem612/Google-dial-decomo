package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnh extends amzm {
    private final amzg b;

    public qnh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qnh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aimz aimzVar = defpackage.qng.a;
        aooh.f(optional, "carrierIdOptional");
        java.lang.Integer num = (java.lang.Integer) aooh.q(optional);
        boolean z = true;
        if (num != null) {
            num.intValue();
            if (defpackage.qng.b.contains(num)) {
                z = false;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
