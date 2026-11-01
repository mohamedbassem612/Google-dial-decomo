package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ywd implements defpackage.zdq {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/impl/moirai/scamdetection/SharpieScamDetectionMoiraiAvailability");
    private static final java.util.List b = defpackage.ajsz.aY(defpackage.akfg.US);
    private final defpackage.tmi c;
    private final defpackage.tvn d;

    public ywd(defpackage.tvn tvnVar, defpackage.tmi tmiVar) {
        defpackage.aooh.f(tmiVar, "sharpieConfigProvider");
        this.d = tvnVar;
        this.c = tmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zdq
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        ywc ywcVar;
        if (aolnVar instanceof ywc) {
            ywcVar = (ywc) aolnVar;
            int i = ywcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywcVar.c = i - Integer.MIN_VALUE;
            } else {
                ywcVar = new ywc(this, aolnVar);
            }
        } else {
            ywcVar = new ywc(this, aolnVar);
        }
        java.lang.Object objB = ywcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ywcVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            if (!this.d.c()) {
                return java.lang.Boolean.FALSE;
            }
            defpackage.tmi tmiVar = this.c;
            ywcVar.c = 1;
            objB = tmiVar.b(ywcVar);
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
        yut yutVar = yuwVar.a;
        if (!(yutVar instanceof yut)) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/moirai/scamdetection/SharpieScamDetectionMoiraiAvailability", "isAvailable", 44, "SharpieScamDetectionMoiraiAvailability.kt");
            java.lang.Class<?> cls = yutVar.getClass();
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            aimwVar.y("Disabled due to unsupported model type: %s", new defpackage.aooa(cls).c());
            return java.lang.Boolean.FALSE;
        }
        java.util.Locale locale = yutVar.a;
        if (!defpackage.aooh.n(locale.getLanguage(), "en")) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/moirai/scamdetection/SharpieScamDetectionMoiraiAvailability", "isAvailable", 51, "SharpieScamDetectionMoiraiAvailability.kt")).y("Disabled due to unsupported language: %s", locale.getLanguage());
            return java.lang.Boolean.FALSE;
        }
        if (defpackage.yvl.a(yuwVar.b.b, b)) {
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/moirai/scamdetection/SharpieScamDetectionMoiraiAvailability", "isAvailable", 63, "SharpieScamDetectionMoiraiAvailability.kt")).v("Disabled due to no enabled known country");
        return java.lang.Boolean.FALSE;
    }
}
