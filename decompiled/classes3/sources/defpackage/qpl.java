package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qpl implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qpl(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.qpn qpnVar = (defpackage.qpn) this.b;
            if (qpnVar.n) {
                qpnVar.j += this.a - qpnVar.l;
                qpnVar.n = false;
                qpnVar.l = 0L;
                return;
            }
            return;
        }
        if (i == 1) {
            mfs.a.b().l("com/android/dialer/debug/dump/dumptools/DebugDumper", "getPublicDumpMessageList", 324, "DebugDumper.java").H("Dump %s: %dms", this.b.getClass().getSimpleName(), j$.time.Instant.now().toEpochMilli() - this.a);
            return;
        }
        long j = this.a;
        if (i != 2) {
            defpackage.ynf ynfVar = (defpackage.ynf) this.b;
            ynfVar.b.d(ynfVar.a, j);
        } else {
            defpackage.ynf ynfVar2 = (defpackage.ynf) this.b;
            ynfVar2.b.e(ynfVar2.a, j);
        }
    }
}
