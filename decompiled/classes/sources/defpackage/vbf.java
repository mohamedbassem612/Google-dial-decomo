package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vbf implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationWorker");
    public static final defpackage.aguz b;
    public final defpackage.zjm c;
    private final defpackage.aoss d;

    static {
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.vbf.class);
        aguvVarA.c = new defpackage.ahys(defpackage.gss.a);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.voicemail.notification.receivers.VoicemailNotificationWorker", 2));
        b = aguvVarA.a();
    }

    public vbf(defpackage.aoss aossVar, defpackage.zjm zjmVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.d = aossVar;
        this.c = zjmVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.d, 0, new defpackage.unj(this, (defpackage.aoln) null, 5), 3);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
