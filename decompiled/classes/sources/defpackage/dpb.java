package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpb {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpb) && this.a == ((defpackage.dpb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (defpackage.a.x(i, 1)) {
            return "Linearity.Linear";
        }
        if (defpackage.a.x(i, 2)) {
            return "Linearity.FontHinting";
        }
        return defpackage.a.x(i, 3) ? "Linearity.None" : "Invalid";
    }
}
