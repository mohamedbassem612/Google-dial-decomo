package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsg implements anqn {
    private final ahpz a;

    public ahsg(ahpz ahpzVar) {
        this.a = ahpzVar;
    }

    public final antw a(anql anqlVar, anph anphVar, anqm anqmVar) {
        ahpi ahpiVarD = this.a.d(1472, anqlVar.f().b, ahot.a);
        try {
            ahoq ahoqVarZ = ahvr.Z(1471, anqlVar.f().b);
            try {
                defpackage.ahsd ahsdVar = new defpackage.ahsd(anqmVar.a(new defpackage.ahse(anqlVar, ahoqVarZ), anphVar), ahqz.b());
                ahoqVarZ.close();
                ahpiVarD.close();
                return ahsdVar;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarZ.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpiVarD.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
