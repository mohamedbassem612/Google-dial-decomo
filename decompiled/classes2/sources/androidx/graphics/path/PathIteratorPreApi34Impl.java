package androidx.graphics.path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PathIteratorPreApi34Impl extends defpackage.elj {
    private final native long createInternalPathIterator(android.graphics.Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @dalvik.annotation.optimization.FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorPeek(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorRawSize(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorSize(long j);

    protected final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
