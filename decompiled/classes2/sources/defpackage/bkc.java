package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkc implements defpackage.drr {
    private final cmj a;
    private long b = 0;
    private final defpackage.bkv c;

    public bkc(cmj cmjVar, defpackage.bkv bkvVar) {
        this.a = cmjVar;
        this.c = bkvVar;
    }

    @Override // defpackage.drr
    public final long a(dpo dpoVar, long j, dpq dpqVar, long j2) {
        long jA = this.c.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.b;
        }
        this.b = jA;
        return dpn.d(dpn.d(dpoVar.d(), dfd.l(jA)), this.a.a(j2, 0L, dpqVar));
    }
}
