package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agfp implements android.content.ServiceConnection {
    final /* synthetic */ defpackage.agfq a;

    public agfp(defpackage.agfq agfqVar) {
        j$.util.Objects.requireNonNull(agfqVar);
        this.a = agfqVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        this.a.b(new defpackage.amwp(7, (defpackage.agff) null));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        this.a.b(new defpackage.amwp(6, (defpackage.agff) null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i;
        defpackage.agff agffVar;
        if (iBinder == null) {
            defpackage.agfq.c.B("Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        defpackage.agfq agfqVar = this.a;
        if (iBinder == null) {
            agffVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            agffVar = iInterfaceQueryLocalInterface instanceof defpackage.agff ? (defpackage.agff) iInterfaceQueryLocalInterface : new defpackage.agff(iBinder);
        }
        agfqVar.b(new defpackage.amwp(i, agffVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.b(new defpackage.amwp(5, (defpackage.agff) null));
    }
}
