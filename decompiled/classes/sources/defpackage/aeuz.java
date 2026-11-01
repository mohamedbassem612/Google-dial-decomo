package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeuz extends defpackage.aevp {
    public aeuz(defpackage.apga apgaVar, boolean z) {
        super(z, apgaVar);
    }

    @Override // defpackage.aevp
    public final defpackage.aevn a(java.lang.String str) {
        defpackage.apga apgaVarC = c(null);
        return apgaVarC.equals(defpackage.apga.a) ? defpackage.aevn.a : defpackage.aevn.c(apgaVarC);
    }

    @Override // defpackage.aevp
    public final defpackage.apga b(defpackage.aevn aevnVar) {
        return c(aevnVar);
    }

    public final defpackage.apga c(defpackage.aevn aevnVar) {
        return this.a ? f(aevnVar) : e();
    }
}
