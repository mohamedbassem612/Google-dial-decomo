package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobn extends anmg {
    long a;
    final /* synthetic */ defpackage.aobu b;
    private final defpackage.aobs c;

    public aobn(defpackage.aobu aobuVar, defpackage.aobs aobsVar) {
        j$.util.Objects.requireNonNull(aobuVar);
        this.b = aobuVar;
        this.c = aobsVar;
    }

    public final void c(long j) {
        defpackage.aobu aobuVar = this.b;
        if (aobuVar.r.f == null) {
            synchronized (aobuVar.m) {
                if (aobuVar.r.f == null) {
                    defpackage.aobs aobsVar = this.c;
                    if (!aobsVar.b) {
                        long j2 = this.a + j;
                        this.a = j2;
                        long j3 = aobuVar.v;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > aobuVar.n) {
                            aobsVar.c = true;
                        } else {
                            long jAc = aobuVar.G.ac(j2 - j3);
                            aobuVar.v = this.a;
                            if (jAc > aobuVar.o) {
                                aobsVar.c = true;
                            }
                        }
                        java.lang.Runnable runnableQ = aobsVar.c ? aobuVar.q(aobsVar) : null;
                        if (runnableQ != null) {
                            runnableQ.run();
                        }
                    }
                }
            }
        }
    }
}
