package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mfj {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    private final long d;
    private final java.lang.String e;
    private final long f;
    private final int g;

    public mfj(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, long j3, int i) {
        this.a = j;
        this.d = j2;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = j3;
        this.g = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mfj) {
            defpackage.mfj mfjVar = (defpackage.mfj) obj;
            if (this.a == mfjVar.a && this.d == mfjVar.d && this.b.equals(mfjVar.b) && this.c.equals(mfjVar.c) && this.e.equals(mfjVar.e) && this.f == mfjVar.f && this.g == mfjVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int iHashCode = ((((((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode();
        long j3 = this.f;
        return (((iHashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.g;
    }

    public final java.lang.String toString() {
        return "SmartDialContact{id=" + this.a + ", dataId=" + this.d + ", displayName=" + this.b + ", phoneNumber=" + this.c + ", lookupKey=" + this.e + ", photoId=" + this.f + ", carrierPresence=" + this.g + '}';
    }

    public mfj() {
        throw null;
    }
}
