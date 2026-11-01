package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ywg implements defpackage.zdq {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/impl/moirai/scamintentpolicy/SharpieScamIntentPolicyMoiraiAvailability");
    private final defpackage.tmi b;
    private final defpackage.tvn c;

    public ywg(defpackage.tvn tvnVar, defpackage.tmi tmiVar) {
        defpackage.aooh.f(tmiVar, "sharpieConfigProvider");
        this.c = tvnVar;
        this.b = tmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zdq
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        ywf ywfVar;
        if (aolnVar instanceof ywf) {
            ywfVar = (ywf) aolnVar;
            int i = ywfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywfVar.c = i - Integer.MIN_VALUE;
            } else {
                ywfVar = new ywf(this, aolnVar);
            }
        } else {
            ywfVar = new ywf(this, aolnVar);
        }
        java.lang.Object objB = ywfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ywfVar.c;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            if (!this.c.c()) {
                return java.lang.Boolean.FALSE;
            }
            defpackage.tmi tmiVar = this.b;
            ywfVar.c = 1;
            objB = tmiVar.b(ywfVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        yuw yuwVar = (yuw) objB;
        if (yuwVar.a instanceof yus) {
            yur yurVar = yuwVar.b;
            if (!defpackage.yvl.a(yurVar.b, yurVar.a)) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/moirai/scamintentpolicy/SharpieScamIntentPolicyMoiraiAvailability", "isAvailable", 47, "SharpieScamIntentPolicyMoiraiAvailability.kt")).v("Disabled due to no enabled known country");
            }
            return java.lang.Boolean.valueOf(z);
        }
        ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/impl/moirai/scamintentpolicy/SharpieScamIntentPolicyMoiraiAvailability", "isAvailable", 37, "SharpieScamIntentPolicyMoiraiAvailability.kt")).v("Model is not AiCoreIntentClassifier, not eligible for scam intent policy");
        z = false;
        return java.lang.Boolean.valueOf(z);
    }
}
