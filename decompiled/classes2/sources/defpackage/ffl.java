package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffl {
    private static final java.util.concurrent.atomic.AtomicLong h = new java.util.concurrent.atomic.AtomicLong();
    public final long a;
    public final defpackage.evv b;
    public final android.net.Uri c;
    public final java.util.Map d;
    public final long e;
    public final long f;
    public final long g;

    public ffl(defpackage.ffk ffkVar) {
        this.a = ffkVar.a;
        this.b = ffkVar.b;
        this.c = ffkVar.d;
        this.d = ffkVar.e;
        this.e = ffkVar.c;
        this.f = ffkVar.f;
        this.g = ffkVar.g;
    }

    public static long a() {
        return h.getAndIncrement();
    }
}
