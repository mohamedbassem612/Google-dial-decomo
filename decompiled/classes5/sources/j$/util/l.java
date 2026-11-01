package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class l implements java.util.Iterator, j$.util.w {
    public final /* synthetic */ byte a = 0;
    public final java.util.Iterator b;

    public l(j$.util.m mVar) {
        this.b = mVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.w
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.x(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.x(this.b, new j$.nio.file.y(consumer, (byte) 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new j$.util.p((java.util.Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public l(j$.util.r rVar) {
        this.b = rVar.a.iterator();
    }
}
