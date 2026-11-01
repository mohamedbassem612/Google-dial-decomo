package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xep implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorkEnqueueingListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;

    public xep(defpackage.zjx zjxVar, defpackage.ajct ajctVar) {
        this.b = zjxVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.aimz aimzVar = defpackage.xeq.a;
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.xeq.class);
        aguvVarA.f(new defpackage.aguy("com.android.incallui.callscreen.impl.recording.retention.CallScreenRecordingsDeletionWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.xeq.c, defpackage.ahwt.a));
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.xeo(this), this.c);
        return ajcqVarB;
    }
}
