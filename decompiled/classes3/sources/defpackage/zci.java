package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zci extends wsc {
    public final byte[] a;

    public zci(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zci) && aooh.n(this.a, ((defpackage.zci) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "BytesValue(value=" + java.util.Arrays.toString(this.a) + ')';
    }
}
