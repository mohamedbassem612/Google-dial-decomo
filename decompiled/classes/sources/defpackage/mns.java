package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mns {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/audioprism/DobbySingletonAudioPrismConfigProvider");
    public static final boolean b;
    public final defpackage.aoin c;
    public final defpackage.mvy d;
    public final defpackage.mvz e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.aoin j;
    public final defpackage.aoin k;
    public final defpackage.aoin l;
    public final defpackage.aoin m;
    public final defpackage.aoin n;
    public final defpackage.aoin o;
    public final defpackage.aoin p;
    public final defpackage.aoin q;
    private final defpackage.aonj r;

    static {
        b = android.os.Build.VERSION.SDK_INT >= 33;
    }

    public mns(defpackage.aoin aoinVar, defpackage.rlv rlvVar, defpackage.mvy mvyVar, defpackage.mvz mvzVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9, defpackage.aoin aoinVar10, defpackage.aoin aoinVar11, defpackage.aoin aoinVar12, defpackage.aoin aoinVar13) {
        if (aoinVar == null) {
            defpackage.aooh.i("duplexSpokenIntentsVoiceVersion");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (mvyVar == null) {
            defpackage.aooh.i("dobbySingletonLocaleProvider");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableDobbyBamFullFunctionality");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("duplexAutoScreenOpeningStatementVariant");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("duplexManualScreenOpeningStatementVariant");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("duplexManualScreenIsItUrgentOpeningStatementVariant");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("enableDuplexManualScreenSmartReplyLlm");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("enableKeepSelectedReplyChipState");
        }
        if (aoinVar8 == null) {
            defpackage.aooh.i("enableDuplexSmartReplyTextGenerationInBackgroundOptimization");
        }
        if (aoinVar9 == null) {
            defpackage.aooh.i("enableAgenticCallScreen");
        }
        if (aoinVar10 == null) {
            defpackage.aooh.i("gacsTimeoutThresholdMillis");
        }
        if (aoinVar11 == null) {
            defpackage.aooh.i("gacsSilenceThresholdMillis");
        }
        if (aoinVar12 == null) {
            defpackage.aooh.i("gacsInitialDisclosureSilenceThresholdMillis");
        }
        if (aoinVar13 == null) {
            defpackage.aooh.i("gacsLoraModelMaxVersion");
        }
        this.c = aoinVar;
        this.d = mvyVar;
        this.e = mvzVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.i = aoinVar5;
        this.j = aoinVar6;
        this.k = aoinVar7;
        this.l = aoinVar8;
        this.m = aoinVar9;
        this.n = aoinVar10;
        this.o = aoinVar11;
        this.p = aoinVar12;
        this.q = aoinVar13;
        this.r = new defpackage.aiuo(new defpackage.mnr(this, null));
    }

    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return this.r.a(aolnVar);
    }
}
