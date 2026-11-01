package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvg extends org.chromium.net.ExperimentalBidirectionalStream.Builder {
    private final defpackage.apvi a;
    private final java.lang.String b;
    private final org.chromium.net.BidirectionalStream.Callback c;
    private final java.util.concurrent.Executor d;
    private final java.util.ArrayList e = new java.util.ArrayList();
    private java.lang.String f = "POST";
    private int g = 3;
    private boolean h;
    private java.util.Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public apvg(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, defpackage.apvi apviVar) {
        this.b = (java.lang.String) j$.util.Objects.requireNonNull(str, "URL is required.");
        this.c = (org.chromium.net.BidirectionalStream.Callback) j$.util.Objects.requireNonNull(callback, "Callback is required.");
        this.d = (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(executor, "Executor is required.");
        this.a = (defpackage.apvi) j$.util.Objects.requireNonNull(apviVar, "CronetEngine is required.");
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        j$.util.Objects.requireNonNull(str, "Invalid header name.");
        j$.util.Objects.requireNonNull(str2, "Invalid header value.");
        this.e.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.i == null) {
            this.i = new java.util.ArrayList();
        }
        this.i.add(obj);
        return this;
    }

    public final void b(java.lang.String str) {
        this.f = (java.lang.String) j$.util.Objects.requireNonNull(str, "Method is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream build() {
        return this.a.b(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setHttpMethod(java.lang.String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder setHttpMethod(java.lang.String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setTrafficStatsTag(int i) {
        setTrafficStatsTag(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setTrafficStatsUid(int i) {
        setTrafficStatsUid(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder bindToNetwork(long j) {
        return this;
    }
}
