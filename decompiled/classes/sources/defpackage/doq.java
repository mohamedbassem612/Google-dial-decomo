package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class doq {
    public final int a;

    public static java.lang.String a(int i) {
        if (defpackage.a.x(i, 0)) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (defpackage.a.x(i, 1)) {
            return "LineHeightStyle.Mode.Minimum";
        }
        if (defpackage.a.x(i, 2)) {
            return "LineHeightStyle.Mode.Tight";
        }
        return defpackage.a.x(i, 3) ? "LineHeightStyle.Mode.PerLine" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.doq) && this.a == ((defpackage.doq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
