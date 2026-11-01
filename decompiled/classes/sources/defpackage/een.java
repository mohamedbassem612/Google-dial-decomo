package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class een implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ een(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        itc dkdVar;
        itp ituVar;
        itt ittVar = null;
        switch (this.$cid) {
            case 0:
                java.io.File file = (java.io.File) obj;
                java.util.Set set = defpackage.eeo.a;
                if (file == null) {
                    defpackage.aooh.i("it");
                    defpackage.aooh.i("file");
                }
                java.lang.String absolutePath = file.getCanonicalFile().getAbsolutePath();
                defpackage.aooh.e(absolutePath, "getAbsolutePath(...)");
                if (absolutePath == null) {
                    defpackage.aooh.i("filePath");
                }
                return new defpackage.aogc(absolutePath);
            case 1:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                }
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                defpackage.dko dkoVar = defpackage.dkp.x;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                defpackage.aooh.n(obj2, bool);
                defpackage.dot dotVar = obj2 != null ? (defpackage.dot) dkoVar.a(obj2) : null;
                if (dotVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj3 = list.get(1);
                defpackage.dko dkoVar2 = defpackage.dkp.y;
                defpackage.aooh.n(obj3, bool);
                defpackage.dov dovVar = obj3 != null ? (defpackage.dov) dkoVar2.a(obj3) : null;
                if (dovVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj4 = list.get(2);
                defpackage.dpt[] dptVarArr = defpackage.dps.a;
                defpackage.dko dkoVar3 = defpackage.dkp.A;
                defpackage.aooh.n(obj4, bool);
                defpackage.dps dpsVar = obj4 != null ? (defpackage.dps) dkoVar3.a(obj4) : null;
                if (dpsVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj5 = list.get(3);
                defpackage.dpa dpaVar = defpackage.dpa.a;
                defpackage.dpa dpaVar2 = (defpackage.aooh.n(obj5, bool) || obj5 == null) ? null : (defpackage.dpa) defpackage.dkp.n.a(obj5);
                java.lang.Object obj6 = list.get(4);
                defpackage.dkg dkgVar = (defpackage.aooh.n(obj6, bool) || obj6 == null) ? null : (defpackage.dkg) dkr.a.a(obj6);
                java.lang.Object obj7 = list.get(5);
                defpackage.dos dosVar = defpackage.dos.a;
                defpackage.dos dosVar2 = (defpackage.aooh.n(obj7, bool) || obj7 == null) ? null : (defpackage.dos) defpackage.dkp.v.a(obj7);
                java.lang.Object obj8 = list.get(6);
                defpackage.doo dooVar = (defpackage.aooh.n(obj8, bool) || obj8 == null) ? null : (defpackage.doo) dkr.c.a(obj8);
                if (dooVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj9 = list.get(7);
                defpackage.dko dkoVar4 = defpackage.dkp.z;
                defpackage.aooh.n(obj9, bool);
                defpackage.don donVar = obj9 != null ? (defpackage.don) dkoVar4.a(obj9) : null;
                if (donVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj10 = list.get(8);
                defpackage.ckb ckbVar = dkr.d;
                if (!defpackage.aooh.n(obj10, bool) && obj10 != null) {
                    ittVar = (defpackage.dpc) ckbVar.a(obj10);
                }
                dkdVar = new defpackage.dkd(dotVar.a, dovVar.a, dpsVar.b, dpaVar2, dkgVar, dosVar2, dooVar.a, donVar.a, ittVar);
                break;
            case 2:
                if (((defpackage.eoq) obj) == null) {
                    defpackage.aooh.i("$this$initializer");
                }
                return new defpackage.ens();
            case 3:
                defpackage.aooh.f((defpackage.fzd) obj, "it");
                return defpackage.aojh.a;
            case 4:
                return java.lang.Integer.valueOf(((defpackage.gbo) obj).hashCode());
            case 5:
                defpackage.aomy aomyVar = (defpackage.aomy) obj;
                defpackage.aooh.f(aomyVar, "it");
                aomyVar.a();
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.gin ginVar = (defpackage.gin) obj;
                if (ginVar == null) {
                    defpackage.aooh.i("it");
                }
                return java.lang.Boolean.valueOf(ginVar.m());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.gin ginVar2 = (defpackage.gin) obj;
                int i = defpackage.ggq.h;
                if (ginVar2 == null) {
                    defpackage.aooh.i("statement");
                }
                defpackage.aolg aolgVar = new defpackage.aolg();
                while (ginVar2.m()) {
                    aolgVar.add(java.lang.Integer.valueOf((int) ginVar2.c(0)));
                }
                return aolgVar.b();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (((defpackage.gip) obj) != null) {
                    return null;
                }
                defpackage.aooh.i("it");
                return null;
            case 9:
                defpackage.gkc gkcVar = defpackage.gkc.d;
                return java.lang.Boolean.FALSE;
            case 10:
                defpackage.gom gomVar = (defpackage.gom) obj;
                if (gomVar != null) {
                    return gomVar;
                }
                defpackage.aooh.i("it");
                return gomVar;
            case 11:
                defpackage.gqg gqgVar = (defpackage.gqg) obj;
                int i2 = defpackage.gqf.b;
                if (gqgVar != null) {
                    return gqgVar;
                }
                defpackage.aooh.i("it");
                return gqgVar;
            case 12:
                defpackage.aogc aogcVar = (defpackage.aogc) obj;
                int i3 = defpackage.gyc.a;
                defpackage.aooh.f(aogcVar, "it");
                return aogcVar.bg();
            case 13:
                iuj iujVar = (iuj) obj;
                defpackage.aooh.f(iujVar, "$this$create");
                return new ity(iujVar.a);
            case 14:
                ity ityVar = (ity) obj;
                defpackage.aooh.f(ityVar, "$this$create");
                return new defpackage.abwy(ityVar.a);
            case 15:
                iuj iujVar2 = (iuj) obj;
                defpackage.aooh.f(iujVar2, "$this$create");
                defpackage.aooh.f(iujVar2, "<this>");
                ity ityVar2 = new ity(iujVar2.a);
                itz itzVar = iujVar2.j;
                iub iubVar = iujVar2.k;
                if (defpackage.ajsz.bc(itzVar, iubVar).size() > 1) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bi(iubVar, itzVar, "found:callActions = ", ", callActionsError = "));
                }
                if (itzVar != null) {
                    ituVar = new itp(itzVar.a);
                } else if (iubVar != null) {
                    iua iuaVar = iua.a;
                    switch (iubVar.a.ordinal()) {
                        case 0:
                            ituVar = new itu(itq.a);
                            break;
                        case 1:
                            ituVar = new itu(itq.b);
                            break;
                        case 2:
                            ituVar = new itu(itq.c);
                            break;
                        case 3:
                            ituVar = new itu(itq.d);
                            break;
                        case 4:
                            ituVar = new itu(itq.e);
                            break;
                        case 5:
                            ituVar = new itu(itq.f);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            ituVar = new itu(itq.g);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            ituVar = new itu(itq.h);
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            ituVar = new itu(itq.i);
                            break;
                        case 9:
                            ituVar = new itu(itq.j);
                            break;
                        case 10:
                            ituVar = new itu(itq.k);
                            break;
                        case 11:
                            ituVar = new itu(itq.l);
                            break;
                        case 12:
                            ituVar = new itu(itq.m);
                            break;
                        default:
                            throw new defpackage.aois();
                    }
                } else {
                    ituVar = itx.a;
                }
                itp itpVar = ituVar;
                java.lang.String str = iujVar2.e;
                java.lang.String str2 = iujVar2.f;
                java.lang.Long l = iujVar2.g;
                java.lang.String str3 = iujVar2.h;
                java.util.UUID uuid = iujVar2.b;
                java.lang.String str4 = iujVar2.c;
                java.lang.Long l2 = iujVar2.d;
                java.lang.Integer num = iujVar2.i;
                iud iudVar = iujVar2.l;
                itt ittVarI = iudVar != null ? hgz.i(iudVar) : null;
                iud iudVar2 = iujVar2.m;
                dkdVar = new itc(ityVar2, itpVar, str, str2, l, str3, uuid, str4, l2, num, ittVarI, iudVar2 != null ? hgz.i(iudVar2) : null, iujVar2.n, iujVar2.o);
                break;
                break;
            case 16:
                defpackage.kgm kgmVar = (defpackage.kgm) obj;
                if (kgmVar == null) {
                    defpackage.aooh.i("row");
                }
                return java.lang.Integer.valueOf(kgmVar.a);
            case 17:
                defpackage.diq diqVar = (defpackage.diq) obj;
                if (diqVar == null) {
                    defpackage.aooh.i("$this$semantics");
                }
                diqVar.a(defpackage.din.A, new defpackage.dib(3));
                diqVar.a(defpackage.din.K, java.lang.Boolean.FALSE);
                return defpackage.aojh.a;
            case 18:
                return java.lang.Boolean.valueOf((((defpackage.ipb) obj).b & 8) != 0);
            case 19:
                defpackage.kwy kwyVar = ((defpackage.ipb) obj).f;
                return kwyVar == null ? defpackage.kwy.a : kwyVar;
            default:
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a("SELECT * FROM transcript");
                try {
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "conversation");
                    int iS3 = defpackage.dzk.S(ginVarA, "audioRecordingFilePath");
                    int iS4 = defpackage.dzk.S(ginVarA, "isRated");
                    int iS5 = defpackage.dzk.S(ginVarA, "revelioCallType");
                    int iS6 = defpackage.dzk.S(ginVarA, "lastModifiedMillis");
                    int iS7 = defpackage.dzk.S(ginVarA, "callScreenFeedbackData");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        lkq lkqVar = new lkq();
                        lkqVar.a(ginVarA.l(iS) ? null : ginVarA.e(iS));
                        lkqVar.b = defpackage.mni.cI(ginVarA.l(iS2) ? null : ginVarA.n(iS2));
                        lkqVar.c = ginVarA.l(iS3) ? null : ginVarA.e(iS3);
                        lkqVar.d = ((int) ginVarA.c(iS4)) != 0;
                        lkqVar.b(defpackage.mni.cG(ginVarA.l(iS5) ? null : java.lang.Integer.valueOf((int) ginVarA.c(iS5))));
                        lkqVar.f = ginVarA.c(iS6);
                        lkqVar.g = defpackage.mni.cK(ginVarA.l(iS7) ? null : ginVarA.n(iS7));
                        arrayList.add(lkqVar);
                        break;
                    }
                    return arrayList;
                } finally {
                    ginVarA.close();
                }
        }
        return dkdVar;
    }
}
