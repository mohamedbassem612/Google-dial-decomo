package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apoj extends javax.net.ssl.HttpsURLConnection {
    private final java.net.HttpURLConnection a;
    private final defpackage.apol b;

    public apoj(java.net.URL url, defpackage.apje apjeVar) {
        defpackage.apol apolVar = new defpackage.apol(url, apjeVar);
        super(apolVar.getURL());
        this.a = apolVar;
        this.b = apolVar;
    }

    protected final defpackage.apit a() {
        defpackage.apol apolVar = this.b;
        if (apolVar.e != null) {
            return apolVar.k;
        }
        throw new java.lang.IllegalStateException("Connection has not yet been established");
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(java.lang.String str, java.lang.String str2) {
        this.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.connected = true;
        this.a.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.a.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.lang.String getCipherSuite() {
        defpackage.apit apitVarA = a();
        if (apitVarA != null) {
            return apitVarA.b.s;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final java.lang.Object getContent() {
        return this.a.getContent();
    }

    @Override // java.net.URLConnection
    public final java.lang.String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.a);
    }

    @Override // java.net.URLConnection
    public final java.lang.String getContentType() {
        return this.a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final java.io.InputStream getErrorStream() {
        return this.a.getErrorStream();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderField(int i) {
        return this.a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(java.lang.String str, long j) {
        return this.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(java.lang.String str, int i) {
        return this.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderFieldKey(int i) {
        return this.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(java.lang.String str, long j) {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.a, str, j);
    }

    @Override // java.net.URLConnection
    public final java.util.Map getHeaderFields() {
        return this.a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        return this.b.a.s;
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final java.io.InputStream getInputStream() {
        return this.a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.cert.Certificate[] getLocalCertificates() {
        defpackage.apit apitVarA = a();
        if (apitVarA == null) {
            return null;
        }
        java.util.List list = apitVarA.c;
        if (list.isEmpty()) {
            return null;
        }
        return (java.security.cert.Certificate[]) list.toArray(new java.security.cert.Certificate[list.size()]);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.Principal getLocalPrincipal() {
        defpackage.apit apitVarA = a();
        if (apitVarA == null) {
            return null;
        }
        java.lang.Object objBG = defpackage.ajsz.bG(apitVarA.c);
        java.security.cert.X509Certificate x509Certificate = objBG instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) objBG : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final java.io.OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.Principal getPeerPrincipal() {
        defpackage.apit apitVarA = a();
        if (apitVarA == null) {
            return null;
        }
        java.lang.Object objBG = defpackage.ajsz.bG(apitVarA.a());
        java.security.cert.X509Certificate x509Certificate = objBG instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) objBG : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.security.Permission getPermission() {
        return this.a.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final java.lang.String getRequestMethod() {
        return this.a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final java.util.Map getRequestProperties() {
        return this.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final java.lang.String getRequestProperty(java.lang.String str) {
        return this.a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final java.lang.String getResponseMessage() {
        return this.a.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.b.a.o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new java.lang.IllegalStateException("CLEARTEXT-only client");
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.cert.Certificate[] getServerCertificates() {
        defpackage.apit apitVarA = a();
        if (apitVarA == null) {
            return null;
        }
        java.util.List listA = apitVarA.a();
        if (listA.isEmpty()) {
            return null;
        }
        return (java.security.cert.Certificate[]) listA.toArray(new java.security.cert.Certificate[listA.size()]);
    }

    @Override // java.net.URLConnection
    public final java.net.URL getURL() {
        return this.a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
        defpackage.apol apolVar = this.b;
        defpackage.apjd apjdVar = new defpackage.apjd(apolVar.a);
        defpackage.aooh.f(hostnameVerifier, "hostnameVerifier");
        if (!defpackage.aooh.n(hostnameVerifier, apjdVar.q)) {
            apjdVar.y = null;
        }
        apjdVar.q = hostnameVerifier;
        apolVar.a = new defpackage.apje(apjdVar);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(java.lang.String str) throws java.net.ProtocolException {
        this.a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(java.lang.String str, java.lang.String str2) {
        this.a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            throw new java.lang.IllegalArgumentException("sslSocketFactory == null");
        }
        defpackage.apjd apjdVar = new defpackage.apjd(this.b.a);
        if (!defpackage.aooh.n(sSLSocketFactory, apjdVar.m)) {
            apjdVar.y = null;
        }
        apjdVar.m = sSLSocketFactory;
        java.util.Iterator it = ((defpackage.apnl) defpackage.apnn.b).a.iterator();
        while (it.hasNext()) {
            ((defpackage.apnw) it.next()).e();
        }
        java.lang.Class<?> cls = sSLSocketFactory.getClass();
        throw new java.lang.IllegalStateException("Unable to extract the trust manager on " + defpackage.apnn.b + ", sslSocketFactory is " + cls);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.a.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final java.lang.Object getContent(java.lang.Class[] clsArr) {
        return this.a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public final java.lang.String getHeaderField(java.lang.String str) {
        return this.a.getHeaderField(str);
    }
}
