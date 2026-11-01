package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abux {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public abux(long j, long j2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abux) {
            defpackage.abux abuxVar = (defpackage.abux) obj;
            if (this.a == abuxVar.a && this.b == abuxVar.b && this.c == abuxVar.c && this.d == abuxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = defpackage.anty.M(this.a) * 31;
        boolean z = this.d;
        return ((((iM + defpackage.anty.M(this.b)) * 31) + defpackage.anty.L(this.c)) * 31) + defpackage.anty.L(z);
    }

    public final java.lang.String toString() {
        return "InstalledPackagesVersions(contactsVersionCode=" + this.a + ", dialerVersionCode=" + this.b + ", isContactsEnabled=" + this.c + ", isDialerEnabled=" + this.d + ')';
    }
}
