package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anva implements defpackage.aobw {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anva.class.getName());
    public final java.util.concurrent.ScheduledExecutorService b;
    public final defpackage.anrc c;
    public anwx d;
    public apjb e;

    public anva(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.anrc anrcVar) {
        this.b = scheduledExecutorService;
        this.c = anrcVar;
    }

    @Override // defpackage.aobw
    public final void a() {
        defpackage.anrc anrcVar = this.c;
        anrcVar.c();
        anrcVar.execute(new alvr(this, 16));
    }
}
