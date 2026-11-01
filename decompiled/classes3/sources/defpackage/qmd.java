package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qmd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarF;
        java.util.List list = (java.util.List) obj;
        aihd aihdVar = (aihd) list.get(0);
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(aihdVar, "largeIconCandidates");
        aooh.f(abwdVar, "photoInfo");
        aooh.f(aossVar, "lightweightScope");
        ahoq ahoqVarW = ahvr.W(619, "StatusBarNotificationProducerModule_produceSelectedLargeIcon");
        amzg amzgVar = this.c;
        try {
            java.util.Comparator comparatorComparing = j$.util.Comparator.-CC.comparing(new defpackage.pei(new aoom() { // from class: qkw
                public final java.lang.Object b(java.lang.Object obj2) {
                    return ((defpackage.qir) obj2).a;
                }
            }, 11));
            aooh.e(comparatorComparing, "comparing(...)");
            defpackage.qir qirVar = (defpackage.qir) ajsz.bK(aihdVar, comparatorComparing);
            if (qirVar != null) {
                ajcqVarF = aiql.z(j$.util.Optional.of(qirVar));
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            } else {
                ajcqVarF = aosv.F(aossVar, 0, new ohh(amzgVar, abwdVar, (aoln) null, 15), 3);
                ahoqVarW.a(ajcqVarF);
                aooh.e(ajcqVarF, "attachToFuture(...)");
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            }
            return ajcqVarF;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar.d()});
    }
}
