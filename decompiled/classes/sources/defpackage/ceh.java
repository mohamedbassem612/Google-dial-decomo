package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ceh extends defpackage.clt {
    public int a;

    public ceh(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.clt
    public final defpackage.clt b(long j) {
        return new defpackage.ceh(j, this.a);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        }
        this.a = ((defpackage.ceh) cltVar).a;
    }
}
