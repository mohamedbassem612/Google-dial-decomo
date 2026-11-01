package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfz extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public lfz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.lfz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarH;
        java.util.List list = (java.util.List) obj;
        defpackage.lll lllVar = (defpackage.lll) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        zdl zdlVar = (zdl) list.get(2);
        ajct ajctVar = (ajct) list.get(3);
        ahoq ahoqVarW = ahvr.W(281, "CallScreenProducerModule.produceResumeScreeningRequest");
        try {
            if (optional.isPresent()) {
                pgi pgiVar = (pgi) optional.orElseThrow();
                defpackage.lls llsVar = ((defpackage.llv) pgiVar.b).f;
                if (llsVar == null) {
                    llsVar = defpackage.lls.a;
                }
                defpackage.llw llwVarW = pgiVar.w(llsVar, lllVar);
                ajcqVarH = ahvr.H(zdlVar.a(llwVarW.a), new defpackage.kxn(llwVarW, 16), ajctVar);
                ahoqVarW.a(ajcqVarH);
            } else {
                ajcqVarH = aiql.z(j$.util.Optional.empty());
            }
            ahoqVarW.close();
            return ajcqVarH;
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
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
