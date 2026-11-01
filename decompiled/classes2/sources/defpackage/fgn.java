package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgn extends defpackage.ffi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgn(defpackage.fgp fgpVar, defpackage.erm ermVar) {
        super(ermVar);
        j$.util.Objects.requireNonNull(fgpVar);
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        super.d(i, erkVar, z);
        erkVar.g = true;
        return erkVar;
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        super.e(i, erlVar, j);
        erlVar.k = true;
        return erlVar;
    }
}
