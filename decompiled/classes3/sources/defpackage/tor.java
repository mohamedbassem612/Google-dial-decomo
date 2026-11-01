package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tor extends amzm {
    private final amzg b;

    public tor(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.tor.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aooh.f(optional, "spamIconBitmap");
        defpackage.qis qisVar = defpackage.qis.SHARPIE;
        java.lang.Object objQ = aooh.q(optional);
        if (objQ == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        defpackage.vqf vqfVarF = defpackage.abxl.F(defpackage.abwd.a.m());
        vqfVarF.af(true);
        return aiql.z(new defpackage.qir(qisVar, new defpackage.qiq((android.graphics.Bitmap) objQ, vqfVarF.ad())));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
