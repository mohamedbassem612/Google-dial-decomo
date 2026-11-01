package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqa implements znz {
    private static final aimz d = aimz.i("com/android/dialer/androidauto/impl/incall/listener/CarPhoneAccountSelectionListener");
    public final ahpz a;
    public final pqm b;
    public final gpd c;
    private final defpackage.hov e;
    private final aoss f;
    private final ipc g;

    public hqa(defpackage.hov hovVar, pqm pqmVar, ipc ipcVar, aoss aossVar, gpd gpdVar, ahpz ahpzVar) {
        aooh.f(pqmVar, "callController");
        aooh.f(ipcVar, "carAccountSelectorDataFlow");
        aooh.f(aossVar, "lightweightExecutor");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ahpzVar, "traceCreation");
        this.e = hovVar;
        this.b = pqmVar;
        this.g = ipcVar;
        this.f = aossVar;
        this.c = gpdVar;
        this.a = ahpzVar;
    }

    public final ajcq a() {
        return aosv.F(this.f, 0, new defpackage.hnt(this, (aoln) null, 6), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.hpz hpzVar;
        if (aolnVar instanceof defpackage.hpz) {
            hpzVar = (defpackage.hpz) aolnVar;
            int i = hpzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hpzVar.c = i - Integer.MIN_VALUE;
            } else {
                hpzVar = new defpackage.hpz(this, aolnVar);
            }
        } else {
            hpzVar = new defpackage.hpz(this, aolnVar);
        }
        java.lang.Object objA = hpzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hpzVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        defpackage.hov hovVar = this.e;
        hpzVar.c = 1;
        objA = hovVar.a(hpzVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.hon honVar = (defpackage.hon) objA;
        android.telecom.PhoneAccountHandle phoneAccountHandle = honVar.a;
        aimz aimzVar = d;
        if (phoneAccountHandle == null) {
            aimzVar.b().l("com/android/dialer/androidauto/impl/incall/listener/CarPhoneAccountSelectionListener", "callPreferredAccountOrCreateAccountSelection", 45, "CarPhoneAccountSelectionListener.kt").v("Create account selector because no default account was set.");
            defpackage.hoz hozVar = new defpackage.hoz(honVar.b, new defpackage.fxs(this, 19), new defpackage.hll(this, 3));
            ipc ipcVar = this.g;
            hpzVar.c = 2;
            if (((aozj) ipcVar.a).a(hozVar, hpzVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        aimzVar.b().l("com/android/dialer/androidauto/impl/incall/listener/CarPhoneAccountSelectionListener", "callPreferredAccountOrCreateAccountSelection", 40, "CarPhoneAccountSelectionListener.kt").v("Phone account handle was auto selected.");
        ahoq ahoqVarW = ahvr.W(70, "CarPhoneAccountSelectionListener_phoneAccountSelected");
        try {
            this.b.p(phoneAccountHandle);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return aojh.a;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}
