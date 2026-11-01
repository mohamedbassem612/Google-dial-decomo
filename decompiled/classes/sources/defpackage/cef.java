package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cef extends defpackage.clt {
    public float a;

    public cef(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.clt
    public final defpackage.clt b(long j) {
        return new defpackage.cef(j, this.a);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        }
        this.a = ((defpackage.cef) cltVar).a;
    }
}
