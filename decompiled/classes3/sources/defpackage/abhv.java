package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhv {
    private final boolean a;

    public abhv(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.abhv)) {
            return false;
        }
        boolean z = ((defpackage.abhv) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final java.lang.String toString() {
        return "Flags(disallowFocusable=false)";
    }

    public abhv() {
        this(null);
    }
}
