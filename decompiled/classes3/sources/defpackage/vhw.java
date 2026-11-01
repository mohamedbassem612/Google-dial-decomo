package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhw {
    public static final /* synthetic */ int a = 0;
    private static final aimz b = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeUtility");
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("\r|\n");

    public static defpackage.vha a(android.content.Context context, java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStreamB = b(inputStream, str);
        defpackage.vho vhoVar = new defpackage.vho(context);
        java.io.OutputStream outputStreamC = vhoVar.c();
        try {
            try {
                defpackage.apqy.b(inputStreamB, outputStreamC);
            } catch (android.util.Base64DataException e) {
                b.c().i(zct.b).k(e).m(aioa.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeUtility", "decodeBody", 356, "MimeUtility.java").v("failed to copy bytes during encoding");
            }
            return vhoVar;
        } finally {
            outputStreamC.close();
        }
    }

    public static java.io.InputStream b(java.io.InputStream inputStream, java.lang.String str) {
        aprt base64InputStream;
        if (str == null) {
            return inputStream;
        }
        java.lang.String strC = c(str, null);
        if ("quoted-printable".equalsIgnoreCase(strC)) {
            base64InputStream = new aprt(inputStream, aprr.b);
        } else {
            if (!"base64".equalsIgnoreCase(strC)) {
                return inputStream;
            }
            base64InputStream = new android.util.Base64InputStream(inputStream, 0);
        }
        return base64InputStream;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        java.util.List<java.lang.String> listJ = ahzf.b(';').j(d(str));
        if (str2 == null) {
            return ((java.lang.String) listJ.get(0)).trim();
        }
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.US);
        for (java.lang.String str3 : listJ) {
            if (str3.trim().toLowerCase(java.util.Locale.US).startsWith(lowerCase)) {
                java.lang.String[] strArrSplit = str3.split("=", 2);
                if (strArrSplit.length < 2) {
                    break;
                }
                java.lang.String strTrim = strArrSplit[1].trim();
                return (strTrim.startsWith("\"") && strTrim.endsWith("\"")) ? strTrim.substring(1, strTrim.length() - 1) : strTrim;
            }
        }
        return null;
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        matcher.reset();
        return matcher.replaceAll("");
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String strD = d(str);
        if (strD == null) {
            return null;
        }
        return aprs.a(strD, aprr.a);
    }
}
