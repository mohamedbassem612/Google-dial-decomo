package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aing extends defpackage.ainh {
    private final java.lang.String b;
    private final java.lang.String c;
    private final int d;
    private final java.lang.String e;
    private int f = 0;

    public aing(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.ainh
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ainh
    public final java.lang.String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ainh
    public final java.lang.String c() {
        java.lang.String str = this.e;
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(java.io.File.separatorChar) + 1);
    }

    @Override // defpackage.ainh
    public final java.lang.String d() {
        return this.c;
    }

    @Override // defpackage.ainh
    public final java.lang.String e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aing)) {
            return false;
        }
        defpackage.aing aingVar = (defpackage.aing) obj;
        if (!this.c.equals(aingVar.c) || this.d != aingVar.d) {
            return false;
        }
        java.lang.String str = this.b;
        java.lang.String str2 = aingVar.b;
        if (str != str2) {
            if (str.length() != str2.length()) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2 && ((cCharAt & (-2)) != 46 || (cCharAt ^ cCharAt2) != 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
