package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tii {
    public final long a;
    public final java.lang.String b;
    private final boolean c;

    public tii(long j, java.lang.String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tii) {
            defpackage.tii tiiVar = (defpackage.tii) obj;
            if (this.a == tiiVar.a && ((str = this.b) != null ? str.equals(tiiVar.b) : tiiVar.b == null) && this.c == tiiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "Directory{getId=" + this.a + ", getDisplayName=" + this.b + ", supportsPhotos=" + this.c + '}';
    }

    public tii() {
        throw null;
    }
}
