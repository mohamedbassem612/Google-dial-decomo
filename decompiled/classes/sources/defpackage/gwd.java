package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gwd extends defpackage.gwf {
    private final android.content.BroadcastReceiver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwd(android.content.Context context, defpackage.gou gouVar) {
        super(context, gouVar);
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.e = new defpackage.gwc(this);
    }

    public abstract android.content.IntentFilter a();

    public abstract void c(android.content.Intent intent);

    @Override // defpackage.gwf
    public final void d() {
        defpackage.gsh.a().c(gwe.a, java.lang.String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.gwf
    public final void e() {
        defpackage.gsh.a().c(gwe.a, java.lang.String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
