package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vyu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/wear/WearVoicemailNotificationSender");
    private final defpackage.ajct b;
    private final defpackage.zjm c;

    public vyu(defpackage.zjm zjmVar, defpackage.ajct ajctVar) {
        this.c = zjmVar;
        this.b = ajctVar;
    }

    public final defpackage.ajcq a(int i, java.lang.String str, int i2, dva dvaVar) {
        j$.util.Optional optionalG = this.c.g();
        if (!optionalG.isPresent()) {
            return defpackage.ajcm.a;
        }
        defpackage.uqz uqzVar = (defpackage.uqz) optionalG.orElseThrow();
        uqzVar.a().b(dvaVar);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(uqzVar.b(i, str, 3, i2));
        defpackage.vrx vrxVar = new defpackage.vrx(11);
        defpackage.ajct ajctVar = this.b;
        return ahrvVarG.h(vrxVar, ajctVar).e(java.lang.Throwable.class, new tbc(i, 6), ajctVar);
    }
}
