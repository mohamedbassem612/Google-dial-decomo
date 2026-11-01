package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ked {
    public static final defpackage.ked a = new defpackage.ked(null);
    public final byte[] b;

    public ked(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ked) && java.util.Arrays.equals(this.b, ((defpackage.ked) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }
}
