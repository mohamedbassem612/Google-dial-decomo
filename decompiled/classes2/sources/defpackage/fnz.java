package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnz implements defpackage.eqx {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final int f;

    public fnz(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        ahvr.bM(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        java.lang.String str = this.c;
        if (str != null) {
            eqvVar.y = str;
        }
        java.lang.String str2 = this.b;
        if (str2 != null) {
            eqvVar.x = str2;
        }
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fnz fnzVar = (defpackage.fnz) obj;
            if (this.a == fnzVar.a && j$.util.Objects.equals(this.b, fnzVar.b) && j$.util.Objects.equals(this.c, fnzVar.c) && j$.util.Objects.equals(this.d, fnzVar.d) && this.e == fnzVar.e && this.f == fnzVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        java.lang.String str2 = this.c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        java.lang.String str3 = this.d;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
