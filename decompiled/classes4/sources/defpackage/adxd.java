package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class adxd {
    public final java.net.URL a;
    public final java.lang.String b;
    public final java.util.Map c;
    public final byte[] d;
    public final int e;

    public adxd(java.net.URL url, java.lang.String str, java.util.Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }

    public final defpackage.aoux a() {
        defpackage.aoux aouxVar = new defpackage.aoux(this);
        aouxVar.d = new java.util.HashMap(this.c);
        return aouxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adxd) {
            defpackage.adxd adxdVar = (defpackage.adxd) obj;
            if (this.a.equals(adxdVar.a) && ((str = this.b) != null ? str.equals(adxdVar.b) : adxdVar.b == null) && this.c.equals(adxdVar.c)) {
                boolean z = adxdVar instanceof defpackage.adxd;
                if (java.util.Arrays.equals(this.d, adxdVar.d)) {
                    int i = this.e;
                    int i2 = adxdVar.e;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ java.util.Arrays.hashCode(this.d)) * 1000003;
        int i = this.e;
        anty.aJ(i);
        return iHashCode2 ^ i;
    }

    public final java.lang.String toString() {
        byte[] bArr = this.d;
        java.util.Map map = this.c;
        return "GnpHttpRequest{url=" + java.lang.String.valueOf(this.a) + ", contentType=" + this.b + ", headers=" + java.lang.String.valueOf(map) + ", body=" + java.util.Arrays.toString(bArr) + ", purpose=" + aesg.u(this.e) + '}';
    }

    public adxd() {
        throw null;
    }
}
