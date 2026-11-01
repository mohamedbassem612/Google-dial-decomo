package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqs implements defpackage.drr {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public dqs(aomy aomyVar, int i) {
        this.$cid = i;
        this.a = aomyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aomy, java.lang.Object] */
    @Override // defpackage.drr
    public final long a(dpo dpoVar, long j, dpq dpqVar, long j2) {
        if (this.$cid != 0) {
            long j3 = ((dpn) this.a.a()).a;
            return (((long) defpackage.rl.d(dpoVar.b + dpn.a(j3), (int) (j2 >> 32), (int) (j >> 32), dpqVar == dpq.a)) << 32) | (((long) defpackage.rl.d(dpoVar.c + dpn.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
        }
        long jB = dpoVar.b();
        long jA = dpoVar.a();
        ?? r0 = this.a;
        long jA2 = r0.a(0L, (jB << 32) | (jA & 4294967295L), dpqVar);
        long jA3 = r0.a(0L, j2, dpqVar);
        return dpn.d(dpn.d(dpn.d(dpoVar.d(), jA2), (((long) (-((int) (jA3 >> 32)))) << 32) | (((long) (-((int) (jA3 & 4294967295L)))) & 4294967295L)), (((long) (dpn.a(0L) * (dpqVar != dpq.a ? -1 : 1))) << 32) | (((long) dpn.b(0L)) & 4294967295L));
    }

    public dqs(cmj cmjVar, int i) {
        this.$cid = i;
        this.a = cmjVar;
    }
}
