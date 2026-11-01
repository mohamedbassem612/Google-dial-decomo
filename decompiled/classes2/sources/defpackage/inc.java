package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class inc implements defpackage.ijw, defpackage.igc {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner");
    public final defpackage.ilt b;
    public final defpackage.imh c;
    public final defpackage.iml d;
    public final defpackage.ima e;
    public final aoin f;
    public final java.util.Map g;
    public final java.util.Map h;
    public final qbe i;
    private final aoss j;
    private final aolr k;
    private final defpackage.mfz l;
    private final aoin m;
    private final txc n;
    private final ahda o;
    private final afpl p;

    public inc(aoss aossVar, aolr aolrVar, afpl afplVar, txc txcVar, defpackage.ilt iltVar, defpackage.mfz mfzVar, defpackage.imh imhVar, defpackage.iml imlVar, qbe qbeVar, defpackage.ima imaVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(imlVar, "sodaLocaleState");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(imaVar, "sodaEventTimestampTracker");
        aooh.f(aoinVar, "enableSodaBiasingWithInCallUiDisplayName");
        aooh.f(aoinVar2, "stopDownlinkSodaWhenUplinkInitFails");
        this.j = aossVar;
        this.k = aolrVar;
        this.p = afplVar;
        this.n = txcVar;
        this.b = iltVar;
        this.l = mfzVar;
        this.c = imhVar;
        this.d = imlVar;
        this.i = qbeVar;
        this.e = imaVar;
        this.m = aoinVar;
        this.f = aoinVar2;
        this.o = new ahda((byte[]) null);
        this.g = new java.util.LinkedHashMap();
        this.h = new java.util.LinkedHashMap();
    }

    public static final defpackage.igv l(int i, defpackage.igw igwVar) {
        defpackage.hgw hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
        hgwVarL.v(false);
        akzx akzxVar = (akzx) hgwVarL.a;
        akzxVar.u();
        defpackage.igv igvVar = (defpackage.igv) akzxVar.b;
        igvVar.d = java.lang.Integer.valueOf(defpackage.hmr.c(i));
        igvVar.c = 2;
        if (igwVar != null) {
            hgwVarL.u(igwVar);
        }
        return hgwVarL.t();
    }

    private final java.lang.Object m(defpackage.igd igdVar, defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.j, this.o, new defpackage.hyq(this, igdVar, igbVar, (aoln) null, 5)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.igc
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objM = m(defpackage.igd.AUDIO_SOURCE_DOWNLINK, igbVar, aolnVar);
        return objM != aolu.a ? aojh.a : objM;
    }

    @Override // defpackage.igc
    public final java.lang.Object b(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objM = m(defpackage.igd.AUDIO_SOURCE_UPLINK, igbVar, aolnVar);
        return objM != aolu.a ? aojh.a : objM;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.imr imrVar;
        java.lang.String str;
        java.lang.StringBuilder sb;
        int length;
        int i;
        char cCharAt;
        if (aolnVar instanceof defpackage.imr) {
            imrVar = (defpackage.imr) aolnVar;
            int i2 = imrVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imrVar.c = i2 - Integer.MIN_VALUE;
            } else {
                imrVar = new defpackage.imr(this, aolnVar);
            }
        } else {
            imrVar = new defpackage.imr(this, aolnVar);
        }
        java.lang.Object objH = imrVar.a;
        aolu aoluVar = aolu.a;
        int i3 = imrVar.c;
        if (i3 == 0) {
            aooc.af(objH);
            if (((java.lang.Boolean) this.m.a()).booleanValue()) {
                imrVar.c = 1;
                objH = h(imrVar);
                if (objH == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i3 == 1) {
            aooc.af(objH);
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objH);
        }
        str = (java.lang.String) objH;
        if (str != null && str.length() != 0) {
            sb = new java.lang.StringBuilder();
            length = str.length();
            for (i = 0; i < length; i++) {
                cCharAt = str.charAt(i);
                if (!afsq.cl(cCharAt) || afsq.cs(cCharAt)) {
                    sb.append(' ');
                } else {
                    sb.append(cCharAt);
                }
            }
            java.lang.String string = aoov.x(sb.toString()).toString();
            return ajsz.bT(ajsz.aY(string), aoov.S(string, new java.lang.String[]{" "}, 0));
        }
        return null;
        if (!((java.lang.Boolean) objH).booleanValue()) {
            imrVar.c = 2;
            objH = f(imrVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objH;
            if (str != null) {
                sb = new java.lang.StringBuilder();
                length = str.length();
                while (i < length) {
                    cCharAt = str.charAt(i);
                    if (afsq.cl(cCharAt)) {
                        sb.append(' ');
                    } else {
                        sb.append(' ');
                    }
                }
                java.lang.String string2 = aoov.x(sb.toString()).toString();
                return ajsz.bT(ajsz.aY(string2), aoov.S(string2, new java.lang.String[]{" "}, 0));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.ijw
    public final java.lang.Object d(ifv ifvVar, ifz ifzVar, defpackage.igr igrVar, java.lang.String str, defpackage.igg iggVar, aoln aolnVar) {
        defpackage.imv imvVar;
        java.io.Closeable closeableW;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        if (aolnVar instanceof defpackage.imv) {
            imvVar = (defpackage.imv) aolnVar;
            int i = imvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imvVar.c = i - Integer.MIN_VALUE;
            } else {
                imvVar = new defpackage.imv(this, aolnVar);
            }
        } else {
            imvVar = new defpackage.imv(this, aolnVar);
        }
        defpackage.imv imvVar2 = imvVar;
        java.lang.Object objA = imvVar2.a;
        defpackage.igv igvVar = aolu.a;
        int i2 = imvVar2.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.mfz mfzVar = this.l;
            gus.aw("Start");
            mfzVar.c();
            closeableW = ahvr.W(126, "AudioPrismSodaModelRunner_start");
            try {
                if (igrVar.b != 4) {
                    throw new java.lang.IllegalArgumentException("provided model config is not a SODA config");
                }
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("No locale provided");
                }
                a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "start$<anonymous>", 117, "AudioPrismSodaModelRunner.kt").y("i18n locale:%s", str);
                imvVar2.d = closeableW;
                imvVar2.c = 1;
                objA = ahvr.ag(this.j, this.o, new defpackage.imx(this, str, igrVar, ifzVar, ifvVar, iggVar, (aoln) null, 0)).a(imvVar2);
                if (objA != igvVar) {
                    igvVar = (defpackage.igv) objA;
                    ajsz.ak(closeableW, (java.lang.Throwable) null);
                    defpackage.mfz mfzVar2 = this.l;
                    gus.aw("Start");
                    mfzVar2.c();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable = closeableW;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = imvVar2.d;
            try {
                aooc.af(objA);
                closeableW = closeable;
                igvVar = (defpackage.igv) objA;
                ajsz.ak(closeableW, (java.lang.Throwable) null);
                defpackage.mfz mfzVar3 = this.l;
                gus.aw("Start");
                mfzVar3.c();
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    ajsz.ak(closeable, th);
                    throw th4;
                }
            }
        }
        return igvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ijw
    public final java.lang.Object e(ifv ifvVar, aoln aolnVar) {
        defpackage.imz imzVar;
        if (aolnVar instanceof defpackage.imz) {
            imzVar = (defpackage.imz) aolnVar;
            int i = imzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imzVar.c = i - Integer.MIN_VALUE;
            } else {
                imzVar = new defpackage.imz(this, aolnVar);
            }
        } else {
            imzVar = new defpackage.imz(this, aolnVar);
        }
        java.lang.Object obj = imzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.mfz mfzVar = this.l;
            gus.aw("Stop");
            mfzVar.c();
            aosy aosyVarAg = ahvr.ag(this.j, this.o, new defpackage.ina(this, ifvVar, null));
            imzVar.c = 1;
            if (aosyVarAg.a(imzVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        defpackage.mfz mfzVar2 = this.l;
        gus.aw("Stop");
        mfzVar2.c();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.ims imsVar;
        if (aolnVar instanceof defpackage.ims) {
            imsVar = (defpackage.ims) aolnVar;
            int i = imsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imsVar.c = i - Integer.MIN_VALUE;
            } else {
                imsVar = new defpackage.ims(this, aolnVar);
            }
        } else {
            imsVar = new defpackage.ims(this, aolnVar);
        }
        java.lang.Object objG = imsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imsVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            return aooh.q((j$.util.Optional) objG);
        }
        aooc.af(objG);
        imsVar.c = 1;
        objG = g(imsVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarY = ((defpackage.imq) objG).Y();
        imsVar.c = 2;
        objG = aosv.D(ajcqVarY, imsVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.imt imtVar;
        if (aolnVar instanceof defpackage.imt) {
            imtVar = (defpackage.imt) aolnVar;
            int i = imtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imtVar.c = i - Integer.MIN_VALUE;
            } else {
                imtVar = new defpackage.imt(this, aolnVar);
            }
        } else {
            imtVar = new defpackage.imt(this, aolnVar);
        }
        java.lang.Object objD = imtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imtVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.p.X();
            imtVar.c = 1;
            objD = aosv.D(ajcqVarX, imtVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.imq.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.imu imuVar;
        if (aolnVar instanceof defpackage.imu) {
            imuVar = (defpackage.imu) aolnVar;
            int i = imuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imuVar.c = i - Integer.MIN_VALUE;
            } else {
                imuVar = new defpackage.imu(this, aolnVar);
            }
        } else {
            imuVar = new defpackage.imu(this, aolnVar);
        }
        java.lang.Object objG = imuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imuVar.c;
        if (i2 == 0) {
            aooc.af(objG);
            imuVar.c = 1;
            objG = g(imuVar);
            if (objG != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objG);
            return objG;
        }
        aooc.af(objG);
        ajcq ajcqVarAY = ((defpackage.imq) objG).aY();
        imuVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAY, imuVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(ifv ifvVar, defpackage.igd igdVar, defpackage.imb imbVar, twd twdVar, defpackage.igw igwVar, aoln aolnVar) {
        defpackage.imw imwVar;
        defpackage.hgw hgwVarL;
        twi twiVar;
        defpackage.ima imaVar;
        defpackage.igw igwVar2;
        if (aolnVar instanceof defpackage.imw) {
            imwVar = (defpackage.imw) aolnVar;
            int i = imwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                imwVar.d = i - Integer.MIN_VALUE;
            } else {
                imwVar = new defpackage.imw(this, aolnVar);
            }
        } else {
            imwVar = new defpackage.imw(this, aolnVar);
        }
        java.lang.Object objB = imwVar.b;
        aolu aoluVar = aolu.a;
        int i2 = imwVar.d;
        if (i2 == 0) {
            aooc.af(objB);
            defpackage.ilq ilqVarA = this.b.a(igdVar, ajsz.aQ(this.h, ajsz.aM(new aoiu(ifvVar, imbVar))));
            java.util.Map map = this.g;
            if (map.get(igdVar) != null) {
                twi twiVar2 = (twi) map.get(igdVar);
                if (twiVar2 == null) {
                    throw new java.lang.IllegalStateException("It's unexpected that SodaTranscriptionController is null here.");
                }
                imwVar.a = igwVar;
                imwVar.d = 1;
                if (twiVar2.e(ilqVarA, imwVar) == aoluVar) {
                    return aoluVar;
                }
                hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL.v(true);
                if (igwVar != null) {
                    hgwVarL.u(igwVar);
                }
                return hgwVarL.t();
            }
            txc txcVar = this.n;
            imwVar.a = igdVar;
            imwVar.e = igwVar;
            imwVar.d = 2;
            objB = txcVar.b(twdVar, ilqVarA, true, imwVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            twiVar = (twi) objB;
            if (twiVar == null) {
                return l(5, igwVar);
            }
            this.g.put(igdVar, twiVar);
            imaVar = this.e;
            imwVar.a = igwVar;
            imwVar.e = null;
            imwVar.d = 3;
            if (imaVar.h(imwVar) != aoluVar) {
                return aoluVar;
            }
            igwVar2 = igwVar;
        } else {
            if (i2 == 1) {
                igwVar = (defpackage.igw) imwVar.a;
                aooc.af(objB);
                hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL.v(true);
                if (igwVar != null) {
                    hgwVarL.u(igwVar);
                }
                return hgwVarL.t();
            }
            if (i2 == 2) {
                igwVar = imwVar.e;
                igdVar = (defpackage.igd) imwVar.a;
                aooc.af(objB);
                twiVar = (twi) objB;
                if (twiVar == null) {
                    return l(5, igwVar);
                }
                this.g.put(igdVar, twiVar);
                imaVar = this.e;
                imwVar.a = igwVar;
                imwVar.e = null;
                imwVar.d = 3;
                if (imaVar.h(imwVar) != aoluVar) {
                    return aoluVar;
                }
                igwVar2 = igwVar;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                igwVar2 = (defpackage.igw) imwVar.a;
                aooc.af(objB);
            }
        }
        defpackage.hgw hgwVarL2 = defpackage.hht.l(defpackage.igv.a.m());
        hgwVarL2.v(true);
        if (igwVar2 != null) {
            hgwVarL2.u(igwVar2);
        }
        return hgwVarL2.t();
    }

    public final java.lang.Object j(ifv ifvVar, ifz ifzVar, twd twdVar, defpackage.igw igwVar, aoln aolnVar) {
        return aoov.aj(this.k, new defpackage.imy(this, ifvVar, ifzVar, twdVar, igwVar, null), aolnVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8, types: [twi] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object k(ifv ifvVar, defpackage.imb imbVar, defpackage.igd igdVar, aoln aolnVar) throws aois {
        defpackage.inb inbVar;
        java.util.Map mapAQ;
        twi twiVar;
        ?? r12;
        ?? r11;
        defpackage.igd igdVar2;
        java.util.Set setCW;
        defpackage.ima imaVar;
        if (aolnVar instanceof defpackage.inb) {
            inbVar = (defpackage.inb) aolnVar;
            int i = inbVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                inbVar.e = i - Integer.MIN_VALUE;
            } else {
                inbVar = new defpackage.inb(this, aolnVar);
            }
        } else {
            inbVar = new defpackage.inb(this, aolnVar);
        }
        java.lang.Object obj = inbVar.c;
        aolu aoluVar = aolu.a;
        int i2 = inbVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = inbVar.b;
                java.lang.Object obj3 = inbVar.a;
                igdVar = inbVar.f;
                aooc.af(obj);
                r11 = obj2;
                r12 = obj3;
            } else if (i2 == 2) {
                igdVar2 = inbVar.f;
                aooc.af(obj);
                this.g.remove(igdVar2);
                if (this.g.isEmpty()) {
                    imaVar = this.e;
                    inbVar.f = null;
                    inbVar.a = null;
                    inbVar.b = null;
                    inbVar.e = 3;
                    if (imaVar.i(inbVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        java.util.Map map = this.h;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != ifvVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        mapAQ = ajsz.aQ(linkedHashMap, ajsz.aM(new aoiu(ifvVar, imbVar)));
        twiVar = (twi) this.g.get(igdVar);
        if (twiVar == null) {
            a.d().m(aioa.b).l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "stopForAudioSource", 203, "AudioPrismSodaModelRunner.kt").v("It's unexpected that SodaTranscriptionController is null here.");
            return aojh.a;
        }
        defpackage.ilq ilqVarA = this.b.a(igdVar, mapAQ);
        inbVar.f = igdVar;
        inbVar.a = mapAQ;
        inbVar.b = twiVar;
        inbVar.e = 1;
        if (twiVar.e(ilqVarA, inbVar) == aoluVar) {
            r11 = twiVar;
            r12 = mapAQ;
            return aoluVar;
        }
        r11 = twiVar;
        r12 = mapAQ;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : r12.entrySet()) {
            aooh.f(igdVar, "<this>");
            int iOrdinal = igdVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    setCW = ajsz.cW(new ifx[]{ifx.b, ifx.c});
                } else if (iOrdinal == 2) {
                    setCW = ajsz.aF(ifx.c);
                } else if (iOrdinal != 3) {
                    throw new aois();
                }
                ify ifyVar = ((defpackage.imb) entry2.getValue()).a.c;
                if (ifyVar == null) {
                    ifyVar = ify.a;
                }
                ifx ifxVarB = ifx.b(ifyVar.b);
                if (ifxVarB == null) {
                    ifxVarB = ifx.d;
                }
                if (setCW.contains(ifxVarB)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            throw new java.lang.IllegalArgumentException("invalid audio source");
        }
        if (!linkedHashMap2.isEmpty()) {
            java.util.Iterator it = linkedHashMap2.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(((defpackage.imb) ((java.util.Map.Entry) it.next()).getValue()).b instanceof defpackage.inf)) {
                    }
                }
                if (this.g.isEmpty()) {
                    imaVar = this.e;
                    inbVar.f = null;
                    inbVar.a = null;
                    inbVar.b = null;
                    inbVar.e = 3;
                    if (imaVar.i(inbVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
        }
        inbVar.f = igdVar;
        inbVar.a = null;
        inbVar.b = null;
        inbVar.e = 2;
        if (r11.d(inbVar) == aoluVar) {
            return aoluVar;
        }
        igdVar2 = igdVar;
        this.g.remove(igdVar2);
        if (this.g.isEmpty()) {
            imaVar = this.e;
            inbVar.f = null;
            inbVar.a = null;
            inbVar.b = null;
            inbVar.e = 3;
            if (imaVar.i(inbVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
