package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lbr implements defpackage.afam {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/startup/CallRecordingStartupListener");
    public final defpackage.lbq b;
    public final defpackage.kvw c;
    final defpackage.zzx d;
    private final defpackage.lpe e;
    private final defpackage.ajct f;

    public lbr(defpackage.zzx zzxVar, defpackage.lpe lpeVar, defpackage.kvw kvwVar, defpackage.lbq lbqVar, defpackage.ajct ajctVar) {
        this.d = zzxVar;
        this.e = lpeVar;
        this.b = lbqVar;
        this.c = kvwVar;
        this.f = ajctVar;
    }

    @Override // defpackage.afam
    public final void a() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(253, "CallRecordingStartupListener_onApplicationStartup", defpackage.ahot.a, true);
        try {
            if (this.d.m()) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/startup/CallRecordingStartupListener", "onApplicationStartup", 55, "CallRecordingStartupListener.java")).v("not prewarming TTS due to direct boot");
                this.e.a();
            } else {
                defpackage.ddv ddvVar = new defpackage.ddv(this, 11);
                defpackage.ajct ajctVar = this.f;
                defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(ddvVar), null));
                ajctVar.execute(ajdkVar);
                defpackage.agsm.i(254, ajdkVar, "Failed to pre-warm TTS for call recording", new java.lang.Object[0]);
            }
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
