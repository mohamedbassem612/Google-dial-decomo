package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazd {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public aazd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.aooh.f(str, "packageName");
        defpackage.aooh.f(str2, "role");
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str3 != null && str3.length() != 0 && defpackage.aooh.n(str2, "")) {
            throw new java.lang.IllegalArgumentException("If a group is set, default role (\"\") should not be used.");
        }
    }

    public final java.lang.String a() {
        java.lang.String str = this.c;
        if (str == null || str.length() == 0) {
            return b();
        }
        return str + ':' + this.b;
    }

    public final java.lang.String b() {
        java.lang.String str = this.c;
        if (str != null && str.length() != 0) {
            return str + ':' + this.b + ':' + this.a;
        }
        java.lang.String str2 = this.b;
        boolean zN = defpackage.aooh.n(str2, "");
        java.lang.String str3 = this.a;
        if (zN) {
            return str3;
        }
        return str3 + ':' + str2;
    }

    public final java.lang.String c() {
        java.lang.String str = this.c;
        return (str == null || str.length() == 0) ? this.a : str;
    }

    public final java.lang.String d() {
        java.lang.String str = this.c;
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aazd) {
            defpackage.aazd aazdVar = (defpackage.aazd) obj;
            if (defpackage.aooh.n(this.a, aazdVar.a) && defpackage.aooh.n(this.b, aazdVar.b) && defpackage.aooh.n(this.c, aazdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return b();
    }
}
