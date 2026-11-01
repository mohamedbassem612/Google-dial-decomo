package androidx.car.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CarContext$1 extends androidx.car.app.IOnRequestPermissionsListener.Stub {
    final /* synthetic */ defpackage.tt this$0;
    final /* synthetic */ java.util.concurrent.Executor val$executor;
    final /* synthetic */ ems val$lifecycle;
    final /* synthetic */ defpackage.ua val$listener;

    CarContext$1(defpackage.tt ttVar, ems emsVar, java.util.concurrent.Executor executor, defpackage.ua uaVar) {
        this.val$lifecycle = emsVar;
        this.val$executor = executor;
        this.val$listener = uaVar;
        this.this$0 = ttVar;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (this.val$lifecycle.a().a(emq.c)) {
            this.val$executor.execute(new defpackage.ac((java.lang.Object) this.val$listener, (java.lang.Object) java.util.Arrays.asList(strArr), (java.lang.Object) java.util.Arrays.asList(strArr2), 2, (byte[]) null));
        }
    }
}
