package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjg {
    public final defpackage.ied a;
    private final long b;
    private final java.lang.String c;
    private final android.view.View.OnClickListener d;

    public kjg(long j, java.lang.String str, android.view.View.OnClickListener onClickListener, defpackage.ied iedVar) {
        aooh.f(str, "transcriptAudioFilePath");
        this.b = j;
        this.c = str;
        this.d = onClickListener;
        this.a = iedVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kjg) {
            defpackage.kjg kjgVar = (defpackage.kjg) obj;
            if (this.b == kjgVar.b && aooh.n(this.c, kjgVar.c) && aooh.n(this.d, kjgVar.d) && aooh.n(this.a, kjgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((anty.M(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        defpackage.ied iedVar = this.a;
        return (iM * 31) + (iedVar == null ? 0 : iedVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TranscriptRecordingViewData(coalescedRowId=" + this.b + ", transcriptAudioFilePath=" + this.c + ", onTranscriptDeleteListener=" + this.d + ", audioInfo=" + this.a + ')';
    }
}
