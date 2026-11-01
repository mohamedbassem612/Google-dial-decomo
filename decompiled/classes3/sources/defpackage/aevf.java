package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aevf extends aevp {
    private final double c;
    private final aeuz d;

    /* JADX WARN: Illegal instructions before constructor call */
    public aevf(apga apgaVar, double d) {
        aevn aevnVarC = aevn.c(apgaVar);
        super(aevnVarC.c > 0, apgaVar);
        this.c = d;
        this.d = new aeuz(apgaVar, aevnVarC.d(d));
    }

    public final apga b(aevn aevnVar) {
        if (aevnVar == null) {
            return this.d.c((aevn) null);
        }
        return aevnVar.d(this.c) ? f(aevnVar) : e();
    }

    public final aevn d(java.lang.String str) {
        return this.d.a(str);
    }
}
