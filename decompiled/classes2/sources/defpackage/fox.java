package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fox extends defpackage.fou {
    public final long a;
    public final long b;

    public fox(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long d(defpackage.etx etxVar, long j) {
        long jN = etxVar.n();
        if ((128 & jN) != 0) {
            return ((((jN & 1) << 32) | etxVar.w()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.fou
    public final java.lang.String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }
}
