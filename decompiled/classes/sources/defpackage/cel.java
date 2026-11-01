package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cel extends defpackage.clt {
    public java.lang.Object a;

    public cel(long j, java.lang.Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.clt
    public final /* bridge */ /* synthetic */ defpackage.clt b(long j) {
        return new defpackage.cel(j, this.a);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        }
        this.a = ((defpackage.cel) cltVar).a;
    }
}
