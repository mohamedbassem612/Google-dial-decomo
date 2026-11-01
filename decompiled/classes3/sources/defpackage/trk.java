package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class trk {
    public final ihv a;

    public trk(ihv ihvVar) {
        this.a = ihvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.trk) && this.a == ((defpackage.trk) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPrismStopFailed(reason=" + this.a + ')';
    }
}
