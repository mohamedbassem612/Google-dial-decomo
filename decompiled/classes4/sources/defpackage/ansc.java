package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansc implements defpackage.anxx, defpackage.ansy {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ansc.class.getName());
    public final anrk b;
    public final defpackage.ansz c;
    private final aoag d;
    private final aoag e;
    private final aify f;
    private final anrq g;
    private defpackage.aocw h;
    private java.util.concurrent.ScheduledExecutorService i;
    private java.util.concurrent.Executor j;
    private boolean k;
    private final aooc l;
    private final aprf m;

    public ansc(defpackage.ansa ansaVar) {
        anrk anrkVar = ansaVar.a;
        ahvr.ci(anrkVar);
        this.b = anrkVar;
        aoag aoagVar = ansaVar.c;
        ahvr.ci(aoagVar);
        this.e = aoagVar;
        this.d = ansaVar.d;
        java.util.List list = ansaVar.b;
        ahvr.cj(list, "streamTracerFactories");
        this.f = aify.n(list);
        defpackage.apjb apjbVar = ansaVar.f;
        j$.util.Objects.requireNonNull(apjbVar);
        this.m = new aprf(apjbVar);
        this.g = ansaVar.e;
        this.l = ansaVar.g;
        this.c = new defpackage.ansz(this);
    }

    @Override // defpackage.ansy
    public final synchronized boolean a(int i, android.os.Parcel parcel) {
        android.os.IBinder strongBinder;
        if (i == 1) {
            if (this.k) {
                defpackage.ansb.a.a(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (strongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = android.os.Binder.getCallingUid();
                defpackage.anlw anlwVar = defpackage.anlw.a;
                defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
                anrk anrkVar = this.b;
                anttVar.c(defpackage.annh.b, anrkVar);
                anttVar.c(defpackage.annh.a, new defpackage.ansn(callingUid));
                anttVar.c(defpackage.ansf.g, java.lang.Integer.valueOf(callingUid));
                anttVar.c(defpackage.ansf.h, anrkVar.c());
                anttVar.c(defpackage.ansf.i, this.g);
                aprf aprfVar = this.m;
                java.util.concurrent.Executor executor = this.j;
                ahvr.cj(executor, "Not started?");
                anttVar.c(defpackage.ansk.a, new defpackage.ansj(callingUid, aprfVar, executor));
                anttVar.c(defpackage.anxi.a, defpackage.anqj.c);
                defpackage.ansd ansdVar = new defpackage.ansd(this.d, anttVar.a(), this.f);
                synchronized (ansdVar) {
                    try {
                        ansdVar.B(anth.e(strongBinder, ansdVar.j));
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                defpackage.aocw aocwVar = this.h;
                synchronized (aocwVar) {
                    ahvr.bZ(!((defpackage.anrv) aocwVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((defpackage.anrv) aocwVar).c++;
                }
                defpackage.aocw aocwVar2 = ((defpackage.anrv) aocwVar).a;
                defpackage.aoct aoctVar = ((defpackage.aoco) aocwVar2).a;
                synchronized (aoctVar.l) {
                    aoctVar.n.add(ansdVar);
                }
                defpackage.aocs aocsVar = new defpackage.aocs(((defpackage.aoco) aocwVar2).a, ansdVar);
                defpackage.aoct aoctVar2 = aocsVar.b;
                long j = aoctVar2.i;
                if (j != Long.MAX_VALUE) {
                    aocsVar.a = aocsVar.c.j.schedule(new defpackage.aobd(aocsVar, 8), j, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else {
                    aocsVar.a = new java.util.concurrent.FutureTask(new defpackage.ahlo(aocsVar, 7), null);
                }
                anno.b((defpackage.annn) aoctVar2.q.g.get(java.lang.Long.valueOf(anno.a(aoctVar2))), aocsVar.c);
                ansdVar.h(new defpackage.anru((defpackage.anrv) aocwVar, aocsVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.anxx
    public final synchronized void c() {
        java.lang.Runnable runnableA;
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.a = defpackage.ansb.a;
        defpackage.aocw aocwVar = this.h;
        defpackage.aocw aocwVar2 = ((defpackage.anrv) aocwVar).a;
        defpackage.aoct aoctVar = ((defpackage.aoco) aocwVar2).a;
        synchronized (aoctVar.l) {
            if (!aoctVar.k) {
                java.util.ArrayList arrayList = new java.util.ArrayList(aoctVar.n);
                anqw anqwVar = aoctVar.j;
                aoctVar.k = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    defpackage.ansd ansdVar = (defpackage.ansd) arrayList.get(i);
                    if (anqwVar == null) {
                        ansdVar.e();
                    } else {
                        ansdVar.f(anqwVar);
                    }
                }
                defpackage.aoct aoctVar2 = ((defpackage.aoco) aocwVar2).a;
                synchronized (aoctVar2.l) {
                    aoctVar2.m = true;
                    aoctVar2.d();
                }
            }
        }
        synchronized (aocwVar) {
            ((defpackage.anrv) aocwVar).b = true;
            runnableA = ((defpackage.anrv) aocwVar).a();
        }
        if (runnableA != null) {
            runnableA.run();
        }
        this.d.b(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.anxx
    public final synchronized void d(defpackage.aocw aocwVar) {
        this.h = new defpackage.anrv(aocwVar, new defpackage.alvr(this, 8));
        this.i = (java.util.concurrent.ScheduledExecutorService) this.d.a();
        this.j = this.e.a();
    }

    public final java.lang.String toString() {
        return "BinderServer[" + this.b.toString() + ']';
    }
}
