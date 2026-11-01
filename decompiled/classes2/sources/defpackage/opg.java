package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opg {
    public static final aimz a = aimz.i("com/android/dialer/geocoding/impl/httpfetcher/impl/HttpFetcherImpl");
    private final android.content.Context b;

    public opg(android.content.Context context) {
        this.b = context;
    }

    private static void b(java.lang.String str) {
        java.lang.String string;
        android.net.Uri uri = android.net.Uri.parse(str);
        android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
        for (java.lang.String str2 : uri.getQueryParameterNames()) {
            if ("access_token".equals(str2)) {
                builderPath.appendQueryParameter(str2, "token");
            } else {
                java.lang.String queryParameter = uri.getQueryParameter(str2);
                if ("id".equals(str2)) {
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        for (int i = 0; i < queryParameter.length(); i++) {
                            char cCharAt = queryParameter.charAt(i);
                            if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                                sb.append(cCharAt);
                            } else {
                                sb.append('x');
                            }
                        }
                        string = sb.toString();
                    }
                    builderPath.appendQueryParameter(str2, string);
                } else {
                    builderPath.appendQueryParameter(str2, queryParameter);
                }
            }
        }
        builderPath.toString();
    }

    public final java.net.URL a(java.lang.String str) {
        java.lang.String strA = zhu.b(this.b.getContentResolver()).a(str).a(str);
        if (strA == null) {
            b(str);
            return null;
        }
        b(strA);
        if (!strA.equals(str)) {
            b(str);
            b(strA);
        }
        try {
            return new java.net.URL(strA);
        } catch (java.net.MalformedURLException e) {
            hgb.g(a.c(), "failed to parse url: %s", str, "com/android/dialer/geocoding/impl/httpfetcher/impl/HttpFetcherImpl", "reWriteUrl", (char) 244, "HttpFetcherImpl.java", e, zct.b);
            return null;
        }
    }
}
