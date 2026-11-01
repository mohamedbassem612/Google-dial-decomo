package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owd {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoActivityPeer");
    public final com.android.dialer.incall.answer.method.promo.postcall.PostCallAnswerMethodPromoActivity b;
    public final aoss c;
    public final rlv d;
    public final defpackage.pgi e;
    public final ipc f;
    private final rwi g;

    public owd(com.android.dialer.incall.answer.method.promo.postcall.PostCallAnswerMethodPromoActivity postCallAnswerMethodPromoActivity, aoss aossVar, defpackage.pgi pgiVar, rwi rwiVar, rlv rlvVar, ipc ipcVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rwiVar, "dialerNotificationManager");
        aooh.f(rlvVar, "loggingBindings");
        this.b = postCallAnswerMethodPromoActivity;
        this.c = aossVar;
        this.e = pgiVar;
        this.g = rwiVar;
        this.d = rlvVar;
        this.f = ipcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.owc owcVar;
        if (aolnVar instanceof defpackage.owc) {
            owcVar = (defpackage.owc) aolnVar;
            int i = owcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                owcVar.c = i - Integer.MIN_VALUE;
            } else {
                owcVar = new defpackage.owc(this, aolnVar);
            }
        } else {
            owcVar = new defpackage.owc(this, aolnVar);
        }
        java.lang.Object obj = owcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = owcVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ajcq ajcqVarD = this.g.d("incoming_call_gesture_post_call_promo", 1);
            owcVar.c = 1;
            if (aosv.D(ajcqVarD, owcVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
