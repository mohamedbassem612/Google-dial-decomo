package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
    public static final defpackage.ajdd b;
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(0);
    public final java.lang.Object d = new java.lang.Object();
    public final j$.util.concurrent.ConcurrentHashMap e = new j$.util.concurrent.ConcurrentHashMap(10, 0.75f, 4);
    public final android.util.SparseArray f = new android.util.SparseArray();
    public final android.util.SparseArray g = new android.util.SparseArray();
    public final java.util.UUID h = java.util.UUID.randomUUID();
    public final android.content.Context i;

    static {
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        b = ajddVar;
        ajddVar.o(new java.lang.Object());
    }

    public agsn(android.content.Context context) {
        this.i = context;
    }

    public static int a(long j) {
        return (int) (j >> 32);
    }

    public static int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, long j) {
        return (((long) i) << 32) | ((long) b(j));
    }
}
