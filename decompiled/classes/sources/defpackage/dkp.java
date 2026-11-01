package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkp {
    public static final defpackage.dko A;
    public static final defpackage.dko B;
    public static final defpackage.dko C;
    public static final defpackage.dko D;
    public static final defpackage.dko E;
    public static final defpackage.dko F;
    public static final defpackage.ckb b;
    public static final defpackage.ckb c;
    public static final defpackage.ckb d;
    public static final defpackage.ckb e;
    public static final defpackage.ckb f;
    public static final defpackage.ckb g;
    public static final defpackage.ckb h;
    public static final defpackage.ckb p;
    public static final defpackage.ckb q;
    public static final defpackage.ckb r;
    public static final defpackage.ckb s;
    public static final defpackage.ckb t;
    public static final defpackage.ckb u;
    public static final defpackage.ckb v;
    public static final defpackage.dko x;
    public static final defpackage.dko y;
    public static final defpackage.dko z;
    public static final defpackage.ckb a = new defpackage.dko(new defpackage.dim(14), new defpackage.dcx(13), 1);
    public static final defpackage.ckb i = new defpackage.dko(new defpackage.dkm(0), new defpackage.een(1), 1);
    public static final defpackage.ckb j = new defpackage.dko(new defpackage.dkm(2), new defpackage.dkj(), 1);
    public static final defpackage.ckb k = new defpackage.dko(new defpackage.dim(15), new defpackage.dcx(14), 1);
    public static final defpackage.ckb l = new defpackage.dko(new defpackage.dim(16), new defpackage.dcx(15), 1);
    public static final defpackage.ckb m = new defpackage.dko(new defpackage.dim(17), new defpackage.dcx(16), 1);
    public static final defpackage.ckb n = new defpackage.dko(new defpackage.dim(18), new defpackage.dcx(17), 1);
    public static final defpackage.ckb o = new defpackage.dko(new defpackage.dim(20), new defpackage.dcx(18), 1);
    public static final defpackage.dko w = new defpackage.dko(defpackage.dkn.a, defpackage.dfn.a, 0);

    static {
        final int i2 = 14;
        final int i3 = 13;
        final int i4 = 1;
        final int i5 = 3;
        b = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i6 = 0;
                switch (i4) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i6 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i6), defpackage.dkp.c, cjsVar));
                            i6++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i6 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i6), defpackage.dkp.u, cjsVar5));
                            i6++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i6 = 0;
                dkx dkxVar = null;
                switch (i5) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i6 < size) {
                            java.lang.Object obj2 = list.get(i6);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i6++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i6 < size2) {
                            java.lang.Object obj7 = list4.get(i6);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i6++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i6 = 11;
        final int i7 = 15;
        c = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i8 = 0;
                switch (i6) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i8 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i8), defpackage.dkp.c, cjsVar));
                            i8++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i8 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i8), defpackage.dkp.u, cjsVar5));
                            i8++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i8 = 0;
                dkx dkxVar = null;
                switch (i7) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i8 < size) {
                            java.lang.Object obj2 = list.get(i8);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i8++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i8 < size2) {
                            java.lang.Object obj7 = list4.get(i8);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i8++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i8 = 20;
        final int i9 = 18;
        d = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i10 = 0;
                switch (i8) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i10 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i10), defpackage.dkp.c, cjsVar));
                            i10++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i10 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i10), defpackage.dkp.u, cjsVar5));
                            i10++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i10 = 0;
                dkx dkxVar = null;
                switch (i9) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i10 < size) {
                            java.lang.Object obj2 = list.get(i10);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i10++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i10 < size2) {
                            java.lang.Object obj7 = list4.get(i10);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i10++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i10 = 19;
        e = new defpackage.dko(new defpackage.dkm(1), new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i11 = 0;
                dkx dkxVar = null;
                switch (i10) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i11 < size) {
                            java.lang.Object obj2 = list.get(i11);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i11++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i11 < size2) {
                            java.lang.Object obj7 = list4.get(i11);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i11++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        f = new defpackage.dko(new defpackage.dim(19), new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i11 = 0;
                dkx dkxVar = null;
                switch (i4) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i11 < size) {
                            java.lang.Object obj2 = list.get(i11);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i11++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i11 < size2) {
                            java.lang.Object obj7 = list4.get(i11);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i11++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i11 = 8;
        g = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i12 = 0;
                switch (i11) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i12 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i12), defpackage.dkp.c, cjsVar));
                            i12++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i12 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i12), defpackage.dkp.u, cjsVar5));
                            i12++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i12 = 0;
                dkx dkxVar = null;
                switch (i6) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i12 < size) {
                            java.lang.Object obj2 = list.get(i12);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i12++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i12 < size2) {
                            java.lang.Object obj7 = list4.get(i12);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i12++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        h = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i12 = 0;
                switch (i10) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i12 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i12), defpackage.dkp.c, cjsVar));
                            i12++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i12 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i12), defpackage.dkp.u, cjsVar5));
                            i12++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i12 = 0;
                dkx dkxVar = null;
                switch (i8) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i12 < size) {
                            java.lang.Object obj2 = list.get(i12);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i12++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i12 < size2) {
                            java.lang.Object obj7 = list4.get(i12);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i12++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i12 = 0;
        final int i13 = 2;
        final int i14 = 16;
        final int i15 = 17;
        p = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i16 = 0;
                switch (i12) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i16 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i16), defpackage.dkp.c, cjsVar));
                            i16++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i16 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i16), defpackage.dkp.u, cjsVar5));
                            i16++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.dcx(19), 1);
        q = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i16 = 0;
                switch (i13) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i16 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i16), defpackage.dkp.c, cjsVar));
                            i16++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i16 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i16), defpackage.dkp.u, cjsVar5));
                            i16++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.dcx(20), 1);
        x = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i16 = 0;
                switch (i5) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i16 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i16), defpackage.dkp.c, cjsVar));
                            i16++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i16 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i16), defpackage.dkp.u, cjsVar5));
                            i16++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i16 = 0;
                dkx dkxVar = null;
                switch (i12) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i16 < size) {
                            java.lang.Object obj2 = list.get(i16);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i16++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i16 < size2) {
                            java.lang.Object obj7 = list4.get(i16);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i16++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        final int i16 = 4;
        y = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i17 = 0;
                switch (i16) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i17 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i17), defpackage.dkp.c, cjsVar));
                            i17++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i17 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i17), defpackage.dkp.u, cjsVar5));
                            i17++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i17 = 0;
                dkx dkxVar = null;
                switch (i13) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i17 < size) {
                            java.lang.Object obj2 = list.get(i17);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i17++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i17 < size2) {
                            java.lang.Object obj7 = list4.get(i17);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i17++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        final int i17 = 5;
        z = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i18 = 0;
                switch (i17) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i18 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i18), defpackage.dkp.c, cjsVar));
                            i18++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i18 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i18), defpackage.dkp.u, cjsVar5));
                            i18++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i18 = 0;
                dkx dkxVar = null;
                switch (i16) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i18 < size) {
                            java.lang.Object obj2 = list.get(i18);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i18++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i18 < size2) {
                            java.lang.Object obj7 = list4.get(i18);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i18++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        final int i18 = 6;
        r = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i19 = 0;
                switch (i18) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i19 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i19), defpackage.dkp.c, cjsVar));
                            i19++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i19 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i19), defpackage.dkp.u, cjsVar5));
                            i19++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i19 = 0;
                dkx dkxVar = null;
                switch (i17) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i19 < size) {
                            java.lang.Object obj2 = list.get(i19);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i19++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i19 < size2) {
                            java.lang.Object obj7 = list4.get(i19);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i19++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i19 = 7;
        s = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i19) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i18) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        final int i20 = 9;
        A = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i20) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i19) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        final int i21 = 10;
        B = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i21) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i11) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        final int i22 = 12;
        C = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i22) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i20) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        t = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i3) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i21) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        u = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i2) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i22) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        v = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i7) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i3) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 1);
        D = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i14) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i2) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        E = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i15) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i14) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
        F = new defpackage.dko(new defpackage.aonn() { // from class: dkk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                djm djmVar;
                java.lang.Object objA;
                int i110 = 0;
                switch (i9) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.dok) obj2).a);
                    case 1:
                        defpackage.cjs cjsVar = (defpackage.cjs) obj;
                        java.util.List list = (java.util.List) obj2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            arrayList.add(defpackage.dkp.a((defpackage.djg) list.get(i110), defpackage.dkp.c, cjsVar));
                            i110++;
                        }
                        return arrayList;
                    case 2:
                        defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                        defpackage.crc crcVar = (defpackage.crc) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.cqg(crcVar.b), defpackage.dkp.w, cjsVar2), defpackage.dkp.a(new defpackage.cpm(crcVar.c), defpackage.dkp.C, cjsVar2), java.lang.Float.valueOf(crcVar.d)}, true));
                    case 3:
                        return java.lang.Integer.valueOf(((defpackage.dot) obj2).a);
                    case 4:
                        return java.lang.Integer.valueOf(((defpackage.dov) obj2).a);
                    case 5:
                        return java.lang.Integer.valueOf(((defpackage.don) obj2).a);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return java.lang.Integer.valueOf(((defpackage.dmw) obj2).a);
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return java.lang.Integer.valueOf(((defpackage.dmx) obj2).a);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        djv djvVar = (djv) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djvVar.a, defpackage.dkp.a(djvVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    case 9:
                        defpackage.cjs cjsVar3 = (defpackage.cjs) obj;
                        defpackage.dps dpsVar = (defpackage.dps) obj2;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        if (dpsVar != null && dpsVar.b == 2143289344) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j2 = dpsVar.b;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & j2))), defpackage.dkp.a(new defpackage.dpt(defpackage.dps.a[(int) ((j2 & 1095216660480L) >>> 32)].a), defpackage.dkp.B, cjsVar3)}, true));
                    case 10:
                        long j3 = ((defpackage.dpt) obj2).a;
                        if (j3 == 8589934592L) {
                            return 0;
                        }
                        if (j3 == 4294967296L) {
                            return 1;
                        }
                        return java.lang.Boolean.FALSE;
                    case 11:
                        defpackage.cjs cjsVar4 = (defpackage.cjs) obj;
                        defpackage.djg djgVar = (defpackage.djg) obj2;
                        java.lang.Object obj3 = djgVar.a;
                        if (obj3 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Annotation");
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a((defpackage.djd) obj3, defpackage.dkp.d, cjsVar4), java.lang.Integer.valueOf(djgVar.b), java.lang.Integer.valueOf(djgVar.c), djgVar.d}, true));
                    case 12:
                        defpackage.cpm cpmVar = (defpackage.cpm) obj2;
                        if (cpmVar != null && cpmVar.a == 9205357640488583168L) {
                            return java.lang.Boolean.FALSE;
                        }
                        long j4 = cpmVar.a;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))}, true));
                    case 13:
                        defpackage.cjs cjsVar5 = (defpackage.cjs) obj;
                        java.util.List list2 = ((defpackage.dnx) obj2).b;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        while (i110 < size2) {
                            arrayList2.add(defpackage.dkp.a((defpackage.dnw) list2.get(i110), defpackage.dkp.u, cjsVar5));
                            i110++;
                        }
                        return arrayList2;
                    case 14:
                        return ((defpackage.dnw) obj2).a();
                    case 15:
                        defpackage.cjs cjsVar6 = (defpackage.cjs) obj;
                        defpackage.dos dosVar = (defpackage.dos) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(new defpackage.dop(dosVar.b), defpackage.dkp.D, cjsVar6), defpackage.dkp.a(new defpackage.dor(dosVar.c), defpackage.dkp.E, cjsVar6), defpackage.dkp.a(new defpackage.doq(dosVar.d), defpackage.dkp.F, cjsVar6)}, true));
                    case 16:
                        return java.lang.Float.valueOf(((defpackage.dop) obj2).a);
                    case 17:
                        return java.lang.Integer.valueOf(((defpackage.dor) obj2).a);
                    case 18:
                        return java.lang.Integer.valueOf(((defpackage.doq) obj2).a);
                    case 19:
                        dju djuVar = (dju) obj2;
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djuVar.a, defpackage.dkp.a(djuVar.b, defpackage.dkp.k, (defpackage.cjs) obj)}, true));
                    default:
                        defpackage.cjs cjsVar7 = (defpackage.cjs) obj;
                        defpackage.djd djdVar = (defpackage.djd) obj2;
                        if (djdVar instanceof defpackage.dkd) {
                            djmVar = djm.a;
                        } else if (djdVar instanceof defpackage.dks) {
                            djmVar = djm.b;
                        } else if (djdVar instanceof dla) {
                            djmVar = djm.c;
                        } else if (djdVar instanceof dlb) {
                            djmVar = djm.d;
                        } else if (djdVar instanceof djv) {
                            djmVar = djm.e;
                        } else if (djdVar instanceof dju) {
                            djmVar = djm.f;
                        } else {
                            if (!(djdVar instanceof dku)) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            djmVar = djm.g;
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dkd) djdVar, defpackage.dkp.i, cjsVar7);
                                break;
                            case 1:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((defpackage.dks) djdVar, defpackage.dkp.j, cjsVar7);
                                break;
                            case 2:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dla) djdVar, defpackage.dkp.e, cjsVar7);
                                break;
                            case 3:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dlb) djdVar, defpackage.dkp.f, cjsVar7);
                                break;
                            case 4:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((djv) djdVar, defpackage.dkp.g, cjsVar7);
                                break;
                            case 5:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                                    djdVar = null;
                                }
                                objA = defpackage.dkp.a((dju) djdVar, defpackage.dkp.h, cjsVar7);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (djdVar == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    djdVar = null;
                                }
                                objA = ((dku) djdVar).a;
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djmVar, objA}, true));
                }
            }
        }, new defpackage.aonj() { // from class: dkl
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dla dlbVar;
                defpackage.djg djvVar;
                int i110 = 0;
                dkx dkxVar = null;
                switch (i15) {
                    case 0:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dot(((java.lang.Integer) obj).intValue());
                    case 1:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dlb(dkxVar);
                        return dlbVar;
                    case 2:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dov(((java.lang.Integer) obj).intValue());
                    case 3:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list = (java.util.List) obj;
                        dlbVar = new java.util.ArrayList(list.size());
                        int size = list.size();
                        while (i110 < size) {
                            java.lang.Object obj2 = list.get(i110);
                            defpackage.djg djgVar = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.djg) defpackage.dkp.c.a(obj2);
                            if (djgVar == null) {
                                defpackage.aooh.g();
                            }
                            dlbVar.add(djgVar);
                            i110++;
                        }
                        return dlbVar;
                    case 4:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.don(((java.lang.Integer) obj).intValue());
                    case 5:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmw(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dmx(((java.lang.Integer) obj).intValue());
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (defpackage.aooh.n(obj, bool)) {
                            defpackage.dpt[] dptVarArr = defpackage.dps.a;
                            return new defpackage.dps(2143289344L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.Object obj3 = list2.get(0);
                        java.lang.Float f2 = obj3 != null ? (java.lang.Float) obj3 : null;
                        if (f2 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue = f2.floatValue();
                        java.lang.Object obj4 = list2.get(1);
                        defpackage.dko dkoVar = defpackage.dkp.B;
                        defpackage.aooh.n(obj4, bool);
                        dkxVar = obj4 != null ? (defpackage.dpt) dkoVar.a(obj4) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.dps(dkxVar.a | (((long) java.lang.Float.floatToRawIntBits(fFloatValue)) & 4294967295L));
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (defpackage.aooh.n(obj, 0)) {
                            return new defpackage.dpt(8589934592L);
                        }
                        return defpackage.aooh.n(obj, 1) ? new defpackage.dpt(4294967296L) : new defpackage.dpt(0L);
                    case 9:
                        if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                            return new defpackage.cpm(9205357640488583168L);
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list3 = (java.util.List) obj;
                        java.lang.Object obj5 = list3.get(0);
                        java.lang.Float f3 = obj5 != null ? (java.lang.Float) obj5 : null;
                        if (f3 == null) {
                            defpackage.aooh.g();
                        }
                        float fFloatValue2 = f3.floatValue();
                        java.lang.Object obj6 = list3.get(1);
                        dkxVar = obj6 != null ? (java.lang.Float) obj6 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        return new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dkxVar.floatValue())) & 4294967295L));
                    case 10:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list4 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
                        int size2 = list4.size();
                        while (i110 < size2) {
                            java.lang.Object obj7 = list4.get(i110);
                            defpackage.dnw dnwVar = (defpackage.aooh.n(obj7, java.lang.Boolean.FALSE) || obj7 == null) ? null : (defpackage.dnw) defpackage.dkp.u.a(obj7);
                            if (dnwVar == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(dnwVar);
                            i110++;
                        }
                        return new defpackage.dnx(arrayList);
                    case 11:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list5 = (java.util.List) obj;
                        java.lang.Object obj8 = list5.get(0);
                        java.lang.String str = obj8 != null ? (java.lang.String) obj8 : null;
                        if (str == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj9 = list5.get(1);
                        defpackage.ckb ckbVar = defpackage.dkp.k;
                        if (!defpackage.aooh.n(obj9, java.lang.Boolean.FALSE) && obj9 != null) {
                            dkxVar = (dkx) ckbVar.a(obj9);
                        }
                        djvVar = new djv(str, dkxVar);
                        return djvVar;
                    case 12:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
                        if (defpackage.aooh.n(localeForLanguageTag.toLanguageTag(), "und")) {
                            java.lang.System.err.println(defpackage.a.bk(str2, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
                        }
                        return new defpackage.dnw(localeForLanguageTag);
                    case 13:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list6 = (java.util.List) obj;
                        java.lang.Object obj10 = list6.get(0);
                        defpackage.dko dkoVar2 = defpackage.dkp.D;
                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                        defpackage.aooh.n(obj10, bool2);
                        defpackage.dop dopVar = obj10 != null ? (defpackage.dop) dkoVar2.a(obj10) : null;
                        if (dopVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj11 = list6.get(1);
                        defpackage.dko dkoVar3 = defpackage.dkp.E;
                        defpackage.aooh.n(obj11, bool2);
                        defpackage.dor dorVar = obj11 != null ? (defpackage.dor) dkoVar3.a(obj11) : null;
                        if (dorVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj12 = list6.get(2);
                        defpackage.dko dkoVar4 = defpackage.dkp.F;
                        defpackage.aooh.n(obj12, bool2);
                        dkxVar = obj12 != null ? (defpackage.doq) dkoVar4.a(obj12) : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new defpackage.dos(dopVar.a, dorVar.a, dkxVar.a);
                        return dlbVar;
                    case 14:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                        }
                        float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                        defpackage.dop.b(fFloatValue3);
                        return new defpackage.dop(fFloatValue3);
                    case 15:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list7 = (java.util.List) obj;
                        java.lang.Object obj13 = list7.get(0);
                        defpackage.djd djdVar = (defpackage.aooh.n(obj13, java.lang.Boolean.FALSE) || obj13 == null) ? null : (defpackage.djd) defpackage.dkp.d.a(obj13);
                        if (djdVar == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj14 = list7.get(1);
                        java.lang.Integer num = obj14 != null ? (java.lang.Integer) obj14 : null;
                        if (num == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue = num.intValue();
                        java.lang.Object obj15 = list7.get(2);
                        java.lang.Integer num2 = obj15 != null ? (java.lang.Integer) obj15 : null;
                        if (num2 == null) {
                            defpackage.aooh.g();
                        }
                        int iIntValue2 = num2.intValue();
                        java.lang.Object obj16 = list7.get(3);
                        dkxVar = obj16 != null ? (java.lang.String) obj16 : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        djvVar = new defpackage.djg(djdVar, iIntValue, iIntValue2, dkxVar);
                        return djvVar;
                    case 16:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.dor(((java.lang.Integer) obj).intValue());
                    case 17:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                        }
                        return new defpackage.doq(((java.lang.Integer) obj).intValue());
                    case 18:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        }
                        java.util.List list8 = (java.util.List) obj;
                        java.lang.Object obj17 = list8.get(0);
                        djm djmVar = obj17 != null ? (djm) obj17 : null;
                        if (djmVar == null) {
                            defpackage.aooh.g();
                        }
                        switch (djmVar.ordinal()) {
                            case 0:
                                java.lang.Object obj18 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj18, java.lang.Boolean.FALSE) || obj18 == null) ? null : (defpackage.djd) defpackage.dkp.i.a(obj18);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 1:
                                java.lang.Object obj19 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj19, java.lang.Boolean.FALSE) || obj19 == null) ? null : (defpackage.djd) defpackage.dkp.j.a(obj19);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 2:
                                java.lang.Object obj20 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj20, java.lang.Boolean.FALSE) || obj20 == null) ? null : (defpackage.djd) defpackage.dkp.e.a(obj20);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 3:
                                java.lang.Object obj21 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj21, java.lang.Boolean.FALSE) || obj21 == null) ? null : (defpackage.djd) defpackage.dkp.f.a(obj21);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 4:
                                java.lang.Object obj22 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (defpackage.djd) defpackage.dkp.g.a(obj22);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case 5:
                                java.lang.Object obj23 = list8.get(1);
                                dlbVar = (defpackage.aooh.n(obj23, java.lang.Boolean.FALSE) || obj23 == null) ? null : (defpackage.djd) defpackage.dkp.h.a(obj23);
                                if (dlbVar == null) {
                                    defpackage.aooh.g();
                                    return null;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                java.lang.Object obj24 = list8.get(1);
                                dkxVar = obj24 != null ? (java.lang.String) obj24 : null;
                                if (dkxVar == null) {
                                    defpackage.aooh.g();
                                }
                                dlbVar = new dku(dkxVar);
                                break;
                            default:
                                throw new defpackage.aois();
                        }
                        return dlbVar;
                    case 19:
                        dkxVar = obj != null ? (java.lang.String) obj : null;
                        if (dkxVar == null) {
                            defpackage.aooh.g();
                        }
                        dlbVar = new dla(dkxVar);
                        return dlbVar;
                    default:
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        }
                        java.util.List list9 = (java.util.List) obj;
                        java.lang.Object obj25 = list9.get(0);
                        java.lang.String str3 = obj25 != null ? (java.lang.String) obj25 : null;
                        if (str3 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj26 = list9.get(1);
                        return new dju(str3, (defpackage.aooh.n(obj26, java.lang.Boolean.FALSE) || obj26 == null) ? null : (dkx) defpackage.dkp.k.a(obj26), (djx) null);
                }
            }
        }, 0);
    }

    public static final java.lang.Object a(java.lang.Object obj, defpackage.ckb ckbVar, defpackage.cjs cjsVar) {
        java.lang.Object objB;
        return (obj == null || (objB = ckbVar.b(cjsVar, obj)) == null) ? java.lang.Boolean.FALSE : objB;
    }
}
