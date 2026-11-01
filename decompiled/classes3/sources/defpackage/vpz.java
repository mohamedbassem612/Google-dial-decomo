package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpz {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/greeting/single/impl/service/VoicemailSingleGreetingDataService");
    public static final agxj b = new agxj("VOICEMAIL_SINGLE_GREETING_DATASOURCE_KEY");
    public final aoss c;
    public final aoin d;
    public final aoin e;
    public final defpackage.uyg f;
    public final zjm g;
    public final aogc h;
    private final vpq i;

    public vpz(vpq vpqVar, zjm zjmVar, aogc aogcVar, aazc aazcVar, aoss aossVar, defpackage.uyg uygVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(aazcVar, "clock");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "failureGreetingsCacheTimeToLiveMillis");
        aooh.f(aoinVar2, "successGreetingsCacheTimeToLiveMillis");
        this.i = vpqVar;
        this.g = zjmVar;
        this.h = aogcVar;
        this.c = aossVar;
        this.f = uygVar;
        this.d = aoinVar;
        this.e = aoinVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vpt vptVar, aoln aolnVar) {
        defpackage.vpy vpyVar;
        if (aolnVar instanceof defpackage.vpy) {
            vpyVar = (defpackage.vpy) aolnVar;
            int i = vpyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpyVar.c = i - Integer.MIN_VALUE;
            } else {
                vpyVar = new defpackage.vpy(this, aolnVar);
            }
        } else {
            vpyVar = new defpackage.vpy(this, aolnVar);
        }
        java.lang.Object objD = vpyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vpyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarC = this.i.c(phoneAccountHandle);
            vpyVar.d = phoneAccountHandle;
            vpyVar.e = vptVar;
            vpyVar.c = 1;
            objD = aosv.D(ajcqVarC, vpyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vptVar = vpyVar.e;
            phoneAccountHandle = vpyVar.d;
            aooc.af(objD);
        }
        defpackage.vpj vpjVar = (defpackage.vpj) objD;
        akzx akzxVarM = defpackage.vqa.a.m();
        aooh.f(akzxVarM, "builder");
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        aooh.e(strFlattenToString, "flattenToString(...)");
        aooh.f(strFlattenToString, "value");
        akzxVarM.u();
        defpackage.vqa vqaVar = (defpackage.vqa) akzxVarM.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        vqaVar.c = strFlattenToString;
        java.lang.String id = phoneAccountHandle.getId();
        aooh.e(id, "getId(...)");
        aooh.f(id, "value");
        akzxVarM.u();
        defpackage.vqa vqaVar2 = (defpackage.vqa) akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        vqaVar2.d = id;
        vcr vcrVar = vptVar.f;
        if (vcrVar == null) {
            vcrVar = vcr.a;
        }
        aooh.e(vcrVar, "getVvmResult(...)");
        aooh.f(vcrVar, "value");
        akzxVarM.u();
        defpackage.vqa vqaVar3 = (defpackage.vqa) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcrVar);
        vqaVar3.f = vcrVar;
        vqaVar3.b |= 2;
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(vpjVar.g).findFirst();
        aooh.e(optionalFindFirst, "findFirst(...)");
        defpackage.vph vphVar = (defpackage.vph) aooh.q(optionalFindFirst);
        if (vphVar != null) {
            akzxVarM.u();
            defpackage.vqa vqaVar4 = (defpackage.vqa) akzxVarM.b;
            j$.util.Objects.requireNonNull(vphVar);
            vqaVar4.e = vphVar;
            vqaVar4.b |= 1;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.vqa) aladVarP;
    }
}
