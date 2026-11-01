package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vtp {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/tab/impl/VoicemailTabImpl");
    public final defpackage.ajct b;
    public final defpackage.zjm c;
    private final defpackage.zjs d;
    private final defpackage.vze e;

    public vtp(defpackage.vze vzeVar, defpackage.ajct ajctVar, defpackage.zjm zjmVar, defpackage.zjs zjsVar) {
        this.e = vzeVar;
        this.b = ajctVar;
        this.c = zjmVar;
        this.d = zjsVar;
    }

    public final defpackage.ajcq a() {
        defpackage.zjs zjsVar = this.d;
        defpackage.ajcq ajcqVarC = this.e.c();
        defpackage.ajcq ajcqVarB = zjsVar.b();
        return defpackage.ahvr.ak(ajcqVarC, ajcqVarB).p(new defpackage.vto(this, ajcqVarB, ajcqVarC, 0), this.b);
    }
}
