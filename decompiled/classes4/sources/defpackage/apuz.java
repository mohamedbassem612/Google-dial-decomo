package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apuz extends org.chromium.net.UploadDataSink {
    private final android.net.http.UploadDataSink a;

    public apuz(android.net.http.UploadDataSink uploadDataSink) {
        this.a = uploadDataSink;
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(java.lang.Exception exc) {
        this.a.onReadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        this.a.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(java.lang.Exception exc) {
        this.a.onRewindError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        this.a.onRewindSucceeded();
    }
}
