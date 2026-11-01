package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahce {
    public final int a;
    public final defpackage.ajct b;
    public final java.util.Set c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aewq f;
    public final java.lang.String g;
    public final defpackage.aonn h;
    public final defpackage.aoin i;
    public final java.util.concurrent.Executor j;
    public final defpackage.ahzi k;
    public final defpackage.aoin l;
    public final defpackage.ajas m;
    public final defpackage.aomy n;
    public final boolean o;
    public final defpackage.agtc p;
    public final java.lang.String q;
    public final defpackage.aoir r;
    public final defpackage.afhf s;
    public final defpackage.ajxm t;
    public final defpackage.adnp u;
    public final defpackage.zzx v;
    public final defpackage.zzx w;
    private final defpackage.aoir x;

    public ahce(int i, j$.util.Optional optional, defpackage.ajct ajctVar, defpackage.aazc aazcVar, java.util.Set set, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aewq aewqVar, defpackage.zzx zzxVar2, defpackage.ajxm ajxmVar, java.lang.String str, defpackage.adnp adnpVar, defpackage.aonn aonnVar, defpackage.aoin aoinVar3, java.util.concurrent.Executor executor, defpackage.ahzi ahziVar, defpackage.afhf afhfVar, defpackage.aoin aoinVar4, defpackage.ajas ajasVar, defpackage.aomy aomyVar) {
        if (optional == null) {
            defpackage.aooh.i("shouldThrowOnDirectBoot");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (set == null) {
            defpackage.aooh.i("disableCommitOnBroadcastPackages");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("synchronousFileStorage");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("applicationInfoProvider");
        }
        if (aewqVar == null) {
            defpackage.aooh.i("phenotypeContext");
        }
        if (zzxVar2 == null) {
            defpackage.aooh.i("observedPackages");
        }
        if (ajxmVar == null) {
            defpackage.aooh.i("packageChangedListener");
        }
        if (str == null) {
            defpackage.aooh.i("subpackaged");
        }
        if (executor == null) {
            defpackage.aooh.i("snapshotExecutor");
        }
        if (ahziVar == null) {
            defpackage.aooh.i("fallbackExperimentCache");
        }
        this.a = i;
        this.b = ajctVar;
        this.c = set;
        this.w = zzxVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = aewqVar;
        this.v = zzxVar2;
        this.t = ajxmVar;
        this.g = str;
        this.u = adnpVar;
        this.h = aonnVar;
        this.i = aoinVar3;
        this.j = executor;
        this.k = ahziVar;
        this.s = afhfVar;
        this.l = aoinVar4;
        this.m = ajasVar;
        this.n = aomyVar;
        this.o = ((java.lang.Boolean) defpackage.aooh.p(optional, java.lang.Boolean.TRUE)).booleanValue();
        this.p = new defpackage.agtc(new defpackage.ajas() { // from class: ahcb
            /* JADX WARN: Code duplicated, block: B:27:0x0148  */
            /* JADX WARN: Type inference failed for: r2v8, types: [ajct, java.lang.Object] */
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                defpackage.ahcc ahccVarF;
                java.util.Map mapG;
                java.util.Set setCf;
                java.util.Set setKeySet;
                defpackage.ahns.t(false);
                defpackage.ahce ahceVar = this.a;
                try {
                    ahceVar.f.f.f();
                    int iA = ahceVar.a().a(defpackage.ajsw.TIKTOK, ahceVar.q);
                    if (iA != 0) {
                        ahccVarF = new defpackage.ahcc(null, iA);
                    } else {
                        java.lang.String strM = ahceVar.a().c;
                        if (strM.length() != 0) {
                            java.lang.String str2 = strM + java.io.File.separator + ahceVar.a().b;
                            try {
                                defpackage.aogc aogcVar = new defpackage.aogc(ahceVar.a().a, ahceVar.g, (java.lang.String) ahceVar.n.a());
                                try {
                                    java.lang.Object objM = ((defpackage.aogc) ahceVar.d.a()).M(new android.net.Uri.Builder().scheme("file").appendEncodedPath(java.io.File.separator + str2 + java.io.File.separator + aogcVar.U()).build(), new defpackage.aexs());
                                    defpackage.aooh.e(objM, "open(...)");
                                    defpackage.aext aextVar = (defpackage.aext) objM;
                                    defpackage.akzx akzxVarM = defpackage.aexf.a.m();
                                    java.lang.String strF = aextVar.f();
                                    akzxVarM.u();
                                    defpackage.aexf aexfVar = (defpackage.aexf) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(strF);
                                    aexfVar.b |= 1;
                                    aexfVar.c = strF;
                                    defpackage.akzx akzxVarM2 = defpackage.aexe.a.m();
                                    akzxVarM2.u();
                                    defpackage.aexe aexeVar = (defpackage.aexe) akzxVarM2.b;
                                    aexeVar.c = defpackage.a.R(5);
                                    aexeVar.b |= 1;
                                    akzxVarM.u();
                                    defpackage.aexf aexfVar2 = (defpackage.aexf) akzxVarM.b;
                                    defpackage.aexe aexeVar2 = (defpackage.aexe) akzxVarM2.r();
                                    j$.util.Objects.requireNonNull(aexeVar2);
                                    aexfVar2.d = aexeVar2;
                                    aexfVar2.b |= 2;
                                    ahceVar.g(akzxVarM);
                                    defpackage.aonn aonnVar2 = ahceVar.h;
                                    defpackage.aiho aihoVar = aextVar.b().b;
                                    defpackage.aooh.e(aihoVar, "getValues(...)");
                                    mapG = aextVar.g();
                                    if (mapG != null || (setKeySet = mapG.keySet()) == null) {
                                        setCf = null;
                                    } else {
                                        setCf = defpackage.ajsz.cf(setKeySet);
                                    }
                                    defpackage.aigf aigfVarB = ahceVar.b(aihoVar, setCf);
                                    java.lang.String strE = aextVar.e();
                                    defpackage.aooh.e(strE, "getServerToken(...)");
                                    defpackage.akzc akzcVarD = aextVar.d();
                                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                                    defpackage.alad aladVarR = akzxVarM.r();
                                    defpackage.aooh.e(aladVarR, "build(...)");
                                    ahccVarF = new defpackage.ahcc((defpackage.ahda) aonnVar2.a(aigfVarB, new defpackage.ahcd(strE, akzcVarD, epochMilli, (defpackage.aexf) aladVarR)), 0);
                                } catch (defpackage.alaz e) {
                                    android.util.Log.e("MendelPackageState", "Failed to parse snapshot from shared storage for ".concat(java.lang.String.valueOf(ahceVar.g)), e);
                                    ahccVarF = ahceVar.f(9);
                                } catch (java.io.FileNotFoundException unused) {
                                    android.util.Log.w("MendelPackageState", "Shared storage file not found for ".concat(java.lang.String.valueOf(ahceVar.g)));
                                    ahccVarF = new defpackage.ahcc(null, 8);
                                }
                            } catch (defpackage.absc e2) {
                                android.util.Log.e("MendelPackageState", "Failed to obtain account name for " + ahceVar.g + ". Falling back on default values.", e2);
                                ahccVarF = ahceVar.f(12);
                            }
                        } else {
                            android.content.pm.ApplicationInfo applicationInfo = (android.content.pm.ApplicationInfo) ahceVar.e.a();
                            if (applicationInfo == null) {
                                ahccVarF = ahceVar.f(7);
                            } else {
                                if (ahceVar.w.t(ahceVar.g)) {
                                    strM = aa$.ExternalSyntheticApiModelOutline1.m(applicationInfo);
                                    if (strM == null) {
                                        defpackage.aooh.g();
                                    }
                                } else {
                                    strM = applicationInfo.dataDir;
                                    if (strM == null) {
                                        defpackage.aooh.g();
                                    }
                                }
                                java.lang.String str3 = strM + java.io.File.separator + ahceVar.a().b;
                                defpackage.aogc aogcVar2 = new defpackage.aogc(ahceVar.a().a, ahceVar.g, (java.lang.String) ahceVar.n.a());
                                java.lang.Object objM2 = ((defpackage.aogc) ahceVar.d.a()).M(new android.net.Uri.Builder().scheme("file").appendEncodedPath(java.io.File.separator + str3 + java.io.File.separator + aogcVar2.U()).build(), new defpackage.aexs());
                                defpackage.aooh.e(objM2, "open(...)");
                                defpackage.aext aextVar2 = (defpackage.aext) objM2;
                                defpackage.akzx akzxVarM3 = defpackage.aexf.a.m();
                                java.lang.String strF2 = aextVar2.f();
                                akzxVarM3.u();
                                defpackage.aexf aexfVar3 = (defpackage.aexf) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(strF2);
                                aexfVar3.b |= 1;
                                aexfVar3.c = strF2;
                                defpackage.akzx akzxVarM4 = defpackage.aexe.a.m();
                                akzxVarM4.u();
                                defpackage.aexe aexeVar3 = (defpackage.aexe) akzxVarM4.b;
                                aexeVar3.c = defpackage.a.R(5);
                                aexeVar3.b |= 1;
                                akzxVarM3.u();
                                defpackage.aexf aexfVar4 = (defpackage.aexf) akzxVarM3.b;
                                defpackage.aexe aexeVar4 = (defpackage.aexe) akzxVarM4.r();
                                j$.util.Objects.requireNonNull(aexeVar4);
                                aexfVar4.d = aexeVar4;
                                aexfVar4.b |= 2;
                                ahceVar.g(akzxVarM3);
                                defpackage.aonn aonnVar3 = ahceVar.h;
                                defpackage.aiho aihoVar2 = aextVar2.b().b;
                                defpackage.aooh.e(aihoVar2, "getValues(...)");
                                mapG = aextVar2.g();
                                if (mapG != null) {
                                    setCf = null;
                                } else {
                                    setCf = null;
                                }
                                defpackage.aigf aigfVarB2 = ahceVar.b(aihoVar2, setCf);
                                java.lang.String strE2 = aextVar2.e();
                                defpackage.aooh.e(strE2, "getServerToken(...)");
                                defpackage.akzc akzcVarD2 = aextVar2.d();
                                long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                                defpackage.alad aladVarR2 = akzxVarM3.r();
                                defpackage.aooh.e(aladVarR2, "build(...)");
                                ahccVarF = new defpackage.ahcc((defpackage.ahda) aonnVar3.a(aigfVarB2, new defpackage.ahcd(strE2, akzcVarD2, epochMilli2, (defpackage.aexf) aladVarR2)), 0);
                            }
                        }
                    }
                } catch (java.lang.Exception e3) {
                    android.util.Log.e("MendelPackageState", "Failed to read shared file for ".concat(java.lang.String.valueOf(ahceVar.g)), e3);
                    ahccVarF = ahceVar.f(10);
                }
                java.lang.Object obj = ahccVarF.b;
                if (obj != null) {
                    defpackage.ajxm ajxmVar2 = ahceVar.t;
                    ajxmVar2.d.execute(defpackage.ahqx.h(new defpackage.ahjn(ajxmVar2, 1)));
                    return new defpackage.ajcm(obj);
                }
                int i2 = ahccVarF.a;
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ahceVar.s.c());
                agpe agpeVar = new agpe(new sba(ahceVar, 20, (char[]) null, (byte[]) null), 5);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                defpackage.ahrv ahrvVarI = ahrvVarG.i(agpeVar, ajbmVar);
                defpackage.anpu anpuVar = new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ahrvVarI}));
                upy upyVar = new upy(ahrvVarI, ahceVar, i2, 3);
                long j = defpackage.ahqx.a;
                return anpuVar.b(new defpackage.ajav(defpackage.ahns.c(false), upyVar, 1), ajbmVar);
            }
        }, new defpackage.aajr(adnpVar, 6));
        java.lang.String strC = defpackage.aewo.c(str);
        defpackage.aooh.e(strC, "getStaticConfigPackage(...)");
        this.q = strC;
        this.r = new defpackage.aoiy(new defpackage.acik(this, 7));
        this.x = new defpackage.aoiy(new defpackage.acik(this, 8));
        new defpackage.aoiy(new defpackage.abnb(16));
    }

    public final defpackage.aezn a() {
        java.lang.Object objA = this.x.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return (defpackage.aezn) objA;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0077 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x010a  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0113  */
    public final defpackage.aigf b(defpackage.aiho aihoVar, java.util.Set set) {
        int i;
        java.lang.String strBw;
        boolean zContains;
        int i2;
        defpackage.ahbb ahbbVarAQ;
        defpackage.albh albhVar;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object objA = this.i.a();
        defpackage.aooh.e(objA, "get(...)");
        defpackage.ahbc ahbcVar = (defpackage.ahbc) objA;
        defpackage.ailj it = aihoVar.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.aooh.e(next, "next(...)");
            defpackage.aexq aexqVar = (defpackage.aexq) next;
            java.lang.String strC = aexqVar.c();
            defpackage.ahbb ahbbVarA = ahbcVar.a(strC);
            if (ahbbVarA != null) {
                int i3 = ahbbVarA.g;
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 == 1) {
                        int i5 = aexqVar.c;
                        if (i5 == 1 || i5 == 0) {
                            if (set != null) {
                                zContains = set.contains(strC);
                            } else {
                                zContains = false;
                            }
                            if (ahbbVarA.f) {
                            }
                            i2 = aexqVar.c;
                            if (i2 != 0) {
                                ahbbVarAQ = defpackage.ahbb.b;
                            } else if (i2 != 1) {
                                ahbbVarAQ = defpackage.ahbb.a;
                            } else if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                        }
                                        albhVar = ahbbVarA.e;
                                        if (albhVar == null) {
                                            ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                        } else {
                                            ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                        }
                                    } else {
                                        if (i2 == 4) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        java.lang.Object obj = aexqVar.e;
                                        obj.getClass();
                                        ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj);
                                    }
                                } else {
                                    if (i2 == 3) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                                }
                            } else {
                                if (i2 == 2) {
                                    throw new java.lang.IllegalStateException();
                                }
                                ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                            }
                            linkedHashMap.put(strC, ahbbVarAQ);
                        } else {
                            i = aexqVar.c;
                            if (i != 0) {
                                strBw = "WIRE_TYPE_FALSE";
                            } else if (i != 1) {
                                strBw = "WIRE_TYPE_TRUE";
                            } else if (i != 2) {
                                strBw = "WIRE_TYPE_VARINT";
                            } else if (i != 3) {
                                strBw = "WIRE_TYPE_DOUBLE";
                            } else if (i != 4) {
                                strBw = "WIRE_TYPE_STRING";
                            } else if (i != 5) {
                                strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                            } else {
                                strBw = "WIRE_TYPE_BYTES";
                            }
                            android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                        }
                    } else if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (aexqVar.c == 5) {
                                    if (set != null) {
                                        zContains = set.contains(strC);
                                    } else {
                                        zContains = false;
                                    }
                                    if (ahbbVarA.f || zContains) {
                                        i2 = aexqVar.c;
                                        if (i2 != 0) {
                                            ahbbVarAQ = defpackage.ahbb.b;
                                        } else if (i2 != 1) {
                                            ahbbVarAQ = defpackage.ahbb.a;
                                        } else if (i2 != 2) {
                                            if (i2 != 3) {
                                                if (i2 != 4) {
                                                    if (i2 == 5) {
                                                        throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                                    }
                                                    albhVar = ahbbVarA.e;
                                                    if (albhVar == null) {
                                                        ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                                    } else {
                                                        ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                                    }
                                                } else {
                                                    if (i2 == 4) {
                                                        throw new java.lang.IllegalStateException();
                                                    }
                                                    java.lang.Object obj2 = aexqVar.e;
                                                    obj2.getClass();
                                                    ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj2);
                                                }
                                            } else {
                                                if (i2 == 3) {
                                                    throw new java.lang.IllegalStateException();
                                                }
                                                ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                                            }
                                        } else {
                                            if (i2 == 2) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                                        }
                                        linkedHashMap.put(strC, ahbbVarAQ);
                                    }
                                } else {
                                    i = aexqVar.c;
                                    if (i != 0) {
                                        strBw = "WIRE_TYPE_FALSE";
                                    } else if (i != 1) {
                                        strBw = "WIRE_TYPE_TRUE";
                                    } else if (i != 2) {
                                        strBw = "WIRE_TYPE_VARINT";
                                    } else if (i != 3) {
                                        strBw = "WIRE_TYPE_DOUBLE";
                                    } else if (i != 4) {
                                        strBw = "WIRE_TYPE_STRING";
                                    } else if (i != 5) {
                                        strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                                    } else {
                                        strBw = "WIRE_TYPE_BYTES";
                                    }
                                    android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                                }
                            } else if (aexqVar.c == 5) {
                                if (set != null) {
                                    zContains = set.contains(strC);
                                } else {
                                    zContains = false;
                                }
                                if (ahbbVarA.f) {
                                }
                                i2 = aexqVar.c;
                                if (i2 != 0) {
                                    ahbbVarAQ = defpackage.ahbb.b;
                                } else if (i2 != 1) {
                                    ahbbVarAQ = defpackage.ahbb.a;
                                } else if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                            }
                                            albhVar = ahbbVarA.e;
                                            if (albhVar == null) {
                                                ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                            } else {
                                                ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                            }
                                        } else {
                                            if (i2 == 4) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            java.lang.Object obj3 = aexqVar.e;
                                            obj3.getClass();
                                            ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj3);
                                        }
                                    } else {
                                        if (i2 == 3) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                                    }
                                } else {
                                    if (i2 == 2) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                                }
                                linkedHashMap.put(strC, ahbbVarAQ);
                            } else {
                                i = aexqVar.c;
                                if (i != 0) {
                                    strBw = "WIRE_TYPE_FALSE";
                                } else if (i != 1) {
                                    strBw = "WIRE_TYPE_TRUE";
                                } else if (i != 2) {
                                    strBw = "WIRE_TYPE_VARINT";
                                } else if (i != 3) {
                                    strBw = "WIRE_TYPE_DOUBLE";
                                } else if (i != 4) {
                                    strBw = "WIRE_TYPE_STRING";
                                } else if (i != 5) {
                                    strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                                } else {
                                    strBw = "WIRE_TYPE_BYTES";
                                }
                                android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                            }
                        } else if (aexqVar.c == 4) {
                            if (set != null) {
                                zContains = set.contains(strC);
                            } else {
                                zContains = false;
                            }
                            if (ahbbVarA.f) {
                            }
                            i2 = aexqVar.c;
                            if (i2 != 0) {
                                ahbbVarAQ = defpackage.ahbb.b;
                            } else if (i2 != 1) {
                                ahbbVarAQ = defpackage.ahbb.a;
                            } else if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                        }
                                        albhVar = ahbbVarA.e;
                                        if (albhVar == null) {
                                            ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                        } else {
                                            ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                        }
                                    } else {
                                        if (i2 == 4) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        java.lang.Object obj4 = aexqVar.e;
                                        obj4.getClass();
                                        ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj4);
                                    }
                                } else {
                                    if (i2 == 3) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                                }
                            } else {
                                if (i2 == 2) {
                                    throw new java.lang.IllegalStateException();
                                }
                                ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                            }
                            linkedHashMap.put(strC, ahbbVarAQ);
                        } else {
                            i = aexqVar.c;
                            if (i != 0) {
                                strBw = "WIRE_TYPE_FALSE";
                            } else if (i != 1) {
                                strBw = "WIRE_TYPE_TRUE";
                            } else if (i != 2) {
                                strBw = "WIRE_TYPE_VARINT";
                            } else if (i != 3) {
                                strBw = "WIRE_TYPE_DOUBLE";
                            } else if (i != 4) {
                                strBw = "WIRE_TYPE_STRING";
                            } else if (i != 5) {
                                strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                            } else {
                                strBw = "WIRE_TYPE_BYTES";
                            }
                            android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                        }
                    } else if (aexqVar.c == 3) {
                        if (set != null) {
                            zContains = set.contains(strC);
                        } else {
                            zContains = false;
                        }
                        if (ahbbVarA.f) {
                        }
                        i2 = aexqVar.c;
                        if (i2 != 0) {
                            ahbbVarAQ = defpackage.ahbb.b;
                        } else if (i2 != 1) {
                            ahbbVarAQ = defpackage.ahbb.a;
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                    }
                                    albhVar = ahbbVarA.e;
                                    if (albhVar == null) {
                                        ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                    } else {
                                        ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                    }
                                } else {
                                    if (i2 == 4) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    java.lang.Object obj5 = aexqVar.e;
                                    obj5.getClass();
                                    ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj5);
                                }
                            } else {
                                if (i2 == 3) {
                                    throw new java.lang.IllegalStateException();
                                }
                                ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                            }
                        } else {
                            if (i2 == 2) {
                                throw new java.lang.IllegalStateException();
                            }
                            ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                        }
                        linkedHashMap.put(strC, ahbbVarAQ);
                    } else {
                        i = aexqVar.c;
                        if (i != 0) {
                            strBw = "WIRE_TYPE_FALSE";
                        } else if (i != 1) {
                            strBw = "WIRE_TYPE_TRUE";
                        } else if (i != 2) {
                            strBw = "WIRE_TYPE_VARINT";
                        } else if (i != 3) {
                            strBw = "WIRE_TYPE_DOUBLE";
                        } else if (i != 4) {
                            strBw = "WIRE_TYPE_STRING";
                        } else if (i != 5) {
                            strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                        } else {
                            strBw = "WIRE_TYPE_BYTES";
                        }
                        android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                    }
                } else if (aexqVar.c == 2) {
                    if (set != null) {
                        zContains = set.contains(strC);
                    } else {
                        zContains = false;
                    }
                    if (ahbbVarA.f) {
                    }
                    i2 = aexqVar.c;
                    if (i2 != 0) {
                        ahbbVarAQ = defpackage.ahbb.b;
                    } else if (i2 != 1) {
                        ahbbVarAQ = defpackage.ahbb.a;
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    throw new java.lang.IllegalStateException(defpackage.a.bj(i2, "Invalid type "));
                                }
                                albhVar = ahbbVarA.e;
                                if (albhVar == null) {
                                    ahbbVarAQ = new defpackage.ahbb(new ahca(aexqVar, 0), 5, null, false);
                                } else {
                                    ahbbVarAQ = defpackage.agab.aR(new defpackage.bev(ahbbVarA, aexqVar, 16), albhVar);
                                }
                            } else {
                                if (i2 == 4) {
                                    throw new java.lang.IllegalStateException();
                                }
                                java.lang.Object obj6 = aexqVar.e;
                                obj6.getClass();
                                ahbbVarAQ = defpackage.agab.aS((java.lang.String) obj6);
                            }
                        } else {
                            if (i2 == 3) {
                                throw new java.lang.IllegalStateException();
                            }
                            ahbbVarAQ = defpackage.agab.aP(java.lang.Double.longBitsToDouble(aexqVar.d));
                        }
                    } else {
                        if (i2 == 2) {
                            throw new java.lang.IllegalStateException();
                        }
                        ahbbVarAQ = defpackage.agab.aQ(aexqVar.d);
                    }
                    linkedHashMap.put(strC, ahbbVarAQ);
                } else {
                    i = aexqVar.c;
                    if (i != 0) {
                        strBw = "WIRE_TYPE_FALSE";
                    } else if (i != 1) {
                        strBw = "WIRE_TYPE_TRUE";
                    } else if (i != 2) {
                        strBw = "WIRE_TYPE_VARINT";
                    } else if (i != 3) {
                        strBw = "WIRE_TYPE_DOUBLE";
                    } else if (i != 4) {
                        strBw = "WIRE_TYPE_STRING";
                    } else if (i != 5) {
                        strBw = defpackage.a.bw((byte) 41, i, "UNKNOWN(");
                    } else {
                        strBw = "WIRE_TYPE_BYTES";
                    }
                    android.util.Log.w("MendelPackageState", "Type mismatch for flag " + strC + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i3)) + ", got " + strBw + ". Falling back to default.");
                }
            }
        }
        defpackage.ailj it2 = ahbcVar.b().iterator();
        defpackage.aooh.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            java.lang.Object next2 = it2.next();
            defpackage.aooh.e(next2, "next(...)");
            java.lang.String str = (java.lang.String) next2;
            if (!linkedHashMap.containsKey(str)) {
                defpackage.ahbb ahbbVarA2 = ahbcVar.a(str);
                if (ahbbVarA2 == null) {
                    defpackage.aooh.g();
                }
                linkedHashMap.put(str, ahbbVarA2);
            }
        }
        defpackage.aigf aigfVarI = defpackage.aigf.i(linkedHashMap);
        defpackage.aooh.e(aigfVarI, "copyOf(...)");
        return aigfVarI;
    }

    public final defpackage.aigf c(defpackage.ahax ahaxVar) {
        defpackage.ahbb ahbbVarAQ;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object objA = this.i.a();
        defpackage.aooh.e(objA, "get(...)");
        defpackage.ahbc ahbcVar = (defpackage.ahbc) objA;
        for (defpackage.ahay ahayVar : ahaxVar.f) {
            defpackage.ahbb ahbbVarA = ahbcVar.a(ahayVar.e);
            if (ahbbVarA != null) {
                int i = ahayVar.c;
                int iAV = defpackage.agab.aV(i);
                int i2 = ahbbVarA.g;
                if (iAV == i2) {
                    java.lang.String str = ahayVar.e;
                    defpackage.aooh.c(ahayVar);
                    int i3 = ahayVar.c;
                    int iAV2 = defpackage.agab.aV(i3);
                    if (iAV2 == 0) {
                        throw null;
                    }
                    switch (iAV2 - 1) {
                        case 0:
                            ahbbVarAQ = defpackage.agab.aQ(i3 == 1 ? ((java.lang.Long) ahayVar.d).longValue() : 0L);
                            break;
                        case 1:
                            ahbbVarAQ = defpackage.agab.aO(i3 == 2 ? ((java.lang.Boolean) ahayVar.d).booleanValue() : false);
                            break;
                        case 2:
                            ahbbVarAQ = defpackage.agab.aP(i3 == 3 ? ((java.lang.Double) ahayVar.d).doubleValue() : 0.0d);
                            break;
                        case 3:
                            java.lang.String str2 = i3 == 4 ? (java.lang.String) ahayVar.d : "";
                            defpackage.aooh.e(str2, "getStringValue(...)");
                            ahbbVarAQ = defpackage.agab.aS(str2);
                            break;
                        case 4:
                            ahbbVarAQ = new defpackage.ahbb(new ahca(ahayVar, 2), 5, null, false);
                            break;
                        case 5:
                            defpackage.bev bevVar = new defpackage.bev(ahbbVarA, ahayVar, 15);
                            defpackage.albh albhVar = ahbbVarA.e;
                            defpackage.aooh.c(albhVar);
                            ahbbVarAQ = defpackage.agab.aR(bevVar, albhVar);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            throw new java.lang.IllegalStateException("No known flag type");
                        default:
                            throw new defpackage.aois();
                    }
                    linkedHashMap.put(str, ahbbVarAQ);
                } else {
                    android.util.Log.w("MendelPackageState", "Type mismatch for flag " + ahayVar.e + ". Expected " + ((java.lang.Object) defpackage.agab.aU(i2)) + ", got " + ((java.lang.Object) defpackage.agab.aU(defpackage.agab.aV(i))) + ". Falling back to default.");
                }
            }
        }
        defpackage.ailj it = ahbcVar.b().iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.aooh.e(next, "next(...)");
            java.lang.String str3 = (java.lang.String) next;
            if (!linkedHashMap.containsKey(str3)) {
                defpackage.ahbb ahbbVarA2 = ahbcVar.a(str3);
                defpackage.aooh.c(ahbbVarA2);
                linkedHashMap.put(str3, ahbbVarA2);
            }
        }
        return defpackage.ahvr.bw(linkedHashMap);
    }

    public final defpackage.akzc d() {
        defpackage.agtc agtcVar = this.p;
        if (!agtcVar.c()) {
            return null;
        }
        try {
            return ((defpackage.ahda) defpackage.aiql.H(agtcVar.a())).a().a;
        } catch (java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    public final defpackage.ahda e() {
        defpackage.ahda ahdaVar;
        try {
            if (this.p.c()) {
                defpackage.ajcq ajcqVarA = this.p.a();
                defpackage.ahvr.cc(ajcqVarA.isDone(), "Future was expected to be done: %s", ajcqVarA);
                ahdaVar = (defpackage.ahda) defpackage.a.h(ajcqVarA);
            } else {
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1352, "Blocking for: " + this.q, defpackage.ahot.a, true);
                try {
                    ahdaVar = (defpackage.ahda) this.u.c(new defpackage.nya(this, 19));
                    ahoqVarX.close();
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            ahoqVarX.close();
                        } catch (java.lang.Throwable th3) {
                            aoil.b(th, th3);
                        }
                        throw th2;
                    }
                }
            }
            if (ahdaVar == null) {
                defpackage.aooh.g();
            }
            return ahdaVar;
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.lang.RuntimeException(e.getCause());
        }
    }

    public final defpackage.ahcc f(int i) {
        defpackage.akzx akzxVarM = defpackage.aexf.a.m();
        defpackage.akzx akzxVarM2 = defpackage.aexe.a.m();
        akzxVarM2.u();
        defpackage.aexe aexeVar = (defpackage.aexe) akzxVarM2.b;
        aexeVar.c = defpackage.a.R(3);
        aexeVar.b |= 1;
        akzxVarM2.u();
        defpackage.aexe aexeVar2 = (defpackage.aexe) akzxVarM2.b;
        aexeVar2.d = defpackage.agab.at(i);
        aexeVar2.b |= 2;
        akzxVarM.u();
        defpackage.aexf aexfVar = (defpackage.aexf) akzxVarM.b;
        defpackage.aexe aexeVar3 = (defpackage.aexe) akzxVarM2.r();
        j$.util.Objects.requireNonNull(aexeVar3);
        aexfVar.d = aexeVar3;
        aexfVar.b |= 2;
        g(akzxVarM);
        defpackage.aiko aikoVar = defpackage.aiko.c;
        defpackage.aooh.e(aikoVar, "of(...)");
        defpackage.aigf aigfVarB = b(aikoVar, defpackage.aoke.a);
        defpackage.akzc akzcVar = defpackage.akzc.d;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return new defpackage.ahcc((defpackage.ahda) this.h.a(aigfVarB, new defpackage.ahcd("", akzcVar, epochMilli, (defpackage.aexf) aladVarR)), i);
    }

    public final void g(defpackage.akzx akzxVar) {
        if (a().d) {
            java.lang.String str = this.g;
            akzxVar.u();
            defpackage.aexf aexfVar = (defpackage.aexf) akzxVar.b;
            defpackage.aexf aexfVar2 = defpackage.aexf.a;
            j$.util.Objects.requireNonNull(str);
            aexfVar.b |= 4;
            aexfVar.e = str;
        }
    }
}
