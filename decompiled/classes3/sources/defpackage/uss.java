package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uss {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public uss(defpackage.urz urzVar, defpackage.usp uspVar, ucm ucmVar, rlv rlvVar, defpackage.usj usjVar) {
        this.a = urzVar;
        this.b = uspVar;
        this.c = ucmVar;
        this.f = rlvVar;
        this.d = usjVar;
        akzx akzxVarM = amrw.a.m();
        int i = urzVar.g;
        akzxVarM.u();
        amrw amrwVar = akzxVarM.b;
        amrwVar.b |= 8;
        amrwVar.f = i;
        akzx akzxVarM2 = defpackage.amrv.a.m();
        int i2 = urzVar.e;
        akzxVarM2.u();
        defpackage.amrv amrvVar = (defpackage.amrv) akzxVarM2.b;
        int i3 = 1;
        amrvVar.b |= 1;
        amrvVar.c = i2;
        int i4 = urzVar.d;
        akzxVarM2.u();
        defpackage.amrv amrvVar2 = (defpackage.amrv) akzxVarM2.b;
        amrvVar2.b |= 2;
        amrvVar2.d = i4;
        defpackage.amrv amrvVar3 = (defpackage.amrv) akzxVarM2.p();
        akzxVarM.u();
        amrw amrwVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(amrvVar3);
        amrwVar2.d = amrvVar3;
        amrwVar2.b |= 2;
        java.lang.String str = urzVar.f;
        akzxVarM.u();
        amrw amrwVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amrwVar3.b |= 1;
        amrwVar3.c = str;
        int i5 = true != urzVar.i ? 2 : 3;
        akzxVarM.u();
        amrw amrwVar4 = akzxVarM.b;
        amrwVar4.g = i5 - 1;
        amrwVar4.b |= 16;
        int iAQ = a.aQ(urzVar.j);
        int i6 = (iAQ == 0 ? 1 : iAQ) - 1;
        if (i6 == 1) {
            i3 = 2;
        } else if (i6 == 2) {
            i3 = 3;
        }
        akzxVarM.u();
        amrw amrwVar5 = akzxVarM.b;
        amrwVar5.h = i3 - 1;
        amrwVar5.b |= 32;
        this.e = akzxVarM;
    }

    static /* synthetic */ void p(aogc aogcVar) {
        aogcVar.s(ajcm.a, defpackage.sfa.b);
    }

    private static final ihj q(long j) {
        ihj ihjVarB = ihj.b((int) j);
        if (ihjVarB == ihj.a) {
            return null;
        }
        return ihjVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private static final int r(defpackage.pzd pzdVar) throws aois {
        switch (pzdVar.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return 6;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return 7;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return 8;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return 9;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 10;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return 11;
            default:
                throw new aois();
        }
    }

    public final void a(mce mceVar) {
        j$.util.Optional optionalH = ((zpm) this.d).h();
        if (true == optionalH.isPresent()) {
            optionalH = j$.util.Optional.ofNullable(((defpackage.apqr) optionalH.get()).b);
        }
        ((gpd) this.e).i((java.lang.String) optionalH.orElse((java.lang.Object) null)).b(mceVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x016a  */
    /* JADX WARN: Code duplicated, block: B:33:0x017b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0192  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, tlb] */
    /* JADX WARN: Type inference failed for: r12v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, tlb] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.tqv tqvVar;
        her herVarM;
        ipc ipcVar;
        her herVar;
        her herVar2;
        ipc ipcVar2;
        her herVar3;
        her herVar4;
        ipc ipcVar3;
        java.lang.String languageTag;
        her herVar5;
        ipc ipcVar4;
        alct alctVarW;
        her herVarN;
        jhw jhwVarE;
        java.lang.Object obj;
        java.lang.Object objA;
        jhw jhwVar;
        java.lang.Object obj2;
        jhw jhwVar2;
        ipc ipcVar5;
        her herVar6;
        her herVar7;
        ihj ihjVarQ;
        if (aolnVar instanceof defpackage.tqv) {
            tqvVar = (defpackage.tqv) aolnVar;
            int i = tqvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqvVar.e = i - Integer.MIN_VALUE;
            } else {
                tqvVar = new defpackage.tqv(this, aolnVar);
            }
        } else {
            tqvVar = new defpackage.tqv(this, aolnVar);
        }
        java.lang.Object objA2 = tqvVar.d;
        aolu aoluVar = aolu.a;
        int i2 = tqvVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                herVarM = (her) tqvVar.c;
                ipcVar2 = (ipc) tqvVar.b;
                herVar = (her) tqvVar.a;
                herVar2 = tqvVar.k;
                ipcVar = tqvVar.f;
                aooc.af(objA2);
            } else if (i2 == 2) {
                herVarM = (her) tqvVar.c;
                ipcVar2 = (ipc) tqvVar.b;
                herVar3 = (her) tqvVar.a;
                herVar4 = tqvVar.k;
                ipcVar3 = tqvVar.f;
                aooc.af(objA2);
                languageTag = ((java.util.Locale) objA2).toLanguageTag();
                aooh.c(languageTag);
                herVar5 = herVar4;
                ipcVar4 = ipcVar2;
                herVarM.z(languageTag);
                alctVarW = herVar3.w();
                herVarN = hhk.n(igr.a.m());
                jhwVarE = hhv.e(ihm.a.m());
                obj = this.c;
                ?? r10 = this.e;
                tqvVar.f = ipcVar3;
                tqvVar.k = herVar5;
                tqvVar.a = ipcVar4;
                tqvVar.b = herVar3;
                tqvVar.c = alctVarW;
                tqvVar.l = herVarN;
                tqvVar.i = jhwVarE;
                tqvVar.j = jhwVarE;
                tqvVar.m = herVarN;
                tqvVar.h = (defpackage.taq) obj;
                tqvVar.e = 3;
                objA = r10.a(tqvVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                jhwVar = jhwVarE;
                obj2 = obj;
                jhwVar2 = jhwVar;
                objA2 = objA;
                ipcVar5 = ipcVar3;
                herVar6 = herVar3;
                herVar7 = herVarN;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = tqvVar.h;
                herVarN = tqvVar.m;
                jhwVar = tqvVar.j;
                jhwVar2 = tqvVar.i;
                herVar7 = tqvVar.l;
                alctVarW = (alct) tqvVar.c;
                herVar6 = (her) tqvVar.b;
                ipcVar4 = (ipc) tqvVar.a;
                herVar5 = tqvVar.k;
                ipcVar5 = tqvVar.f;
                aooc.af(objA2);
            }
            if (((defpackage.taq) obj2).d((java.util.Locale) objA2)) {
                java.lang.Object objA3 = this.d.a();
                aooh.e(objA3, "get(...)");
                ihjVarQ = q(((java.lang.Number) objA3).longValue());
                if (ihjVarQ != null) {
                    jhwVar.k(ihjVarQ);
                }
            }
            herVarN.F(jhwVar2.j());
            herVar6.y(alctVarW, herVar7.C());
            ipcVar4.e(herVar5.v());
            return ipcVar5.b();
        }
        aooc.af(objA2);
        ipc ipcVarF = kcq.F(igf.a.m());
        ipcVarF.g(ifv.d);
        ipc ipcVarG = kcq.G(ige.a.m());
        ipcVarG.i(2);
        ipcVarF.d(ipcVarG.h());
        heq heqVarZ = hhe.z(igj.a.m());
        heqVarZ.s();
        ipcVarF.f(heqVarZ.r());
        ipc ipcVarL = kcq.L(ifz.a.m());
        ipc ipcVarP = kcq.P(ify.a.m());
        ipcVarP.m(ifx.b);
        ipcVarL.k(ipcVarP.l());
        ipcVarF.c(ipcVarL.j());
        herVarM = hhk.m(igs.a.m());
        tqvVar.f = ipcVarF;
        tqvVar.k = herVarM;
        tqvVar.a = herVarM;
        tqvVar.b = ipcVarF;
        tqvVar.c = herVarM;
        tqvVar.e = 1;
        java.lang.Object objD = d(tqvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ipcVar = ipcVarF;
        herVar = herVarM;
        herVar2 = herVar;
        objA2 = objD;
        ipcVar2 = ipcVar;
        if (((java.lang.Boolean) objA2).booleanValue()) {
            languageTag = "mul";
            herVar3 = herVar;
            herVar5 = herVar2;
            ipcVar3 = ipcVar;
        } else {
            ?? r13 = this.e;
            tqvVar.f = ipcVar;
            tqvVar.k = herVar2;
            tqvVar.a = herVar;
            tqvVar.b = ipcVar2;
            tqvVar.c = herVarM;
            tqvVar.e = 2;
            objA2 = r13.a(tqvVar);
            if (objA2 == aoluVar) {
                return aoluVar;
            }
            herVar3 = herVar;
            herVar4 = herVar2;
            ipcVar3 = ipcVar;
            languageTag = ((java.util.Locale) objA2).toLanguageTag();
            aooh.c(languageTag);
            herVar5 = herVar4;
        }
        ipcVar4 = ipcVar2;
        herVarM.z(languageTag);
        alctVarW = herVar3.w();
        herVarN = hhk.n(igr.a.m());
        jhwVarE = hhv.e(ihm.a.m());
        obj = this.c;
        ?? r11 = this.e;
        tqvVar.f = ipcVar3;
        tqvVar.k = herVar5;
        tqvVar.a = ipcVar4;
        tqvVar.b = herVar3;
        tqvVar.c = alctVarW;
        tqvVar.l = herVarN;
        tqvVar.i = jhwVarE;
        tqvVar.j = jhwVarE;
        tqvVar.m = herVarN;
        tqvVar.h = (defpackage.taq) obj;
        tqvVar.e = 3;
        objA = r11.a(tqvVar);
        if (objA != aoluVar) {
            return aoluVar;
        }
        jhwVar = jhwVarE;
        obj2 = obj;
        jhwVar2 = jhwVar;
        objA2 = objA;
        ipcVar5 = ipcVar3;
        herVar6 = herVar3;
        herVar7 = herVarN;
        if (((defpackage.taq) obj2).d((java.util.Locale) objA2)) {
            java.lang.Object objA4 = this.d.a();
            aooh.e(objA4, "get(...)");
            ihjVarQ = q(((java.lang.Number) objA4).longValue());
            if (ihjVarQ != null) {
                jhwVar.k(ihjVarQ);
            }
        }
        herVarN.F(jhwVar2.j());
        herVar6.y(alctVarW, herVar7.C());
        ipcVar4.e(herVar5.v());
        return ipcVar5.b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object c(aoln aolnVar) {
        return this.f.a(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, tlb] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [aoin, java.lang.Object] */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.tqw tqwVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.tqw) {
            tqwVar = (defpackage.tqw) aolnVar;
            int i = tqwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqwVar.b = i - Integer.MIN_VALUE;
            } else {
                tqwVar = new defpackage.tqw(this, aolnVar);
            }
        } else {
            tqwVar = new defpackage.tqw(this, aolnVar);
        }
        java.lang.Object objA = tqwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqwVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = tqwVar.d;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            boolean z = objA == defpackage.tvw.AICORE_MODEL_DOWNLOAD_STATUS_DOWNLOADED;
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objA);
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            java.lang.Object objA2 = this.d.a();
            aooh.e(objA2, "get(...)");
            if (q(((java.lang.Number) objA2).longValue()) == ihj.d) {
                obj = this.c;
                ?? r9 = this.e;
                tqwVar.d = (defpackage.taq) obj;
                tqwVar.b = 1;
                objA = r9.a(tqwVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        return java.lang.Boolean.valueOf(z);
        if (((defpackage.taq) obj).d((java.util.Locale) objA)) {
            java.lang.Object obj2 = this.a;
            tqwVar.d = null;
            tqwVar.b = 2;
            objA = ((twp) obj2).f(267, tqwVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            if (objA == defpackage.tvw.AICORE_MODEL_DOWNLOAD_STATUS_DOWNLOADED) {
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    public final java.lang.Object e(long j, aoln aolnVar) {
        defpackage.sff sffVar;
        if (aolnVar instanceof defpackage.sff) {
            sffVar = (defpackage.sff) aolnVar;
            int i = sffVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sffVar.b = i - Integer.MIN_VALUE;
            } else {
                sffVar = new defpackage.sff(this, aolnVar);
            }
        } else {
            sffVar = new defpackage.sff(this, aolnVar);
        }
        java.lang.Object objAj = sffVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sffVar.b;
        if (i2 == 0) {
            aooc.af(objAj);
            java.lang.Object obj = this.c;
            sffVar.b = 1;
            sin sinVar = (sin) obj;
            objAj = aoov.aj(sinVar.c, new defpackage.sic(sinVar, j, null, 1, null), sffVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        int iIntValue = ((java.lang.Number) objAj).intValue() ^ (-1);
        ?? r11 = iIntValue >>> 31;
        if (iIntValue < 0) {
            p((aogc) this.a);
        }
        return java.lang.Boolean.valueOf((boolean) r11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.abxt abxtVar, android.net.Uri uri, aoln aolnVar) {
        defpackage.sfg sfgVar;
        if (aolnVar instanceof defpackage.sfg) {
            sfgVar = (defpackage.sfg) aolnVar;
            int i = sfgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfgVar.b = i - Integer.MIN_VALUE;
            } else {
                sfgVar = new defpackage.sfg(this, aolnVar);
            }
        } else {
            sfgVar = new defpackage.sfg(this, aolnVar);
        }
        java.lang.Object objAj = sfgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sfgVar.b;
        if (i2 == 0) {
            aooc.af(objAj);
            java.lang.Object obj = this.c;
            sfgVar.b = 1;
            sin sinVar = (sin) obj;
            objAj = aoov.aj(sinVar.c, new defpackage.sil(sinVar, uri, abxtVar, null), sfgVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        boolean z = ((java.lang.Number) objAj).longValue() != -1;
        if (z) {
            p((aogc) this.a);
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final void g() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void h(java.lang.String str) {
        if (i()) {
            this.d.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final boolean i() {
        return ((java.lang.Long) this.e.a()).longValue() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.pzd pzdVar, hxf hxfVar, aoln aolnVar) throws aois {
        defpackage.pza pzaVar;
        int i;
        java.lang.Object obj;
        defpackage.ampy ampyVarAH;
        if (aolnVar instanceof defpackage.pza) {
            pzaVar = (defpackage.pza) aolnVar;
            int i2 = pzaVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pzaVar.b = i2 - Integer.MIN_VALUE;
            } else {
                pzaVar = new defpackage.pza(this, aolnVar);
            }
        } else {
            pzaVar = new defpackage.pza(this, aolnVar);
        }
        java.lang.Object objD = pzaVar.a;
        aolu aoluVar = aolu.a;
        int i3 = pzaVar.b;
        if (i3 != 0) {
            if (i3 == 1) {
                pzdVar = pzaVar.c;
                aooc.af(objD);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        if (hxfVar instanceof defpackage.pze) {
            i = 6;
        } else {
            ajcq ajcqVarB = hxfVar.b();
            aooh.e(ajcqVarB, "playbackEndedFuture(...)");
            pzaVar.c = pzdVar;
            pzaVar.b = 1;
            objD = aosv.D(ajcqVarB, pzaVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        }
        obj = this.e;
        defpackage.vqu vquVarN = akky.N(defpackage.ampy.a.m());
        vquVarN.aJ(r(pzdVar));
        vquVarN.aI(i);
        ampyVarAH = vquVarN.aH();
        pzaVar.c = null;
        pzaVar.b = 2;
        if (((defpackage.pzm) obj).e(ampyVarAH, pzaVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
        hxe hxeVar = (hxe) objD;
        if (hxeVar != null) {
            int iOrdinal = hxeVar.ordinal();
            if (iOrdinal == 0) {
                i = 5;
            } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                i = 7;
            }
            obj = this.e;
            defpackage.vqu vquVarN2 = akky.N(defpackage.ampy.a.m());
            vquVarN2.aJ(r(pzdVar));
            vquVarN2.aI(i);
            ampyVarAH = vquVarN2.aH();
            pzaVar.c = null;
            pzaVar.b = 2;
            if (((defpackage.pzm) obj).e(ampyVarAH, pzaVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        throw new aois();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.pzd pzdVar, hxf hxfVar, aoln aolnVar) throws aois {
        defpackage.pzb pzbVar;
        java.lang.Object obj;
        defpackage.ampy ampyVarAH;
        if (aolnVar instanceof defpackage.pzb) {
            pzbVar = (defpackage.pzb) aolnVar;
            int i = pzbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzbVar.b = i - Integer.MIN_VALUE;
            } else {
                pzbVar = new defpackage.pzb(this, aolnVar);
            }
        } else {
            pzbVar = new defpackage.pzb(this, aolnVar);
        }
        java.lang.Object objD = pzbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pzbVar.b;
        int i3 = 3;
        if (i2 != 0) {
            if (i2 == 1) {
                pzdVar = pzbVar.c;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        if (!(hxfVar instanceof defpackage.pze)) {
            ajcq ajcqVarB = hxfVar.b();
            aooh.e(ajcqVarB, "playbackEndedFuture(...)");
            pzbVar.c = pzdVar;
            pzbVar.b = 1;
            objD = aosv.D(ajcqVarB, pzbVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        }
        obj = this.e;
        defpackage.vqu vquVarN = akky.N(defpackage.ampy.a.m());
        vquVarN.aJ(r(pzdVar));
        vquVarN.aI(i3);
        ampyVarAH = vquVarN.aH();
        pzbVar.c = null;
        pzbVar.b = 2;
        if (((defpackage.pzm) obj).e(ampyVarAH, pzbVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
        hxe hxeVar = (hxe) objD;
        if (hxeVar != null) {
            int iOrdinal = hxeVar.ordinal();
            if (iOrdinal == 0) {
                i3 = 2;
            } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                i3 = 4;
            }
            obj = this.e;
            defpackage.vqu vquVarN2 = akky.N(defpackage.ampy.a.m());
            vquVarN2.aJ(r(pzdVar));
            vquVarN2.aI(i3);
            ampyVarAH = vquVarN2.aH();
            pzbVar.c = null;
            pzbVar.b = 2;
            if (((defpackage.pzm) obj).e(ampyVarAH, pzbVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        throw new aois();
    }

    public final java.lang.Object l(aonn aonnVar, aoln aolnVar) {
        return aosv.m(new pzf(this, aonnVar, (aoln) null, 1), aolnVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object m(hxf hxfVar, defpackage.pyw pywVar, defpackage.pzd pzdVar, aoln aolnVar) throws aois {
        defpackage.pyz pyzVar;
        defpackage.pzd pzdVar2;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.pyz) {
            pyzVar = (defpackage.pyz) aolnVar;
            int i = pyzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pyzVar.d = i - Integer.MIN_VALUE;
            } else {
                pyzVar = new defpackage.pyz(this, aolnVar);
            }
        } else {
            pyzVar = new defpackage.pyz(this, aolnVar);
        }
        java.lang.Object objD = pyzVar.c;
        aolu aoluVar = aolu.a;
        int i2 = pyzVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                pzdVar = pyzVar.e;
                pywVar = (defpackage.pyw) pyzVar.b;
                hxfVar = (hxf) pyzVar.a;
                aooc.af(objD);
            } else if (i2 == 2) {
                pzdVar2 = (defpackage.pzd) pyzVar.b;
                pywVar = (defpackage.pyw) pyzVar.a;
                aooc.af(objD);
                if (((hxe) objD) != hxe.a) {
                    this.b.remove(pzdVar2);
                    if (pywVar instanceof defpackage.pyw) {
                        throw new aois();
                    }
                    java.lang.Object obj = this.f;
                    pyzVar.a = null;
                    pyzVar.b = null;
                    pyzVar.d = 3;
                    defpackage.pzg pzgVar = (defpackage.pzg) obj;
                    objA = pzgVar.a(new ofa(pzgVar, pzdVar2, (aoln) null, 19), pyzVar);
                    if (objA != aoluVar) {
                        objA = aojh.a;
                    }
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        pyzVar.a = hxfVar;
        pyzVar.b = pywVar;
        pyzVar.e = pzdVar;
        pyzVar.d = 1;
        if (k(pzdVar, hxfVar, pyzVar) == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarB = hxfVar.b();
        aooh.e(ajcqVarB, "playbackEndedFuture(...)");
        pyzVar.a = pywVar;
        pyzVar.b = pzdVar;
        pyzVar.e = null;
        pyzVar.d = 2;
        objD = aosv.D(ajcqVarB, pyzVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        pzdVar2 = pzdVar;
        if (((hxe) objD) != hxe.a) {
            this.b.remove(pzdVar2);
            if (pywVar instanceof defpackage.pyw) {
                throw new aois();
            }
            java.lang.Object obj2 = this.f;
            pyzVar.a = null;
            pyzVar.b = null;
            pyzVar.d = 3;
            defpackage.pzg pzgVar2 = (defpackage.pzg) obj2;
            objA = pzgVar2.a(new ofa(pzgVar2, pzdVar2, (aoln) null, 19), pyzVar);
            if (objA != aoluVar) {
                objA = aojh.a;
            }
            if (objA == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object n(aoln aolnVar) {
        return aoov.aj((aolr) this.d, new ohg(this, (aoln) null, 12), aolnVar);
    }

    public final oii o() {
        mgv mgvVar = mgv.et;
        zjv zjvVar = (zjv) this.c;
        zjv.i(zjvVar, mgvVar, (java.util.List) null, (mhc) null, 0, 30);
        return new oii(zjvVar, (mgu) this.e, new android.media.MediaPlayer());
    }

    public uss(sin sinVar, aogc aogcVar, defpackage.rzs rzsVar, defpackage.sfa sfaVar, defpackage.sfi sfiVar, aoss aossVar) {
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(aossVar, "lightweightScope");
        this.c = sinVar;
        this.a = aogcVar;
        this.b = rzsVar;
        this.f = sfaVar;
        this.d = sfiVar;
        this.e = aossVar;
    }

    public uss(defpackage.ubd ubdVar, uav uavVar, aogc aogcVar, rlv rlvVar, ubj ubjVar, ajct ajctVar) {
        this.d = ubdVar;
        this.a = uavVar;
        this.c = aogcVar;
        this.f = rlvVar;
        this.b = ubjVar;
        this.e = ajctVar;
    }

    public uss(zjv zjvVar, mgu mguVar, aolr aolrVar, aolr aolrVar2, aoss aossVar, android.media.AudioManager audioManager) {
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(mguVar, "scopedDiffRecorder");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aolrVar2, "blockingContext");
        aooh.f(aossVar, "lightweightScope");
        this.c = zjvVar;
        this.e = mguVar;
        this.d = aolrVar;
        this.b = aolrVar2;
        this.a = aossVar;
        this.f = audioManager;
    }

    public uss(zpm zpmVar, defpackage.qbe qbeVar, defpackage.tzk tzkVar, gpd gpdVar, heq heqVar, agsm agsmVar) {
        this.d = zpmVar;
        this.a = qbeVar;
        this.b = tzkVar;
        this.e = gpdVar;
        this.c = heqVar;
        this.f = agsmVar;
    }

    public uss(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, byte[] bArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.d = aoinVar2;
        aoinVar3.getClass();
        this.f = aoinVar3;
        aoinVar4.getClass();
        this.e = aoinVar4;
        aoinVar5.getClass();
        this.c = aoinVar5;
        aoinVar6.getClass();
        this.a = aoinVar6;
    }

    public uss(defpackage.pzg pzgVar, zzx zzxVar, aoss aossVar, defpackage.pzm pzmVar) {
        aooh.f(pzgVar, "audioCaptureDisclaimerController");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(pzmVar, "disclaimerControllerCallEventClearcutLogger");
        this.f = pzgVar;
        this.c = zzxVar;
        this.a = aossVar;
        this.e = pzmVar;
        this.d = new ahda((byte[]) null);
        this.b = new java.util.LinkedHashSet();
    }

    public uss(tlb tlbVar, twp twpVar, defpackage.taq taqVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aoinVar, "sharpieAsrEnhancementPolicy");
        aooh.f(aoinVar2, "enableSharpieSourcelessAsrLocale");
        this.e = tlbVar;
        this.a = twpVar;
        this.c = taqVar;
        this.d = aoinVar;
        this.b = aoinVar2;
        this.f = new aiuo(new defpackage.sbm(this, (aoln) null, 19));
    }

    public uss(agsm agsmVar, defpackage.ulw ulwVar, defpackage.zlr zlrVar, apni apniVar, rlv rlvVar, ajcu ajcuVar) {
        this.e = agsmVar;
        this.f = ulwVar;
        this.d = zlrVar;
        this.c = apniVar;
        this.a = ajcuVar;
        this.b = rlvVar;
    }

    public uss(aazc aazcVar, ajcu ajcuVar, aoin aoinVar, aoin aoinVar2) {
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.c = new java.util.concurrent.atomic.AtomicReference();
        this.b = aazcVar;
        this.f = ajcuVar;
        this.e = aoinVar;
        this.a = aoinVar2;
    }

    public uss(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.f = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.b = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
        aoinVar6.getClass();
        this.d = aoinVar6;
    }

    public uss(defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xwv xwvVar, defpackage.xwx xwxVar) {
        this.b = defpackage.ygj.a(150, new defpackage.xwn(this, 0));
        this.c = xynVar;
        this.a = xynVar2;
        this.e = xynVar3;
        this.f = xwvVar;
        this.d = xwxVar;
    }
}
