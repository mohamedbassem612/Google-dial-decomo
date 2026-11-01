package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iku extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.lang.Object g;
    final /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iku(defpackage.ika ikaVar, defpackage.igr igrVar, ifv ifvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = ikaVar;
        this.g = igrVar;
        this.h = ifvVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        defpackage.igv igvVarT;
        vqf vqfVar;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        int i = this.$cid;
        boolean z = true;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            if (this.e != 0) {
                obj4 = this.d;
                obj3 = this.c;
                obj2 = this.b;
                obj5 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                obj2 = this.f;
                obj3 = this.g;
                java.lang.Object obj14 = this.h;
                apdp apdpVar = ((defpackage.ili) obj2).k;
                this.a = apdpVar;
                this.b = obj2;
                this.c = obj3;
                this.d = obj14;
                this.e = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj4 = obj14;
                obj5 = apdpVar;
            }
            try {
                alqg alqgVar = defpackage.ili.a;
                rih rihVar = (rih) ((defpackage.ili) obj2).h.get(obj3);
                if (rihVar == null) {
                    defpackage.ili.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "handleAudioChunk$<anonymous>$<anonymous>", 327, "AudioPrismDuplexModelRunner.kt").v("skip: stream closed");
                } else {
                    ((defpackage.igb) obj4).c.m(rihVar);
                }
                return aojh.a;
            } finally {
                ((apdp) obj5).d();
            }
        }
        if (i != 1) {
            aolu aoluVar2 = aolu.a;
            if (this.e != 0) {
                obj12 = this.d;
                obj11 = this.c;
                obj10 = this.b;
                obj13 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                obj10 = this.g;
                obj11 = this.h;
                java.lang.Object obj15 = this.f;
                apdp apdpVar2 = ((defpackage.ili) obj10).k;
                this.a = apdpVar2;
                this.b = obj10;
                this.c = obj11;
                this.d = obj15;
                this.e = 1;
                if (apdpVar2.b(this) == aoluVar2) {
                    return aoluVar2;
                }
                obj12 = obj15;
                obj13 = apdpVar2;
            }
            try {
                alqg alqgVar2 = defpackage.ili.a;
                alje aljeVar = ((defpackage.ili) obj10).l;
                if (aljeVar != null) {
                    if (obj11 != ((defpackage.ili) obj10).i) {
                        defpackage.ili.b.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "relay$<anonymous>$<anonymous>", 350, "AudioPrismDuplexModelRunner.kt").I("received event from %s but the running feature is %s", obj11, ((defpackage.ili) obj10).i);
                    } else {
                        aljeVar.b((alro) obj12);
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                defpackage.ili.b.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "relay$<anonymous>$<anonymous>", 342, "AudioPrismDuplexModelRunner.kt").v("skip: not running");
                z = false;
                return java.lang.Boolean.valueOf(z);
            } finally {
                ((apdp) obj13).d();
            }
        }
        aolu aoluVar3 = aolu.a;
        if (this.e != 0) {
            obj8 = this.d;
            obj6 = this.c;
            obj7 = this.b;
            obj9 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            obj6 = this.f;
            obj7 = this.g;
            java.lang.Object obj16 = this.h;
            apdp apdpVar3 = ((defpackage.ika) obj6).f;
            this.a = apdpVar3;
            this.b = obj7;
            this.c = obj6;
            this.d = obj16;
            this.e = 1;
            if (apdpVar3.b(this) == aoluVar3) {
                return aoluVar3;
            }
            obj8 = obj16;
            obj9 = apdpVar3;
        }
        try {
            if (((defpackage.igr) obj7).b != 1) {
                throw new java.lang.IllegalArgumentException("provided config is not an audio quality monitor config");
            }
            aoin aoinVar = (aoin) ((defpackage.ika) obj6).h.k().get(obj8);
            if (aoinVar == null || (vqfVar = (vqf) aoinVar.a()) == null) {
                defpackage.hgw hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL.v(false);
                java.lang.Object obj17 = hgwVarL.a;
                ((akzx) obj17).u();
                defpackage.igv igvVar = (defpackage.igv) ((akzx) obj17).b;
                igvVar.d = java.lang.Integer.valueOf(defpackage.hhe.c(3));
                igvVar.c = 4;
                igvVarT = hgwVarL.t();
            } else {
                defpackage.igm igmVar = ((defpackage.igr) obj7).b == 1 ? (defpackage.igm) ((defpackage.igr) obj7).c : defpackage.igm.a;
                aooh.e(igmVar, "getAudioQualityMonitorConfig(...)");
                ((defpackage.ika) obj6).c = new defpackage.ijx(vqfVar, igmVar);
                aazc aazcVar = ((defpackage.ika) obj6).g;
                ((defpackage.ika) obj6).d = j$.time.Instant.now().toEpochMilli();
                defpackage.hgw hgwVarL2 = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL2.v(true);
                igvVarT = hgwVarL2.t();
            }
            defpackage.igv igvVar2 = igvVarT;
            ((apdp) obj9).d();
            return igvVar2;
        } catch (java.lang.Throwable th) {
            ((apdp) obj9).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.iku ikuVar;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.f;
            defpackage.ili iliVar = (defpackage.ili) obj2;
            ikuVar = new defpackage.iku(iliVar, (defpackage.igd) this.g, (defpackage.igb) this.h, aolnVar, 0);
        } else {
            if (i != 1) {
                java.lang.Object obj3 = this.g;
                return new defpackage.iku((defpackage.ili) obj3, (ifv) this.h, (alro) this.f, aolnVar, 2);
            }
            java.lang.Object obj4 = this.f;
            defpackage.ika ikaVar = (defpackage.ika) obj4;
            ikuVar = new defpackage.iku(ikaVar, (defpackage.igr) this.g, (ifv) this.h, aolnVar, 1);
        }
        return ikuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iku(defpackage.ili iliVar, ifv ifvVar, alro alroVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.g = iliVar;
        this.h = ifvVar;
        this.f = alroVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iku(defpackage.ili iliVar, defpackage.igd igdVar, defpackage.igb igbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = iliVar;
        this.g = igdVar;
        this.h = igbVar;
    }
}
