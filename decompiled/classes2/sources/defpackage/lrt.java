package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lrt extends amzm {
    private final amzg b;

    public lrt(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.lrt.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aooh.f(optional, "spamIconBitmap");
        qis qisVar = qis.c;
        java.lang.Object objQ = aooh.q(optional);
        if (objQ == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        vqf vqfVarF = abxl.F(abwd.a.m());
        vqfVarF.af(true);
        return aiql.z(new qir(qisVar, new qiq((android.graphics.Bitmap) objQ, vqfVarF.ad())));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
