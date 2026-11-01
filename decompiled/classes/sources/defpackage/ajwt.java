package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwt {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final long e;
    public final java.lang.String f;
    public final int g;

    static {
        a().a();
    }

    public ajwt(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, long j, long j2, java.lang.String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    public static defpackage.ajws a() {
        defpackage.ajws ajwsVar = new defpackage.ajws();
        ajwsVar.d(0L);
        ajwsVar.c(1);
        ajwsVar.b(0L);
        return ajwsVar;
    }

    public final boolean b() {
        return this.g == 5;
    }

    public final boolean c() {
        int i = this.g;
        return i == 2 || i == 1;
    }

    public final boolean d() {
        return this.g == 4;
    }

    public final boolean e() {
        return this.g == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajwt) {
            defpackage.ajwt ajwtVar = (defpackage.ajwt) obj;
            java.lang.String str3 = this.a;
            if (str3 != null ? str3.equals(ajwtVar.a) : ajwtVar.a == null) {
                int i = this.g;
                int i2 = ajwtVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.b) != null ? str.equals(ajwtVar.b) : ajwtVar.b == null) && ((str2 = this.c) != null ? str2.equals(ajwtVar.c) : ajwtVar.c == null) && this.d == ajwtVar.d && this.e == ajwtVar.e) {
                    java.lang.String str4 = this.f;
                    if (str4 == null) {
                        if (ajwtVar.f == null) {
                            return true;
                        }
                    } else if (str4.equals(ajwtVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final defpackage.ajwt f() {
        defpackage.ajws ajwsVar = new defpackage.ajws(this);
        ajwsVar.d = "BAD CONFIG";
        ajwsVar.c(5);
        return ajwsVar.a();
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        defpackage.anty.aJ(i);
        java.lang.String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = ((iHashCode ^ 1000003) * 1000003) ^ i;
        java.lang.String str3 = this.c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.d;
        int i3 = (iHashCode3 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.e;
        int i4 = (i3 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        java.lang.String str4 = this.f;
        return i4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.g;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + str + ", authToken=" + this.b + ", refreshToken=" + this.c + ", expiresInSecs=" + this.d + ", tokenCreationEpochInSecs=" + this.e + ", fisError=" + this.f + '}';
    }

    public ajwt() {
        throw null;
    }
}
