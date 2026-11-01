package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acke implements oi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ acke(defpackage.ackf ackfVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        this.$cid = i;
        this.a = ackfVar;
        this.b = promoContext;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.car.app.IOnRequestPermissionsListener, java.lang.Object] */
    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            ?? r3 = this.a;
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
                if (bool == null || !bool.booleanValue()) {
                    arrayList2.add((java.lang.String) entry.getKey());
                } else {
                    arrayList.add((java.lang.String) entry.getKey());
                }
            }
            try {
                r3.onRequestPermissionsResult((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
            } catch (android.os.RemoteException e) {
                android.util.Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
            }
            ((androidx.car.app.CarAppPermissionActivity) this.b).finish();
            return;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        aooh.f(bool2, "isGranted");
        boolean zBooleanValue = bool2.booleanValue();
        java.lang.Object obj2 = this.a;
        defpackage.ackf ackfVar = (defpackage.ackf) obj2;
        java.lang.String str = ackfVar.d;
        if (str == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        acxg acxgVar = ackfVar.ak;
        acal acalVar = null;
        if (acxgVar == null) {
            aooh.j("permissionRequestsStateDataService");
            acxgVar = null;
        }
        agab.bR(aosv.C(aoov.am((aoss) acxgVar.b, 0, new defpackage.abvg(acxgVar, str, (aoln) null, 10), 3)), (java.util.function.Consumer) null, new defpackage.uwm(16));
        aoin aoinVar = ackfVar.b;
        if (aoinVar == null) {
            aooh.j("callbacksManagerProvider");
            aoinVar = null;
        }
        acal acalVar2 = ackfVar.c;
        if (acalVar2 == null) {
            aooh.j("clearcutLogger");
        } else {
            acalVar = acalVar2;
        }
        acalVar.b((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.b, zBooleanValue, ackfVar.e);
        aw awVar = (aw) obj2;
        if (awVar.G() != null) {
            az azVarG = awVar.G();
            if (azVarG == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            if (azVarG.isFinishing() || !awVar.aG() || awVar.s) {
                return;
            }
            u uVar = new u(awVar.J());
            uVar.k(awVar);
            uVar.i(true, true);
        }
    }

    public /* synthetic */ acke(androidx.car.app.CarAppPermissionActivity carAppPermissionActivity, androidx.car.app.IOnRequestPermissionsListener iOnRequestPermissionsListener, int i) {
        this.$cid = i;
        this.b = carAppPermissionActivity;
        this.a = iOnRequestPermissionsListener;
    }
}
