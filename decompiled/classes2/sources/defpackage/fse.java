package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fse extends defpackage.fro implements java.lang.Comparable {
    public long i;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.fse fseVar = (defpackage.fse) obj;
        if (dL(4) == fseVar.dL(4)) {
            long j = this.f - fseVar.f;
            if (j == 0) {
                j = this.i - fseVar.i;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!dL(4)) {
            return -1;
        }
        return 1;
    }
}
