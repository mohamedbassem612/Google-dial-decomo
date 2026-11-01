package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjq {
    public java.lang.String a;
    public boolean b = false;
    public bjc c = null;
    private final java.lang.String d;

    public bjq(java.lang.String str, java.lang.String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjq) {
            defpackage.bjq bjqVar = (defpackage.bjq) obj;
            if (aooh.n(this.d, bjqVar.d) && aooh.n(this.a, bjqVar.a) && this.b == bjqVar.b && aooh.n(this.c, bjqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = true != this.b ? 1237 : 1231;
        bjc bjcVar = this.c;
        return (((iHashCode * 31) + i) * 31) + (bjcVar == null ? 0 : bjcVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}
