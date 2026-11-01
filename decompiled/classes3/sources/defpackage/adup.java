package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adup extends ajbz implements ajcs {
    private final /* synthetic */ int $cid;
    private final long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adup(ajcq ajcqVar, long j, int i, byte[] bArr) {
        super(ajcqVar);
        this.$cid = i;
        this.a = j;
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.util.concurrent.Delayed delayed = (java.util.concurrent.Delayed) obj;
            if (delayed != this) {
                return java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.NANOSECONDS), delayed.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS));
            }
            return 0;
        }
        java.util.concurrent.Delayed delayed2 = (java.util.concurrent.Delayed) obj;
        if (delayed2 != this) {
            return java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.NANOSECONDS), delayed2.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS));
        }
        return 0;
    }

    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        int i = this.$cid;
        long j = this.a;
        return i != 0 ? timeUnit.convert(j - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS) : timeUnit.convert(j - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adup(ajcq ajcqVar, long j, int i) {
        super(ajcqVar);
        this.$cid = i;
        this.a = j;
    }
}
