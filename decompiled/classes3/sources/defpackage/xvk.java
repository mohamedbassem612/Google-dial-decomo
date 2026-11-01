package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvk implements defpackage.xvb {
    private final defpackage.xzg a;
    private final int b;
    private java.net.HttpURLConnection c;
    private java.io.InputStream d;
    private volatile boolean e;

    public xvk(defpackage.xzg xzgVar, int i) {
        this.a = xzgVar;
        this.b = i;
    }

    private static int c(java.net.HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                android.util.Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            }
            return -1;
        }
    }

    private final java.io.InputStream f(java.net.URL url, int i, java.net.URL url2, java.util.Map map) throws defpackage.xuf {
        if (i >= 5) {
            throw new defpackage.xuf("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new defpackage.xuf("In re-direct loop", -1, null);
                }
            } catch (java.net.URISyntaxException unused) {
            }
        }
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            for (java.util.Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iC = c(this.c);
                int i3 = iC / 100;
                if (i3 == 2) {
                    java.net.HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (android.text.TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new defpackage.yfr(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                                android.util.Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (java.io.IOException e) {
                        throw new defpackage.xuf("Failed to obtain InputStream", c(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iC == -1) {
                        throw new defpackage.xuf("Http request failed", -1, null);
                    }
                    try {
                        throw new defpackage.xuf(this.c.getResponseMessage(), iC, null);
                    } catch (java.io.IOException e2) {
                        throw new defpackage.xuf("Failed to get a response message", iC, e2);
                    }
                }
                java.lang.String headerField = this.c.getHeaderField("Location");
                if (android.text.TextUtils.isEmpty(headerField)) {
                    throw new defpackage.xuf("Received empty or null redirect url", iC, null);
                }
                try {
                    java.net.URL url3 = new java.net.URL(url, headerField);
                    e();
                    return f(url3, i + 1, url, map);
                } catch (java.net.MalformedURLException e3) {
                    throw new defpackage.xuf("Bad redirect url: ".concat(java.lang.String.valueOf(headerField)), iC, e3);
                }
            } catch (java.io.IOException e4) {
                throw new defpackage.xuf("Failed to connect or obtain data", c(this.c), e4);
            }
        } catch (java.io.IOException e5) {
            throw new defpackage.xuf("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.xvb
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.xvb
    public final void e() {
        java.io.InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        java.net.HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.b;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        int i = defpackage.yfx.a;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        try {
            try {
                defpackage.xzg xzgVar = this.a;
                if (xzgVar.b == null) {
                    xzgVar.b = new java.net.URL(xzgVar.c());
                }
                xvaVar.c(f(xzgVar.b, 0, null, xzgVar.d()));
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                    android.util.Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                xvaVar.f(e);
            }
        } finally {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                android.util.Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + defpackage.yfx.a(jElapsedRealtimeNanos));
            }
        }
    }
}
