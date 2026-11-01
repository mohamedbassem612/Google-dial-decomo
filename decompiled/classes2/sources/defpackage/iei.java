package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iei implements ahth {
    private final defpackage.ied a;

    public iei(defpackage.ied iedVar) {
        aooh.f(iedVar, "audioInfo");
        this.a = iedVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iei) && aooh.n(this.a, ((defpackage.iei) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "PlayAudioEvent(audioInfo=" + this.a + ')';
    }
}
