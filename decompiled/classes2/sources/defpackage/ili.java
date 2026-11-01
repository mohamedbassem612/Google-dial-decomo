package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ili implements defpackage.ijw, alip, defpackage.igc, defpackage.ihi {
    public static final alqg a;
    public static final aimz b;
    public final android.content.Context c;
    public final ajcu d;
    public final defpackage.mfz e;
    public final ruc f;
    public boolean g;
    public java.util.Map h;
    public ifv i;
    public final aljf j;
    public final apdp k;
    public alje l;
    public final zzx m;
    public final rsr n;
    public final ipc o;
    public final aogc p;
    private final aolr q;
    private final aolr r;
    private final aoss s;
    private final afpl t;

    static {
        akzx akzxVarM = alqg.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        akzxVarM.b.b = a.U(2);
        akzxVarM.u();
        akzxVarM.b.c = 16000;
        akzxVarM.u();
        akzxVarM.b.d = 1;
        alqg alqgVarP = akzxVarM.p();
        aooh.e(alqgVarP, "build(...)");
        a = alqgVarP;
        b = aimz.i("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner");
    }

    public ili(android.content.Context context, aolr aolrVar, ajcu ajcuVar, aolr aolrVar2, aoss aossVar, aljf aljfVar, afpl afplVar, zzx zzxVar, rsr rsrVar, aogc aogcVar, ipc ipcVar, defpackage.mfz mfzVar, ruc rucVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(ajcuVar, "blockingExecutor");
        aooh.f(aolrVar2, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aljfVar, "duplexService");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(aogcVar, "synchronousFileStorage");
        aooh.f(rucVar, "metrics");
        this.c = context;
        this.q = aolrVar;
        this.d = ajcuVar;
        this.r = aolrVar2;
        this.s = aossVar;
        this.j = aljfVar;
        this.t = afplVar;
        this.m = zzxVar;
        this.n = rsrVar;
        this.p = aogcVar;
        this.o = ipcVar;
        this.e = mfzVar;
        this.f = rucVar;
        this.k = new apdp();
        this.h = new java.util.LinkedHashMap();
    }

    public static final defpackage.igv p(int i) {
        defpackage.hgw hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
        hgwVarL.v(false);
        akzx akzxVar = (akzx) hgwVarL.a;
        akzxVar.u();
        defpackage.igv igvVar = (defpackage.igv) akzxVar.b;
        igvVar.d = java.lang.Integer.valueOf(defpackage.hhv.b(i));
        igvVar.c = 5;
        return hgwVarL.t();
    }

    private final java.lang.Object q(defpackage.igd igdVar, defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.q, new defpackage.iku(this, igdVar, igbVar, (aoln) null, 0), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    private final void r(java.lang.Object obj, aono aonoVar, java.lang.String str) {
        aimz aimzVar = zih.a;
        aoov.al(this.s, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, this, aonoVar, obj, str, 0));
    }

    @Override // defpackage.igc
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objQ = q(defpackage.igd.AUDIO_SOURCE_DOWNLINK, igbVar, aolnVar);
        return objQ != aolu.a ? aojh.a : objQ;
    }

    @Override // defpackage.igc
    public final java.lang.Object b(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objQ = q(defpackage.igd.AUDIO_SOURCE_UPLINK, igbVar, aolnVar);
        return objQ != aolu.a ? aojh.a : objQ;
    }

    @Override // defpackage.ihi
    public final java.lang.Object c(ifv ifvVar, alro alroVar, aoln aolnVar) {
        return aoov.aj(this.r, new defpackage.iku(this, ifvVar, alroVar, (aoln) null, 2), aolnVar);
    }

    @Override // defpackage.ijw
    public final java.lang.Object d(ifv ifvVar, ifz ifzVar, defpackage.igr igrVar, java.lang.String str, defpackage.igg iggVar, aoln aolnVar) {
        return aoov.aj(this.r, new defpackage.imx(this, ifvVar, ifzVar, igrVar, str, iggVar, (aoln) null, 1), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ijw
    public final java.lang.Object e(ifv ifvVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.ile ileVar;
        apdp apdpVar;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.ile) {
            ileVar = (defpackage.ile) aolnVar;
            int i = ileVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ileVar.c = i - Integer.MIN_VALUE;
            } else {
                ileVar = new defpackage.ile(this, aolnVar);
            }
        } else {
            ileVar = new defpackage.ile(this, aolnVar);
        }
        java.lang.Object obj = ileVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ileVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.mfz mfzVar = this.e;
                gus.aw("Stop");
                mfzVar.c();
                apdpVar = this.k;
                ileVar.d = apdpVar;
                ileVar.c = 1;
                if (apdpVar.b(ileVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = ileVar.d;
                    try {
                        aooc.af(obj);
                        apdpVar2.d();
                        defpackage.mfz mfzVar2 = this.e;
                        gus.aw("Stop");
                        mfzVar2.c();
                        return aojh.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdp apdpVar3 = ileVar.d;
                aooc.af(obj);
                apdpVar = apdpVar3;
            }
            aolr aolrVar = this.q;
            defpackage.icr icrVar = new defpackage.icr(this, (aoln) null, 6);
            ileVar.d = apdpVar;
            ileVar.c = 2;
            if (aoov.aj(aolrVar, icrVar, ileVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            defpackage.mfz mfzVar3 = this.e;
            gus.aw("Stop");
            mfzVar3.c();
            return aojh.a;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    public final defpackage.ikq f() {
        java.lang.Object objAr = aooc.ar(this.t.Y(), defpackage.ikq.class);
        aooh.e(objAr, "get(...)");
        return (defpackage.ikq) objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object g(ifv ifvVar, ifz ifzVar, defpackage.igr igrVar, java.lang.String str, defpackage.igg iggVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.ikz ikzVar;
        ifv ifvVar2;
        apdp apdpVar;
        defpackage.igr igrVar2;
        java.lang.String str2;
        defpackage.igg iggVar2;
        ifz ifzVar2;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.ikz) {
            ikzVar = (defpackage.ikz) aolnVar;
            int i = ikzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikzVar.d = i - Integer.MIN_VALUE;
            } else {
                ikzVar = new defpackage.ikz(this, aolnVar);
            }
        } else {
            ikzVar = new defpackage.ikz(this, aolnVar);
        }
        defpackage.ikz ikzVar2 = ikzVar;
        java.lang.Object objAj = ikzVar2.b;
        defpackage.igv igvVar = aolu.a;
        int i2 = ikzVar2.d;
        try {
            if (i2 == 0) {
                aooc.af(objAj);
                apdp apdpVar3 = this.k;
                ikzVar2.a = ifvVar;
                ikzVar2.e = ifzVar;
                ikzVar2.f = igrVar;
                ikzVar2.g = str;
                ikzVar2.h = iggVar;
                ikzVar2.i = apdpVar3;
                ikzVar2.d = 1;
                if (apdpVar3.b(ikzVar2) != igvVar) {
                    ifvVar2 = ifvVar;
                    apdpVar = apdpVar3;
                    igrVar2 = igrVar;
                    str2 = str;
                    iggVar2 = iggVar;
                    ifzVar2 = ifzVar;
                }
                return igvVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) ikzVar2.a;
                try {
                    aooc.af(objAj);
                    igvVar = (defpackage.igv) objAj;
                    apdpVar2.d();
                    return igvVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar4 = ikzVar2.i;
            defpackage.igg iggVar3 = ikzVar2.h;
            java.lang.String str3 = ikzVar2.g;
            defpackage.igr igrVar3 = ikzVar2.f;
            ifz ifzVar3 = ikzVar2.e;
            ifv ifvVar3 = (ifv) ikzVar2.a;
            aooc.af(objAj);
            iggVar2 = iggVar3;
            igrVar2 = igrVar3;
            ifzVar2 = ifzVar3;
            apdpVar = apdpVar4;
            str2 = str3;
            ifvVar2 = ifvVar3;
            aolr aolrVar = this.r;
            defpackage.ila ilaVar = new defpackage.ila(str2, igrVar2, this, ifvVar2, ifzVar2, iggVar2, null);
            ikzVar2.a = apdpVar;
            ikzVar2.e = null;
            ikzVar2.f = null;
            ikzVar2.g = null;
            ikzVar2.h = null;
            ikzVar2.i = null;
            ikzVar2.d = 2;
            objAj = aoov.aj(aolrVar, ilaVar, ikzVar2);
            if (objAj != igvVar) {
                apdpVar2 = apdpVar;
                igvVar = (defpackage.igv) objAj;
                apdpVar2.d();
            }
            return igvVar;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object h(alqk alqkVar, java.lang.String str, amba ambaVar, aoln aolnVar) {
        defpackage.ilb ilbVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.ilb) {
            ilbVar = (defpackage.ilb) aolnVar;
            int i = ilbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilbVar.c = i - Integer.MIN_VALUE;
            } else {
                ilbVar = new defpackage.ilb(this, aolnVar);
            }
        } else {
            ilbVar = new defpackage.ilb(this, aolnVar);
        }
        java.lang.Object objAj = ilbVar.a;
        alje aljeVar = aolu.a;
        int i2 = ilbVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            if (!ahvr.R(ilbVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(123, "AudioPrismDuplexModelRunner_startNewDuplexDualChannelConversation");
            try {
                aolr aolrVar = this.q;
                defpackage.blv blvVar = new defpackage.blv(this, ambaVar, str, alqkVar, (aoln) null, 8);
                ilbVar.d = ahoqVarZ;
                ilbVar.c = 1;
                objAj = aoov.aj(aolrVar, blvVar, ilbVar);
                if (objAj != aljeVar) {
                    ahoqVar = ahoqVarZ;
                }
                return aljeVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ilbVar.d;
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
        aljeVar = (alje) objAj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        aooh.e(aljeVar, "suspendableSpan(...)");
        return aljeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object i(alqk alqkVar, java.lang.String str, amba ambaVar, defpackage.igd igdVar, aoln aolnVar) {
        defpackage.ilc ilcVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.ilc) {
            ilcVar = (defpackage.ilc) aolnVar;
            int i = ilcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilcVar.c = i - Integer.MIN_VALUE;
            } else {
                ilcVar = new defpackage.ilc(this, aolnVar);
            }
        } else {
            ilcVar = new defpackage.ilc(this, aolnVar);
        }
        java.lang.Object objAj = ilcVar.a;
        alje aljeVar = aolu.a;
        int i2 = ilcVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            if (!ahvr.R(ilcVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(124, "AudioPrismDuplexModelRunner_startNewDuplexSingleChannelConversation");
            try {
                aolr aolrVar = this.q;
                defpackage.buj bujVar = new defpackage.buj(this, ambaVar, str, alqkVar, igdVar, (aoln) null, 4);
                ilcVar.d = ahoqVarZ;
                ilcVar.c = 1;
                objAj = aoov.aj(aolrVar, bujVar, ilcVar);
                if (objAj != aljeVar) {
                    ahoqVar = ahoqVarZ;
                }
                return aljeVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ilcVar.d;
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
        aljeVar = (alje) objAj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        aooh.e(aljeVar, "suspendableSpan(...)");
        return aljeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(acuh acuhVar, java.io.File file, boolean z, aoln aolnVar) {
        defpackage.ilf ilfVar;
        if (aolnVar instanceof defpackage.ilf) {
            ilfVar = (defpackage.ilf) aolnVar;
            int i = ilfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilfVar.c = i - Integer.MIN_VALUE;
            } else {
                ilfVar = new defpackage.ilf(this, aolnVar);
            }
        } else {
            ilfVar = new defpackage.ilf(this, aolnVar);
        }
        java.lang.Object objAj = ilfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilfVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.q;
            defpackage.ilg ilgVar = new defpackage.ilg(this, acuhVar, file, z, null);
            ilfVar.c = 1;
            objAj = aoov.aj(aolrVar, ilgVar, ilfVar);
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
    public final java.lang.Object k(acux acuxVar, aoln aolnVar) {
        defpackage.ilh ilhVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.ilh) {
            ilhVar = (defpackage.ilh) aolnVar;
            int i = ilhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilhVar.c = i - Integer.MIN_VALUE;
            } else {
                ilhVar = new defpackage.ilh(this, aolnVar);
            }
        } else {
            ilhVar = new defpackage.ilh(this, aolnVar);
        }
        java.lang.Object obj = ilhVar.a;
        defpackage.ikt iktVar = aolu.a;
        int i2 = ilhVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(ilhVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(125, "AudioPrismDuplexModelRunner_unzipOnDemand");
            try {
                aolr aolrVar = this.q;
                defpackage.inm inmVar = new defpackage.inm(this, acuxVar, (aoln) null, 1);
                ilhVar.d = ahoqVarZ;
                ilhVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, inmVar, ilhVar);
                if (objAj != iktVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return iktVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ilhVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        iktVar = (defpackage.ikt) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return iktVar;
    }

    public final void m(alio alioVar) {
        r(alioVar, defpackage.ikw.a, "failed to pass error to listener");
    }

    public final void n(altn altnVar) {
        aooh.f(altnVar, "recognitionEventLog");
        r(altnVar, defpackage.ikx.a, "failed to pass log to listener");
    }

    public final void o(alsi alsiVar) {
        aooh.f(alsiVar, "event");
        r(alsiVar, defpackage.iky.a, "failed to pass outbound event to listener");
    }

    public final void l() {
    }
}
