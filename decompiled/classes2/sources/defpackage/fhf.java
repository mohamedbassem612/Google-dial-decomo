package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhf extends defpackage.ffi {
    private final defpackage.eqt c;

    public fhf(defpackage.erm ermVar, defpackage.eqt eqtVar) {
        super(ermVar);
        this.c = eqtVar;
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        super.e(i, erlVar, j);
        defpackage.eqt eqtVar = this.c;
        erlVar.d = eqtVar;
        defpackage.eqq eqqVar = eqtVar.b;
        erlVar.c = null;
        return erlVar;
    }
}
