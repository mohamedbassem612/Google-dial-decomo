package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nih {
    public final defpackage.hxf a;
    public final java.lang.String b;
    public final long c;

    public nih(defpackage.hxf hxfVar, java.lang.String str, long j) {
        aooh.f(str, "audioFilePath");
        this.a = hxfVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nih) {
            defpackage.nih nihVar = (defpackage.nih) obj;
            if (aooh.n(this.a, nihVar.a) && aooh.n(this.b, nihVar.b) && this.c == nihVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.hxf hxfVar = this.a;
        return ((((hxfVar == null ? 0 : hxfVar.hashCode()) * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "PlaybackSessionAndAudioFilePath(playbackSession=" + this.a + ", audioFilePath=" + this.b + ", playingStartedTimeMillis=" + this.c + ')';
    }
}
