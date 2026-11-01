package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxh {
    public static final aimz a = aimz.i("com/android/dialer/tts/api/session/TtsSession");
    public final defpackage.uwu b;
    public final aoss c;
    public final defpackage.uxm d;
    public final defpackage.uxk e;
    public final rlv f;
    public android.speech.tts.TextToSpeech g;
    public boolean h;
    public final akzx i;
    public final ahda j;

    public uxh(defpackage.uwu uwuVar, aoss aossVar, defpackage.uxm uxmVar, defpackage.uxk uxkVar, rlv rlvVar) {
        aooh.f(uwuVar, "ttsConfig");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.b = uwuVar;
        this.c = aossVar;
        this.d = uxmVar;
        this.e = uxkVar;
        this.f = rlvVar;
        this.j = new ahda((byte[]) null);
        akzx akzxVarM = amsa.b.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.i = akzxVarM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.uxf uxfVar;
        if (aolnVar instanceof defpackage.uxf) {
            uxfVar = (defpackage.uxf) aolnVar;
            int i = uxfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxfVar.c = i - Integer.MIN_VALUE;
            } else {
                uxfVar = new defpackage.uxf(this, aolnVar);
            }
        } else {
            uxfVar = new defpackage.uxf(this, aolnVar);
        }
        java.lang.Object objA = uxfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uxfVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aosy aosyVarAg = ahvr.ag(this.c, this.j, new uer(this, (aoln) null, 3));
            uxfVar.c = 1;
            objA = aosyVarAg.a(uxfVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        aooh.d(objA, "null cannot be cast to non-null type kotlin.Boolean");
        return (java.lang.Boolean) objA;
    }

    public final java.lang.Object b(aoln aolnVar) {
        return ahvr.ag(this.c, this.j, new uxg(this, (aoln) null, 0)).a(aolnVar);
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.j, new uxg(this, (aoln) null, 3, (char[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object d(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.j, new uer(this, (aoln) null, 4, (byte[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }
}
