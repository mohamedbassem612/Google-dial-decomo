package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apio {
    private int a;
    private int b;
    private java.util.concurrent.ExecutorService c;
    private final java.util.ArrayDeque d;
    private final java.util.ArrayDeque e;
    private final java.util.ArrayDeque f;

    public apio() {
        this.a = 64;
        this.b = 5;
        this.d = new java.util.ArrayDeque();
        this.e = new java.util.ArrayDeque();
        this.f = new java.util.ArrayDeque();
    }

    public final synchronized java.util.concurrent.ExecutorService a() {
        java.util.concurrent.ExecutorService executorService;
        if (this.c == null) {
            this.c = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new defpackage.apjw(java.lang.String.valueOf(defpackage.apjx.b).concat(" Dispatcher"), false));
        }
        executorService = this.c;
        if (executorService == null) {
            defpackage.aooh.g();
        }
        return executorService;
    }

    public final void b(defpackage.apkp apkpVar, defpackage.apks apksVar, defpackage.apkp apkpVar2) {
        java.util.List arrayList;
        defpackage.apkp apkpVar3;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        boolean zIsShutdown = a().isShutdown();
        synchronized (this) {
            if (apksVar != null) {
                if (!this.f.remove(apksVar)) {
                    throw new java.lang.IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (apkpVar2 != null) {
                apkpVar2.a.decrementAndGet();
                if (!this.e.remove(apkpVar2)) {
                    throw new java.lang.IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (apkpVar != null) {
                java.util.ArrayDeque arrayDeque = this.d;
                arrayDeque.add(apkpVar);
                java.lang.String strA = apkpVar.a();
                java.util.Iterator it = this.e.iterator();
                defpackage.aooh.e(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        java.util.Iterator it2 = arrayDeque.iterator();
                        defpackage.aooh.e(it2, "iterator(...)");
                        do {
                            if (!it2.hasNext()) {
                                apkpVar3 = null;
                                break;
                            }
                            apkpVar3 = (defpackage.apkp) it2.next();
                        } while (!defpackage.aooh.n(apkpVar3.a(), strA));
                    } else {
                        apkpVar3 = (defpackage.apkp) it.next();
                    }
                } while (!defpackage.aooh.n(apkpVar3.a(), strA));
                if (apkpVar3 != null) {
                    apkpVar.a = apkpVar3.a;
                }
            }
            if ((apksVar != null || apkpVar2 != null) && (zIsShutdown || this.e.isEmpty())) {
                this.f.isEmpty();
            }
            if (!zIsShutdown) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it3 = this.d.iterator();
                defpackage.aooh.e(it3, "iterator(...)");
                while (it3.hasNext()) {
                    defpackage.apkp apkpVar4 = (defpackage.apkp) it3.next();
                    java.util.ArrayDeque arrayDeque2 = this.e;
                    if (arrayDeque2.size() >= this.a) {
                        break;
                    }
                    if (apkpVar4.a.get() < this.b) {
                        it3.remove();
                        apkpVar4.a.incrementAndGet();
                        if (apkpVar4 == null) {
                            defpackage.aooh.g();
                        }
                        arrayList.add(apkpVar4);
                        arrayDeque2.add(apkpVar4);
                    }
                }
            } else {
                java.util.ArrayDeque arrayDeque3 = this.d;
                arrayList = defpackage.ajsz.bZ(arrayDeque3);
                arrayDeque3.clear();
                if (arrayList == null) {
                    defpackage.aooh.i("callsToExecute");
                }
            }
        }
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            defpackage.apkp apkpVar5 = (defpackage.apkp) arrayList.get(i);
            if (apkpVar5 == apkpVar) {
                z = false;
            } else {
                defpackage.apis apisVar = apkpVar5.b.c;
            }
            if (zIsShutdown) {
                apkpVar5.c(null);
            } else {
                apkpVar5.b(a());
            }
        }
        if (!z || apkpVar == null) {
            return;
        }
        defpackage.apis apisVar2 = apkpVar.b.c;
    }

    public final synchronized void c(defpackage.apks apksVar) {
        this.f.add(apksVar);
    }

    public apio(java.util.concurrent.ExecutorService executorService) {
        this();
        this.c = executorService;
    }
}
