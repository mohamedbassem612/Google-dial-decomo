package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apup extends org.chromium.net.ExperimentalBidirectionalStream {
    private final android.net.http.BidirectionalStream a;
    private final defpackage.aput b;
    private final java.lang.String c;
    private final java.util.Collection d;

    public apup(android.net.http.BidirectionalStream bidirectionalStream, defpackage.aput aputVar, java.lang.String str, java.util.Collection collection) {
        this.a = bidirectionalStream;
        this.b = aputVar;
        this.c = str;
        this.d = collection;
    }

    final void a(int i, defpackage.apvf apvfVar, org.chromium.net.CronetException cronetException) {
        defpackage.apux.a(this.b, this.c, this.d, null, i, apvfVar, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(java.nio.ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(java.nio.ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
