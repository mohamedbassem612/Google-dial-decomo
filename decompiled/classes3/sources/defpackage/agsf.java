package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agsf extends android.app.Service {
    public aogc a;

    public final aogc a() {
        aogc aogcVar = this.a;
        if (aogcVar != null) {
            return aogcVar;
        }
        aooh.j("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        aooh.f(printWriter, "writer");
        defpackage.agsu agsuVarE = a().E(getClass());
        synchronized (agsuVarE.b) {
            java.util.Iterator it = agsuVarE.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((java.util.Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        aooh.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((agse) agab.aH(this, agse.class)).ik(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        ahpj ahpjVarQ;
        agsd agsdVar = new agsd(this, intent, i2, 0);
        if (intent != null) {
            long j = ahqx.a;
            ahpjVarQ = ahqx.q(intent);
        } else {
            ahpjVarQ = null;
        }
        if (ahpjVarQ == null) {
            agsdVar.a();
            return 2;
        }
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, ahpjVarQ);
        try {
            agsdVar.a();
            ahns.d(ahpeVarA, ahpjVarD);
            return 2;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                ahns.d(ahpeVarA, ahpjVarD);
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        defpackage.agsu agsuVarE = a().E(getClass());
        synchronized (agsuVarE.b) {
            if (agsuVarE.j.ordinal() == 2) {
                agsuVarE.d();
                defpackage.agss agssVar = new defpackage.agss();
                aifh aifhVar = agsuVarE.d;
                aicy aicyVar = new aicy(aifhVar);
                aihb aihbVar = new aihb();
                java.util.Iterator it = aicyVar.iterator();
                while (it.hasNext()) {
                    aihbVar.i(((ahqz) it.next()).a);
                }
                aihd<ahpj> aihdVarH = aihbVar.h();
                ahrc ahrcVar = new ahrc(agssVar, new java.lang.StackTraceElement[0]);
                aigb aigbVar = new aigb(4);
                for (ahpj ahpjVar : aihdVarH) {
                    ahrc ahrcVar2 = new ahrc((java.lang.Throwable) null, ahrc.l(ahpjVar, (ahpj) null));
                    ahrcVar.addSuppressed(ahrcVar2);
                    aigbVar.i(ahpjVar, ahrcVar2);
                }
                aigf aigfVarE = aigbVar.e(true);
                ahrc.h(aigfVarE);
                ahrc.f(aigfVarE);
                defpackage.agsu.a.c().k(ahrcVar).l("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", 431, "ForegroundServiceTracker.java").v("Timeout elapsed");
                agsuVarE.i.clear();
                aifhVar.q();
            }
        }
    }
}
