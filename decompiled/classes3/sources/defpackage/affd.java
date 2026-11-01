package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affd implements java.util.Iterator {
    private long a = 10;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long next() {
        long j = this.a;
        this.a = j >= 30000 ? 60000L : j << 1;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}
