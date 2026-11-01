package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ghy {
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final int d;
    public final java.lang.String e;
    public final int f;
    public final int g;

    public ghy(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2) {
        aooh.f(str, "name");
        aooh.f(str2, "type");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        int i3 = 5;
        if (str2 != null) {
            java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
            aooh.e(upperCase, "toUpperCase(...)");
            if (aoov.G(upperCase, "INT", false)) {
                i3 = 3;
            } else if (aoov.G(upperCase, "CHAR", false) || aoov.G(upperCase, "CLOB", false) || aoov.G(upperCase, "TEXT", false)) {
                i3 = 2;
            } else if (!aoov.G(upperCase, "BLOB", false)) {
                i3 = (aoov.G(upperCase, "REAL", false) || aoov.G(upperCase, "FLOA", false) || aoov.G(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.g = i3;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ghy) {
            defpackage.ghy ghyVar = (defpackage.ghy) obj;
            if (a() == ghyVar.a() && aooh.n(this.a, ghyVar.a) && this.c == ghyVar.c) {
                java.lang.String str = this.e;
                java.lang.String str2 = ghyVar.e;
                int i = this.f;
                if ((i != 1 || ghyVar.f != 2 || str == null || defpackage.hgu.R(str, str2)) && ((i != 2 || ghyVar.f != 1 || str2 == null || defpackage.hgu.R(str2, str)) && ((i != ghyVar.f || (str == null ? str2 == null : defpackage.hgu.R(str, str2))) && this.g == ghyVar.g))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        java.lang.String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return aoov.m(aoov.n(sb.toString()));
    }
}
