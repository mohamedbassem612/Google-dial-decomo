package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aknx {
    public static volatile defpackage.anpk a;

    private aknx() {
    }

    public static defpackage.alsi A(defpackage.almz almzVar) {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.alsa.d;
        apdi apdiVar2 = defpackage.alnx.b;
        almzVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.alsa) objJ);
        return akzzVarM.p();
    }

    public static defpackage.alsi B(defpackage.almy almyVar) {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.alse.d;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar2 = defpackage.alny.b;
        almzVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.alse) objJ);
        return akzzVarM.p();
    }

    public static defpackage.alsi C(defpackage.almy almyVar, j$.util.Optional optional) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alol.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alol alolVar = (defpackage.alol) objJ;
        defpackage.alsw alswVar = alolVar.e;
        if (alswVar == null) {
            alswVar = defpackage.alsw.a;
        }
        akzx akzxVarP = alswVar.p();
        if (((defpackage.alsw) akzxVarP.b).b == 1) {
            defpackage.alju aljuVar = new defpackage.alju(akzxVarP, 0);
            if (true == optional.isPresent()) {
                java.lang.String str = (java.lang.String) optional.get();
                akzx akzxVar = (akzx) aljuVar.a;
                defpackage.alsw alswVar2 = (defpackage.alsw) akzxVar.b;
                defpackage.alsn alsnVar = alswVar2.b == 1 ? (defpackage.alsn) alswVar2.c : defpackage.alsn.a;
                if ((alsnVar.b & 2) != 0) {
                    defpackage.alsm alsmVar = alsnVar.d;
                    if (alsmVar == null) {
                        alsmVar = defpackage.alsm.a;
                    }
                    if (!alsmVar.e) {
                        akzx akzxVarP2 = alsnVar.p();
                        defpackage.alsm alsmVar2 = alsnVar.d;
                        if (alsmVar2 == null) {
                            alsmVar2 = defpackage.alsm.a;
                        }
                        akzx akzxVarP3 = alsmVar2.p();
                        defpackage.alsm alsmVar3 = alsnVar.d;
                        if (alsmVar3 == null) {
                            alsmVar3 = defpackage.alsm.a;
                        }
                        java.lang.String string = j$.nio.file.Paths.get(str, new java.lang.String[]{java.lang.String.valueOf(alsmVar3.c).concat(".wav")}).toString();
                        akzxVarP3.u();
                        defpackage.alsm alsmVar4 = (defpackage.alsm) akzxVarP3.b;
                        j$.util.Objects.requireNonNull(string);
                        alsmVar4.b |= 1;
                        alsmVar4.c = string;
                        akzxVarP3.u();
                        defpackage.alsm alsmVar5 = (defpackage.alsm) akzxVarP3.b;
                        alsmVar5.b |= 4;
                        alsmVar5.e = true;
                        akzxVarP2.u();
                        defpackage.alsn alsnVar2 = (defpackage.alsn) akzxVarP2.b;
                        defpackage.alsm alsmVar6 = (defpackage.alsm) akzxVarP3.p();
                        j$.util.Objects.requireNonNull(alsmVar6);
                        alsnVar2.d = alsmVar6;
                        alsnVar2.b |= 2;
                        alsnVar = (defpackage.alsn) akzxVarP2.p();
                    }
                }
                akzxVar.u();
                defpackage.alsw alswVar3 = (defpackage.alsw) akzxVar.b;
                j$.util.Objects.requireNonNull(alsnVar);
                alswVar3.c = alsnVar;
                alswVar3.b = 1;
            }
        }
        akzx akzxVarM = defpackage.alta.a.m();
        defpackage.alsw alswVar4 = (defpackage.alsw) akzxVarP.p();
        akzxVarM.u();
        defpackage.alta altaVar = (defpackage.alta) akzxVarM.b;
        j$.util.Objects.requireNonNull(alswVar4);
        altaVar.d = alswVar4;
        altaVar.b |= 2;
        java.lang.String str2 = almyVar.e;
        akzxVarM.u();
        defpackage.alta altaVar2 = (defpackage.alta) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        altaVar2.b |= 1;
        altaVar2.c = str2;
        defpackage.alsy alsyVarB = defpackage.alsy.b(alolVar.c);
        if (alsyVarB == null) {
            alsyVarB = defpackage.alsy.NO_ACTION;
        }
        akzxVarM.u();
        defpackage.alta altaVar3 = (defpackage.alta) akzxVarM.b;
        altaVar3.e = alsyVarB.j;
        altaVar3.b |= 4;
        defpackage.alsz alszVarB = defpackage.alsz.b(alolVar.d);
        if (alszVarB == null) {
            alszVarB = defpackage.alsz.UNKNOWN_ENTITY;
        }
        akzxVarM.u();
        defpackage.alta altaVar4 = (defpackage.alta) akzxVarM.b;
        altaVar4.f = alszVarB.d;
        altaVar4.b |= 8;
        defpackage.alta altaVar5 = (defpackage.alta) akzxVarM.p();
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alta.g, altaVar5);
        return akzzVarM.p();
    }

    public static defpackage.almz D() {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_START_CONVERSATION;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        return akzzVarM.p();
    }

    public static /* synthetic */ java.lang.Object E(java.lang.Object obj) {
        defpackage.almz almzVar = ((defpackage.almy) obj).h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        return alnbVarB == null ? defpackage.alnb.EVENT_UNKNOWN : alnbVarB;
    }

    public static final defpackage.altl F(java.lang.String str) throws defpackage.alio {
        java.lang.String str2 = str + java.io.File.separator + "model_metadata.pb";
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str2);
            try {
                defpackage.altl altlVar = (defpackage.altl) alad.A(defpackage.altl.a, fileInputStream, akzq.a());
                fileInputStream.close();
                return altlVar;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new defpackage.alio(java.lang.String.format("failed to load %s", str2), defpackage.alti.SPECS_LOADING_FAILURE, e);
        }
    }

    public static boolean G(char c) {
        int type;
        return java.lang.Character.isWhitespace(c) || (type = java.lang.Character.getType(c)) == 12 || type == 13 || type == 14;
    }

    public static int H(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            default:
                return 0;
        }
    }

    public static int I(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static /* synthetic */ long J(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j3 = j * j2;
            if (j == 0 || j3 / j == j2) {
                return j3;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static final /* synthetic */ xtq K(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq L(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    private static aigf M(java.util.Map map, aihd aihdVar) {
        return (aigf) j$.util.Collection.-EL.stream(map.entrySet()).filter(new abdh(aihdVar, 19)).collect(aido.b(new defpackage.ailg(10), new defpackage.ailg(11)));
    }

    public static int a(int i) {
        if (i == 20) {
            return 21;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static final /* synthetic */ void b(akzx akzxVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akrn) akzxVar.b).b);
        aooh.e(listUnmodifiableList, "getNotificationThreadList(...)");
        new alct(listUnmodifiableList);
    }

    public static aify c(defpackage.alfr alfrVar, defpackage.akxt akxtVar) {
        int iAM;
        aift aiftVar = new aift(4);
        if ((alfrVar.c & 2097152) != 0) {
            aiftVar.i(java.lang.Integer.valueOf(alfrVar.j));
        }
        defpackage.akxv akxvVar = akxtVar.c;
        if (akxvVar == null) {
            akxvVar = defpackage.akxv.a;
        }
        int iAf = a.af(akxvVar.e);
        if (iAf != 0 && iAf == 3 && !alfrVar.m && ((iAM = a.aM(alfrVar.n)) == 0 || iAM == 1)) {
            aiftVar.k(alfrVar.k);
        }
        return aiftVar.h();
    }

    public static final defpackage.akxp d(defpackage.akxs akxsVar) {
        akzx akzxVarM = defpackage.alfr.a.m();
        akzxVarM.u();
        defpackage.alfr alfrVar = (defpackage.alfr) akzxVarM.b;
        alfrVar.g = 48;
        alfrVar.b |= 2097152;
        if ((akxsVar.f & 1) != 0) {
            long j = akxsVar.g;
            akzxVarM.u();
            defpackage.alfr alfrVar2 = (defpackage.alfr) akzxVarM.b;
            alfrVar2.b |= 4194304;
            alfrVar2.h = j;
        }
        if ((akxsVar.f & 2) != 0) {
            int i = akxsVar.h;
            akzxVarM.u();
            defpackage.alfr alfrVar3 = (defpackage.alfr) akzxVarM.b;
            alfrVar3.c |= 2097152;
            alfrVar3.j = i;
        }
        if (!akxsVar.i.isEmpty()) {
            akzxVarM.aJ(akxsVar.i);
        }
        alak alakVar = akxsVar.j;
        alal alalVar = defpackage.akxs.a;
        if (!new alam(alakVar, alalVar).isEmpty()) {
            alam alamVar = new alam(akxsVar.j, alalVar);
            akzxVarM.u();
            defpackage.alfr alfrVar4 = (defpackage.alfr) akzxVarM.b;
            alak alakVar2 = alfrVar4.l;
            if (!alakVar2.c()) {
                alfrVar4.l = alad.H(alakVar2);
            }
            java.util.Iterator it = alamVar.iterator();
            while (it.hasNext()) {
                alfrVar4.l.g(((defpackage.akwf) it.next()).a());
            }
        }
        if ((akxsVar.f & 8) != 0) {
            boolean z = akxsVar.l;
            akzxVarM.u();
            defpackage.alfr alfrVar5 = (defpackage.alfr) akzxVarM.b;
            alfrVar5.c |= 536870912;
            alfrVar5.q = z;
        }
        if ((akxsVar.f & 128) != 0) {
            long j2 = akxsVar.m;
            akzxVarM.u();
            defpackage.alfr alfrVar6 = (defpackage.alfr) akzxVarM.b;
            alfrVar6.b |= 8388608;
            alfrVar6.i = j2;
        }
        if ((akxsVar.f & 256) != 0) {
            java.lang.String str = akxsVar.n;
            akzxVarM.u();
            defpackage.alfr alfrVar7 = (defpackage.alfr) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            alfrVar7.b |= 32768;
            alfrVar7.f = str;
        }
        if ((akxsVar.f & 4) != 0) {
            boolean z2 = akxsVar.k;
            akzxVarM.u();
            defpackage.alfr alfrVar8 = (defpackage.alfr) akzxVarM.b;
            alfrVar8.c |= 134217728;
            alfrVar8.o = z2;
        }
        if ((akxsVar.f & 512) != 0) {
            boolean z3 = akxsVar.o;
            akzxVarM.u();
            defpackage.alfr alfrVar9 = (defpackage.alfr) akzxVarM.b;
            alfrVar9.c |= 33554432;
            alfrVar9.m = z3;
        }
        if ((akxsVar.f & 4096) != 0) {
            int iAM = a.aM(akxsVar.p);
            if (iAM == 0) {
                iAM = 1;
            }
            akzxVarM.u();
            defpackage.alfr alfrVar10 = (defpackage.alfr) akzxVarM.b;
            alfrVar10.n = iAM - 1;
            alfrVar10.c |= 67108864;
        }
        alak alakVar3 = akxsVar.q;
        alal alalVar2 = defpackage.akxs.b;
        if (!new alam(alakVar3, alalVar2).isEmpty()) {
            alam alamVar2 = new alam(akxsVar.q, alalVar2);
            akzxVarM.u();
            defpackage.alfr alfrVar11 = (defpackage.alfr) akzxVarM.b;
            alak alakVar4 = alfrVar11.r;
            if (!alakVar4.c()) {
                alfrVar11.r = alad.H(alakVar4);
            }
            java.util.Iterator it2 = alamVar2.iterator();
            while (it2.hasNext()) {
                alfrVar11.r.g(((defpackage.akwr) it2.next()).r);
            }
        }
        alak alakVar5 = akxsVar.r;
        alal alalVar3 = defpackage.akxs.c;
        if (!new alam(alakVar5, alalVar3).isEmpty()) {
            alam alamVar3 = new alam(akxsVar.r, alalVar3);
            akzxVarM.u();
            defpackage.alfr alfrVar12 = (defpackage.alfr) akzxVarM.b;
            alak alakVar6 = alfrVar12.d;
            if (!alakVar6.c()) {
                alfrVar12.d = alad.H(alakVar6);
            }
            java.util.Iterator it3 = alamVar3.iterator();
            while (it3.hasNext()) {
                alfrVar12.d.g(((defpackage.akwp) it3.next()).a());
            }
        }
        alak alakVar7 = akxsVar.s;
        alal alalVar4 = defpackage.akxs.d;
        if (!new alam(alakVar7, alalVar4).isEmpty()) {
            alam alamVar4 = new alam(akxsVar.s, alalVar4);
            akzxVarM.u();
            defpackage.alfr alfrVar13 = (defpackage.alfr) akzxVarM.b;
            alak alakVar8 = alfrVar13.e;
            if (!alakVar8.c()) {
                alfrVar13.e = alad.H(alakVar8);
            }
            java.util.Iterator it4 = alamVar4.iterator();
            while (it4.hasNext()) {
                alfrVar13.e.g(((defpackage.akwq) it4.next()).a());
            }
        }
        akzz akzzVarM = defpackage.akwu.a.m();
        akzx akzxVarM2 = defpackage.alfs.a.m();
        akzxVarM2.u();
        defpackage.alfs alfsVar = (defpackage.alfs) akzxVarM2.b;
        defpackage.alfr alfrVar14 = (defpackage.alfr) akzxVarM.p();
        j$.util.Objects.requireNonNull(alfrVar14);
        alfsVar.c = alfrVar14;
        alfsVar.b |= 1;
        akzzVarM.u();
        defpackage.akwu akwuVar = akzzVarM.b;
        defpackage.alfs alfsVar2 = (defpackage.alfs) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alfsVar2);
        akwuVar.c = alfsVar2;
        akwuVar.b |= 1;
        return akmr.d(akzzVarM);
    }

    public static defpackage.almz e() {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_USER_JOIN_CALL;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        return akzzVarM.p();
    }

    public static defpackage.almz f() {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_USER_END_CALL;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        return akzzVarM.p();
    }

    public static defpackage.almz g(defpackage.alpe alpeVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_USER_ACTION;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alpe.d, alpeVar);
        return akzzVarM.p();
    }

    public static defpackage.almz h(defpackage.alro alroVar) {
        apdi apdiVar = defpackage.alqv.f;
        alroVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alqv alqvVar = (defpackage.alqv) objJ;
        akzx akzxVarM = defpackage.alnj.a.m();
        akzz akzzVarM = defpackage.almz.a.m();
        int i = alqvVar.b;
        if ((i & 1) != 0) {
            alqu alquVar = alqvVar.c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            akzxVarM.u();
            defpackage.alnj alnjVar = (defpackage.alnj) akzxVarM.b;
            j$.util.Objects.requireNonNull(alquVar);
            alnjVar.c = alquVar;
            alnjVar.b |= 1;
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_ASR_RESULT;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
        } else if ((i & 2) != 0) {
            defpackage.amle amleVar = alqvVar.d;
            if (amleVar == null) {
                amleVar = defpackage.amle.a;
            }
            if ((amleVar.b & 16) != 0) {
                defpackage.amkv amkvVar = amleVar.d;
                if (amkvVar == null) {
                    amkvVar = defpackage.amkv.a;
                }
                int iAN = a.aN(amkvVar.b);
                if (iAN == 0) {
                    iAN = 1;
                }
                if (iAN == 1) {
                    defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_ENDPOINT_SPEECH_START;
                    akzzVarM.u();
                    defpackage.almz almzVar2 = akzzVarM.b;
                    almzVar2.c = alnbVar2.aN;
                    almzVar2.b |= 1;
                    akzxVarM.u();
                    defpackage.alnj alnjVar2 = (defpackage.alnj) akzxVarM.b;
                    j$.util.Objects.requireNonNull(amleVar);
                    alnjVar2.d = amleVar;
                    alnjVar2.b |= 4;
                } else if (iAN == 2) {
                    defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_ENDPOINT_SPEECH_END;
                    akzzVarM.u();
                    defpackage.almz almzVar3 = akzzVarM.b;
                    almzVar3.c = alnbVar3.aN;
                    almzVar3.b |= 1;
                    akzxVarM.u();
                    defpackage.alnj alnjVar3 = (defpackage.alnj) akzxVarM.b;
                    j$.util.Objects.requireNonNull(amleVar);
                    alnjVar3.d = amleVar;
                    alnjVar3.b |= 4;
                }
            }
            amld amldVar = amleVar.c;
            if (amldVar == null) {
                amldVar = amld.a;
            }
            if (amldVar.b == 4) {
                amld amldVar2 = amleVar.c;
                if (amldVar2 == null) {
                    amldVar2 = amld.a;
                }
                defpackage.amlc amlcVar = amldVar2.b == 4 ? (defpackage.amlc) amldVar2.c : defpackage.amlc.a;
                akzx akzxVarM2 = alqu.a.m();
                defpackage.amlg amlgVar = amlcVar.c;
                if (amlgVar == null) {
                    amlgVar = defpackage.amlg.a;
                }
                long j = amlgVar.c;
                akzxVarM2.u();
                alqu alquVar2 = akzxVarM2.b;
                alquVar2.b |= 1;
                alquVar2.e = j;
                defpackage.amlg amlgVar2 = amlcVar.c;
                if (amlgVar2 == null) {
                    amlgVar2 = defpackage.amlg.a;
                }
                long j2 = amlgVar2.d;
                akzxVarM2.u();
                alqu alquVar3 = akzxVarM2.b;
                alquVar3.b |= 2;
                alquVar3.f = j2;
                akzx akzxVarM3 = defpackage.alqs.a.m();
                java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(amlcVar.b).map(new defpackage.ailg(13)).collect(aido.a);
                akzxVarM3.u();
                defpackage.alqs alqsVar = (defpackage.alqs) akzxVarM3.b;
                alat alatVar = alqsVar.b;
                if (!alatVar.c()) {
                    alqsVar.b = alad.J(alatVar);
                }
                akyl.i(iterable, alqsVar.b);
                defpackage.alqs alqsVar2 = (defpackage.alqs) akzxVarM3.p();
                akzxVarM2.u();
                alqu alquVar4 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(alqsVar2);
                alquVar4.d = alqsVar2;
                alquVar4.c = 12;
                akzxVarM.u();
                defpackage.alnj alnjVar4 = (defpackage.alnj) akzxVarM.b;
                alqu alquVarP = akzxVarM2.p();
                j$.util.Objects.requireNonNull(alquVarP);
                alnjVar4.c = alquVarP;
                alnjVar4.b |= 1;
                defpackage.alnb alnbVar4 = defpackage.alnb.EVENT_ASR_RESULT;
                akzzVarM.u();
                defpackage.almz almzVar4 = akzzVarM.b;
                almzVar4.c = alnbVar4.aN;
                almzVar4.b |= 1;
            }
        }
        if ((alqvVar.b & 4) != 0) {
            int iAN2 = a.aN(alqvVar.e);
            int i2 = iAN2 != 0 ? iAN2 : 1;
            akzxVarM.u();
            defpackage.alnj alnjVar5 = (defpackage.alnj) akzxVarM.b;
            alnjVar5.e = i2 - 1;
            alnjVar5.b |= 8;
        }
        akzzVarM.bV(defpackage.alnj.f, (defpackage.alnj) akzxVarM.p());
        return akzzVarM.p();
    }

    public static defpackage.almz i(defpackage.alro alroVar) {
        apdi apdiVar = defpackage.alqx.d;
        alroVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        akzx akzxVarM = defpackage.almv.a.m();
        akzm akzmVarC = aldf.c(alroVar.c);
        akzxVarM.u();
        defpackage.almv almvVar = (defpackage.almv) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarC);
        almvVar.c = akzmVarC;
        almvVar.b |= 1;
        java.lang.String str = ((defpackage.alqx) objJ).c;
        akzxVarM.u();
        defpackage.almv almvVar2 = (defpackage.almv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almvVar2.b |= 2;
        almvVar2.d = str;
        defpackage.almv almvVar3 = (defpackage.almv) akzxVarM.p();
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_END_SAY_TIMING;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.almv.e, almvVar3);
        return akzzVarM.p();
    }

    public static defpackage.almz j(defpackage.alro alroVar) {
        apdi apdiVar = defpackage.alqy.f;
        alroVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        akzx akzxVarM = defpackage.alom.a.m();
        akzm akzmVarC = aldf.c(alroVar.c);
        akzxVarM.u();
        defpackage.alom alomVar = (defpackage.alom) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarC);
        alomVar.c = akzmVarC;
        alomVar.b |= 1;
        java.lang.String str = ((defpackage.alqy) objJ).c;
        akzxVarM.u();
        defpackage.alom alomVar2 = (defpackage.alom) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alomVar2.b |= 2;
        alomVar2.d = str;
        defpackage.alom alomVar3 = (defpackage.alom) akzxVarM.p();
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_SAY_INITIATED_TIMING;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alom.e, alomVar3);
        return akzzVarM.p();
    }

    public static defpackage.almz k(defpackage.alro alroVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_CALLER_TYPE;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.alms.d;
        akzx akzxVarM = defpackage.alms.a.m();
        apdi apdiVar2 = defpackage.alwr.d;
        alroVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alwr) objJ).c);
        if (alwqVarB == null) {
            alwqVarB = defpackage.alwq.TYPE_UNSET;
        }
        akzxVarM.u();
        defpackage.alms almsVar = (defpackage.alms) akzxVarM.b;
        almsVar.c = alwqVarB.i;
        almsVar.b |= 1;
        akzzVarM.bV(apdiVar, (defpackage.alms) akzxVarM.p());
        return akzzVarM.p();
    }

    public static defpackage.almz l(defpackage.alro alroVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_DAREDEVIL;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.almu.b;
        apdi apdiVar2 = alrc.f;
        alroVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (alrc) objJ);
        return akzzVarM.p();
    }

    public static defpackage.almz m(defpackage.alro alroVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LANG_ID;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.alnn.b;
        apdi apdiVar2 = defpackage.alrr.e;
        alroVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.alrr) objJ);
        return akzzVarM.p();
    }

    public static defpackage.almz n(defpackage.alro alroVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.alof.b;
        apdi apdiVar2 = defpackage.alsk.d;
        alroVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) alroVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.alsk) objJ);
        return akzzVarM.p();
    }

    public static defpackage.alsi o(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnm.i;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alnm alnmVar = (defpackage.alnm) objJ;
        akzx akzxVarM = defpackage.alql.a.m();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream((alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).d).map(new defpackage.ailg(12));
        j$.util.Objects.requireNonNull(akzxVarM);
        map.forEach(new defpackage.alkh(akzxVarM, 1));
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alql.c, (defpackage.alql) akzxVarM.p());
        return akzzVarM.p();
    }

    public static defpackage.alsi p() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alrs.b, defpackage.alrs.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi q() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alrt.b, defpackage.alrt.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi r() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alru.b, defpackage.alru.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi s() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alrv.b, defpackage.alrv.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi t() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alrw.b, defpackage.alrw.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi u() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alrz.b, defpackage.alrz.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi v() {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.alwp.b;
        akzz akzzVarM2 = defpackage.alwp.a.m();
        akzzVarM2.bV(defpackage.alxg.b, defpackage.alxg.a);
        akzzVarM.bV(apdiVar, akzzVarM2.p());
        return akzzVarM.p();
    }

    public static defpackage.alsi w() {
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.altc.b, defpackage.altc.a);
        return akzzVarM.p();
    }

    public static defpackage.alsi x(defpackage.almz almzVar) {
        return y(almzVar, defpackage.alma.a);
    }

    public static defpackage.alsi y(defpackage.almz almzVar, aihd aihdVar) {
        apdi apdiVar = defpackage.alnc.b;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alri alriVar = (defpackage.alri) objJ;
        akzx akzxVarP = alriVar.p();
        akzxVarP.u();
        ((defpackage.alri) akzxVarP.b).b().clear();
        akzxVarP.aP(M(j$.util.DesugarCollections.unmodifiableMap(alriVar.c), aihdVar));
        akzxVarP.u();
        ((defpackage.alri) akzxVarP.b).c().clear();
        akzxVarP.aQ(M(j$.util.DesugarCollections.unmodifiableMap(alriVar.d), aihdVar));
        defpackage.alri alriVar2 = (defpackage.alri) akzxVarP.p();
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.alri.e, alriVar2);
        return akzzVarM.p();
    }

    public static defpackage.alsi z(defpackage.almz almzVar) {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.alrm.d;
        apdi apdiVar2 = defpackage.alne.b;
        almzVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.alrm) objJ);
        return akzzVarM.p();
    }
}
