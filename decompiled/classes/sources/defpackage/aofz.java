package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aofz {
    public static final defpackage.aofz a;
    private static final defpackage.aofx[] f;
    final boolean b = true;
    public final java.lang.String[] c;
    public final java.lang.String[] d;
    public final boolean e;

    static {
        defpackage.aofx[] aofxVarArr = {defpackage.aofx.TLS_AES_128_GCM_SHA256, defpackage.aofx.TLS_AES_256_GCM_SHA384, defpackage.aofx.TLS_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, defpackage.aofx.TLS_RSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_RSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_RSA_WITH_AES_128_CBC_SHA, defpackage.aofx.TLS_RSA_WITH_AES_256_CBC_SHA, defpackage.aofx.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = aofxVarArr;
        defpackage.aofy aofyVar = new defpackage.aofy();
        aofyVar.a(aofxVarArr);
        aofyVar.c(defpackage.aogj.TLS_1_3, defpackage.aogj.TLS_1_2);
        aofyVar.b();
        defpackage.aofz aofzVar = new defpackage.aofz(aofyVar);
        a = aofzVar;
        defpackage.aofy aofyVar2 = new defpackage.aofy(aofzVar);
        aofyVar2.c(defpackage.aogj.TLS_1_3, defpackage.aogj.TLS_1_2, defpackage.aogj.TLS_1_1, defpackage.aogj.TLS_1_0);
        aofyVar2.b();
    }

    public aofz(defpackage.aofy aofyVar) {
        this.c = aofyVar.a;
        this.d = aofyVar.b;
        this.e = aofyVar.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aofz)) {
            return false;
        }
        if (obj != this) {
            defpackage.aofz aofzVar = (defpackage.aofz) obj;
            boolean z = aofzVar.b;
            if (!java.util.Arrays.equals(this.c, aofzVar.c) || !java.util.Arrays.equals(this.d, aofzVar.d) || this.e != aofzVar.e) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((java.util.Arrays.hashCode(this.c) + 527) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.util.List listA;
        defpackage.aogj aogjVar;
        java.lang.String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            defpackage.aofx[] aofxVarArr = new defpackage.aofx[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                java.lang.String str = strArr[i];
                defpackage.aofx aofxVar = defpackage.aofx.TLS_RSA_WITH_NULL_MD5;
                aofxVarArr[i] = str.startsWith("SSL_") ? defpackage.aofx.a("TLS_".concat(java.lang.String.valueOf(str.substring(4)))) : defpackage.aofx.a(str);
            }
            listA = aogk.a(aofxVarArr);
        }
        java.lang.String string = listA == null ? "[use default]" : listA.toString();
        java.lang.String[] strArr2 = this.d;
        defpackage.aogj[] aogjVarArr = new defpackage.aogj[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            java.lang.String str2 = strArr2[i2];
            boolean zEquals = "TLSv1.3".equals(str2);
            defpackage.aogj aogjVar2 = defpackage.aogj.TLS_1_3;
            if (zEquals) {
                aogjVar = defpackage.aogj.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                aogjVar = defpackage.aogj.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                aogjVar = defpackage.aogj.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                aogjVar = defpackage.aogj.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(str2)));
                }
                aogjVar = defpackage.aogj.SSL_3_0;
            }
            aogjVarArr[i2] = aogjVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + java.lang.String.valueOf(aogk.a(aogjVarArr)) + ", supportsTlsExtensions=" + this.e + ')';
    }
}
