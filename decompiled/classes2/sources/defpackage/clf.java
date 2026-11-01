package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class clf extends clt {
    public cho a;
    public int b;

    public clf(long j, cho choVar) {
        super(j);
        this.a = choVar;
    }

    public final clt b(long j) {
        return new defpackage.clf(j, this.a);
    }

    public final void c(clt cltVar) {
        if (cltVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        }
        defpackage.clf clfVar = (defpackage.clf) cltVar;
        synchronized (defpackage.clh.a) {
            this.a = clfVar.a;
            this.b = clfVar.b;
        }
    }
}
