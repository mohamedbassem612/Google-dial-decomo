package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymy extends defpackage.ymx {
    final /* synthetic */ defpackage.yna h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymy(defpackage.yna ynaVar) {
        super(ynaVar);
        j$.util.Objects.requireNonNull(ynaVar);
        this.h = ynaVar;
    }

    @Override // defpackage.ymx
    public final void b() {
        synchronized (this.a) {
            this.c = new defpackage.ypf(this.b);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(defpackage.yna.b);
        try {
            if (super.f(intent)) {
                return;
            }
            this.h.d.unbindService(this);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setComponent(defpackage.yna.c);
            if (super.f(intent2)) {
                return;
            }
            c(new defpackage.ymi(4, 601, "AiCore service failed to bind to primary or fallback.", null));
        } catch (java.lang.SecurityException e) {
            c(new defpackage.ymi(4, 601, "AiCore service failed to bind due to SecurityException.", e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.ylf ylfVar = null;
        defpackage.ylg ylgVar = null;
        if (!j$.util.Objects.equals(componentName, defpackage.yna.b)) {
            if (!j$.util.Objects.equals(componentName, defpackage.yna.c)) {
                c(new defpackage.ymi(4, 0, "AiCore service is not connected. Unknown component ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))), null));
                return;
            }
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
                ylfVar = iInterfaceQueryLocalInterface instanceof defpackage.ylf ? (defpackage.ylf) iInterfaceQueryLocalInterface : new defpackage.ylf(iBinder);
            }
            g(ylfVar);
            return;
        }
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            ylgVar = iInterfaceQueryLocalInterface2 instanceof defpackage.ylg ? (defpackage.ylg) iInterfaceQueryLocalInterface2 : new defpackage.ylg(iBinder);
        }
        try {
            defpackage.ylo yloVar = new defpackage.ylo(this, 1);
            android.os.Parcel parcelEP = ylgVar.eP();
            yld.f(parcelEP, yloVar);
            ylgVar.eS(2, parcelEP);
        } catch (android.os.RemoteException | java.lang.RuntimeException e) {
            c(new defpackage.ymi(4, 6, "AiCore service provider communication error.", e));
        }
    }
}
