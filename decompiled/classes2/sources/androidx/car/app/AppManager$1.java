package androidx.car.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AppManager$1 extends androidx.car.app.IAppManager.Stub {
    final /* synthetic */ defpackage.tc this$0;
    final /* synthetic */ defpackage.tt val$carContext;

    public AppManager$1(defpackage.tc tcVar, defpackage.tt ttVar) {
        this.val$carContext = ttVar;
        this.this$0 = tcVar;
    }

    public static /* synthetic */ java.lang.Object lambda$onBackPressed$0(defpackage.tt ttVar) {
        ttVar.a.e();
        return null;
    }

    public static /* synthetic */ java.lang.Object lambda$startLocationUpdates$0(defpackage.tt ttVar) {
        defpackage.tc tcVar = (defpackage.tc) ttVar.a(defpackage.tc.class);
        tcVar.b();
        ((android.location.LocationManager) tcVar.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, tcVar.f, tcVar.e.getLooper());
        return null;
    }

    public static /* synthetic */ java.lang.Object lambda$stopLocationUpdates$0(defpackage.tt ttVar) {
        ((defpackage.tc) ttVar.a(defpackage.tc.class)).b();
        return null;
    }

    @Override // androidx.car.app.IAppManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.uc ucVar = (defpackage.uc) this.val$carContext.a(defpackage.uc.class);
        j$.util.Objects.requireNonNull(ucVar);
        defpackage.rx.h(this.this$0.d, iOnDoneCallback, "getTemplate", new defpackage.tb(ucVar, 0));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.this$0.d, iOnDoneCallback, "onBackPressed", new defpackage.tb(this.val$carContext, 1));
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.tt ttVar = this.val$carContext;
        android.content.pm.PackageManager packageManager = ttVar.getPackageManager();
        int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", ttVar.getPackageName());
        int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
        if (iCheckPermission == -1 && iCheckPermission2 == -1) {
            defpackage.rx.j(iOnDoneCallback, "startLocationUpdates", new java.lang.SecurityException("Location permission(s) not granted."));
        }
        defpackage.tc tcVar = this.this$0;
        defpackage.rx.h(tcVar.d, iOnDoneCallback, "startLocationUpdates", new defpackage.tb(this.val$carContext, 3));
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.this$0.d, iOnDoneCallback, "stopLocationUpdates", new defpackage.tb(this.val$carContext, 2));
    }
}
