package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apvi extends org.chromium.net.ExperimentalCronetEngine {
    protected abstract org.chromium.net.ExperimentalBidirectionalStream b(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List list, int i, boolean z, java.util.Collection collection, boolean z2, int i2, boolean z3, int i3);

    protected abstract org.chromium.net.ExperimentalUrlRequest c(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i, java.util.Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, org.chromium.net.RequestFinishedInfo.Listener listener, long j, java.lang.String str2, java.util.ArrayList arrayList, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor2);

    @Override // org.chromium.net.ExperimentalCronetEngine
    public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return super.newBidirectionalStreamBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    /* JADX INFO: renamed from: newUrlRequestBuilder */
    public final org.chromium.net.ExperimentalUrlRequest.Builder mo44newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apws(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    /* JADX INFO: renamed from: newUrlRequestBuilder, reason: collision with other method in class */
    public /* synthetic */ org.chromium.net.UrlRequest.Builder mo44newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apws(str, callback, executor, this);
    }
}
