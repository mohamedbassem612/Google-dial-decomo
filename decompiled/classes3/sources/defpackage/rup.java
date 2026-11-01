package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rup {
    public final java.util.regex.Pattern a;
    public final boolean b;

    public rup(java.util.regex.Pattern pattern, boolean z) {
        if (pattern == null) {
            throw new java.lang.NullPointerException("Null pattern");
        }
        this.a = pattern;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rup) {
            defpackage.rup rupVar = (defpackage.rup) obj;
            if (this.a.equals(rupVar.a) && this.b == rupVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "MmiCodeRegexInfo{pattern=" + this.a.toString() + ", conflictsWithCarrier=" + this.b + '}';
    }

    public rup() {
        throw null;
    }
}
