package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqh implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ pqh(defpackage.pqm pqmVar, dsd dsdVar, boolean z, java.lang.String str, int i) {
        this.$cid = i;
        this.b = pqmVar;
        this.c = dsdVar;
        this.a = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            defpackage.pqm pqmVar = (defpackage.pqm) this.b;
            android.telecom.Call call = pqmVar.b;
            defpackage.zpo zpoVarA = defpackage.zpo.a(call.getState());
            java.lang.Object obj = this.c;
            if (zpoVarA == defpackage.zpo.g) {
                ((dsd) obj).b((java.lang.Object) null);
                return;
            }
            java.lang.Object obj2 = this.d;
            boolean z = this.a;
            pqmVar.f.b(mfy.dU, aify.q(gus.ax(z), gus.ax(obj2 == null)));
            call.reject(z, (java.lang.String) obj2);
            pqmVar.h.add(obj);
            return;
        }
        java.lang.Object obj3 = this.d;
        java.lang.Object obj4 = this.b;
        java.lang.Object obj5 = this.c;
        if (!this.a) {
            try {
                ((android.media.AudioTrack) obj5).flush();
            } catch (java.lang.Throwable th) {
                android.os.Handler handler = (android.os.Handler) obj4;
                if (handler.getLooper().getThread().isAlive()) {
                    handler.post(new fay(obj3, 2));
                }
                synchronized (fbn.a) {
                    int i = fbn.c - 1;
                    fbn.c = i;
                    if (i == 0) {
                        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = fbn.b;
                        ahvr.ci(scheduledExecutorService);
                        scheduledExecutorService.shutdown();
                        fbn.b = null;
                    }
                    throw th;
                }
            }
        }
        ((android.media.AudioTrack) obj5).release();
        android.os.Handler handler2 = (android.os.Handler) obj4;
        if (handler2.getLooper().getThread().isAlive()) {
            handler2.post(new fay(obj3, 2));
        }
        synchronized (fbn.a) {
            int i2 = fbn.c - 1;
            fbn.c = i2;
            if (i2 == 0) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = fbn.b;
                ahvr.ci(scheduledExecutorService2);
                scheduledExecutorService2.shutdown();
                fbn.b = null;
            }
        }
    }

    public /* synthetic */ pqh(boolean z, android.media.AudioTrack audioTrack, android.os.Handler handler, eto etoVar, int i) {
        this.$cid = i;
        this.a = z;
        this.c = audioTrack;
        this.b = handler;
        this.d = etoVar;
    }
}
