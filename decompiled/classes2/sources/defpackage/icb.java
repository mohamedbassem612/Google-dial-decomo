package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icb {
    public final java.io.File a;

    public icb(java.io.File file) {
        this.a = file;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.icb) && aooh.n(this.a, ((defpackage.icb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RecordingMetadata(output=" + this.a + ')';
    }
}
