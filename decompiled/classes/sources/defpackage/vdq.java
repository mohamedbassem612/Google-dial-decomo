package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vdq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/logger/VoicemailLogger");
    public final defpackage.aoin c;
    public final java.util.concurrent.Executor d;
    public defpackage.amsq b = defpackage.amsq.a;
    public final java.util.Map e = new defpackage.aca();
    public final java.util.Map f = new defpackage.aca();
    public final java.util.Map g = new defpackage.aca();

    public vdq(defpackage.aoin aoinVar, defpackage.ajct ajctVar) {
        this.c = aoinVar;
        this.d = new defpackage.ajdc(ajctVar);
    }

    public final void a(amsj amsjVar) {
        defpackage.agsm.i(970, defpackage.ahvr.F(new uwl(this, amsjVar, 15), this.d), "failed to add HttpRequestMetrics", new java.lang.Object[0]);
    }

    public final void b(amsk amskVar) {
        defpackage.agsm.i(971, defpackage.ahvr.F(new uwl(this, amskVar, 14), this.d), "failed to add ImapOperationMetrics", new java.lang.Object[0]);
    }

    public final void c(amsp amspVar) {
        defpackage.agsm.i(973, defpackage.ahvr.F(new uwl(this, amspVar, 17), this.d), "failed to add VvmSmsMetrics", new java.lang.Object[0]);
    }
}
