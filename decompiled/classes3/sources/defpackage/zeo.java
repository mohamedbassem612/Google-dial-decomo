package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zeo {
    public final java.lang.String a;
    public final defpackage.zdv b;
    public final long c;

    public zeo(java.lang.String str, defpackage.zdv zdvVar, long j) {
        aooh.f(str, "e164PhoneNumber");
        aooh.f(zdvVar, "dialerCapability");
        this.a = str;
        this.b = zdvVar;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zeo) {
            defpackage.zeo zeoVar = (defpackage.zeo) obj;
            if (aooh.n(this.a, zeoVar.a) && this.b == zeoVar.b && this.c == zeoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "DialerCapabilityEntity(e164PhoneNumber=" + this.a + ", dialerCapability=" + this.b + ", timestampMillis=" + this.c + ')';
    }
}
