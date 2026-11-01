package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ammq implements defpackage.ammt {
    public final java.net.HttpURLConnection a;
    public final byte[] b;
    public long c;
    public int d = -1;
    public final defpackage.amms e;
    private int f;

    public ammq(java.net.HttpURLConnection httpURLConnection, defpackage.ammp ammpVar, defpackage.amms ammsVar) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod("PUT");
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.e = ammsVar;
            if (ammsVar != null) {
                httpURLConnection.setDoOutput(true);
                ammsVar.d();
                long jD = ammsVar.d() - ammsVar.c();
                if (jD < 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) jD);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode(jD);
                }
            }
            for (java.lang.String str : ammpVar.c()) {
                java.util.Iterator it = ammpVar.b(str).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str, (java.lang.String) it.next());
                }
            }
            this.f = 1;
            this.b = new byte[65536];
        } catch (java.net.ProtocolException e) {
            throw new java.lang.IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.ammt
    public final ajcq a() {
        java.lang.Runnable ajcrVar = new ajcr(new defpackage.agqr(this, 11));
        annk annkVar = new annk((byte[]) null, (byte[]) null, (byte[]) null);
        annkVar.o("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(annk.p(annkVar));
        executorServiceNewSingleThreadExecutor.execute(ajcrVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return ajcrVar;
    }

    public final synchronized void b() {
        ahvr.bD(1 == this.f);
    }

    public final boolean c() throws defpackage.ammv {
        try {
            return this.e.g();
        } catch (java.io.IOException e) {
            throw new defpackage.ammv(defpackage.ammu.REQUEST_BODY_READ_ERROR, null, e);
        }
    }

    public final amwp d() {
        defpackage.ammp ammpVar;
        b();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                this.a.getInputStream();
            } catch (java.io.IOException unused) {
                this.a.getErrorStream();
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                ammpVar = new defpackage.ammp();
                for (java.lang.String str : headerFields.keySet()) {
                    if (str != null) {
                        for (java.lang.String str2 : headerFields.get(str)) {
                            ahvr.bM(!str.isEmpty());
                            ahvr.ci(str2);
                            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
                            java.util.Map map = ammpVar.a;
                            if (!map.containsKey(lowerCase)) {
                                map.put(lowerCase, new java.util.ArrayList());
                            }
                            ((java.util.List) map.get(lowerCase)).add(str2);
                        }
                    }
                }
            } else {
                ammpVar = null;
            }
            return new amwp(responseCode, ammpVar);
        } catch (java.io.IOException e) {
            throw new defpackage.ammv(defpackage.ammu.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }
}
