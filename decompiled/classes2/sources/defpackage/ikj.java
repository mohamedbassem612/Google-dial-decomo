package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikj {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl");
    public final aolr b;
    public final java.util.Map c;
    public final java.util.Map d;
    public final apdp e;
    public final defpackage.ikc f;
    private final defpackage.mfz g;

    public ikj(aolr aolrVar, java.util.Map map, defpackage.ikc ikcVar, defpackage.mfz mfzVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ikcVar, "compositeModelAvailability");
        this.b = aolrVar;
        this.c = map;
        this.f = ikcVar;
        this.g = mfzVar;
        this.e = new apdp();
        this.d = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(ifv ifvVar, ifz ifzVar, igs igsVar, defpackage.igg iggVar, aoln aolnVar) {
        defpackage.ikd ikdVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.ikd) {
            ikdVar = (defpackage.ikd) aolnVar;
            int i = ikdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikdVar.c = i - Integer.MIN_VALUE;
            } else {
                ikdVar = new defpackage.ikd(this, aolnVar);
            }
        } else {
            ikdVar = new defpackage.ikd(this, aolnVar);
        }
        java.lang.Object objAj = ikdVar.a;
        defpackage.igx igxVar = aolu.a;
        int i2 = ikdVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            defpackage.mfz mfzVar = this.g;
            gus.aw("Start");
            mfzVar.c();
            if (!ahvr.R(ikdVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(120, "AudioPrismCompositeModelRunnerImpl_start");
            try {
                ikdVar.d = ahoqVarZ;
                ikdVar.c = 1;
                objAj = aoov.aj(this.b, new defpackage.buj(ifvVar, this, ifzVar, igsVar, iggVar, (aoln) null, 2), ikdVar);
                if (objAj != igxVar) {
                    ahoqVar = ahoqVarZ;
                }
                return igxVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ikdVar.d;
        try {
            aooc.af(objAj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        igxVar = (defpackage.igx) objAj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        defpackage.mfz mfzVar2 = this.g;
        gus.aw("Start");
        mfzVar2.c();
        return igxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(ifv ifvVar, aoln aolnVar) {
        defpackage.ikg ikgVar;
        if (aolnVar instanceof defpackage.ikg) {
            ikgVar = (defpackage.ikg) aolnVar;
            int i = ikgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikgVar.c = i - Integer.MIN_VALUE;
            } else {
                ikgVar = new defpackage.ikg(this, aolnVar);
            }
        } else {
            ikgVar = new defpackage.ikg(this, aolnVar);
        }
        java.lang.Object obj = ikgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ikgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.mfz mfzVar = this.g;
            gus.aw("Stop");
            mfzVar.c();
            aolr aolrVar = this.b;
            defpackage.iiw iiwVar = new defpackage.iiw(ifvVar, this, (aoln) null, 4);
            ikgVar.c = 1;
            if (aoov.aj(aolrVar, iiwVar, ikgVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        defpackage.mfz mfzVar2 = this.g;
        gus.aw("Stop");
        mfzVar2.c();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(ifv ifvVar, igs igsVar, aoln aolnVar) {
        defpackage.ikh ikhVar;
        if (aolnVar instanceof defpackage.ikh) {
            ikhVar = (defpackage.ikh) aolnVar;
            int i = ikhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikhVar.c = i - Integer.MIN_VALUE;
            } else {
                ikhVar = new defpackage.ikh(this, aolnVar);
            }
        } else {
            ikhVar = new defpackage.ikh(this, aolnVar);
        }
        java.lang.Object obj = ikhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ikhVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.b;
            defpackage.fxp fxpVar = new defpackage.fxp(igsVar, this, ifvVar, (aoln) null, 2);
            ikhVar.c = 1;
            if (aoov.aj(aolrVar, fxpVar, ikhVar) == aoluVar) {
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
}
