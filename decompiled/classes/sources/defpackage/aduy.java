package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aduy {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;
    public final defpackage.aihd h;
    public final java.lang.String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final java.lang.String n;
    public final long o;
    public final int p;

    public aduy(long j, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.String str5, defpackage.aihd aihdVar, java.lang.String str6, long j2, long j3, int i3, long j4, java.lang.String str7, long j5) {
        this.a = j;
        this.b = str;
        this.p = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = aihdVar;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
        this.o = j5;
    }

    public static defpackage.adux a() {
        defpackage.adux aduxVar = new defpackage.adux();
        aduxVar.f(0L);
        aduxVar.i(0);
        aduxVar.e = defpackage.aikn.a;
        aduxVar.j(0L);
        aduxVar.h(0L);
        aduxVar.g(0);
        aduxVar.d(0L);
        aduxVar.e(0L);
        return aduxVar;
    }

    public static defpackage.aduy d(long j, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.String str5, defpackage.aihd aihdVar, java.lang.String str6, long j2, long j3, int i3, long j4, java.lang.String str7, long j5) {
        defpackage.adux aduxVarA = a();
        aduxVarA.f(j);
        aduxVarA.c(str);
        aduxVarA.h = i;
        aduxVarA.a = str2;
        aduxVarA.b = str3;
        aduxVarA.c = str4;
        aduxVarA.i(i2);
        aduxVarA.d = str5;
        aduxVarA.e = aihdVar;
        aduxVarA.f = str6;
        aduxVarA.j(j2);
        aduxVarA.h(j3);
        aduxVarA.g(i3);
        aduxVarA.d(j4);
        aduxVarA.g = str7;
        aduxVarA.e(j5);
        return aduxVarA.a();
    }

    public final com.google.android.libraries.notifications.platform.registration.AccountRepresentation b() {
        int i = this.p;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            return new com.google.android.libraries.notifications.platform.registration.Gaia(this.b);
        }
        if (i == 2) {
            return com.google.android.libraries.notifications.platform.registration.Zwieback.a;
        }
        if (i == 3) {
            return com.google.android.libraries.notifications.platform.registration.YouTubeVisitor.a;
        }
        java.lang.String str = this.b;
        return i != 4 ? new com.google.android.libraries.notifications.platform.registration.Fitbit(str, this.o) : new com.google.android.libraries.notifications.platform.registration.DelegatedGaia(str);
    }

    public final boolean c() {
        return b().b();
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.aihd aihdVar;
        java.lang.String str5;
        java.lang.String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aduy) {
            defpackage.aduy aduyVar = (defpackage.aduy) obj;
            if (this.a == aduyVar.a && this.b.equals(aduyVar.b)) {
                int i = this.p;
                int i2 = aduyVar.p;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.c) != null ? str.equals(aduyVar.c) : aduyVar.c == null) && ((str2 = this.d) != null ? str2.equals(aduyVar.d) : aduyVar.d == null) && ((str3 = this.e) != null ? str3.equals(aduyVar.e) : aduyVar.e == null) && this.f == aduyVar.f && ((str4 = this.g) != null ? str4.equals(aduyVar.g) : aduyVar.g == null) && ((aihdVar = this.h) != null ? aihdVar.equals(aduyVar.h) : aduyVar.h == null) && ((str5 = this.i) != null ? str5.equals(aduyVar.i) : aduyVar.i == null) && this.j == aduyVar.j && this.k == aduyVar.k && this.l == aduyVar.l && this.m == aduyVar.m && ((str6 = this.n) != null ? str6.equals(aduyVar.n) : aduyVar.n == null) && this.o == aduyVar.o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ defpackage.a.aq(this.p);
        java.lang.String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.e;
        int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f) * 1000003;
        java.lang.String str4 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        defpackage.aihd aihdVar = this.h;
        int iHashCode6 = (iHashCode5 ^ (aihdVar == null ? 0 : aihdVar.hashCode())) * 1000003;
        java.lang.String str5 = this.i;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        long j2 = this.j;
        int i = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        long j3 = this.k;
        int i2 = (((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i3 = (i2 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        java.lang.String str6 = this.n;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        long j5 = this.o;
        return ((i3 ^ iHashCode8) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("SpecificId", defpackage.aesg.p(this.b));
        return ahymVarL.toString();
    }

    public aduy() {
        throw null;
    }
}
