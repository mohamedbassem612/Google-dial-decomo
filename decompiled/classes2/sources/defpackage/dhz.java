package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dhz {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dhz) && this.a == ((defpackage.dhz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (a.x(i, 0)) {
            return "Polite";
        }
        return a.x(i, 1) ? "Assertive" : "Unknown";
    }
}
