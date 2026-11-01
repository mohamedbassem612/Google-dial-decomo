package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sql {
    public static final /* synthetic */ int e = 0;
    private static final aimz f = aimz.i("com/android/dialer/phonelookup/consolidator/PhoneLookupInfoConsolidator");
    private static final aify g = aify.v(defpackage.sqk.b, defpackage.sqk.c, defpackage.sqk.d, defpackage.sqk.e, defpackage.sqk.h, defpackage.sqk.g, defpackage.sqk.f, defpackage.sqk.i);
    public final defpackage.spn a;
    public final defpackage.sqk b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;

    static {
        aihd.v(rmt.d, rmt.f, rmt.g, rmt.h, rmt.i, rmt.j, new rmt[]{rmt.k, rmt.l, rmt.o});
    }

    public sql(defpackage.spn spnVar) {
        defpackage.sqk sqkVar;
        this.a = spnVar;
        defpackage.spe speVar = spnVar.c;
        this.c = v(speVar == null ? defpackage.spe.a : speVar);
        defpackage.spe speVar2 = spnVar.d;
        this.d = v(speVar2 == null ? defpackage.spe.a : speVar2);
        aike aikeVar = g;
        int i = aikeVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.sqk sqkVar2 = (defpackage.sqk) aikeVar.get(i2);
            switch (sqkVar2.ordinal()) {
                case 1:
                    defpackage.spe speVar3 = this.a.c;
                    if ((speVar3 == null ? defpackage.spe.a : speVar3).b.size() <= 0) {
                        continue;
                    } else {
                        defpackage.spe speVar4 = this.a.c;
                        if (!((defpackage.spd) (speVar4 == null ? defpackage.spe.a : speVar4).b.get(0)).c.isEmpty()) {
                            sqkVar = defpackage.sqk.b;
                            this.b = sqkVar;
                        }
                    }
                    break;
                case 2:
                    defpackage.spe speVar5 = this.a.d;
                    if ((speVar5 == null ? defpackage.spe.a : speVar5).b.size() <= 0) {
                        continue;
                    } else {
                        defpackage.spe speVar6 = this.a.d;
                        if (!((defpackage.spd) (speVar6 == null ? defpackage.spe.a : speVar6).b.get(0)).c.isEmpty()) {
                            sqkVar = defpackage.sqk.c;
                            this.b = sqkVar;
                        }
                    }
                    break;
                case 3:
                    if (r()) {
                        defpackage.sow sowVar = this.a.q;
                        if (!(sowVar == null ? defpackage.sow.a : sowVar).c.isEmpty()) {
                            sqkVar = defpackage.sqk.d;
                            this.b = sqkVar;
                        }
                    } else {
                        continue;
                    }
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    defpackage.spb spbVar = this.a.j;
                    if (!(spbVar == null ? defpackage.spb.a : spbVar).c.isEmpty()) {
                        sqkVar = defpackage.sqk.e;
                        this.b = sqkVar;
                    }
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    defpackage.spc spcVar = this.a.i;
                    if (!(spcVar == null ? defpackage.spc.a : spcVar).c.isEmpty()) {
                        sqkVar = defpackage.sqk.f;
                        this.b = sqkVar;
                    }
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    defpackage.zhj zhjVar = this.a.l;
                    java.lang.String str = (zhjVar == null ? defpackage.zhj.a : zhjVar).c;
                    if (str.isEmpty()) {
                        continue;
                    } else {
                        defpackage.spa spaVar = this.a.n;
                        spaVar = spaVar == null ? defpackage.spa.a : spaVar;
                        if (!(spaVar.c == 1 ? (defpackage.sox) spaVar.d : defpackage.sox.a).b.contains(str)) {
                            sqkVar = defpackage.sqk.g;
                            this.b = sqkVar;
                        }
                    }
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    defpackage.spa spaVar2 = this.a.n;
                    spaVar2 = spaVar2 == null ? defpackage.spa.a : spaVar2;
                    if ((spaVar2.c == 4 ? (defpackage.soz) spaVar2.d : defpackage.soz.a).c.isEmpty()) {
                        defpackage.spa spaVar3 = this.a.n;
                        spaVar3 = spaVar3 == null ? defpackage.spa.a : spaVar3;
                        if (!(spaVar3.c == 2 ? (defpackage.zhj) spaVar3.d : defpackage.zhj.a).c.isEmpty()) {
                            sqkVar = defpackage.sqk.h;
                        }
                    } else {
                        sqkVar = defpackage.sqk.h;
                    }
                    this.b = sqkVar;
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    defpackage.spi spiVar = this.a.o;
                    if (!(spiVar == null ? defpackage.spi.a : spiVar).b.isEmpty()) {
                        sqkVar = defpackage.sqk.i;
                        this.b = sqkVar;
                    }
                    break;
                default:
                    throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar2));
            }
        }
        sqkVar = defpackage.sqk.a;
        this.b = sqkVar;
    }

    private static j$.util.Optional v(defpackage.spe speVar) {
        return speVar.b.size() > 0 ? j$.util.Optional.of((defpackage.spd) speVar.b.get(0)) : j$.util.Optional.empty();
    }

    private static boolean w(defpackage.zai zaiVar) {
        return java.util.Locale.getDefault().equals(java.util.Locale.forLanguageTag(zaiVar.e));
    }

    public final long a() {
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 0L;
            case 1:
                return java.lang.Math.max(((defpackage.spd) this.c.orElseThrow()).g, 0L);
            case 2:
                return java.lang.Math.max(((defpackage.spd) this.d.orElseThrow()).g, 0L);
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final rmt b() {
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
                return rmt.a;
            case 1:
                return rmt.b;
            case 2:
                return rmt.c;
            case 3:
                return rmt.o;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return rmt.g;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return rmt.f;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ahvr.bY(sqkVar == defpackage.sqk.g);
                defpackage.zhj zhjVar = this.a.l;
                if (zhjVar == null) {
                    zhjVar = defpackage.zhj.a;
                }
                int iAQ = a.aQ(zhjVar.d);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i = iAQ - 1;
                if (i != 1) {
                    return i != 2 ? rmt.h : rmt.d;
                }
                return rmt.e;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return rmt.m;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return rmt.n;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final udj c() {
        if (this.b == defpackage.sqk.b) {
            return udj.b;
        }
        defpackage.spk spkVar = this.a.e;
        if (spkVar == null) {
            spkVar = defpackage.spk.a;
        }
        udj udjVarB = udj.b(spkVar.c);
        return udjVarB == null ? udj.a : udjVarB;
    }

    public final j$.util.Optional d() {
        defpackage.spn spnVar = this.a;
        int i = spnVar.b;
        if ((i & 512) == 0 && (i & 2048) == 0 && (i & 16384) == 0) {
            return j$.util.Optional.empty();
        }
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return j$.util.Optional.of(java.lang.Boolean.FALSE);
            case 3:
                return j$.util.Optional.of(java.lang.Boolean.TRUE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.zhj zhjVar = spnVar.l;
                if (zhjVar == null) {
                    zhjVar = defpackage.zhj.a;
                }
                int iAQ = a.aQ(zhjVar.d);
                return j$.util.Optional.of(java.lang.Boolean.valueOf(iAQ != 0 && iAQ == 3));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.spa spaVar = spnVar.n;
                if (spaVar == null) {
                    spaVar = defpackage.spa.a;
                }
                if (spaVar.c == 4) {
                    return j$.util.Optional.of(java.lang.Boolean.TRUE);
                }
                defpackage.spa spaVar2 = spnVar.n;
                if (spaVar2 == null) {
                    spaVar2 = defpackage.spa.a;
                }
                int iAQ2 = a.aQ((spaVar2.c == 2 ? (defpackage.zhj) spaVar2.d : defpackage.zhj.a).d);
                return j$.util.Optional.of(java.lang.Boolean.valueOf(iAQ2 != 0 && iAQ2 == 3));
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final java.lang.String e() {
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return "";
            case 1:
                return ((defpackage.spd) this.c.orElseThrow()).d;
            case 2:
                return ((defpackage.spd) this.d.orElseThrow()).d;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final java.lang.String f() {
        aimw aimwVarL = f.b().l("com/android/dialer/phonelookup/consolidator/PhoneLookupInfoConsolidator", "getGeolocation", 461, "PhoneLookupInfoConsolidator.java");
        defpackage.sqk sqkVar = this.b;
        aimwVarL.y("nameSource: %s", sqkVar);
        switch (sqkVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.spj spjVar = this.a.m;
                if (spjVar == null) {
                    spjVar = defpackage.spj.a;
                }
                return spjVar.c;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.spb spbVar = this.a.j;
                if (spbVar == null) {
                    spbVar = defpackage.spb.a;
                }
                return spbVar.d;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final java.lang.String g() {
        defpackage.zhj zhjVar;
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return "";
            case 1:
                return ((defpackage.spd) this.c.orElseThrow()).k;
            case 2:
                return ((defpackage.spd) this.d.orElseThrow()).k;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                zhjVar = this.a.l;
                if (zhjVar == null) {
                    zhjVar = defpackage.zhj.a;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.spa spaVar = this.a.n;
                if (spaVar == null) {
                    spaVar = defpackage.spa.a;
                }
                zhjVar = spaVar.c != 2 ? defpackage.zhj.a : (defpackage.zhj) spaVar.d;
                break;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        return zhjVar.f;
    }

    public final java.lang.String h() {
        defpackage.zhj zhjVar;
        aimw aimwVarL = f.b().l("com/android/dialer/phonelookup/consolidator/PhoneLookupInfoConsolidator", "getName", 229, "PhoneLookupInfoConsolidator.java");
        defpackage.sqk sqkVar = this.b;
        aimwVarL.y("nameSource: %s", sqkVar);
        switch (sqkVar.ordinal()) {
            case 0:
                return "";
            case 1:
                return ((defpackage.spd) this.c.orElseThrow()).c;
            case 2:
                return ((defpackage.spd) this.d.orElseThrow()).c;
            case 3:
                defpackage.sow sowVar = this.a.q;
                if (sowVar == null) {
                    sowVar = defpackage.sow.a;
                }
                return sowVar.c;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.spb spbVar = this.a.j;
                if (spbVar == null) {
                    spbVar = defpackage.spb.a;
                }
                return spbVar.c;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.spc spcVar = this.a.i;
                if (spcVar == null) {
                    spcVar = defpackage.spc.a;
                }
                return spcVar.c;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                zhjVar = this.a.l;
                if (zhjVar == null) {
                    zhjVar = defpackage.zhj.a;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.spn spnVar = this.a;
                defpackage.spa spaVar = spnVar.n;
                if (spaVar == null) {
                    spaVar = defpackage.spa.a;
                }
                java.lang.String str = (spaVar.c == 4 ? (defpackage.soz) spaVar.d : defpackage.soz.a).c;
                if (!str.isEmpty()) {
                    return str;
                }
                defpackage.spa spaVar2 = spnVar.n;
                if (spaVar2 == null) {
                    spaVar2 = defpackage.spa.a;
                }
                zhjVar = spaVar2.c != 2 ? defpackage.zhj.a : (defpackage.zhj) spaVar2.d;
                break;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.spi spiVar = this.a.o;
                if (spiVar == null) {
                    spiVar = defpackage.spi.a;
                }
                return (java.lang.String) spiVar.b.get(0);
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        return zhjVar.c;
    }

    public final java.lang.String i() {
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return "";
            case 1:
                return ((defpackage.spd) this.c.orElseThrow()).h;
            case 2:
                return ((defpackage.spd) this.d.orElseThrow()).h;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final java.lang.String j() {
        defpackage.sqk sqkVar = this.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return "";
            case 1:
                return ((defpackage.spd) this.c.orElseThrow()).f;
            case 2:
                return ((defpackage.spd) this.d.orElseThrow()).f;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.spb spbVar = this.a.j;
                if (spbVar == null) {
                    spbVar = defpackage.spb.a;
                }
                return spbVar.e;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
    }

    public final java.lang.String k() {
        if (this.b == defpackage.sqk.a) {
            defpackage.spn spnVar = this.a;
            if ((spnVar.b & 65536) != 0) {
                defpackage.spm spmVar = spnVar.s;
                if (spmVar == null) {
                    spmVar = defpackage.spm.a;
                }
                if ((spmVar.b & 1) != 0) {
                    java.lang.String str = spmVar.c;
                    if (!str.isEmpty()) {
                        if ((spnVar.b & 2048) == 0) {
                            return str;
                        }
                        defpackage.spa spaVar = spnVar.n;
                        if (spaVar == null) {
                            spaVar = defpackage.spa.a;
                        }
                        if (!(spaVar.c == 1 ? (defpackage.sox) spaVar.d : defpackage.sox.a).b.contains(str)) {
                            return str;
                        }
                    }
                }
            }
        }
        return "";
    }

    public final boolean l() {
        defpackage.spn spnVar = this.a;
        defpackage.zhj zhjVar = spnVar.l;
        if (zhjVar == null) {
            zhjVar = defpackage.zhj.a;
        }
        defpackage.zhi zhiVar = zhjVar.h;
        if (zhiVar == null) {
            zhiVar = defpackage.zhi.a;
        }
        if (!zhiVar.c) {
            defpackage.spf spfVar = spnVar.p;
            if (spfVar == null) {
                spfVar = defpackage.spf.a;
            }
            if (!spfVar.c) {
                return false;
            }
        }
        return true;
    }

    public final boolean m() {
        defpackage.soy soyVar = defpackage.soy.a;
        defpackage.spa spaVar = this.a.n;
        if (spaVar == null) {
            spaVar = defpackage.spa.a;
        }
        defpackage.soy soyVar2 = spaVar.e;
        if (soyVar2 == null) {
            soyVar2 = soyVar;
        }
        return !soyVar.equals(soyVar2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b A[PHI: r2
      0x002b: PHI (r2v7 int) = (r2v5 int), (r2v11 int) binds: [B:17:0x0029, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public final boolean n() {
        int iAQ;
        defpackage.spn spnVar = this.a;
        defpackage.spl splVar = spnVar.g;
        if (splVar == null) {
            splVar = defpackage.spl.a;
        }
        if ((splVar.b & 1) != 0) {
            defpackage.spl splVar2 = spnVar.g;
            if (splVar2 == null) {
                splVar2 = defpackage.spl.a;
            }
            iAQ = a.aQ(splVar2.c);
            if (iAQ != 0) {
                if (iAQ != 2) {
                    return true;
                }
            }
        } else {
            defpackage.spg spgVar = spnVar.h;
            if (spgVar == null) {
                spgVar = defpackage.spg.a;
            }
            iAQ = a.aQ(spgVar.b);
            if (iAQ != 0) {
                if (iAQ != 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        return ((java.lang.Boolean) d().orElse(java.lang.Boolean.FALSE)).booleanValue();
    }

    public final boolean p() {
        defpackage.sph sphVar = this.a.k;
        if (sphVar == null) {
            sphVar = defpackage.sph.a;
        }
        return sphVar.c;
    }

    public final boolean q() {
        defpackage.spe speVar = this.a.c;
        if (speVar == null) {
            speVar = defpackage.spe.a;
        }
        return speVar.b.size() > 0;
    }

    public final boolean r() {
        defpackage.ztf ztfVarB = defpackage.ztf.b(this.a.f);
        if (ztfVarB == null) {
            ztfVarB = defpackage.ztf.STIR_SHAKEN_UNKNOWN;
        }
        return ztfVarB == defpackage.ztf.STIR_SHAKEN_VERIFIED;
    }

    public final boolean s() {
        int iOrdinal = this.b.ordinal();
        int i = 1;
        if (iOrdinal == 1) {
            defpackage.spe speVar = this.a.c;
            if (speVar == null) {
                speVar = defpackage.spe.a;
            }
            return j$.util.Collection.-EL.stream(speVar.b).allMatch(new defpackage.sqj(i));
        }
        int i2 = 0;
        if (iOrdinal != 2) {
            return false;
        }
        defpackage.spe speVar2 = this.a.d;
        if (speVar2 == null) {
            speVar2 = defpackage.spe.a;
        }
        return j$.util.Collection.-EL.stream(speVar2.b).allMatch(new defpackage.sqj(i2));
    }

    public final j$.util.Optional t() {
        if (!this.b.equals(defpackage.sqk.a)) {
            return j$.util.Optional.empty();
        }
        defpackage.spn spnVar = this.a;
        defpackage.spa spaVar = spnVar.n;
        if (spaVar == null) {
            spaVar = defpackage.spa.a;
        }
        defpackage.zag zagVar = (spaVar.c == 2 ? (defpackage.zhj) spaVar.d : defpackage.zhj.a).g;
        if (zagVar == null) {
            zagVar = defpackage.zag.a;
        }
        defpackage.zai zaiVar = zagVar.c;
        if (zaiVar == null) {
            zaiVar = defpackage.zai.a;
        }
        defpackage.zai zaiVar2 = defpackage.zai.a;
        if (zaiVar.equals(zaiVar2)) {
            return j$.util.Optional.empty();
        }
        defpackage.spa spaVar2 = spnVar.n;
        if (spaVar2 == null) {
            spaVar2 = defpackage.spa.a;
        }
        defpackage.zag zagVar2 = (spaVar2.c == 2 ? (defpackage.zhj) spaVar2.d : defpackage.zhj.a).g;
        if (zagVar2 == null) {
            zagVar2 = defpackage.zag.a;
        }
        defpackage.zai zaiVar3 = zagVar2.c;
        if (zaiVar3 != null) {
            zaiVar2 = zaiVar3;
        }
        return !w(zaiVar2) ? j$.util.Optional.empty() : j$.util.Optional.of(zaiVar2);
    }

    public final defpackage.zag u() {
        defpackage.spn spnVar = this.a;
        defpackage.zhj zhjVar = spnVar.l;
        if (zhjVar == null) {
            zhjVar = defpackage.zhj.a;
        }
        defpackage.zag zagVar = zhjVar.g;
        if (zagVar == null) {
            zagVar = defpackage.zag.a;
        }
        defpackage.spf spfVar = spnVar.p;
        if (spfVar == null) {
            spfVar = defpackage.spf.a;
        }
        defpackage.zag zagVar2 = spfVar.d;
        if (zagVar2 == null) {
            zagVar2 = defpackage.zag.a;
        }
        akzx akzxVarM = defpackage.zag.a.m();
        if (!zagVar.d.isEmpty()) {
            java.lang.String str = zagVar.d;
            akzxVarM.u();
            defpackage.zag zagVar3 = (defpackage.zag) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            zagVar3.b |= 2;
            zagVar3.d = str;
        } else if (!zagVar2.d.isEmpty()) {
            java.lang.String str2 = zagVar2.d;
            akzxVarM.u();
            defpackage.zag zagVar4 = (defpackage.zag) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            zagVar4.b |= 2;
            zagVar4.d = str2;
        }
        if (!this.b.equals(defpackage.sqk.a)) {
            return (defpackage.zag) akzxVarM.p();
        }
        j$.util.Optional optionalT = t();
        if (optionalT.isPresent()) {
            defpackage.zai zaiVar = (defpackage.zai) optionalT.orElseThrow();
            akzxVarM.u();
            defpackage.zag zagVar5 = (defpackage.zag) akzxVarM.b;
            j$.util.Objects.requireNonNull(zaiVar);
            zagVar5.c = zaiVar;
            zagVar5.b |= 1;
            return (defpackage.zag) akzxVarM.p();
        }
        defpackage.spa spaVar = spnVar.n;
        if (spaVar == null) {
            spaVar = defpackage.spa.a;
        }
        alat alatVar = (spaVar.c == 1 ? (defpackage.sox) spaVar.d : defpackage.sox.a).c;
        defpackage.zai zaiVar2 = zagVar.c;
        if (zaiVar2 == null) {
            zaiVar2 = defpackage.zai.a;
        }
        if (alatVar.contains(zaiVar2.b)) {
            return (defpackage.zag) akzxVarM.p();
        }
        defpackage.zai zaiVar3 = zagVar.c;
        if (zaiVar3 == null) {
            zaiVar3 = defpackage.zai.a;
        }
        if (!w(zaiVar3)) {
            return (defpackage.zag) akzxVarM.p();
        }
        defpackage.zai zaiVar4 = zagVar.c;
        if (zaiVar4 == null) {
            zaiVar4 = defpackage.zai.a;
        }
        akzxVarM.u();
        defpackage.zag zagVar6 = (defpackage.zag) akzxVarM.b;
        j$.util.Objects.requireNonNull(zaiVar4);
        zagVar6.c = zaiVar4;
        zagVar6.b |= 1;
        return (defpackage.zag) akzxVarM.p();
    }
}
