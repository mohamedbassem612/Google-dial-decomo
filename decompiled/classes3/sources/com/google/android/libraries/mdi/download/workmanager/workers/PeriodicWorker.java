package com.google.android.libraries.mdi.download.workmanager.workers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PeriodicWorker extends gsg {
    public final acwi d;
    private final ahyn e;
    private final java.util.concurrent.Executor f;

    public PeriodicWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters, acwi acwiVar, ajct ajctVar, ahyn ahynVar) {
        super(context, workerParameters);
        this.d = acwiVar;
        this.e = ahynVar;
        this.f = ajctVar;
    }

    public static final ahyn c(grp grpVar) {
        int i;
        long jB = grpVar.b("MDD_TASK_PERIOD_HOURS_KEY", -1L);
        if (jB == -1) {
            android.util.Log.w("MddPeriodicWorker", "can't find MDD task info");
            return ahwt.a;
        }
        java.lang.String strC = grpVar.c("MDD_TASK_NETWORK_STATE_KEY");
        if (strC == null) {
            android.util.Log.e("MddPeriodicWorker", "can't find MDD task network state");
            return ahwt.a;
        }
        int iHashCode = strC.hashCode();
        if (iHashCode == -553837936) {
            if (strC.equals("NETWORK_STATE_UNMETERED")) {
                i = 2;
                return ahyn.h(new defpackage.acxb(jB, i, grpVar.f("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY"), grpVar.f("MDD_TASK_REQUIRES_CHARGING_KEY"), grpVar.f("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY")));
            }
            throw new java.lang.IllegalArgumentException();
        }
        if (iHashCode == 494669930) {
            if (strC.equals("NETWORK_STATE_CONNECTED")) {
                i = 1;
                return ahyn.h(new defpackage.acxb(jB, i, grpVar.f("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY"), grpVar.f("MDD_TASK_REQUIRES_CHARGING_KEY"), grpVar.f("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY")));
            }
            throw new java.lang.IllegalArgumentException();
        }
        if (iHashCode == 534741005 && strC.equals("NETWORK_STATE_ANY")) {
            i = 3;
            return ahyn.h(new defpackage.acxb(jB, i, grpVar.f("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY"), grpVar.f("MDD_TASK_REQUIRES_CHARGING_KEY"), grpVar.f("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY")));
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final ajcq b() {
        android.util.Log.d("MddPeriodicWorker", "PeriodicWorker: startWork");
        grp grpVarF = f();
        java.lang.String strC = grpVarF.c("MDD_TASK_TAG_KEY");
        if (strC == null) {
            android.util.Log.e("MddPeriodicWorker", "can't find MDD task tag");
            return aiql.z(new gsd());
        }
        vto vtoVar = new vto(this, strC, grpVarF, 7, (byte[]) null);
        java.util.concurrent.Executor executor = this.f;
        return ahvr.H(ahvr.G(vtoVar, executor), new aczn(16), executor);
    }

    public final void d() {
        ahwt ahwtVarH;
        android.util.Log.d("MddPeriodicWorker", "PeriodicWorker: onStopped");
        if (android.os.Build.VERSION.SDK_INT < 31 || e() != 3) {
            android.util.Log.d("MddPeriodicWorker", "PeriodicWorker: onStopped: not timeout, exiting");
            return;
        }
        ahyn ahynVar = this.e;
        if (ahynVar.f()) {
            grp grpVarF = f();
            ahyn ahynVarC = c(grpVarF);
            if (ahynVarC.f()) {
                java.lang.Object objB = ahynVarC.b();
                java.lang.String strC = grpVarF.c("MDD_TASK_TAG_KEY");
                if (strC == null) {
                    android.util.Log.e("MddPeriodicWorker", "can't find MDD task tag");
                    ahwtVarH = ahwt.a;
                } else {
                    defpackage.adcy adcyVar = (defpackage.adcy) ahynVar.b();
                    if (adcyVar.a().containsKey(strC)) {
                        j$.time.Duration duration = (j$.time.Duration) adcyVar.a().get(strC);
                        adcyVar.b();
                        long jV = abrz.V() + duration.toMillis();
                        acxe acxeVarA = acxf.a();
                        acxeVarA.a = strC;
                        defpackage.acxb acxbVar = (defpackage.acxb) objB;
                        acxeVarA.e(java.util.concurrent.TimeUnit.HOURS.toSeconds(acxbVar.a));
                        acxeVarA.c(acxbVar.e);
                        boolean z = acxbVar.d;
                        acxc acxcVarA = acxd.a();
                        acxcVarA.d(z);
                        acxcVarA.c(acxbVar.c);
                        acxcVarA.b(acxbVar.b);
                        acxeVarA.b = ahyn.h(acxcVarA.a());
                        acxeVarA.d(jV);
                        ahwtVarH = ahyn.h(acxeVarA.a());
                    } else {
                        ahwtVarH = ahwt.a;
                    }
                }
            } else {
                ahwtVarH = ahwt.a;
            }
            if (ahwtVarH.f()) {
                ((defpackage.adcy) ahynVar.b()).c().ak((acxf) ahwtVarH.b());
            }
        }
    }
}
