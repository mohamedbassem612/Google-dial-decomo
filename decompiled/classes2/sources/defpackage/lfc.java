package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfc extends amzm {
    private final amzg b;

    public lfc(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.lfc.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarQ;
        defpackage.lgg lggVar = (defpackage.lgg) obj;
        ahoq ahoqVarW = ahvr.W(277, "CallScreenProducerModule.produceCallAvatarSessionManager");
        try {
            agtc agtcVar = lggVar.g;
            if (agtcVar.c()) {
                ajcqVarQ = agtcVar.a();
            } else {
                ajcq ajcqVarA = agtcVar.a();
                ajcqVarQ = lggVar.l.q(ajcqVarA, lggVar.h, j$.util.Optional.empty(), new defpackage.lge(lggVar, ajcqVarA, 0));
            }
            ahoqVarW.a(ajcqVarQ);
            ahoqVarW.close();
            return ajcqVarQ;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
