package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adxe {
    public final java.lang.Integer a;
    public final byte[] b;
    private final java.util.Map c;
    private final byte[] d;
    private final java.lang.Exception e;

    public adxe(java.lang.Integer num, java.util.Map map, byte[] bArr, byte[] bArr2, java.lang.Exception exc) {
        this.a = num;
        this.c = map;
        this.d = bArr;
        this.b = bArr2;
        this.e = exc;
    }

    public static defpackage.wp b() {
        defpackage.wp wpVar = new defpackage.wp();
        wpVar.b = new java.util.HashMap();
        return wpVar;
    }

    public final java.lang.Throwable a() {
        java.lang.Integer num;
        java.lang.Exception exc = this.e;
        return (exc != null || (num = this.a) == null || num.intValue() == 200) ? exc : new defpackage.adxf(num.intValue());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adxe) {
            defpackage.adxe adxeVar = (defpackage.adxe) obj;
            java.lang.Integer num = this.a;
            if (num != null ? num.equals(adxeVar.a) : adxeVar.a == null) {
                if (this.c.equals(adxeVar.c)) {
                    boolean z = adxeVar instanceof defpackage.adxe;
                    if (java.util.Arrays.equals(this.d, z ? adxeVar.d : adxeVar.d)) {
                        if (java.util.Arrays.equals(this.b, z ? adxeVar.b : adxeVar.b)) {
                            java.lang.Exception exc = this.e;
                            if (exc == null) {
                                if (adxeVar.e == null) {
                                    return true;
                                }
                            } else if (exc.equals(adxeVar.e)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = (((((((num == null ? 0 : num.hashCode()) ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ java.util.Arrays.hashCode(this.d)) * 1000003) ^ java.util.Arrays.hashCode(this.b);
        java.lang.Exception exc = this.e;
        return (iHashCode * 1000003) ^ (exc != null ? exc.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.Exception exc = this.e;
        byte[] bArr = this.b;
        byte[] bArr2 = this.d;
        return "GnpHttpResponse{statusCode=" + this.a + ", statusMessage=null, headers=" + java.lang.String.valueOf(this.c) + ", rawBody=" + java.util.Arrays.toString(bArr2) + ", body=" + java.util.Arrays.toString(bArr) + ", exception=" + java.lang.String.valueOf(exc) + '}';
    }

    public adxe() {
        throw null;
    }
}
