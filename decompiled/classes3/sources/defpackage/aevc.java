package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aevc extends aevp {
    private final aeuz c;

    public aevc(apga apgaVar, boolean z) {
        super(z, apgaVar);
        this.c = new aeuz(apgaVar, z);
    }

    public final apga b(aevn aevnVar) {
        if (aevnVar == null) {
            return this.c.c((aevn) null);
        }
        return aevnVar.e() ? f(aevnVar) : e();
    }

    public final aevn d(java.lang.String str) {
        return this.c.a(str);
    }
}
