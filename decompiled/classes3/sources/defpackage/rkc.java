package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rkc {
    public static final aimz a = aimz.i("com/android/dialer/joyball/impl/ui/JoyballFragmentPeer");
    public final defpackage.rjw b;
    public final agtj c;
    public final aoss d;
    public final defpackage.rjl e;
    public final aoss f;
    public final defpackage.agzc g;
    public final rlv h;
    public final defpackage.rkb i;
    public final defpackage.rjy j;
    public final defpackage.rhx k;
    public final defpackage.rhx l;

    public rkc(defpackage.rjw rjwVar, agtj agtjVar, aoss aossVar, defpackage.rjl rjlVar, defpackage.rhx rhxVar, defpackage.rhx rhxVar2, aoss aossVar2, defpackage.agzc agzcVar, rlv rlvVar) {
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(rhxVar2, "joyballUiStateFlow");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(rlvVar, "loggingBindings");
        this.b = rjwVar;
        this.c = agtjVar;
        this.d = aossVar;
        this.e = rjlVar;
        this.k = rhxVar;
        this.l = rhxVar2;
        this.f = aossVar2;
        this.g = agzcVar;
        this.h = rlvVar;
        this.i = new defpackage.rkb(this);
        this.j = new defpackage.rjy(this);
    }

    public final void a(android.app.Activity activity, int i) {
        rmx rmxVar;
        if (i == -1) {
            rmxVar = rmx.wo;
        } else if (i == 1) {
            rmxVar = rmx.wp;
        } else if (i == 3) {
            rmxVar = null;
        } else if (i == 4) {
            rmxVar = rmx.wn;
        } else {
            if (i != 5) {
                throw new aois();
            }
            rmxVar = rmx.wq;
        }
        if (rmxVar != null) {
            this.h.o(rmxVar);
        }
        activity.setResult(i);
        activity.finish();
    }
}
