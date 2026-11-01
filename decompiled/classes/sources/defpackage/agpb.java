package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agpb {
    public final defpackage.aoin a;
    public final defpackage.aoin b;
    public final int c;
    public final java.util.concurrent.Executor d;
    public final defpackage.afhf e;
    public final defpackage.adag f;
    private final defpackage.ajwr g = new defpackage.ajwr();

    public agpb(defpackage.aoin aoinVar, defpackage.adag adagVar, defpackage.afhf afhfVar, defpackage.aoin aoinVar2, int i, java.util.concurrent.Executor executor) {
        this.a = aoinVar;
        this.f = adagVar;
        this.e = afhfVar;
        this.b = aoinVar2;
        this.c = i;
        this.d = executor;
    }

    public final defpackage.ajcq a() {
        final long epochMilli = j$.time.Instant.now().toEpochMilli();
        return this.g.e(defpackage.ahqx.b(new defpackage.ajas() { // from class: agoy
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                final defpackage.agpb agpbVar = this.a;
                final defpackage.ajcq ajcqVarC = agpbVar.e.c();
                boolean zIsEmpty = defpackage.aihd.o(((defpackage.adai) agpbVar.a.a()).n().values()).isEmpty();
                final long j = epochMilli;
                if (zIsEmpty) {
                    return defpackage.ajan.g(ajcqVarC, defpackage.ahqx.c(new jwi(agpbVar, j, 18)), agpbVar.d);
                }
                defpackage.ajat ajatVarC = defpackage.ahqx.c(new defpackage.afgz(agpbVar, 7));
                java.util.concurrent.Executor executor = agpbVar.d;
                return defpackage.ajck.w(defpackage.ajan.g(ajcqVarC, ajatVarC, executor)).y(defpackage.ahqx.c(new defpackage.afgz(agpbVar, 8)), executor).y(defpackage.ahqx.c(new defpackage.ajat() { // from class: agpa
                    @Override // defpackage.ajat
                    public final defpackage.ajcq a(java.lang.Object obj) {
                        return agpbVar.b(j, (defpackage.agpc) defpackage.aiql.H(ajcqVarC));
                    }
                }), executor);
            }
        }), this.d);
    }

    public final defpackage.ajcq b(final long j, final defpackage.agpc agpcVar) {
        return this.e.a(new defpackage.ahyc() { // from class: agoz
            @Override // defpackage.ahyc
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.agpc agpcVar2 = (defpackage.agpc) obj;
                int i = agpcVar2.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0) {
                    long j3 = agpcVar2.d;
                    if (j3 > j2) {
                        defpackage.agpc agpcVar3 = agpcVar;
                        if ((agpcVar3.b & 2) == 0 || agpcVar3.d != j3) {
                            return agpcVar2;
                        }
                    }
                }
                defpackage.agpb agpbVar = this.a;
                defpackage.akzx akzxVarL = agpcVar2.L();
                akzxVarL.u();
                defpackage.agpc agpcVar4 = (defpackage.agpc) akzxVarL.b;
                agpcVar4.b |= 1;
                agpcVar4.c = j2;
                akzxVarL.u();
                defpackage.agpc agpcVar5 = (defpackage.agpc) akzxVarL.b;
                agpcVar5.b |= 4;
                agpcVar5.e = agpbVar.c;
                akzxVarL.u();
                defpackage.agpc agpcVar6 = (defpackage.agpc) akzxVarL.b;
                agpcVar6.b &= -3;
                agpcVar6.d = 0L;
                return (defpackage.agpc) akzxVarL.r();
            }
        }, defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq c() {
        return this.e.c();
    }
}
