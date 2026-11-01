package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssa implements zhg {
    private final aoin a;
    private final aoin b;
    private final zjm c;

    public ssa(aoin aoinVar, aoin aoinVar2, zjm zjmVar) {
        aooh.f(aoinVar, "callerTagExperimentId");
        aooh.f(aoinVar2, "callerTagCrowdsourcingExperimentId");
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = zjmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.akmz akmzVar, java.lang.String str, akzx akzxVar, aoln aolnVar) {
        defpackage.srz srzVar;
        jvv jvvVar;
        ajcq ajcqVarA;
        akzx akzxVar2;
        if (aolnVar instanceof defpackage.srz) {
            srzVar = (defpackage.srz) aolnVar;
            int i = srzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                srzVar.c = i - Integer.MIN_VALUE;
            } else {
                srzVar = new defpackage.srz(this, aolnVar);
            }
        } else {
            srzVar = new defpackage.srz(this, aolnVar);
        }
        java.lang.Object objD = srzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = srzVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.akmn akmnVar = akmzVar.e;
            if (akmnVar == null) {
                akmnVar = defpackage.akmn.a;
            }
            aooh.e(akmnVar, "getCrowdsourceEntity(...)");
            akzx akzxVarM = defpackage.zhi.a.m();
            aooh.f(akzxVarM, "builder");
            boolean z = akmnVar.b;
            akzxVarM.u();
            defpackage.zhi zhiVar = (defpackage.zhi) akzxVarM.b;
            zhiVar.b |= 1;
            zhiVar.c = z;
            boolean z2 = akmnVar.c;
            akzxVarM.u();
            defpackage.zhi zhiVar2 = (defpackage.zhi) akzxVarM.b;
            zhiVar2.b |= 2;
            zhiVar2.d = z2;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(zhiVar2.e);
            aooh.e(listUnmodifiableList, "getSuggestedCallerTagIdsList(...)");
            new alct(listUnmodifiableList);
            alat alatVar = akmnVar.d;
            aooh.e(alatVar, "getSuggestedCallerTagsList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
            java.util.Iterator it = alatVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.akmk) it.next()).b);
            }
            akzxVarM.u();
            defpackage.zhi zhiVar3 = (defpackage.zhi) akzxVarM.b;
            alat alatVar2 = zhiVar3.e;
            if (!alatVar2.c()) {
                zhiVar3.e = alad.J(alatVar2);
            }
            akyl.i(arrayList, zhiVar3.e);
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.zhi zhiVar4 = (defpackage.zhi) aladVarP;
            akzxVar.u();
            defpackage.zhj zhjVar = (defpackage.zhj) akzxVar.b;
            defpackage.zhj zhjVar2 = defpackage.zhj.a;
            j$.util.Objects.requireNonNull(zhiVar4);
            zhjVar.h = zhiVar4;
            zhjVar.b |= 32;
            defpackage.akni akniVar = akmzVar.c;
            if (akniVar == null) {
                akniVar = defpackage.akni.a;
            }
            aooh.e(akniVar, "getPhoneNumberEntity(...)");
            java.lang.String str2 = akniVar.b;
            aooh.e(str2, "getEntityName(...)");
            int length = str2.length();
            int iAR = a.aR(akniVar.c);
            if (iAR == 0) {
                iAR = 1;
            }
            if ((length > 0 && iAR != 4) || (jvvVar = (jvv) this.c.g().orElse((java.lang.Object) null)) == null) {
                return akzxVar;
            }
            defpackage.akml akmlVar = akmzVar.d;
            if (akmlVar == null) {
                akmlVar = defpackage.akml.a;
            }
            aooh.e(akmlVar, "getCallerTagsEntity(...)");
            java.lang.String str3 = akmlVar.b;
            aooh.e(str3, "getCallerTagId(...)");
            if (str3.length() > 0) {
                java.lang.String str4 = akmlVar.b;
                ajcq ajcqVarA2 = jvvVar.a();
                ajcq ajcqVarC = jvvVar.c(str4);
                ajcqVarA = ahvr.ak(new ajcq[]{ajcqVarA2, ajcqVarC}).o(new gzk(ajcqVarA2, ajcqVarC, 8), jvvVar.b);
            } else {
                ajcqVarA = jvvVar.a();
            }
            srzVar.d = akzxVar;
            srzVar.e = akzxVar;
            srzVar.c = 1;
            objD = aosv.D(ajcqVarA, srzVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            akzxVar2 = akzxVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            akzxVar = srzVar.e;
            akzxVar2 = srzVar.d;
            aooc.af(objD);
        }
        defpackage.zag zagVar = (defpackage.zag) objD;
        akzxVar.u();
        defpackage.zhj zhjVar3 = (defpackage.zhj) akzxVar.b;
        defpackage.zhj zhjVar4 = defpackage.zhj.a;
        j$.util.Objects.requireNonNull(zagVar);
        zhjVar3.g = zagVar;
        zhjVar3.b |= 16;
        return akzxVar2;
    }

    public final void b(akzx akzxVar) {
        java.lang.Object objA = this.a.a();
        aooh.e(objA, "get(...)");
        long jLongValue = ((java.lang.Number) objA).longValue();
        akzxVar.u();
        defpackage.akmy akmyVar = (defpackage.akmy) akzxVar.b;
        defpackage.akmy akmyVar2 = defpackage.akmy.a;
        akmyVar.d = jLongValue;
        java.lang.Object objA2 = this.b.a();
        aooh.e(objA2, "get(...)");
        long jLongValue2 = ((java.lang.Number) objA2).longValue();
        akzxVar.u();
        ((defpackage.akmy) akzxVar.b).e = jLongValue2;
        akzxVar.u();
        ((defpackage.akmy) akzxVar.b).f = a.T(4);
    }
}
