package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsv {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b = "adsv";

    public static java.io.InputStream a(java.lang.String str) throws defpackage.adsu {
        defpackage.ahvr.bM(str.startsWith("data:"));
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            android.util.Log.e(b, "Comma not found in data URI: ".concat(java.lang.String.valueOf(str)));
            throw new defpackage.adsu(1);
        }
        java.lang.String strSubstring = str.substring(iIndexOf + 1);
        java.lang.String[] strArrSplit = str.substring(5, iIndexOf).split(";");
        boolean z = false;
        for (int i = 1; i < strArrSplit.length; i++) {
            java.lang.String str2 = strArrSplit[i];
            if (str2.equals("base64")) {
                z = true;
            } else if (!str2.startsWith("charset=")) {
                android.util.Log.e(b, defpackage.hgb.n(str, str2, "Unknown data-URI option '", "' in "));
                throw new defpackage.adsu(2);
            }
        }
        if (!z) {
            android.util.Log.e(b, "We only understand base64-encoded data URIs: ".concat(java.lang.String.valueOf(str)));
            throw new defpackage.adsu(3);
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(strSubstring, 0);
            android.util.Log.i(b, "Successfully decoded data uri: ".concat(java.lang.String.valueOf(str)));
            return new java.io.ByteArrayInputStream(bArrDecode);
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.e(b, "Invalid base64 payload in data URI: ".concat(java.lang.String.valueOf(str)));
            throw new defpackage.adsu(4);
        }
    }
}
