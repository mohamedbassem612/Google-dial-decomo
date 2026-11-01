package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class agsh extends android.app.Service {
    private ajcq a = aiql.z((java.lang.Object) null);
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Iterator it = ((agsg) aooc.ar(anty.aA(getApplicationContext()), agsg.class)).eP().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        int iB;
        if (this.a.isDone()) {
            return;
        }
        agsn agsnVarEP = ((agsg) aooc.ar(anty.aA(getApplicationContext()), agsg.class)).eP();
        int i = this.b;
        java.util.concurrent.atomic.AtomicLong atomicLong = agsnVarEP.c;
        int iB2 = agsn.b(atomicLong.get());
        if (i == iB2) {
            do {
                j = atomicLong.get();
                iB = agsn.b(j);
                if (iB != iB2) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, agsn.c(0, iB + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        ajdd ajddVarZ;
        if ((i & 2) == 0 && intent != null) {
            agsn agsnVarEP = ((agsg) aooc.ar(anty.aA(getApplicationContext()), agsg.class)).eP();
            ahvr.bR(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            ahvr.bR(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            ahvr.bR(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            java.util.UUID uuid = agsnVarEP.h;
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (uuid.getMostSignificantBits() == longExtra && uuid.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (agsnVarEP.d) {
                    android.util.SparseArray sparseArray = agsnVarEP.f;
                    ajddVarZ = (ajdd) sparseArray.get(intExtra);
                    ahvr.ci(ajddVarZ);
                    if (ajddVarZ != agsn.b) {
                        agsnVarEP.g.put(intExtra, ajddVarZ);
                    }
                    sparseArray.remove(intExtra);
                }
            } else {
                agsn.a.b().l("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java").z("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), android.os.Process.myPid());
                ajddVarZ = aiql.z((java.lang.Object) null);
            }
            this.a = ajddVarZ;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.c(new defpackage.eyd(this, i2, 20), ajbm.a);
        return 2;
    }
}
