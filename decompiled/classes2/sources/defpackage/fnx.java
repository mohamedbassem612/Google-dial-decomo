package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnx implements defpackage.eqx {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public fnx(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static defpackage.fnx d(defpackage.etx etxVar) {
        int i = etxVar.i();
        java.lang.String strD = defpackage.eqz.d(etxVar.D(etxVar.i(), java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String strC = etxVar.C(etxVar.i());
        int i2 = etxVar.i();
        int i3 = etxVar.i();
        int i4 = etxVar.i();
        int i5 = etxVar.i();
        int i6 = etxVar.i();
        byte[] bArr = new byte[i6];
        etxVar.L(bArr, 0, i6);
        return new defpackage.fnx(i, strD, strC, i2, i3, i4, i5, bArr);
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        eqvVar.a(this.h, this.a);
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
            defpackage.fnx fnxVar = (defpackage.fnx) obj;
            if (this.a == fnxVar.a && this.b.equals(fnxVar.b) && this.c.equals(fnxVar.c) && this.d == fnxVar.d && this.e == fnxVar.e && this.f == fnxVar.f && this.g == fnxVar.g && java.util.Arrays.equals(this.h, fnxVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + java.util.Arrays.hashCode(this.h);
    }

    public final java.lang.String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
