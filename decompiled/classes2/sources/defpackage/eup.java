package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eup {
    public boolean a;
    public boolean b;
    public final defpackage.hjx c;
    private final defpackage.etk d;
    private final defpackage.etk e;

    public eup(android.content.Context context, android.os.Looper looper, defpackage.etc etcVar) {
        this.c = new defpackage.hjx((java.lang.Object) context.getApplicationContext());
        this.d = etcVar.b(looper, null);
        this.e = etcVar.b(android.os.Looper.getMainLooper(), null);
    }

    public static boolean c(boolean z, boolean z2) {
        return z && z2;
    }

    public final void a(final boolean z, final boolean z2) {
        if (c(z, z2)) {
            this.d.d(new java.lang.Runnable() { // from class: eun
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.n(z, z2);
                }
            });
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        defpackage.etk etkVar = this.e;
        ((defpackage.euh) etkVar).b.postDelayed(new defpackage.esz(this, atomicBoolean, 5), 1000L);
        this.d.d(new java.lang.Runnable() { // from class: euo
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                this.a.c.n(z, z2);
            }
        });
    }

    public final void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                a(true, z);
            }
        }
    }
}
