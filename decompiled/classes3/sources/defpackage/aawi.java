package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aawi extends aanh {
    final /* synthetic */ defpackage.aawl a;
    private boolean b;
    private final defpackage.aawh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawi(defpackage.aawl aawlVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(aawlVar);
        this.a = aawlVar;
        this.c = new defpackage.aawh(aawlVar);
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        if (android.util.Log.isLoggable("WearableLS", 2)) {
            android.util.Log.v("WearableLS", "bindService: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a.b))));
        }
        defpackage.aawl aawlVar = this.a;
        aawlVar.bindService(aawlVar.e, this.c, 1);
        this.b = true;
    }

    public final synchronized void a(java.lang.String str) {
        if (this.b) {
            if (android.util.Log.isLoggable("WearableLS", 2)) {
                android.util.Log.v("WearableLS", "unbindService: " + str + ", " + java.lang.String.valueOf(this.a.b));
            }
            try {
                this.a.unbindService(this.c);
            } catch (java.lang.RuntimeException e) {
                android.util.Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.b = false;
        }
    }

    protected final void b(android.os.Message message) {
        c();
        try {
            super.b(message);
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}
