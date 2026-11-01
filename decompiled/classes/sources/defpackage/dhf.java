package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhf {
    private final android.content.res.Resources.Theme a;
    private final int b;

    public dhf(android.content.res.Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhf) {
            defpackage.dhf dhfVar = (defpackage.dhf) obj;
            if (defpackage.aooh.n(this.a, dhfVar.a) && this.b == dhfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ')';
    }
}
