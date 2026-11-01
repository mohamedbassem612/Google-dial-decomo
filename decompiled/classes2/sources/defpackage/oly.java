package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oly extends android.util.LruCache {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oly(defpackage.olz olzVar) {
        super(2000000);
        j$.util.Objects.requireNonNull(olzVar);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        return ((olv) obj2).e((albw) null);
    }
}
