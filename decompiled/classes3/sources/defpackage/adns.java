package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adns {
    private final byte[] a;
    private final android.media.AudioFormat b;

    public adns(byte[] bArr, android.media.AudioFormat audioFormat) {
        this.a = bArr;
        if (audioFormat == null) {
            throw new java.lang.NullPointerException("Null format");
        }
        this.b = audioFormat;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adns) {
            defpackage.adns adnsVar = (defpackage.adns) obj;
            if (java.util.Arrays.equals(this.a, adnsVar instanceof defpackage.adns ? adnsVar.a : adnsVar.a) && this.b.equals(adnsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.util.Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        android.media.AudioFormat audioFormat = this.b;
        return "AudioData{audio=" + java.util.Arrays.toString(this.a) + ", format=" + audioFormat.toString() + '}';
    }

    public adns() {
        throw null;
    }
}
