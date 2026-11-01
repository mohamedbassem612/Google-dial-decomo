package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vqi implements android.animation.TimeAnimator.TimeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vqi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(android.animation.TimeAnimator timeAnimator, long j, long j2) {
        int iF;
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj).B();
            return;
        }
        defpackage.vqn vqnVar = (defpackage.vqn) obj;
        defpackage.vqb vqbVar = vqnVar.h;
        j$.util.Optional optional = vqbVar.h;
        if (vqbVar.i) {
            oii oiiVar = (oii) vqbVar.j.orElseThrow();
            java.lang.Object obj2 = oiiVar.b;
            int currentPosition = ((android.media.MediaPlayer) oiiVar.a).getCurrentPosition();
            j$.util.Objects.requireNonNull(obj2);
            iF = gus.aD(mgv.es, currentPosition, (mgu) obj2).f();
        } else {
            iF = 0;
        }
        vqnVar.e(((java.lang.Integer) optional.orElse(java.lang.Integer.valueOf(iF))).intValue());
    }
}
