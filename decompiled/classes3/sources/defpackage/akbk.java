package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akbk extends anmc {
    private final agtc a;
    private final java.lang.String b;
    private final java.util.concurrent.Executor c;

    public akbk(final ajzx ajzxVar, final ajzw ajzwVar) {
        this.b = ajzwVar.c.getAuthority();
        this.c = ajzwVar.e;
        this.a = new agtc(new ajas() { // from class: akbi
            public final ajcq a() {
                ajzx ajzxVar2 = ajzxVar;
                ajzw ajzwVar2 = ajzwVar;
                ahoq ahoqVarW = ahvr.W(1499, "FrameworkChannel#getTransportChannel");
                try {
                    ajcq ajcqVarZ = aiql.z(ajzxVar2.a(ajzwVar2));
                    ahoqVarW.close();
                    return ajcqVarZ;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, ajzwVar.d);
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final ajsz b(anpk anpkVar, anmb anmbVar) {
        abzg.a();
        anmv anmvVarK = anmv.k();
        ajcq ajcqVarA = this.a.a();
        defpackage.ahml ahmlVar = new defpackage.ahml(anmvVarK, anpkVar, anmbVar, 2);
        java.util.concurrent.Executor executor = anmbVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new defpackage.akbj(ahvr.H(ajcqVarA, ahmlVar, executor), anmvVarK, anmbVar);
    }
}
