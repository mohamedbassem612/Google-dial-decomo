package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eze extends defpackage.ffi {
    private final defpackage.erl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eze(defpackage.ewy ewyVar, defpackage.erm ermVar) {
        super(ermVar);
        j$.util.Objects.requireNonNull(ewyVar);
        this.c = new defpackage.erl();
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        defpackage.erk erkVarD = super.d(i, erkVar, z);
        if (e(erkVarD.c, this.c, 0L).c()) {
            java.lang.Object obj = erkVar.a;
            java.lang.Object obj2 = erkVar.b;
            int i2 = erkVar.c;
            long j = erkVar.d;
            long j2 = erkVar.f;
            erkVarD.i(obj, obj2, i2, j, 0L, defpackage.ept.a, true, erkVar.e);
        } else {
            erkVarD.g = true;
        }
        return erkVarD;
    }
}
