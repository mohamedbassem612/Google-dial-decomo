package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaed implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public aaed(defpackage.aaee aaeeVar, defpackage.amwp amwpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aaeeVar);
        this.b = aaeeVar;
        this.a = amwpVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialogG;
        fr frVar;
        int i = this.$cid;
        if (i != 0) {
            java.lang.Object obj = this.b;
            if (i != 1) {
                aobu aobuVar = (aobu) obj;
                aobs aobsVarP = aobuVar.p(aobuVar.r.e, false, true);
                if (aobsVarP != null) {
                    aobuVar.g.execute(new anxz(this, aobsVarP, 5));
                    return;
                }
                return;
            }
            hb hbVar = (hb) obj;
            ft ftVar = hbVar.c;
            if (ftVar != null && (frVar = ftVar.b) != null) {
                frVar.H(ftVar);
            }
            android.view.View view = hbVar.f;
            if (view != null && view.getWindowToken() != null) {
                java.lang.Object obj2 = this.a;
                if (((gc) obj2).i()) {
                    hbVar.j = (gz) obj2;
                }
            }
            hbVar.n = null;
            return;
        }
        ?? r8 = this.b;
        defpackage.aaee aaeeVar = (defpackage.aaee) r8;
        if (aaeeVar.a) {
            java.lang.Object obj3 = this.a;
            aabx aabxVar = aaeeVar.d;
            defpackage.amwp amwpVar = (defpackage.amwp) obj3;
            java.lang.Object obj4 = amwpVar.b;
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) obj4;
            int i2 = connectionResult.c;
            boolean zF = aabxVar.f(i2);
            int i3 = amwpVar.a;
            if (!zF) {
                android.util.Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj4))));
                aaeeVar.a(connectionResult, i3);
                return;
            }
            android.os.Bundle bundle = connectionResult.f;
            int i4 = bundle != null ? bundle.getInt("resolutionHandling", 0) : 0;
            if (i4 == 1) {
                aaeeVar.a(connectionResult, i3);
                return;
            }
            if (connectionResult.c()) {
                android.app.PendingIntent pendingIntentA = connectionResult.a();
                aais.as(pendingIntentA);
                if (i4 != 0) {
                    if (i4 == 2) {
                        android.app.Activity activityL = ((defpackage.aaey) r8).l();
                        defpackage.aaez aaezVar = aaeeVar.f;
                        if (connectionResult.c()) {
                            android.app.PendingIntent pendingIntentA2 = connectionResult.a();
                            aais.as(pendingIntentA2);
                            android.app.Dialog dialogG2 = aabxVar.g(activityL, i2, new defpackage.aagn(aaezVar, pendingIntentA2), (android.content.DialogInterface.OnCancelListener) r8, bundle);
                            if (dialogG2 != null) {
                                aabxVar.e(activityL, dialogG2, "GooglePlayServicesErrorDialog", (android.content.DialogInterface.OnCancelListener) r8);
                                return;
                            }
                        }
                        aaeeVar.a(connectionResult, i3);
                        return;
                    }
                    if (i4 != 3) {
                        aaeeVar.a(connectionResult, i3);
                        return;
                    }
                }
                aaeeVar.f.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.a(((defpackage.aaey) r8).l(), pendingIntentA, i3, false), 1);
                return;
            }
            defpackage.aaey aaeyVar = (defpackage.aaey) r8;
            if (aabxVar.m(aaeyVar.l(), i2, (java.lang.String) null) != null) {
                android.app.Activity activityL2 = aaeyVar.l();
                defpackage.aaez aaezVar2 = aaeeVar.f;
                android.content.Intent intentM = aabxVar.m(activityL2, i2, "d");
                if (intentM != null && (dialogG = aabxVar.g(activityL2, i2, new defpackage.aagm(intentM, aaezVar2), (android.content.DialogInterface.OnCancelListener) r8, (android.os.Bundle) null)) != null) {
                    aabxVar.e(activityL2, dialogG, "GooglePlayServicesErrorDialog", (android.content.DialogInterface.OnCancelListener) r8);
                }
                aabxVar.d(aaeyVar.l().getApplicationContext(), connectionResult, true);
                return;
            }
            if (i2 != 18) {
                aaeeVar.a(connectionResult, i3);
                return;
            }
            android.app.Activity activityL3 = aaeyVar.l();
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activityL3, null, android.R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityL3);
            builder.setView(progressBar);
            builder.setMessage(defpackage.aagk.c(activityL3, 18));
            builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
            android.app.AlertDialog alertDialogCreate = builder.create();
            aabxVar.e(activityL3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", (android.content.DialogInterface.OnCancelListener) r8);
            android.content.Context applicationContext = aaeyVar.l().getApplicationContext();
            defpackage.aelu aeluVar = new defpackage.aelu(this, alertDialogCreate);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            defpackage.aaev aaevVar = new defpackage.aaev(aeluVar);
            dvx.f(applicationContext, aaevVar, intentFilter, (java.lang.String) null, 2);
            aaevVar.a = applicationContext;
            if (!aacn.g(applicationContext)) {
                aeluVar.c();
                aaevVar.a();
            }
            aabxVar.d(aaeyVar.l().getApplicationContext(), connectionResult, true);
        }
    }

    public aaed(hb hbVar, gz gzVar, int i) {
        this.$cid = i;
        this.b = hbVar;
        this.a = gzVar;
    }

    public aaed(aobu aobuVar, aobo aoboVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobuVar);
        this.b = aobuVar;
        this.a = aoboVar;
    }
}
