package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class trg {
    public final iht a;

    public trg(iht ihtVar) {
        this.a = ihtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.trg) && this.a == ((defpackage.trg) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPrismStartFailed(reason=" + this.a + ')';
    }
}
