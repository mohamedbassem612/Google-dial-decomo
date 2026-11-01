package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klr extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(defpackage.ahs ahsVar, long j, defpackage.aht ahtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahsVar;
        this.b = j;
        this.d = ahtVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Object objD;
        java.lang.Object objL;
        java.lang.Object objI;
        java.lang.Object objH;
        java.lang.String str;
        defpackage.nsm nsmVar = null;
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                int i = this.a;
                aooc.af(obj);
                if (i == 0) {
                    kva kvaVar = (kva) ((zjm) ((rsr) this.c).a).g().orElseThrow();
                    long j = this.b;
                    java.lang.Object obj2 = this.d;
                    lbi lbiVar = (lbi) kvaVar.c.a();
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    akzx akzxVarM = kui.a.m();
                    akzxVarM.u();
                    kui kuiVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(obj2);
                    kuiVar.b |= 1;
                    kuiVar.c = (java.lang.String) obj2;
                    ajcq ajcqVarD = lbiVar.d(aigf.k(lValueOf, akzxVarM.p()));
                    ahvr.J(ajcqVarD, new defpackage.kxt(kvaVar, 1), kvaVar.f);
                    this.a = 1;
                    objD = aosv.D(ajcqVarD, this);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    return objD;
                }
                break;
            case 1:
                aolu aoluVar2 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 != 0) {
                    objL = obj;
                } else {
                    java.lang.Object obj3 = this.c;
                    dpp dppVar = new dpp(this.b);
                    aiq aiqVar = ((defpackage.aht) this.d).a;
                    this.a = 1;
                    objL = aii.l(((defpackage.ahs) obj3).a, dppVar, aiqVar, (java.lang.Object) null, (aonj) null, this, 12);
                    if (objL == aoluVar2) {
                        return aoluVar2;
                    }
                }
                int i3 = ((defpackage.aio) objL).a;
                return aojh.a;
            case 2:
                aolu aoluVar3 = aolu.a;
                int i4 = this.a;
                aooc.af(obj);
                if (i4 == 0) {
                    java.lang.Object obj4 = this.c;
                    long j2 = this.b;
                    afpl afplVar = new afpl(new java.lang.Long(j2), new defpackage.jie(j2, (java.lang.String) this.d, (aoln) null, 4), (char[]) null);
                    this.a = 1;
                    objD = ((gpd) ((rsr) obj4).b).t(afplVar, this);
                    if (objD == aoluVar3) {
                        return aoluVar3;
                    }
                    return objD;
                }
                break;
            case 3:
                aolu aoluVar4 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    java.lang.Object obj5 = this.d;
                    java.lang.Object obj6 = this.c;
                    long j3 = this.b;
                    this.a = 1;
                    java.lang.Object objM = aosv.m(new defpackage.mbz((defpackage.mbb) obj6, (mca) obj5, j3, (aoln) null, 0), this);
                    if (objM != aoluVar4) {
                        objM = aojh.a;
                    }
                    if (objM == aoluVar4) {
                        return aoluVar4;
                    }
                }
                return aojh.a;
            case 4:
                aolu aoluVar5 = aolu.a;
                try {
                    if (this.a != 0) {
                        aooc.af(obj);
                        objI = obj;
                    } else {
                        aooc.af(obj);
                        java.lang.String strB = ura.b((android.telecom.Call.Details) this.c);
                        if (android.text.TextUtils.isEmpty(strB)) {
                            return java.lang.Boolean.FALSE;
                        }
                        ojo ojoVar = ((defpackage.msp) this.d).d;
                        android.net.Uri uriBuild = android.provider.CallLog.Calls.CONTENT_FILTER_URI.buildUpon().appendQueryParameter("limit", "1").appendEncodedPath(strB).build();
                        aooh.e(uriBuild, "build(...)");
                        defpackage.msn msnVar = new defpackage.msn(this.b);
                        this.a = 1;
                        int i6 = ojo.f;
                        objI = ojoVar.i(uriBuild, new java.lang.String[]{"date"}, "type = 2", (java.lang.String[]) null, "date DESC", msnVar, this);
                        if (objI == aoluVar5) {
                            return aoluVar5;
                        }
                    }
                    java.lang.Boolean bool = (java.lang.Boolean) ajsz.bG((aify) objI);
                    return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                } catch (java.lang.Exception e) {
                    j$.util.Objects.checkIndex(0, 4);
                    if ((e instanceof aguh) || (e instanceof aguk) || (e instanceof android.os.DeadObjectException)) {
                        defpackage.msp.a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallResponseVoter", "isRecentOutgoingCallNumber$<anonymous>", 317, "DobbyCallResponseVoter.kt").y("isRecentOutgoingCallNumber failed due to %s", e.getMessage());
                        return java.lang.Boolean.FALSE;
                    }
                    defpackage.msp.a.d().k(e).l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallResponseVoter", "isRecentOutgoingCallNumber$<anonymous>", 324, "DobbyCallResponseVoter.kt").v("isRecentOutgoingCallNumber failed with unexpected exceptions");
                    throw e;
                }
            case 5:
                aolu aoluVar6 = aolu.a;
                int i7 = this.a;
                aooc.af(obj);
                if (i7 != 0) {
                    objH = obj;
                } else {
                    java.lang.Object obj7 = this.c;
                    long j4 = this.b;
                    this.a = 1;
                    objH = ((defpackage.mtx) obj7).b.h(j4, this);
                    if (objH == aoluVar6) {
                        return aoluVar6;
                    }
                }
                java.lang.Object obj8 = this.d;
                defpackage.nsp nspVar = (defpackage.nsp) objH;
                aooh.f(obj8, "prefix");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (nspVar != null) {
                    defpackage.nsq nsqVar = nspVar.e;
                    if (nsqVar == null) {
                        nsqVar = defpackage.nsq.a;
                    }
                    if (nsqVar != null && (nsmVar = nsqVar.f) == null) {
                        nsmVar = defpackage.nsm.a;
                    }
                }
                boolean z = nsmVar != null ? nsmVar.g : false;
                if (nsmVar == null || (str = nsmVar.d) == null) {
                    str = "";
                }
                utw utwVar = utw.a;
                vqf vqfVarBx = wsc.bx(utwVar.m());
                java.lang.String str2 = (java.lang.String) obj8;
                vqfVarBx.v(defpackage.mtx.a(str2, "activated"));
                vqfVarBx.w(java.lang.String.valueOf(z));
                arrayList.add(vqfVarBx.u());
                if (z) {
                    if (str.length() == 0) {
                        defpackage.mtx.a.d().i(zct.b).l("com/android/dialer/dobby/impl/feedback/DobbyFeedbackBuilder", "createProductSpecificData", 51, "DobbyFeedbackBuilder.kt").v("Upload ID not present");
                    }
                    vqf vqfVarBx2 = wsc.bx(utwVar.m());
                    vqfVarBx2.v(defpackage.mtx.a(str2, "upload_id"));
                    vqfVarBx2.w(str);
                    arrayList.add(vqfVarBx2.u());
                }
                akzx akzxVarM2 = uts.a.m();
                aooh.f(akzxVarM2, "builder");
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM2.b.b);
                aooh.e(listUnmodifiableList, "getPsdList(...)");
                new alct(listUnmodifiableList);
                akzxVarM2.T(arrayList);
                uts utsVarP = akzxVarM2.p();
                aooh.e(utsVarP, "build(...)");
                return utsVarP;
            case 6:
                aolu aoluVar7 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 == 0) {
                    java.lang.Object obj9 = this.c;
                    java.lang.Object obj10 = this.d;
                    long j5 = this.b;
                    this.a = 1;
                    if (((defpackage.nld) obj9).v((java.lang.String) obj10, j5, this) == aoluVar7) {
                        return aoluVar7;
                    }
                }
                return aojh.a;
            case 7:
                aolu aoluVar8 = aolu.a;
                int i9 = this.a;
                aooc.af(obj);
                if (i9 == 0) {
                    java.lang.Object obj11 = this.c;
                    long j6 = this.b;
                    afpl afplVar2 = new afpl(new java.lang.Long(j6), new defpackage.jie(j6, (defpackage.oet) this.d, (aoln) null, 6), (char[]) null);
                    this.a = 1;
                    objD = ((gpd) ((rsr) obj11).b).r(afplVar2, this);
                    if (objD == aoluVar8) {
                        return aoluVar8;
                    }
                    return objD;
                }
                break;
            default:
                aolu aoluVar9 = aolu.a;
                int i10 = this.a;
                aooc.af(obj);
                if (i10 == 0) {
                    java.lang.Object obj12 = this.c;
                    long j7 = this.b;
                    java.lang.Object obj13 = this.d;
                    this.a = 1;
                    objD = ((swa) obj12).c(j7, obj13, this);
                    if (objD == aoluVar9) {
                        return aoluVar9;
                    }
                    return objD;
                }
                break;
        }
        return obj;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.klr((rsr) this.c, this.b, (java.lang.String) this.d, aolnVar, 0, null);
            case 1:
                return new defpackage.klr((defpackage.ahs) this.c, this.b, (defpackage.aht) this.d, aolnVar, 1);
            case 2:
                return new defpackage.klr((rsr) this.c, this.b, (java.lang.String) this.d, aolnVar, 2);
            case 3:
                java.lang.Object obj2 = this.d;
                return new defpackage.klr((mca) obj2, (defpackage.mbb) this.c, this.b, aolnVar, 3);
            case 4:
                java.lang.Object obj3 = this.c;
                return new defpackage.klr((android.telecom.Call.Details) obj3, (defpackage.msp) this.d, this.b, aolnVar, 4);
            case 5:
                return new defpackage.klr((defpackage.mtx) this.c, this.b, (java.lang.String) this.d, aolnVar, 5);
            case 6:
                java.lang.Object obj4 = this.c;
                return new defpackage.klr((defpackage.nld) obj4, (java.lang.String) this.d, this.b, aolnVar, 6);
            case 7:
                return new defpackage.klr((rsr) this.c, this.b, (defpackage.oet) this.d, aolnVar, 7);
            default:
                return new defpackage.klr((swa) this.c, this.b, this.d, aolnVar, 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(android.telecom.Call.Details details, defpackage.msp mspVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = details;
        this.d = mspVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(mca mcaVar, defpackage.mbb mbbVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = mcaVar;
        this.c = mbbVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(defpackage.mtx mtxVar, long j, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = mtxVar;
        this.b = j;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(defpackage.nld nldVar, java.lang.String str, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = nldVar;
        this.d = str;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(rsr rsrVar, long j, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = rsrVar;
        this.b = j;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(rsr rsrVar, long j, java.lang.String str, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = rsrVar;
        this.b = j;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(rsr rsrVar, long j, defpackage.oet oetVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = rsrVar;
        this.b = j;
        this.d = oetVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(swa swaVar, long j, java.lang.Object obj, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = swaVar;
        this.b = j;
        this.d = obj;
    }
}
