package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvr implements rio {
    private static final aimz b = aimz.i("com/android/dialer/dobby/impl/joyball/DobbyJoyballIntegration");
    public final ril a;
    private final android.content.Context c;
    private final noe d;
    private final ecx e;
    private final java.lang.String f;
    private final rjj g;

    public mvr(android.content.Context context, noe noeVar, ril rilVar, rjj rjjVar, ecx ecxVar) {
        aooh.f(context, "appContext");
        aooh.f(rjjVar, "joyballLifecycle");
        aooh.f(ecxVar, "dataStore");
        this.c = context;
        this.d = noeVar;
        this.a = rilVar;
        this.g = rjjVar;
        this.e = ecxVar;
        this.f = "dialer_dobby_consent_transfer_key";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.mvn mvnVar;
        if (aolnVar instanceof defpackage.mvn) {
            mvnVar = (defpackage.mvn) aolnVar;
            int i = mvnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvnVar.c = i - Integer.MIN_VALUE;
            } else {
                mvnVar = new defpackage.mvn(this, aolnVar);
            }
        } else {
            mvnVar = new defpackage.mvn(this, aolnVar);
        }
        java.lang.Object objE = mvnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mvnVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objE);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objE);
            }
            return ((java.lang.Boolean) objE).booleanValue() ? rin.b : rin.c;
        }
        aooc.af(objE);
        noe noeVar = this.d;
        mvnVar.c = 1;
        objE = noeVar.e(mvnVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objE).booleanValue()) {
            return rin.a;
        }
        noe noeVar2 = this.d;
        mvnVar.c = 2;
        objE = noeVar2.d(mvnVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objE).booleanValue()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mvo mvoVar;
        if (aolnVar instanceof defpackage.mvo) {
            mvoVar = (defpackage.mvo) aolnVar;
            int i = mvoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvoVar.c = i - Integer.MIN_VALUE;
            } else {
                mvoVar = new defpackage.mvo(this, aolnVar);
            }
        } else {
            mvoVar = new defpackage.mvo(this, aolnVar);
        }
        java.lang.Object obj = mvoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mvoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.e;
            defpackage.bbf bbfVar = new defpackage.bbf((aoln) null, 7, (byte[][]) null);
            mvoVar.c = 1;
            if (ecxVar.a(bbfVar, mvoVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.mvp mvpVar;
        if (aolnVar instanceof defpackage.mvp) {
            mvpVar = (defpackage.mvp) aolnVar;
            int i = mvpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvpVar.c = i - Integer.MIN_VALUE;
            } else {
                mvpVar = new defpackage.mvp(this, aolnVar);
            }
        } else {
            mvpVar = new defpackage.mvp(this, aolnVar);
        }
        java.lang.Object obj = mvpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mvpVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.e;
            ipv ipvVar = new ipv((aoln) null, 17, (boolean[][][]) null);
            mvpVar.c = 1;
            if (ecxVar.a(ipvVar, mvpVar) == aoluVar) {
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

    public final java.lang.String d() {
        java.lang.String string = this.c.getString(2132018422);
        aooh.e(string, "getString(...)");
        return string;
    }

    public final java.lang.String e() {
        return this.f;
    }

    public final java.lang.String f() {
        java.lang.String string = this.c.getString(2132018425);
        aooh.e(string, "getString(...)");
        return string;
    }

    public final java.util.List g() {
        android.content.Context context = this.c;
        java.lang.String string = context.getString(2132018428);
        aooh.e(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilderAppend = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) context.getString(2132018427)).append((java.lang.CharSequence) "\n\n").append(context.getString(2132018426), new defpackage.mvq(this), 33);
        aooh.e(spannableStringBuilderAppend, "append(...)");
        return ajsz.aY(new rii(2131231577, string, spannableStringBuilderAppend));
    }

    public final java.lang.Object h() {
        android.content.Intent intent = this.g.b;
        boolean z = true;
        if (intent == null) {
            b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/joyball/DobbyJoyballIntegration", "shouldShowInJoyball", 44, "DobbyJoyballIntegration.kt").v("intent is null; show dobby");
        } else {
            boolean booleanExtra = intent.getBooleanExtra("DIALER_JOYBALL_SHOW_DOBBY", true);
            aimz aimzVar = b;
            if (booleanExtra) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/joyball/DobbyJoyballIntegration", "shouldShowInJoyball", 58, "DobbyJoyballIntegration.kt").v("show dobby");
            } else {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/joyball/DobbyJoyballIntegration", "shouldShowInJoyball", 53, "DobbyJoyballIntegration.kt").v("DIALER_JOYBALL_SHOW_DOBBY is false; do not show dobby");
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
