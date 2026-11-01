package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qew extends amzm {
    private final amzg b;

    public qew(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qew.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ahoq ahoqVarW = ahvr.W(598, "AnswerAsRttProducerModule_produceAnswerAsRttActionButtonSafeProducedElement");
        try {
            defpackage.uyg uygVarJ = defpackage.uyg.J(new defpackage.plx(this.b, 4));
            ahoqVarW.close();
            return aiql.z(uygVarJ);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final ajcq c() {
        return aiql.z((java.lang.Object) null);
    }
}
