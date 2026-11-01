package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apws extends org.chromium.net.ExperimentalUrlRequest.Builder {
    private static final java.lang.String a = "apws";
    private final defpackage.apvi b;
    private final java.lang.String c;
    private final org.chromium.net.UrlRequest.Callback d;
    private final java.util.concurrent.Executor e;
    private java.lang.String f;
    private boolean h;
    private java.util.Collection j;
    private org.chromium.net.UploadDataProvider k;
    private java.util.concurrent.Executor l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private org.chromium.net.RequestFinishedInfo.Listener r;
    private final java.util.ArrayList g = new java.util.ArrayList();
    private int i = 3;
    private long s = -1;

    public apws(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, defpackage.apvi apviVar) {
        this.c = (java.lang.String) j$.util.Objects.requireNonNull(str, "URL is required.");
        this.d = (org.chromium.net.UrlRequest.Callback) j$.util.Objects.requireNonNull(callback, "Callback is required.");
        this.e = (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(executor, "Executor is required.");
        this.b = (defpackage.apvi) j$.util.Objects.requireNonNull(apviVar, "CronetEngine is required.");
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        j$.util.Objects.requireNonNull(str, "Invalid header name.");
        j$.util.Objects.requireNonNull(str2, "Invalid header value.");
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.g.add(new java.util.AbstractMap.SimpleEntry(str, str2));
            return;
        }
        java.lang.String str3 = a;
        if (android.util.Log.isLoggable(str3, 3)) {
            aodc.q(str3, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new java.lang.Object[]{new java.lang.Exception()});
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    public final void b(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.j == null) {
            this.j = new java.util.ArrayList();
        }
        this.j.add(obj);
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ org.chromium.net.UrlRequest.Builder bindToNetwork(long j) {
        this.s = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final org.chromium.net.ExperimentalUrlRequest build() {
        int i = this.i;
        java.util.Collection collection = this.j;
        boolean z = this.h;
        boolean z2 = this.m;
        boolean z3 = this.n;
        int i2 = this.o;
        boolean z4 = this.p;
        int i3 = this.q;
        org.chromium.net.RequestFinishedInfo.Listener listener = this.r;
        long j = this.s;
        java.lang.String str = this.f;
        if (str == null) {
            str = "GET";
        }
        java.lang.String str2 = str;
        org.chromium.net.UploadDataProvider uploadDataProvider = this.k;
        java.util.concurrent.Executor executor = this.l;
        return this.b.c(this.c, this.d, this.e, i, collection, z, z2, z3, i2, z4, i3, listener, j, str2, this.g, uploadDataProvider, executor);
    }

    public final void c() {
        this.m = true;
    }

    public final void d() {
        this.h = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder disableCache() {
        d();
        return this;
    }

    public final void e(int i) {
        this.n = true;
        this.o = i;
    }

    public final void f(int i) {
        this.p = true;
        this.q = i;
    }

    public final void g(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor) {
        this.k = (org.chromium.net.UploadDataProvider) j$.util.Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.l = (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.f == null) {
            this.f = "POST";
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String str) {
        this.f = (java.lang.String) j$.util.Objects.requireNonNull(str, "Method is required.");
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("SHA-256 hashes are supposed to be 32 bytes");
        }
        defpackage.aoil.i(byteBuffer);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ org.chromium.net.UrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ org.chromium.net.UrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder disableCache() {
        d();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalUrlRequest.Builder setIdempotency(int i) {
        return this;
    }
}
