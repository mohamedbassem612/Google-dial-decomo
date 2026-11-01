package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fot extends defpackage.fou {
    public final long a;
    public final long b;

    public fot(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.fou
    public final java.lang.String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }
}
