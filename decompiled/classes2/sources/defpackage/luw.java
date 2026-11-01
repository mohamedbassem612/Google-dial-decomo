package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class luw extends android.util.LruCache {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luw(defpackage.lvb lvbVar, int i) {
        super(i);
        j$.util.Objects.requireNonNull(lvbVar);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = ((defpackage.lux) obj2).a;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }
}
