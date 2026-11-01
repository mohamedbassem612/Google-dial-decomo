package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krd {
    public final defpackage.ied a;
    private final ahey b;

    public krd(defpackage.ied iedVar, ahey aheyVar) {
        this.a = iedVar;
        this.b = aheyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.krd) {
            defpackage.krd krdVar = (defpackage.krd) obj;
            if (aooh.n(this.a, krdVar.a) && aooh.n(this.b, krdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ied iedVar = this.a;
        return ((iedVar == null ? 0 : iedVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPlayerUiState(audioInfo=" + this.a + ", viewContext=" + this.b + ')';
    }
}
