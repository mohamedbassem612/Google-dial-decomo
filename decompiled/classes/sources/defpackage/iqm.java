package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iqm implements defpackage.zcr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn");
    public final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin f;
    private final defpackage.iqo g;
    private final defpackage.zzx h;

    public iqm(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.zzx zzxVar, defpackage.iqo iqoVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableBeesly");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("supportActions");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("supportSpamScamDetection");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("supportTranscriptBusinessName");
        }
        this.c = aoinVar;
        this.d = aoinVar2;
        this.f = aoinVar3;
        this.b = aoinVar4;
        this.h = zzxVar;
        this.g = iqoVar;
    }

    private final boolean h() {
        return this.g.a() != 1;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.h.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "isEnabled", 33, "BeeslyEnabledFn.kt")).v("disabled due to direct boot");
            return false;
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue() || h()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "isEnabled", 40, "BeeslyEnabledFn.kt")).v("disabled by flag");
        return false;
    }

    public final boolean b() {
        if (this.h.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "isBeeslyV2Enabled", 53, "BeeslyEnabledFn.kt")).v("disabled due to direct boot");
            return false;
        }
        if (h()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "isBeeslyV2Enabled", 58, "BeeslyEnabledFn.kt")).v("beesly V2 disabled by flag");
        return false;
    }

    public final boolean c() {
        if (!a()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportActions", 70, "BeeslyEnabledFn.kt")).v("disabled by beesly feature");
            return false;
        }
        if (!((java.lang.Boolean) this.d.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportActions", 75, "BeeslyEnabledFn.kt")).v("disabled by flag for actions");
            return false;
        }
        if (!h()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportActions", 80, "BeeslyEnabledFn.kt")).v("beesly V2 does not support actions");
        return false;
    }

    public final boolean d() {
        return this.g.a() + (-1) == 1;
    }

    public final boolean e() {
        if (!f()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportSpamScamDetection", 95, "BeeslyEnabledFn.kt")).v("disabled as transcription is not supported");
            return false;
        }
        if (((java.lang.Boolean) this.f.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportSpamScamDetection", 100, "BeeslyEnabledFn.kt")).v("disabled by flag for spam scam detection");
        return false;
    }

    public final boolean f() {
        int iA = this.g.a() - 1;
        return iA == 2 || iA == 3;
    }

    public final boolean g() {
        return this.g.a() + (-1) == 3;
    }
}
