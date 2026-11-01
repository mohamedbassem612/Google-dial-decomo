package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adur {
    private final boolean a;

    public adur(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adur)) {
            return false;
        }
        boolean z = ((defpackage.adur) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final java.lang.String toString() {
        return "ExpeditedJobs(registration=false)";
    }

    public adur() {
        this(null);
    }
}
