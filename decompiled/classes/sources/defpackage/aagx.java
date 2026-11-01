package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagx implements android.content.ServiceConnection, defpackage.aagz {
    private final android.content.ServiceConnection a;

    public aagx(android.content.ServiceConnection serviceConnection) {
        this.a = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }
}
