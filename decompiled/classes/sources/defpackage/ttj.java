package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ttj {
    public ttj(defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
    }

    public static void A(defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1345491284);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(2132018670) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            aomyVar2 = aomyVar;
            defpackage.aaoo.P(defpackage.cfo.j(-2103447676, new xpf(1), cavVarB), aomyVar2, null, defpackage.uot.c, false, null, null, cavVarB, ((i2 << 3) & 112) | 3078, 500);
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(aomyVar2, i, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r6
      0x0035: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:8:0x0026, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public static unf B(unu unuVar) {
        int i;
        defpackage.aooh.f(unuVar, "<this>");
        java.lang.String str = unuVar.b;
        defpackage.aooh.e(str, "getNumber(...)");
        int i2 = unuVar.c;
        java.lang.String str2 = unuVar.d;
        defpackage.aooh.e(str2, "getLabel(...)");
        int iAb = defpackage.a.ab(unuVar.e);
        int i3 = 1;
        if (iAb == 0) {
            iAb = 1;
        }
        int i4 = iAb - 2;
        if (i4 != 0) {
            int i5 = 2;
            if (i4 == 1) {
                i = i5;
            } else if (i4 != 2) {
                i5 = 4;
                if (i4 != 3) {
                    if (i4 == 4) {
                        i3 = 5;
                    }
                    i = i3;
                } else {
                    i = i5;
                }
            } else {
                i = 3;
            }
        } else {
            i = i3;
        }
        return new unf(str, i2, str2, i, unuVar.f);
    }

    public static unu C(unf unfVar) {
        defpackage.aooh.f(unfVar, "<this>");
        defpackage.akzx akzxVarM = unu.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        java.lang.String str = unfVar.a;
        defpackage.aooh.f(str, "value");
        akzxVarM.u();
        unu unuVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        unuVar.b = str;
        akzxVarM.u();
        akzxVarM.b.c = unfVar.b;
        java.lang.String str2 = unfVar.c;
        defpackage.aooh.f(str2, "value");
        akzxVarM.u();
        unu unuVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        unuVar2.d = str2;
        int i = unfVar.e - 1;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 6 : 5;
            } else {
                i2 = 4;
            }
        }
        akzxVarM.u();
        akzxVarM.b.e = defpackage.a.R(i2);
        boolean z = unfVar.d;
        akzxVarM.u();
        akzxVarM.b.f = z;
        unu unuVarR = akzxVarM.r();
        defpackage.aooh.e(unuVarR, "build(...)");
        return unuVarR;
    }

    public static defpackage.unv D(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.tvn tvnVarAL = defpackage.aais.aL(defpackage.unv.a.m());
        defpackage.akzx akzxVar = (defpackage.akzx) tvnVarAL.a;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.unv) akzxVar.b).b);
        defpackage.aooh.e(listUnmodifiableList, "getFavoritesBarCachedItemsList(...)");
        new defpackage.alct(listUnmodifiableList);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            unp unpVar = (unp) it.next();
            if (unpVar == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.akzx akzxVarM = defpackage.unx.a.m();
            if (akzxVarM == null) {
                defpackage.aooh.i("builder");
            }
            long j = unpVar.a;
            akzxVarM.u();
            ((defpackage.unx) akzxVarM.b).c = j;
            int i = unpVar.b;
            akzxVarM.u();
            ((defpackage.unx) akzxVarM.b).d = i;
            java.lang.String str = unpVar.c;
            if (str == null) {
                defpackage.aooh.i("value");
            }
            akzxVarM.u();
            defpackage.unx unxVar = (defpackage.unx) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            unxVar.e = str;
            long j2 = unpVar.d;
            akzxVarM.u();
            ((defpackage.unx) akzxVarM.b).f = j2;
            java.lang.String str2 = unpVar.e;
            if (str2 == null) {
                defpackage.aooh.i("value");
            }
            akzxVarM.u();
            defpackage.unx unxVar2 = (defpackage.unx) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            unxVar2.g = str2;
            long j3 = unpVar.f;
            akzxVarM.u();
            ((defpackage.unx) akzxVarM.b).h = j3;
            java.lang.String str3 = unpVar.g;
            if (str3 != null) {
                akzxVarM.u();
                defpackage.unx unxVar3 = (defpackage.unx) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                unxVar3.b |= 1;
                unxVar3.i = str3;
            }
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.unx) akzxVarM.b).j);
            defpackage.aooh.e(listUnmodifiableList2, "getChannelsList(...)");
            new defpackage.alct(listUnmodifiableList2);
            java.util.List list2 = unpVar.h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C((unf) it2.next()));
            }
            akzxVarM.u();
            defpackage.unx unxVar4 = (defpackage.unx) akzxVarM.b;
            defpackage.alat alatVar = unxVar4.j;
            if (!alatVar.c()) {
                unxVar4.j = alatVar.d(alatVar.size() << 1);
            }
            defpackage.akyl.i(arrayList2, unxVar4.j);
            unf unfVar = unpVar.i;
            if (unfVar != null) {
                unu unuVarC = C(unfVar);
                if (unuVarC == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.unx unxVar5 = (defpackage.unx) akzxVarM.b;
                j$.util.Objects.requireNonNull(unuVarC);
                unxVar5.k = unuVarC;
                unxVar5.b |= 2;
            }
            defpackage.wgi wgiVar = unpVar.j;
            if (wgiVar == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.akzx akzxVarM2 = uny.a.m();
            if (akzxVarM2 == null) {
                defpackage.aooh.i("builder");
            }
            boolean z = wgiVar.c;
            akzxVarM2.u();
            uny unyVar = akzxVarM2.b;
            unyVar.b |= 1;
            unyVar.c = z;
            boolean z2 = wgiVar.d;
            akzxVarM2.u();
            uny unyVar2 = akzxVarM2.b;
            unyVar2.b |= 2;
            unyVar2.d = z2;
            uny unyVarR = akzxVarM2.r();
            defpackage.aooh.e(unyVarR, "build(...)");
            uny unyVar3 = unyVarR;
            if (unyVar3 == null) {
                defpackage.aooh.i("value");
            }
            akzxVarM.u();
            defpackage.unx unxVar6 = (defpackage.unx) akzxVarM.b;
            j$.util.Objects.requireNonNull(unyVar3);
            unxVar6.l = unyVar3;
            unxVar6.b |= 4;
            defpackage.alad aladVarR = akzxVarM.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            arrayList.add((defpackage.unx) aladVarR);
        }
        akzxVar.u();
        defpackage.unv unvVar = (defpackage.unv) akzxVar.b;
        defpackage.alat alatVar2 = unvVar.b;
        if (!alatVar2.c()) {
            unvVar.b = alatVar2.d(alatVar2.size() << 1);
        }
        defpackage.akyl.i(arrayList, unvVar.b);
        return tvnVarAL.s();
    }

    public static java.util.List E(defpackage.unv unvVar) {
        unf unfVarB;
        java.lang.String str = "<this>";
        if (unvVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.alat alatVar = unvVar.b;
        defpackage.aooh.e(alatVar, "getFavoritesBarCachedItemsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alatVar, 10));
        java.util.Iterator it = alatVar.iterator();
        while (it.hasNext()) {
            defpackage.unx unxVar = (defpackage.unx) it.next();
            if (unxVar == null) {
                defpackage.aooh.g();
                defpackage.aooh.i(str);
            }
            long j = unxVar.c;
            int i = unxVar.d;
            java.lang.String str2 = unxVar.e;
            defpackage.aooh.e(str2, "getName(...)");
            long j2 = unxVar.f;
            java.lang.String str3 = unxVar.g;
            defpackage.aooh.e(str3, "getLookUpKey(...)");
            long j3 = unxVar.h;
            java.lang.String str4 = (unxVar.b & 1) != 0 ? unxVar.i : null;
            defpackage.alat<unu> alatVar2 = unxVar.j;
            defpackage.aooh.e(alatVar2, "getChannelsList(...)");
            java.util.Iterator it2 = it;
            java.lang.String str5 = str;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(alatVar2, 10));
            for (unu unuVar : alatVar2) {
                if (unuVar == null) {
                    defpackage.aooh.g();
                }
                arrayList2.add(B(unuVar));
            }
            if ((unxVar.b & 2) != 0) {
                unu unuVar2 = unxVar.k;
                if (unuVar2 == null) {
                    unuVar2 = unu.a;
                }
                defpackage.aooh.e(unuVar2, "getDefaultChannel(...)");
                unfVarB = B(unuVar2);
            } else {
                unfVarB = null;
            }
            uny unyVar = unxVar.l;
            if (unyVar == null) {
                unyVar = uny.a;
            }
            defpackage.aooh.e(unyVar, "getWifiCallingIconsConfig(...)");
            if (unyVar == null) {
                defpackage.aooh.i(str5);
            }
            uzx uzxVarAc = defpackage.wsc.ac(defpackage.wgi.a.m());
            java.lang.Object obj = uzxVarAc.a;
            boolean z = unyVar.c;
            defpackage.akzx akzxVar = (defpackage.akzx) obj;
            akzxVar.u();
            defpackage.wgi wgiVar = (defpackage.wgi) akzxVar.b;
            wgiVar.b |= 1;
            wgiVar.c = z;
            boolean z2 = unyVar.d;
            akzxVar.u();
            defpackage.wgi wgiVar2 = (defpackage.wgi) akzxVar.b;
            wgiVar2.b |= 2;
            wgiVar2.d = z2;
            arrayList.add(new unp(j, i, str2, j2, str3, j3, str4, arrayList2, unfVarB, uzxVarAc.g()));
            str = str5;
            it = it2;
        }
        return arrayList;
    }

    public static defpackage.uio F(defpackage.udk udkVar) {
        uzx uzxVarCc = defpackage.wsc.cc(defpackage.udm.a.m());
        uzxVarCc.m(udkVar);
        return new defpackage.uio(uzxVarCc.k(), null, null, null, null, null, null, null, null, null, null);
    }

    public static defpackage.uin G(defpackage.udj udjVar) {
        return new defpackage.uin(udjVar, 0, null, new defpackage.uio(null, null, null, null, null, null, null, null, null, null, null), 2);
    }

    public static defpackage.uin H() {
        return G(defpackage.udj.SPAM_STATUS_NOT_SPAM);
    }

    public static defpackage.uin I() {
        return G(defpackage.udj.SPAM_STATUS_UNKNOWN);
    }

    public static java.lang.String J(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex == -1 || cursor.isNull(columnIndex)) ? "" : aguo.a(cursor, columnIndex);
    }

    public static defpackage.ahlc K(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8) {
        long jLongValue;
        defpackage.aooh.f(aoinVar, "BatchCapabilityPullerSyncletProvider");
        defpackage.aooh.f(aoinVar2, "syncletRunningFrequencyInHour");
        defpackage.aooh.f(aoinVar3, "enableCapRetrievingInEurope");
        defpackage.aooh.f(aoinVar4, "enableCapRetrievingInIndia");
        defpackage.aooh.f(aoinVar5, "enableCapRetrievingInOthers");
        defpackage.aooh.f(aoinVar6, "syncletRunningFrequencyInHourInEurope");
        defpackage.aooh.f(aoinVar7, "syncletRunningFrequencyInHourInIndia");
        defpackage.aooh.f(aoinVar8, "syncletRunningFrequencyInHourInOthers");
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        if (((java.lang.Boolean) aoinVar3.a()).booleanValue()) {
            java.lang.Object objA = aoinVar6.a();
            defpackage.aooh.e(objA, "get(...)");
            jLongValue = ((java.lang.Number) objA).longValue();
        } else if (((java.lang.Boolean) aoinVar4.a()).booleanValue()) {
            java.lang.Object objA2 = aoinVar7.a();
            defpackage.aooh.e(objA2, "get(...)");
            jLongValue = ((java.lang.Number) objA2).longValue();
        } else if (((java.lang.Boolean) aoinVar5.a()).booleanValue()) {
            java.lang.Object objA3 = aoinVar8.a();
            defpackage.aooh.e(objA3, "get(...)");
            jLongValue = ((java.lang.Number) objA3).longValue();
        } else {
            java.lang.Object objA4 = aoinVar2.a();
            defpackage.aooh.e(objA4, "get(...)");
            jLongValue = ((java.lang.Number) objA4).longValue();
        }
        ahkvVar.c(jLongValue, java.util.concurrent.TimeUnit.HOURS);
        return defpackage.agab.aB(ahkvVar.a(), aoinVar);
    }

    public static scx L(java.lang.String str) {
        if (str != null) {
            return java.lang.Enum.valueOf(scx.class, str);
        }
        return null;
    }

    public static j$.time.Instant M(java.lang.Long l) {
        if (l != null) {
            return j$.time.Instant.ofEpochMilli(l.longValue());
        }
        return null;
    }

    public static defpackage.rwt N(android.content.Context context) {
        return (defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class);
    }

    public static void O(defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        if (aomyVar == null) {
            defpackage.aooh.i("nextDrawCallback");
        }
        defpackage.cav cavVarB = cavVar.b(-446169809);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            android.view.View view = (android.view.View) cavVarB.e(defpackage.dep.f);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = ((defpackage.rue) defpackage.agab.aH(context, defpackage.rue.class)).ta();
                cbtVar.ab(objR);
            }
            defpackage.aogc aogcVar = (defpackage.aogc) objR;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            boolean zD = cavVarB.D(aogcVar) | cavVarB.D(view);
            boolean z = (i2 & 14) == 4;
            java.lang.Object objR2 = cbtVar.R();
            if ((zD || z) || objR2 == obj) {
                aomyVar2 = aomyVar;
                defpackage.srk srkVar = new defpackage.srk(aogcVar, view, aomyVar2, (defpackage.aoln) null, 1);
                cbtVar.ab(srkVar);
                objR2 = srkVar;
            } else {
                aomyVar2 = aomyVar;
            }
            defpackage.cbp.g(aojhVar, (defpackage.aonn) objR2, cavVarB);
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(aomyVar2, i, 1);
        }
    }

    public static boolean P() {
        return android.os.Build.VERSION.SDK_INT >= 37 && defpackage.a.D() >= 3700002;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void Q(defpackage.aw awVar, defpackage.rqi rqiVar) throws afeb {
        defpackage.ahvr.e(awVar, defpackage.rod.class, new defpackage.kbl(rqiVar, 2));
        defpackage.ahvr.e(awVar, defpackage.rqm.class, new defpackage.kbl(rqiVar, 3));
        defpackage.ahvr.e(awVar, defpackage.rqn.class, new defpackage.kbl(rqiVar, 4));
        defpackage.ahvr.e(awVar, defpackage.rqq.class, new defpackage.kbl(rqiVar, 5));
        defpackage.ahvr.e(awVar, defpackage.rqr.class, new defpackage.kbl(rqiVar, 6));
        defpackage.ahvr.e(awVar, defpackage.rqs.class, new defpackage.kbl(rqiVar, 7));
    }

    public static java.lang.String R(android.content.Intent intent) {
        java.lang.String schemeSpecificPart;
        defpackage.aooh.f(intent, "intent");
        android.net.Uri data = intent.getData();
        if (data == null || !defpackage.aooh.n(data.getScheme(), "tel")) {
            return "";
        }
        java.lang.String string = data.toString();
        defpackage.aooh.e(string, "toString(...)");
        if (defpackage.aoov.J(string, '#')) {
            java.lang.String string2 = data.toString();
            defpackage.aooh.e(string2, "toString(...)");
            schemeSpecificPart = string2.substring(4);
            defpackage.aooh.e(schemeSpecificPart, "substring(...)");
        } else {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        java.lang.String strConvertKeypadLettersToDigits = android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(android.telephony.PhoneNumberUtils.replaceUnicodeDigits(schemeSpecificPart));
        defpackage.aooh.e(strConvertKeypadLettersToDigits, "convertKeypadLettersToDigits(...)");
        return strConvertKeypadLettersToDigits;
    }

    public static boolean S(android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return false;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1173708363) {
            if (iHashCode != -1173171990 || !action.equals("android.intent.action.VIEW")) {
                return false;
            }
            android.net.Uri data = intent.getData();
            if (!defpackage.aooh.n(data != null ? data.getScheme() : null, "tel")) {
                return intent.getBooleanExtra("add_call_mode", false);
            }
        } else if (!action.equals("android.intent.action.DIAL")) {
            return false;
        }
        return true;
    }

    public static boolean T(android.content.Intent intent) {
        return j$.util.Objects.equals(intent.getAction(), "ACTION_SHOW_TAB") && intent.hasExtra("EXTRA_SHOW_TAB");
    }

    public static defpackage.akzx U(defpackage.ampq ampqVar) {
        defpackage.akzx akzxVarM = defpackage.amqo.a.m();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVarM.u();
        defpackage.amqo amqoVar = (defpackage.amqo) akzxVarM.b;
        amqoVar.b |= 4;
        amqoVar.e = epochMilli;
        akzxVarM.u();
        defpackage.amqo amqoVar2 = (defpackage.amqo) akzxVarM.b;
        j$.util.Objects.requireNonNull(ampqVar);
        amqoVar2.f = ampqVar;
        amqoVar2.b |= 8;
        return akzxVarM;
    }

    public static defpackage.akzx V(java.lang.String str, long j, defpackage.ampq ampqVar) {
        defpackage.akzx akzxVarU = U(ampqVar);
        akzxVarU.u();
        defpackage.amqo amqoVar = (defpackage.amqo) akzxVarU.b;
        defpackage.amqo amqoVar2 = defpackage.amqo.a;
        j$.util.Objects.requireNonNull(str);
        amqoVar.b |= 16;
        amqoVar.g = str;
        long epochMilli = j$.time.Instant.now().toEpochMilli() - j;
        akzxVarU.u();
        defpackage.amqo amqoVar3 = (defpackage.amqo) akzxVarU.b;
        amqoVar3.b |= 32;
        amqoVar3.h = epochMilli;
        return akzxVarU;
    }

    public static void W(defpackage.aais aaisVar, defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        if (aonnVar == null) {
            defpackage.aooh.i("onMove");
        }
        if (aomyVar == null) {
            defpackage.aooh.i("onDrop");
        }
        if (aomyVar2 == null) {
            defpackage.aooh.i("onRendered");
        }
        defpackage.cav cavVarB = cavVar.b(1448310732);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(aaisVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 1024 : 2048;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.C(z) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar3 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            j$.util.Objects.checkIndex(0, 4);
            if (aaisVar instanceof defpackage.uoy) {
                cavVarB.u(-310397637);
                cbtVar.W(false);
            } else {
                int i4 = 15;
                if (aaisVar instanceof uoz) {
                    int i5 = i3 & 7168;
                    cavVarB.u(-310265608);
                    java.lang.Object objR = cbtVar.R();
                    if (i5 == 2048 || objR == defpackage.cau.a) {
                        objR = new defpackage.sky(aomyVar2, i4);
                        cbtVar.ab(objR);
                    }
                    O((defpackage.aomy) objR, cavVarB, 0);
                    w(((uoz) aaisVar).a, null, cavVarB, 0);
                    cbtVar.W(false);
                } else {
                    if (!(aaisVar instanceof defpackage.uox)) {
                        cavVarB.u(-2088223532);
                        cbtVar.W(false);
                        throw new defpackage.aois();
                    }
                    int i6 = i3 & 7168;
                    cavVarB.u(-310053134);
                    java.lang.Object objR2 = cbtVar.R();
                    if (i6 == 2048 || objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.sky(aomyVar2, 16);
                        cbtVar.ab(objR2);
                    }
                    O((defpackage.aomy) objR2, cavVarB, 0);
                    p(z, defpackage.cfo.j(1268938422, new defpackage.ped(aaisVar, 10), cavVarB), cavVarB, ((i3 >> 15) & 14) | 48);
                    o(!((defpackage.uox) aaisVar).e && z, defpackage.cfo.j(-117124240, new defpackage.jai(aaisVar, aonnVar, aomyVar, 7, null), cavVarB), cavVarB, 48);
                    cbtVar.W(false);
                }
            }
            cbtVar.W(true);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bxp(aaisVar, aonnVar, aomyVar, aomyVar2, cmwVar2, z, i, 5);
        }
    }

    public static /* synthetic */ defpackage.ipc X(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static defpackage.rsr Y(java.util.List list) {
        defpackage.aooh.f(list, "numbers");
        return new defpackage.kaw("normalized_number").aF(list);
    }

    public static /* synthetic */ defpackage.ipc Z(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static defpackage.tkj a(ttk ttkVar) {
        defpackage.akzx akzxVarM = defpackage.tkj.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.alcf alcfVarAu = defpackage.aooc.au(ttkVar.a);
        defpackage.aooh.f(alcfVarAu, "value");
        akzxVarM.u();
        defpackage.tkj tkjVar = (defpackage.tkj) akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarAu);
        tkjVar.i = alcfVarAu;
        tkjVar.b |= 64;
        java.lang.String str = ttkVar.b;
        defpackage.aooh.f(str, "value");
        akzxVarM.u();
        defpackage.tkj tkjVar2 = (defpackage.tkj) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        tkjVar2.b |= 1;
        tkjVar2.c = str;
        akzxVarM.u();
        defpackage.tkj tkjVar3 = (defpackage.tkj) akzxVarM.b;
        int i = 2;
        tkjVar3.b |= 2;
        tkjVar3.d = true;
        akzxVarM.u();
        defpackage.tkj tkjVar4 = (defpackage.tkj) akzxVarM.b;
        tkjVar4.b |= 4;
        int i2 = ttkVar.d;
        tkjVar4.e = i2 == 1;
        tki tkiVarAd = ad(ttkVar.c);
        akzxVarM.u();
        defpackage.tkj tkjVar5 = (defpackage.tkj) akzxVarM.b;
        tkjVar5.f = tkiVarAd.a();
        tkjVar5.b |= 8;
        tki tkiVarAd2 = ad(i2);
        akzxVarM.u();
        defpackage.tkj tkjVar6 = (defpackage.tkj) akzxVarM.b;
        tkjVar6.g = tkiVarAd2.a();
        tkjVar6.b |= 16;
        tue tueVar = tue.a;
        tud tudVar = tud.a;
        int i3 = ttkVar.e - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                i = i3 != 2 ? 3 : 4;
            } else {
                i = 5;
            }
        }
        akzxVarM.u();
        defpackage.tkj tkjVar7 = (defpackage.tkj) akzxVarM.b;
        tkjVar7.h = defpackage.a.aT(i);
        tkjVar7.b |= 32;
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.tkj) aladVarR;
    }

    public static /* synthetic */ defpackage.ipc aa(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.ipc ab(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.ipc ac(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    private static tki ad(int i) {
        tue tueVar = tue.a;
        tud tudVar = tud.a;
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? tki.c : tki.b;
        }
        return tki.a;
    }

    private static defpackage.agf ae(defpackage.cav cavVar) {
        defpackage.abni abniVar = defpackage.abts.H(cavVar).a;
        return defpackage.aga.i(new defpackage.alm(300, 0, defpackage.abts.H(cavVar).b.a), defpackage.cmh.m, 8);
    }

    private static defpackage.agg af(defpackage.cav cavVar) {
        defpackage.abni abniVar = defpackage.abts.H(cavVar).a;
        defpackage.abni abniVar2 = defpackage.abts.H(cavVar).a;
        return defpackage.aga.m(new defpackage.alm(300, 150, defpackage.abts.H(cavVar).b.a), defpackage.cmh.m, 8);
    }

    public static int b(tud tudVar) {
        tue tueVar = tue.a;
        tud tudVar2 = tud.a;
        int iOrdinal = tudVar.ordinal();
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

    public static tud c(int i) {
        tue tueVar = tue.a;
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? tud.c : tud.b;
        }
        return tud.a;
    }

    public static java.lang.String d(tud tudVar) {
        defpackage.aooh.f(tudVar, "verdict");
        return tudVar.e;
    }

    public static java.lang.String e(tue tueVar) {
        defpackage.aooh.f(tueVar, "action");
        return tueVar.f;
    }

    public static tud f(java.lang.String str) {
        defpackage.aooh.f(str, "nameInStorage");
        tud tudVar = tud.a;
        defpackage.aooh.f(str, "nameInStorage");
        defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) tud.d);
        while (aojlVar.hasNext()) {
            tud tudVar2 = (tud) aojlVar.next();
            if (defpackage.aooh.n(tudVar2.e, str)) {
                return tudVar2;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static defpackage.uez g(android.content.Context context) {
        return (defpackage.uez) defpackage.agab.aH(context, defpackage.uez.class);
    }

    public static java.lang.String h() {
        int i = defpackage.airu.a;
        return airt.a.b(android.os.Build.DEVICE, java.nio.charset.StandardCharsets.UTF_8).toString();
    }

    public static /* synthetic */ defpackage.tvn i(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.tvn(akzxVar);
    }

    public static /* synthetic */ java.lang.String j(int i) {
        if (i == 1) {
            return "SPAM";
        }
        if (i == 2) {
            return "FAVORITE";
        }
        if (i == 3) {
            return "DEFAULT_CONTACT";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN" : "BUSINESS";
        }
        return "OTHER_CONTACT";
    }

    public static android.telecom.PhoneAccountHandle k(defpackage.vzi vziVar) {
        if (l(vziVar)) {
            return new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(vziVar.e), vziVar.f);
        }
        return null;
    }

    public static boolean l(defpackage.vzi vziVar) {
        int i = vziVar.b;
        return ((i & 8) == 0 || (i & 4) == 0 || vziVar.e.isEmpty() || vziVar.f.isEmpty()) ? false : true;
    }

    public static java.lang.Integer m(defpackage.ccp ccpVar) {
        return (java.lang.Integer) ccpVar.a();
    }

    public static void n(afe afeVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(967142765);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmj cmjVar = defpackage.cmh.i;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarJ = defpackage.aga.j(new defpackage.alm(250, 150, defpackage.abts.H(cavVarB).b.e), 0.0f, 0L, 6);
            defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
            defpackage.cmw cmwVarB = afeVar.b(cmtVar, agfVarJ, defpackage.aga.k(new defpackage.alm(250, 0, defpackage.abts.H(cavVarB).b.b), 0.0f, 0L, 6));
            defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarB);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonoVar.a(afeVar, cavVarB, java.lang.Integer.valueOf(i2 & 126));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(afeVar, aonoVar, i, 9, null);
        }
    }

    public static void o(boolean z, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1357791326);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            z2 = z;
            defpackage.den.bz(z2, null, ae(cavVarB), af(cavVarB), null, defpackage.cfo.j(1437392694, new defpackage.ped(aonoVar, 11), cavVarB), cavVarB, (i2 & 14) | 196608, 18);
        } else {
            z2 = z;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(z2, aonoVar, i, 12);
        }
    }

    public static void p(boolean z, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1312063836);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarA = defpackage.aga.n(new defpackage.alm(100, 0, defpackage.abts.H(cavVarB).b.c), 2).a(ae(cavVarB));
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
            z2 = z;
            defpackage.den.bz(z2, null, agfVarA, defpackage.aga.o(new defpackage.alm(300, 150, defpackage.abts.H(cavVarB).b.c), 2).a(af(cavVarB)), null, defpackage.cfo.j(-690752644, new defpackage.ped(aonoVar, 12), cavVarB), cavVarB, (i2 & 14) | 196608, 18);
        } else {
            z2 = z;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(z2, aonoVar, i, 13);
        }
    }

    public static void q(defpackage.aomy aomyVar, boolean z, boolean z2, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        defpackage.cmw cmwVarB;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1820736781);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            if (z2) {
                cavVarB.u(-427219630);
                java.lang.String strF = defpackage.dfa.f(z ? 2132018666 : 2132018667, cavVarB);
                defpackage.cmt cmtVar = defpackage.cmw.c;
                boolean zB = cavVarB.B(strF);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (zB || objR == defpackage.cau.a) {
                    objR = new defpackage.tge(strF, 8);
                    cbtVar.ab(objR);
                }
                cmwVarB = defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR);
                cbtVar.W(false);
            } else {
                cavVarB.u(-426816103);
                ((defpackage.cbt) cavVarB).W(false);
                cmwVarB = defpackage.cmw.c;
            }
            aomyVar2 = aomyVar;
            defpackage.aaoo.ah(aomyVar2, cmwVarB, false, null, defpackage.aaoo.aj(defpackage.cfd.M(0), 0L, cavVarB, 14), null, defpackage.cfo.j(238475742, new defpackage.ped(aonnVar, 13), cavVarB), cavVarB, (i2 & 14) | 100663296);
            cavVarB = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpm(aomyVar2, z, z2, aonnVar, i, 4);
        }
    }

    public static void r(defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-781315729);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.aoot aootVar = new defpackage.aoot();
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            aootVar.a = objR;
            defpackage.cmw cmwVarE = defpackage.vn.e(defpackage.cmw.c, new defpackage.uph(aootVar, (defpackage.dpf) cavVarB.e(defpackage.dfo.e), i4));
            defpackage.dpi dpiVar = (defpackage.dpi) ((defpackage.ccp) aootVar.a).a();
            if (dpiVar != null) {
                cmwVarE = defpackage.azm.k(cmwVarE, dpiVar.a);
            }
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarE);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf(i2 & 14));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(aonnVar, i, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static void s(final afe afeVar, final java.lang.String str, defpackage.cmw cmwVar, int i, defpackage.cav cavVar, final int i2, final int i3) {
        int i4;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        int i5;
        int i6;
        int i7;
        boolean z;
        defpackage.cav cavVar2;
        final defpackage.cmw cmwVar3;
        final int i8;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        int i9;
        defpackage.cbt cbtVar;
        defpackage.aomy aomyVar;
        int i10 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1695125081);
        if (i10 == 0) {
            i4 = (true != ((i2 & 8) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= true != cavVarB.B(str2) ? 16 : 32;
        } else {
            str2 = str;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                cmwVar2 = cmwVar;
                i4 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    i6 = i;
                    if (true != cavVarB.z(i6)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i4 |= i7;
                }
                if ((i4 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    if (i11 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        i9 = 2;
                    } else {
                        i9 = i6;
                    }
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
                    defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
                    defpackage.agf agfVarN = defpackage.aga.n(new defpackage.alm(100, 150, defpackage.abts.H(cavVarB).b.c), 2);
                    defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
                    defpackage.cmw cmwVarA = afeVar.b(cmtVar, agfVarN, defpackage.aga.o(new defpackage.alm(100, 0, defpackage.abts.H(cavVarB).b.c), 2)).a(cmwVar4);
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
                    cbtVar = (defpackage.cbt) cavVarB;
                    int iM = defpackage.anty.M(cbtVar.x);
                    defpackage.cje cjeVarAi = cbtVar.ai();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVarB, defpackage.dam.g);
                    defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
                    cavVar2 = cavVarB;
                    defpackage.abrz.k(str2, defpackage.den.ba(defpackage.azm.k(cmtVar, 80.0f), 12.0f, 0.0f, 12.0f, 0.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, i9, 0, null, defpackage.dkz.z(defpackage.den.an(cavVarB).l, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 2, 12582911), cavVar2, ((i4 >> 3) & 14) | 48, ((i4 << 3) & 57344) | 384, 109560);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    i8 = i9;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    i8 = i6;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: upd
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.cav cavVar3 = (defpackage.cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            int i12 = i2 | 1;
                            int i13 = 306783378 & i12;
                            int i14 = 613566756 & i12;
                            defpackage.ttj.s(afeVar, str, cmwVar3, i8, cavVar3, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14), i3);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            i6 = i;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    i9 = 2;
                } else {
                    i9 = i6;
                }
                defpackage.cmt cmtVar2 = defpackage.cmw.c;
                defpackage.abni abniVar4 = defpackage.abts.H(cavVarB).a;
                defpackage.abni abniVar5 = defpackage.abts.H(cavVarB).a;
                defpackage.agf agfVarN2 = defpackage.aga.n(new defpackage.alm(100, 150, defpackage.abts.H(cavVarB).b.c), 2);
                defpackage.abni abniVar6 = defpackage.abts.H(cavVarB).a;
                defpackage.cmw cmwVarA2 = afeVar.b(cmtVar2, agfVarN2, defpackage.aga.o(new defpackage.alm(100, 0, defpackage.abts.H(cavVarB).b.c), 2)).a(cmwVar4);
                defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, false);
                cbtVar = (defpackage.cbt) cavVarB;
                int iM2 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi2 = cbtVar.ai();
                defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarA2);
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarB2, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi2, defpackage.dam.d);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                defpackage.cev.b(cavVarB, defpackage.dam.g);
                defpackage.cev.c(cavVarB, cmwVarM2, defpackage.dam.c);
                cavVar2 = cavVarB;
                defpackage.abrz.k(str2, defpackage.den.ba(defpackage.azm.k(cmtVar2, 80.0f), 12.0f, 0.0f, 12.0f, 0.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, i9, 0, null, defpackage.dkz.z(defpackage.den.an(cavVarB).l, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 2, 12582911), cavVar2, ((i4 >> 3) & 14) | 48, ((i4 << 3) & 57344) | 384, 109560);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                i8 = i9;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                i8 = i6;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: upd
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar3 = (defpackage.cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        int i12 = i2 | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        defpackage.ttj.s(afeVar, str, cmwVar3, i8, cavVar3, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14), i3);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i4 |= 384;
        cmwVar2 = cmwVar;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                i6 = i;
                if (true != cavVarB.z(i6)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i4 |= i7;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    i9 = 2;
                } else {
                    i9 = i6;
                }
                defpackage.cmt cmtVar3 = defpackage.cmw.c;
                defpackage.abni abniVar7 = defpackage.abts.H(cavVarB).a;
                defpackage.abni abniVar8 = defpackage.abts.H(cavVarB).a;
                defpackage.agf agfVarN3 = defpackage.aga.n(new defpackage.alm(100, 150, defpackage.abts.H(cavVarB).b.c), 2);
                defpackage.abni abniVar9 = defpackage.abts.H(cavVarB).a;
                defpackage.cmw cmwVarA3 = afeVar.b(cmtVar3, agfVarN3, defpackage.aga.o(new defpackage.alm(100, 0, defpackage.abts.H(cavVarB).b.c), 2)).a(cmwVar4);
                defpackage.cye cyeVarB3 = defpackage.awo.b(defpackage.cmh.a, false);
                cbtVar = (defpackage.cbt) cavVarB;
                int iM3 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi3 = cbtVar.ai();
                defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarA3);
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarB3, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi3, defpackage.dam.d);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM3), defpackage.dam.f);
                defpackage.cev.b(cavVarB, defpackage.dam.g);
                defpackage.cev.c(cavVarB, cmwVarM3, defpackage.dam.c);
                cavVar2 = cavVarB;
                defpackage.abrz.k(str2, defpackage.den.ba(defpackage.azm.k(cmtVar3, 80.0f), 12.0f, 0.0f, 12.0f, 0.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, i9, 0, null, defpackage.dkz.z(defpackage.den.an(cavVarB).l, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 2, 12582911), cavVar2, ((i4 >> 3) & 14) | 48, ((i4 << 3) & 57344) | 384, 109560);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                i8 = i9;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                i8 = i6;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: upd
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar3 = (defpackage.cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        int i12 = i2 | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        defpackage.ttj.s(afeVar, str, cmwVar3, i8, cavVar3, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14), i3);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i4 |= 3072;
        i6 = i;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i4 & 1)) {
            if (i11 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i5 != 0) {
                i9 = 2;
            } else {
                i9 = i6;
            }
            defpackage.cmt cmtVar4 = defpackage.cmw.c;
            defpackage.abni abniVar10 = defpackage.abts.H(cavVarB).a;
            defpackage.abni abniVar11 = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarN4 = defpackage.aga.n(new defpackage.alm(100, 150, defpackage.abts.H(cavVarB).b.c), 2);
            defpackage.abni abniVar12 = defpackage.abts.H(cavVarB).a;
            defpackage.cmw cmwVarA4 = afeVar.b(cmtVar4, agfVarN4, defpackage.aga.o(new defpackage.alm(100, 0, defpackage.abts.H(cavVarB).b.c), 2)).a(cmwVar4);
            defpackage.cye cyeVarB4 = defpackage.awo.b(defpackage.cmh.a, false);
            cbtVar = (defpackage.cbt) cavVarB;
            int iM4 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi4 = cbtVar.ai();
            defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVarB, cmwVarA4);
            aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB4, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi4, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM4), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM4, defpackage.dam.c);
            cavVar2 = cavVarB;
            defpackage.abrz.k(str2, defpackage.den.ba(defpackage.azm.k(cmtVar4, 80.0f), 12.0f, 0.0f, 12.0f, 0.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, i9, 0, null, defpackage.dkz.z(defpackage.den.an(cavVarB).l, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 2, 12582911), cavVar2, ((i4 >> 3) & 14) | 48, ((i4 << 3) & 57344) | 384, 109560);
            cbtVar.W(true);
            cmwVar3 = cmwVar4;
            i8 = i9;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar3 = cmwVar2;
            i8 = i6;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: upd
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar3 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i12 = i2 | 1;
                    int i13 = 306783378 & i12;
                    int i14 = 613566756 & i12;
                    defpackage.ttj.s(afeVar, str, cmwVar3, i8, cavVar3, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14), i3);
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static void t(defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1370053884);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.ayy ayyVar = acpl.a;
            aomyVar2 = aomyVar;
            defpackage.aaoo.ak(aomyVar2, defpackage.azm.f(defpackage.cmw.c, 28.0f, Float.NaN), false, null, acpl.a(defpackage.cqg.h(defpackage.den.ak(cavVarB).H, 0.7f), 0L, cavVarB, 14), null, null, null, defpackage.uot.a, cavVarB, (i2 & 14) | 805306416, 492);
            cavVarB = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(aomyVar2, i, 16);
        }
    }

    public static void u(afe afeVar, defpackage.aomy aomyVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVarB;
        java.lang.Object objB;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-606360001);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            if (z) {
                cavVarB.u(561882340);
                java.lang.String strF = defpackage.dfa.f(2132018659, cavVarB);
                defpackage.cmt cmtVar = defpackage.cmw.c;
                boolean zB = cavVarB.B(strF);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (zB || objR == defpackage.cau.a) {
                    objR = new defpackage.tge(strF, 7);
                    cbtVar.ab(objR);
                }
                cmwVarB = defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR);
                cbtVar.W(false);
            } else {
                cavVarB.u(562072525);
                ((defpackage.cbt) cavVarB).W(false);
                cmwVarB = defpackage.cmw.c;
            }
            if (z) {
                cavVarB.u(562165959);
                defpackage.cmt cmtVar2 = defpackage.cmw.c;
                defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                java.lang.Object objR2 = cbtVar2.R();
                if (objR2 == defpackage.cau.a) {
                    objR2 = new defpackage.ukw(8);
                    cbtVar2.ab(objR2);
                }
                objB = defpackage.dig.b(cmtVar2, false, (defpackage.aonj) objR2);
                cbtVar2.W(false);
            } else {
                cavVarB.u(562230253);
                ((defpackage.cbt) cavVarB).W(false);
                objB = defpackage.cmw.c;
            }
            v(aomyVar, cmwVarB, defpackage.cfo.j(1978770848, new defpackage.qyh(afeVar, objB, 20), cavVarB), cavVarB, ((i2 >> 3) & 14) | 384);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq(afeVar, aomyVar, z, i, 20);
        }
    }

    public static void v(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1970861323);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar, cmwVar2, false, null, defpackage.cfd.M(0), 0L, 0.0f, 0.0f, null, null, defpackage.cfo.j(1731524106, new defpackage.ubr(aonnVar, 6), cavVarB), cavVar2, 1004);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(aomyVar, cmwVar, aonnVar, i, 14);
        }
    }

    public static void w(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(591028402);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarC = defpackage.azm.c(cmtVar, 1.0f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.d, defpackage.cmh.k, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
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
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVar2 = cavVarB;
            defpackage.abrz.k(defpackage.dfa.f(2132018669, cavVarB), null, defpackage.den.ak(cavVarB).s, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).k, cavVar2, 0, 0, 130042);
            cmwVar2 = cmtVar;
            defpackage.aaoo.am(aomyVar, null, false, null, null, null, defpackage.uot.b, cavVar2, (i4 & 14) | 805306368, 510);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(aomyVar, cmwVar2, i, 8);
        }
    }

    public static void x(int i, defpackage.cmw cmwVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1984875540);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.aaoo.V(defpackage.wv.k(i, cavVarB, i5 & 14), null, defpackage.den.aY(defpackage.den.bn(defpackage.azm.g(cmwVar, 20.0f), defpackage.den.ak(cavVarB).p, defpackage.bge.a), 4.0f), defpackage.den.ak(cavVarB).s, cavVarB, 56, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(i, cmwVar, i2, 3);
        }
    }

    public static void y(final afe afeVar, final java.util.List list, final defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, boolean z2, final boolean z3, defpackage.aonj aonjVar, final defpackage.aonj aonjVar2, defpackage.aomy aomyVar2, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aomy aomyVar3;
        boolean z4;
        final boolean z5;
        final defpackage.aonj aonjVar3;
        final defpackage.aomy aomyVar4;
        int i4;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(31913675);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aomyVar3 = aomyVar;
            i3 |= true != cavVarB.D(aomyVar3) ? 1024 : 2048;
        } else {
            aomyVar3 = aomyVar;
        }
        int i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            z4 = z;
            i6 |= true != cavVarB.C(z4) ? 65536 : 131072;
        } else {
            z4 = z;
        }
        if ((1572864 & i) == 0) {
            z5 = z2;
            i6 |= true != cavVarB.C(z5) ? 524288 : 1048576;
        } else {
            z5 = z2;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != cavVarB.C(z3) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            aonjVar3 = aonjVar;
            i6 |= true != cavVarB.D(aonjVar3) ? 33554432 : 67108864;
        } else {
            aonjVar3 = aonjVar;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != cavVarB.D(aonjVar2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            aomyVar4 = aomyVar2;
            i4 = i2 | (true != cavVarB.D(aomyVar4) ? 2 : 4);
        } else {
            aomyVar4 = aomyVar2;
            i4 = i2;
        }
        if (cavVarB.H(((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i6 & 1)) {
            final defpackage.cmt cmtVar = defpackage.cmw.c;
            final float fDl = ((defpackage.dpf) cavVarB.e(defpackage.dfo.e)).dl(28.0f);
            final defpackage.bbh bbhVarA = defpackage.bbj.a(cavVarB);
            java.lang.Object[] objArr = new java.lang.Object[0];
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.uoq(3);
                cbtVar.ab(objR);
            }
            final defpackage.ccp ccpVar = (defpackage.ccp) defpackage.cfd.m(objArr, (defpackage.aomy) objR, cavVarB, 48);
            final aooq aooqVar = new aooq();
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = java.lang.Float.valueOf(0.0f);
                cbtVar.ab(objR2);
            }
            aooqVar.a = ((java.lang.Number) objR2).floatValue();
            final defpackage.kaw kawVar = (defpackage.kaw) cavVarB.e(defpackage.dfo.h);
            final defpackage.aomy aomyVar5 = aomyVar3;
            final boolean z6 = z4;
            defpackage.aonn aonnVar2 = new defpackage.aonn() { // from class: upi
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.cav cavVar3 = (defpackage.cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i7 = 0;
                    if (cavVar3.H((iIntValue & 3) != 2, iIntValue & 1)) {
                        final float f = fDl;
                        final defpackage.ccp ccpVar2 = ccpVar;
                        final defpackage.kaw kawVar2 = kawVar;
                        final aooq aooqVar2 = aooqVar;
                        defpackage.aomy aomyVar6 = aomyVar5;
                        defpackage.bbh bbhVar = bbhVarA;
                        java.util.List list2 = list;
                        defpackage.ayy ayyVarBb = defpackage.den.bb(8.0f, 2);
                        int size = list2.size() - 2;
                        defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.den.x(defpackage.cmw.c, "favorites_bar_lazy_row_tag"), 1.0f);
                        defpackage.tfm tfmVar = new defpackage.tfm(aooqVar2, bbhVar, kawVar2, ccpVar2, 3);
                        defpackage.aonn aonnVar3 = new defpackage.aonn() { // from class: upe
                            @Override // defpackage.aonn
                            public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.aooh.f((cvm) obj4, "<unused var>");
                                long j = ((defpackage.cpm) obj5).a >> 32;
                                aooq aooqVar3 = aooqVar2;
                                float fIntBitsToFloat = aooqVar3.a + java.lang.Float.intBitsToFloat((int) j);
                                aooqVar3.a = fIntBitsToFloat;
                                if (java.lang.Math.abs(fIntBitsToFloat) > f) {
                                    defpackage.ccp ccpVar3 = ccpVar2;
                                    if (defpackage.ttj.m(ccpVar3) != null) {
                                        kawVar2.ar(0);
                                        ccpVar3.b(null);
                                    }
                                }
                                return defpackage.aojh.a;
                            }
                        };
                        boolean zB = cavVar3.B(aomyVar6);
                        java.lang.Object objG = cavVar3.g();
                        if (zB || objG == defpackage.cau.a) {
                            objG = new defpackage.sky(aomyVar6, 18);
                            cavVar3.w(objG);
                        }
                        defpackage.aomy aomyVar7 = (defpackage.aomy) objG;
                        boolean zB2 = cavVar3.B(aomyVar6);
                        java.lang.Object objG2 = cavVar3.g();
                        if (zB2 || objG2 == defpackage.cau.a) {
                            objG2 = new defpackage.sky(aomyVar6, 19);
                            cavVar3.w(objG2);
                        }
                        boolean z7 = z6;
                        defpackage.aomy aomyVar8 = (defpackage.aomy) objG2;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(size);
                        boolean zC = cavVar3.C(z7);
                        java.lang.Object objG3 = cavVar3.g();
                        if (zC || objG3 == defpackage.cau.a) {
                            objG3 = new defpackage.upf(z7, i7);
                            cavVar3.w(objG3);
                        }
                        final defpackage.aonj aonjVar4 = aonjVar2;
                        final boolean z8 = z3;
                        final defpackage.aomy aomyVar9 = aomyVar4;
                        final afe afeVar2 = afeVar;
                        final defpackage.cmw cmwVar3 = cmtVar;
                        final defpackage.aonj aonjVar5 = aonjVar3;
                        java.lang.Object obj4 = objG3;
                        final boolean z9 = z5;
                        defpackage.aehj.ai(cmwVarD, bbhVar, ayyVarBb, aonnVar, tfmVar, aonnVar3, aomyVar7, aomyVar8, numValueOf, list2, (defpackage.aonn) obj4, defpackage.cfo.j(-1351417555, new defpackage.aonr() { // from class: upg
                            @Override // defpackage.aonr
                            public final java.lang.Object a(java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) throws java.io.IOException {
                                int i8;
                                abkh abkhVarCr;
                                defpackage.ccp ccpVar3;
                                defpackage.aomy aomyVar10;
                                int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                                uov uovVar = (uow) obj7;
                                ((java.lang.Boolean) obj8).booleanValue();
                                defpackage.cav cavVar4 = (defpackage.cav) obj9;
                                int iIntValue3 = ((java.lang.Integer) obj10).intValue();
                                defpackage.aooh.f((defpackage.nf) obj5, "$this$ReorderableLazyRow");
                                defpackage.aooh.f(uovVar, "item");
                                if ((iIntValue3 & 48) == 0) {
                                    i8 = (true != cavVar4.z(iIntValue2) ? 16 : 32) | iIntValue3;
                                } else {
                                    i8 = iIntValue3;
                                }
                                if ((iIntValue3 & 384) == 0) {
                                    i8 |= true != cavVar4.B(uovVar) ? 128 : 256;
                                }
                                if (cavVar4.H((i8 & 8337) != 8336, i8 & 1)) {
                                    afe afeVar3 = afeVar2;
                                    int iBv = defpackage.wsc.bv(uovVar);
                                    if (iBv == 0) {
                                        cavVar4.u(943223069);
                                        uov uovVar2 = uovVar;
                                        defpackage.aooh.f(uovVar2, "<this>");
                                        android.net.Uri uri = uovVar2.d;
                                        if (uri != null) {
                                            boolean z10 = z9;
                                            cavVar4.u(1599682266);
                                            cavVar4.o();
                                            abkhVarCr = new abkh(uri, (abjz) null, z10, 6);
                                        } else {
                                            cavVar4.u(1599776971);
                                            abkhVarCr = defpackage.mni.cr(uovVar2.g, cavVar4);
                                            cavVar4.o();
                                        }
                                        defpackage.aonj aonjVar6 = aonjVar5;
                                        defpackage.ccp ccpVar4 = ccpVar2;
                                        java.lang.String strF = defpackage.dfa.f(2132018662, cavVar4);
                                        java.lang.String str = uovVar2.c;
                                        java.lang.String strCr = defpackage.ajsz.cr(defpackage.ajsz.bc(android.text.TextUtils.expandTemplate(strF, str).toString(), uovVar2.f), ". ", null, null, null, 62);
                                        boolean zB3 = cavVar4.B(ccpVar4) | cavVar4.B(aonjVar6);
                                        boolean z11 = (i8 & 896) == 256;
                                        java.lang.Object objG4 = cavVar4.g();
                                        if ((zB3 || z11) || objG4 == defpackage.cau.a) {
                                            objG4 = new obp(aonjVar6, uovVar, ccpVar4, 17, (byte[]) null);
                                            ccpVar3 = ccpVar4;
                                            cavVar4.w(objG4);
                                        } else {
                                            ccpVar3 = ccpVar4;
                                        }
                                        boolean z12 = z11;
                                        defpackage.kaw kawVar3 = kawVar2;
                                        defpackage.aomy aomyVar11 = (defpackage.aomy) objG4;
                                        defpackage.cmt cmtVar2 = defpackage.cmw.c;
                                        boolean zB4 = cavVar4.B(strCr) | z12 | cavVar4.B(aomyVar11) | cavVar4.B(ccpVar3) | ((i8 & 112) == 32) | cavVar4.D(kawVar3);
                                        java.lang.Object objG5 = cavVar4.g();
                                        if (zB4 || objG5 == defpackage.cau.a) {
                                            aomyVar10 = aomyVar11;
                                            upb upbVar = new upb(strCr, uovVar, aomyVar10, iIntValue2, kawVar3, ccpVar3);
                                            cavVar4.w(upbVar);
                                            objG5 = upbVar;
                                        } else {
                                            aomyVar10 = aomyVar11;
                                        }
                                        defpackage.cmw cmwVarA = defpackage.dig.a(cmtVar2, (defpackage.aonj) objG5);
                                        defpackage.cmi cmiVar = defpackage.cmh.k;
                                        defpackage.aojh aojhVar = defpackage.aojh.a;
                                        boolean zB5 = cavVar4.B(aomyVar10);
                                        java.lang.Object objG6 = cavVar4.g();
                                        if (zB5 || objG6 == defpackage.cau.a) {
                                            objG6 = new bil(aomyVar10, 13);
                                            cavVar4.w(objG6);
                                        }
                                        defpackage.cmw cmwVarA2 = defpackage.cvy.a(cmwVar3, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG6).a(cmwVarA);
                                        defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVar4, 48);
                                        int iM = defpackage.anty.M(cavVar4.a());
                                        defpackage.cje cjeVarM = cavVar4.M();
                                        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar4, cmwVarA2);
                                        defpackage.aomy aomyVar12 = defpackage.dam.a;
                                        cavVar4.L();
                                        cavVar4.v();
                                        if (cavVar4.F()) {
                                            cavVar4.j(aomyVar12);
                                        } else {
                                            cavVar4.x();
                                        }
                                        defpackage.aonj aonjVar7 = aonjVar4;
                                        defpackage.cev.c(cavVar4, cyeVarA, defpackage.dam.e);
                                        defpackage.cev.c(cavVar4, cjeVarM, defpackage.dam.d);
                                        defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                                        defpackage.cev.b(cavVar4, defpackage.dam.g);
                                        defpackage.cev.c(cavVar4, cmwVarM, defpackage.dam.c);
                                        defpackage.ttj.n(afeVar3, defpackage.cfo.j(-869507882, new upc(abkhVarCr, uovVar, iIntValue2, ccpVar3, aonjVar7), cavVar4), cavVar4, 48);
                                        defpackage.den.aR(defpackage.azm.e(cmtVar2, 8.0f), cavVar4);
                                        defpackage.ttj.s(afeVar3, str, null, 2, cavVar4, 3072, 2);
                                        cavVar4.n();
                                        cavVar4.o();
                                    } else {
                                        if (iBv != 1) {
                                            cavVar4.u(-1632143116);
                                            cavVar4.o();
                                            throw new defpackage.aois();
                                        }
                                        boolean z13 = z8;
                                        defpackage.aomy aomyVar13 = aomyVar9;
                                        cavVar4.u(945857666);
                                        defpackage.ttj.u(afeVar3, aomyVar13, z13, cavVar4, 0);
                                        cavVar4.o();
                                    }
                                } else {
                                    cavVar4.s();
                                }
                                return defpackage.aojh.a;
                            }
                        }, cavVar3), cavVar3, 390, 384);
                    } else {
                        cavVar3.s();
                    }
                    return defpackage.aojh.a;
                }
            };
            cavVar2 = cavVarB;
            r(defpackage.cfo.j(-1744772519, aonnVar2, cavVar2), cavVar2, 6);
            cmwVar2 = cmtVar;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new upj(afeVar, list, aonnVar, aomyVar, cmwVar2, z, z2, z3, aonjVar, aonjVar2, aomyVar2, i, i2, 0);
        }
    }

    public static void z(defpackage.aomy aomyVar, defpackage.aomy aomyVar2, boolean z, boolean z2, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        defpackage.aomy aomyVar3;
        int i2;
        boolean z3;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1499212646);
        int i4 = 1;
        if (i3 == 0) {
            aomyVar3 = aomyVar;
            i2 = (true != cavVarB.D(aomyVar3) ? 2 : 4) | i;
        } else {
            aomyVar3 = aomyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != cavVarB.C(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        int i5 = i2 | 24576;
        if (cavVarB.H((i5 & 9363) != 9362, i5 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.den.ba(cmtVar, 12.0f, 4.0f, 8.0f, 4.0f), 1.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g, defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
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
            int i6 = i5 >> 3;
            q(aomyVar3, z, z3, defpackage.cfo.j(-7089687, new defpackage.upf(z, i4), cavVarB), cavVarB, (i5 & 14) | 3072 | (i6 & 112) | (i6 & 896));
            if (aomyVar2 != null) {
                cavVarB.u(1441400066);
                t(aomyVar2, cavVarB, i6 & 14);
                cbtVar.W(false);
            } else {
                cavVarB.u(1441471180);
                cbtVar.W(false);
            }
            cbtVar.W(true);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new smh(aomyVar, aomyVar2, z, z2, cmwVar2, i, 2);
        }
    }

    public ttj(byte[] bArr, byte[] bArr2) {
    }

    public ttj() {
    }
}
