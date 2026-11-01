package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adiw extends defpackage.adjc {
    public final com.google.android.libraries.micore.superpacks.base.VersionedName a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final java.lang.String f;
    public final int g;
    private final defpackage.adhw h;
    private volatile transient java.lang.String i;

    public adiw(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j, int i, int i2, long j2, java.lang.String str, int i3) {
        this.h = adhwVar;
        this.a = versionedName;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = str;
        this.g = i3;
    }

    @Override // defpackage.adjc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.adjc
    public final int b() {
        return this.d;
    }

    @Override // defpackage.adjc
    public final int c() {
        return this.g;
    }

    @Override // defpackage.adjc
    public final long d() {
        return this.e;
    }

    @Override // defpackage.adjc
    public final long e() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adjc) {
            defpackage.adjc adjcVar = (defpackage.adjc) obj;
            if (this.h.equals(adjcVar.f()) && ((versionedName = this.a) != null ? versionedName.equals(adjcVar.g()) : adjcVar.g() == null) && this.b == adjcVar.e() && this.c == adjcVar.a() && this.d == adjcVar.b() && this.e == adjcVar.d() && ((str = this.f) != null ? str.equals(adjcVar.h()) : adjcVar.h() == null) && this.g == adjcVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adjc
    public final defpackage.adhw f() {
        return this.h;
    }

    @Override // defpackage.adjc
    public final com.google.android.libraries.micore.superpacks.base.VersionedName g() {
        return this.a;
    }

    @Override // defpackage.adjc
    public final java.lang.String h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() ^ 1000003;
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = this.a;
        int iHashCode2 = versionedName == null ? 0 : versionedName.hashCode();
        long j = this.b;
        int i = ((((((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        java.lang.String str = this.f;
        return ((i2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.g;
    }

    @Override // defpackage.adjc
    public final java.lang.String toString() {
        java.lang.String str;
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    defpackage.ahym ahymVar = new defpackage.ahym("");
                    ahymVar.c();
                    ahymVar.b("name", this.h);
                    int i = this.d;
                    java.util.Set set = defpackage.adik.a;
                    if (i != 0) {
                        str = i != 1 ? "pinned" : "reserved";
                    } else {
                        str = "not_res";
                    }
                    ahymVar.b("state", str);
                    ahymVar.f("size", this.b);
                    ahymVar.e("priority", this.c);
                    ahymVar.b("last access", defpackage.adik.c(this.e));
                    ahymVar.b("source", this.f);
                    ahymVar.e("validation failure", this.g);
                    this.i = ahymVar.toString();
                    if (this.i == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }
}
