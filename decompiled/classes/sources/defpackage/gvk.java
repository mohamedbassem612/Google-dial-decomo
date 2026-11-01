package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvk {
    private static final java.lang.String a = defpackage.gsh.b("SystemJobInfoConverter");
    private final android.content.ComponentName b;

    public gvk(android.content.Context context) {
        this.b = new android.content.ComponentName(context.getApplicationContext(), (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
    }

    public final android.app.job.JobInfo a(defpackage.gxl gxlVar, int i, long j) {
        int i2;
        java.lang.String str;
        defpackage.grn grnVar = gxlVar.k;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", gxlVar.b);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", gxlVar.u);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", gxlVar.d());
        android.app.job.JobInfo.Builder requiresCharging = new android.app.job.JobInfo.Builder(i, this.b).setRequiresCharging(grnVar.d);
        boolean z = grnVar.e;
        android.app.job.JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        android.net.NetworkRequest networkRequestA = grnVar.a();
        if (networkRequestA != null) {
            if (extras == null) {
                defpackage.aooh.i("builder");
            }
            ft$.ExternalSyntheticApiModelOutline0.m(extras, networkRequestA);
        } else {
            defpackage.gsi gsiVar = grnVar.b;
            if (gsiVar == defpackage.gsi.f) {
                ft$.ExternalSyntheticApiModelOutline0.m(extras, new android.net.NetworkRequest.Builder().addCapability(25).build());
            } else {
                int iOrdinal = gsiVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4) {
                                defpackage.gsh gshVarA = defpackage.gsh.a();
                                java.lang.String str2 = a;
                                java.util.Objects.toString(gsiVar);
                                gshVarA.c(str2, "API version too low. Cannot convert network type value ".concat(java.lang.String.valueOf(gsiVar)));
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z) {
            extras.setBackoffCriteria(gxlVar.n, gxlVar.m == defpackage.grj.b ? 0 : 1);
        }
        if (j > 0) {
            extras.setMinimumLatency(j);
        } else if (!gxlVar.r) {
            ft$.ExternalSyntheticApiModelOutline0.m(extras, true);
        }
        if (grnVar.b()) {
            for (grm grmVar : grnVar.j) {
                fh$.ExternalSyntheticApiModelOutline0.m(extras, new android.app.job.JobInfo.TriggerContentUri(grmVar.a, grmVar.b ? 1 : 0));
            }
            fh$.ExternalSyntheticApiModelOutline0.m(extras, grnVar.h);
            fh$.ExternalSyntheticApiModelOutline0.m$1(extras, grnVar.i);
        }
        extras.setPersisted(false);
        aa$.ExternalSyntheticApiModelOutline0.m(extras, grnVar.f);
        da$.ExternalSyntheticApiModelOutline1.m(extras, grnVar.g);
        int i3 = gxlVar.l;
        if (android.os.Build.VERSION.SDK_INT >= 31 && gxlVar.r && i3 <= 0 && j <= 0) {
            mp$.ExternalSyntheticApiModelOutline0.m(extras, true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35 && (str = gxlVar.y) != null) {
            mp$.ExternalSyntheticApiModelOutline1.m(extras, str);
        }
        return extras.build();
    }
}
