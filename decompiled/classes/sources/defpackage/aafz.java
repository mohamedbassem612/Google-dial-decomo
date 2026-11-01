package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aafz extends defpackage.aanh {
    final /* synthetic */ defpackage.aagf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafz(defpackage.aagf aagfVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(aagfVar);
        this.a = aagfVar;
    }

    private static final void a(android.os.Message message) {
        defpackage.aaga aagaVar = (defpackage.aaga) message.obj;
        if (aagaVar != null) {
            aagaVar.e();
        }
    }

    private static final boolean c(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [aaei, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        defpackage.aagf aagfVar = this.a;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = aagfVar.n;
        if (atomicInteger.get() != message.arg1) {
            if (c(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !aagfVar.p()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            aagfVar.l = new com.google.android.gms.common.ConnectionResult(1, message.arg2, null, null, null, null);
            int i = aagfVar.o;
            atomicInteger.get();
            if (aagfVar.o != atomicInteger.get()) {
                android.text.TextUtils.isEmpty(aagfVar.c());
            }
            defpackage.aagf aagfVar2 = this.a;
            com.google.android.gms.common.ConnectionResult connectionResult = aagfVar2.l;
            if (connectionResult == null) {
                connectionResult = new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null, null);
            }
            aagfVar2.g.a(connectionResult);
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            defpackage.aagf aagfVar3 = this.a;
            com.google.android.gms.common.ConnectionResult connectionResult2 = aagfVar3.l;
            if (connectionResult2 == null) {
                connectionResult2 = new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null, null);
            }
            aagfVar3.g.a(connectionResult2);
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.g.a(new com.google.android.gms.common.ConnectionResult(1, message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null, null, null, null));
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            defpackage.aagf aagfVar4 = this.a;
            aagfVar4.J(5, null, message.arg1);
            defpackage.apnt apntVar = aagfVar4.s;
            if (apntVar != null) {
                apntVar.a.b(message.arg2);
            }
            int i2 = message.arg2;
            aagfVar4.M();
            aagfVar4.G(5, 1, null, message.arg1);
            return;
        }
        if (message.what == 2 && !this.a.o()) {
            a(message);
            return;
        }
        if (!c(message)) {
            android.util.Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new java.lang.Exception());
            return;
        }
        defpackage.aaga aagaVar = (defpackage.aaga) message.obj;
        synchronized (aagaVar) {
            obj = aagaVar.e;
            if (aagaVar.f) {
                android.util.Log.w("GmsClient", defpackage.a.bJ(aagaVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            aagaVar.c();
        }
        synchronized (aagaVar) {
            aagaVar.f = true;
        }
        aagaVar.e();
    }
}
