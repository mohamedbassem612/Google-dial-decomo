package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdl extends amzm {
    private final amzg b;

    public pdl(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pdl.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.abwd abwdVar = (defpackage.abwd) obj;
        aooh.f(abwdVar, "photoInfo");
        boolean z = false;
        if (pez.au(abwdVar) == 9) {
            opt optVar = opt.a;
            if (!opt.c(abwdVar)) {
                z = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
