package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cej extends defpackage.clt {
    public long a;

    public cej(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.clt
    public final defpackage.clt b(long j) {
        return new defpackage.cej(j, this.a);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        }
        this.a = ((defpackage.cej) cltVar).a;
    }
}
