package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fow extends defpackage.fou {
    public final long a;
    public final long b;

    public fow(long j, long j2, java.util.List list) {
        this.a = j;
        this.b = j2;
        j$.util.DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.fou
    public final java.lang.String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.a + ", programSplicePlaybackPositionUs= " + this.b + " }";
    }
}
