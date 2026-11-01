package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ikk extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.ikl f;
    final /* synthetic */ defpackage.igr g;
    final /* synthetic */ ifv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikk(defpackage.ikl iklVar, defpackage.igr igrVar, ifv ifvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = iklVar;
        this.g = igrVar;
        this.h = ifvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.ikl iklVar;
        defpackage.igr igrVar;
        java.lang.Object obj2;
        apdp apdpVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.igz igzVar;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.igv igvVarT;
        java.lang.Object obj8;
        java.lang.Object obj9;
        defpackage.igv igvVarT2 = aolu.a;
        int i = this.e;
        try {
            if (i == 0) {
                aooc.af(obj);
                iklVar = this.f;
                gus.aw("Start");
                iklVar.f.c();
                igrVar = this.g;
                obj2 = this.h;
                apdpVar = iklVar.k;
                this.a = apdpVar;
                this.b = igrVar;
                this.c = iklVar;
                this.d = obj2;
                this.e = 1;
                if (apdpVar.b(this) != igvVarT2) {
                }
                obj4 = apdpVar;
                obj3 = iklVar;
                return igvVarT2;
            }
            if (i != 1) {
                defpackage.ikl iklVar2 = (defpackage.ikl) this.b;
                obj5 = this.a;
                try {
                    try {
                        aooc.af(obj);
                        obj7 = iklVar2;
                        obj5 = obj5;
                        java.util.Map map = defpackage.ikl.a;
                        ((defpackage.ikl) obj7).h = true;
                        defpackage.hgw hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                        hgwVarL.v(true);
                        igvVarT = hgwVarL.t();
                        obj9 = obj5;
                    } catch (java.lang.IllegalStateException e) {
                        e = e;
                        obj6 = obj5;
                        defpackage.ikl.b.d().k(e).l("com/android/dialer/audioprism/internal/models/daredevil/impl/AudioPrismDaredevilModelRunner", "start$<anonymous>$<anonymous>", 106, "AudioPrismDaredevilModelRunner.kt").v("error starting daredevil model");
                        defpackage.hgw hgwVarL2 = defpackage.hht.l(defpackage.igv.a.m());
                        hgwVarL2.v(false);
                        hgwVarL2.w(2);
                        igvVarT = hgwVarL2.t();
                        obj9 = obj6;
                    }
                    igvVarT2 = igvVarT;
                    obj8 = obj9;
                    ((apdp) obj8).d();
                    defpackage.ikl iklVar3 = this.f;
                    gus.aw("Start");
                    iklVar3.f.c();
                    obj4 = apdpVar;
                    obj3 = iklVar;
                    return igvVarT2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    ((apdp) obj5).d();
                    throw th;
                }
            }
            obj2 = this.d;
            java.lang.Object obj10 = this.c;
            igrVar = (defpackage.igr) this.b;
            java.lang.Object obj11 = this.a;
            aooc.af(obj);
            obj3 = obj10;
            obj4 = obj11;
            obj4 = apdpVar;
            obj3 = iklVar;
            if (igrVar.b != 2) {
                throw new java.lang.IllegalArgumentException("provided model config is not a Daredevil config");
            }
            java.util.Map map2 = defpackage.ikl.a;
            if (((defpackage.ikl) obj3).h) {
                throw new java.lang.IllegalStateException("already running");
            }
            aoin aoinVar = (aoin) ((defpackage.ikl) obj3).l.k().get(obj2);
            if (aoinVar == null || (igzVar = (defpackage.igz) aoinVar.a()) == null) {
                defpackage.hgw hgwVarL3 = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL3.v(false);
                hgwVarL3.w(3);
                igvVarT2 = hgwVarL3.t();
                obj8 = obj4;
                ((apdp) obj8).d();
                defpackage.ikl iklVar4 = this.f;
                gus.aw("Start");
                iklVar4.f.c();
            } else {
                ((defpackage.ikl) obj3).i = igzVar;
                defpackage.ikl.b.b().l("com/android/dialer/audioprism/internal/models/daredevil/impl/AudioPrismDaredevilModelRunner", "start$<anonymous>$<anonymous>", 102, "AudioPrismDaredevilModelRunner.kt").v("starting");
                try {
                    mef mefVar = ((defpackage.ikl) obj3).j;
                    ajcq ajcqVarD = mefVar.e.d(ahqx.i(new defpackage.lgc(mefVar, 11)), mefVar.c);
                    aooh.e(ajcqVarD, "initModelResources(...)");
                    this.a = obj4;
                    this.b = obj3;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    java.lang.Object objD = aosv.D(ajcqVarD, this);
                    if (objD != igvVarT2) {
                        obj7 = obj3;
                        obj = objD;
                        obj5 = obj4;
                        java.util.Map map3 = defpackage.ikl.a;
                        ((defpackage.ikl) obj7).h = true;
                        defpackage.hgw hgwVarL4 = defpackage.hht.l(defpackage.igv.a.m());
                        hgwVarL4.v(true);
                        igvVarT = hgwVarL4.t();
                        obj9 = obj5;
                        igvVarT2 = igvVarT;
                        obj8 = obj9;
                        ((apdp) obj8).d();
                        defpackage.ikl iklVar5 = this.f;
                        gus.aw("Start");
                        iklVar5.f.c();
                    }
                } catch (java.lang.IllegalStateException e2) {
                    e = e2;
                    obj6 = obj4;
                    defpackage.ikl.b.d().k(e).l("com/android/dialer/audioprism/internal/models/daredevil/impl/AudioPrismDaredevilModelRunner", "start$<anonymous>$<anonymous>", 106, "AudioPrismDaredevilModelRunner.kt").v("error starting daredevil model");
                    defpackage.hgw hgwVarL5 = defpackage.hht.l(defpackage.igv.a.m());
                    hgwVarL5.v(false);
                    hgwVarL5.w(2);
                    igvVarT = hgwVarL5.t();
                    obj9 = obj6;
                }
            }
            obj4 = apdpVar;
            obj3 = iklVar;
            return igvVarT2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            obj5 = obj4;
            ((apdp) obj5).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ikk(this.f, this.g, this.h, aolnVar);
    }
}
