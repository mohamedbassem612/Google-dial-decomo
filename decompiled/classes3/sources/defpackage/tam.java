package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tam implements defpackage.znh {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer");
    public final ajcu b;
    public final java.util.concurrent.Executor c;
    public final lev d;
    public final tbm e;
    public final long f;
    public final defpackage.szs g;
    public final swn h;
    public final defpackage.swx i;
    public final tbo j;
    public final defpackage.szt k;
    public final ljd l;
    public final java.lang.String m;
    public boolean n = true;
    public final defpackage.pqm o;
    public final defpackage.qbe p;
    public final zpz q;
    private final j$.util.Optional r;
    private final defpackage.afpl s;

    public tam(ajcu ajcuVar, defpackage.pqm pqmVar, lev levVar, tbm tbmVar, long j, defpackage.afpl afplVar, defpackage.szs szsVar, swn swnVar, defpackage.swx swxVar, tbo tboVar, defpackage.szt sztVar, ljd ljdVar, defpackage.qbe qbeVar, java.lang.String str, zpz zpzVar, j$.util.Optional optional) {
        this.b = ajcuVar;
        this.c = new ajdc(ajcuVar);
        this.o = pqmVar;
        this.d = levVar;
        this.e = tbmVar;
        this.f = j;
        this.s = afplVar;
        this.g = szsVar;
        this.h = swnVar;
        this.i = swxVar;
        this.j = tboVar;
        this.k = sztVar;
        this.l = ljdVar;
        this.p = qbeVar;
        this.m = str;
        this.q = zpzVar;
        this.r = optional;
    }

    @Override // defpackage.znh
    public final ajcq a() {
        if (!d()) {
            a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "onAudioProcessingStarted", 134, "RevelioSessionInitializer.java").v("Audio processing was not initiated by Tidepods Revelio.");
            return ajcm.a;
        }
        ajcq ajcqVarB = b();
        int i = 4;
        defpackage.qgk qgkVar = new defpackage.qgk(i);
        ajcu ajcuVar = this.b;
        ahvr.J(ahvr.I(ajcqVarB, qgkVar, ajcuVar), new kxt(this, 17), ajcuVar);
        ahoq ahoqVarW = ahvr.W(859, "RevelioSessionInitializer_handleAudioProcessingStartedForRevelio");
        try {
            ahoq ahoqVarW2 = ahvr.W(857, "RevelioSessionInitializer_checkPrerequisitesAndGetSessionConfig");
            try {
                ajcq ajcqVarI = ahvr.I(b(), new defpackage.tai(this, i), ajcuVar);
                ahoqVarW2.a(ajcqVarI);
                ahoqVarW2.close();
                ajcq ajcqVarI2 = ahvr.I(ajcqVarI, new defpackage.tai(this, 3), this.b);
                ahoqVarW.a(ajcqVarI2);
                agsm.i(860, ajcqVarI2, "failed handling the starting of audio processing for Revelio", new java.lang.Object[0]);
                ahoqVarW.close();
                return ajcqVarI2;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW2.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final ajcq b() {
        return ahvr.H(this.s.X(), new defpackage.syf(12), this.b);
    }

    public final ajcq c() {
        return ahvr.E(new defpackage.sxq(this, 6), this.c);
    }

    public final boolean d() {
        lnn lnnVarB;
        j$.util.Optional optional = this.r;
        boolean zIsPresent = optional.isPresent();
        aimz aimzVar = a;
        if (zIsPresent) {
            aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "shouldRun", 382, "RevelioSessionInitializer.java").v("call screening result is present");
            int iAb = a.ab(((lnl) optional.orElseThrow()).c);
            if (iAb == 0) {
                iAb = 1;
            }
            if (iAb != 4 && iAb != 6) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "shouldRun", 387, "RevelioSessionInitializer.java").y("call screening service did not silence call, outcome is %s", mni.cF(iAb));
                return false;
            }
            lnk lnkVar = ((lnl) optional.orElseThrow()).d;
            if (lnkVar == null) {
                lnkVar = lnk.a;
            }
            int i = lnkVar.b;
            if (i != 1) {
                hgb.c(aimzVar.b(), "feature cause does not have audio based screening feature key", "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "shouldRun", (char) 395, "RevelioSessionInitializer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                return false;
            }
            if (i == 1) {
                lnnVarB = lnn.b(((java.lang.Integer) lnkVar.c).intValue());
                if (lnnVarB == null) {
                    lnnVarB = lnn.g;
                }
            } else {
                lnnVarB = lnn.a;
            }
            if (lnnVarB != lnn.f) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "shouldRun", 403, "RevelioSessionInitializer.java").y("feature key %s does not belong to Revelio", lnnVarB.name());
                return false;
            }
        } else {
            hgb.c(aimzVar.b(), "call screening result is missing", "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "shouldRun", (char) 379, "RevelioSessionInitializer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            if (this.e.f.get() != this.f) {
                return false;
            }
        }
        return true;
    }
}
