package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfc {
    private static final java.util.Map n = new java.util.HashMap();
    public final android.content.Context a;
    public boolean f;
    public final android.content.Intent g;
    public android.content.ServiceConnection k;
    public android.os.IInterface l;
    public final xtq m;
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.Set d = new java.util.HashSet();
    public final java.lang.Object e = new java.lang.Object();
    public final android.os.IBinder.DeathRecipient i = new android.os.IBinder.DeathRecipient() { // from class: agev
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            defpackage.agfc agfcVar = this.a;
            xtq xtqVar = agfcVar.m;
            xtqVar.E("reportBinderDeath", new java.lang.Object[0]);
            defpackage.agez agezVar = (defpackage.agez) agfcVar.h.get();
            if (agezVar != null) {
                xtqVar.E("calling onBinderDied", new java.lang.Object[0]);
                agezVar.a();
            } else {
                xtqVar.E("%s : Binder has died.", new java.lang.Object[]{agfcVar.b});
                java.util.List list = agfcVar.c;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((defpackage.ageu) it.next()).b(agfcVar.a());
                }
                list.clear();
            }
            synchronized (agfcVar.e) {
                agfcVar.b();
            }
        }
    };
    public final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.lang.String b = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final java.lang.ref.WeakReference h = new java.lang.ref.WeakReference(null);

    public agfc(android.content.Context context, xtq xtqVar, android.content.Intent intent) {
        this.a = context;
        this.m = xtqVar;
        this.g = intent;
    }

    public final android.os.RemoteException a() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.b).concat(" : Binder has died."));
    }

    public final void b() {
        java.util.Set set = this.d;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((zzx) it.next()).h(a());
        }
        set.clear();
    }

    public final void c(defpackage.ageu ageuVar) {
        android.os.Handler handler;
        java.util.Map map = n;
        synchronized (map) {
            java.lang.String str = this.b;
            if (!map.containsKey(str)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = (android.os.Handler) map.get(str);
        }
        handler.post(ageuVar);
    }
}
