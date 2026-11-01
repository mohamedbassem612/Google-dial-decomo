package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hgu {
    private static java.util.concurrent.Executor a;

    public hgu() {
    }

    public static defpackage.hsh A(defpackage.hsh hshVar, android.view.View view) {
        aooh.f(view, "view");
        C(hshVar, view, 0.0f, 1.0f);
        return hshVar;
    }

    public static defpackage.hsh B(defpackage.hsh hshVar, android.view.View view) {
        aooh.f(view, "view");
        C(hshVar, view, 1.0f, 0.0f);
        return hshVar;
    }

    public static void C(defpackage.hsh hshVar, android.view.View view, float f, float f2) {
        aooh.f(view, "view");
        hshVar.j(0.33333334f, f, f2, defpackage.kla.a, new defpackage.kkz(view, 1));
    }

    public static void D(defpackage.hsh hshVar, android.view.View view, float f, float f2) {
        aooh.f(view, "view");
        hshVar.g(f, f2, defpackage.kla.c, new defpackage.kkz(view, 0));
    }

    public static void E(defpackage.hsh hshVar, final android.view.View view, float f, float f2) {
        aooh.f(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final int i = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        hshVar.g(f, f2, defpackage.kla.b, new defpackage.hsf() { // from class: kky
            @Override // defpackage.hsf
            public final void a(float f3) {
                android.view.View view2 = view;
                view2.setTranslationY(f3);
                if (f3 > 0.0f) {
                    int i2 = i;
                    android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    aooh.d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i2 + ((int) f3);
                }
            }
        });
        hshVar.i(new defpackage.eyd(view, i, 3));
    }

    public static /* synthetic */ aojh F(defpackage.kkx kkxVar, defpackage.due dueVar) {
        aooh.f(dueVar, "$this$withConstraintSet");
        defpackage.kkw kkwVar = kkxVar.c;
        dueVar.e(kkxVar.e.a, 3, kkwVar != null ? kkwVar.a : kkxVar.a.a, 4);
        return aojh.a;
    }

    public static defpackage.kkw G(android.view.View view) {
        aooh.f(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return new defpackage.kkw(view.getId(), view, view.getMeasuredHeight(), view.getMeasuredWidth(), marginLayoutParams.topMargin, marginLayoutParams.bottomMargin, marginLayoutParams.getMarginStart(), marginLayoutParams.getMarginEnd());
    }

    public static void H(ahda ahdaVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-225320208);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? cavVarB.B(ahdaVar) : cavVarB.D(ahdaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmi cmiVar = cmh.k;
            cmw cmwVarBa = den.ba(azm.c(cmw.c, 1.0f), 0.0f, 72.0f, 0.0f, 0.0f);
            cye cyeVarA = aww.a(awi.c, cmiVar, cavVarB, 48);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            cavVar2 = cavVarB;
            abrz.k(dfa.f(2132019463, cavVarB), (cmw) null, den.ak(cavVarB).q, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).j, cavVar2, 0, 0, 130042);
            aaoo.am(ahdaVar.m("emptyCallLogMakeCall_onClick", rod.a, cavVar2), (cmw) null, false, (crd) null, (bni) null, (ayy) null, defpackage.klv.a, cavVar2, 805306368, 510);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kmg(ahdaVar, i, 0);
        }
    }

    public static /* synthetic */ defpackage.ni I(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static /* synthetic */ defpackage.ni J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static /* synthetic */ defpackage.ni K(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static void L(java.lang.String str) {
        aooh.f(str, "key");
        throw new java.lang.IllegalArgumentException(a.bk(str, "No valid saved state was found for the key '", "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static byte[] M(java.util.UUID uuid) {
        aooh.f(uuid, "uuid");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        aooh.e(bArrArray, "array(...)");
        return bArrArray;
    }

    public static java.lang.String N(java.util.Collection collection) {
        aooh.f(collection, "collection");
        return !collection.isEmpty() ? aoov.m(ajsz.cr(collection, ",\n", "\n", "\n", (aonj) null, 56)).concat("},") : " }";
    }

    public static java.lang.String O(java.util.Collection collection) {
        return aoov.m(ajsz.cr(collection, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62)).concat(aoov.m(" }"));
    }

    public static java.lang.String P(java.util.Collection collection) {
        return aoov.m(ajsz.cr(collection, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62)).concat(aoov.m("},"));
    }

    public static java.lang.String Q(defpackage.gib gibVar) {
        java.util.List listBX;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(gibVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(N(ajsz.bX(gibVar.b.values(), new defpackage.djh(19))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(N(gibVar.c));
        sb.append("\n            |    indices = {");
        java.util.Set set = gibVar.d;
        if (set == null || (listBX = ajsz.bX(set, new defpackage.djh(20))) == null) {
            listBX = aokc.a;
        }
        sb.append(N(listBX));
        sb.append("\n            |}\n        ");
        return aoov.n(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    public static boolean R(java.lang.String str, java.lang.String str2) {
        if (aooh.n(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0) {
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                } else if (cCharAt == '(') {
                    i3 = 0;
                    cCharAt = '(';
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')') {
                        continue;
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                java.lang.String strSubstring = str.substring(1, str.length() - 1);
                aooh.e(strSubstring, "substring(...)");
                return aooh.n(aoov.x(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static boolean S(defpackage.gib gibVar, java.lang.Object obj) {
        java.util.Set set;
        if (gibVar == obj) {
            return true;
        }
        if (obj instanceof defpackage.gib) {
            defpackage.gib gibVar2 = (defpackage.gib) obj;
            if (aooh.n(gibVar.a, gibVar2.a) && aooh.n(gibVar.b, gibVar2.b) && aooh.n(gibVar.c, gibVar2.c)) {
                java.util.Set set2 = gibVar.d;
                if (set2 == null || (set = gibVar2.d) == null) {
                    return true;
                }
                return aooh.n(set2, set);
            }
        }
        return false;
    }

    public static defpackage.gib T(gjh gjhVar, java.lang.String str) {
        long j;
        aokd aokdVarE;
        java.util.Set set;
        java.lang.String str2;
        java.lang.Throwable th;
        defpackage.gia giaVar;
        gjh gjhVar2 = gjhVar;
        gin ginVarA = gjhVar2.a(a.bk(str, "PRAGMA table_info(`", "`)"));
        try {
            java.lang.String str3 = "name";
            if (ginVarA.m()) {
                int iQ = dzk.Q(ginVarA, "name");
                int iQ2 = dzk.Q(ginVarA, "type");
                int iQ3 = dzk.Q(ginVarA, "notnull");
                int iQ4 = dzk.Q(ginVarA, "pk");
                int iQ5 = dzk.Q(ginVarA, "dflt_value");
                j = 0;
                aola aolaVar = new aola(8);
                while (true) {
                    java.lang.String strE = ginVarA.e(iQ);
                    aolaVar.put(strE, new defpackage.ghy(strE, ginVarA.e(iQ2), ginVarA.c(iQ3) != 0, (int) ginVarA.c(iQ4), ginVarA.l(iQ5) ? null : ginVarA.e(iQ5), 2));
                    if (!ginVarA.m()) {
                        break;
                    }
                    gjhVar2 = gjhVar;
                }
                aokdVarE = aolaVar.e();
                aooc.M(ginVarA, (java.lang.Throwable) null);
            } else {
                aokdVarE = aokd.a;
                aooc.M(ginVarA, (java.lang.Throwable) null);
                j = 0;
            }
            gin ginVarA2 = gjhVar2.a(a.bk(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int iQ6 = dzk.Q(ginVarA2, "id");
                int iQ7 = dzk.Q(ginVarA2, "seq");
                int iQ8 = dzk.Q(ginVarA2, "table");
                int iQ9 = dzk.Q(ginVarA2, "on_delete");
                int iQ10 = dzk.Q(ginVarA2, "on_update");
                int iQ11 = dzk.Q(ginVarA2, "id");
                int iQ12 = dzk.Q(ginVarA2, "seq");
                int iQ13 = dzk.Q(ginVarA2, "from");
                int iQ14 = dzk.Q(ginVarA2, "to");
                aokd aokdVar = aokdVarE;
                aokv aokvVar = new aokv(10);
                while (ginVarA2.m()) {
                    aokvVar.add(new defpackage.ghx((int) ginVarA2.c(iQ11), (int) ginVarA2.c(iQ12), ginVarA2.e(iQ13), ginVarA2.e(iQ14)));
                    iQ9 = iQ9;
                    str3 = str3;
                }
                int i = iQ9;
                java.lang.String str4 = str3;
                java.util.List listBW = ajsz.bW(ajsz.aX(aokvVar));
                ginVarA2.k();
                aolg aolgVar = new aolg();
                while (ginVarA2.m()) {
                    if (ginVarA2.c(iQ7) == j) {
                        int iC = (int) ginVarA2.c(iQ6);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList<defpackage.ghx> arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : listBW) {
                            if (((defpackage.ghx) obj).a == iC) {
                                arrayList3.add(obj);
                            }
                        }
                        for (defpackage.ghx ghxVar : arrayList3) {
                            arrayList.add(ghxVar.b);
                            arrayList2.add(ghxVar.c);
                        }
                        int i2 = i;
                        aolgVar.add(new defpackage.ghz(ginVarA2.e(iQ8), ginVarA2.e(i2), ginVarA2.e(iQ10), arrayList, arrayList2));
                        i = i2;
                    }
                }
                java.util.Set setAE = ajsz.aE(aolgVar);
                aooc.M(ginVarA2, (java.lang.Throwable) null);
                gjhVar = gjhVar;
                gin ginVarA3 = gjhVar.a(a.bk(str, "PRAGMA index_list(`", "`)"));
                java.lang.String str5 = str4;
                try {
                    int iQ15 = dzk.Q(ginVarA3, str5);
                    int iQ16 = dzk.Q(ginVarA3, "origin");
                    int iQ17 = dzk.Q(ginVarA3, "unique");
                    if (iQ15 == -1 || iQ16 == -1 || iQ17 == -1) {
                        aooc.M(ginVarA3, (java.lang.Throwable) null);
                        set = null;
                    } else {
                        aolg aolgVar2 = new aolg();
                        while (ginVarA3.m()) {
                            if (aooh.n("c", ginVarA3.e(iQ16))) {
                                java.lang.String strE2 = ginVarA3.e(iQ15);
                                boolean z = ginVarA3.c(iQ17) == 1;
                                gin ginVarA4 = gjhVar.a(a.bk(strE2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int iQ18 = dzk.Q(ginVarA4, "seqno");
                                    int iQ19 = dzk.Q(ginVarA4, "cid");
                                    int iQ20 = dzk.Q(ginVarA4, str5);
                                    int i3 = iQ15;
                                    int iQ21 = dzk.Q(ginVarA4, "desc");
                                    int i4 = iQ16;
                                    if (iQ18 == -1 || iQ19 == -1 || iQ20 == -1 || iQ21 == -1) {
                                        str2 = str5;
                                        th = null;
                                        aooc.M(ginVarA4, (java.lang.Throwable) null);
                                        giaVar = null;
                                    } else {
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                        while (ginVarA4.m()) {
                                            str5 = str5;
                                            if (((int) ginVarA4.c(iQ19)) >= 0) {
                                                int iC2 = (int) ginVarA4.c(iQ18);
                                                java.lang.String strE3 = ginVarA4.e(iQ20);
                                                java.lang.String str6 = ginVarA4.c(iQ21) > j ? "DESC" : "ASC";
                                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC2);
                                                linkedHashMap.put(numValueOf, strE3);
                                                linkedHashMap2.put(numValueOf, str6);
                                                iQ21 = iQ21;
                                            }
                                        }
                                        str2 = str5;
                                        java.util.List listBX = ajsz.bX(linkedHashMap.entrySet(), new defpackage.djh(17));
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(listBX, 10));
                                        java.util.Iterator it = listBX.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                                        }
                                        java.util.List listBZ = ajsz.bZ(arrayList4);
                                        java.util.List listBX2 = ajsz.bX(linkedHashMap2.entrySet(), new defpackage.djh(18));
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(listBX2, 10));
                                        java.util.Iterator it2 = listBX2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
                                        }
                                        giaVar = new defpackage.gia(strE2, z, listBZ, ajsz.bZ(arrayList5));
                                        aooc.M(ginVarA4, (java.lang.Throwable) null);
                                        th = null;
                                    }
                                    if (giaVar == null) {
                                        aooc.M(ginVarA3, th);
                                        set = null;
                                    } else {
                                        aolgVar2.add(giaVar);
                                        iQ15 = i3;
                                        iQ16 = i4;
                                        iQ17 = iQ17;
                                        str5 = str2;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (java.lang.Throwable th3) {
                                        aooc.M(ginVarA4, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        java.util.Set setAE2 = ajsz.aE(aolgVar2);
                        aooc.M(ginVarA3, (java.lang.Throwable) null);
                        set = setAE2;
                    }
                    return new defpackage.gib(str, aokdVar, setAE, set);
                } catch (java.lang.Throwable th4) {
                    try {
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        aooc.M(ginVarA3, th4);
                        throw th5;
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    aooc.M(ginVarA2, th6);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            try {
                throw th8;
            } catch (java.lang.Throwable th9) {
                aooc.M(ginVarA, th8);
                throw th9;
            }
        }
    }

    public static void U(aca acaVar, aonj aonjVar) {
        aooh.f(acaVar, "map");
        aca acaVar2 = new aca(999);
        int i = ((aec) acaVar).d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            acaVar2.put(acaVar.d(i2), acaVar.g(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                aonjVar.a(acaVar2);
                acaVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            aonjVar.a(acaVar2);
        }
    }

    public static void V(gjh gjhVar) {
        aokv aokvVar = new aokv(10);
        gin ginVarA = gjhVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (ginVarA.m()) {
            try {
                aokvVar.add(ginVarA.e(0));
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    aooc.M(ginVarA, th);
                    throw th2;
                }
            }
        }
        aooc.M(ginVarA, (java.lang.Throwable) null);
        java.util.ListIterator listIterator = ajsz.aX(aokvVar).listIterator(0);
        while (listIterator.hasNext()) {
            java.lang.String str = (java.lang.String) listIterator.next();
            if (aoov.ad(str, "room_fts_content_sync_")) {
                dzk.M(gjhVar, "DROP TRIGGER IF EXISTS ".concat(java.lang.String.valueOf(str)));
            }
        }
    }

    public static void W(ghf ghfVar, gjh gjhVar) {
        ghfVar.a(gjhVar.a);
    }

    public static void X(defpackage.ew ewVar, int i, int i2, int i3, int i4, java.lang.Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            ewVar.a(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            ewVar.a(i2, i6, obj);
        }
    }

    public static java.lang.Object Y(gcr gcrVar, int i) {
        if (i >= 0 && i < gcrVar.e()) {
            int iD = i - gcrVar.d();
            if (iD < 0 || iD >= gcrVar.a()) {
                return null;
            }
            return gcrVar.i(iD);
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + gcrVar.e());
    }

    public static defpackage.fxx Z(android.window.BackEvent backEvent) {
        aooh.f(backEvent, "<this>");
        float fM = rp$.ExternalSyntheticApiModelOutline0.m(backEvent);
        float fM$1 = rp$.ExternalSyntheticApiModelOutline0.m$1(backEvent);
        return new defpackage.fxx(rp$.ExternalSyntheticApiModelOutline0.m(backEvent), rp$.ExternalSyntheticApiModelOutline0.m$2(backEvent), fM, fM$1, android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static /* synthetic */ zjm a(defpackage.hii hiiVar) {
        defpackage.jnn jnnVarP = hiiVar.a.P();
        amyz amyzVar = hiiVar.gy;
        j$.util.Objects.requireNonNull(jnnVarP);
        return new zjm(amyzVar, new defpackage.jnz(jnnVarP, 0));
    }

    public static boolean aA(int i, defpackage.etx etxVar, boolean z) throws defpackage.era {
        if (etxVar.d() < 7) {
            if (z) {
                return false;
            }
            throw new defpackage.era("too short header: " + etxVar.d(), null, true, 1);
        }
        if (etxVar.n() != i) {
            if (z) {
                return false;
            }
            throw new defpackage.era("expected header type ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))), null, true, 1);
        }
        if (etxVar.n() == 118 && etxVar.n() == 111 && etxVar.n() == 114 && etxVar.n() == 98 && etxVar.n() == 105 && etxVar.n() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new defpackage.era("expected characters 'vorbis'", null, true, 1);
    }

    public static void aB(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void aC(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.bj(i, "csd-"), java.nio.ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static synchronized java.util.concurrent.Executor aD() {
        if (a == null) {
            a = eum.N("ExoPlayer:BackgroundExecutor");
        }
        return a;
    }

    public static defpackage.oq aE(defpackage.etx etxVar, boolean z, boolean z2) throws defpackage.era {
        if (z) {
            aA(3, etxVar, false);
        }
        etxVar.C((int) etxVar.u());
        long jU = etxVar.u();
        java.lang.String[] strArr = new java.lang.String[(int) jU];
        for (int i = 0; i < jU; i++) {
            strArr[i] = etxVar.C((int) etxVar.u());
        }
        if (z2 && (etxVar.n() & 1) == 0) {
            throw new defpackage.era("framing bit expected to be set", null, true, 1);
        }
        return new defpackage.oq(strArr);
    }

    public static ils aF(defpackage.etx etxVar) {
        etxVar.R(1);
        int iP = etxVar.p();
        long j = etxVar.c;
        long j2 = iP;
        int i = iP / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jV = etxVar.v();
            if (jV == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jV;
            jArrCopyOf2[i2] = etxVar.v();
            etxVar.R(2);
        }
        etxVar.R((int) ((j + j2) - ((long) etxVar.c)));
        return new ils(jArrCopyOf, jArrCopyOf2, (byte[]) null);
    }

    public static defpackage.kvt aG(defpackage.evr evrVar, java.lang.String str, byte[] bArr, java.util.Map map) throws java.lang.Throwable {
        defpackage.evv evvVar;
        java.util.Map map2;
        java.util.List list;
        defpackage.ewl ewlVar = new defpackage.ewl(evrVar);
        defpackage.evu evuVar = new defpackage.evu();
        evuVar.b(str);
        evuVar.d = map;
        evuVar.b = 2;
        evuVar.c = bArr;
        evuVar.f = 1;
        defpackage.evv evvVarA = evuVar.a();
        int i = 0;
        defpackage.evv evvVarA2 = evvVarA;
        while (true) {
            try {
                defpackage.evt evtVar = new defpackage.evt(ewlVar, evvVarA2);
                try {
                    byte[] bArrB = aisk.b(evtVar);
                    evvVar = evvVarA;
                    try {
                        defpackage.ffk ffkVar = new defpackage.ffk(-1L, evvVar, android.os.SystemClock.elapsedRealtime());
                        ffkVar.d = ewlVar.b;
                        ffkVar.e = ewlVar.c;
                        ffkVar.g = bArrB.length;
                        defpackage.ffl fflVar = new defpackage.ffl(ffkVar);
                        defpackage.hjx hjxVar = new defpackage.hjx((java.lang.Object) bArrB);
                        hjxVar.a = fflVar;
                        defpackage.kvt kvtVar = new defpackage.kvt(hjxVar);
                        eum.O(evtVar);
                        return kvtVar;
                    } catch (defpackage.ewh e) {
                        e = e;
                        try {
                            int i2 = e.c;
                            java.lang.String str2 = null;
                            if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (java.util.List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (java.lang.String) list.get(0);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i++;
                            defpackage.evu evuVar2 = new defpackage.evu(evvVarA2);
                            evuVar2.b(str2);
                            evvVarA2 = evuVar2.a();
                            try {
                                eum.O(evtVar);
                                evvVarA = evvVar;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                throw new defpackage.fdf(evvVar, ewlVar.b, ewlVar.e(), ewlVar.a, e);
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            java.lang.Throwable th2 = th;
                            eum.O(evtVar);
                            throw th2;
                        }
                    }
                } catch (defpackage.ewh e3) {
                    e = e3;
                    evvVar = evvVarA;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    java.lang.Throwable th4 = th;
                    eum.O(evtVar);
                    throw th4;
                }
                evvVarA = evvVar;
            } catch (java.lang.Exception e4) {
                e = e4;
                evvVar = evvVarA;
            }
        }
    }

    public static boolean aH(rsr rsrVar, kiu kiuVar) {
        defpackage.kir kirVar = kiuVar.D;
        if (kirVar == null) {
            kirVar = defpackage.kir.a;
        }
        if (kirVar.c.isEmpty() && kirVar.e.isEmpty()) {
            mmy mmyVarO = rsrVar.O(kiuVar);
            if (mmyVarO.c.isEmpty() && mmyVarO.d.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static int aI(java.io.InputStream inputStream) {
        return java.nio.ByteBuffer.wrap(aK(inputStream, 4)).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
    }

    private static int aJ(java.io.InputStream inputStream) {
        return java.nio.ByteBuffer.wrap(aK(inputStream, 2)).order(java.nio.ByteOrder.LITTLE_ENDIAN).getShort();
    }

    private static byte[] aK(java.io.InputStream inputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            ahvr.bZ(i3 != -1, "Unexpected end of file while reading WAV file.");
            i2 += i3;
        }
        return bArr;
    }

    private static java.lang.String aL(java.io.InputStream inputStream) {
        return new java.lang.String(aK(inputStream, 4));
    }

    private static java.lang.String aM(java.lang.CharSequence charSequence) {
        return fh$.ExternalSyntheticApiModelOutline0.m(java.util.Locale.getDefault(), charSequence.toString(), fh$.ExternalSyntheticApiModelOutline0.m(), 256);
    }

    private static boolean aN(long j, long j2) {
        long j3 = j2 < j ? j : j2;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        calendar.add(1, -1);
        if (j2 < j) {
            j = j2;
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar.before(calendar2);
    }

    private static java.lang.CharSequence aO(android.content.Context context, long j, boolean z, boolean z2) {
        int i = true != z2 ? 16 : 65552;
        if (!z) {
            i |= 8;
        }
        return aM(android.text.format.DateUtils.formatDateTime(context, j, i | 1));
    }

    private static java.lang.CharSequence aP(android.content.Context context, long j, boolean z) {
        return aM(android.text.format.DateUtils.formatDateTime(context, j, (true != z ? 2 : 32770) | 1));
    }

    private static int aQ(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    public static ads aa(ads adsVar) {
        if (adsVar.b()) {
            ads adsVar2 = adt.a;
            aooh.d(adsVar2, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
            return adsVar2;
        }
        ads adsVar3 = new ads(adsVar.g);
        java.lang.Object[] objArr = adsVar.b;
        long[] jArr = adsVar.c;
        int i = adsVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            adsVar3.d(objArr[i]);
            i = (int) (j & 2147483647L);
        }
        return adsVar3;
    }

    public static java.util.List ab(cer cerVar) {
        return (java.util.List) cerVar.a();
    }

    public static java.util.List ac(cer cerVar) {
        return (java.util.List) cerVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:201:0x039d  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:209:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:296:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:321:0x0676  */
    /* JADX WARN: Code duplicated, block: B:322:0x0679  */
    /* JADX WARN: Code duplicated, block: B:324:0x067c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0682  */
    /* JADX WARN: Code duplicated, block: B:327:0x069f  */
    /* JADX WARN: Code duplicated, block: B:329:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:330:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:333:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:337:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:342:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:347:0x0726  */
    /* JADX WARN: Code duplicated, block: B:352:0x0758  */
    /* JADX WARN: Code duplicated, block: B:357:0x077a  */
    /* JADX WARN: Code duplicated, block: B:360:0x079d  */
    /* JADX WARN: Code duplicated, block: B:363:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:366:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:387:0x083d  */
    /* JADX WARN: Code duplicated, block: B:389:0x0845  */
    /* JADX WARN: Code duplicated, block: B:390:0x0848  */
    /* JADX WARN: Code duplicated, block: B:395:0x0867  */
    /* JADX WARN: Code duplicated, block: B:398:0x089f  */
    /* JADX WARN: Code duplicated, block: B:401:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:404:0x08ae A[PHI: r2
      0x08ae: PHI (r2v52 aonn) = (r2v36 aonn), (r2v53 aonn) binds: [B:403:0x08ac, B:399:0x08a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:405:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:408:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:411:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:414:0x08cf A[PHI: r5
      0x08cf: PHI (r5v73 aonj) = (r5v46 aonj), (r5v74 aonj) binds: [B:413:0x08cd, B:409:0x08c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:415:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:418:0x08de  */
    /* JADX WARN: Code duplicated, block: B:421:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:424:0x08ed A[PHI: r6
      0x08ed: PHI (r6v56 aonj) = (r6v39 aonj), (r6v57 aonj) binds: [B:423:0x08eb, B:419:0x08e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:428:0x08f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:430:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:433:0x0912  */
    /* JADX WARN: Code duplicated, block: B:435:0x0919  */
    /* JADX WARN: Code duplicated, block: B:440:0x0925 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:441:0x0927  */
    /* JADX WARN: Code duplicated, block: B:444:0x093f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:445:0x0941  */
    /* JADX WARN: Code duplicated, block: B:448:0x0957  */
    /* JADX WARN: Code duplicated, block: B:451:0x0969  */
    /* JADX WARN: Code duplicated, block: B:453:0x0989 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:454:0x098b  */
    /* JADX WARN: Code duplicated, block: B:457:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:459:0x09c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:461:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a11 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:467:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:473:0x0aa8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:477:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:480:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:481:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:483:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:485:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:487:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:553:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[RETURN, SYNTHETIC] */
    public static void ad(defpackage.fvx fvxVar, defpackage.fwe fweVar, cmw cmwVar, cmj cmjVar, final aonj aonjVar, aonj aonjVar2, final aonj aonjVar3, aonj aonjVar4, final aonn aonnVar, aonn aonnVar2, cav cavVar, int i, int i2) {
        cmj cmjVar2;
        cav cavVar2;
        cdk cdkVarI;
        defpackage.fxl fxlVar;
        boolean z;
        defpackage.fwn fwnVarB;
        defpackage.fwz fwzVar;
        cer cerVarJ;
        boolean z2;
        fxz fxzVarA;
        fxy fxyVarFd;
        boolean zB;
        java.lang.Object objR;
        defpackage.fxj fxjVar;
        boolean zD;
        java.lang.Object objR2;
        boolean z3;
        boolean zD2;
        java.lang.Object objR3;
        boolean zE;
        float fC;
        int iC;
        boolean zD3;
        java.lang.Object objR4;
        boolean zD4;
        java.lang.Object objR5;
        final cjt cjtVarL;
        cer cerVarJ2;
        java.lang.Object objR6;
        java.lang.Object obj;
        cer cerVar;
        defpackage.fvs fvsVar;
        java.lang.Object objR7;
        defpackage.adm admVar;
        defpackage.fxg fxgVar;
        defpackage.fwn fwnVarB2;
        defpackage.fxg fxgVar2;
        defpackage.fwz fwzVar2;
        int i3;
        boolean z4;
        boolean z5;
        java.lang.Object objR8;
        cbt cbtVar;
        char c;
        final boolean z6;
        final int i4;
        final defpackage.fwz fwzVar3;
        aonj aonjVar5;
        final aonn aonnVar3;
        boolean z7;
        final aonj aonjVar6;
        boolean z8;
        final aonj aonjVar7;
        boolean z9;
        boolean z10;
        java.lang.Object objR9;
        aonj aonjVar8;
        java.lang.Object objR10;
        aonj aonjVar9;
        boolean zD5;
        java.lang.Object objR11;
        java.lang.Object objR12;
        final defpackage.akr akrVar;
        alg algVarC;
        boolean zD6;
        java.lang.Object objR13;
        defpackage.fvs fvsVar2;
        alg algVar;
        boolean z11;
        boolean zD7;
        java.lang.Object objR14;
        defpackage.adm admVar2;
        defpackage.fwz fwzVar4;
        final cer cerVar2;
        java.lang.Object objR15;
        final defpackage.fvs fvsVar3;
        alg algVar2;
        boolean zB2;
        java.lang.Object objR16;
        boolean zB3;
        java.lang.Object objR17;
        android.app.Activity activity;
        android.content.Intent intent;
        int[] intArray;
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle bundleR;
        android.os.Bundle bundle;
        defpackage.fwe fweVarG;
        defpackage.fwb fwbVarO;
        android.os.Bundle bundleC;
        java.util.ArrayList arrayList;
        int length;
        java.lang.String strAe;
        defpackage.fwc fwcVarK;
        defpackage.fwe fweVar2;
        android.os.Bundle bundle2;
        defpackage.fwc fwcVarK2;
        defpackage.fwe fweVar3;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(82273676);
        int i6 = i5 == 0 ? (true != cavVarB.D(fvxVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i6 |= true != cavVarB.D(fweVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i6 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cmjVar2 = cmjVar;
            i6 |= true != cavVarB.B(cmjVar2) ? 1024 : 2048;
        } else {
            cmjVar2 = cmjVar;
        }
        if ((i & 24576) == 0) {
            i6 |= true != cavVarB.D(aonjVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i6 |= true != cavVarB.D(aonjVar2) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i6 |= true != cavVarB.D(aonjVar3) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i6 |= true != cavVarB.D(aonjVar4) ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i6 |= true != cavVarB.D(aonnVar) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i6 |= true != cavVarB.D(aonnVar2) ? 268435456 : 536870912;
        }
        int i7 = i6;
        int i8 = (i2 & 6) == 0 ? i2 | (true != cavVarB.D((java.lang.Object) null) ? 2 : 4) : i2;
        if (cavVarB.H(((306783379 & i7) == 306783378 && (i8 & 3) == 2) ? false : true, i7 & 1)) {
            cbt cbtVar2 = (cbt) cavVarB;
            cbtVar2.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            emx emxVar = (emx) cavVarB.e(eom.a);
            cbd cbdVar = eov.a;
            eoi eoiVarA = eov.a(cavVarB);
            if (eoiVarA == null) {
                throw new java.lang.IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            eoh eohVarS = eoiVarA.S();
            if (eohVarS == null) {
                aooh.i("viewModelStore");
                aooh.i("viewModelStore");
            }
            defpackage.fxr fxrVar = fvxVar.b;
            if (eohVarS == null) {
                aooh.i("viewModelStore");
            }
            if (fxrVar.t == null) {
                if (!fxrVar.f.isEmpty()) {
                    throw new java.lang.IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                fxrVar.t = new defpackage.fwl(new izg(eohVarS, eoo.a));
            }
            aooh.f(fweVar, "graph");
            aooh.f(fweVar, "graph");
            aooh.f(fweVar, "graph");
            aojw aojwVar = fxrVar.f;
            if (!aojwVar.isEmpty() && fxrVar.a() == emq.a) {
                throw new java.lang.IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (aooh.n(fxrVar.c, fweVar)) {
                int iC2 = fweVar.j().c();
                for (int i9 = 0; i9 < iC2; i9++) {
                    defpackage.fwc fwcVar = (defpackage.fwc) fweVar.j().e(i9);
                    defpackage.fwe fweVar4 = fxrVar.c;
                    aooh.c(fweVar4);
                    int iB = fweVar4.j().b(i9);
                    defpackage.fwe fweVar5 = fxrVar.c;
                    aooh.c(fweVar5);
                    aed aedVarJ = fweVar5.j();
                    int iA = aedVarJ.a(iB);
                    if (iA >= 0) {
                        java.lang.Object[] objArr = aedVarJ.c;
                        java.lang.Object obj2 = objArr[iA];
                        objArr[iA] = fwcVar;
                    }
                }
                for (defpackage.fvs fvsVar4 : fxrVar.f) {
                    aokn aoknVarBu = ajsz.bu(aooc.k(defpackage.hgt.Y(fvsVar4.a)));
                    defpackage.fwc fwcVarK3 = fxrVar.c;
                    aooh.c(fwcVarK3);
                    aokm aokmVar = new aokm(aoknVarBu, 0);
                    while (aokmVar.hasNext()) {
                        defpackage.fwc fwcVar2 = (defpackage.fwc) aokmVar.next();
                        if (!aooh.n(fwcVar2, fxrVar.c) || !aooh.n(fwcVarK3, fweVar)) {
                            if (fwcVarK3 instanceof defpackage.fwe) {
                                fwcVarK3 = ((defpackage.fwe) fwcVarK3).k(fwcVar2.b());
                                aooh.c(fwcVarK3);
                            }
                        }
                    }
                    aooh.f(fwcVarK3, "<set-?>");
                    fvsVar4.a = fwcVarK3;
                }
            } else {
                defpackage.fwe fweVar6 = fxrVar.c;
                if (fweVar6 != null) {
                    java.util.Iterator it = new java.util.ArrayList(fxrVar.h.keySet()).iterator();
                    while (it.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) it.next();
                        aooh.c(num);
                        int iIntValue = num.intValue();
                        java.util.Map map = fxrVar.n;
                        java.util.Iterator it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            ((defpackage.fvu) it2.next()).c = true;
                            it = it;
                            fweVar6 = fweVar6;
                        }
                        defpackage.fwe fweVar7 = fweVar6;
                        java.util.Iterator it3 = it;
                        boolean zR = fxrVar.r(iIntValue, null, defpackage.hgt.U(new defpackage.fvt(11)));
                        java.util.Iterator it4 = map.values().iterator();
                        while (it4.hasNext()) {
                            ((defpackage.fvu) it4.next()).c = false;
                            zR = zR;
                        }
                        if (zR) {
                            fxrVar.m(iIntValue, true, false);
                        }
                        it = it3;
                        fweVar6 = fweVar7;
                    }
                    fxrVar.m(fweVar6.b(), true, false);
                }
                fxrVar.c = fweVar;
                android.os.Bundle bundle3 = fxrVar.d;
                if (bundle3 != null && gie.f(bundle3, "android-support-nav:controller:navigatorState:names")) {
                    for (java.lang.String str : gie.d(bundle3, "android-support-nav:controller:navigatorState:names")) {
                        fxrVar.m.b(str);
                        if (gie.f(bundle3, str)) {
                            gie.a(bundle3, str);
                        }
                    }
                }
                android.os.Bundle[] bundleArr = fxrVar.e;
                if (bundleArr != null) {
                    int i10 = 0;
                    while (i10 < bundleArr.length) {
                        defpackage.vk vkVar = new defpackage.vk(bundleArr[i10]);
                        android.os.Bundle[] bundleArr2 = bundleArr;
                        defpackage.fwc fwcVarD = fxrVar.d(vkVar.c(), null);
                        if (fwcVarD == null) {
                            int i11 = defpackage.fwc.e;
                            throw new java.lang.IllegalStateException("Restoring the Navigation back stack failed: destination " + defpackage.hgt.ae(fxrVar.u(), vkVar.c()) + " cannot be found from the current destination " + fxrVar.e());
                        }
                        int i12 = i10;
                        defpackage.fvs fvsVarH = vkVar.h(fxrVar.u(), fwcVarD, fxrVar.a(), fxrVar.t);
                        defpackage.fwn fwnVarB3 = fxrVar.m.b(fwcVarD.a);
                        java.util.Map map2 = fxrVar.n;
                        java.lang.Object objB = map2.get(fwnVarB3);
                        if (objB == null) {
                            objB = fxrVar.a.b(fwnVarB3);
                            map2.put(fwnVarB3, objB);
                        }
                        aojwVar.addLast(fvsVarH);
                        ((defpackage.fvu) objB).b(fvsVarH);
                        defpackage.fwe fweVar8 = fvsVarH.a.c;
                        if (fweVar8 != null) {
                            fxrVar.j(fvsVarH, fxrVar.b(fweVar8.b()));
                        }
                        i10 = i12 + 1;
                        bundleArr = bundleArr2;
                    }
                    fxrVar.b.a();
                    fxrVar.e = null;
                }
                java.util.Collection collectionValues = fxrVar.m.c().values();
                java.util.ArrayList<defpackage.fwn> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : collectionValues) {
                    if (!((defpackage.fwn) obj3).b) {
                        arrayList2.add(obj3);
                    }
                }
                for (defpackage.fwn fwnVar : arrayList2) {
                    java.util.Map map3 = fxrVar.n;
                    java.lang.Object objB2 = map3.get(fwnVar);
                    if (objB2 == null) {
                        objB2 = fxrVar.a.b(fwnVar);
                        map3.put(fwnVar, objB2);
                    }
                    fwnVar.a = (defpackage.fvu) objB2;
                    fwnVar.b = true;
                }
                if (fxrVar.c != null && aojwVar.isEmpty()) {
                    defpackage.fvx fvxVar2 = fxrVar.a;
                    if (fvxVar2.d || (activity = fvxVar2.c) == null || (intent = activity.getIntent()) == null) {
                        defpackage.fwe fweVar9 = fxrVar.c;
                        aooh.c(fweVar9);
                        fxrVar.o(fweVar9, null, null);
                    } else {
                        android.os.Bundle extras = intent.getExtras();
                        boolean z12 = extras != null && extras.containsKey("android-support-nav:controller:deepLinkIds") && fvxVar2.f(intent);
                        if (z12) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                z12 = z12;
                            } catch (java.lang.Exception e) {
                                java.util.Objects.toString(intent);
                                android.util.Log.e("NavController", "handleDeepLink() could not extract deepLink from ".concat(intent.toString()), e);
                                intArray = null;
                            }
                            if (z12) {
                                parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                            } else {
                                parcelableArrayList = null;
                            }
                            bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                            if (z12) {
                                bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundleR.putAll(bundle);
                            }
                            if ((intArray != null || intArray.length == 0) && (fwbVarO = (fweVarG = fvxVar2.b.g()).o(defpackage.hgt.aa(intent), fweVarG)) != null) {
                                defpackage.fwc fwcVar3 = fwbVarO.a;
                                int[] iArrH = fwcVar3.h(null);
                                bundleC = fwcVar3.c(fwbVarO.b);
                                if (bundleC != null) {
                                    bundleR.putAll(bundleC);
                                }
                                intArray = iArrH;
                                arrayList = null;
                            } else {
                                arrayList = parcelableArrayList;
                            }
                            if (intArray != null || (length = intArray.length) == 0) {
                                defpackage.fwe fweVar10 = fxrVar.c;
                                aooh.c(fweVar10);
                                fxrVar.o(fweVar10, null, null);
                            } else {
                                defpackage.fxr fxrVar2 = fvxVar2.b;
                                defpackage.fwe fweVar11 = fxrVar2.c;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        strAe = null;
                                        break;
                                    }
                                    int i14 = length;
                                    int i15 = intArray[i13];
                                    if (i13 == 0) {
                                        defpackage.fwe fweVar12 = fxrVar2.c;
                                        aooh.c(fweVar12);
                                        fwcVarK2 = fweVar12.b() == i15 ? fxrVar2.c : null;
                                    } else {
                                        aooh.c(fweVar11);
                                        fwcVarK2 = fweVar11.k(i15);
                                    }
                                    if (fwcVarK2 == null) {
                                        strAe = defpackage.hgt.ae(fxrVar2.u(), i15);
                                        break;
                                    }
                                    if (i13 != intArray.length - 1 && (fwcVarK2 instanceof defpackage.fwe)) {
                                        while (true) {
                                            fweVar3 = (defpackage.fwe) fwcVarK2;
                                            aooh.c(fweVar3);
                                            if (!(fweVar3.k(fweVar3.i()) instanceof defpackage.fwe)) {
                                                break;
                                            } else {
                                                fwcVarK2 = fweVar3.k(fweVar3.i());
                                            }
                                        }
                                        fweVar11 = fweVar3;
                                    }
                                    i13++;
                                    length = i14;
                                }
                                if (strAe != null) {
                                    android.util.Log.i("NavController", a.bo(intent, strAe, "Could not find destination ", " in the navigation graph, ignoring the deep link from "));
                                    defpackage.fwe fweVar13 = fxrVar.c;
                                    aooh.c(fweVar13);
                                    fxrVar.o(fweVar13, null, null);
                                } else {
                                    gij.a(bundleR, "android-support-nav:controller:deepLinkIntent", intent);
                                    int length2 = intArray.length;
                                    android.os.Bundle[] bundleArr3 = new android.os.Bundle[length2];
                                    for (int i16 = 0; i16 < length2; i16++) {
                                        android.os.Bundle bundleR2 = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                                        bundleR2.putAll(bundleR);
                                        if (arrayList != null && (bundle2 = (android.os.Bundle) arrayList.get(i16)) != null) {
                                            bundleR2.putAll(bundle2);
                                        }
                                        bundleArr3[i16] = bundleR2;
                                    }
                                    int flags = intent.getFlags();
                                    if ((flags & 268435456) == 0) {
                                        defpackage.fwe fweVar14 = fxrVar2.c;
                                        int i17 = 0;
                                        for (int length3 = intArray.length; i17 < length3; length3 = length3) {
                                            int i18 = intArray[i17];
                                            android.os.Bundle bundle4 = bundleArr3[i17];
                                            if (i17 == 0) {
                                                fwcVarK = fxrVar2.c;
                                            } else {
                                                aooh.c(fweVar14);
                                                fwcVarK = fweVar14.k(i18);
                                            }
                                            if (fwcVarK == null) {
                                                int i19 = defpackage.fwc.e;
                                                throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.hgt.ae(fvxVar2.g, i18) + " cannot be found in graph " + fweVar14);
                                            }
                                            if (i17 == intArray.length - 1) {
                                                defpackage.fwi fwiVar = new defpackage.fwi();
                                                defpackage.fwe fweVar15 = fxrVar2.c;
                                                aooh.c(fweVar15);
                                                fwiVar.b(fweVar15.b(), true, false);
                                                fwiVar.c = 0;
                                                fwiVar.d = 0;
                                                fvxVar2.g(fwcVarK, bundle4, fwiVar.a());
                                            } else if (fwcVarK instanceof defpackage.fwe) {
                                                while (true) {
                                                    fweVar2 = (defpackage.fwe) fwcVarK;
                                                    aooh.c(fweVar2);
                                                    if (!(fweVar2.k(fweVar2.i()) instanceof defpackage.fwe)) {
                                                        break;
                                                    } else {
                                                        fwcVarK = fweVar2.k(fweVar2.i());
                                                    }
                                                }
                                                fweVar14 = fweVar2;
                                            }
                                            i17++;
                                        }
                                        fvxVar2.d = true;
                                    } else if ((flags & 32768) == 0) {
                                        intent.addFlags(32768);
                                        defpackage.dvw dvwVar = new defpackage.dvw(fvxVar2.a);
                                        dvwVar.b(intent);
                                        dvwVar.d();
                                        android.app.Activity activity2 = fvxVar2.c;
                                        if (activity2 != null) {
                                            activity2.finish();
                                            activity2.overridePendingTransition(0, 0);
                                            z = false;
                                        }
                                    } else {
                                        if (!fxrVar2.f.isEmpty()) {
                                            defpackage.fwe fweVar16 = fxrVar2.c;
                                            aooh.c(fweVar16);
                                            fxrVar2.m(fweVar16.b(), true, false);
                                        }
                                        int i20 = 0;
                                        while (i20 < intArray.length) {
                                            int i21 = intArray[i20];
                                            int i22 = i20 + 1;
                                            android.os.Bundle bundle5 = bundleArr3[i20];
                                            defpackage.fwc fwcVarD2 = fxrVar2.d(i21, null);
                                            if (fwcVarD2 == null) {
                                                int i23 = defpackage.fwc.e;
                                                throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.hgt.ae(fvxVar2.g, i21) + " cannot be found from the current destination " + fvxVar2.c());
                                            }
                                            fvxVar2.g(fwcVarD2, bundle5, defpackage.hgt.U(new dpz(fwcVarD2, fvxVar2, 8)));
                                            i20 = i22;
                                        }
                                        fvxVar2.d = true;
                                    }
                                }
                            }
                        }
                        intArray = null;
                        if (z12) {
                            parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        } else {
                            parcelableArrayList = null;
                        }
                        bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                        if (z12) {
                            bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                        } else {
                            bundle = null;
                        }
                        if (bundle != null) {
                            bundleR.putAll(bundle);
                        }
                        if (intArray != null) {
                            defpackage.fwc fwcVar4 = fwbVarO.a;
                            int[] iArrH2 = fwcVar4.h(null);
                            bundleC = fwcVar4.c(fwbVarO.b);
                            if (bundleC != null) {
                                bundleR.putAll(bundleC);
                            }
                            intArray = iArrH2;
                            arrayList = null;
                        } else {
                            defpackage.fwc fwcVar5 = fwbVarO.a;
                            int[] iArrH3 = fwcVar5.h(null);
                            bundleC = fwcVar5.c(fwbVarO.b);
                            if (bundleC != null) {
                                bundleR.putAll(bundleC);
                            }
                            intArray = iArrH3;
                            arrayList = null;
                        }
                        if (intArray != null) {
                            defpackage.fwe fweVar17 = fxrVar.c;
                            aooh.c(fweVar17);
                            fxrVar.o(fweVar17, null, null);
                        } else {
                            defpackage.fwe fweVar18 = fxrVar.c;
                            aooh.c(fweVar18);
                            fxrVar.o(fweVar18, null, null);
                        }
                    }
                    fwnVarB = fvxVar.e().b("composable");
                    if (fwnVarB instanceof defpackage.fwz) {
                        fwzVar = (defpackage.fwz) fwnVarB;
                    } else {
                        fwzVar = null;
                    }
                    if (fwzVar == null) {
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            return;
                        } else {
                            fxlVar = new defpackage.fxl(fvxVar, fweVar, cmwVar, cmjVar2, aonjVar, aonjVar2, aonjVar3, aonjVar4, aonnVar, aonnVar2, i, i2, 1);
                        }
                    } else {
                        cerVarJ = cdh.j(fwzVar.d(), cavVarB);
                        if (ab(cerVarJ).size() > 1) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        int i24 = defpackage.fyj.a;
                        fxzVarA = defpackage.fyj.a(cavVarB);
                        if (fxzVarA != null) {
                            throw new java.lang.IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        fxyVarFd = fxzVarA.fd();
                        zB = cavVarB.B(fwzVar);
                        objR = cbtVar2.R();
                        if (zB || objR == cau.a) {
                            objR = new defpackage.fxj(fwzVar);
                            cbtVar2.ab(objR);
                        }
                        fxjVar = (defpackage.fxj) objR;
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                        zD = cavVarB.D(fxjVar) | cavVarB.C(z2);
                        objR2 = cbtVar2.R();
                        if (zD || objR2 == cau.a) {
                            objR2 = new afw(fxjVar, z2, 2);
                            cbtVar2.ab(objR2);
                        }
                        z3 = true;
                        defpackage.avo.n(boolValueOf, fxjVar, null, (aonj) objR2, cavVarB, 0);
                        cavVar2 = cavVarB;
                        zD2 = cavVar2.D(fxyVarFd) | cavVar2.D(fxjVar);
                        objR3 = cbtVar2.R();
                        if (zD2 || objR3 == cau.a) {
                            objR3 = new dpz(fxyVarFd, fxjVar, 9);
                            cbtVar2.ab(objR3);
                        }
                        cbp.b(fxyVarFd, fxjVar, (aonj) objR3, cavVar2);
                        zE = fxjVar.e();
                        fC = fxjVar.a.c();
                        iC = fxjVar.b.c();
                        zD3 = cavVar2.D(fvxVar) | cavVar2.D(emxVar);
                        objR4 = cbtVar2.R();
                        if (zD3 || objR4 == cau.a) {
                            objR4 = new dpz(fvxVar, emxVar, 10);
                            cbtVar2.ab(objR4);
                        }
                        cbp.c(emxVar, (aonj) objR4, cavVar2);
                        zD4 = cavVar2.D(fxjVar) | cavVar2.B(cerVarJ);
                        objR5 = cbtVar2.R();
                        if (zD4 || objR5 == cau.a) {
                            objR5 = new defpackage.bxq(fxjVar, cerVarJ, 15);
                            cbtVar2.ab(objR5);
                        }
                        cavVar2.r((aomy) objR5);
                        cjtVarL = cfd.l(cavVar2);
                        cerVarJ2 = cdh.j(fvxVar.b.g, cavVar2);
                        objR6 = cbtVar2.R();
                        obj = cau.a;
                        if (objR6 == obj) {
                            defpackage.dqk dqkVar = new defpackage.dqk(cerVarJ2, 20);
                            ajxw ajxwVar = ceo.a;
                            cbk cbkVar = new cbk(dqkVar, (cen) null);
                            cbtVar2.ab(cbkVar);
                            objR6 = cbkVar;
                        }
                        cerVar = (cer) objR6;
                        fvsVar = (defpackage.fvs) ajsz.bJ(ac(cerVar));
                        objR7 = cbtVar2.R();
                        if (objR7 == obj) {
                            int i25 = defpackage.adn.a;
                            objR7 = new defpackage.adm(6);
                            cbtVar2.ab(objR7);
                        }
                        admVar = (defpackage.adm) objR7;
                        if (fvsVar != null) {
                            cavVar2.u(-1407334051);
                            boolean zC = cavVar2.C(zE) | cavVar2.z(iC) | ((((i7 & 234881024) ^ 100663296) <= 67108864 && cavVar2.B(aonnVar)) || (i7 & 100663296) == 67108864) | cavVar2.D(fwzVar) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && cavVar2.B(aonjVar3)) || (i7 & 1572864) == 1048576);
                            if (((i7 & 57344) ^ 24576) > 16384 || !cavVar2.B(aonjVar)) {
                                fwzVar2 = fwzVar;
                                i3 = i7;
                                if ((i3 & 24576) == 16384) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                fwzVar2 = fwzVar;
                                z4 = true;
                                i3 = i7;
                            }
                            z5 = zC | z4;
                            objR8 = cbtVar2.R();
                            if (!z5 || objR8 == obj) {
                                final int i26 = 1;
                                cbtVar = cbtVar2;
                                c = 0;
                                z6 = zE;
                                i4 = iC;
                                fwzVar3 = fwzVar2;
                                objR8 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i26 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i27 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i28 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar3.a(aesVar);
                                            }
                                            int i29 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar3.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(objR8);
                            } else {
                                z6 = zE;
                                i4 = iC;
                                cbtVar = cbtVar2;
                                fwzVar3 = fwzVar2;
                                c = 0;
                            }
                            aonjVar5 = (aonj) objR8;
                            boolean zC2 = cavVar2.C(z6) | cavVar2.z(i4);
                            if (((i3 & 1879048192) ^ 805306368) > 536870912) {
                                aonnVar3 = aonnVar2;
                                if (!cavVar2.B(aonnVar3)) {
                                    z7 = true;
                                }
                                boolean zD8 = zC2 | z7 | cavVar2.D(fwzVar3);
                                if (((i3 & 29360128) ^ 12582912) > c) {
                                    aonjVar6 = aonjVar4;
                                    if (!cavVar2.B(aonjVar6)) {
                                        z8 = true;
                                    }
                                    boolean z13 = zD8 | z8;
                                    if (((i3 & 458752) ^ 196608) > 131072) {
                                        aonjVar7 = aonjVar2;
                                        if (!cavVar2.B(aonjVar7)) {
                                            z9 = true;
                                        }
                                        z10 = z13 | z9;
                                        objR9 = cbtVar.R();
                                        if (z10 || objR9 == obj) {
                                            final int i27 = 0;
                                            aonj aonjVar10 = new aonj() { // from class: fxm
                                                public final java.lang.Object a(java.lang.Object obj4) {
                                                    if (i27 != 0) {
                                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                        if (z6) {
                                                            int i28 = defpackage.fwc.e;
                                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                            while (itA.hasNext()) {
                                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                                }
                                                            }
                                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                        }
                                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                            int i29 = defpackage.fwc.e;
                                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                            while (itA2.hasNext()) {
                                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                                }
                                                            }
                                                            return (agf) aonjVar6.a(aesVar);
                                                        }
                                                        int i210 = defpackage.fwc.e;
                                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA3.hasNext()) {
                                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                            if (fwcVar9 instanceof defpackage.fwy) {
                                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar7.a(aesVar);
                                                    }
                                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                    if (z6) {
                                                        int i30 = defpackage.fwc.e;
                                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                        while (itA4.hasNext()) {
                                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                            if (fwcVar11 instanceof defpackage.fwy) {
                                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i31 = defpackage.fwc.e;
                                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                        while (itA5.hasNext()) {
                                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                            if (fwcVar12 instanceof defpackage.fwy) {
                                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agg) aonjVar6.a(aesVar2);
                                                    }
                                                    int i32 = defpackage.fwc.e;
                                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA6.hasNext()) {
                                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                        if (fwcVar13 instanceof defpackage.fwy) {
                                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar7.a(aesVar2);
                                                }
                                            };
                                            cbtVar.ab(aonjVar10);
                                            objR9 = aonjVar10;
                                        }
                                        aonjVar8 = (aonj) objR9;
                                        if ((((i8 & 14) ^ 6) > 4 || !cavVar2.B((java.lang.Object) null)) && (i8 & 6) != 4) {
                                        }
                                        objR10 = cbtVar.R();
                                        if (z3 || objR10 == obj) {
                                            objR10 = new defpackage.fvt(9);
                                            cbtVar.ab(objR10);
                                        }
                                        aonjVar9 = (aonj) objR10;
                                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                        zD5 = cavVar2.D(fwzVar3);
                                        objR11 = cbtVar.R();
                                        if (zD5 || objR11 == obj) {
                                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                            cbtVar.ab(objR11);
                                        }
                                        cbp.c(bool, (aonj) objR11, cavVar2);
                                        objR12 = cbtVar.R();
                                        if (objR12 == obj) {
                                            objR12 = new defpackage.akr(fvsVar);
                                            cbtVar.ab(objR12);
                                        }
                                        akrVar = (defpackage.akr) objR12;
                                        algVarC = alk.c(akrVar, cavVar2, 48);
                                        if (z6) {
                                            cavVar2.u(-1404600068);
                                            java.lang.Float fValueOf = java.lang.Float.valueOf(fC);
                                            zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                            objR17 = cbtVar.R();
                                            if (zB3 || objR17 == obj) {
                                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                                cbtVar.ab(objR17);
                                            }
                                            cbp.g(fValueOf, (aonn) objR17, cavVar2);
                                            z11 = false;
                                            cbtVar.W(false);
                                            algVar = algVarC;
                                            fvsVar2 = fvsVar;
                                        } else {
                                            cavVar2.u(-1404181630);
                                            zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                            objR13 = cbtVar.R();
                                            if (!zD6 || objR13 == obj) {
                                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                                fvsVar2 = fvsVar;
                                                algVar = algVarC;
                                                cbtVar.ab(objR13);
                                            } else {
                                                algVar = algVarC;
                                                fvsVar2 = fvsVar;
                                            }
                                            cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                            z11 = false;
                                            cbtVar.W(false);
                                        }
                                        zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                        objR14 = cbtVar.R();
                                        if (!zD7 || objR14 == obj) {
                                            defpackage.fwz fwzVar5 = fwzVar3;
                                            objR14 = new defpackage.fxn(admVar, fwzVar5, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                            admVar2 = admVar;
                                            fwzVar4 = fwzVar5;
                                            cerVar2 = cerVar;
                                            cbtVar.ab(objR14);
                                        } else {
                                            fwzVar4 = fwzVar3;
                                            admVar2 = admVar;
                                            cerVar2 = cerVar;
                                        }
                                        aonj aonjVar11 = (aonj) objR14;
                                        objR15 = cbtVar.R();
                                        if (objR15 == obj) {
                                            objR15 = new defpackage.fvt(10);
                                            cbtVar.ab(objR15);
                                        }
                                        final boolean z14 = z6;
                                        fvsVar3 = fvsVar2;
                                        boolean z15 = z11;
                                        fxgVar = null;
                                        algVar2 = algVar;
                                        uu.b(algVar2, cmwVar, aonjVar11, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                            public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                                java.lang.Object objPrevious;
                                                aer aerVar = (aer) obj4;
                                                defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                                cav cavVar3 = (cav) obj6;
                                                ((java.lang.Integer) obj7).intValue();
                                                boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                                if (!z14 && !zN) {
                                                    java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                                    java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                                    do {
                                                        if (!listIterator.hasPrevious()) {
                                                            objPrevious = null;
                                                            break;
                                                        }
                                                        objPrevious = listIterator.previous();
                                                    } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                                    fvsVar5 = (defpackage.fvs) objPrevious;
                                                }
                                                if (fvsVar5 == null) {
                                                    cavVar3.u(872360807);
                                                    cavVar3.o();
                                                } else {
                                                    cjt cjtVar = cjtVarL;
                                                    cavVar3.u(-1218785318);
                                                    defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                                    cavVar3.o();
                                                }
                                                return aojh.a;
                                            }
                                        }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                        java.lang.Object objF = algVar2.f();
                                        java.lang.Object objH = algVar2.h();
                                        zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                        objR16 = cbtVar.R();
                                        if (zB2 || objR16 == obj) {
                                            defpackage.acub acubVar = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                            cbtVar.ab(acubVar);
                                            objR16 = acubVar;
                                        }
                                        cbp.f(objF, objH, (aonn) objR16, cavVar2);
                                        cbtVar.W(z15);
                                    } else {
                                        aonjVar7 = aonjVar2;
                                    }
                                    if ((i3 & 196608) == 131072) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    z10 = z13 | z9;
                                    objR9 = cbtVar.R();
                                    if (z10) {
                                        final int i28 = 0;
                                        aonj aonjVar12 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i28 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i29 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i210 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i211 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar12);
                                        objR9 = aonjVar12;
                                    } else {
                                        final int i29 = 0;
                                        aonj aonjVar13 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i29 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i210 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i211 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i212 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar13);
                                        objR9 = aonjVar13;
                                    }
                                    aonjVar8 = (aonj) objR9;
                                    z3 = ((i8 & 14) ^ 6) > 4 ? false : false;
                                    objR10 = cbtVar.R();
                                    if (z3) {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    } else {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    }
                                    aonjVar9 = (aonj) objR10;
                                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                    zD5 = cavVar2.D(fwzVar3);
                                    objR11 = cbtVar.R();
                                    if (zD5) {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    } else {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    }
                                    cbp.c(bool2, (aonj) objR11, cavVar2);
                                    objR12 = cbtVar.R();
                                    if (objR12 == obj) {
                                        objR12 = new defpackage.akr(fvsVar);
                                        cbtVar.ab(objR12);
                                    }
                                    akrVar = (defpackage.akr) objR12;
                                    algVarC = alk.c(akrVar, cavVar2, 48);
                                    if (z6) {
                                        cavVar2.u(-1404600068);
                                        java.lang.Float fValueOf2 = java.lang.Float.valueOf(fC);
                                        zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                        objR17 = cbtVar.R();
                                        if (zB3) {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        } else {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        }
                                        cbp.g(fValueOf2, (aonn) objR17, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                        algVar = algVarC;
                                        fvsVar2 = fvsVar;
                                    } else {
                                        cavVar2.u(-1404181630);
                                        zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                        objR13 = cbtVar.R();
                                        if (zD6) {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        } else {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        }
                                        cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                    }
                                    zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                    objR14 = cbtVar.R();
                                    if (zD7) {
                                        defpackage.fwz fwzVar6 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar6, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar6;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    } else {
                                        defpackage.fwz fwzVar7 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar7, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar7;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    }
                                    aonj aonjVar14 = (aonj) objR14;
                                    objR15 = cbtVar.R();
                                    if (objR15 == obj) {
                                        objR15 = new defpackage.fvt(10);
                                        cbtVar.ab(objR15);
                                    }
                                    final boolean z16 = z6;
                                    fvsVar3 = fvsVar2;
                                    boolean z17 = z11;
                                    fxgVar = null;
                                    algVar2 = algVar;
                                    uu.b(algVar2, cmwVar, aonjVar14, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                        public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                            java.lang.Object objPrevious;
                                            aer aerVar = (aer) obj4;
                                            defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                            cav cavVar3 = (cav) obj6;
                                            ((java.lang.Integer) obj7).intValue();
                                            boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                            if (!z16 && !zN) {
                                                java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                                java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                                do {
                                                    if (!listIterator.hasPrevious()) {
                                                        objPrevious = null;
                                                        break;
                                                    }
                                                    objPrevious = listIterator.previous();
                                                } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                                fvsVar5 = (defpackage.fvs) objPrevious;
                                            }
                                            if (fvsVar5 == null) {
                                                cavVar3.u(872360807);
                                                cavVar3.o();
                                            } else {
                                                cjt cjtVar = cjtVarL;
                                                cavVar3.u(-1218785318);
                                                defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                                cavVar3.o();
                                            }
                                            return aojh.a;
                                        }
                                    }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                    java.lang.Object objF2 = algVar2.f();
                                    java.lang.Object objH2 = algVar2.h();
                                    zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                    objR16 = cbtVar.R();
                                    if (zB2) {
                                        defpackage.acub acubVar2 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar2);
                                        objR16 = acubVar2;
                                    } else {
                                        defpackage.acub acubVar3 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar3);
                                        objR16 = acubVar3;
                                    }
                                    cbp.f(objF2, objH2, (aonn) objR16, cavVar2);
                                    cbtVar.W(z17);
                                } else {
                                    aonjVar6 = aonjVar4;
                                }
                                if ((i3 & 12582912) == c) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                boolean z18 = zD8 | z8;
                                if (((i3 & 458752) ^ 196608) > 131072) {
                                    aonjVar7 = aonjVar2;
                                    if (!cavVar2.B(aonjVar7)) {
                                        z9 = true;
                                    }
                                    z10 = z18 | z9;
                                    objR9 = cbtVar.R();
                                    if (z10) {
                                        final int i210 = 0;
                                        aonj aonjVar15 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i210 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i211 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i212 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i213 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar15);
                                        objR9 = aonjVar15;
                                    } else {
                                        final int i211 = 0;
                                        aonj aonjVar16 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i211 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i212 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i213 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i214 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar16);
                                        objR9 = aonjVar16;
                                    }
                                    aonjVar8 = (aonj) objR9;
                                    if (((i8 & 14) ^ 6) > 4) {
                                    }
                                    objR10 = cbtVar.R();
                                    if (z3) {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    } else {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    }
                                    aonjVar9 = (aonj) objR10;
                                    java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                                    zD5 = cavVar2.D(fwzVar3);
                                    objR11 = cbtVar.R();
                                    if (zD5) {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    } else {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    }
                                    cbp.c(bool3, (aonj) objR11, cavVar2);
                                    objR12 = cbtVar.R();
                                    if (objR12 == obj) {
                                        objR12 = new defpackage.akr(fvsVar);
                                        cbtVar.ab(objR12);
                                    }
                                    akrVar = (defpackage.akr) objR12;
                                    algVarC = alk.c(akrVar, cavVar2, 48);
                                    if (z6) {
                                        cavVar2.u(-1404600068);
                                        java.lang.Float fValueOf3 = java.lang.Float.valueOf(fC);
                                        zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                        objR17 = cbtVar.R();
                                        if (zB3) {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        } else {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        }
                                        cbp.g(fValueOf3, (aonn) objR17, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                        algVar = algVarC;
                                        fvsVar2 = fvsVar;
                                    } else {
                                        cavVar2.u(-1404181630);
                                        zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                        objR13 = cbtVar.R();
                                        if (zD6) {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        } else {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        }
                                        cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                    }
                                    zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                    objR14 = cbtVar.R();
                                    if (zD7) {
                                        defpackage.fwz fwzVar8 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar8, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar8;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    } else {
                                        defpackage.fwz fwzVar9 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar9, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar9;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    }
                                    aonj aonjVar17 = (aonj) objR14;
                                    objR15 = cbtVar.R();
                                    if (objR15 == obj) {
                                        objR15 = new defpackage.fvt(10);
                                        cbtVar.ab(objR15);
                                    }
                                    final boolean z19 = z6;
                                    fvsVar3 = fvsVar2;
                                    boolean z110 = z11;
                                    fxgVar = null;
                                    algVar2 = algVar;
                                    uu.b(algVar2, cmwVar, aonjVar17, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                        public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                            java.lang.Object objPrevious;
                                            aer aerVar = (aer) obj4;
                                            defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                            cav cavVar3 = (cav) obj6;
                                            ((java.lang.Integer) obj7).intValue();
                                            boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                            if (!z19 && !zN) {
                                                java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                                java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                                do {
                                                    if (!listIterator.hasPrevious()) {
                                                        objPrevious = null;
                                                        break;
                                                    }
                                                    objPrevious = listIterator.previous();
                                                } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                                fvsVar5 = (defpackage.fvs) objPrevious;
                                            }
                                            if (fvsVar5 == null) {
                                                cavVar3.u(872360807);
                                                cavVar3.o();
                                            } else {
                                                cjt cjtVar = cjtVarL;
                                                cavVar3.u(-1218785318);
                                                defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                                cavVar3.o();
                                            }
                                            return aojh.a;
                                        }
                                    }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                    java.lang.Object objF3 = algVar2.f();
                                    java.lang.Object objH3 = algVar2.h();
                                    zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                    objR16 = cbtVar.R();
                                    if (zB2) {
                                        defpackage.acub acubVar4 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar4);
                                        objR16 = acubVar4;
                                    } else {
                                        defpackage.acub acubVar5 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar5);
                                        objR16 = acubVar5;
                                    }
                                    cbp.f(objF3, objH3, (aonn) objR16, cavVar2);
                                    cbtVar.W(z110);
                                } else {
                                    aonjVar7 = aonjVar2;
                                }
                                if ((i3 & 196608) == 131072) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 = z18 | z9;
                                objR9 = cbtVar.R();
                                if (z10) {
                                    final int i212 = 0;
                                    aonj aonjVar18 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i212 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i213 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i214 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i215 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar18);
                                    objR9 = aonjVar18;
                                } else {
                                    final int i213 = 0;
                                    aonj aonjVar19 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i213 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i214 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i215 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i216 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar19);
                                    objR9 = aonjVar19;
                                }
                                aonjVar8 = (aonj) objR9;
                                if (((i8 & 14) ^ 6) > 4) {
                                }
                                objR10 = cbtVar.R();
                                if (z3) {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                } else {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                }
                                aonjVar9 = (aonj) objR10;
                                java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                                zD5 = cavVar2.D(fwzVar3);
                                objR11 = cbtVar.R();
                                if (zD5) {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                } else {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                }
                                cbp.c(bool4, (aonj) objR11, cavVar2);
                                objR12 = cbtVar.R();
                                if (objR12 == obj) {
                                    objR12 = new defpackage.akr(fvsVar);
                                    cbtVar.ab(objR12);
                                }
                                akrVar = (defpackage.akr) objR12;
                                algVarC = alk.c(akrVar, cavVar2, 48);
                                if (z6) {
                                    cavVar2.u(-1404600068);
                                    java.lang.Float fValueOf4 = java.lang.Float.valueOf(fC);
                                    zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                    objR17 = cbtVar.R();
                                    if (zB3) {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    } else {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    }
                                    cbp.g(fValueOf4, (aonn) objR17, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                    algVar = algVarC;
                                    fvsVar2 = fvsVar;
                                } else {
                                    cavVar2.u(-1404181630);
                                    zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                    objR13 = cbtVar.R();
                                    if (zD6) {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    } else {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    }
                                    cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                }
                                zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                objR14 = cbtVar.R();
                                if (zD7) {
                                    defpackage.fwz fwzVar10 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar10, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar10;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                } else {
                                    defpackage.fwz fwzVar11 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar11, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar11;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                }
                                aonj aonjVar110 = (aonj) objR14;
                                objR15 = cbtVar.R();
                                if (objR15 == obj) {
                                    objR15 = new defpackage.fvt(10);
                                    cbtVar.ab(objR15);
                                }
                                final boolean z111 = z6;
                                fvsVar3 = fvsVar2;
                                boolean z112 = z11;
                                fxgVar = null;
                                algVar2 = algVar;
                                uu.b(algVar2, cmwVar, aonjVar110, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                    public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                        java.lang.Object objPrevious;
                                        aer aerVar = (aer) obj4;
                                        defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                        cav cavVar3 = (cav) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                        if (!z111 && !zN) {
                                            java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                            java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                            do {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                            } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                            fvsVar5 = (defpackage.fvs) objPrevious;
                                        }
                                        if (fvsVar5 == null) {
                                            cavVar3.u(872360807);
                                            cavVar3.o();
                                        } else {
                                            cjt cjtVar = cjtVarL;
                                            cavVar3.u(-1218785318);
                                            defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                            cavVar3.o();
                                        }
                                        return aojh.a;
                                    }
                                }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                java.lang.Object objF4 = algVar2.f();
                                java.lang.Object objH4 = algVar2.h();
                                zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                objR16 = cbtVar.R();
                                if (zB2) {
                                    defpackage.acub acubVar6 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar6);
                                    objR16 = acubVar6;
                                } else {
                                    defpackage.acub acubVar7 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar7);
                                    objR16 = acubVar7;
                                }
                                cbp.f(objF4, objH4, (aonn) objR16, cavVar2);
                                cbtVar.W(z112);
                            } else {
                                aonnVar3 = aonnVar2;
                            }
                            if ((i3 & 805306368) == 536870912) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean zD9 = zC2 | z7 | cavVar2.D(fwzVar3);
                            if (((i3 & 29360128) ^ 12582912) > c) {
                                aonjVar6 = aonjVar4;
                                if (!cavVar2.B(aonjVar6)) {
                                    z8 = true;
                                }
                                boolean z113 = zD9 | z8;
                                if (((i3 & 458752) ^ 196608) > 131072) {
                                    aonjVar7 = aonjVar2;
                                    if (!cavVar2.B(aonjVar7)) {
                                        z9 = true;
                                    }
                                    z10 = z113 | z9;
                                    objR9 = cbtVar.R();
                                    if (z10) {
                                        final int i214 = 0;
                                        aonj aonjVar111 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i214 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i215 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i216 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i217 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar111);
                                        objR9 = aonjVar111;
                                    } else {
                                        final int i215 = 0;
                                        aonj aonjVar112 = new aonj() { // from class: fxm
                                            public final java.lang.Object a(java.lang.Object obj4) {
                                                if (i215 != 0) {
                                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                    if (z6) {
                                                        int i216 = defpackage.fwc.e;
                                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA.hasNext()) {
                                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                            if (fwcVar7 instanceof defpackage.fwy) {
                                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                    }
                                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                        int i217 = defpackage.fwc.e;
                                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                        while (itA2.hasNext()) {
                                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                            if (fwcVar8 instanceof defpackage.fwy) {
                                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                                            }
                                                        }
                                                        return (agf) aonjVar6.a(aesVar);
                                                    }
                                                    int i218 = defpackage.fwc.e;
                                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA3.hasNext()) {
                                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                        if (fwcVar9 instanceof defpackage.fwy) {
                                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar7.a(aesVar);
                                                }
                                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                                if (z6) {
                                                    int i30 = defpackage.fwc.e;
                                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA4.hasNext()) {
                                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                        if (fwcVar11 instanceof defpackage.fwy) {
                                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i31 = defpackage.fwc.e;
                                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                    while (itA5.hasNext()) {
                                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                        if (fwcVar12 instanceof defpackage.fwy) {
                                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agg) aonjVar6.a(aesVar2);
                                                }
                                                int i32 = defpackage.fwc.e;
                                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA6.hasNext()) {
                                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                    if (fwcVar13 instanceof defpackage.fwy) {
                                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar7.a(aesVar2);
                                            }
                                        };
                                        cbtVar.ab(aonjVar112);
                                        objR9 = aonjVar112;
                                    }
                                    aonjVar8 = (aonj) objR9;
                                    if (((i8 & 14) ^ 6) > 4) {
                                    }
                                    objR10 = cbtVar.R();
                                    if (z3) {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    } else {
                                        objR10 = new defpackage.fvt(9);
                                        cbtVar.ab(objR10);
                                    }
                                    aonjVar9 = (aonj) objR10;
                                    java.lang.Boolean bool5 = java.lang.Boolean.TRUE;
                                    zD5 = cavVar2.D(fwzVar3);
                                    objR11 = cbtVar.R();
                                    if (zD5) {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    } else {
                                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                        cbtVar.ab(objR11);
                                    }
                                    cbp.c(bool5, (aonj) objR11, cavVar2);
                                    objR12 = cbtVar.R();
                                    if (objR12 == obj) {
                                        objR12 = new defpackage.akr(fvsVar);
                                        cbtVar.ab(objR12);
                                    }
                                    akrVar = (defpackage.akr) objR12;
                                    algVarC = alk.c(akrVar, cavVar2, 48);
                                    if (z6) {
                                        cavVar2.u(-1404600068);
                                        java.lang.Float fValueOf5 = java.lang.Float.valueOf(fC);
                                        zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                        objR17 = cbtVar.R();
                                        if (zB3) {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        } else {
                                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                            cbtVar.ab(objR17);
                                        }
                                        cbp.g(fValueOf5, (aonn) objR17, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                        algVar = algVarC;
                                        fvsVar2 = fvsVar;
                                    } else {
                                        cavVar2.u(-1404181630);
                                        zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                        objR13 = cbtVar.R();
                                        if (zD6) {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        } else {
                                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                            fvsVar2 = fvsVar;
                                            algVar = algVarC;
                                            cbtVar.ab(objR13);
                                        }
                                        cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                        z11 = false;
                                        cbtVar.W(false);
                                    }
                                    zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                    objR14 = cbtVar.R();
                                    if (zD7) {
                                        defpackage.fwz fwzVar12 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar12, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar12;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    } else {
                                        defpackage.fwz fwzVar13 = fwzVar3;
                                        objR14 = new defpackage.fxn(admVar, fwzVar13, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                        admVar2 = admVar;
                                        fwzVar4 = fwzVar13;
                                        cerVar2 = cerVar;
                                        cbtVar.ab(objR14);
                                    }
                                    aonj aonjVar113 = (aonj) objR14;
                                    objR15 = cbtVar.R();
                                    if (objR15 == obj) {
                                        objR15 = new defpackage.fvt(10);
                                        cbtVar.ab(objR15);
                                    }
                                    final boolean z114 = z6;
                                    fvsVar3 = fvsVar2;
                                    boolean z115 = z11;
                                    fxgVar = null;
                                    algVar2 = algVar;
                                    uu.b(algVar2, cmwVar, aonjVar113, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                        public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                            java.lang.Object objPrevious;
                                            aer aerVar = (aer) obj4;
                                            defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                            cav cavVar3 = (cav) obj6;
                                            ((java.lang.Integer) obj7).intValue();
                                            boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                            if (!z114 && !zN) {
                                                java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                                java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                                do {
                                                    if (!listIterator.hasPrevious()) {
                                                        objPrevious = null;
                                                        break;
                                                    }
                                                    objPrevious = listIterator.previous();
                                                } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                                fvsVar5 = (defpackage.fvs) objPrevious;
                                            }
                                            if (fvsVar5 == null) {
                                                cavVar3.u(872360807);
                                                cavVar3.o();
                                            } else {
                                                cjt cjtVar = cjtVarL;
                                                cavVar3.u(-1218785318);
                                                defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                                cavVar3.o();
                                            }
                                            return aojh.a;
                                        }
                                    }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                    java.lang.Object objF5 = algVar2.f();
                                    java.lang.Object objH5 = algVar2.h();
                                    zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                    objR16 = cbtVar.R();
                                    if (zB2) {
                                        defpackage.acub acubVar8 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar8);
                                        objR16 = acubVar8;
                                    } else {
                                        defpackage.acub acubVar9 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                        cbtVar.ab(acubVar9);
                                        objR16 = acubVar9;
                                    }
                                    cbp.f(objF5, objH5, (aonn) objR16, cavVar2);
                                    cbtVar.W(z115);
                                } else {
                                    aonjVar7 = aonjVar2;
                                }
                                if ((i3 & 196608) == 131072) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 = z113 | z9;
                                objR9 = cbtVar.R();
                                if (z10) {
                                    final int i216 = 0;
                                    aonj aonjVar114 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i216 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i217 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i218 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i219 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar114);
                                    objR9 = aonjVar114;
                                } else {
                                    final int i217 = 0;
                                    aonj aonjVar115 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i217 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i218 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i219 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i2110 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar115);
                                    objR9 = aonjVar115;
                                }
                                aonjVar8 = (aonj) objR9;
                                if (((i8 & 14) ^ 6) > 4) {
                                }
                                objR10 = cbtVar.R();
                                if (z3) {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                } else {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                }
                                aonjVar9 = (aonj) objR10;
                                java.lang.Boolean bool6 = java.lang.Boolean.TRUE;
                                zD5 = cavVar2.D(fwzVar3);
                                objR11 = cbtVar.R();
                                if (zD5) {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                } else {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                }
                                cbp.c(bool6, (aonj) objR11, cavVar2);
                                objR12 = cbtVar.R();
                                if (objR12 == obj) {
                                    objR12 = new defpackage.akr(fvsVar);
                                    cbtVar.ab(objR12);
                                }
                                akrVar = (defpackage.akr) objR12;
                                algVarC = alk.c(akrVar, cavVar2, 48);
                                if (z6) {
                                    cavVar2.u(-1404600068);
                                    java.lang.Float fValueOf6 = java.lang.Float.valueOf(fC);
                                    zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                    objR17 = cbtVar.R();
                                    if (zB3) {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    } else {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    }
                                    cbp.g(fValueOf6, (aonn) objR17, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                    algVar = algVarC;
                                    fvsVar2 = fvsVar;
                                } else {
                                    cavVar2.u(-1404181630);
                                    zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                    objR13 = cbtVar.R();
                                    if (zD6) {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    } else {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    }
                                    cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                }
                                zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                objR14 = cbtVar.R();
                                if (zD7) {
                                    defpackage.fwz fwzVar14 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar14, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar14;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                } else {
                                    defpackage.fwz fwzVar15 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar15, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar15;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                }
                                aonj aonjVar116 = (aonj) objR14;
                                objR15 = cbtVar.R();
                                if (objR15 == obj) {
                                    objR15 = new defpackage.fvt(10);
                                    cbtVar.ab(objR15);
                                }
                                final boolean z116 = z6;
                                fvsVar3 = fvsVar2;
                                boolean z117 = z11;
                                fxgVar = null;
                                algVar2 = algVar;
                                uu.b(algVar2, cmwVar, aonjVar116, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                    public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                        java.lang.Object objPrevious;
                                        aer aerVar = (aer) obj4;
                                        defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                        cav cavVar3 = (cav) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                        if (!z116 && !zN) {
                                            java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                            java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                            do {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                            } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                            fvsVar5 = (defpackage.fvs) objPrevious;
                                        }
                                        if (fvsVar5 == null) {
                                            cavVar3.u(872360807);
                                            cavVar3.o();
                                        } else {
                                            cjt cjtVar = cjtVarL;
                                            cavVar3.u(-1218785318);
                                            defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                            cavVar3.o();
                                        }
                                        return aojh.a;
                                    }
                                }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                java.lang.Object objF6 = algVar2.f();
                                java.lang.Object objH6 = algVar2.h();
                                zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                objR16 = cbtVar.R();
                                if (zB2) {
                                    defpackage.acub acubVar10 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar10);
                                    objR16 = acubVar10;
                                } else {
                                    defpackage.acub acubVar11 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar11);
                                    objR16 = acubVar11;
                                }
                                cbp.f(objF6, objH6, (aonn) objR16, cavVar2);
                                cbtVar.W(z117);
                            } else {
                                aonjVar6 = aonjVar4;
                            }
                            if ((i3 & 12582912) == c) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolean z118 = zD9 | z8;
                            if (((i3 & 458752) ^ 196608) > 131072) {
                                aonjVar7 = aonjVar2;
                                if (!cavVar2.B(aonjVar7)) {
                                    z9 = true;
                                }
                                z10 = z118 | z9;
                                objR9 = cbtVar.R();
                                if (z10) {
                                    final int i218 = 0;
                                    aonj aonjVar117 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i218 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i219 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i2110 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i2111 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar117);
                                    objR9 = aonjVar117;
                                } else {
                                    final int i219 = 0;
                                    aonj aonjVar118 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i219 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i2110 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i2111 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i2112 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar118);
                                    objR9 = aonjVar118;
                                }
                                aonjVar8 = (aonj) objR9;
                                if (((i8 & 14) ^ 6) > 4) {
                                }
                                objR10 = cbtVar.R();
                                if (z3) {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                } else {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                }
                                aonjVar9 = (aonj) objR10;
                                java.lang.Boolean bool7 = java.lang.Boolean.TRUE;
                                zD5 = cavVar2.D(fwzVar3);
                                objR11 = cbtVar.R();
                                if (zD5) {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                } else {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                }
                                cbp.c(bool7, (aonj) objR11, cavVar2);
                                objR12 = cbtVar.R();
                                if (objR12 == obj) {
                                    objR12 = new defpackage.akr(fvsVar);
                                    cbtVar.ab(objR12);
                                }
                                akrVar = (defpackage.akr) objR12;
                                algVarC = alk.c(akrVar, cavVar2, 48);
                                if (z6) {
                                    cavVar2.u(-1404600068);
                                    java.lang.Float fValueOf7 = java.lang.Float.valueOf(fC);
                                    zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                    objR17 = cbtVar.R();
                                    if (zB3) {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    } else {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    }
                                    cbp.g(fValueOf7, (aonn) objR17, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                    algVar = algVarC;
                                    fvsVar2 = fvsVar;
                                } else {
                                    cavVar2.u(-1404181630);
                                    zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                    objR13 = cbtVar.R();
                                    if (zD6) {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    } else {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    }
                                    cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                }
                                zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                objR14 = cbtVar.R();
                                if (zD7) {
                                    defpackage.fwz fwzVar16 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar16, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar16;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                } else {
                                    defpackage.fwz fwzVar17 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar17, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar17;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                }
                                aonj aonjVar119 = (aonj) objR14;
                                objR15 = cbtVar.R();
                                if (objR15 == obj) {
                                    objR15 = new defpackage.fvt(10);
                                    cbtVar.ab(objR15);
                                }
                                final boolean z119 = z6;
                                fvsVar3 = fvsVar2;
                                boolean z1110 = z11;
                                fxgVar = null;
                                algVar2 = algVar;
                                uu.b(algVar2, cmwVar, aonjVar119, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                    public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                        java.lang.Object objPrevious;
                                        aer aerVar = (aer) obj4;
                                        defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                        cav cavVar3 = (cav) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                        if (!z119 && !zN) {
                                            java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                            java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                            do {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                            } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                            fvsVar5 = (defpackage.fvs) objPrevious;
                                        }
                                        if (fvsVar5 == null) {
                                            cavVar3.u(872360807);
                                            cavVar3.o();
                                        } else {
                                            cjt cjtVar = cjtVarL;
                                            cavVar3.u(-1218785318);
                                            defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                            cavVar3.o();
                                        }
                                        return aojh.a;
                                    }
                                }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                java.lang.Object objF7 = algVar2.f();
                                java.lang.Object objH7 = algVar2.h();
                                zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                objR16 = cbtVar.R();
                                if (zB2) {
                                    defpackage.acub acubVar12 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar12);
                                    objR16 = acubVar12;
                                } else {
                                    defpackage.acub acubVar13 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar13);
                                    objR16 = acubVar13;
                                }
                                cbp.f(objF7, objH7, (aonn) objR16, cavVar2);
                                cbtVar.W(z1110);
                            } else {
                                aonjVar7 = aonjVar2;
                            }
                            if ((i3 & 196608) == 131072) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = z118 | z9;
                            objR9 = cbtVar.R();
                            if (z10) {
                                final int i2110 = 0;
                                aonj aonjVar1110 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2110 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2111 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2112 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i2113 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar1110);
                                objR9 = aonjVar1110;
                            } else {
                                final int i2111 = 0;
                                aonj aonjVar1111 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2111 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2112 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2113 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i2114 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar1111);
                                objR9 = aonjVar1111;
                            }
                            aonjVar8 = (aonj) objR9;
                            if (((i8 & 14) ^ 6) > 4) {
                            }
                            objR10 = cbtVar.R();
                            if (z3) {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            } else {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            }
                            aonjVar9 = (aonj) objR10;
                            java.lang.Boolean bool8 = java.lang.Boolean.TRUE;
                            zD5 = cavVar2.D(fwzVar3);
                            objR11 = cbtVar.R();
                            if (zD5) {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            } else {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            }
                            cbp.c(bool8, (aonj) objR11, cavVar2);
                            objR12 = cbtVar.R();
                            if (objR12 == obj) {
                                objR12 = new defpackage.akr(fvsVar);
                                cbtVar.ab(objR12);
                            }
                            akrVar = (defpackage.akr) objR12;
                            algVarC = alk.c(akrVar, cavVar2, 48);
                            if (z6) {
                                cavVar2.u(-1404600068);
                                java.lang.Float fValueOf8 = java.lang.Float.valueOf(fC);
                                zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                objR17 = cbtVar.R();
                                if (zB3) {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                } else {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                }
                                cbp.g(fValueOf8, (aonn) objR17, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                                algVar = algVarC;
                                fvsVar2 = fvsVar;
                            } else {
                                cavVar2.u(-1404181630);
                                zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                objR13 = cbtVar.R();
                                if (zD6) {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                } else {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                }
                                cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                            }
                            zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                            objR14 = cbtVar.R();
                            if (zD7) {
                                defpackage.fwz fwzVar18 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar18, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar18;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            } else {
                                defpackage.fwz fwzVar19 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar19, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar19;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            }
                            aonj aonjVar1112 = (aonj) objR14;
                            objR15 = cbtVar.R();
                            if (objR15 == obj) {
                                objR15 = new defpackage.fvt(10);
                                cbtVar.ab(objR15);
                            }
                            final boolean z1111 = z6;
                            fvsVar3 = fvsVar2;
                            boolean z1112 = z11;
                            fxgVar = null;
                            algVar2 = algVar;
                            uu.b(algVar2, cmwVar, aonjVar1112, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                    java.lang.Object objPrevious;
                                    aer aerVar = (aer) obj4;
                                    defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                    cav cavVar3 = (cav) obj6;
                                    ((java.lang.Integer) obj7).intValue();
                                    boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                    if (!z1111 && !zN) {
                                        java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                        java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                        do {
                                            if (!listIterator.hasPrevious()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = listIterator.previous();
                                        } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                        fvsVar5 = (defpackage.fvs) objPrevious;
                                    }
                                    if (fvsVar5 == null) {
                                        cavVar3.u(872360807);
                                        cavVar3.o();
                                    } else {
                                        cjt cjtVar = cjtVarL;
                                        cavVar3.u(-1218785318);
                                        defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                        cavVar3.o();
                                    }
                                    return aojh.a;
                                }
                            }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                            java.lang.Object objF8 = algVar2.f();
                            java.lang.Object objH8 = algVar2.h();
                            zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                            objR16 = cbtVar.R();
                            if (zB2) {
                                defpackage.acub acubVar14 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar14);
                                objR16 = acubVar14;
                            } else {
                                defpackage.acub acubVar15 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar15);
                                objR16 = acubVar15;
                            }
                            cbp.f(objF8, objH8, (aonn) objR16, cavVar2);
                            cbtVar.W(z1112);
                        } else {
                            cavVar2 = cavVar2;
                            fxgVar = null;
                            cavVar2.u(-1398883978);
                            cbtVar2.W(false);
                        }
                        fwnVarB2 = fvxVar.e().b("dialog");
                        if (fwnVarB2 instanceof defpackage.fxg) {
                            fxgVar2 = (defpackage.fxg) fwnVarB2;
                        } else {
                            fxgVar2 = fxgVar;
                        }
                        if (fxgVar2 == null) {
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                return;
                            } else {
                                fxlVar = new defpackage.fxl(fvxVar, fweVar, cmwVar, cmjVar, aonjVar, aonjVar2, aonjVar3, aonjVar4, aonnVar, aonnVar2, i, i2, 0);
                            }
                        } else {
                            defpackage.hgt.O(fxgVar2, cavVar2, 8);
                        }
                    }
                    cdkVarI.c = fxlVar;
                }
                fxrVar.t();
            }
            z = false;
            fwnVarB = fvxVar.e().b("composable");
            if (fwnVarB instanceof defpackage.fwz) {
                fwzVar = (defpackage.fwz) fwnVarB;
            } else {
                fwzVar = null;
            }
            if (fwzVar == null) {
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    return;
                } else {
                    fxlVar = new defpackage.fxl(fvxVar, fweVar, cmwVar, cmjVar2, aonjVar, aonjVar2, aonjVar3, aonjVar4, aonnVar, aonnVar2, i, i2, 1);
                }
            } else {
                cerVarJ = cdh.j(fwzVar.d(), cavVarB);
                if (ab(cerVarJ).size() > 1) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                int i220 = defpackage.fyj.a;
                fxzVarA = defpackage.fyj.a(cavVarB);
                if (fxzVarA != null) {
                    throw new java.lang.IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                }
                fxyVarFd = fxzVarA.fd();
                zB = cavVarB.B(fwzVar);
                objR = cbtVar2.R();
                if (zB) {
                    objR = new defpackage.fxj(fwzVar);
                    cbtVar2.ab(objR);
                } else {
                    objR = new defpackage.fxj(fwzVar);
                    cbtVar2.ab(objR);
                }
                fxjVar = (defpackage.fxj) objR;
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z2);
                zD = cavVarB.D(fxjVar) | cavVarB.C(z2);
                objR2 = cbtVar2.R();
                if (zD) {
                    objR2 = new afw(fxjVar, z2, 2);
                    cbtVar2.ab(objR2);
                } else {
                    objR2 = new afw(fxjVar, z2, 2);
                    cbtVar2.ab(objR2);
                }
                z3 = true;
                defpackage.avo.n(boolValueOf2, fxjVar, null, (aonj) objR2, cavVarB, 0);
                cavVar2 = cavVarB;
                zD2 = cavVar2.D(fxyVarFd) | cavVar2.D(fxjVar);
                objR3 = cbtVar2.R();
                if (zD2) {
                    objR3 = new dpz(fxyVarFd, fxjVar, 9);
                    cbtVar2.ab(objR3);
                } else {
                    objR3 = new dpz(fxyVarFd, fxjVar, 9);
                    cbtVar2.ab(objR3);
                }
                cbp.b(fxyVarFd, fxjVar, (aonj) objR3, cavVar2);
                zE = fxjVar.e();
                fC = fxjVar.a.c();
                iC = fxjVar.b.c();
                zD3 = cavVar2.D(fvxVar) | cavVar2.D(emxVar);
                objR4 = cbtVar2.R();
                if (zD3) {
                    objR4 = new dpz(fvxVar, emxVar, 10);
                    cbtVar2.ab(objR4);
                } else {
                    objR4 = new dpz(fvxVar, emxVar, 10);
                    cbtVar2.ab(objR4);
                }
                cbp.c(emxVar, (aonj) objR4, cavVar2);
                zD4 = cavVar2.D(fxjVar) | cavVar2.B(cerVarJ);
                objR5 = cbtVar2.R();
                if (zD4) {
                    objR5 = new defpackage.bxq(fxjVar, cerVarJ, 15);
                    cbtVar2.ab(objR5);
                } else {
                    objR5 = new defpackage.bxq(fxjVar, cerVarJ, 15);
                    cbtVar2.ab(objR5);
                }
                cavVar2.r((aomy) objR5);
                cjtVarL = cfd.l(cavVar2);
                cerVarJ2 = cdh.j(fvxVar.b.g, cavVar2);
                objR6 = cbtVar2.R();
                obj = cau.a;
                if (objR6 == obj) {
                    defpackage.dqk dqkVar2 = new defpackage.dqk(cerVarJ2, 20);
                    ajxw ajxwVar2 = ceo.a;
                    cbk cbkVar2 = new cbk(dqkVar2, (cen) null);
                    cbtVar2.ab(cbkVar2);
                    objR6 = cbkVar2;
                }
                cerVar = (cer) objR6;
                fvsVar = (defpackage.fvs) ajsz.bJ(ac(cerVar));
                objR7 = cbtVar2.R();
                if (objR7 == obj) {
                    int i221 = defpackage.adn.a;
                    objR7 = new defpackage.adm(6);
                    cbtVar2.ab(objR7);
                }
                admVar = (defpackage.adm) objR7;
                if (fvsVar != null) {
                    cavVar2.u(-1407334051);
                    boolean zC3 = cavVar2.C(zE) | cavVar2.z(iC) | ((((i7 & 234881024) ^ 100663296) <= 67108864 && cavVar2.B(aonnVar)) || (i7 & 100663296) == 67108864) | cavVar2.D(fwzVar) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && cavVar2.B(aonjVar3)) || (i7 & 1572864) == 1048576);
                    if (((i7 & 57344) ^ 24576) > 16384) {
                        fwzVar2 = fwzVar;
                        i3 = i7;
                        if ((i3 & 24576) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        fwzVar2 = fwzVar;
                        i3 = i7;
                        if ((i3 & 24576) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    z5 = zC3 | z4;
                    objR8 = cbtVar2.R();
                    if (z5) {
                        final int i222 = 1;
                        cbtVar = cbtVar2;
                        c = 0;
                        z6 = zE;
                        i4 = iC;
                        fwzVar3 = fwzVar2;
                        objR8 = new aonj() { // from class: fxm
                            public final java.lang.Object a(java.lang.Object obj4) {
                                if (i222 != 0) {
                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                    if (z6) {
                                        int i2112 = defpackage.fwc.e;
                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                        while (itA.hasNext()) {
                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                            if (fwcVar7 instanceof defpackage.fwy) {
                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar.a(aesVar, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i2113 = defpackage.fwc.e;
                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA2.hasNext()) {
                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                            if (fwcVar8 instanceof defpackage.fwy) {
                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar3.a(aesVar);
                                    }
                                    int i2114 = defpackage.fwc.e;
                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                    while (itA3.hasNext()) {
                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                        if (fwcVar9 instanceof defpackage.fwy) {
                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agf) aonjVar.a(aesVar);
                                }
                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                if (z6) {
                                    int i30 = defpackage.fwc.e;
                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA4.hasNext()) {
                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                        if (fwcVar11 instanceof defpackage.fwy) {
                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                        }
                                    }
                                    return aonnVar.a(aesVar2, java.lang.Integer.valueOf(i4));
                                }
                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                    int i31 = defpackage.fwc.e;
                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA5.hasNext()) {
                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                        if (fwcVar12 instanceof defpackage.fwy) {
                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar3.a(aesVar2);
                                }
                                int i32 = defpackage.fwc.e;
                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                while (itA6.hasNext()) {
                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                    if (fwcVar13 instanceof defpackage.fwy) {
                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                    }
                                }
                                return (agg) aonjVar.a(aesVar2);
                            }
                        };
                        cbtVar.ab(objR8);
                    } else {
                        final int i223 = 1;
                        cbtVar = cbtVar2;
                        c = 0;
                        z6 = zE;
                        i4 = iC;
                        fwzVar3 = fwzVar2;
                        objR8 = new aonj() { // from class: fxm
                            public final java.lang.Object a(java.lang.Object obj4) {
                                if (i223 != 0) {
                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                    if (z6) {
                                        int i2112 = defpackage.fwc.e;
                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                        while (itA.hasNext()) {
                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                            if (fwcVar7 instanceof defpackage.fwy) {
                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar.a(aesVar, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i2113 = defpackage.fwc.e;
                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA2.hasNext()) {
                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                            if (fwcVar8 instanceof defpackage.fwy) {
                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar3.a(aesVar);
                                    }
                                    int i2114 = defpackage.fwc.e;
                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                    while (itA3.hasNext()) {
                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                        if (fwcVar9 instanceof defpackage.fwy) {
                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agf) aonjVar.a(aesVar);
                                }
                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                if (z6) {
                                    int i30 = defpackage.fwc.e;
                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA4.hasNext()) {
                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                        if (fwcVar11 instanceof defpackage.fwy) {
                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                        }
                                    }
                                    return aonnVar.a(aesVar2, java.lang.Integer.valueOf(i4));
                                }
                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                    int i31 = defpackage.fwc.e;
                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA5.hasNext()) {
                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                        if (fwcVar12 instanceof defpackage.fwy) {
                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar3.a(aesVar2);
                                }
                                int i32 = defpackage.fwc.e;
                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                while (itA6.hasNext()) {
                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                    if (fwcVar13 instanceof defpackage.fwy) {
                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                    }
                                }
                                return (agg) aonjVar.a(aesVar2);
                            }
                        };
                        cbtVar.ab(objR8);
                    }
                    aonjVar5 = (aonj) objR8;
                    boolean zC4 = cavVar2.C(z6) | cavVar2.z(i4);
                    if (((i3 & 1879048192) ^ 805306368) > 536870912) {
                        aonnVar3 = aonnVar2;
                        if (!cavVar2.B(aonnVar3)) {
                            z7 = true;
                        }
                        boolean zD10 = zC4 | z7 | cavVar2.D(fwzVar3);
                        if (((i3 & 29360128) ^ 12582912) > c) {
                            aonjVar6 = aonjVar4;
                            if (!cavVar2.B(aonjVar6)) {
                                z8 = true;
                            }
                            boolean z1113 = zD10 | z8;
                            if (((i3 & 458752) ^ 196608) > 131072) {
                                aonjVar7 = aonjVar2;
                                if (!cavVar2.B(aonjVar7)) {
                                    z9 = true;
                                }
                                z10 = z1113 | z9;
                                objR9 = cbtVar.R();
                                if (z10) {
                                    final int i2112 = 0;
                                    aonj aonjVar1113 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i2112 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i2113 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i2114 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i2115 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar1113);
                                    objR9 = aonjVar1113;
                                } else {
                                    final int i2113 = 0;
                                    aonj aonjVar1114 = new aonj() { // from class: fxm
                                        public final java.lang.Object a(java.lang.Object obj4) {
                                            if (i2113 != 0) {
                                                defpackage.aes aesVar = (defpackage.aes) obj4;
                                                defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                                aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                                if (z6) {
                                                    int i2114 = defpackage.fwc.e;
                                                    java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA.hasNext()) {
                                                        defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                        if (fwcVar7 instanceof defpackage.fwy) {
                                                        } else if (fwcVar7 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                                }
                                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                    int i2115 = defpackage.fwc.e;
                                                    java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                    while (itA2.hasNext()) {
                                                        defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                        if (fwcVar8 instanceof defpackage.fwy) {
                                                        } else if (fwcVar8 instanceof defpackage.fww) {
                                                        }
                                                    }
                                                    return (agf) aonjVar6.a(aesVar);
                                                }
                                                int i2116 = defpackage.fwc.e;
                                                java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA3.hasNext()) {
                                                    defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                    if (fwcVar9 instanceof defpackage.fwy) {
                                                    } else if (fwcVar9 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar7.a(aesVar);
                                            }
                                            defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                            aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                            if (z6) {
                                                int i30 = defpackage.fwc.e;
                                                java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA4.hasNext()) {
                                                    defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                    if (fwcVar11 instanceof defpackage.fwy) {
                                                    } else if (fwcVar11 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i31 = defpackage.fwc.e;
                                                java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                                while (itA5.hasNext()) {
                                                    defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                    if (fwcVar12 instanceof defpackage.fwy) {
                                                    } else if (fwcVar12 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agg) aonjVar6.a(aesVar2);
                                            }
                                            int i32 = defpackage.fwc.e;
                                            java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA6.hasNext()) {
                                                defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                                if (fwcVar13 instanceof defpackage.fwy) {
                                                } else if (fwcVar13 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar7.a(aesVar2);
                                        }
                                    };
                                    cbtVar.ab(aonjVar1114);
                                    objR9 = aonjVar1114;
                                }
                                aonjVar8 = (aonj) objR9;
                                if (((i8 & 14) ^ 6) > 4) {
                                }
                                objR10 = cbtVar.R();
                                if (z3) {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                } else {
                                    objR10 = new defpackage.fvt(9);
                                    cbtVar.ab(objR10);
                                }
                                aonjVar9 = (aonj) objR10;
                                java.lang.Boolean bool9 = java.lang.Boolean.TRUE;
                                zD5 = cavVar2.D(fwzVar3);
                                objR11 = cbtVar.R();
                                if (zD5) {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                } else {
                                    objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                    cbtVar.ab(objR11);
                                }
                                cbp.c(bool9, (aonj) objR11, cavVar2);
                                objR12 = cbtVar.R();
                                if (objR12 == obj) {
                                    objR12 = new defpackage.akr(fvsVar);
                                    cbtVar.ab(objR12);
                                }
                                akrVar = (defpackage.akr) objR12;
                                algVarC = alk.c(akrVar, cavVar2, 48);
                                if (z6) {
                                    cavVar2.u(-1404600068);
                                    java.lang.Float fValueOf9 = java.lang.Float.valueOf(fC);
                                    zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                    objR17 = cbtVar.R();
                                    if (zB3) {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    } else {
                                        objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                        cbtVar.ab(objR17);
                                    }
                                    cbp.g(fValueOf9, (aonn) objR17, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                    algVar = algVarC;
                                    fvsVar2 = fvsVar;
                                } else {
                                    cavVar2.u(-1404181630);
                                    zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                    objR13 = cbtVar.R();
                                    if (zD6) {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    } else {
                                        objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                        fvsVar2 = fvsVar;
                                        algVar = algVarC;
                                        cbtVar.ab(objR13);
                                    }
                                    cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                    z11 = false;
                                    cbtVar.W(false);
                                }
                                zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                                objR14 = cbtVar.R();
                                if (zD7) {
                                    defpackage.fwz fwzVar110 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar110, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar110;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                } else {
                                    defpackage.fwz fwzVar111 = fwzVar3;
                                    objR14 = new defpackage.fxn(admVar, fwzVar111, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                    admVar2 = admVar;
                                    fwzVar4 = fwzVar111;
                                    cerVar2 = cerVar;
                                    cbtVar.ab(objR14);
                                }
                                aonj aonjVar1115 = (aonj) objR14;
                                objR15 = cbtVar.R();
                                if (objR15 == obj) {
                                    objR15 = new defpackage.fvt(10);
                                    cbtVar.ab(objR15);
                                }
                                final boolean z1114 = z6;
                                fvsVar3 = fvsVar2;
                                boolean z1115 = z11;
                                fxgVar = null;
                                algVar2 = algVar;
                                uu.b(algVar2, cmwVar, aonjVar1115, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                    public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                        java.lang.Object objPrevious;
                                        aer aerVar = (aer) obj4;
                                        defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                        cav cavVar3 = (cav) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                        if (!z1114 && !zN) {
                                            java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                            java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                            do {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                            } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                            fvsVar5 = (defpackage.fvs) objPrevious;
                                        }
                                        if (fvsVar5 == null) {
                                            cavVar3.u(872360807);
                                            cavVar3.o();
                                        } else {
                                            cjt cjtVar = cjtVarL;
                                            cavVar3.u(-1218785318);
                                            defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                            cavVar3.o();
                                        }
                                        return aojh.a;
                                    }
                                }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                                java.lang.Object objF9 = algVar2.f();
                                java.lang.Object objH9 = algVar2.h();
                                zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                                objR16 = cbtVar.R();
                                if (zB2) {
                                    defpackage.acub acubVar16 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar16);
                                    objR16 = acubVar16;
                                } else {
                                    defpackage.acub acubVar17 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                    cbtVar.ab(acubVar17);
                                    objR16 = acubVar17;
                                }
                                cbp.f(objF9, objH9, (aonn) objR16, cavVar2);
                                cbtVar.W(z1115);
                            } else {
                                aonjVar7 = aonjVar2;
                            }
                            if ((i3 & 196608) == 131072) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = z1113 | z9;
                            objR9 = cbtVar.R();
                            if (z10) {
                                final int i2114 = 0;
                                aonj aonjVar1116 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2114 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2115 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2116 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i2117 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar1116);
                                objR9 = aonjVar1116;
                            } else {
                                final int i2115 = 0;
                                aonj aonjVar1117 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2115 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2116 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2117 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i2118 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar1117);
                                objR9 = aonjVar1117;
                            }
                            aonjVar8 = (aonj) objR9;
                            if (((i8 & 14) ^ 6) > 4) {
                            }
                            objR10 = cbtVar.R();
                            if (z3) {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            } else {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            }
                            aonjVar9 = (aonj) objR10;
                            java.lang.Boolean bool10 = java.lang.Boolean.TRUE;
                            zD5 = cavVar2.D(fwzVar3);
                            objR11 = cbtVar.R();
                            if (zD5) {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            } else {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            }
                            cbp.c(bool10, (aonj) objR11, cavVar2);
                            objR12 = cbtVar.R();
                            if (objR12 == obj) {
                                objR12 = new defpackage.akr(fvsVar);
                                cbtVar.ab(objR12);
                            }
                            akrVar = (defpackage.akr) objR12;
                            algVarC = alk.c(akrVar, cavVar2, 48);
                            if (z6) {
                                cavVar2.u(-1404600068);
                                java.lang.Float fValueOf10 = java.lang.Float.valueOf(fC);
                                zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                objR17 = cbtVar.R();
                                if (zB3) {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                } else {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                }
                                cbp.g(fValueOf10, (aonn) objR17, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                                algVar = algVarC;
                                fvsVar2 = fvsVar;
                            } else {
                                cavVar2.u(-1404181630);
                                zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                objR13 = cbtVar.R();
                                if (zD6) {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                } else {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                }
                                cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                            }
                            zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                            objR14 = cbtVar.R();
                            if (zD7) {
                                defpackage.fwz fwzVar112 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar112, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar112;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            } else {
                                defpackage.fwz fwzVar113 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar113, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar113;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            }
                            aonj aonjVar1118 = (aonj) objR14;
                            objR15 = cbtVar.R();
                            if (objR15 == obj) {
                                objR15 = new defpackage.fvt(10);
                                cbtVar.ab(objR15);
                            }
                            final boolean z1116 = z6;
                            fvsVar3 = fvsVar2;
                            boolean z1117 = z11;
                            fxgVar = null;
                            algVar2 = algVar;
                            uu.b(algVar2, cmwVar, aonjVar1118, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                    java.lang.Object objPrevious;
                                    aer aerVar = (aer) obj4;
                                    defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                    cav cavVar3 = (cav) obj6;
                                    ((java.lang.Integer) obj7).intValue();
                                    boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                    if (!z1116 && !zN) {
                                        java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                        java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                        do {
                                            if (!listIterator.hasPrevious()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = listIterator.previous();
                                        } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                        fvsVar5 = (defpackage.fvs) objPrevious;
                                    }
                                    if (fvsVar5 == null) {
                                        cavVar3.u(872360807);
                                        cavVar3.o();
                                    } else {
                                        cjt cjtVar = cjtVarL;
                                        cavVar3.u(-1218785318);
                                        defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                        cavVar3.o();
                                    }
                                    return aojh.a;
                                }
                            }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                            java.lang.Object objF10 = algVar2.f();
                            java.lang.Object objH10 = algVar2.h();
                            zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                            objR16 = cbtVar.R();
                            if (zB2) {
                                defpackage.acub acubVar18 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar18);
                                objR16 = acubVar18;
                            } else {
                                defpackage.acub acubVar19 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar19);
                                objR16 = acubVar19;
                            }
                            cbp.f(objF10, objH10, (aonn) objR16, cavVar2);
                            cbtVar.W(z1117);
                        } else {
                            aonjVar6 = aonjVar4;
                        }
                        if ((i3 & 12582912) == c) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z1118 = zD10 | z8;
                        if (((i3 & 458752) ^ 196608) > 131072) {
                            aonjVar7 = aonjVar2;
                            if (!cavVar2.B(aonjVar7)) {
                                z9 = true;
                            }
                            z10 = z1118 | z9;
                            objR9 = cbtVar.R();
                            if (z10) {
                                final int i2116 = 0;
                                aonj aonjVar1119 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2116 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2117 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2118 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i2119 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar1119);
                                objR9 = aonjVar1119;
                            } else {
                                final int i2117 = 0;
                                aonj aonjVar11110 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i2117 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i2118 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i2119 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i21110 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar11110);
                                objR9 = aonjVar11110;
                            }
                            aonjVar8 = (aonj) objR9;
                            if (((i8 & 14) ^ 6) > 4) {
                            }
                            objR10 = cbtVar.R();
                            if (z3) {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            } else {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            }
                            aonjVar9 = (aonj) objR10;
                            java.lang.Boolean bool11 = java.lang.Boolean.TRUE;
                            zD5 = cavVar2.D(fwzVar3);
                            objR11 = cbtVar.R();
                            if (zD5) {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            } else {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            }
                            cbp.c(bool11, (aonj) objR11, cavVar2);
                            objR12 = cbtVar.R();
                            if (objR12 == obj) {
                                objR12 = new defpackage.akr(fvsVar);
                                cbtVar.ab(objR12);
                            }
                            akrVar = (defpackage.akr) objR12;
                            algVarC = alk.c(akrVar, cavVar2, 48);
                            if (z6) {
                                cavVar2.u(-1404600068);
                                java.lang.Float fValueOf11 = java.lang.Float.valueOf(fC);
                                zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                objR17 = cbtVar.R();
                                if (zB3) {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                } else {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                }
                                cbp.g(fValueOf11, (aonn) objR17, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                                algVar = algVarC;
                                fvsVar2 = fvsVar;
                            } else {
                                cavVar2.u(-1404181630);
                                zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                objR13 = cbtVar.R();
                                if (zD6) {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                } else {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                }
                                cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                            }
                            zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                            objR14 = cbtVar.R();
                            if (zD7) {
                                defpackage.fwz fwzVar114 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar114, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar114;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            } else {
                                defpackage.fwz fwzVar115 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar115, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar115;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            }
                            aonj aonjVar11111 = (aonj) objR14;
                            objR15 = cbtVar.R();
                            if (objR15 == obj) {
                                objR15 = new defpackage.fvt(10);
                                cbtVar.ab(objR15);
                            }
                            final boolean z1119 = z6;
                            fvsVar3 = fvsVar2;
                            boolean z11110 = z11;
                            fxgVar = null;
                            algVar2 = algVar;
                            uu.b(algVar2, cmwVar, aonjVar11111, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                    java.lang.Object objPrevious;
                                    aer aerVar = (aer) obj4;
                                    defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                    cav cavVar3 = (cav) obj6;
                                    ((java.lang.Integer) obj7).intValue();
                                    boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                    if (!z1119 && !zN) {
                                        java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                        java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                        do {
                                            if (!listIterator.hasPrevious()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = listIterator.previous();
                                        } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                        fvsVar5 = (defpackage.fvs) objPrevious;
                                    }
                                    if (fvsVar5 == null) {
                                        cavVar3.u(872360807);
                                        cavVar3.o();
                                    } else {
                                        cjt cjtVar = cjtVarL;
                                        cavVar3.u(-1218785318);
                                        defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                        cavVar3.o();
                                    }
                                    return aojh.a;
                                }
                            }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                            java.lang.Object objF11 = algVar2.f();
                            java.lang.Object objH11 = algVar2.h();
                            zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                            objR16 = cbtVar.R();
                            if (zB2) {
                                defpackage.acub acubVar110 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar110);
                                objR16 = acubVar110;
                            } else {
                                defpackage.acub acubVar111 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar111);
                                objR16 = acubVar111;
                            }
                            cbp.f(objF11, objH11, (aonn) objR16, cavVar2);
                            cbtVar.W(z11110);
                        } else {
                            aonjVar7 = aonjVar2;
                        }
                        if ((i3 & 196608) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z1118 | z9;
                        objR9 = cbtVar.R();
                        if (z10) {
                            final int i2118 = 0;
                            aonj aonjVar11112 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i2118 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i2119 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21110 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21111 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar11112);
                            objR9 = aonjVar11112;
                        } else {
                            final int i2119 = 0;
                            aonj aonjVar11113 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i2119 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i21110 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21111 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21112 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar11113);
                            objR9 = aonjVar11113;
                        }
                        aonjVar8 = (aonj) objR9;
                        if (((i8 & 14) ^ 6) > 4) {
                        }
                        objR10 = cbtVar.R();
                        if (z3) {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        } else {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        }
                        aonjVar9 = (aonj) objR10;
                        java.lang.Boolean bool12 = java.lang.Boolean.TRUE;
                        zD5 = cavVar2.D(fwzVar3);
                        objR11 = cbtVar.R();
                        if (zD5) {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        } else {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        }
                        cbp.c(bool12, (aonj) objR11, cavVar2);
                        objR12 = cbtVar.R();
                        if (objR12 == obj) {
                            objR12 = new defpackage.akr(fvsVar);
                            cbtVar.ab(objR12);
                        }
                        akrVar = (defpackage.akr) objR12;
                        algVarC = alk.c(akrVar, cavVar2, 48);
                        if (z6) {
                            cavVar2.u(-1404600068);
                            java.lang.Float fValueOf12 = java.lang.Float.valueOf(fC);
                            zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                            objR17 = cbtVar.R();
                            if (zB3) {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            } else {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            }
                            cbp.g(fValueOf12, (aonn) objR17, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                            algVar = algVarC;
                            fvsVar2 = fvsVar;
                        } else {
                            cavVar2.u(-1404181630);
                            zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                            objR13 = cbtVar.R();
                            if (zD6) {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            } else {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            }
                            cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                        }
                        zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                        objR14 = cbtVar.R();
                        if (zD7) {
                            defpackage.fwz fwzVar116 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar116, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar116;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        } else {
                            defpackage.fwz fwzVar117 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar117, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar117;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        }
                        aonj aonjVar11114 = (aonj) objR14;
                        objR15 = cbtVar.R();
                        if (objR15 == obj) {
                            objR15 = new defpackage.fvt(10);
                            cbtVar.ab(objR15);
                        }
                        final boolean z11111 = z6;
                        fvsVar3 = fvsVar2;
                        boolean z11112 = z11;
                        fxgVar = null;
                        algVar2 = algVar;
                        uu.b(algVar2, cmwVar, aonjVar11114, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                            public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                java.lang.Object objPrevious;
                                aer aerVar = (aer) obj4;
                                defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                cav cavVar3 = (cav) obj6;
                                ((java.lang.Integer) obj7).intValue();
                                boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                if (!z11111 && !zN) {
                                    java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                    java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                    do {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator.previous();
                                    } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                    fvsVar5 = (defpackage.fvs) objPrevious;
                                }
                                if (fvsVar5 == null) {
                                    cavVar3.u(872360807);
                                    cavVar3.o();
                                } else {
                                    cjt cjtVar = cjtVarL;
                                    cavVar3.u(-1218785318);
                                    defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                    cavVar3.o();
                                }
                                return aojh.a;
                            }
                        }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                        java.lang.Object objF12 = algVar2.f();
                        java.lang.Object objH12 = algVar2.h();
                        zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                        objR16 = cbtVar.R();
                        if (zB2) {
                            defpackage.acub acubVar112 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar112);
                            objR16 = acubVar112;
                        } else {
                            defpackage.acub acubVar113 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar113);
                            objR16 = acubVar113;
                        }
                        cbp.f(objF12, objH12, (aonn) objR16, cavVar2);
                        cbtVar.W(z11112);
                    } else {
                        aonnVar3 = aonnVar2;
                    }
                    if ((i3 & 805306368) == 536870912) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zD11 = zC4 | z7 | cavVar2.D(fwzVar3);
                    if (((i3 & 29360128) ^ 12582912) > c) {
                        aonjVar6 = aonjVar4;
                        if (!cavVar2.B(aonjVar6)) {
                            z8 = true;
                        }
                        boolean z11113 = zD11 | z8;
                        if (((i3 & 458752) ^ 196608) > 131072) {
                            aonjVar7 = aonjVar2;
                            if (!cavVar2.B(aonjVar7)) {
                                z9 = true;
                            }
                            z10 = z11113 | z9;
                            objR9 = cbtVar.R();
                            if (z10) {
                                final int i21110 = 0;
                                aonj aonjVar11115 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i21110 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i21111 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i21112 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i21113 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar11115);
                                objR9 = aonjVar11115;
                            } else {
                                final int i21111 = 0;
                                aonj aonjVar11116 = new aonj() { // from class: fxm
                                    public final java.lang.Object a(java.lang.Object obj4) {
                                        if (i21111 != 0) {
                                            defpackage.aes aesVar = (defpackage.aes) obj4;
                                            defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                            aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                            if (z6) {
                                                int i21112 = defpackage.fwc.e;
                                                java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                                while (itA.hasNext()) {
                                                    defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                    if (fwcVar7 instanceof defpackage.fwy) {
                                                    } else if (fwcVar7 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                            }
                                            if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                                int i21113 = defpackage.fwc.e;
                                                java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                                while (itA2.hasNext()) {
                                                    defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                    if (fwcVar8 instanceof defpackage.fwy) {
                                                    } else if (fwcVar8 instanceof defpackage.fww) {
                                                    }
                                                }
                                                return (agf) aonjVar6.a(aesVar);
                                            }
                                            int i21114 = defpackage.fwc.e;
                                            java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA3.hasNext()) {
                                                defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                                if (fwcVar9 instanceof defpackage.fwy) {
                                                } else if (fwcVar9 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar7.a(aesVar);
                                        }
                                        defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                        aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                        if (z6) {
                                            int i30 = defpackage.fwc.e;
                                            java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA4.hasNext()) {
                                                defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                                if (fwcVar11 instanceof defpackage.fwy) {
                                                } else if (fwcVar11 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i31 = defpackage.fwc.e;
                                            java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                            while (itA5.hasNext()) {
                                                defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                                if (fwcVar12 instanceof defpackage.fwy) {
                                                } else if (fwcVar12 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agg) aonjVar6.a(aesVar2);
                                        }
                                        int i32 = defpackage.fwc.e;
                                        java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA6.hasNext()) {
                                            defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                            if (fwcVar13 instanceof defpackage.fwy) {
                                            } else if (fwcVar13 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar7.a(aesVar2);
                                    }
                                };
                                cbtVar.ab(aonjVar11116);
                                objR9 = aonjVar11116;
                            }
                            aonjVar8 = (aonj) objR9;
                            if (((i8 & 14) ^ 6) > 4) {
                            }
                            objR10 = cbtVar.R();
                            if (z3) {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            } else {
                                objR10 = new defpackage.fvt(9);
                                cbtVar.ab(objR10);
                            }
                            aonjVar9 = (aonj) objR10;
                            java.lang.Boolean bool13 = java.lang.Boolean.TRUE;
                            zD5 = cavVar2.D(fwzVar3);
                            objR11 = cbtVar.R();
                            if (zD5) {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            } else {
                                objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                                cbtVar.ab(objR11);
                            }
                            cbp.c(bool13, (aonj) objR11, cavVar2);
                            objR12 = cbtVar.R();
                            if (objR12 == obj) {
                                objR12 = new defpackage.akr(fvsVar);
                                cbtVar.ab(objR12);
                            }
                            akrVar = (defpackage.akr) objR12;
                            algVarC = alk.c(akrVar, cavVar2, 48);
                            if (z6) {
                                cavVar2.u(-1404600068);
                                java.lang.Float fValueOf13 = java.lang.Float.valueOf(fC);
                                zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                                objR17 = cbtVar.R();
                                if (zB3) {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                } else {
                                    objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                    cbtVar.ab(objR17);
                                }
                                cbp.g(fValueOf13, (aonn) objR17, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                                algVar = algVarC;
                                fvsVar2 = fvsVar;
                            } else {
                                cavVar2.u(-1404181630);
                                zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                                objR13 = cbtVar.R();
                                if (zD6) {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                } else {
                                    objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                    fvsVar2 = fvsVar;
                                    algVar = algVarC;
                                    cbtVar.ab(objR13);
                                }
                                cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                                z11 = false;
                                cbtVar.W(false);
                            }
                            zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                            objR14 = cbtVar.R();
                            if (zD7) {
                                defpackage.fwz fwzVar118 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar118, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar118;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            } else {
                                defpackage.fwz fwzVar119 = fwzVar3;
                                objR14 = new defpackage.fxn(admVar, fwzVar119, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                                admVar2 = admVar;
                                fwzVar4 = fwzVar119;
                                cerVar2 = cerVar;
                                cbtVar.ab(objR14);
                            }
                            aonj aonjVar11117 = (aonj) objR14;
                            objR15 = cbtVar.R();
                            if (objR15 == obj) {
                                objR15 = new defpackage.fvt(10);
                                cbtVar.ab(objR15);
                            }
                            final boolean z11114 = z6;
                            fvsVar3 = fvsVar2;
                            boolean z11115 = z11;
                            fxgVar = null;
                            algVar2 = algVar;
                            uu.b(algVar2, cmwVar, aonjVar11117, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                    java.lang.Object objPrevious;
                                    aer aerVar = (aer) obj4;
                                    defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                    cav cavVar3 = (cav) obj6;
                                    ((java.lang.Integer) obj7).intValue();
                                    boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                    if (!z11114 && !zN) {
                                        java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                        java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                        do {
                                            if (!listIterator.hasPrevious()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = listIterator.previous();
                                        } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                        fvsVar5 = (defpackage.fvs) objPrevious;
                                    }
                                    if (fvsVar5 == null) {
                                        cavVar3.u(872360807);
                                        cavVar3.o();
                                    } else {
                                        cjt cjtVar = cjtVarL;
                                        cavVar3.u(-1218785318);
                                        defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                        cavVar3.o();
                                    }
                                    return aojh.a;
                                }
                            }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                            java.lang.Object objF13 = algVar2.f();
                            java.lang.Object objH13 = algVar2.h();
                            zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                            objR16 = cbtVar.R();
                            if (zB2) {
                                defpackage.acub acubVar114 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar114);
                                objR16 = acubVar114;
                            } else {
                                defpackage.acub acubVar115 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                                cbtVar.ab(acubVar115);
                                objR16 = acubVar115;
                            }
                            cbp.f(objF13, objH13, (aonn) objR16, cavVar2);
                            cbtVar.W(z11115);
                        } else {
                            aonjVar7 = aonjVar2;
                        }
                        if ((i3 & 196608) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z11113 | z9;
                        objR9 = cbtVar.R();
                        if (z10) {
                            final int i21112 = 0;
                            aonj aonjVar11118 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i21112 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i21113 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21114 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21115 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar11118);
                            objR9 = aonjVar11118;
                        } else {
                            final int i21113 = 0;
                            aonj aonjVar11119 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i21113 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i21114 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21115 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21116 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar11119);
                            objR9 = aonjVar11119;
                        }
                        aonjVar8 = (aonj) objR9;
                        if (((i8 & 14) ^ 6) > 4) {
                        }
                        objR10 = cbtVar.R();
                        if (z3) {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        } else {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        }
                        aonjVar9 = (aonj) objR10;
                        java.lang.Boolean bool14 = java.lang.Boolean.TRUE;
                        zD5 = cavVar2.D(fwzVar3);
                        objR11 = cbtVar.R();
                        if (zD5) {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        } else {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        }
                        cbp.c(bool14, (aonj) objR11, cavVar2);
                        objR12 = cbtVar.R();
                        if (objR12 == obj) {
                            objR12 = new defpackage.akr(fvsVar);
                            cbtVar.ab(objR12);
                        }
                        akrVar = (defpackage.akr) objR12;
                        algVarC = alk.c(akrVar, cavVar2, 48);
                        if (z6) {
                            cavVar2.u(-1404600068);
                            java.lang.Float fValueOf14 = java.lang.Float.valueOf(fC);
                            zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                            objR17 = cbtVar.R();
                            if (zB3) {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            } else {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            }
                            cbp.g(fValueOf14, (aonn) objR17, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                            algVar = algVarC;
                            fvsVar2 = fvsVar;
                        } else {
                            cavVar2.u(-1404181630);
                            zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                            objR13 = cbtVar.R();
                            if (zD6) {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            } else {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            }
                            cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                        }
                        zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                        objR14 = cbtVar.R();
                        if (zD7) {
                            defpackage.fwz fwzVar1110 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar1110, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar1110;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        } else {
                            defpackage.fwz fwzVar1111 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar1111, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar1111;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        }
                        aonj aonjVar111110 = (aonj) objR14;
                        objR15 = cbtVar.R();
                        if (objR15 == obj) {
                            objR15 = new defpackage.fvt(10);
                            cbtVar.ab(objR15);
                        }
                        final boolean z11116 = z6;
                        fvsVar3 = fvsVar2;
                        boolean z11117 = z11;
                        fxgVar = null;
                        algVar2 = algVar;
                        uu.b(algVar2, cmwVar, aonjVar111110, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                            public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                java.lang.Object objPrevious;
                                aer aerVar = (aer) obj4;
                                defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                cav cavVar3 = (cav) obj6;
                                ((java.lang.Integer) obj7).intValue();
                                boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                if (!z11116 && !zN) {
                                    java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                    java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                    do {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator.previous();
                                    } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                    fvsVar5 = (defpackage.fvs) objPrevious;
                                }
                                if (fvsVar5 == null) {
                                    cavVar3.u(872360807);
                                    cavVar3.o();
                                } else {
                                    cjt cjtVar = cjtVarL;
                                    cavVar3.u(-1218785318);
                                    defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                    cavVar3.o();
                                }
                                return aojh.a;
                            }
                        }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                        java.lang.Object objF14 = algVar2.f();
                        java.lang.Object objH14 = algVar2.h();
                        zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                        objR16 = cbtVar.R();
                        if (zB2) {
                            defpackage.acub acubVar116 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar116);
                            objR16 = acubVar116;
                        } else {
                            defpackage.acub acubVar117 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar117);
                            objR16 = acubVar117;
                        }
                        cbp.f(objF14, objH14, (aonn) objR16, cavVar2);
                        cbtVar.W(z11117);
                    } else {
                        aonjVar6 = aonjVar4;
                    }
                    if ((i3 & 12582912) == c) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z11118 = zD11 | z8;
                    if (((i3 & 458752) ^ 196608) > 131072) {
                        aonjVar7 = aonjVar2;
                        if (!cavVar2.B(aonjVar7)) {
                            z9 = true;
                        }
                        z10 = z11118 | z9;
                        objR9 = cbtVar.R();
                        if (z10) {
                            final int i21114 = 0;
                            aonj aonjVar111111 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i21114 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i21115 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21116 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21117 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar111111);
                            objR9 = aonjVar111111;
                        } else {
                            final int i21115 = 0;
                            aonj aonjVar111112 = new aonj() { // from class: fxm
                                public final java.lang.Object a(java.lang.Object obj4) {
                                    if (i21115 != 0) {
                                        defpackage.aes aesVar = (defpackage.aes) obj4;
                                        defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                        aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                        if (z6) {
                                            int i21116 = defpackage.fwc.e;
                                            java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                            while (itA.hasNext()) {
                                                defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                                if (fwcVar7 instanceof defpackage.fwy) {
                                                } else if (fwcVar7 instanceof defpackage.fww) {
                                                }
                                            }
                                            return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                        }
                                        if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                            int i21117 = defpackage.fwc.e;
                                            java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                            while (itA2.hasNext()) {
                                                defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                                if (fwcVar8 instanceof defpackage.fwy) {
                                                } else if (fwcVar8 instanceof defpackage.fww) {
                                                }
                                            }
                                            return (agf) aonjVar6.a(aesVar);
                                        }
                                        int i21118 = defpackage.fwc.e;
                                        java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA3.hasNext()) {
                                            defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                            if (fwcVar9 instanceof defpackage.fwy) {
                                            } else if (fwcVar9 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar7.a(aesVar);
                                    }
                                    defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                    aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                    if (z6) {
                                        int i30 = defpackage.fwc.e;
                                        java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA4.hasNext()) {
                                            defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                            if (fwcVar11 instanceof defpackage.fwy) {
                                            } else if (fwcVar11 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i31 = defpackage.fwc.e;
                                        java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                        while (itA5.hasNext()) {
                                            defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                            if (fwcVar12 instanceof defpackage.fwy) {
                                            } else if (fwcVar12 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agg) aonjVar6.a(aesVar2);
                                    }
                                    int i32 = defpackage.fwc.e;
                                    java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA6.hasNext()) {
                                        defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                        if (fwcVar13 instanceof defpackage.fwy) {
                                        } else if (fwcVar13 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar7.a(aesVar2);
                                }
                            };
                            cbtVar.ab(aonjVar111112);
                            objR9 = aonjVar111112;
                        }
                        aonjVar8 = (aonj) objR9;
                        if (((i8 & 14) ^ 6) > 4) {
                        }
                        objR10 = cbtVar.R();
                        if (z3) {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        } else {
                            objR10 = new defpackage.fvt(9);
                            cbtVar.ab(objR10);
                        }
                        aonjVar9 = (aonj) objR10;
                        java.lang.Boolean bool15 = java.lang.Boolean.TRUE;
                        zD5 = cavVar2.D(fwzVar3);
                        objR11 = cbtVar.R();
                        if (zD5) {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        } else {
                            objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                            cbtVar.ab(objR11);
                        }
                        cbp.c(bool15, (aonj) objR11, cavVar2);
                        objR12 = cbtVar.R();
                        if (objR12 == obj) {
                            objR12 = new defpackage.akr(fvsVar);
                            cbtVar.ab(objR12);
                        }
                        akrVar = (defpackage.akr) objR12;
                        algVarC = alk.c(akrVar, cavVar2, 48);
                        if (z6) {
                            cavVar2.u(-1404600068);
                            java.lang.Float fValueOf15 = java.lang.Float.valueOf(fC);
                            zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                            objR17 = cbtVar.R();
                            if (zB3) {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            } else {
                                objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                                cbtVar.ab(objR17);
                            }
                            cbp.g(fValueOf15, (aonn) objR17, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                            algVar = algVarC;
                            fvsVar2 = fvsVar;
                        } else {
                            cavVar2.u(-1404181630);
                            zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                            objR13 = cbtVar.R();
                            if (zD6) {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            } else {
                                objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                                fvsVar2 = fvsVar;
                                algVar = algVarC;
                                cbtVar.ab(objR13);
                            }
                            cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                            z11 = false;
                            cbtVar.W(false);
                        }
                        zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                        objR14 = cbtVar.R();
                        if (zD7) {
                            defpackage.fwz fwzVar1112 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar1112, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar1112;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        } else {
                            defpackage.fwz fwzVar1113 = fwzVar3;
                            objR14 = new defpackage.fxn(admVar, fwzVar1113, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                            admVar2 = admVar;
                            fwzVar4 = fwzVar1113;
                            cerVar2 = cerVar;
                            cbtVar.ab(objR14);
                        }
                        aonj aonjVar111113 = (aonj) objR14;
                        objR15 = cbtVar.R();
                        if (objR15 == obj) {
                            objR15 = new defpackage.fvt(10);
                            cbtVar.ab(objR15);
                        }
                        final boolean z11119 = z6;
                        fvsVar3 = fvsVar2;
                        boolean z111110 = z11;
                        fxgVar = null;
                        algVar2 = algVar;
                        uu.b(algVar2, cmwVar, aonjVar111113, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                            public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                                java.lang.Object objPrevious;
                                aer aerVar = (aer) obj4;
                                defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                                cav cavVar3 = (cav) obj6;
                                ((java.lang.Integer) obj7).intValue();
                                boolean zN = aooh.n(akrVar.a(), fvsVar3);
                                if (!z11119 && !zN) {
                                    java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                    java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                    do {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator.previous();
                                    } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                    fvsVar5 = (defpackage.fvs) objPrevious;
                                }
                                if (fvsVar5 == null) {
                                    cavVar3.u(872360807);
                                    cavVar3.o();
                                } else {
                                    cjt cjtVar = cjtVarL;
                                    cavVar3.u(-1218785318);
                                    defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                    cavVar3.o();
                                }
                                return aojh.a;
                            }
                        }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                        java.lang.Object objF15 = algVar2.f();
                        java.lang.Object objH15 = algVar2.h();
                        zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                        objR16 = cbtVar.R();
                        if (zB2) {
                            defpackage.acub acubVar118 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar118);
                            objR16 = acubVar118;
                        } else {
                            defpackage.acub acubVar119 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                            cbtVar.ab(acubVar119);
                            objR16 = acubVar119;
                        }
                        cbp.f(objF15, objH15, (aonn) objR16, cavVar2);
                        cbtVar.W(z111110);
                    } else {
                        aonjVar7 = aonjVar2;
                    }
                    if ((i3 & 196608) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z11118 | z9;
                    objR9 = cbtVar.R();
                    if (z10) {
                        final int i21116 = 0;
                        aonj aonjVar111114 = new aonj() { // from class: fxm
                            public final java.lang.Object a(java.lang.Object obj4) {
                                if (i21116 != 0) {
                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                    if (z6) {
                                        int i21117 = defpackage.fwc.e;
                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                        while (itA.hasNext()) {
                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                            if (fwcVar7 instanceof defpackage.fwy) {
                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i21118 = defpackage.fwc.e;
                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA2.hasNext()) {
                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                            if (fwcVar8 instanceof defpackage.fwy) {
                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar6.a(aesVar);
                                    }
                                    int i21119 = defpackage.fwc.e;
                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                    while (itA3.hasNext()) {
                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                        if (fwcVar9 instanceof defpackage.fwy) {
                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agf) aonjVar7.a(aesVar);
                                }
                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                if (z6) {
                                    int i30 = defpackage.fwc.e;
                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA4.hasNext()) {
                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                        if (fwcVar11 instanceof defpackage.fwy) {
                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                        }
                                    }
                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                }
                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                    int i31 = defpackage.fwc.e;
                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA5.hasNext()) {
                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                        if (fwcVar12 instanceof defpackage.fwy) {
                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar6.a(aesVar2);
                                }
                                int i32 = defpackage.fwc.e;
                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                while (itA6.hasNext()) {
                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                    if (fwcVar13 instanceof defpackage.fwy) {
                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                    }
                                }
                                return (agg) aonjVar7.a(aesVar2);
                            }
                        };
                        cbtVar.ab(aonjVar111114);
                        objR9 = aonjVar111114;
                    } else {
                        final int i21117 = 0;
                        aonj aonjVar111115 = new aonj() { // from class: fxm
                            public final java.lang.Object a(java.lang.Object obj4) {
                                if (i21117 != 0) {
                                    defpackage.aes aesVar = (defpackage.aes) obj4;
                                    defpackage.fwc fwcVar6 = ((defpackage.fvs) aesVar.c()).a;
                                    aooh.d(fwcVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    defpackage.fwy fwyVar = (defpackage.fwy) fwcVar6;
                                    if (z6) {
                                        int i21118 = defpackage.fwc.e;
                                        java.util.Iterator itA = defpackage.hgt.Y(fwyVar).a();
                                        while (itA.hasNext()) {
                                            defpackage.fwc fwcVar7 = (defpackage.fwc) itA.next();
                                            if (fwcVar7 instanceof defpackage.fwy) {
                                            } else if (fwcVar7 instanceof defpackage.fww) {
                                            }
                                        }
                                        return aonnVar3.a(aesVar, java.lang.Integer.valueOf(i4));
                                    }
                                    if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                        int i21119 = defpackage.fwc.e;
                                        java.util.Iterator itA2 = defpackage.hgt.Y(fwyVar).a();
                                        while (itA2.hasNext()) {
                                            defpackage.fwc fwcVar8 = (defpackage.fwc) itA2.next();
                                            if (fwcVar8 instanceof defpackage.fwy) {
                                            } else if (fwcVar8 instanceof defpackage.fww) {
                                            }
                                        }
                                        return (agf) aonjVar6.a(aesVar);
                                    }
                                    int i211110 = defpackage.fwc.e;
                                    java.util.Iterator itA3 = defpackage.hgt.Y(fwyVar).a();
                                    while (itA3.hasNext()) {
                                        defpackage.fwc fwcVar9 = (defpackage.fwc) itA3.next();
                                        if (fwcVar9 instanceof defpackage.fwy) {
                                        } else if (fwcVar9 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agf) aonjVar7.a(aesVar);
                                }
                                defpackage.aes aesVar2 = (defpackage.aes) obj4;
                                defpackage.fwc fwcVar10 = ((defpackage.fvs) aesVar2.b()).a;
                                aooh.d(fwcVar10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                defpackage.fwy fwyVar2 = (defpackage.fwy) fwcVar10;
                                if (z6) {
                                    int i30 = defpackage.fwc.e;
                                    java.util.Iterator itA4 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA4.hasNext()) {
                                        defpackage.fwc fwcVar11 = (defpackage.fwc) itA4.next();
                                        if (fwcVar11 instanceof defpackage.fwy) {
                                        } else if (fwcVar11 instanceof defpackage.fww) {
                                        }
                                    }
                                    return aonnVar3.a(aesVar2, java.lang.Integer.valueOf(i4));
                                }
                                if (((java.lang.Boolean) fwzVar3.c.a()).booleanValue()) {
                                    int i31 = defpackage.fwc.e;
                                    java.util.Iterator itA5 = defpackage.hgt.Y(fwyVar2).a();
                                    while (itA5.hasNext()) {
                                        defpackage.fwc fwcVar12 = (defpackage.fwc) itA5.next();
                                        if (fwcVar12 instanceof defpackage.fwy) {
                                        } else if (fwcVar12 instanceof defpackage.fww) {
                                        }
                                    }
                                    return (agg) aonjVar6.a(aesVar2);
                                }
                                int i32 = defpackage.fwc.e;
                                java.util.Iterator itA6 = defpackage.hgt.Y(fwyVar2).a();
                                while (itA6.hasNext()) {
                                    defpackage.fwc fwcVar13 = (defpackage.fwc) itA6.next();
                                    if (fwcVar13 instanceof defpackage.fwy) {
                                    } else if (fwcVar13 instanceof defpackage.fww) {
                                    }
                                }
                                return (agg) aonjVar7.a(aesVar2);
                            }
                        };
                        cbtVar.ab(aonjVar111115);
                        objR9 = aonjVar111115;
                    }
                    aonjVar8 = (aonj) objR9;
                    if (((i8 & 14) ^ 6) > 4) {
                    }
                    objR10 = cbtVar.R();
                    if (z3) {
                        objR10 = new defpackage.fvt(9);
                        cbtVar.ab(objR10);
                    } else {
                        objR10 = new defpackage.fvt(9);
                        cbtVar.ab(objR10);
                    }
                    aonjVar9 = (aonj) objR10;
                    java.lang.Boolean bool16 = java.lang.Boolean.TRUE;
                    zD5 = cavVar2.D(fwzVar3);
                    objR11 = cbtVar.R();
                    if (zD5) {
                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                        cbtVar.ab(objR11);
                    } else {
                        objR11 = new dpz(cerVar, fwzVar3, 11, (byte[]) null);
                        cbtVar.ab(objR11);
                    }
                    cbp.c(bool16, (aonj) objR11, cavVar2);
                    objR12 = cbtVar.R();
                    if (objR12 == obj) {
                        objR12 = new defpackage.akr(fvsVar);
                        cbtVar.ab(objR12);
                    }
                    akrVar = (defpackage.akr) objR12;
                    algVarC = alk.c(akrVar, cavVar2, 48);
                    if (z6) {
                        cavVar2.u(-1404600068);
                        java.lang.Float fValueOf16 = java.lang.Float.valueOf(fC);
                        zB3 = cavVar2.B(cerVarJ) | cavVar2.D(akrVar) | cavVar2.y(fC);
                        objR17 = cbtVar.R();
                        if (zB3) {
                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                            cbtVar.ab(objR17);
                        } else {
                            objR17 = new defpackage.fxo(akrVar, fC, cerVarJ, (aoln) null, 0);
                            cbtVar.ab(objR17);
                        }
                        cbp.g(fValueOf16, (aonn) objR17, cavVar2);
                        z11 = false;
                        cbtVar.W(false);
                        algVar = algVarC;
                        fvsVar2 = fvsVar;
                    } else {
                        cavVar2.u(-1404181630);
                        zD6 = cavVar2.D(akrVar) | cavVar2.D(fvsVar) | cavVar2.B(algVarC);
                        objR13 = cbtVar.R();
                        if (zD6) {
                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                            fvsVar2 = fvsVar;
                            algVar = algVarC;
                            cbtVar.ab(objR13);
                        } else {
                            objR13 = new defpackage.fxp(akrVar, fvsVar, algVarC, (aoln) null, 0);
                            fvsVar2 = fvsVar;
                            algVar = algVarC;
                            cbtVar.ab(objR13);
                        }
                        cbp.g(fvsVar2, (aonn) objR13, cavVar2);
                        z11 = false;
                        cbtVar.W(false);
                    }
                    zD7 = cavVar2.D(admVar) | cavVar2.D(fwzVar3) | cavVar2.C(z6) | cavVar2.B(aonjVar5) | cavVar2.B(aonjVar8) | cavVar2.B(aonjVar9);
                    objR14 = cbtVar.R();
                    if (zD7) {
                        defpackage.fwz fwzVar1114 = fwzVar3;
                        objR14 = new defpackage.fxn(admVar, fwzVar1114, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                        admVar2 = admVar;
                        fwzVar4 = fwzVar1114;
                        cerVar2 = cerVar;
                        cbtVar.ab(objR14);
                    } else {
                        defpackage.fwz fwzVar1115 = fwzVar3;
                        objR14 = new defpackage.fxn(admVar, fwzVar1115, z6, aonjVar5, aonjVar8, aonjVar9, cerVar, 0);
                        admVar2 = admVar;
                        fwzVar4 = fwzVar1115;
                        cerVar2 = cerVar;
                        cbtVar.ab(objR14);
                    }
                    aonj aonjVar111116 = (aonj) objR14;
                    objR15 = cbtVar.R();
                    if (objR15 == obj) {
                        objR15 = new defpackage.fvt(10);
                        cbtVar.ab(objR15);
                    }
                    final boolean z111111 = z6;
                    fvsVar3 = fvsVar2;
                    boolean z111112 = z11;
                    fxgVar = null;
                    algVar2 = algVar;
                    uu.b(algVar2, cmwVar, aonjVar111116, cmjVar, (aonj) objR15, cfo.j(-2066070464, new aonp() { // from class: fxk
                        public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                            java.lang.Object objPrevious;
                            aer aerVar = (aer) obj4;
                            defpackage.fvs fvsVar5 = (defpackage.fvs) obj5;
                            cav cavVar3 = (cav) obj6;
                            ((java.lang.Integer) obj7).intValue();
                            boolean zN = aooh.n(akrVar.a(), fvsVar3);
                            if (!z111111 && !zN) {
                                java.util.List listAc = defpackage.hgu.ac(cerVar2);
                                java.util.ListIterator listIterator = listAc.listIterator(listAc.size());
                                do {
                                    if (!listIterator.hasPrevious()) {
                                        objPrevious = null;
                                        break;
                                    }
                                    objPrevious = listIterator.previous();
                                } while (!aooh.n(fvsVar5, (defpackage.fvs) objPrevious));
                                fvsVar5 = (defpackage.fvs) objPrevious;
                            }
                            if (fvsVar5 == null) {
                                cavVar3.u(872360807);
                                cavVar3.o();
                            } else {
                                cjt cjtVar = cjtVarL;
                                cavVar3.u(-1218785318);
                                defpackage.hgt.L(fvsVar5, cjtVar, cfo.j(-1138044367, new defpackage.dqv(fvsVar5, aerVar, 5), cavVar3), cavVar3, 384);
                                cavVar3.o();
                            }
                            return aojh.a;
                        }
                    }, cavVar2), cavVar2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                    java.lang.Object objF16 = algVar2.f();
                    java.lang.Object objH16 = algVar2.h();
                    zB2 = cavVar2.B(algVar2) | cavVar2.D(fvxVar) | cavVar2.D(fvsVar3) | cavVar2.D(fwzVar4) | cavVar2.D(admVar2);
                    objR16 = cbtVar.R();
                    if (zB2) {
                        defpackage.acub acubVar1110 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                        cbtVar.ab(acubVar1110);
                        objR16 = acubVar1110;
                    } else {
                        defpackage.acub acubVar1111 = new defpackage.acub(algVar2, fvxVar, fvsVar3, admVar2, cerVar2, fwzVar4, (aoln) null, 1);
                        cbtVar.ab(acubVar1111);
                        objR16 = acubVar1111;
                    }
                    cbp.f(objF16, objH16, (aonn) objR16, cavVar2);
                    cbtVar.W(z111112);
                } else {
                    cavVar2 = cavVar2;
                    fxgVar = null;
                    cavVar2.u(-1398883978);
                    cbtVar2.W(false);
                }
                fwnVarB2 = fvxVar.e().b("dialog");
                if (fwnVarB2 instanceof defpackage.fxg) {
                    fxgVar2 = (defpackage.fxg) fwnVarB2;
                } else {
                    fxgVar2 = fxgVar;
                }
                if (fxgVar2 == null) {
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        return;
                    } else {
                        fxlVar = new defpackage.fxl(fvxVar, fweVar, cmwVar, cmjVar, aonjVar, aonjVar2, aonjVar3, aonjVar4, aonnVar, aonnVar2, i, i2, 0);
                    }
                } else {
                    defpackage.hgt.O(fxgVar2, cavVar2, 8);
                }
            }
            cdkVarI.c = fxlVar;
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            fxlVar = new defpackage.fxl(fvxVar, fweVar, cmwVar, cmjVar, aonjVar, aonjVar2, aonjVar3, aonjVar4, aonnVar, aonnVar2, i, i2, 2);
            cdkVarI.c = fxlVar;
        }
    }

    public static void ae(defpackage.fvx fvxVar, cmw cmwVar, cmj cmjVar, aonj aonjVar, aonj aonjVar2, aonj aonjVar3, aonj aonjVar4, aonn aonnVar, aonn aonnVar2, aonj aonjVar5, cav cavVar, int i, int i2) {
        int i3;
        aonj aonjVar6;
        aonj aonjVar7;
        cav cavVar2;
        cmj cmjVar2;
        aonj aonjVar8;
        aonj aonjVar9;
        aonn aonnVar3;
        aonn aonnVar4;
        cmj cmjVar3;
        aonj aonjVar10;
        aonn aonnVar5;
        aonj aonjVar11;
        aonn aonnVar6;
        int i4 = i & 6;
        cav cavVarB = cavVar.b(621695386);
        if (i4 == 0) {
            i3 = (true != cavVarB.D(fvxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B("GooglePhotosHome") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        int i5 = i3 | 27648;
        if ((196608 & i) == 0) {
            aonjVar6 = aonjVar;
            i5 |= true != cavVarB.D(aonjVar6) ? 65536 : 131072;
        } else {
            aonjVar6 = aonjVar;
        }
        if ((1572864 & i) == 0) {
            aonjVar7 = aonjVar2;
            i5 |= true != cavVarB.D(aonjVar7) ? 524288 : 1048576;
        } else {
            aonjVar7 = aonjVar2;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= 268435456;
        }
        int i6 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= true == cavVarB.D(aonjVar5) ? 256 : 128;
        }
        if (cavVarB.H(((306783379 & i5) == 306783378 && (i6 & 147) == 146) ? false : true, i5 & 1)) {
            int i7 = (-2143289345) & i5;
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmjVar3 = cmh.a;
                aonjVar10 = aonjVar6;
                aonnVar5 = defpackage.fxc.a;
                aonjVar11 = aonjVar7;
                aonnVar6 = defpackage.fxc.b;
            } else {
                cavVarB.s();
                cmjVar3 = cmjVar;
                aonjVar10 = aonjVar3;
                aonjVar11 = aonjVar4;
                aonnVar5 = aonnVar;
                aonnVar6 = aonnVar2;
            }
            cavVarB.l();
            boolean z = (i5 & 57344) == 16384;
            boolean z2 = (i5 & 112) == 32;
            boolean z3 = (i6 & 896) == 256;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2 | z3) || objR == cau.a) {
                defpackage.fwf fwfVar = new defpackage.fwf(fvxVar.e());
                aonjVar5.a(fwfVar);
                objR = fwfVar.c();
                cbtVar.ab(objR);
            }
            int i8 = i7 >> 3;
            cavVar2 = cavVarB;
            cmj cmjVar4 = cmjVar3;
            ad(fvxVar, (defpackage.fwe) objR, cmwVar, cmjVar4, aonjVar6, aonjVar7, aonjVar10, aonjVar11, aonnVar5, aonnVar6, cavVar2, (i5 & 8078) | (i8 & 57344) | (i8 & 458752), 0);
            cmjVar2 = cmjVar4;
            aonjVar8 = aonjVar10;
            aonjVar9 = aonjVar11;
            aonnVar3 = aonnVar5;
            aonnVar4 = aonnVar6;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmjVar2 = cmjVar;
            aonjVar8 = aonjVar3;
            aonjVar9 = aonjVar4;
            aonnVar3 = aonnVar;
            aonnVar4 = aonnVar2;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.fxl(fvxVar, cmwVar, cmjVar2, aonjVar, aonjVar2, aonjVar8, aonjVar9, aonnVar3, aonnVar4, aonjVar5, i, i2, 3);
        }
    }

    public static defpackage.fvx af(android.content.Context context) {
        if (context == null) {
            aooh.i("context");
        }
        defpackage.fvx fvxVar = new defpackage.fvx(context);
        fvxVar.e().d(new defpackage.fwx(fvxVar.e()));
        fvxVar.e().d(new defpackage.fwz());
        fvxVar.e().d(new defpackage.fxg());
        return fvxVar;
    }

    public static boolean ag(defpackage.flk flkVar, boolean z) {
        int i;
        defpackage.etx etxVar = new defpackage.etx(16);
        boolean z2 = true;
        while (true) {
            etxVar.M(8);
            if (!flkVar.n(etxVar.b, 0, 8, true)) {
                break;
            }
            long jW = etxVar.w();
            int i2 = etxVar.i();
            if (jW != 1) {
                i = 8;
            } else {
                if (!flkVar.n(etxVar.b, 8, 8, true)) {
                    break;
                }
                etxVar.P(16);
                jW = etxVar.x();
                i = 16;
            }
            long j = i;
            if (jW < j) {
                break;
            }
            int i3 = (int) (jW - j);
            if (z2) {
                if (i2 == 1718909296 && i3 >= 8) {
                    etxVar.M(4);
                    defpackage.flc flcVar = (defpackage.flc) flkVar;
                    flcVar.n(etxVar.b, 0, 4, false);
                    if (etxVar.i() != 1751476579) {
                        break;
                    }
                    if (!z) {
                        return true;
                    }
                    flcVar.m(i3 - 4, false);
                } else {
                    break;
                }
            } else {
                if (i2 == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    ((defpackage.flc) flkVar).m(i3, false);
                }
            }
            z2 = false;
        }
        return false;
    }

    public static defpackage.eqy ah(defpackage.flk flkVar, boolean z) {
        defpackage.eqy eqyVarS = new defpackage.vk((byte[]) null, (byte[]) null).S(flkVar, !z ? defpackage.foi.a : null, 0);
        if (eqyVarS == null || eqyVarS.a() == 0) {
            return null;
        }
        return eqyVarS;
    }

    public static int ai(defpackage.etx etxVar, int i) {
        int i2;
        int i3;
        int iN;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i - 2;
                i3 = 576;
                return i3 << i2;
            case 6:
                iN = etxVar.n();
                return iN + 1;
            case 7:
                iN = etxVar.s();
                return iN + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                i2 = i - 8;
                i3 = 256;
                return i3 << i2;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    public static int aj(int i, java.nio.ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int iB;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b2 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b2; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b3 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b3; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((defpackage.hgt.az(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int i14 = eum.i(byteBuffer, byteBuffer.position());
                    if (!defpackage.flw.c(i14) || (i6 = (i14 >>> 19) & 3) == 1 || (i7 = (i14 >>> 17) & 3) == 0) {
                        iB = -1;
                    } else {
                        int i15 = i14 >>> 12;
                        int i16 = (i14 >>> 10) & 3;
                        int i17 = i15 & 15;
                        if (i17 == 0 || i17 == 15 || i16 == 3) {
                            iB = -1;
                        } else {
                            iB = defpackage.flw.b(i6, i7);
                        }
                    }
                    if (iB == -1) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return iB;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            int[] iArr = defpackage.fkp.a;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i18 = iPosition;
                            while (true) {
                                if (i18 > iLimit) {
                                    i8 = -1;
                                } else if ((eum.i(byteBuffer, i18 + 4) & (-2)) == -126718022) {
                                    i8 = i18 - iPosition;
                                } else {
                                    i18++;
                                }
                            }
                            if (i8 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) << 4;
                            }
                            return 0;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            return 512;
                        case 16:
                            return 1024;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            int i19 = defpackage.fkr.a;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return defpackage.fkr.c(new defpackage.etv(bArr)).b;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            break;
                        default:
                            throw new java.lang.IllegalStateException(a.bj(i, "Unexpected audio encoding: "));
                    }
                    break;
            }
            int[] iArr2 = defpackage.fkp.a;
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return defpackage.fkp.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
            }
            return 1536;
        }
        int[] iArr3 = defpackage.fli.a;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition3);
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i4 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i5 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i4 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b = byteBuffer.get(iPosition3 + 6);
                }
                i3 = i4 | (i5 >> 2);
            } else {
                i4 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b = byteBuffer.get(iPosition3 + 7);
            }
            i5 = b & 60;
            i3 = i4 | (i5 >> 2);
        } else {
            i3 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i3 + 1) << 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[RETURN, SYNTHETIC] */
    public static int ak(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i != 30) {
            switch (i) {
                case 5:
                    return 80000;
                case 6:
                    return 768000;
                case 7:
                    return 192000;
                case 8:
                    break;
                case 9:
                    return 40000;
                case 10:
                    return 100000;
                case 11:
                    return 16000;
                case 12:
                    return 7000;
                default:
                    switch (i) {
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            return 3062500;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            return 8000;
                        case 16:
                            return 256000;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            return 336000;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            return 768000;
                        default:
                            return -2147483647;
                    }
            }
        }
        return 2250000;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[LOOP:0: B:3:0x0001->B:13:0x0039, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[EDGE_INSN: B:16:0x003b->B:14:0x003b BREAK  A[LOOP:0: B:3:0x0001->B:13:0x0039], SYNTHETIC] */
    public static int al(defpackage.flk flkVar, byte[] bArr, int i, int i2) {
        int iMin;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            int i5 = i2 - i3;
            defpackage.flc flcVar = (defpackage.flc) flkVar;
            flcVar.h(i5);
            int i6 = flcVar.e;
            int i7 = flcVar.d;
            int i8 = i6 - i7;
            if (i8 == 0) {
                iMin = flcVar.b(flcVar.c, i7, i5, 0, true);
                if (iMin == -1) {
                    iMin = -1;
                } else {
                    flcVar.e += iMin;
                }
                if (iMin != -1) {
                    break;
                }
                i3 += iMin;
            } else {
                iMin = java.lang.Math.min(i5, i8);
            }
            java.lang.System.arraycopy(flcVar.c, flcVar.d, bArr, i4, iMin);
            flcVar.d += iMin;
            if (iMin != -1) {
                break;
                break;
            }
            i3 += iMin;
        }
        return i3;
    }

    public static void am(boolean z, java.lang.String str) throws defpackage.era {
        if (!z) {
            throw new defpackage.era(str, null, true, 1);
        }
    }

    public static boolean an(defpackage.flk flkVar, byte[] bArr, int i, int i2) {
        try {
            ((defpackage.flc) flkVar).o(bArr, i, i2, false);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean ao(defpackage.flk flkVar, int i) {
        try {
            ((defpackage.flc) flkVar).p(i, false);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean ap(defpackage.flk flkVar, byte[] bArr, int i, boolean z) throws java.io.EOFException {
        try {
            return flkVar.n(bArr, 0, i, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean aq(android.content.Context context) {
        android.view.Display.HdrCapabilities hdrCapabilitiesM;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !da$.ExternalSyntheticApiModelOutline1.m(display) || (hdrCapabilitiesM = fh$.ExternalSyntheticApiModelOutline0.m(display)) == null) {
            return false;
        }
        for (int i : fh$.ExternalSyntheticApiModelOutline0.m(hdrCapabilitiesM)) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0076 A[SYNTHETIC] */
    public static void ar(java.nio.ByteBuffer byteBuffer, boolean z) {
        int iAQ;
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (iLimit - iPosition >= 4) {
            while (iPosition < iLimit) {
                int iAQ2 = aQ(byteBuffer, iPosition, iLimit);
                if (iAQ2 == iLimit || (iAQ = iAQ2 + 3) >= iLimit || (i = (byteBuffer.get(iAQ) & 126) >> 1) <= 31) {
                    return;
                }
                if (i == 39) {
                    int i3 = iAQ2 + 5;
                    iAQ = aQ(byteBuffer, i3, iLimit);
                    int i4 = 0;
                    while (i3 < iAQ) {
                        int i5 = 0;
                        while (true) {
                            if (i3 >= iAQ) {
                                i4 = i4;
                                i2 = -1;
                                break;
                            }
                            int i6 = i3 + 1;
                            int i7 = byteBuffer.get(i3) & 255;
                            if (i7 != 3) {
                                if (i7 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i5 += i7;
                                if (i7 != 255) {
                                    if (i5 == 4) {
                                        i2 = i3;
                                    } else {
                                        i2 = -1;
                                    }
                                    i3 = i6;
                                    break;
                                }
                            } else if (i4 >= 2) {
                                i4 = 0;
                            } else {
                                i7 = 3;
                                if (i7 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i5 += i7;
                                if (i7 != 255) {
                                    if (i5 == 4) {
                                        i2 = i3;
                                    } else {
                                        i2 = -1;
                                    }
                                    i3 = i6;
                                    break;
                                }
                            }
                            i3 = i6;
                        }
                        if (i3 >= iAQ) {
                            if (i2 == -1) {
                                break;
                            }
                            byteBuffer.put(i2, (byte) -2);
                            break;
                        }
                        int i8 = 0;
                        while (i3 < iAQ) {
                            int i9 = i3 + 1;
                            int i10 = byteBuffer.get(i3) & 255;
                            if (i10 != 3) {
                                if (i10 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i8 += i10;
                                if (i10 != 255) {
                                    i3 = i9;
                                    break;
                                }
                            } else if (i4 >= 2) {
                                i4 = 0;
                            } else {
                                i10 = 3;
                                if (i10 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i8 += i10;
                                if (i10 != 255) {
                                    i3 = i9;
                                    break;
                                }
                            }
                            i3 = i9;
                        }
                        if (i2 != -1 && (!z || !defpackage.ete.k(byteBuffer, i3, java.lang.Math.min(i3 + i8, iAQ)))) {
                            byteBuffer.put(i2, (byte) -2);
                        }
                        i4 = i4;
                        int i11 = 0;
                        while (i11 < i8 && i3 < iAQ) {
                            int i12 = i3 + 1;
                            int i13 = byteBuffer.get(i3) & 255;
                            if (i13 != 3) {
                                if (i13 == 0) {
                                    i4++;
                                }
                                i11++;
                                i3 = i12;
                            } else if (i4 >= 2) {
                                i11--;
                            }
                            i4 = 0;
                            i11++;
                            i3 = i12;
                        }
                    }
                }
                iPosition = iAQ;
            }
        }
    }

    public static boolean as(defpackage.etx etxVar, defpackage.flo floVar, boolean z, aesq aesqVar) {
        try {
            long jY = etxVar.y();
            if (!z) {
                jY *= (long) floVar.b;
            }
            long j = floVar.j;
            if (j == 0 || jY <= j) {
                aesqVar.a = jY;
                return true;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0 A[LOOP:0: B:55:0x00be->B:56:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    public static boolean at(defpackage.etx etxVar, defpackage.flo floVar, int i, aesq aesqVar) {
        int iN;
        byte[] bArr;
        int i2;
        int i3;
        int iH;
        int i4;
        long jW = etxVar.w();
        long j = jW >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            long j2 = jW >> 12;
            long j3 = jW >> 8;
            long j4 = jW >> 4;
            long j5 = jW >> 1;
            long j6 = jW & 1;
            int i5 = (int) (j4 & 15);
            if (i5 > 7 ? !(i5 > 10 || floVar.g != 2) : i5 == floVar.g - 1) {
                int i6 = (int) (j5 & 7);
                if ((i6 == 0 || i6 == floVar.i) && j6 != 1 && as(etxVar, floVar, z, aesqVar)) {
                    long j7 = aesqVar.a;
                    int iAi = ai(etxVar, (int) (j2 & 15));
                    long j8 = floVar.j;
                    boolean z2 = j8 == 0 || j7 + ((long) iAi) >= j8;
                    if (iAi != -1 && ((z2 || iAi >= floVar.a) && iAi <= floVar.b)) {
                        int i7 = floVar.e;
                        int i8 = (int) (j3 & 15);
                        if (i8 == 0) {
                            iN = etxVar.n();
                            int i9 = etxVar.c;
                            bArr = etxVar.b;
                            i2 = i9 - 1;
                            java.lang.String str = eum.a;
                            i3 = 0;
                            for (int i10 = etxVar.c; i10 < i2; i10++) {
                                i3 = eum.d[i3 ^ (bArr[i10] & 255)];
                            }
                            if (iN == i3) {
                                if (etxVar.d() != 0) {
                                    iH = etxVar.h();
                                    if ((iH & 128) == 0) {
                                        i4 = (iH & 126) >> 1;
                                        if ((i4 < 2 && i4 <= 7) || (i4 >= 13 && i4 <= 31)) {
                                            defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (i8 <= 11) {
                            if (i8 == floVar.f) {
                                iN = etxVar.n();
                                int i11 = etxVar.c;
                                bArr = etxVar.b;
                                i2 = i11 - 1;
                                java.lang.String str2 = eum.a;
                                i3 = 0;
                                while (i10 < i2) {
                                    i3 = eum.d[i3 ^ (bArr[i10] & 255)];
                                }
                                if (iN == i3) {
                                    if (etxVar.d() != 0) {
                                        iH = etxVar.h();
                                        if ((iH & 128) == 0) {
                                            i4 = (iH & 126) >> 1;
                                            if (i4 < 2) {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        } else if (i8 == 12) {
                            if (etxVar.n() * 1000 == i7) {
                                iN = etxVar.n();
                                int i12 = etxVar.c;
                                bArr = etxVar.b;
                                i2 = i12 - 1;
                                java.lang.String str3 = eum.a;
                                i3 = 0;
                                while (i10 < i2) {
                                    i3 = eum.d[i3 ^ (bArr[i10] & 255)];
                                }
                                if (iN == i3) {
                                    if (etxVar.d() != 0) {
                                        iH = etxVar.h();
                                        if ((iH & 128) == 0) {
                                            i4 = (iH & 126) >> 1;
                                            if (i4 < 2) {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        } else if (i8 <= 14) {
                            int iS = etxVar.s();
                            if (i8 == 14) {
                                iS *= 10;
                            }
                            if (iS == i7) {
                                iN = etxVar.n();
                                int i13 = etxVar.c;
                                bArr = etxVar.b;
                                i2 = i13 - 1;
                                java.lang.String str4 = eum.a;
                                i3 = 0;
                                while (i10 < i2) {
                                    i3 = eum.d[i3 ^ (bArr[i10] & 255)];
                                }
                                if (iN == i3) {
                                    if (etxVar.d() != 0) {
                                        iH = etxVar.h();
                                        if ((iH & 128) == 0) {
                                            i4 = (iH & 126) >> 1;
                                            if (i4 < 2) {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                defpackage.etr.e("FlacFrameReader", a.bj(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean au(java.lang.Throwable th) {
        return android.os.Build.VERSION.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean av(java.lang.Throwable th) {
        return android.os.Build.VERSION.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static void aw(defpackage.fcs fcsVar, defpackage.fcs fcsVar2) {
        if (fcsVar != fcsVar2) {
            if (fcsVar2 != null) {
                fcsVar2.n(null);
            }
            if (fcsVar != null) {
                fcsVar.o(null);
            }
        }
    }

    public static boolean ax(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || !(i == 26 || i == 27)) {
            return android.os.Build.VERSION.SDK_INT >= 33 && i == 30;
        }
        return true;
    }

    public static void ay(defpackage.evr evrVar) {
        try {
            evrVar.d();
        } catch (java.io.IOException unused) {
        }
    }

    public static int az(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static /* synthetic */ zzx b() {
        return new zzx(amzb.a);
    }

    public static int c(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    public static defpackage.idn d(java.io.File file) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        try {
            ahvr.bZ("RIFF".equals(aL(bufferedInputStream)), "invalid or unsupported WAV header");
            bufferedInputStream.skip(4L);
            ahvr.bZ("WAVE".equals(aL(bufferedInputStream)), "no WAVE ID");
            java.lang.String strAL = aL(bufferedInputStream);
            int iAI = aI(bufferedInputStream);
            ahvr.bY("fmt ".equals(strAL));
            int i = 16;
            ahvr.bN(iAI >= 16, "Size of fmt chunk is too small.");
            int iAJ = aJ(bufferedInputStream);
            int iAJ2 = aJ(bufferedInputStream);
            ahvr.bZ(iAJ2 > 0, "Invalid channel count.");
            int iAI2 = aI(bufferedInputStream);
            ahvr.bZ(iAI2 > 0, "Invalid sample rate.");
            bufferedInputStream.skip(6L);
            int iAJ3 = aJ(bufferedInputStream);
            ahvr.bY(iAJ3 >= 8 && (iAJ3 & 7) == 0);
            if (iAJ == -2) {
                i = 26;
                ahvr.bZ(iAI >= 26, "Size of extensible fmt chunk in WAV file is too small.");
                bufferedInputStream.skip(8L);
                iAJ = aJ(bufferedInputStream);
            }
            ahvr.bZ(iAJ == 1, "Only uncompressed linear PCM WAV files are supported.");
            bufferedInputStream.skip(iAI - i);
            akzx akzxVarM = defpackage.idm.a.m();
            akzxVarM.u();
            defpackage.idm idmVar = (defpackage.idm) akzxVarM.b;
            idmVar.b |= 1;
            idmVar.c = iAI;
            akzxVarM.u();
            defpackage.idm idmVar2 = (defpackage.idm) akzxVarM.b;
            idmVar2.b |= 2;
            idmVar2.d = iAJ2;
            akzxVarM.u();
            defpackage.idm idmVar3 = (defpackage.idm) akzxVarM.b;
            idmVar3.b |= 4;
            idmVar3.e = iAI2;
            akzxVarM.u();
            defpackage.idm idmVar4 = (defpackage.idm) akzxVarM.b;
            idmVar4.b |= 8;
            idmVar4.f = iAJ3;
            defpackage.idm idmVar5 = (defpackage.idm) akzxVarM.p();
            java.lang.String strAL2 = aL(bufferedInputStream);
            int iAI3 = aI(bufferedInputStream);
            ahvr.bY("data".equals(strAL2));
            akzx akzxVarM2 = defpackage.idl.a.m();
            akzxVarM2.u();
            defpackage.idl idlVar = (defpackage.idl) akzxVarM2.b;
            idlVar.b |= 1;
            idlVar.c = iAI3;
            defpackage.idl idlVar2 = (defpackage.idl) akzxVarM2.p();
            akzx akzxVarM3 = defpackage.idn.a.m();
            akzxVarM3.u();
            defpackage.idn idnVar = (defpackage.idn) akzxVarM3.b;
            j$.util.Objects.requireNonNull(idmVar5);
            idnVar.c = idmVar5;
            idnVar.b |= 1;
            akzxVarM3.u();
            defpackage.idn idnVar2 = (defpackage.idn) akzxVarM3.b;
            j$.util.Objects.requireNonNull(idlVar2);
            idnVar2.d = idlVar2;
            idnVar2.b |= 2;
            defpackage.idn idnVar3 = (defpackage.idn) akzxVarM3.p();
            bufferedInputStream.close();
            return idnVar3;
        } catch (java.lang.Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean e(defpackage.icv icvVar) {
        aooh.f(icvVar, "<this>");
        return !icvVar.a;
    }

    public static /* synthetic */ int f(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.hxz) {
            return 0;
        }
        return obj instanceof defpackage.hya ? 1 : -2;
    }

    public static ipe i(android.content.Context context) {
        return (ipe) agab.aH(context, ipe.class);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    public static boolean j(igf igfVar, igf igfVar2) {
        boolean z;
        boolean z2;
        defpackage.ihm ihmVar;
        java.lang.Object next;
        defpackage.ihm ihmVar2;
        java.lang.Object next2;
        boolean z3;
        boolean z4;
        aooh.f(igfVar, "<this>");
        aooh.f(igfVar2, "other");
        igs igsVar = igfVar.f;
        if (igsVar == null) {
            igsVar = igs.a;
        }
        alat alatVar = igsVar.c;
        aooh.e(alatVar, "getModelConfigList(...)");
        if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
            java.util.Iterator it = alatVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((defpackage.igr) it.next()).b == 5) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        igs igsVar2 = igfVar2.f;
        if (igsVar2 == null) {
            igsVar2 = igs.a;
        }
        alat alatVar2 = igsVar2.c;
        aooh.e(alatVar2, "getModelConfigList(...)");
        if (!(alatVar2 instanceof java.util.Collection) || !alatVar2.isEmpty()) {
            java.util.Iterator it2 = alatVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((defpackage.igr) it2.next()).b == 5) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z5 = (z || z2) ? false : true;
        igs igsVar3 = igfVar.f;
        if (igsVar3 == null) {
            igsVar3 = igs.a;
        }
        alat alatVar3 = igsVar3.c;
        aooh.e(alatVar3, "getModelConfigList(...)");
        java.util.Iterator it3 = alatVar3.iterator();
        do {
            ihmVar = null;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((defpackage.igr) next).b != 4);
        defpackage.igr igrVar = (defpackage.igr) next;
        if (igrVar != null) {
            ihmVar2 = igrVar.b == 4 ? (defpackage.ihm) igrVar.c : defpackage.ihm.a;
        } else {
            ihmVar2 = null;
        }
        igs igsVar4 = igfVar2.f;
        if (igsVar4 == null) {
            igsVar4 = igs.a;
        }
        alat alatVar4 = igsVar4.c;
        aooh.e(alatVar4, "getModelConfigList(...)");
        java.util.Iterator it4 = alatVar4.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((defpackage.igr) next2).b != 4);
        defpackage.igr igrVar2 = (defpackage.igr) next2;
        if (igrVar2 != null) {
            ihmVar = igrVar2.b == 4 ? (defpackage.ihm) igrVar2.c : defpackage.ihm.a;
        }
        if (ihmVar2 == null || ihmVar == null) {
            z3 = true;
        } else {
            if (ihmVar2.d == ihmVar.d) {
                int iAR = a.aR(ihmVar2.f);
                if (iAR == 0) {
                    iAR = 1;
                }
                int iAR2 = a.aR(ihmVar.f);
                if (iAR2 == 0) {
                    iAR2 = 1;
                }
                if (iAR == iAR2) {
                    z3 = true;
                }
            }
            z3 = false;
        }
        igs igsVar5 = igfVar.f;
        if (((igsVar5 == null ? igs.a : igsVar5).b & 1) == 0) {
            z4 = true;
        } else {
            igs igsVar6 = igfVar2.f;
            if (((igsVar6 == null ? igs.a : igsVar6).b & 1) == 0) {
                z4 = true;
            } else {
                if (igsVar5 == null) {
                    igsVar5 = igs.a;
                }
                java.lang.String str = igsVar5.d;
                if (igsVar6 == null) {
                    igsVar6 = igs.a;
                }
                if (aooh.n(str, igsVar6.d)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        }
        java.util.Set setCW = ajsz.cW(new java.lang.Boolean[]{java.lang.Boolean.valueOf(z5), java.lang.Boolean.valueOf(z3), java.lang.Boolean.valueOf(z4)});
        if (!(setCW instanceof java.util.Collection) || !setCW.isEmpty()) {
            java.util.Iterator it5 = setCW.iterator();
            while (it5.hasNext()) {
                if (!((java.lang.Boolean) it5.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void k(defpackage.al alVar, defpackage.iji ijiVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.hwo(ijiVar, 7));
        ahvr.d(alVar, ahtf.class, new defpackage.hwo(ijiVar, 8));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static /* synthetic */ boolean l(ifx ifxVar) throws aois {
        int iOrdinal = ifxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        throw new java.lang.IllegalStateException("Unrecognized streaming type");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static /* synthetic */ void m(ifx ifxVar) throws aois {
        int iOrdinal = ifxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return;
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        throw new java.lang.IllegalStateException("Unrecognized streaming type");
    }

    public static /* synthetic */ defpackage.jhw n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static int o(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    @java.lang.Deprecated
    public static int p(long j, long j2) {
        if (j2 < j) {
            j2 = j;
            j = j2;
        }
        long j3 = (j2 - j) / 86400000;
        if (j3 > 8) {
            return (int) java.lang.Math.min(j3, 2147483647L);
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.add(11, -calendar.get(11));
        calendar.add(12, -calendar.get(12));
        calendar.add(13, -calendar.get(13));
        calendar.add(14, -calendar.get(14));
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        int i = 0;
        while (calendar2.before(calendar)) {
            calendar.add(5, -1);
            i++;
        }
        return i;
    }

    public static java.lang.CharSequence q(android.content.Context context, long j, long j2) {
        int iP = p(j, j2);
        if (iP == 0) {
            return android.text.format.DateUtils.formatDateTime(context, j2, 1);
        }
        if (iP < 7) {
            return aP(context, j2, true);
        }
        return aN(j, j2) ? aO(context, j2, false, true) : aO(context, j2, true, true);
    }

    public static java.lang.CharSequence r(android.content.Context context, long j, long j2, boolean z) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        long j3 = j - j2;
        if (j3 < 60000) {
            return context.getString(2132019153);
        }
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        if (j3 < 3600000) {
            return z ? android.text.format.DateUtils.getRelativeTimeSpanString(j2, j, 60000L, 262144).toString().replace(".", "") : android.text.format.DateUtils.getRelativeTimeSpanString(j2, j, 60000L);
        }
        int iP = p(j, j2);
        if (iP == 0) {
            return android.text.format.DateUtils.formatDateTime(context, j2, 1);
        }
        if (iP < 7) {
            return aP(context, j2, z);
        }
        return aN(j, j2) ? aO(context, j2, false, z) : aO(context, j2, true, z);
    }

    public static java.lang.String s(android.content.Context context, kiu kiuVar) {
        mmy mmyVarO = ((kog) agab.aH(context, kog.class)).qS().O(kiuVar);
        java.lang.String str = mmyVarO.c;
        if (str.isEmpty()) {
            str = mmyVarO.d;
        }
        if (!str.isEmpty()) {
            return str;
        }
        defpackage.kir kirVar = kiuVar.D;
        if (kirVar == null) {
            kirVar = defpackage.kir.a;
        }
        java.lang.String str2 = kirVar.c;
        return str2.isEmpty() ? kirVar.e : str2;
    }

    public static void t(defpackage.al alVar, defpackage.knq knqVar) {
        ahvr.d(alVar, ahtf.class, new defpackage.jui(knqVar, 14));
    }

    public static knn u(android.content.Context context) {
        return (knn) agab.aH(context, knn.class);
    }

    public static knl v(android.content.Context context) {
        return (knl) agab.aH(context, knl.class);
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int x(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static void y(defpackage.al alVar, defpackage.klt kltVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.jui(kltVar, 12));
        ahvr.d(alVar, ahtf.class, new defpackage.jui(kltVar, 13));
    }

    public static void z(aw awVar, defpackage.klo kloVar) {
        ahvr.e(awVar, defpackage.kga.class, new defpackage.jui(kloVar, 8));
        ahvr.e(awVar, defpackage.klq.class, new defpackage.jui(kloVar, 9));
        ahvr.e(awVar, kuk.class, new defpackage.jui(kloVar, 10));
        ahvr.e(awVar, map.class, new defpackage.jui(kloVar, 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(ecx ecxVar, aoln aolnVar) {
        defpackage.iqb iqbVar;
        if (aolnVar instanceof defpackage.iqb) {
            iqbVar = (defpackage.iqb) aolnVar;
            int i = iqbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqbVar.b = i - Integer.MIN_VALUE;
            } else {
                iqbVar = new defpackage.iqb(this, aolnVar);
            }
        } else {
            iqbVar = new defpackage.iqb(this, aolnVar);
        }
        java.lang.Object obj = iqbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iqbVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ipv ipvVar = new ipv((aoln) null, 3, (short[]) null);
            iqbVar.b = 1;
            if (ecxVar.a(ipvVar, iqbVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(ecx ecxVar, aoln aolnVar) {
        defpackage.ipu ipuVar;
        if (aolnVar instanceof defpackage.ipu) {
            ipuVar = (defpackage.ipu) aolnVar;
            int i = ipuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipuVar.b = i - Integer.MIN_VALUE;
            } else {
                ipuVar = new defpackage.ipu(this, aolnVar);
            }
        } else {
            ipuVar = new defpackage.ipu(this, aolnVar);
        }
        java.lang.Object obj = ipuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ipuVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ipv ipvVar = new ipv((aoln) null, 0);
            ipuVar.b = 1;
            if (ecxVar.a(ipvVar, ipuVar) == aoluVar) {
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

    public hgu(char[] cArr) {
    }
}
