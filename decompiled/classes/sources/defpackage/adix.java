package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adix extends defpackage.adji {
    public final java.lang.String a;
    public final com.google.android.libraries.micore.superpacks.base.VersionedName b;
    public final int c;
    public final defpackage.aify d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final java.lang.String k;
    public final long l;
    public volatile transient defpackage.adhw m;
    private volatile transient java.lang.String n;
    private volatile transient java.lang.String o;

    public adix(java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, int i, defpackage.aify aifyVar, long j, boolean z, boolean z2, boolean z3, boolean z4, int i2, java.lang.String str2, long j2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.a = str;
        this.b = versionedName;
        this.c = i;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null urls");
        }
        this.d = aifyVar;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null filePath");
        }
        this.k = str2;
        this.l = j2;
    }

    @Override // defpackage.adji
    public final int a() {
        return this.c;
    }

    @Override // defpackage.adji
    public final int b() {
        return this.j;
    }

    @Override // defpackage.adji
    public final long c() {
        return this.e;
    }

    @Override // defpackage.adji
    public final long d() {
        return this.l;
    }

    @Override // defpackage.adji
    public final com.google.android.libraries.micore.superpacks.base.VersionedName e() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adji) {
            defpackage.adji adjiVar = (defpackage.adji) obj;
            if (this.a.equals(adjiVar.h()) && ((versionedName = this.b) != null ? versionedName.equals(adjiVar.e()) : adjiVar.e() == null) && this.c == adjiVar.a() && defpackage.ahvr.aP(this.d, adjiVar.f()) && this.e == adjiVar.c() && this.f == adjiVar.l() && this.g == adjiVar.j() && this.h == adjiVar.k() && this.i == adjiVar.i() && this.j == adjiVar.b() && this.k.equals(adjiVar.g()) && this.l == adjiVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adji
    public final defpackage.aify f() {
        return this.d;
    }

    @Override // defpackage.adji
    public final java.lang.String g() {
        return this.k;
    }

    @Override // defpackage.adji
    public final java.lang.String h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (versionedName == null ? 0 : versionedName.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int iHashCode3 = (((((((((((((iHashCode2 ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        long j2 = this.l;
        return iHashCode3 ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // defpackage.adji
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.adji
    public final boolean j() {
        return this.g;
    }

    @Override // defpackage.adji
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.adji
    public final boolean l() {
        return this.f;
    }

    @Override // defpackage.adji
    public final java.lang.String m() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = "{" + defpackage.adik.a(true != this.f ? 2 : 1, true != this.g ? 2 : 1, true != this.h ? 2 : 1, true == this.i ? 1 : 2) + ", " + defpackage.adik.g(this.j) + '}';
                    if (this.n == null) {
                        throw new java.lang.NullPointerException("paramsString() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.adji
    public final java.lang.String toString() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    defpackage.ahym ahymVar = new defpackage.ahym("");
                    ahymVar.c();
                    ahymVar.b("id", this.a);
                    ahymVar.b("params", m());
                    ahymVar.b("urls", this.d);
                    ahymVar.e("prio", this.c);
                    long j = this.l;
                    ahymVar.b("ttl", j == 0 ? "never" : defpackage.adik.c(this.e + j));
                    this.o = ahymVar.toString();
                    if (this.o == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.o;
    }
}
