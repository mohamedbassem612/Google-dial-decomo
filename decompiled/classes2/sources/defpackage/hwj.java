package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwj {
    public static final aimz a = aimz.i("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer");
    public final defpackage.hvn b;
    public final aoss c;
    public final aoin d;
    public aoub e;
    public final aowi f;
    public defpackage.hxf g;
    public final zpz h;
    public final qbe i;
    public final defpackage.idh j;
    public final hvy k;
    public defpackage.hgt l;
    public final defpackage.jyn m;
    private final aolr n;
    private final aoss o;
    private final aoin p;
    private final afpl q;

    public hwj(hvy hvyVar, zpz zpzVar, defpackage.jyn jynVar, defpackage.hvn hvnVar, afpl afplVar, aolr aolrVar, aoss aossVar, aoss aossVar2, qbe qbeVar, defpackage.idh idhVar, aazc aazcVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(hvyVar, "voiceAssistAudioGenerator");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(hvnVar, "emergencyInfoCache");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "audioPlaybackMaximumLoopCount");
        aooh.f(aoinVar2, "audioPlaybackIntervalMs");
        this.k = hvyVar;
        this.h = zpzVar;
        this.m = jynVar;
        this.b = hvnVar;
        this.q = afplVar;
        this.n = aolrVar;
        this.c = aossVar;
        this.o = aossVar2;
        this.i = qbeVar;
        this.j = idhVar;
        this.p = aoinVar;
        this.d = aoinVar2;
        this.f = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
        this.l = defpackage.hwb.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(j$.util.Optional optional, j$.util.Optional optional2, aoln aolnVar) {
        defpackage.hwe hweVar;
        if (aolnVar instanceof defpackage.hwe) {
            hweVar = (defpackage.hwe) aolnVar;
            int i = hweVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hweVar.c = i - Integer.MIN_VALUE;
            } else {
                hweVar = new defpackage.hwe(this, aolnVar);
            }
        } else {
            hweVar = new defpackage.hwe(this, aolnVar);
        }
        java.lang.Object objAj = hweVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hweVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.n;
            hcn hcnVar = new hcn(this, optional, optional2, (aoln) null, 2);
            hweVar.c = 1;
            objAj = aoov.aj(aolrVar, hcnVar, hweVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.hwf hwfVar;
        if (aolnVar instanceof defpackage.hwf) {
            hwfVar = (defpackage.hwf) aolnVar;
            int i = hwfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hwfVar.c = i - Integer.MIN_VALUE;
            } else {
                hwfVar = new defpackage.hwf(this, aolnVar);
            }
        } else {
            hwfVar = new defpackage.hwf(this, aolnVar);
        }
        java.lang.Object objD = hwfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hwfVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.q.X();
            hwfVar.c = 1;
            objD = aosv.D(ajcqVarX, hwfVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAe = ((defpackage.hvz) aooc.ar(objD, defpackage.hvz.class)).ae();
        hwfVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAe, hwfVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final void c(java.io.File file) {
        aimz aimzVar = zih.a;
        aoov.al(this.o, zih.b.plus(aols.a), 1, new bpj((aoln) null, file, 5));
    }

    public final void d(defpackage.hwa hwaVar) {
        if (!aowm.c(this.f.b(hwaVar))) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final boolean e(int i) {
        return ((long) i) >= ((java.lang.Number) this.p.a()).longValue();
    }

    public final boolean f() {
        defpackage.hvn hvnVar = this.b;
        return hvnVar.a == defpackage.hux.CAR_CRASH || hvnVar.a == defpackage.hux.EMERGENCY_SOS;
    }

    public final void g(defpackage.hgt hgtVar) {
        aooh.f(hgtVar, "<set-?>");
        this.l = hgtVar;
    }
}
