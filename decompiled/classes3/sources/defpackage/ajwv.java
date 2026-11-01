package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajwv {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.ajwy c;
    public final int d;
    private final java.lang.String e;

    public ajwv(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.ajwy ajwyVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = ajwyVar;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajwv) {
            defpackage.ajwv ajwvVar = (defpackage.ajwv) obj;
            java.lang.String str = this.e;
            if (str != null ? str.equals(ajwvVar.e) : ajwvVar.e == null) {
                java.lang.String str2 = this.a;
                if (str2 != null ? str2.equals(ajwvVar.a) : ajwvVar.a == null) {
                    java.lang.String str3 = this.b;
                    if (str3 != null ? str3.equals(ajwvVar.b) : ajwvVar.b == null) {
                        defpackage.ajwy ajwyVar = this.c;
                        if (ajwyVar != null ? ajwyVar.equals(ajwvVar.c) : ajwvVar.c == null) {
                            int i = this.d;
                            if (i == 0) {
                                if (ajwvVar.d == 0) {
                                    return true;
                                }
                            } else if (i == ajwvVar.d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.e;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.a;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.String str3 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        defpackage.ajwy ajwyVar = this.c;
        int iHashCode4 = (iHashCode3 ^ (ajwyVar == null ? 0 : ajwyVar.hashCode())) * 1000003;
        int i2 = this.d;
        return iHashCode4 ^ (i2 != 0 ? i2 : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.d;
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + strValueOf + ", responseCode=" + str + '}';
    }

    public ajwv() {
        throw null;
    }
}
