package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izp {
    public final defpackage.ied a;
    public final ahey b;

    public izp(defpackage.ied iedVar, ahey aheyVar) {
        aooh.f(iedVar, "audioInfo");
        this.a = iedVar;
        this.b = aheyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.izp) {
            defpackage.izp izpVar = (defpackage.izp) obj;
            if (aooh.n(this.a, izpVar.a) && aooh.n(this.b, izpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPlayerUiState(audioInfo=" + this.a + ", viewContext=" + this.b + ')';
    }
}
