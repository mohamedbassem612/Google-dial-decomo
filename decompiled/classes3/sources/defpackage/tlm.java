package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tlm implements defpackage.rio {
    private static final aimz b = aimz.i("com/android/dialer/sharpie/impl/joyball/SharpieJoyballIntegration");
    public final defpackage.ril a;
    private final android.content.Context c;
    private final ecx d;
    private final java.lang.String e;
    private final defpackage.rjj f;
    private final aogc g;

    public tlm(android.content.Context context, ecx ecxVar, defpackage.ril rilVar, defpackage.rjj rjjVar, aogc aogcVar) {
        aooh.f(context, "appContext");
        aooh.f(ecxVar, "dataStore");
        aooh.f(rjjVar, "joyballLifecycle");
        aooh.f(aogcVar, "sharpieSettings");
        this.c = context;
        this.d = ecxVar;
        this.a = rilVar;
        this.f = rjjVar;
        this.g = aogcVar;
        this.e = "dialer_sharpie_consent_transfer_key";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rio
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tli tliVar;
        if (aolnVar instanceof defpackage.tli) {
            tliVar = (defpackage.tli) aolnVar;
            int i = tliVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tliVar.c = i - Integer.MIN_VALUE;
            } else {
                tliVar = new defpackage.tli(this, aolnVar);
            }
        } else {
            tliVar = new defpackage.tli(this, aolnVar);
        }
        java.lang.Object objAw = tliVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tliVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objAw);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAw);
            }
            return ((java.lang.Boolean) objAw).booleanValue() ? defpackage.rin.b : defpackage.rin.c;
        }
        aooc.af(objAw);
        aogc aogcVar = this.g;
        tliVar.c = 1;
        objAw = aogcVar.aw(tliVar);
        if (objAw == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objAw).booleanValue()) {
            return defpackage.rin.a;
        }
        aogc aogcVar2 = this.g;
        tliVar.c = 2;
        objAw = aogcVar2.av(tliVar);
        if (objAw == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objAw).booleanValue()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rio
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.tlj tljVar;
        if (aolnVar instanceof defpackage.tlj) {
            tljVar = (defpackage.tlj) aolnVar;
            int i = tljVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tljVar.c = i - Integer.MIN_VALUE;
            } else {
                tljVar = new defpackage.tlj(this, aolnVar);
            }
        } else {
            tljVar = new defpackage.tlj(this, aolnVar);
        }
        java.lang.Object obj = tljVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tljVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.d;
            bbf bbfVar = new bbf((aoln) null, 15, (short[][][]) null);
            tljVar.c = 1;
            if (ecxVar.a(bbfVar, tljVar) == aoluVar) {
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
    @Override // defpackage.rio
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tlk tlkVar;
        if (aolnVar instanceof defpackage.tlk) {
            tlkVar = (defpackage.tlk) aolnVar;
            int i = tlkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlkVar.c = i - Integer.MIN_VALUE;
            } else {
                tlkVar = new defpackage.tlk(this, aolnVar);
            }
        } else {
            tlkVar = new defpackage.tlk(this, aolnVar);
        }
        java.lang.Object obj = tlkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tlkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.d;
            defpackage.uns unsVar = new defpackage.uns((aoln) null, 1, (byte[]) null);
            tlkVar.c = 1;
            if (ecxVar.a(unsVar, tlkVar) == aoluVar) {
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

    @Override // defpackage.rio
    public final java.lang.String d() {
        java.lang.String string = this.c.getString(2132020112);
        aooh.e(string, "getString(...)");
        return string;
    }

    @Override // defpackage.rio
    public final java.lang.String e() {
        return this.e;
    }

    @Override // defpackage.rio
    public final java.lang.String f() {
        java.lang.String string = this.c.getString(2132020117);
        aooh.e(string, "getString(...)");
        return string;
    }

    @Override // defpackage.rio
    public final java.util.List g() {
        android.content.Context context = this.c;
        java.lang.String string = context.getString(2132020120);
        aooh.e(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilderAppend = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) context.getString(2132020119)).append((java.lang.CharSequence) "\n\n").append(context.getString(2132020118), new defpackage.tll(this), 33);
        aooh.e(spannableStringBuilderAppend, "append(...)");
        return ajsz.aY(new defpackage.rii(2131231602, string, spannableStringBuilderAppend));
    }

    @Override // defpackage.rio
    public final java.lang.Object h() {
        android.content.Intent intent = this.f.b;
        boolean z = true;
        if (intent == null) {
            b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballIntegration", "shouldShowInJoyball", 52, "SharpieJoyballIntegration.kt").v("intent is null; show sharpie");
        } else {
            boolean booleanExtra = intent.getBooleanExtra("DIALER_JOYBALL_SHOW_SHARPIE", true);
            aimz aimzVar = b;
            if (booleanExtra) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballIntegration", "shouldShowInJoyball", 66, "SharpieJoyballIntegration.kt").v("show sharpie");
            } else {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballIntegration", "shouldShowInJoyball", 61, "SharpieJoyballIntegration.kt").v("DIALER_JOYBALL_SHOW_SHARPIE is false; do not show sharpie");
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
