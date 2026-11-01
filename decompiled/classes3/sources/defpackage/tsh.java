package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tsh extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ tsj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsh(tsj tsjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = tsjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:2: B:61:0x0157->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x016d A[SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.tzb tzbVar;
        defpackage.tyz tyzVar;
        java.lang.Object objD;
        defpackage.tyz tyzVar2;
        tsj tsjVar;
        defpackage.yva yvaVar;
        int iT;
        boolean z;
        boolean z2;
        trs trsVarP;
        aogc aogcVar;
        java.util.List list;
        java.util.Iterator it;
        java.util.List list2;
        java.util.Iterator it2;
        java.util.List list3;
        java.util.Iterator it3;
        rmx rmxVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        int i2 = 3;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                tzbVar = (defpackage.tzb) this.a;
                aooc.af(obj);
            } else if (i == 2) {
                aooc.af(obj);
                tsj tsjVar2 = this.c;
                tyzVar = (defpackage.tyz) obj;
                this.a = tyzVar;
                this.b = 3;
                objD = tsjVar2.j.d(this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                tyzVar2 = tyzVar;
                obj = objD;
                tsjVar = this.c;
                yvaVar = (defpackage.yva) obj;
                iT = anty.T(yvaVar);
                if (iT == 0) {
                    tsjVar.g.o(rmx.sV);
                } else {
                    if (iT != 1) {
                        throw new aois();
                    }
                    for (defpackage.yuy yuyVar : ((defpackage.yux) yvaVar).a) {
                        rlv rlvVar = tsjVar.g;
                        switch (yuyVar.ordinal()) {
                            case 0:
                                rmxVar = rmx.sU;
                                break;
                            case 1:
                                rmxVar = rmx.sO;
                                break;
                            case 2:
                                rmxVar = rmx.sL;
                                break;
                            case 3:
                                rmxVar = rmx.sM;
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                rmxVar = rmx.sN;
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                rmxVar = rmx.sR;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                rmxVar = rmx.sP;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                rmxVar = rmx.sX;
                                break;
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                rmxVar = rmx.sY;
                                break;
                            default:
                                throw new aois();
                        }
                        rlvVar.o(rmxVar);
                    }
                }
                akzx akzxVarM = trs.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(tyzVar2, "value");
                akzxVarM.u();
                trs trsVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(tyzVar2);
                trsVar.d = tyzVar2;
                trsVar.b |= 2;
                z = yvaVar instanceof defpackage.yux;
                if (z) {
                    list3 = ((defpackage.yux) yvaVar).a;
                    if (list3 instanceof java.util.Collection) {
                        it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                i2 = 4;
                            }
                        } while (!tsj.d.contains((defpackage.yuy) it3.next()));
                    } else {
                        it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                i2 = 4;
                            }
                        } while (!tsj.d.contains((defpackage.yuy) it3.next()));
                    }
                } else {
                    i2 = 4;
                }
                akzxVarM.u();
                trs trsVar2 = akzxVarM.b;
                trsVar2.f = a.aU(i2);
                trsVar2.b |= 8;
                j$.time.Instant instantNow = j$.time.Instant.now();
                aooh.e(instantNow, "instant(...)");
                alcf alcfVarAu = aooc.au(instantNow);
                aooh.f(alcfVarAu, "value");
                akzxVarM.u();
                trs trsVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(alcfVarAu);
                trsVar3.c = alcfVarAu;
                trsVar3.b |= 1;
                if (z) {
                    list2 = ((defpackage.yux) yvaVar).a;
                    if (list2 instanceof java.util.Collection) {
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (tsj.b.contains((defpackage.yuy) it2.next())) {
                                    z2 = true;
                                }
                            } else {
                                z2 = false;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (tsj.b.contains((defpackage.yuy) it2.next())) {
                                    z2 = true;
                                }
                            } else {
                                z2 = false;
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
                akzxVarM.u();
                trs trsVar4 = akzxVarM.b;
                trsVar4.b |= 4;
                trsVar4.e = z2;
                if (z) {
                    list = ((defpackage.yux) yvaVar).a;
                    if (list instanceof java.util.Collection) {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z3 = false;
                            }
                        } while (!tsj.c.contains((defpackage.yuy) it.next()));
                    } else {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z3 = false;
                            }
                        } while (!tsj.c.contains((defpackage.yuy) it.next()));
                    }
                } else {
                    z3 = false;
                }
                akzxVarM.u();
                trs trsVar5 = akzxVarM.b;
                trsVar5.b |= 16;
                trsVar5.g = z3;
                trsVarP = akzxVarM.p();
                aooh.e(trsVarP, "build(...)");
                aogcVar = tsjVar.l;
                this.a = null;
                this.b = 4;
                if (aogcVar.ay(trsVarP, this) == aoluVar) {
                    return aoluVar;
                }
            } else if (i != 3) {
                aooc.af(obj);
            } else {
                tyzVar2 = (defpackage.tyz) this.a;
                aooc.af(obj);
                tsjVar = this.c;
                yvaVar = (defpackage.yva) obj;
                iT = anty.T(yvaVar);
                if (iT == 0) {
                    tsjVar.g.o(rmx.sV);
                } else {
                    if (iT != 1) {
                        throw new aois();
                    }
                    while (r7.hasNext()) {
                        rlv rlvVar2 = tsjVar.g;
                        switch (yuyVar.ordinal()) {
                            case 0:
                                rmxVar = rmx.sU;
                                break;
                            case 1:
                                rmxVar = rmx.sO;
                                break;
                            case 2:
                                rmxVar = rmx.sL;
                                break;
                            case 3:
                                rmxVar = rmx.sM;
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                rmxVar = rmx.sN;
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                rmxVar = rmx.sR;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                rmxVar = rmx.sP;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                rmxVar = rmx.sX;
                                break;
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                rmxVar = rmx.sY;
                                break;
                            default:
                                throw new aois();
                        }
                        rlvVar2.o(rmxVar);
                    }
                }
                akzx akzxVarM2 = trs.a.m();
                aooh.f(akzxVarM2, "builder");
                aooh.f(tyzVar2, "value");
                akzxVarM2.u();
                trs trsVar6 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(tyzVar2);
                trsVar6.d = tyzVar2;
                trsVar6.b |= 2;
                z = yvaVar instanceof defpackage.yux;
                if (z) {
                    list3 = ((defpackage.yux) yvaVar).a;
                    if ((list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                        it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                i2 = 4;
                            }
                        } while (!tsj.d.contains((defpackage.yuy) it3.next()));
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 4;
                }
                akzxVarM2.u();
                trs trsVar7 = akzxVarM2.b;
                trsVar7.f = a.aU(i2);
                trsVar7.b |= 8;
                j$.time.Instant instantNow2 = j$.time.Instant.now();
                aooh.e(instantNow2, "instant(...)");
                alcf alcfVarAu2 = aooc.au(instantNow2);
                aooh.f(alcfVarAu2, "value");
                akzxVarM2.u();
                trs trsVar8 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(alcfVarAu2);
                trsVar8.c = alcfVarAu2;
                trsVar8.b |= 1;
                if (z) {
                    list2 = ((defpackage.yux) yvaVar).a;
                    if ((list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (tsj.b.contains((defpackage.yuy) it2.next())) {
                                    z2 = true;
                                }
                            } else {
                                z2 = false;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                akzxVarM2.u();
                trs trsVar9 = akzxVarM2.b;
                trsVar9.b |= 4;
                trsVar9.e = z2;
                if (z) {
                    list = ((defpackage.yux) yvaVar).a;
                    if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z3 = false;
                            }
                        } while (!tsj.c.contains((defpackage.yuy) it.next()));
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                akzxVarM2.u();
                trs trsVar10 = akzxVarM2.b;
                trsVar10.b |= 16;
                trsVar10.g = z3;
                trsVarP = akzxVarM2.p();
                aooh.e(trsVarP, "build(...)");
                aogcVar = tsjVar.l;
                this.a = null;
                this.b = 4;
                if (aogcVar.ay(trsVarP, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        tsj tsjVar3 = this.c;
        tzbVar = tsjVar3.f;
        this.a = tzbVar;
        this.b = 1;
        obj = tsjVar3.h.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        akff akffVarA = akff.a(((java.util.Locale) obj).toLanguageTag());
        this.a = null;
        this.b = 2;
        obj = tzbVar.b(akffVarA, null, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        tsj tsjVar4 = this.c;
        tyzVar = (defpackage.tyz) obj;
        this.a = tyzVar;
        this.b = 3;
        objD = tsjVar4.j.d(this);
        if (objD != aoluVar) {
            return aoluVar;
        }
        tyzVar2 = tyzVar;
        obj = objD;
        tsjVar = this.c;
        yvaVar = (defpackage.yva) obj;
        iT = anty.T(yvaVar);
        if (iT == 0) {
            tsjVar.g.o(rmx.sV);
        } else {
            if (iT != 1) {
                throw new aois();
            }
            while (r7.hasNext()) {
                rlv rlvVar3 = tsjVar.g;
                switch (yuyVar.ordinal()) {
                    case 0:
                        rmxVar = rmx.sU;
                        break;
                    case 1:
                        rmxVar = rmx.sO;
                        break;
                    case 2:
                        rmxVar = rmx.sL;
                        break;
                    case 3:
                        rmxVar = rmx.sM;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        rmxVar = rmx.sN;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        rmxVar = rmx.sR;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        rmxVar = rmx.sP;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        rmxVar = rmx.sX;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        rmxVar = rmx.sY;
                        break;
                    default:
                        throw new aois();
                }
                rlvVar3.o(rmxVar);
            }
        }
        akzx akzxVarM3 = trs.a.m();
        aooh.f(akzxVarM3, "builder");
        aooh.f(tyzVar2, "value");
        akzxVarM3.u();
        trs trsVar11 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(tyzVar2);
        trsVar11.d = tyzVar2;
        trsVar11.b |= 2;
        z = yvaVar instanceof defpackage.yux;
        if (z) {
            list3 = ((defpackage.yux) yvaVar).a;
            if (list3 instanceof java.util.Collection) {
                it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        i2 = 4;
                    }
                } while (!tsj.d.contains((defpackage.yuy) it3.next()));
            } else {
                it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        i2 = 4;
                    }
                } while (!tsj.d.contains((defpackage.yuy) it3.next()));
            }
        } else {
            i2 = 4;
        }
        akzxVarM3.u();
        trs trsVar12 = akzxVarM3.b;
        trsVar12.f = a.aU(i2);
        trsVar12.b |= 8;
        j$.time.Instant instantNow3 = j$.time.Instant.now();
        aooh.e(instantNow3, "instant(...)");
        alcf alcfVarAu3 = aooc.au(instantNow3);
        aooh.f(alcfVarAu3, "value");
        akzxVarM3.u();
        trs trsVar13 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(alcfVarAu3);
        trsVar13.c = alcfVarAu3;
        trsVar13.b |= 1;
        if (z) {
            list2 = ((defpackage.yux) yvaVar).a;
            if (list2 instanceof java.util.Collection) {
                it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (tsj.b.contains((defpackage.yuy) it2.next())) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
            } else {
                it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (tsj.b.contains((defpackage.yuy) it2.next())) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
            }
        } else {
            z2 = false;
        }
        akzxVarM3.u();
        trs trsVar14 = akzxVarM3.b;
        trsVar14.b |= 4;
        trsVar14.e = z2;
        if (z) {
            list = ((defpackage.yux) yvaVar).a;
            if (list instanceof java.util.Collection) {
                it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z3 = false;
                    }
                } while (!tsj.c.contains((defpackage.yuy) it.next()));
            } else {
                it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z3 = false;
                    }
                } while (!tsj.c.contains((defpackage.yuy) it.next()));
            }
        } else {
            z3 = false;
        }
        akzxVarM3.u();
        trs trsVar15 = akzxVarM3.b;
        trsVar15.b |= 16;
        trsVar15.g = z3;
        trsVarP = akzxVarM3.p();
        aooh.e(trsVarP, "build(...)");
        aogcVar = tsjVar.l;
        this.a = null;
        this.b = 4;
        if (aogcVar.ay(trsVarP, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tsh(this.c, aolnVar);
    }
}
