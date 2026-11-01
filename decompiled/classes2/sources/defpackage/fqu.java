package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqu implements defpackage.fqz {
    private final defpackage.flo b;
    private final ils d;
    public long a = -1;
    private long c = -1;

    public fqu(defpackage.flo floVar, ils ilsVar) {
        this.b = floVar;
        this.d = ilsVar;
    }

    @Override // defpackage.fqz
    public final long a(defpackage.flk flkVar) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        this.c = -1L;
        return -(j + 2);
    }

    @Override // defpackage.fqz
    public final defpackage.fma b() {
        ahvr.bY(this.a != -1);
        return new defpackage.fln(this.b, this.a);
    }

    @Override // defpackage.fqz
    public final void c(long j) {
        long[] jArr = (long[]) this.d.b;
        this.c = jArr[eum.ac(jArr, j, true)];
    }
}
