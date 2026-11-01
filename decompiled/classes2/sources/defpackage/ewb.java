package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewb extends defpackage.evm implements defpackage.evr {
    private defpackage.evv a;
    private java.net.HttpURLConnection b;
    private java.io.InputStream c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private final defpackage.hjx h;
    private final defpackage.hjx i;

    public ewb(defpackage.hjx hjxVar) {
        super(true);
        this.h = hjxVar;
        this.i = new defpackage.hjx(null, null);
    }

    private final void k() {
        java.net.HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                defpackage.etr.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:8:0x0016, B:9:0x001c, B:12:0x0028), top: B:18:0x0004 }] */
    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.ewf {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f;
            if (j != -1) {
                long j2 = j - this.g;
                if (j2 != 0) {
                    i2 = (int) java.lang.Math.min(i2, j2);
                    java.io.InputStream inputStream = this.c;
                    java.lang.String str = eum.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.g += (long) i3;
                        g(i3);
                        return i3;
                    }
                }
            } else {
                java.io.InputStream inputStream2 = this.c;
                java.lang.String str2 = eum.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.g += (long) i3;
                    g(i3);
                    return i3;
                }
            }
            return -1;
        } catch (java.io.IOException e) {
            java.lang.String str3 = eum.a;
            throw defpackage.ewf.a(e, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c9  */
    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.ewf {
        java.net.HttpURLConnection httpURLConnection;
        boolean z;
        long j;
        long j2;
        long j3;
        java.net.HttpURLConnection httpURLConnection2;
        long jMax;
        this.a = evvVar;
        this.g = 0L;
        this.f = 0L;
        j();
        try {
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            android.net.TrafficStats.setThreadStatsTag((int) (android.os.Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            java.net.URL url = new java.net.URL(evvVar.a.toString());
            int i = evvVar.b;
            byte[] bArr = evvVar.c;
            long j4 = evvVar.e;
            long j5 = evvVar.f;
            boolean zB = evvVar.b(1);
            java.util.Map map = evvVar.d;
            java.net.HttpURLConnection httpURLConnection3 = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection3.setConnectTimeout(8000);
            httpURLConnection3.setReadTimeout(8000);
            java.util.HashMap map2 = new java.util.HashMap();
            map2.putAll(this.h.l());
            map2.putAll(this.i.l());
            map2.putAll(map);
            for (java.util.Map.Entry entry : map2.entrySet()) {
                httpURLConnection3.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            java.util.regex.Pattern pattern = defpackage.ewi.a;
            java.lang.String str = j4 == 0 ? null : "bytes=" + j4 + '-';
            if (str != null) {
                httpURLConnection3.setRequestProperty("Range", str);
            }
            httpURLConnection3.setRequestProperty("Accept-Encoding", true == zB ? "gzip" : "identity");
            httpURLConnection3.setInstanceFollowRedirects(true);
            httpURLConnection3.setDoOutput(bArr != null);
            httpURLConnection3.setRequestMethod(defpackage.evv.a(i));
            if (bArr != null) {
                httpURLConnection3.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection3.connect();
                java.io.OutputStream outputStream = httpURLConnection3.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            } else {
                httpURLConnection3.connect();
            }
            this.b = httpURLConnection3;
            this.e = httpURLConnection3.getResponseCode();
            httpURLConnection3.getResponseMessage();
            int i2 = this.e;
            if (i2 < 200 || i2 > 299) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection3.getHeaderFields();
                if (this.e == 416) {
                    java.lang.String headerField = httpURLConnection.getHeaderField("Content-Range");
                    if (android.text.TextUtils.isEmpty(headerField)) {
                        httpURLConnection = httpURLConnection3;
                        j = -1;
                        z = true;
                    } else {
                        java.util.regex.Matcher matcher = defpackage.ewi.b.matcher(headerField);
                        if (matcher.matches()) {
                            httpURLConnection = httpURLConnection3;
                            z = true;
                            java.lang.String strGroup = matcher.group(1);
                            ahvr.ci(strGroup);
                            j = java.lang.Long.parseLong(strGroup);
                        } else {
                            httpURLConnection = httpURLConnection3;
                            z = true;
                            j = -1;
                        }
                    }
                    if (evvVar.e == j) {
                        this.d = z;
                        i(evvVar);
                        long j6 = evvVar.f;
                        return 0L;
                    }
                } else {
                    httpURLConnection = httpURLConnection3;
                }
                java.io.InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        aisk.b(errorStream);
                    } else {
                        java.lang.String str2 = eum.a;
                    }
                } catch (java.io.IOException unused) {
                    java.lang.String str3 = eum.a;
                }
                k();
                throw new defpackage.ewh(this.e, this.e == 416 ? new defpackage.evs(2008) : null, headerFields);
            }
            httpURLConnection3.getContentType();
            if (this.e != 206) {
                j2 = evvVar.e;
                if (j2 == 0) {
                    j2 = 0;
                }
            } else {
                j2 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection3.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                j3 = 0;
                httpURLConnection2 = httpURLConnection3;
                long j7 = evvVar.f;
                this.f = -1L;
            } else {
                long j8 = evvVar.f;
                java.lang.String headerField2 = httpURLConnection3.getHeaderField("Content-Length");
                java.lang.String headerField3 = httpURLConnection3.getHeaderField("Content-Range");
                j3 = 0;
                if (android.text.TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = java.lang.Long.parseLong(headerField2);
                    } catch (java.lang.NumberFormatException unused2) {
                        defpackage.etr.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + ']');
                        jMax = -1;
                    }
                }
                if (android.text.TextUtils.isEmpty(headerField3)) {
                    httpURLConnection2 = httpURLConnection3;
                } else {
                    java.util.regex.Matcher matcher2 = defpackage.ewi.a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            java.lang.String strGroup2 = matcher2.group(2);
                            ahvr.ci(strGroup2);
                            long j9 = java.lang.Long.parseLong(strGroup2);
                            java.lang.String strGroup3 = matcher2.group(1);
                            ahvr.ci(strGroup3);
                            httpURLConnection2 = httpURLConnection3;
                            long j10 = (j9 - java.lang.Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j10;
                            } else if (jMax != j10) {
                                try {
                                    defpackage.etr.f("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + ']');
                                    jMax = java.lang.Math.max(jMax, j10);
                                } catch (java.lang.NumberFormatException unused3) {
                                    defpackage.etr.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + ']');
                                }
                            }
                        } catch (java.lang.NumberFormatException unused4) {
                            httpURLConnection2 = httpURLConnection3;
                        }
                    } else {
                        httpURLConnection2 = httpURLConnection3;
                    }
                }
                this.f = jMax != -1 ? jMax - j2 : -1L;
            }
            try {
                this.c = httpURLConnection2.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.c = new java.util.zip.GZIPInputStream(this.c);
                }
                this.d = true;
                i(evvVar);
                if (j2 != j3) {
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (j2 > j3) {
                            int iMin = (int) java.lang.Math.min(j2, 4096L);
                            java.io.InputStream inputStream = this.c;
                            java.lang.String str4 = eum.a;
                            int i3 = inputStream.read(bArr2, 0, iMin);
                            if (java.lang.Thread.currentThread().isInterrupted()) {
                                throw new defpackage.ewf(new java.io.InterruptedIOException(), 2000, 1);
                            }
                            if (i3 == -1) {
                                throw new defpackage.ewf();
                            }
                            j2 -= (long) i3;
                            g(i3);
                        }
                    } catch (java.io.IOException e) {
                        k();
                        if (e instanceof defpackage.ewf) {
                            throw ((defpackage.ewf) e);
                        }
                        throw new defpackage.ewf(e, 2000, 1);
                    }
                }
                return this.f;
            } catch (java.io.IOException e2) {
                k();
                throw new defpackage.ewf(e2, 2000, 1);
            }
        } catch (java.io.IOException e3) {
            k();
            throw defpackage.ewf.a(e3, 1);
        }
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        java.net.HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            return android.net.Uri.parse(httpURLConnection.getURL().toString());
        }
        defpackage.evv evvVar = this.a;
        if (evvVar != null) {
            return evvVar.a;
        }
        return null;
    }

    @Override // defpackage.evr
    public final void d() {
        try {
            java.io.InputStream inputStream = this.c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    java.lang.String str = eum.a;
                    throw new defpackage.ewf(e, 2000, 3);
                }
            }
            this.c = null;
            k();
            if (this.d) {
                this.d = false;
                h();
            }
            this.b = null;
            this.a = null;
            android.net.TrafficStats.clearThreadStatsTag();
        } catch (java.lang.Throwable th) {
            this.c = null;
            k();
            if (this.d) {
                this.d = false;
                h();
            }
            this.b = null;
            this.a = null;
            android.net.TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.evm, defpackage.evr
    public final java.util.Map e() {
        java.net.HttpURLConnection httpURLConnection = this.b;
        return httpURLConnection == null ? aikj.b : new defpackage.ewa(httpURLConnection.getHeaderFields());
    }
}
