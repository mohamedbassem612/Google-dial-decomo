package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobx extends defpackage.antw {
    final /* synthetic */ aoby a;
    private final defpackage.antw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aobx(aoby aobyVar, defpackage.antw antwVar) {
        super((char[]) null);
        j$.util.Objects.requireNonNull(aobyVar);
        this.a = aobyVar;
        this.b = antwVar;
    }

    @Override // defpackage.antw
    public final anqw m(defpackage.anpt anptVar) {
        anqw anqwVarM = this.b.m(anptVar);
        boolean zH = anqwVarM.h();
        aoby aobyVar = this.a;
        if (zH) {
            aobyVar.c.a();
        } else {
            defpackage.aobd aobdVar = new defpackage.aobd(aobyVar, 7);
            anva anvaVar = aobyVar.c;
            anrc anrcVar = anvaVar.c;
            anrcVar.c();
            if (anvaVar.d == null) {
                anvaVar.d = new defpackage.anwx();
            }
            defpackage.apjb apjbVar = anvaVar.e;
            if (apjbVar == null || !apjbVar.k()) {
                long jA = anvaVar.d.a();
                anvaVar.e = anrcVar.d(aobdVar, jA, java.util.concurrent.TimeUnit.NANOSECONDS, anvaVar.b);
                anva.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", java.lang.Long.valueOf(jA));
            }
        }
        return anqwVarM;
    }
}
