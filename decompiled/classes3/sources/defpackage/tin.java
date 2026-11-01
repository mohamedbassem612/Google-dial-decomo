package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tin {
    public final long a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final j$.util.Optional e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final long h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final int k;
    public final long l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final j$.util.Optional o;
    public final wgi p;
    public final boolean q;
    public final nwx r;
    public final java.lang.String s;
    public final int t;

    public tin(long j, int i, java.lang.String str, java.lang.String str2, j$.util.Optional optional, java.lang.String str3, java.lang.String str4, long j2, java.lang.String str5, java.lang.String str6, int i2, long j3, java.lang.String str7, java.lang.String str8, j$.util.Optional optional2, int i3, wgi wgiVar, boolean z, nwx nwxVar, java.lang.String str9) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = optional;
        this.f = str3;
        this.g = str4;
        this.h = j2;
        this.i = str5;
        this.j = str6;
        this.k = i2;
        this.l = j3;
        this.m = str7;
        this.n = str8;
        this.o = optional2;
        this.t = i3;
        this.p = wgiVar;
        this.q = z;
        this.r = nwxVar;
        this.s = str9;
    }

    public static defpackage.tin b(android.database.Cursor cursor, j$.util.Optional optional, int i) {
        defpackage.til tilVar = new defpackage.til();
        tilVar.d(cursor.getLong(0));
        tilVar.j(cursor.getInt(1));
        tilVar.a = cursor.getString(2);
        tilVar.b = cursor.getString(3);
        tilVar.g(j$.util.Optional.ofNullable(cursor.getString(13)));
        tilVar.c = cursor.getString(4);
        tilVar.d = cursor.getString(5);
        tilVar.h(cursor.getLong(6));
        tilVar.e = cursor.getString(7);
        tilVar.f = cursor.getString(8);
        tilVar.b(cursor.getInt(9));
        tilVar.c(cursor.getLong(10));
        tilVar.g = cursor.getString(11);
        tilVar.h = cursor.getString(12);
        tilVar.i(optional);
        tilVar.j = i;
        tilVar.k(wgi.a);
        tilVar.e(cursor.getInt(14) == 1);
        tilVar.f(nwx.a);
        return tilVar.a();
    }

    public final java.lang.String a(android.content.Context context) {
        lvo lvoVarA = ((tim) agab.aH(context, tim.class)).iz().a();
        int iOrdinal = lvoVarA.ordinal();
        if (iOrdinal == 0) {
            return this.f;
        }
        if (iOrdinal == 1) {
            return this.g;
        }
        throw new java.lang.AssertionError(java.lang.String.format("Unsupported display order: %s", lvoVarA));
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tin) {
            defpackage.tin tinVar = (defpackage.tin) obj;
            if (this.a == tinVar.a && this.b == tinVar.b && ((str = this.c) != null ? str.equals(tinVar.c) : tinVar.c == null) && ((str2 = this.d) != null ? str2.equals(tinVar.d) : tinVar.d == null) && this.e.equals(tinVar.e) && ((str3 = this.f) != null ? str3.equals(tinVar.f) : tinVar.f == null) && ((str4 = this.g) != null ? str4.equals(tinVar.g) : tinVar.g == null) && this.h == tinVar.h && ((str5 = this.i) != null ? str5.equals(tinVar.i) : tinVar.i == null) && ((str6 = this.j) != null ? str6.equals(tinVar.j) : tinVar.j == null) && this.k == tinVar.k && this.l == tinVar.l && ((str7 = this.m) != null ? str7.equals(tinVar.m) : tinVar.m == null) && ((str8 = this.n) != null ? str8.equals(tinVar.n) : tinVar.n == null) && this.o.equals(tinVar.o)) {
                int i = this.t;
                int i2 = tinVar.t;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.p.equals(tinVar.p) && this.q == tinVar.q && this.r.equals(tinVar.r)) {
                    java.lang.String str9 = this.s;
                    if (str9 == null) {
                        if (tinVar.s == null) {
                            return true;
                        }
                    } else if (str9.equals(tinVar.s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        int i = this.b;
        java.lang.String str2 = this.d;
        int iHashCode2 = ((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ i) * 1000003) ^ iHashCode) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.e.hashCode();
        java.lang.String str3 = this.f;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.g;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        long j2 = this.h;
        int i2 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        java.lang.String str5 = this.i;
        int iHashCode5 = (i2 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        java.lang.String str6 = this.j;
        int iHashCode6 = (((iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.k) * 1000003;
        long j3 = this.l;
        int i3 = (iHashCode6 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        java.lang.String str7 = this.m;
        int iHashCode7 = (i3 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        java.lang.String str8 = this.n;
        int iHashCode8 = (((iHashCode7 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.o.hashCode()) * 1000003;
        int i4 = this.t;
        anty.aJ(i4);
        int iHashCode9 = (((((((iHashCode8 ^ i4) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.r.hashCode()) * 1000003;
        java.lang.String str9 = this.s;
        return iHashCode9 ^ (str9 != null ? str9.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.t;
        j$.util.Optional optional = this.o;
        java.lang.String strValueOf = java.lang.String.valueOf(this.e);
        java.lang.String strValueOf2 = java.lang.String.valueOf(optional);
        if (i == 1) {
            str = "NAME";
        } else if (i != 2) {
            str = i != 3 ? "null" : "OTHER";
        } else {
            str = "NUMBER";
        }
        java.lang.String str2 = this.n;
        java.lang.String str3 = this.m;
        long j = this.l;
        int i2 = this.k;
        java.lang.String str4 = this.j;
        java.lang.String str5 = this.i;
        long j2 = this.h;
        java.lang.String str6 = this.g;
        java.lang.String str7 = this.f;
        java.lang.String str8 = this.d;
        java.lang.String str9 = str;
        java.lang.String str10 = this.c;
        int i3 = this.b;
        long j3 = this.a;
        wgi wgiVar = this.p;
        boolean z = this.q;
        nwx nwxVar = this.r;
        java.lang.String str11 = this.s;
        return "Cp2PhoneEntry{id=" + j3 + ", type=" + i3 + ", label=" + str10 + ", number=" + str8 + ", normalizedNumber=" + strValueOf + ", displayNamePrimary=" + str7 + ", displayNameAlternative=" + str6 + ", photoId=" + j2 + ", photoThumbnailUri=" + str5 + ", lookupKey=" + str4 + ", carrierPresence=" + i2 + ", contactId=" + j + ", sortKeyPrimary=" + str3 + ", sortKeyAlternative=" + str2 + ", snippet=" + strValueOf2 + ", matchType=" + str9 + ", wifiCallingIconsConfig=" + java.lang.String.valueOf(wgiVar) + ", isStarred=" + z + ", meetReachability=" + java.lang.String.valueOf(nwxVar) + ", externalUri=" + str11 + '}';
    }

    public tin() {
        throw null;
    }
}
