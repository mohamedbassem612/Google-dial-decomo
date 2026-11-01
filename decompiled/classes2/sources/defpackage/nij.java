package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nij implements defpackage.nik {
    public final defpackage.nih a;
    public final boolean b;

    public nij(defpackage.nih nihVar, boolean z) {
        this.a = nihVar;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nij) {
            defpackage.nij nijVar = (defpackage.nij) obj;
            if (aooh.n(this.a, nijVar.a) && this.b == nijVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.nih nihVar = this.a;
        return ((nihVar == null ? 0 : nihVar.hashCode()) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "WithPlaybackSession(playbackSessionAndAudioFilePath=" + this.a + ", isCustomGreeting=" + this.b + ')';
    }
}
