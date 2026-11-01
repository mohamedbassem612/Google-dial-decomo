package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class mni {
    private static volatile android.os.Handler a;

    public mni(defpackage.rlv rlvVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(aossVar, "lightweightScope");
        new defpackage.ahda((byte[]) null);
        new java.util.LinkedHashMap();
    }

    public static int A(udl udlVar) {
        int iOrdinal = udlVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        throw new defpackage.aois();
    }

    public static noj B(ysc yscVar) {
        int i;
        defpackage.aooh.f(yscVar, "<this>");
        switch (yscVar.a.ordinal()) {
            case 0:
                i = 3;
                break;
            case 1:
                i = 4;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 6;
                break;
            case 4:
                i = 7;
                break;
            case 5:
                i = 8;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 9;
                break;
            default:
                throw new defpackage.aois();
        }
        defpackage.akzx akzxVarM = noj.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        noj nojVar = akzxVarM.b;
        nojVar.c = defpackage.a.V(i);
        nojVar.b |= 1;
        boolean z = yscVar.b;
        akzxVarM.u();
        noj nojVar2 = akzxVarM.b;
        nojVar2.b |= 2;
        nojVar2.d = z;
        noj nojVarP = akzxVarM.r();
        defpackage.aooh.e(nojVarP, "build(...)");
        return nojVarP;
    }

    public static boolean C(defpackage.nog nogVar) {
        defpackage.aooh.f(nogVar, "<this>");
        igp igpVar = nogVar.e;
        if (igpVar == null) {
            igpVar = igp.a;
        }
        defpackage.alat alatVar = igpVar.b;
        defpackage.aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
        if ((alatVar instanceof java.util.Collection) && alatVar.isEmpty()) {
            return true;
        }
        java.util.Iterator<E> it = alatVar.iterator();
        while (it.hasNext()) {
            if (!((igo) it.next()).e) {
                return false;
            }
        }
        return true;
    }

    public static boolean D(noh nohVar) {
        defpackage.aooh.f(nohVar, "<this>");
        switch (nohVar.ordinal()) {
            case 0:
            case 1:
            case 4:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                return false;
            case 2:
            case 3:
            case 5:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                return true;
            default:
                throw new defpackage.aois();
        }
    }

    public static void E(nna nnaVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1367520720);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(nnaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.bvo.b(defpackage.azm.c(defpackage.cmw.c, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-356510005, new kmh(nnaVar, 18), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(nnaVar, i, 7);
        }
    }

    public static njt F(java.lang.String str) {
        java.lang.Object next;
        defpackage.aooh.f(str, "labelString");
        java.lang.String string = defpackage.aoov.x(str).toString();
        if (string.length() == 0 || defpackage.aoov.s(string, "N/A", true) || defpackage.aoov.s(string, "None", true)) {
            return njt.l;
        }
        java.lang.String string2 = defpackage.aoov.x(defpackage.aoov.z(string, "Priority:")).toString();
        defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) njt.m);
        while (true) {
            if (!aojlVar.hasNext()) {
                next = null;
                break;
            }
            next = aojlVar.next();
            njt njtVar = (njt) next;
            if (njtVar != njt.l) {
                java.lang.String str2 = njtVar.n;
                if (defpackage.aoov.G(string2, defpackage.aoov.x(defpackage.aoov.z(str2, "Priority:")).toString(), true) || defpackage.aoov.s(defpackage.aoov.x(defpackage.aoov.z(str2, "Priority:")).toString(), string2, true)) {
                    break;
                }
            }
        }
        njt njtVar2 = (njt) next;
        if (njtVar2 != null) {
            return njtVar2;
        }
        if (defpackage.aoov.G(string2, "delivery", true) || defpackage.aoov.G(string2, "package", true) || defpackage.aoov.G(string2, "fedex", true) || defpackage.aoov.G(string2, "ups", true)) {
            return njt.c;
        }
        return (defpackage.aoov.G(string2, "doctor", true) || defpackage.aoov.G(string2, "hospital", true) || defpackage.aoov.G(string2, "medical", true)) ? njt.b : njt.l;
    }

    public static int H(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 6 ? 0 : 8;
        }
        return 4;
    }

    public static /* synthetic */ nwj I(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj J(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj K(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj L(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj M(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj N(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ npw O(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw P(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw Q(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ vk R(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk S(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk T(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk U(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk V(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk W(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk X(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk Y(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk Z(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ npw aA(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw aB(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw aC(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ nwj aD(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj aE(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static void aF(defpackage.cmw cmwVar, java.util.List list, int i, defpackage.aonj aonjVar, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.cav cavVar, int i2) {
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.aooh.f(list, "entries");
        defpackage.aooh.f(aonjVar, "onIndexSelected");
        defpackage.cav cavVarB = cavVar.b(-872917908);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != cavVarB.D(aomyVar2) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            if (list.size() < 2) {
                throw new java.lang.IllegalArgumentException("Expected 2 or more entries, found: " + list.size());
            }
            if (i < 0 || i >= list.size()) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Invalid selectedIndex: "));
            }
            int i4 = i3 & 458752;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 131072 || objR == defpackage.cau.a) {
                objR = new mhq(aomyVar2, (defpackage.aoln) null, 3);
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(aojhVar, (defpackage.aonn) objR, cavVarB);
            defpackage.cja cjaVarJ = defpackage.cfo.j(1409342955, new biu(i, list, cmtVar, aomyVar, aonjVar, 16), cavVarB);
            cavVar2 = cavVarB;
            defpackage.gus.aG(false, false, cjaVarJ, cavVar2, 384, 3);
            cmwVar2 = cmtVar;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqf(cmwVar2, list, i, aonjVar, aomyVar, aomyVar2, i2, 4);
        }
    }

    public static miu aG(miv mivVar, miy miyVar, boolean z) {
        defpackage.akzx akzxVarM = miu.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        miu miuVar = akzxVarM.b;
        miuVar.c = mivVar.g;
        miuVar.b |= 1;
        akzxVarM.u();
        miu miuVar2 = akzxVarM.b;
        miuVar2.h = miyVar.g;
        miuVar2.b |= 32;
        if (z && (mivVar == miv.b || mivVar == miv.d)) {
            akzxVarM.u();
            miu miuVar3 = akzxVarM.b;
            miuVar3.b |= 8;
            miuVar3.f = 2131231083;
            akzxVarM.u();
            miu miuVar4 = akzxVarM.b;
            miuVar4.b |= 16;
            miuVar4.g = 2132018281;
        }
        miu miuVarP = akzxVarM.r();
        defpackage.aooh.e(miuVarP, "build(...)");
        return miuVarP;
    }

    public static defpackage.mih aH(android.content.Context context) {
        return (defpackage.mih) defpackage.agab.aH(context, defpackage.mih.class);
    }

    public static defpackage.mhc aI(java.lang.Object obj) {
        j$.util.List listAY;
        j$.util.Objects.checkIndex(0, 11);
        if (obj != null) {
            if (obj instanceof java.lang.Boolean) {
                return defpackage.gus.ax(((java.lang.Boolean) obj).booleanValue());
            }
            if (obj instanceof java.lang.Integer) {
                return defpackage.gus.av(((java.lang.Number) obj).intValue());
            }
            if (obj instanceof java.lang.Long) {
                return defpackage.gus.av(((java.lang.Number) obj).longValue());
            }
            if (obj instanceof java.lang.Double) {
                return defpackage.gus.at((float) ((java.lang.Number) obj).doubleValue());
            }
            if (obj instanceof java.lang.String) {
                return defpackage.gus.aw((java.lang.String) obj);
            }
            if (obj instanceof android.os.PersistableBundle) {
                android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) obj;
                java.util.Set<java.lang.String> setKeySet = persistableBundle.keySet();
                defpackage.aooh.e(setKeySet, "keySet(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(setKeySet, 10));
                for (java.lang.String str : setKeySet) {
                    defpackage.aooh.c(str);
                    defpackage.mhc mhcVarAI = aI(persistableBundle.get(str));
                    defpackage.aooh.f(str, "key");
                    defpackage.aooh.f(mhcVarAI, "value");
                    arrayList.add(new pgi(str, mhcVarAI));
                }
                defpackage.aify<pgi> aifyVarBv = defpackage.ahvr.bv(arrayList);
                defpackage.aooh.f(aifyVarBv, "entries");
                defpackage.akzx akzxVarM = defpackage.mhb.a.m();
                defpackage.aooh.e(akzxVarM, "newBuilder(...)");
                for (pgi pgiVar : aifyVarBv) {
                    java.lang.Object obj2 = pgiVar.b;
                    java.lang.Object obj3 = pgiVar.a;
                    j$.util.Objects.requireNonNull(obj2);
                    j$.util.Objects.requireNonNull(obj3);
                    akzxVarM.u();
                    defpackage.mhb mhbVar = (defpackage.mhb) akzxVarM.b;
                    defpackage.albe albeVar = mhbVar.b;
                    if (!albeVar.b) {
                        mhbVar.b = albeVar.a();
                    }
                    mhbVar.b.put(obj2, obj3);
                }
                defpackage.akzx akzxVarM2 = defpackage.mhc.a.m();
                akzxVarM2.u();
                defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM2.b;
                defpackage.mhb mhbVar2 = (defpackage.mhb) akzxVarM.r();
                j$.util.Objects.requireNonNull(mhbVar2);
                mhcVar.c = mhbVar2;
                mhcVar.b = 7;
                defpackage.alad aladVarP = akzxVarM2.r();
                defpackage.aooh.e(aladVarP, "build(...)");
                return (defpackage.mhc) aladVarP;
            }
            if (obj instanceof int[]) {
                java.util.List listCS = defpackage.ajsz.cS((int[]) obj);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listCS, 10));
                java.util.Iterator it = listCS.iterator();
                while (it.hasNext()) {
                    arrayList2.add(aI(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue())));
                }
                return defpackage.gus.ay(defpackage.ahvr.bv(arrayList2));
            }
            if (obj instanceof long[]) {
                java.util.List listCT = defpackage.ajsz.cT((long[]) obj);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(listCT, 10));
                java.util.Iterator it2 = listCT.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(aI(java.lang.Long.valueOf(((java.lang.Number) it2.next()).longValue())));
                }
                return defpackage.gus.ay(defpackage.ahvr.bv(arrayList3));
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                if (length == 0) {
                    listAY = defpackage.aokc.a;
                } else if (length != 1) {
                    listAY = new java.util.ArrayList(length);
                    for (double d : dArr) {
                        listAY.add(java.lang.Double.valueOf(d));
                    }
                } else {
                    listAY = defpackage.ajsz.aY(java.lang.Double.valueOf(dArr[0]));
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(listAY, 10));
                java.util.Iterator it3 = listAY.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(aI(java.lang.Double.valueOf(((java.lang.Number) it3.next()).doubleValue())));
                }
                return defpackage.gus.ay(defpackage.ahvr.bv(arrayList4));
            }
            if (obj instanceof java.lang.Object[]) {
                java.util.List listCU = defpackage.ajsz.cU((java.lang.Object[]) obj);
                java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ajsz.bl(listCU, 10));
                java.util.Iterator it4 = listCU.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(aI(it4.next()));
                }
                return defpackage.gus.ay(defpackage.ahvr.bv(arrayList5));
            }
        }
        defpackage.mhc mhcVar2 = defpackage.mhc.a;
        defpackage.aooh.e(mhcVar2, "getDefaultInstance(...)");
        return mhcVar2;
    }

    public static mho aJ(defpackage.albh albhVar, mhn mhnVar) {
        defpackage.aooh.f(albhVar, "message");
        return new mhm(mhnVar, albhVar);
    }

    public static void aK(defpackage.mfv mfvVar, java.lang.Object obj) {
        defpackage.mhc mhcVar = defpackage.mhc.a;
        mfvVar.b(obj);
    }

    public static /* synthetic */ java.lang.String aL(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static /* synthetic */ long aM(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ java.lang.Object aN(java.lang.Object obj) {
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.ajcq aO(defpackage.aigf aigfVar) {
        if (aigfVar != null) {
            return new defpackage.ajcm(aigfVar);
        }
        defpackage.aooh.i("existingInfoMap");
        return defpackage.ajcm.a;
    }

    public static /* synthetic */ java.lang.Object aQ(java.lang.Object obj) {
        defpackage.dmy dmyVar = (defpackage.dmy) obj;
        return "'" + dmyVar.a() + "' " + dmyVar.c();
    }

    public static /* synthetic */ defpackage.aojh aS(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.SONIC_GRID_MODEL_FAILED_TO_LOAD;
        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aT(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.CONTACT_GRID_SUBSCRIBER_FAILURE;
        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aU(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.FAILED_TO_LOAD_BOUNCE_VIEWMODEL;
        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aV(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.EMERGENCY_VOICE_FRAGMENT_DATA_LOAD_ERROR;
        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aW(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
        ajniVar.c = defpackage.zar.TELECOM_ERROR;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aX(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.BOUNCE_NO_BUTTON_LISTENER_FOUND;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aY(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.IN_CALL_SERVICE_NOT_AVAILABLE;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aZ(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.BOUNCE_NO_VOICE_CONTROLLER_FOUND;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ vk aa(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk ab(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aonj, java.lang.Object] */
    public static j$.util.Optional ac(j$.util.Optional optional) {
        defpackage.aooh.f(optional, "<this>");
        nzu nzuVar = new nzu(new mws(10), 5);
        boolean zIsPresent = optional.isPresent();
        java.lang.Object obj = optional;
        if (true == zIsPresent) {
            java.lang.Object objA = nzuVar.a.a(optional.get());
            objA.getClass();
            obj = objA;
        }
        defpackage.aooh.e(obj, "flatMap(...)");
        return (j$.util.Optional) obj;
    }

    public static int ad(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                switch (i) {
                    case 1000:
                        return 1001;
                    case 1001:
                        return 1002;
                    case 1002:
                        return 1003;
                    case 1003:
                        return 1004;
                    case 1004:
                        return 1005;
                    default:
                        return 0;
                }
            }
        }
        return i2;
    }

    public static defpackage.nyd ae(android.content.Context context) {
        return (defpackage.nyd) defpackage.agab.aH(context, defpackage.nyd.class);
    }

    public static int af(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ nwj ag(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ nwj ah(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static ntf ai(java.lang.String str, java.lang.String str2, java.lang.String str3, rmy rmyVar, java.lang.Long l) {
        defpackage.aooh.f(str, "normalizedNumber");
        defpackage.aooh.f(str2, "countryIso");
        defpackage.aooh.f(str3, "phoneNumberTitle");
        defpackage.aooh.f(rmyVar, "reportingLocation");
        defpackage.akzx akzxVarM = nte.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.aooh.f(str, "value");
        akzxVarM.u();
        nte nteVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        nteVar.b |= 4;
        nteVar.e = str;
        defpackage.aooh.f(str2, "value");
        akzxVarM.u();
        nte nteVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        nteVar2.b |= 8;
        nteVar2.f = str2;
        defpackage.aooh.f(str3, "value");
        akzxVarM.u();
        nte nteVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        nteVar3.b |= 1;
        nteVar3.c = str3;
        akzxVarM.u();
        nte nteVar4 = akzxVarM.b;
        nteVar4.b |= 2;
        nteVar4.d = 2131428497;
        defpackage.aooh.f(rmyVar, "value");
        akzxVarM.u();
        nte nteVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(rmyVar);
        nteVar5.g = rmyVar;
        nteVar5.b |= 16;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVarM.u();
            nte nteVar6 = akzxVarM.b;
            nteVar6.b |= 32;
            nteVar6.h = jLongValue;
        }
        nte nteVarP = akzxVarM.r();
        defpackage.aooh.e(nteVarP, "build(...)");
        ntf ntfVar = new ntf();
        defpackage.amxr.g(ntfVar);
        defpackage.ahgl.b(ntfVar, nteVarP);
        return ntfVar;
    }

    public static nsm aj(nsr nsrVar) {
        defpackage.aooh.f(nsrVar, "<this>");
        nsq nsqVar = (nsq) nsrVar;
        if ((nsqVar.b & 8) == 0) {
            return null;
        }
        nsm nsmVar = nsqVar.f;
        return nsmVar == null ? nsm.a : nsmVar;
    }

    public static void ak(defpackage.ajwr ajwrVar, nth nthVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427970), new nti(nthVar, 1));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427972), new nti(nthVar, 0));
    }

    public static /* synthetic */ nwj al(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ npw am(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw an(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ nwj ao(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new nwj(akzxVar);
    }

    public static /* synthetic */ npw ap(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw aq(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static int ar(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    public static defpackage.mmy as(nsp nspVar) {
        nss nssVar;
        nsl nslVar;
        defpackage.aooh.f(nspVar, "<this>");
        vk vkVarZ = Z(defpackage.mmy.a.m());
        nsq nsqVar = nspVar.e;
        if (nsqVar == null) {
            nsqVar = nsq.a;
        }
        defpackage.aooh.e(nsqVar, "getData(...)");
        defpackage.aooh.f(nsqVar, "<this>");
        mmx mmxVar = null;
        if ((nsqVar.b & 2) != 0) {
            nssVar = nsqVar.d;
            if (nssVar == null) {
                nssVar = nss.a;
            }
        } else {
            nssVar = null;
        }
        if (nssVar != null) {
            java.lang.String str = nssVar.d;
            defpackage.aooh.e(str, "getTranscriptSnippet(...)");
            defpackage.aooh.f(str, "value");
            defpackage.akzx akzxVar = (defpackage.akzx) vkVarZ.a;
            akzxVar.u();
            defpackage.mmy mmyVar = (defpackage.mmy) akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            mmyVar.b |= 1;
            mmyVar.c = str;
            java.lang.String str2 = nssVar.e;
            defpackage.aooh.e(str2, "getFallbackSnippet(...)");
            defpackage.aooh.f(str2, "value");
            akzxVar.u();
            defpackage.mmy mmyVar2 = (defpackage.mmy) akzxVar.b;
            j$.util.Objects.requireNonNull(str2);
            mmyVar2.b |= 2;
            mmyVar2.d = str2;
            boolean z = nssVar.f;
            akzxVar.u();
            defpackage.mmy mmyVar3 = (defpackage.mmy) akzxVar.b;
            mmyVar3.b |= 4;
            mmyVar3.e = z;
            java.lang.String str3 = nssVar.c;
            defpackage.aooh.e(str3, "getTranscriptPath(...)");
            defpackage.aooh.f(str3, "value");
            akzxVar.u();
            defpackage.mmy mmyVar4 = (defpackage.mmy) akzxVar.b;
            j$.util.Objects.requireNonNull(str3);
            mmyVar4.b |= 16;
            mmyVar4.g = str3;
        }
        nsq nsqVar2 = nspVar.e;
        if (nsqVar2 == null) {
            nsqVar2 = nsq.a;
        }
        defpackage.aooh.e(nsqVar2, "getData(...)");
        defpackage.aooh.f(nsqVar2, "<this>");
        if ((nsqVar2.b & 4) != 0) {
            nslVar = nsqVar2.e;
            if (nslVar == null) {
                nslVar = nsl.a;
            }
        } else {
            nslVar = null;
        }
        if (nslVar != null) {
            java.lang.String str4 = nslVar.c;
            defpackage.aooh.e(str4, "getAudioPath(...)");
            defpackage.aooh.f(str4, "value");
            defpackage.akzx akzxVar2 = (defpackage.akzx) vkVarZ.a;
            akzxVar2.u();
            defpackage.mmy mmyVar5 = (defpackage.mmy) akzxVar2.b;
            j$.util.Objects.requireNonNull(str4);
            mmyVar5.b |= 8;
            mmyVar5.f = str4;
        }
        nsq nsqVar3 = nspVar.e;
        if (nsqVar3 == null) {
            nsqVar3 = nsq.a;
        }
        defpackage.aooh.e(nsqVar3, "getData(...)");
        nsm nsmVarAj = aj(nsqVar3);
        if (nsmVarAj != null) {
            if ((nsmVarAj.b & 4) != 0) {
                boolean z2 = nsmVarAj.e;
                defpackage.akzx akzxVar3 = (defpackage.akzx) vkVarZ.a;
                akzxVar3.u();
                defpackage.mmy mmyVar6 = (defpackage.mmy) akzxVar3.b;
                mmyVar6.b |= 32;
                mmyVar6.h = z2;
            }
            if ((nsmVarAj.b & 8) != 0) {
                java.lang.String str5 = nsmVarAj.f;
                defpackage.aooh.e(str5, "getUniqueCallId(...)");
                defpackage.aooh.f(str5, "value");
                defpackage.akzx akzxVar4 = (defpackage.akzx) vkVarZ.a;
                akzxVar4.u();
                defpackage.mmy mmyVar7 = (defpackage.mmy) akzxVar4.b;
                j$.util.Objects.requireNonNull(str5);
                mmyVar7.b |= 64;
                mmyVar7.i = str5;
            }
            if ((nsmVarAj.b & 16) != 0) {
                boolean z3 = nsmVarAj.g;
                defpackage.akzx akzxVar5 = (defpackage.akzx) vkVarZ.a;
                akzxVar5.u();
                defpackage.mmy mmyVar8 = (defpackage.mmy) akzxVar5.b;
                mmyVar8.b |= 128;
                mmyVar8.j = z3;
            }
            if ((nsmVarAj.b & 64) != 0) {
                int iAR = defpackage.a.aR(nsmVarAj.i);
                if (iAR == 0) {
                    iAR = 1;
                }
                defpackage.akzx akzxVar6 = (defpackage.akzx) vkVarZ.a;
                akzxVar6.u();
                defpackage.mmy mmyVar9 = (defpackage.mmy) akzxVar6.b;
                mmyVar9.k = defpackage.a.T(iAR);
                mmyVar9.b |= 256;
            }
            if ((nsmVarAj.b & 128) != 0) {
                boolean z4 = nsmVarAj.j;
                defpackage.akzx akzxVar7 = (defpackage.akzx) vkVarZ.a;
                akzxVar7.u();
                defpackage.mmy mmyVar10 = (defpackage.mmy) akzxVar7.b;
                mmyVar10.b |= 512;
                mmyVar10.l = z4;
            }
            if ((nsmVarAj.b & 1024) != 0) {
                boolean z5 = nsmVarAj.m;
                defpackage.akzx akzxVar8 = (defpackage.akzx) vkVarZ.a;
                akzxVar8.u();
                defpackage.mmy mmyVar11 = (defpackage.mmy) akzxVar8.b;
                mmyVar11.b |= 1024;
                mmyVar11.m = z5;
            }
            if ((nsmVarAj.b & 2048) != 0) {
                int iAR2 = defpackage.a.aR(nsmVarAj.n);
                int i = iAR2 != 0 ? iAR2 : 1;
                defpackage.akzx akzxVar9 = (defpackage.akzx) vkVarZ.a;
                akzxVar9.u();
                defpackage.mmy mmyVar12 = (defpackage.mmy) akzxVar9.b;
                mmyVar12.n = defpackage.a.T(i);
                mmyVar12.b |= 2048;
            }
            if ((nsmVarAj.b & 8192) != 0 && (mmxVar = nsmVarAj.p) == null) {
                mmxVar = mmx.a;
            }
            if (mmxVar != null) {
                defpackage.akzx akzxVar10 = (defpackage.akzx) vkVarZ.a;
                akzxVar10.u();
                defpackage.mmy mmyVar13 = (defpackage.mmy) akzxVar10.b;
                j$.util.Objects.requireNonNull(mmxVar);
                mmyVar13.o = mmxVar;
                mmyVar13.b |= 4096;
            }
        }
        return vkVarZ.L();
    }

    public static /* synthetic */ npw au(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw av(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static /* synthetic */ npw aw(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static alwm ax(mza mzaVar) {
        defpackage.akzx akzxVarM = alwm.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        mzb mzbVarB = mzb.b(mzaVar.b);
        if (mzbVarB == null) {
            mzbVarB = mzb.e;
        }
        int iAy = ay(mzbVarB);
        akzxVarM.u();
        alwm alwmVar = akzxVarM.b;
        alwmVar.c = iAy - 1;
        alwmVar.b |= 1;
        alwm alwmVarP = akzxVarM.r();
        defpackage.aooh.e(alwmVarP, "build(...)");
        return alwmVarP;
    }

    public static int ay(mzb mzbVar) {
        int iOrdinal = mzbVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        int i = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 3;
            }
            i = 4;
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new defpackage.aois();
                }
                return 1;
            }
        }
        return i;
    }

    public static /* synthetic */ npw az(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new npw(akzxVar);
    }

    public static void b(android.text.Editable editable) {
        defpackage.aooh.f(editable, "s");
        android.text.style.TtsSpan[] ttsSpanArr = (android.text.style.TtsSpan[]) editable.getSpans(0, editable.length(), android.text.style.TtsSpan.class);
        defpackage.aooh.c(ttsSpanArr);
        for (android.text.style.TtsSpan ttsSpan : ttsSpanArr) {
            editable.removeSpan(ttsSpan);
        }
        if (editable.length() != 0) {
            android.telephony.PhoneNumberUtils.addTtsSpan(editable, 0, editable.length());
        }
    }

    public static defpackage.lym bA(android.content.Context context) {
        return (defpackage.lym) defpackage.agab.aH(context, defpackage.lym.class);
    }

    public static zrx bB(zrx zrxVar, int i) {
        defpackage.aooh.f(zrxVar, "<this>");
        zoe zoeVarCi = defpackage.aehj.ci(zrxVar.L());
        uzx uzxVarCu = defpackage.aehj.cu(zoeVarCi.b().L());
        jhw jhwVarL = hmr.l(uzxVarCu.S().L());
        jhwVarL.C(11);
        uzxVarCu.V(jhwVarL.B());
        zoeVarCi.d(uzxVarCu.T());
        return zoeVarCi.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bC(defpackage.aw awVar, lyi lyiVar) throws afeb {
        defpackage.ahvr.e(awVar, lys.class, new kwp(lyiVar, 17));
        defpackage.ahvr.e(awVar, lyw.class, new kwp(lyiVar, 18));
    }

    public static /* synthetic */ defpackage.aojh bD(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.BEESLY_FALLBACK_DUE_TO_ERROR;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh bE(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.BEESLY_FAIL_TO_START_SESSION;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [aonj, java.lang.Object] */
    public static java.lang.String bF(tin tinVar, android.content.Context context) {
        defpackage.aooh.f(tinVar, "<this>");
        defpackage.aooh.f(context, "context");
        j$.util.Optional optionalBU = bU(context.getResources(), tinVar.b, tinVar.c);
        kdb kdbVar = new kdb(new mws(1), 14);
        if (true == optionalBU.isPresent()) {
            optionalBU = j$.util.Optional.ofNullable(defpackage.a.l(kdbVar.a, optionalBU.get()));
        }
        java.lang.Object objOrElse = optionalBU.orElse("");
        defpackage.aooh.e(objOrElse, "orElse(...)");
        return (java.lang.String) objOrElse;
    }

    public static /* synthetic */ int bG(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof lxi) {
            return 0;
        }
        return obj instanceof lwg ? 1 : -2;
    }

    public static boolean bH(java.lang.String str) {
        return lwf.b.contains(defpackage.aoov.C(str, '.', str));
    }

    public static boolean bI(java.lang.String str) {
        if (defpackage.aoov.ad(str, "contactPoints")) {
            return defpackage.aoov.r(str, "telephones", false) || defpackage.aoov.r(str, "telephone", false) || defpackage.aoov.G(str, "telephones[", false) || defpackage.aoov.G(str, "telephone[", false);
        }
        return false;
    }

    public static java.lang.String bJ(java.lang.String str) {
        defpackage.aooh.f(str, "<this>");
        java.lang.String strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber(str);
        return strNormalizeNumber != null ? strNormalizeNumber : str;
    }

    public static java.lang.Enum bK(android.content.Context context, java.lang.Enum[] enumArr, java.lang.String str) {
        return (java.lang.Enum) j$.util.DesugarArrays.stream(enumArr).filter(new lvq(context, str, 0)).reduce(new vfd(1)).orElseThrow();
    }

    public static java.lang.String bL(lvr lvrVar, android.content.Context context) {
        return context.getString(lvrVar.a());
    }

    public static android.telecom.PhoneAccountHandle bM(lvl lvlVar) {
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(lvlVar.c);
        if (componentNameUnflattenFromString == null) {
            return null;
        }
        byte[] bArrD = lvlVar.g.D();
        int length = bArrD.length;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArrD, 0, length);
        parcelObtain.setDataPosition(0);
        android.os.UserHandle userHandle = (android.os.UserHandle) parcelObtain.readParcelable(android.os.UserHandle.class.getClassLoader());
        parcelObtain.recycle();
        return new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, lvlVar.d, userHandle);
    }

    public static defpackage.akzx bN(java.util.Collection collection) {
        defpackage.akzx akzxVarM = lvm.a.m();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) it.next();
            defpackage.akzx akzxVarM2 = lvl.a.m();
            bO(akzxVarM2, phoneAccountHandle);
            akzxVarM.u();
            lvm lvmVar = akzxVarM.b;
            lvl lvlVarP = akzxVarM2.r();
            j$.util.Objects.requireNonNull(lvlVarP);
            lvmVar.b();
            lvmVar.g.add(lvlVarP);
        }
        return akzxVarM;
    }

    public static void bO(defpackage.akzx akzxVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        akzxVar.u();
        lvl lvlVar = akzxVar.b;
        lvl lvlVar2 = lvl.a;
        j$.util.Objects.requireNonNull(strFlattenToString);
        lvlVar.b |= 1;
        lvlVar.c = strFlattenToString;
        java.lang.String id = phoneAccountHandle.getId();
        akzxVar.u();
        lvl lvlVar3 = akzxVar.b;
        j$.util.Objects.requireNonNull(id);
        lvlVar3.b |= 2;
        lvlVar3.d = id;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeParcelable(phoneAccountHandle.getUserHandle(), 0);
        defpackage.akzc akzcVarU = defpackage.akzc.u(parcelObtain.marshall());
        akzxVar.u();
        lvl lvlVar4 = akzxVar.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        lvlVar4.b |= 16;
        lvlVar4.g = akzcVarU;
        parcelObtain.recycle();
    }

    public static /* synthetic */ vqf bP(defpackage.aoin aoinVar) {
        java.lang.Object objA = aoinVar.a();
        defpackage.aooh.e(objA, "get(...)");
        return abxl.G((abyf) objA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bQ(al alVar, pgi pgiVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new kwp(pgiVar, 16));
    }

    public static /* synthetic */ vk bR(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static /* synthetic */ vk bS(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vk(akzxVar, (char[]) null);
    }

    public static defpackage.lvi bT(android.content.Context context) {
        return (defpackage.lvi) defpackage.agab.aH(context, defpackage.lvi.class);
    }

    public static j$.util.Optional bU(android.content.res.Resources resources, int i, java.lang.CharSequence charSequence) {
        if (i == 0) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return j$.util.Optional.empty();
            }
            i = 0;
        }
        return j$.util.Optional.of(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i, charSequence));
    }

    public static void bV(android.widget.ImageView imageView, lut lutVar) {
        rkr rkrVar = new rkr(imageView.getContext());
        int i = true != lutVar.h ? 2 : 1;
        java.lang.String str = lutVar.d;
        if (android.text.TextUtils.isEmpty(str)) {
            rkrVar.b((java.lang.String) null, lutVar.c, i, lutVar.e);
        } else {
            rkrVar.b(lutVar.c, str, i, lutVar.e);
        }
        rkrVar.a = lutVar.f;
        float f = lutVar.g;
        defpackage.ahvr.bM(f >= -0.5f && f <= 0.5f);
        rkrVar.b = f;
        imageView.setImageDrawable(rkrVar);
    }

    public static int bW(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bX(defpackage.aw awVar, ltp ltpVar) throws afeb {
        defpackage.ahvr.e(awVar, ltm.class, new kwp(ltpVar, 15));
        defpackage.ahvr.e(awVar, ltn.class, new iya(12));
    }

    public static java.lang.String bY(ltj ltjVar) {
        defpackage.aooh.f(ltjVar, "verificationStateType");
        return ltjVar.d;
    }

    public static afqz bZ() {
        lqt lqtVar = new lqt();
        defpackage.amxr.g(lqtVar);
        return lqtVar;
    }

    public static /* synthetic */ defpackage.aojh ba(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.FERMAT_SESSION_START_OR_RESUME_FAILURE;
        ajniVar.c = defpackage.zar.UNKNOWN_ERROR;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh bb(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.DOBBY_ANSWER_CALL_FROM_NOT_SUPPORTED_STATE;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh bc(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.DOBBY_DECLINE_CALL_FROM_UNSUPPORTED_STATE;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ int bd(kpd kpdVar) {
        defpackage.aooh.f(kpdVar, "<this>");
        defpackage.alat alatVar = kpdVar.c.b;
        defpackage.aooh.e(alatVar, "getAsrResultsList(...)");
        java.util.Iterator<E> it = alatVar.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((kow) it.next()).d.length();
        }
        return length;
    }

    public static /* synthetic */ boolean be() {
        java.util.Locale locale = java.util.Locale.getDefault();
        defpackage.aooh.e(locale, "getDefault(...)");
        return android.text.TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    public static /* synthetic */ boolean bf(defpackage.iqm iqmVar) {
        if (iqmVar == null) {
            defpackage.aooh.i("<this>");
        }
        return iqmVar.b();
    }

    public static /* synthetic */ void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static /* synthetic */ boolean bh(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static /* synthetic */ defpackage.aojh bi(java.util.List list, defpackage.czb czbVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            czbVar.u((defpackage.czc) list.get(i), 0, 0, 0.0f);
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ long bj(float f, float f2) {
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static /* synthetic */ long bk(float f, float f2) {
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static /* synthetic */ long bl(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ long bm(long j, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ int bn(android.content.Context context) {
        if (context == null || android.os.Build.VERSION.SDK_INT < 31 || ac$.ExternalSyntheticApiModelOutline0.m(context.getResources().getConfiguration()) == Integer.MAX_VALUE) {
            return 0;
        }
        return ac$.ExternalSyntheticApiModelOutline0.m(context.getResources().getConfiguration());
    }

    public static /* synthetic */ boolean bo(int i) {
        return i == 2;
    }

    public static /* synthetic */ defpackage.aojh bp(defpackage.czc czcVar, defpackage.czb czbVar) {
        czbVar.s(czcVar, 0, 0, 0.0f);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ long bq(long j, float f) {
        float fMax = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static /* synthetic */ boolean br(android.view.KeyEvent keyEvent) {
        long jK = defpackage.un.k(keyEvent);
        return jK == defpackage.un.h(23) || jK == defpackage.un.h(66) || jK == defpackage.un.h(160) || jK == defpackage.un.h(62);
    }

    public static /* synthetic */ defpackage.aojh bs(java.util.List list, defpackage.czb czbVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            czbVar.s((defpackage.czc) list.get(i), 0, 0, 0.0f);
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ int bt(ajyt ajytVar) {
        int i;
        defpackage.aooh.f(ajytVar, "builder");
        if (ajytVar.d == null || !ajytVar.f) {
            throw new java.lang.AssertionError("FlatBuffers: endTable called without startTable");
        }
        ajytVar.e(0);
        int iC = ajytVar.c();
        int i2 = ajytVar.e;
        do {
            i2--;
            if (i2 < 0) {
                break;
            }
        } while (ajytVar.d[i2] == 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = ajytVar.d[i3];
            ajytVar.g((short) (i4 != 0 ? iC - i4 : 0));
        }
        ajytVar.g((short) (iC - ajytVar.h));
        ajytVar.g((short) ((i2 + 3) << 1));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= ajytVar.j) {
                i = 0;
                break;
            }
            int iCapacity = ajytVar.a.capacity() - ajytVar.i[i5];
            int i6 = ajytVar.b;
            short s = ajytVar.a.getShort(iCapacity);
            if (s == ajytVar.a.getShort(i6)) {
                int i7 = 2;
                while (true) {
                    if (i7 >= s) {
                        i = ajytVar.i[i5];
                        break loop2;
                    }
                    if (ajytVar.a.getShort(iCapacity + i7) != ajytVar.a.getShort(i6 + i7)) {
                        break;
                    }
                    i7 += 2;
                }
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = ajytVar.a.capacity() - iC;
            ajytVar.b = iCapacity2;
            ajytVar.a.putInt(iCapacity2, i - iC);
        } else {
            int i8 = ajytVar.j;
            int[] iArr = ajytVar.i;
            if (i8 == iArr.length) {
                ajytVar.i = java.util.Arrays.copyOf(iArr, i8 << 1);
            }
            int[] iArr2 = ajytVar.i;
            int i9 = ajytVar.j;
            ajytVar.j = i9 + 1;
            iArr2[i9] = ajytVar.c();
            java.nio.ByteBuffer byteBuffer = ajytVar.a;
            byteBuffer.putInt(byteBuffer.capacity() - iC, ajytVar.c() - iC);
        }
        ajytVar.f = false;
        return iC;
    }

    public static /* synthetic */ void bu(ajyt ajytVar, int i) {
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.o(0, i);
    }

    public static /* synthetic */ void bv(ajyt ajytVar, int i) {
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.o(1, i);
    }

    public static /* synthetic */ int bw(bcb bcbVar) {
        return (int) (bcbVar.o == defpackage.aso.a ? bcbVar.d() & 4294967295L : bcbVar.d() >> 32);
    }

    public static /* synthetic */ void bx(bem bemVar, int i) {
        int i2 = bemVar.a;
        if (i2 == -1) {
            i2 = 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            defpackage.beo beoVar = bemVar.c;
            defpackage.apkl apklVar = beoVar.f;
            if (apklVar != null) {
                java.util.List list = bemVar.b;
                defpackage.agxr agxrVar = beoVar.e;
                java.lang.Object obj = apklVar.b;
                if (obj instanceof defpackage.bcr) {
                }
                list.add(new bfa(apklVar, i4, agxrVar, (defpackage.aonj) null));
            }
        }
    }

    public static java.lang.Object by(kip kipVar, defpackage.lzj lzjVar) {
        defpackage.aooh.f(kipVar, "<this>");
        defpackage.aooh.f(lzjVar, "integration");
        defpackage.akzc akzcVar = (defpackage.akzc) j$.util.DesugarCollections.unmodifiableMap(kipVar.v).get(((defpackage.lzk) lzjVar.a()).f);
        if (akzcVar != null) {
            return lzjVar.d().a(akzcVar);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bz(al alVar, lyt lytVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new lyu(lytVar, 1));
        defpackage.ahvr.d(alVar, ahtf.class, new lyu(lytVar, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void c(al alVar, myv myvVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new iya(13));
        defpackage.ahvr.d(alVar, ahtf.class, new lyu(myvVar, 2));
    }

    public static float cA(android.content.Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static void cB(android.content.Context context, java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("", charSequence));
        if (android.os.Build.VERSION.SDK_INT < 33) {
            android.widget.Toast.makeText(context, context.getString(2132020589), 0).show();
        }
    }

    public static com.android.dialer.widget.emptycontentview.EmptyContentView cC(android.view.View view) {
        com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewInflate = ((android.view.ViewStub) view.findViewById(2131428111)).inflate();
        defpackage.aooh.d(emptyContentViewInflate, "null cannot be cast to non-null type com.android.dialer.widget.emptycontentview.EmptyContentView");
        return emptyContentViewInflate;
    }

    public static android.net.Uri cD() {
        android.net.Uri.Builder builderAppendPath;
        if ("".length() == 0) {
            builderAppendPath = android.provider.ContactsContract.Contacts.CONTENT_URI.buildUpon();
            defpackage.aooh.c(builderAppendPath);
        } else {
            builderAppendPath = android.provider.ContactsContract.Contacts.CONTENT_FILTER_URI.buildUpon().appendPath("");
            defpackage.aooh.c(builderAppendPath);
        }
        android.net.Uri uriBuild = builderAppendPath.appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
        defpackage.aooh.e(uriBuild, "build(...)");
        return uriBuild;
    }

    public static java.lang.String[] cE(defpackage.lvs lvsVar) {
        defpackage.aooh.f(lvsVar, "contactDisplayPreferences");
        lvo lvoVarA = lvsVar.a();
        if (lvoVarA != null) {
            int iOrdinal = lvoVarA.ordinal();
            if (iOrdinal == 0) {
                return lnv.a;
            }
            if (iOrdinal == 1) {
                return lnv.b;
            }
        }
        throw new java.lang.AssertionError("exhaustive switch when selecting contacts display order");
    }

    public static /* synthetic */ java.lang.String cF(int i) {
        if (i == 2) {
            return "UNSPECIFIED";
        }
        if (i == 3) {
            return "PASSED_TO_USER";
        }
        if (i == 4) {
            return "SILENCED_FOR_TELECOM_AUDIO_PROCESSING";
        }
        if (i != 5) {
            return i != 6 ? "UNRECOGNIZED" : "SILENCED_WITH_NO_TELECOM_AUDIO_PROCESSING";
        }
        return "REJECTED";
    }

    public static j$.util.OptionalInt cG(java.lang.Integer num) {
        return num == null ? j$.util.OptionalInt.empty() : j$.util.OptionalInt.of(num.intValue());
    }

    public static java.lang.Integer cH(j$.util.OptionalInt optionalInt) {
        if (optionalInt.isPresent()) {
            return java.lang.Integer.valueOf(optionalInt.getAsInt());
        }
        return null;
    }

    public static lgp cI(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return defpackage.alad.B(lgp.a, bArr, defpackage.akzq.a());
        } catch (defpackage.alaz e) {
            throw new java.lang.IllegalStateException("Unable to load conversation", e);
        }
    }

    public static byte[] cJ(lgp lgpVar) {
        if (lgpVar == null) {
            return null;
        }
        return lgpVar.i();
    }

    public static ljx cK(byte[] bArr) {
        ljx ljxVarB;
        try {
            if (bArr == null) {
                ljxVarB = ljx.a;
            } else {
                ljxVarB = defpackage.alad.B(ljx.a, bArr, defpackage.akzq.a());
            }
            return ljxVarB;
        } catch (defpackage.alaz e) {
            throw new java.lang.IllegalStateException("Unable to load call screen feedback data", e);
        }
    }

    public static byte[] cL(ljx ljxVar) {
        if (ljxVar == null) {
            return null;
        }
        return ljxVar.i();
    }

    public static void cM(defpackage.ajwr ajwrVar, llh llhVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427698), new lde(llhVar, 5, (byte[]) null));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427693), new lde(llhVar, 6, (byte[]) null));
    }

    public static /* synthetic */ oq cN(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oq(akzxVar);
    }

    public static /* synthetic */ oq cO(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oq(akzxVar);
    }

    public static /* synthetic */ oq cP(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oq(akzxVar);
    }

    public static defpackage.dji ca(java.lang.CharSequence charSequence) {
        defpackage.dks dksVar;
        defpackage.aooh.f(charSequence, "<this>");
        djf djfVar = new djf(charSequence.toString());
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            java.lang.Object[] spans = spanned.getSpans(0, charSequence.length(), java.lang.Object.class);
            defpackage.aooh.c(spans);
            for (java.lang.Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                defpackage.aooh.c(obj);
                j$.util.Objects.checkIndex(0, 4);
                defpackage.dks dksVar2 = null;
                if (obj != null) {
                    if (obj instanceof android.text.style.ForegroundColorSpan) {
                        dksVar2 = new defpackage.dks(defpackage.cfd.M(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()), 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65534);
                    } else if (obj instanceof android.text.style.StyleSpan) {
                        int style = ((android.text.style.StyleSpan) obj).getStyle();
                        if (style != 1) {
                            if (style == 2) {
                                dksVar = new defpackage.dks(0L, 0L, (defpackage.dnd) null, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65527);
                            } else if (style != 3) {
                                dksVar2 = new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65535);
                            } else {
                                dksVar = new defpackage.dks(0L, 0L, defpackage.dnd.g, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65523);
                            }
                            dksVar2 = dksVar;
                        } else {
                            dksVar2 = new defpackage.dks(0L, 0L, defpackage.dnd.g, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65531);
                        }
                    } else if (obj instanceof android.text.style.UnderlineSpan) {
                        dksVar2 = new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.b, (defpackage.crc) null, 61439);
                    }
                }
                if (dksVar2 != null) {
                    djfVar.e(dksVar2, spanStart, spanEnd);
                }
                if (obj instanceof android.text.style.TtsSpan) {
                    djfVar.c.add(new dje(new dla(charSequence.subSequence(spanStart, spanEnd).toString()), spanStart, spanEnd, ""));
                }
            }
        }
        return djfVar.c();
    }

    public static void cb(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(-834216752);
        if (cavVarB.H(i != 0, i & 1)) {
            defpackage.aaoo.W(defpackage.aehj.aL(abja.az, cavVarB), null, defpackage.den.x(defpackage.cmw.c, "menu_item_check_mark"), defpackage.den.ak(cavVarB).a, cavVarB, 432, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 1);
        }
    }

    public static void cc(java.lang.String str, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1085230431);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, cavVar2, i2 & 14, 24960, 241662);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(str, i, 2);
        }
    }

    public static void cd(int i, java.lang.String str, defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cav cavVar2;
        defpackage.aooh.f(str, "text");
        defpackage.aooh.f(aomyVar, "onClick");
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-110378810);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if (cavVarB.H((i3 & 9363) != 9362, i3 & 1)) {
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar, defpackage.azm.d(cmwVar, 1.0f), false, defpackage.den.am(cavVarB).a, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, null, defpackage.cfo.j(-1385404271, new oa(z, str, i, 6), cavVarB), cavVar2, 996);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abdz(i, str, aomyVar, cmwVar, z, i2, 1);
        }
    }

    public static void ce(defpackage.csx csxVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.csx csxVar2;
        long j;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-55182091);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(csxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.cmw cmwVarG = defpackage.azm.g(cmwVar, 40.0f);
            if (z) {
                cavVarB.u(1043032835);
                j = defpackage.den.ak(cavVarB).h;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(1043112133);
                j = defpackage.den.ak(cavVarB).F;
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.cmw cmwVarAY = defpackage.den.aY(defpackage.den.bn(cmwVarG, j, defpackage.bge.a), 8.0f);
            if (z) {
                cavVarB.u(1043304333);
                j2 = defpackage.den.ak(cavVarB).i;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(1043373432);
                j2 = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
            }
            csxVar2 = csxVar;
            defpackage.aaoo.W(csxVar2, null, cmwVarAY, j2, cavVarB, i4 & 14, 0);
        } else {
            csxVar2 = csxVar;
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) csxVar2, z, cmwVar2, i, 7);
        }
    }

    public static void cf(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1129006878);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.azm.d(cmwVar, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.den.am(cavVarB).e, true, 0, 1042431);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(2.0f), defpackage.cmh.j, cavVarB, 6);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarK);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(-706335816);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                lpu lpuVar = (lpu) it.next();
                cd(lpuVar.a, lpuVar.b, lpuVar.c, defpackage.azm.d(defpackage.cmw.c, 1.0f), lpuVar.d, cavVarB, 3072);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(list, cmwVar, i, 13);
        }
    }

    public static void cg(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-870518594);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            float f = 1.0f;
            defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.azm.d(cmwVar, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.den.am(cavVarB).e, true, 0, 1042431);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(2.0f), defpackage.cmh.j, cavVarB, 6);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarK);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(-701687850);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                lpq lpqVar = (lpq) it.next();
                ch(lpqVar.a, lpqVar.b, lpqVar.c, lpqVar.e, lpqVar.f, lpqVar.g, defpackage.azm.d(defpackage.cmw.c, f), lpqVar.d, cavVarB, 1572864);
                cbtVar = cbtVar;
                f = 1.0f;
            }
            defpackage.cbt cbtVar2 = cbtVar;
            cbtVar2.W(false);
            cbtVar2.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(list, cmwVar, i, 12);
        }
    }

    public static void ch(int i, java.lang.String str, java.lang.String str2, defpackage.aomy aomyVar, boolean z, boolean z2, defpackage.cmw cmwVar, java.lang.String str3, defpackage.cav cavVar, int i2) {
        int i3;
        boolean z3;
        defpackage.aooh.f(str, "text");
        defpackage.aooh.f(str2, "description");
        defpackage.aooh.f(aomyVar, "onClick");
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-2099785898);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.B(str2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            z3 = z2;
            i3 |= true != cavVarB.C(z3) ? 65536 : 131072;
        } else {
            z3 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != cavVarB.B(str3) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i3) != 4793490, i3 & 1)) {
            defpackage.bvo.d(aomyVar, defpackage.azm.d(cmwVar, 1.0f), z2, defpackage.den.am(cavVarB).a, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, null, defpackage.cfo.j(1005012705, new lpl(str2, str3, str, z3, i, z, aomyVar, 0), cavVarB), cavVarB, 992);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpf(i, str, str2, aomyVar, z, z2, cmwVar, str3, i2, 2);
        }
    }

    public static void ci(defpackage.csx csxVar, boolean z, boolean z2, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.csx csxVar2;
        long j;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1723118545);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(csxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z2) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            if (z && z2) {
                cavVarB.u(-24363369);
                j = defpackage.den.ak(cavVarB).h;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-24299943);
                j = defpackage.den.ak(cavVarB).F;
                ((defpackage.cbt) cavVarB).W(false);
            }
            if (z && z2) {
                cavVarB.u(-24203595);
                j2 = defpackage.den.ak(cavVarB).i;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-24138247);
                j2 = defpackage.den.ak(cavVarB).s;
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.cmw cmwVarAY = defpackage.den.aY(defpackage.den.bn(defpackage.azm.g(cmwVar, 40.0f), j, defpackage.bge.a), 8.0f);
            if (!z2) {
                cmwVarAY = cmwVarAY.a(defpackage.ru.o(cmwVar, 0.38f));
            }
            csxVar2 = csxVar;
            defpackage.aaoo.W(csxVar2, null, cmwVarAY, j2, cavVarB, i4 & 14, 0);
        } else {
            csxVar2 = csxVar;
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpm(csxVar2, z, z2, cmwVar2, i, 0);
        }
    }

    public static void cj(defpackage.aomy aomyVar, boolean z, boolean z2, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z3;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(678651974);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= true != cavVarB.C(z3) ? 128 : 256;
        } else {
            z3 = z2;
        }
        int i4 = i2 | 3072;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            cmwVar2 = defpackage.cmw.c;
            defpackage.cmw cmwVarAP = !z ? defpackage.aehj.aP(cmwVar2) : cmwVar2;
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAP);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar2, "menu_item_stop_button");
            defpackage.ayy ayyVar = acpl.a;
            defpackage.aaoo.ak(aomyVar, cmwVarX, z3, null, null, null, null, acpl.i(), lpr.a, cavVarB, (i4 & 14) | 805306416 | (i4 & 896), 376);
            cbtVar.W(true);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpm(aomyVar, z, z2, cmwVar2, i, 2);
        }
    }

    public static void ck(java.lang.String str, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        java.lang.String str2;
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1565064992);
        if (i3 == 0) {
            str2 = str;
            i2 = i | (true != cavVarB.B(str2) ? 2 : 4);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            cavVar2 = cavVarB;
            defpackage.abrz.k(str2, !z ? defpackage.ru.o(cmtVar, 0.38f) : cmtVar, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, cavVar2, i4 & 14, 24960, 241660);
            cmwVar2 = cmtVar;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) str, z, cmwVar2, i, 6);
        }
    }

    public static void cl(defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar, defpackage.aono aonoVar, defpackage.aono aonoVar2, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.aomy aomyVar3, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aono aonoVar3;
        defpackage.cav cavVar2;
        defpackage.aono aonoVar4 = aonoVar;
        defpackage.aooh.f(aonnVar, "headerContent");
        defpackage.aooh.f(aonoVar2, "expandedContent");
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.cav cavVarB = cavVar.b(-100118895);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonoVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonoVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 65536 : 131072;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D(aomyVar2) ? 4194304 : 8388608;
        }
        int i4 = i3 | 100663296;
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.D(aomyVar3) ? 268435456 : 536870912;
        }
        int i5 = i4;
        if (cavVarB.H((i5 & 306783379) != 306783378, i5 & 1)) {
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarN = defpackage.aga.n(defpackage.den.bv(100, 0, defpackage.abts.H(cavVarB).b.c, 2), 2);
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.agg aggVarO = defpackage.aga.o(defpackage.den.bv(100, 0, defpackage.abts.H(cavVarB).b.c, 2), 2);
            defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new kbz(19);
                cbtVar.ab(objR);
            }
            defpackage.agf agfVarD = defpackage.aga.d(almVarBv, (defpackage.aonj) objR);
            defpackage.abni abniVar4 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv2 = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new kbz(18);
                cbtVar.ab(objR2);
            }
            defpackage.agg aggVarG = defpackage.aga.g(almVarBv2, (defpackage.aonj) objR2);
            defpackage.abni abniVar5 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv3 = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                objR3 = new kbz(20);
                cbtVar.ab(objR3);
            }
            defpackage.agf agfVarD2 = defpackage.aga.d(almVarBv3, (defpackage.aonj) objR3);
            defpackage.abni abniVar6 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv4 = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj) {
                objR4 = new kbz(17);
                cbtVar.ab(objR4);
            }
            defpackage.agg aggVarG2 = defpackage.aga.g(almVarBv4, (defpackage.aonj) objR4);
            defpackage.abni abniVar7 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv5 = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.d, 2);
            defpackage.cmn cmnVar = defpackage.cmh.m;
            defpackage.agf agfVarI = defpackage.aga.i(almVarBv5, cmnVar, 12);
            defpackage.abni abniVar8 = defpackage.abts.H(cavVarB).a;
            defpackage.agg aggVarM = defpackage.aga.m(defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.d, 2), cmnVar, 12);
            defpackage.cmw cmwVarA = cmwVar.a(new ana((defpackage.kaw) null, true, (java.lang.String) null, (defpackage.dib) null, aomyVar, (java.lang.String) null, aomyVar2));
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar4 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar4);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf((i5 >> 6) & 14));
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zB = cavVarB.B(agfVarN) | cavVarB.B(agfVarD) | cavVarB.B(agfVarI) | cavVarB.B(aggVarO) | cavVarB.B(aggVarG) | cavVarB.B(agfVarD2) | cavVarB.B(aggVarG2) | cavVarB.B(aggVarM);
            java.lang.Object objR5 = cbtVar.R();
            if (zB || objR5 == obj) {
                objR5 = new lph(agfVarN, agfVarD, agfVarI, aggVarO, aggVarG, agfVarD2, aggVarG2, aggVarM);
                cbtVar.ab(objR5);
            }
            aonoVar4 = aonoVar;
            aonoVar3 = aonoVar2;
            cavVar2 = cavVarB;
            defpackage.uu.a(boolValueOf, null, (defpackage.aonj) objR5, null, "ExpandAnimation", null, defpackage.cfo.j(784397368, new afnn(aonoVar3, aonoVar4, aomyVar3, 1), cavVarB), cavVar2, ((i5 >> 3) & 14) | 1597440, 42);
            cbtVar.W(true);
        } else {
            aonoVar3 = aonoVar2;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpi(cmwVar, z, aonnVar, aonoVar4, aonoVar3, aomyVar, aomyVar2, aomyVar3, i, 0);
        }
    }

    public static void cm(java.lang.String str, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        java.lang.String str3;
        int i2;
        defpackage.cbt cbtVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-945792011);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != cavVarB.B(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmi cmiVar = defpackage.cmh.k;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVarB, 48);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            int i4 = i2;
            defpackage.bvt.b(str3, null, defpackage.den.ak(cavVarB).s, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).j, cavVarB, i2 & 14, 0, 130042);
            cavVarB = cavVarB;
            if (str2 == null || aomyVar == null) {
                cbtVar = cbtVar2;
                cavVarB.u(1229848919);
                cbtVar.W(false);
            } else {
                cavVarB.u(1229537555);
                defpackage.den.aR(defpackage.azm.g(cmtVar, 16.0f), cavVarB);
                defpackage.bvt.b(str2, defpackage.den.aZ(defpackage.den.bj(cmtVar, true, null, null, aomyVar), 16.0f, 8.0f), defpackage.den.ak(cavVarB).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).m, cavVarB, (i4 >> 3) & 14, 0, 131064);
                cavVarB = cavVarB;
                cbtVar = cbtVar2;
                cbtVar.W(false);
            }
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kko(str, str2, aomyVar, i, 15);
        }
    }

    public static void cn(java.lang.String str, defpackage.cmw cmwVar, java.lang.Integer num, java.lang.String str2, defpackage.aomy aomyVar, int i, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.aooh.f(str, "description");
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1332925570);
        if (i5 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & 384) == 0) {
            i6 |= true != cavVarB.B(num) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i6 |= true != cavVarB.B(str2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i6 |= true != cavVarB.D(aomyVar) ? 8192 : 16384;
        }
        int i7 = i6 | 196608;
        if (cavVarB.H((74899 & i7) != 74898, i7 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            long jB = ((defpackage.dgn) cavVarB.e(defpackage.dfo.o)).b();
            float fA = ((defpackage.dpf) cavVarB.e(defpackage.dfo.e)).a();
            float f = ((int) (jB >> 32)) / fA;
            float f2 = ((int) (jB & 4294967295L)) / fA;
            java.lang.Integer num2 = f2 < 240.0f ? null : num;
            if (f >= 600.0f || f > f2) {
                cavVarB.u(-2081238753);
                cp(str, cmtVar, num2, str2, aomyVar, cavVarB, i7 & 523390);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-2080977888);
                cq(str, cmtVar, num2, str2, aomyVar, cavVarB, i7 & 523390);
                ((defpackage.cbt) cavVarB).W(false);
            }
            cmwVar2 = cmtVar;
            i4 = 1;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            i4 = i;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqf(str, cmwVar2, num, str2, aomyVar, i4, i2, 3);
        }
    }

    public static void co(int i, defpackage.cmw cmwVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1918416338);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(0) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            hgt.q(defpackage.hcq.d(new hcj(i), cavVarB).b(), cmwVar, false, false, (hch) null, 0.0f, 1, 1, hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new android.graphics.PorterDuffColorFilter(defpackage.cfd.L(defpackage.den.ak(cavVarB).a), android.graphics.PorterDuff.Mode.SRC_ATOP), new java.lang.String[]{"**"}, cavVarB)}, cavVarB), (defpackage.cmj) null, (cwy) null, false, 0, cavVarB, (i3 & 112) | 1572864, (i3 >> 6) & 14, 0, 2087868);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(i, cmwVar, i2, 1);
        }
    }

    public static void cp(java.lang.String str, defpackage.cmw cmwVar, java.lang.Integer num, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-959132161);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str3) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(num) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(str4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.z(0) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            defpackage.cmw cmwVarAY = defpackage.den.aY(defpackage.azm.c(cmwVar, 1.0f), 16.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.n, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAY);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.azk azkVar = defpackage.azk.a;
            int i4 = i2;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarA = azkVar.a(cmtVar, 1.0f, true);
            defpackage.cmj cmjVar = defpackage.cmh.e;
            defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarA);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            if (num == null) {
                cavVarB.u(1859033414);
                z = false;
                cbtVar.W(false);
            } else {
                cavVarB.u(1859033415);
                co(num.intValue(), defpackage.den.aY(defpackage.azm.c(cmtVar, 1.0f), 24.0f), cavVarB, ((i4 >> 9) & 896) | 48);
                z = false;
                cbtVar.W(false);
            }
            cbtVar.W(true);
            defpackage.cmw cmwVarA2 = azkVar.a(cmtVar, 1.0f, true);
            defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar, z);
            int iM3 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi3 = cbtVar.ai();
            defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarA2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB2, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM3, aonnVar4);
            int i5 = i4 >> 6;
            int i6 = (i4 & 14) | (i5 & 112) | (i5 & 896);
            str3 = str;
            str4 = str2;
            cm(str3, str4, aomyVar, cavVarB, i6);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(str3, cmwVar, num, str4, aomyVar, i, 9);
        }
    }

    public static void cq(java.lang.String str, defpackage.cmw cmwVar, java.lang.Integer num, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z;
        float f;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        defpackage.aomy aomyVar2 = aomyVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1113165947);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str3) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(num) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(str4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.z(0) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.c(cmwVar, 1.0f), 16.0f, 0.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAZ);
            defpackage.aomy aomyVar3 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.awt awtVar = defpackage.awt.a;
            int i4 = i2;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarB = defpackage.azm.b(defpackage.azm.d(cmtVar, 1.0f), 0.56f);
            defpackage.cmj cmjVar = defpackage.cmh.b;
            defpackage.cmw cmwVarA = awtVar.a(cmwVarB, cmjVar);
            defpackage.cmj cmjVar2 = defpackage.cmh.h;
            defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar2, false);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarA);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB2, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            if (num == null) {
                cavVarB.u(1936354032);
                z = false;
                cbtVar.W(false);
                f = 1.0f;
            } else {
                z = false;
                cavVarB.u(1936354033);
                f = 1.0f;
                co(num.intValue(), rx.l(defpackage.azm.b(cmtVar, 0.8571428f), 1.0f, false), cavVarB, ((i4 >> 9) & 896) | 48);
                cbtVar.W(false);
            }
            cbtVar.W(true);
            defpackage.cmw cmwVarA2 = awtVar.a(defpackage.azm.b(defpackage.azm.d(cmtVar, f), 0.44f), cmjVar2);
            defpackage.cye cyeVarB3 = defpackage.awo.b(cmjVar, z);
            int iM3 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi3 = cbtVar.ai();
            defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarA2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB3, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM3, aonnVar4);
            int i5 = i4 >> 6;
            int i6 = (i4 & 14) | (i5 & 112) | (i5 & 896);
            str3 = str;
            str4 = str2;
            aomyVar2 = aomyVar;
            cm(str3, str4, aomyVar2, cavVarB, i6);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(str3, cmwVar, num, str4, aomyVar2, i, 10);
        }
    }

    public static abki cr(lpg lpgVar, defpackage.cav cavVar) {
        long jA = ((defpackage.lpz) cavVar.e(defpackage.lqa.b)).a(lpgVar.b);
        java.lang.String str = lpgVar.a;
        if (str.length() <= 0 || !java.lang.Character.isLetter(str.charAt(0))) {
            cavVar.u(-1373969212);
            cavVar.o();
            return new abkg((byte[]) null);
        }
        cavVar.u(-1374360990);
        char cCharAt = str.charAt(0);
        cavVar.u(-1374253854);
        int iL = defpackage.cfd.L(defpackage.abts.F(cavVar).b.b(defpackage.abng.c(jA, new float[3])));
        cavVar.o();
        abjt abjtVar = new abjt(cCharAt, new abjw(iL));
        cavVar.o();
        return abjtVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0177  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static void cs(java.lang.String str, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, boolean z2, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar3;
        boolean z7;
        defpackage.cdk cdkVarI;
        defpackage.cbt cbtVar;
        defpackage.aomy aomyVar2;
        int i9;
        defpackage.aooh.f(str, "titleText");
        defpackage.aooh.f(str2, "closeButtonDescription");
        defpackage.aooh.f(aomyVar, "onClose");
        defpackage.aooh.f(aonnVar, "bodyComposable");
        int i10 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1725741759);
        if (i10 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i4 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.C(z2)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((599187 & i8) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (cavVarB.H(z5, i8 & 1)) {
                if (i11 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                boolean z8 = z3 & z;
                boolean z9 = z2 & z4;
                defpackage.cmw cmwVarAR = defpackage.aehj.aR(cmwVar2, !z8, cavVarB);
                defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
                cbtVar = (defpackage.cbt) cavVarB;
                int iM = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi = cbtVar.ai();
                defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAR);
                aomyVar2 = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                defpackage.aonn aonnVar2 = defpackage.dam.e;
                defpackage.cev.c(cavVarB, cyeVarA, aonnVar2);
                defpackage.aonn aonnVar3 = defpackage.dam.d;
                defpackage.cev.c(cavVarB, cjeVarAi, aonnVar3);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                defpackage.aonn aonnVar4 = defpackage.dam.f;
                defpackage.cev.c(cavVarB, numValueOf, aonnVar4);
                defpackage.aonj aonjVar = defpackage.dam.g;
                defpackage.cev.b(cavVarB, aonjVar);
                defpackage.aonn aonnVar5 = defpackage.dam.c;
                defpackage.cev.c(cavVarB, cmwVarM, aonnVar5);
                defpackage.cmw cmwVar4 = cmwVar2;
                cu(str, str2, aomyVar, null, z9, cavVarB, (i8 & 1022) | ((i8 >> 3) & 57344));
                defpackage.cmw cmwVarK = defpackage.uu.k(defpackage.den.aZ(defpackage.cmw.c, 24.0f, 0.0f), defpackage.den.bc(24.0f, 0.0f, 24.0f, 0.0f, 10));
                defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
                int iM2 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi2 = cbtVar.ai();
                defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarK);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarB, aonnVar2);
                defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar3);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar4);
                defpackage.cev.b(cavVarB, aonjVar);
                defpackage.cev.c(cavVarB, cmwVarM2, aonnVar5);
                aonnVar.a(cavVarB, java.lang.Integer.valueOf((i8 >> 18) & 14));
                cbtVar.W(true);
                cbtVar.W(true);
                z6 = z9;
                cavVar2 = cavVarB;
                cmwVar3 = cmwVar4;
                z7 = z8;
            } else {
                cavVarB.s();
                z6 = z2;
                cavVar2 = cavVarB;
                cmwVar3 = cmwVar2;
                z7 = z;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new lpf(str, str2, aomyVar, cmwVar3, z7, z6, aonnVar, i, i2, 0);
            }
        }
        i3 |= 3072;
        cmwVar2 = cmwVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i3 |= i5;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != cavVarB.C(z2)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (true != cavVarB.D(aonnVar)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i3 |= i9;
        }
        i8 = i3;
        if ((599187 & i8) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (cavVarB.H(z5, i8 & 1)) {
            if (i11 != 0) {
                cmwVar2 = defpackage.cmw.c;
            }
            boolean z10 = z3 & z;
            boolean z11 = z2 & z4;
            defpackage.cmw cmwVarAR2 = defpackage.aehj.aR(cmwVar2, !z10, cavVarB);
            defpackage.cye cyeVarA2 = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
            cbtVar = (defpackage.cbt) cavVarB;
            int iM3 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi3 = cbtVar.ai();
            defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarAR2);
            aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar6 = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarA2, aonnVar6);
            defpackage.aonn aonnVar7 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar7);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM3);
            defpackage.aonn aonnVar8 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf2, aonnVar8);
            defpackage.aonj aonjVar2 = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar2);
            defpackage.aonn aonnVar9 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM3, aonnVar9);
            defpackage.cmw cmwVar5 = cmwVar2;
            cu(str, str2, aomyVar, null, z11, cavVarB, (i8 & 1022) | ((i8 >> 3) & 57344));
            defpackage.cmw cmwVarK2 = defpackage.uu.k(defpackage.den.aZ(defpackage.cmw.c, 24.0f, 0.0f), defpackage.den.bc(24.0f, 0.0f, 24.0f, 0.0f, 10));
            defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, false);
            int iM4 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi4 = cbtVar.ai();
            defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVarB, cmwVarK2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB2, aonnVar6);
            defpackage.cev.c(cavVarB, cjeVarAi4, aonnVar7);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM4), aonnVar8);
            defpackage.cev.b(cavVarB, aonjVar2);
            defpackage.cev.c(cavVarB, cmwVarM4, aonnVar9);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf((i8 >> 18) & 14));
            cbtVar.W(true);
            cbtVar.W(true);
            z6 = z11;
            cavVar2 = cavVarB;
            cmwVar3 = cmwVar5;
            z7 = z10;
        } else {
            cavVarB.s();
            z6 = z2;
            cavVar2 = cavVarB;
            cmwVar3 = cmwVar2;
            z7 = z;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpf(str, str2, aomyVar, cmwVar3, z7, z6, aonnVar, i, i2, 0);
        }
    }

    public static void ct(java.lang.String str, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        java.lang.String str2;
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1236593478);
        if (i3 == 0) {
            str2 = str;
            i2 = (true != cavVarB.B(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new coz();
                cbtVar.ab(objR);
            }
            coz cozVar = (coz) objR;
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar, "bottom_sheet_title");
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new kbz(16);
                cbtVar.ab(objR2);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmwVarX, false, (defpackage.aonj) objR2);
            if (z) {
                cmwVarB = cmwVarB.a(aaf.l(rx.B(defpackage.cmw.c, cozVar), true, (defpackage.kaw) null));
            }
            int i4 = i2 & 14;
            java.lang.String str3 = str2;
            defpackage.abrz.k(str3, cmwVarB, defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).h, cavVarB, i4, 24960, 110584);
            cavVar2 = cavVarB;
            if (z) {
                cavVar2.u(1422344057);
                defpackage.aojh aojhVar = defpackage.aojh.a;
                java.lang.Object objR3 = cbtVar.R();
                if (objR3 == obj) {
                    objR3 = new jrb(cozVar, (defpackage.aoln) null, 13);
                    cbtVar.ab(objR3);
                }
                defpackage.cbp.g(aojhVar, (defpackage.aonn) objR3, cavVar2);
                cbtVar.W(false);
            } else {
                cavVar2.u(1422562204);
                cbtVar.W(false);
            }
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) str, z, cmwVar, i, 5);
        }
    }

    public static void cu(java.lang.String str, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.aooh.f(str, "titleText");
        defpackage.aooh.f(str2, "closeButtonDescription");
        defpackage.aooh.f(aomyVar, "onClose");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1729040266);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            cmwVar2 = defpackage.cmw.c;
            defpackage.cmw cmwVarM = defpackage.uu.m(defpackage.uu.k(defpackage.den.ba(defpackage.azm.d(defpackage.den.x(cmwVar2, "bottom_sheet_header"), 1.0f), 24.0f, 16.0f, 12.0f, 12.0f), new defpackage.azc(24.0f, 16.0f, 12.0f, 12.0f)), defpackage.uu.f(cavVarB));
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.n, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarM);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM2, defpackage.dam.c);
            ct(str, z, defpackage.azk.a.a(cmwVar2, 1.0f, true), cavVarB, (i4 & 14) | ((i4 >> 9) & 112));
            defpackage.den.aR(defpackage.azm.k(cmwVar2, 8.0f), cavVarB);
            cv(str2, aomyVar, null, cavVarB, (i4 >> 3) & 126);
            cbtVar.W(true);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(str, str2, aomyVar, cmwVar2, z, i, 1);
        }
    }

    public static void cv(java.lang.String str, defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-844430008);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            aomyVar2 = aomyVar;
            defpackage.aaoo.aC(aomyVar2, defpackage.den.x(cmwVar, "bottom_sheet_close_button"), false, null, null, null, defpackage.cfo.j(-185619482, new kmh(str, 6), cavVarB), cavVarB, ((i4 >> 3) & 14) | 1572864, 60);
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kko(str, aomyVar2, cmwVar2, i, 14, (byte[]) null);
        }
    }

    public static android.os.Handler cw() {
        if (a == null) {
            a = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return a;
    }

    public static void cx(java.lang.Runnable runnable) {
        cw().post(runnable);
    }

    public static defpackage.loq cy(android.content.Context context) {
        return (defpackage.loq) defpackage.agab.aH(context, defpackage.loq.class);
    }

    public static float cz(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f, f3));
    }

    public static java.lang.Integer d(nbw nbwVar) {
        int iOrdinal = nbwVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 2132018478;
            }
            if (iOrdinal == 2) {
                return 2132018477;
            }
            if (iOrdinal == 3) {
                return 2132018479;
            }
            if (iOrdinal != 4) {
                throw new defpackage.aois();
            }
        }
        return null;
    }

    public static void e(abko abkoVar, java.lang.String str, java.lang.String str2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1083018373);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.den.aY(cmtVar, 16.0f), 1.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(12.0f), defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.azk azkVar = defpackage.azk.a;
            int i4 = i2;
            defpackage.aehj.ao(abkoVar, defpackage.azm.g(cmtVar, 40.0f), null, cavVarB, (i4 & 14) | 48, 4);
            defpackage.cmw cmwVarA = azkVar.a(cmtVar, 1.0f, true);
            defpackage.cye cyeVarA2 = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarA);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA2, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, defpackage.azm.d(cmtVar, 1.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).v, cavVar2, ((i4 >> 3) & 14) | 48, 24960, 110584);
            int i5 = i4 >> 6;
            defpackage.abrz.k(str2, defpackage.azm.d(cmtVar, 1.0f), defpackage.den.ak(cavVar2).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVar2).k, cavVar2, (i5 & 14) | 48, 24960, 110584);
            cbtVar.W(true);
            defpackage.cer cerVarBb = defpackage.aehj.bb(aomyVar, cavVar2, (i5 & 112) | 6);
            defpackage.aehj.ba((java.lang.String) cerVarBb.a(), defpackage.den.x(defpackage.den.ba(cmtVar, 3.0f, 0.0f, 2.0f, 0.0f), "dobby_chronometer"), defpackage.den.ak(cavVar2).s, defpackage.den.an(cavVar2).j, cavVar2, 48);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(abkoVar, str, str2, aomyVar, i, 17);
        }
    }

    public static void f(mtk mtkVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(835402742);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(mtkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            int i4 = i2 & 14;
            if (((android.content.res.Configuration) cavVarB.e(defpackage.dep.a)).orientation == 2) {
                cavVarB.u(-1852253338);
                h(mtkVar, cavVarB, i4);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-1852209721);
                g(mtkVar, cavVarB, i4);
                ((defpackage.cbt) cavVarB).W(false);
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(mtkVar, i, 3);
        }
    }

    public static void g(mtk mtkVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(319637472);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(mtkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            mto mtoVar = mtkVar.a;
            if (mtoVar.e) {
                cavVarB.u(377577365);
                defpackage.aomy aomyVar = mtkVar.e;
                m(aomyVar, aomyVar, mtkVar.d, cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(377866626);
                ((defpackage.cbt) cavVarB).W(false);
            }
            if (mtoVar.f) {
                cavVarB.u(377952465);
                l(mtkVar.g, mtkVar.h, mtkVar.i, mtkVar.d, mtkVar.f, cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(378430082);
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.bvo.b(defpackage.azm.c(defpackage.cmw.c, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-1891598533, new kmh(mtkVar, 14), cavVarB), cavVarB, 122);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(mtkVar, i, 4);
        }
    }

    public static void h(mtk mtkVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-826601723);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(mtkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            mto mtoVar = mtkVar.a;
            if (mtoVar.e) {
                cavVarB.u(2050690608);
                defpackage.aomy aomyVar = mtkVar.e;
                m(aomyVar, aomyVar, mtkVar.d, cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(2050979869);
                ((defpackage.cbt) cavVarB).W(false);
            }
            if (mtoVar.f) {
                cavVarB.u(2051065708);
                l(mtkVar.g, mtkVar.h, mtkVar.i, mtkVar.d, mtkVar.f, cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(2051543325);
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.bvo.b(defpackage.azm.c(defpackage.cmw.c, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-655441142, new kmh(mtkVar, 13), cavVarB), cavVarB, 122);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(mtkVar, i, 5);
        }
    }

    public static void i(mtn mtnVar, defpackage.cav cavVar, int i) {
        int i2;
        long jM;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-23049704);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(mtnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVarB.u(-675923855);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.den.ba(cmtVar, 40.0f, 24.0f, 40.0f, 0.0f), 1.0f);
            boolean z = mtnVar.e;
            if (z) {
                cmwVarD = cmwVarD.a(defpackage.abts.Q(cmtVar, 5, true, false, null, cavVarB, 438, 252));
            }
            defpackage.cmw cmwVar = cmwVarD;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            if (z) {
                cavVarB.u(521392711);
                cbtVar.W(false);
                jM = defpackage.cfd.M(0);
            } else {
                cavVarB.u(521434251);
                jM = defpackage.den.ak(cavVarB).I;
                cbtVar.W(false);
            }
            defpackage.bvo.b(cmwVar, defpackage.den.am(cavVarB).e, jM, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-538567267, new mtl(mtnVar), cavVarB), cavVarB, 120);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(mtnVar, i, 6);
        }
    }

    public static void j(defpackage.aomy aomyVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        boolean z2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1004412519);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            aomyVar2 = aomyVar;
            defpackage.aaoo.aC(aomyVar2, defpackage.azm.e(cmwVar, 60.0f), z, defpackage.aaoo.aa(defpackage.abts.F(cavVarB).s, 0L, defpackage.cqg.h(defpackage.abts.F(cavVarB).s, 0.4f), 0L, cavVarB, 10), null, null, mtj.a, cavVarB, (i2 & 14) | 1572864 | ((i2 << 3) & 896), 48);
            z2 = z;
            cavVar2 = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            z2 = z;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) aomyVar2, z2, cmwVar, i, 9);
        }
    }

    public static void k(defpackage.aomy aomyVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        boolean z2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1929003662);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            aomyVar2 = aomyVar;
            defpackage.aaoo.aC(aomyVar2, defpackage.azm.e(cmwVar, 60.0f), z, defpackage.aaoo.aa(defpackage.abts.F(cavVarB).n, 0L, defpackage.cqg.h(defpackage.abts.F(cavVarB).n, 0.4f), 0L, cavVarB, 10), null, null, mtj.b, cavVarB, (i2 & 14) | 1572864 | ((i2 << 3) & 896), 48);
            z2 = z;
            cavVar2 = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            z2 = z;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) aomyVar2, z2, cmwVar, i, 8);
        }
    }

    public static void l(defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.aomy aomyVar3, defpackage.aomy aomyVar4, defpackage.aomy aomyVar5, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-641969773);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar5) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            java.lang.String strF = defpackage.dfa.f(2132018434, cavVarB);
            java.lang.String strF2 = defpackage.dfa.f(2132018430, cavVarB);
            java.lang.String strG = defpackage.dfa.g(2132018429, new java.lang.Object[]{strF, strF2}, cavVarB);
            int iW = defpackage.aoov.w(strG, strF, 0, false);
            int iW2 = defpackage.aoov.w(strG, strF2, 0, false);
            java.lang.String strF3 = defpackage.dfa.f(2132018433, cavVarB);
            abep[] abepVarArr = new abep[2];
            java.lang.String strF4 = defpackage.dfa.f(2132018435, cavVarB);
            int length = iW + strF.length();
            int i4 = i2 & 7168;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 2048 || objR == defpackage.cau.a) {
                objR = new lvd(aomyVar4, 8);
                cbtVar.ab(objR);
            }
            abepVarArr[0] = new abep(strF4, iW, length, strF, (defpackage.aonj) objR);
            java.lang.String strF5 = defpackage.dfa.f(2132018437, cavVarB);
            int length2 = iW2 + strF2.length();
            int i5 = i2 & 57344;
            java.lang.Object objR2 = cbtVar.R();
            if (i5 == 16384 || objR2 == defpackage.cau.a) {
                objR2 = new lvd(aomyVar5, 9);
                cbtVar.ab(objR2);
            }
            abepVarArr[1] = new abep(strF5, iW2, length2, strF2, (defpackage.aonj) objR2);
            defpackage.aehj.aT(new abix(strG, defpackage.ajsz.bb(abepVarArr), (abja) null, strF3, new abkq(defpackage.dfa.f(2132018432, cavVarB), true, aomyVar), new abkq(defpackage.dfa.f(android.R.string.cancel, cavVarB), true, aomyVar2), aomyVar3, 52), null, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(aomyVar, aomyVar2, aomyVar3, aomyVar4, aomyVar5, i, 12);
        }
    }

    public static void m(defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.aomy aomyVar3, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1459833106);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar3) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            java.lang.String strF = defpackage.dfa.f(2132018475, cavVarB);
            java.lang.String strF2 = defpackage.dfa.f(2132018434, cavVarB);
            java.lang.String strF3 = defpackage.dfa.f(2132018441, cavVarB);
            java.lang.String strF4 = defpackage.dfa.f(2132018435, cavVarB);
            int iW = defpackage.aoov.w(strF, strF2, 0, false);
            int iW2 = defpackage.aoov.w(strF, strF2, 0, false) + strF2.length();
            int i4 = i2 & 896;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 256 || objR == defpackage.cau.a) {
                objR = new lvd(aomyVar3, 11);
                cbtVar.ab(objR);
            }
            defpackage.aehj.aT(new abix(strF, defpackage.ajsz.aY(new abep(strF4, iW, iW2, strF2, (defpackage.aonj) objR)), (abja) null, strF3, new abkq(defpackage.dfa.f(2132018476, cavVarB), true, aomyVar), (abkq) null, aomyVar2, 180), null, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kko(aomyVar, aomyVar2, aomyVar3, i, 19);
        }
    }

    public static boolean n(defpackage.cav cavVar) {
        cavVar.u(-448965889);
        int iA = defpackage.dpi.a(defpackage.dpk.b(((defpackage.dpf) cavVar.e(defpackage.dfo.e)).dq(defpackage.dpy.l(((defpackage.dgn) cavVar.e(defpackage.dfo.o)).b()))), 600.0f);
        cavVar.o();
        return iA >= 0;
    }

    public static void o(mtk mtkVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(153842301);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(mtkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.cmw cmwVarBa = defpackage.den.ba(bac.a(defpackage.azm.d(cmwVar, 1.0f)), 24.0f, 24.0f, 24.0f, 32.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g(24.0f, defpackage.cmh.k), defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBa);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            mto mtoVar = mtkVar.a;
            defpackage.azk azkVar = defpackage.azk.a;
            boolean z = mtoVar.b != nbw.d;
            if (z) {
                cavVarB.u(-1839345001);
                j(mtkVar.b, mtoVar.g, azkVar.a(cmwVar, 1.0f, true), cavVarB, 0);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1839150879);
                cbtVar.W(false);
            }
            k(mtkVar.c, mtoVar.g, z ? azkVar.a(cmwVar, 1.0f, true) : defpackage.azm.d(cmwVar, 0.5f), cavVarB, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(mtkVar, cmwVar, i, 15);
        }
    }

    public static nvq p(noi noiVar) {
        int iOrdinal = noiVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return nvq.b;
            }
            if (iOrdinal == 2) {
                return nvq.c;
            }
            if (iOrdinal == 3) {
                return nvq.d;
            }
            if (iOrdinal != 4) {
                throw new defpackage.aois();
            }
        }
        return nvq.a;
    }

    public static int q(iht ihtVar) {
        switch (ihtVar.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 8;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1;
            default:
                throw new defpackage.aois();
        }
    }

    public static int r(mte mteVar) {
        defpackage.aooh.f(mteVar, "vote");
        int iOrdinal = mteVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        int i = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 3;
            }
            i = 4;
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new defpackage.aois();
                }
                return 1;
            }
        }
        return i;
    }

    public static int s(msz mszVar) {
        defpackage.aooh.f(mszVar, "voteReason");
        switch (mszVar.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            default:
                throw new defpackage.aois();
        }
    }

    public static int t(mzv mzvVar) {
        switch (mzvVar.ordinal()) {
            case 0:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            default:
                throw new defpackage.aois();
        }
    }

    public static int u(noh nohVar) {
        switch (nohVar.ordinal()) {
            case 0:
            case 10:
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            default:
                throw new defpackage.aois();
        }
    }

    public static int v(nfb nfbVar) {
        switch (nfbVar.ordinal()) {
            case 0:
            case 15:
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            default:
                throw new defpackage.aois();
        }
    }

    public static int w(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2 != 2 ? 4 : 3;
        }
        return 2;
    }

    public static int x(alxx alxxVar) {
        int iOrdinal = alxxVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        throw new defpackage.aois();
    }

    public static int y(defpackage.udj udjVar) {
        defpackage.aooh.f(udjVar, "spamStatus");
        int iOrdinal = udjVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        int i = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 3;
            }
            i = 4;
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return 5;
                }
                throw new defpackage.aois();
            }
        }
        return i;
    }

    public static int z(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object G(defpackage.okw okwVar, akld akldVar, defpackage.aoln aolnVar) {
        nbs nbsVar;
        mnq mnqVar;
        akld akldVar2;
        defpackage.okw okwVar2;
        int i;
        java.lang.Object objB;
        java.lang.Throwable thC;
        if (aolnVar instanceof nbs) {
            nbsVar = (nbs) aolnVar;
            int i2 = nbsVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nbsVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nbsVar = new nbs(this, aolnVar);
            }
        } else {
            nbsVar = new nbs(this, aolnVar);
        }
        java.lang.Object obj = nbsVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = nbsVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                i = nbsVar.a;
                mnqVar = nbsVar.e;
                akldVar2 = nbsVar.d;
                okwVar2 = nbsVar.f;
                defpackage.aooc.af(obj);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
                objB = ((defpackage.aoiw) obj).a;
            }
            thC = defpackage.aoiw.c(objB);
            if (thC == null) {
                ((defpackage.aimw) nbv.a.b().l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController$Companion", "logAuditRecordConsentedToAiGeneratedReplies$<anonymous>", 360, "DobbyInCallScreenButtonsController.kt")).v("Successfully logged Dobby AI generated replies consent audit record");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) nbv.a.d()).k(thC).l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController$Companion", "logAuditRecordConsentedToAiGeneratedReplies$<anonymous>", 366, "DobbyInCallScreenButtonsController.kt")).v("Failed to log Dobby AI generated replies consent audit record");
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        mnq mnqVar2 = mnq.a;
        nbsVar.f = okwVar;
        nbsVar.d = akldVar;
        nbsVar.e = mnqVar2;
        nbsVar.a = 1;
        nbsVar.c = 1;
        java.lang.Object objA = okwVar.a(nbsVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        mnqVar = mnqVar2;
        obj = objA;
        akldVar2 = akldVar;
        okwVar2 = okwVar;
        i = 1;
        boolean z = 1 == i;
        java.lang.String strA = oks.a(((oks) obj).a);
        defpackage.aooh.f(strA, "androidIdHexString");
        defpackage.aooh.f(akldVar2, "inCallDialogTextRecord");
        akle akleVarB = mnqVar.b(z, 2, strA, akldVar2);
        nbsVar.f = null;
        nbsVar.d = null;
        nbsVar.e = null;
        nbsVar.c = 2;
        objB = okwVar2.b(akleVarB, nbsVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        thC = defpackage.aoiw.c(objB);
        if (thC == null) {
            ((defpackage.aimw) nbv.a.b().l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController$Companion", "logAuditRecordConsentedToAiGeneratedReplies$<anonymous>", 360, "DobbyInCallScreenButtonsController.kt")).v("Successfully logged Dobby AI generated replies consent audit record");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) nbv.a.d()).k(thC).l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController$Companion", "logAuditRecordConsentedToAiGeneratedReplies$<anonymous>", 366, "DobbyInCallScreenButtonsController.kt")).v("Failed to log Dobby AI generated replies consent audit record");
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.ecx ecxVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        mmh mmhVar;
        defpackage.aoot aootVar;
        defpackage.aoot aootVar2;
        java.lang.Object obj;
        if (aolnVar instanceof mmh) {
            mmhVar = (mmh) aolnVar;
            int i = mmhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmhVar.b = i - Integer.MIN_VALUE;
            } else {
                mmhVar = new mmh(this, aolnVar);
            }
        } else {
            mmhVar = new mmh(this, aolnVar);
        }
        java.lang.Object obj2 = mmhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mmhVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            defpackage.aoot aootVar3 = new defpackage.aoot();
            defpackage.aoot aootVar4 = new defpackage.aoot();
            mmi mmiVar = new mmi(aootVar3, aootVar4, aonjVar, (defpackage.aoln) null);
            mmhVar.c = aootVar3;
            mmhVar.d = aootVar4;
            mmhVar.b = 1;
            if (ecxVar.a(mmiVar, mmhVar) == aoluVar) {
                return aoluVar;
            }
            aootVar = aootVar3;
            aootVar2 = aootVar4;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar2 = mmhVar.d;
            aootVar = mmhVar.c;
            defpackage.aooc.af(obj2);
        }
        java.lang.Object obj3 = aootVar.a;
        return java.lang.Boolean.valueOf((obj3 == null || (obj = aootVar2.a) == null || defpackage.aooh.n(obj3, obj)) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object at(defpackage.okw okwVar, boolean z, defpackage.aoln aolnVar) {
        noy noyVar;
        boolean z2;
        mnq mnqVar;
        java.lang.Object objB;
        java.lang.Throwable thC;
        if (aolnVar instanceof noy) {
            noyVar = (noy) aolnVar;
            int i = noyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                noyVar.c = i - Integer.MIN_VALUE;
            } else {
                noyVar = new noy(this, aolnVar);
            }
        } else {
            noyVar = new noy(this, aolnVar);
        }
        java.lang.Object obj = noyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = noyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = noyVar.a;
                mnq mnqVar2 = noyVar.d;
                defpackage.okw okwVar2 = noyVar.e;
                defpackage.aooc.af(obj);
                z2 = z3;
                mnqVar = mnqVar2;
                okwVar = okwVar2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
                objB = ((defpackage.aoiw) obj).a;
            }
            thC = defpackage.aoiw.c(objB);
            if (thC == null) {
                ((defpackage.aimw) npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$Companion", "updateConsentAuditRecord$<anonymous>", 436, "DobbySettingsService.kt")).v("Successfully logged Dobby AI generated replies consent audit record");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) npe.a.d()).k(thC).l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$Companion", "updateConsentAuditRecord$<anonymous>", 442, "DobbySettingsService.kt")).v("Failed to log Dobby AI generated replies consent audit record");
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        mnq mnqVar3 = mnq.a;
        noyVar.e = okwVar;
        noyVar.d = mnqVar3;
        noyVar.a = z;
        noyVar.c = 1;
        java.lang.Object objA = okwVar.a(noyVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        z2 = z;
        mnqVar = mnqVar3;
        obj = objA;
        boolean z4 = z2;
        java.lang.String strA = oks.a(((oks) obj).a);
        defpackage.aooh.f(strA, "androidIdHexString");
        ajyi ajyiVarF = akky.F(mnqVar.a(2132018372, 2132018371, 2132018368, 2132018369).L());
        ajyiVarF.ad();
        ajyiVarF.ac(2132018367);
        akle akleVarB = mnqVar.b(z4, 3, strA, ajyiVarF.ab());
        noyVar.e = null;
        noyVar.d = null;
        noyVar.c = 2;
        objB = okwVar.b(akleVarB, noyVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        thC = defpackage.aoiw.c(objB);
        if (thC == null) {
            ((defpackage.aimw) npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$Companion", "updateConsentAuditRecord$<anonymous>", 436, "DobbySettingsService.kt")).v("Successfully logged Dobby AI generated replies consent audit record");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) npe.a.d()).k(thC).l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$Companion", "updateConsentAuditRecord$<anonymous>", 442, "DobbySettingsService.kt")).v("Failed to log Dobby AI generated replies consent audit record");
        }
        return defpackage.aojh.a;
    }

    public mni(char[] cArr) {
    }

    public mni() {
    }

    public static /* synthetic */ void aP(java.lang.Object obj) {
    }
}
