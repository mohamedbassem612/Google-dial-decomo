package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lga extends amzm {
    private final amzg b;
    private final amzg c;

    public lga(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lga.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.lej lejVar = (defpackage.lej) list.get(0);
        ptx ptxVar = (ptx) list.get(1);
        ahoq ahoqVarW = ahvr.W(282, "CallScreenProducerModule_produceVoicePackInterpreter");
        try {
            boolean z = !ptxVar.o();
            defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "cachedInterpreter", 82, "CachedVoicePackInterpreter.java").y("shouldEnforceTimeout: %b", java.lang.Boolean.valueOf(z));
            ajcq ajcqVarH = lejVar.h.h(new defpackage.iaw(lejVar, z, 2), lejVar.d);
            ahoqVarW.a(ajcqVarH);
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
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
