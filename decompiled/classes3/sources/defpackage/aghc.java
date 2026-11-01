package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghc implements android.content.ServiceConnection {
    final /* synthetic */ defpackage.aghd a;
    final /* synthetic */ aows b;

    public aghc(aows aowsVar, defpackage.aghd aghdVar) {
        this.b = aowsVar;
        this.a = aghdVar;
    }

    public final void a(java.lang.String str) {
        defpackage.aghd.d.x("Signaling retry: ".concat(str));
        this.b.e(new defpackage.aghe(str));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        a("Binding died (permanent)");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        defpackage.aghd.d.z("Service rejected intent. Closing flow gracefully.");
        this.b.e((java.lang.Throwable) null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.aggb aggbVar;
        xtq xtqVar = defpackage.aghd.d;
        xtqVar.x("RestoreProgressService connected");
        if (iBinder == null) {
            aggbVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.restore.restoreprogress.IRestoreProgressService");
            aggbVar = iInterfaceQueryLocalInterface instanceof defpackage.aggb ? (defpackage.aggb) iInterfaceQueryLocalInterface : new defpackage.aggb(iBinder);
        }
        if (aggbVar != null) {
            this.a.b.set(aggbVar);
            this.b.b(aggbVar);
        } else {
            xtqVar.z("Service binder was null. Closing flow gracefully.");
            this.b.e((java.lang.Throwable) null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        a("Service disconnected (transient)");
    }
}
