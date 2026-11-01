package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mum {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/feedback/upload/DobbyScottyUploadChannel");
    private static final java.util.Map c = defpackage.ajsz.aO(new defpackage.aoiu("DOMAIN_0", "https://bg-call-donation-alpha.google.com/upload/"), new defpackage.aoiu("DOMAIN_D", "https://bg-call-donation-dev.goog/upload"), new defpackage.aoiu("DOMAIN_A", "https://bg-call-donation-alpha.goog/upload"), new defpackage.aoiu("DOMAIN_C", "https://bg-call-donation-canary.goog/upload"), new defpackage.aoiu("DOMAIN_P", "https://bg-call-donation.goog/upload"));
    public final defpackage.ajsz a;
    private final defpackage.aoin d;
    private final defpackage.aolr e;

    public mum(defpackage.aoin aoinVar, defpackage.aolr aolrVar, defpackage.ajsz ajszVar) {
        defpackage.aooh.f(aoinVar, "scottyUploadTarget");
        defpackage.aooh.f(aolrVar, "blockingContext");
        this.d = aoinVar;
        this.e = aolrVar;
        this.a = ajszVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0142  */
    /* JADX WARN: Code duplicated, block: B:30:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(mun munVar, nsv nsvVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        mul mulVar;
        if (aolnVar instanceof mul) {
            mulVar = (mul) aolnVar;
            int i = mulVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mulVar.c = i - Integer.MIN_VALUE;
            } else {
                mulVar = new mul(this, aolnVar);
            }
        } else {
            mulVar = new mul(this, aolnVar);
        }
        java.lang.Object objAj = mulVar.a;
        apjb apjbVar = defpackage.aolu.a;
        int i2 = mulVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objAj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj);
            }
            apjbVar = (apjb) objAj;
            if (apjbVar.n()) {
                ((defpackage.aimw) b.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyScottyUploadChannel", "upload", 81, "DobbyScottyUploadChannel.kt")).y("Dobby scotty send completed with exception %s", ((ammv) apjbVar.a).a);
            }
            if (apjbVar.m()) {
                ((defpackage.aimw) b.b().l("com/android/dialer/dobby/impl/feedback/upload/DobbyScottyUploadChannel", "upload", 89, "DobbyScottyUploadChannel.kt")).y("Dobby scotty send completed with response %s", ((amwp) apjbVar.b).c());
            }
            defpackage.aooh.c(apjbVar);
            return apjbVar;
        }
        defpackage.aooc.af(objAj);
        java.lang.String str = (java.lang.String) this.d.a();
        java.util.Map map = c;
        if (!map.containsKey(str)) {
            throw new java.lang.IllegalStateException(defpackage.a.bk(str, "flag domain: ", " not found"));
        }
        java.lang.String str2 = (java.lang.String) map.get(str);
        defpackage.aoot aootVar = new defpackage.aoot();
        uzx uzxVarC = ahus.C(ahwh.a.m());
        java.lang.String str3 = nsvVar.c;
        defpackage.aooh.e(str3, "getUploadId(...)");
        defpackage.aooh.f(str3, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) uzxVarC.a;
        akzxVar.u();
        ahwh ahwhVar = akzxVar.b;
        j$.util.Objects.requireNonNull(str3);
        ahwhVar.b |= 4;
        ahwhVar.e = str3;
        defpackage.aooh.f(nsvVar, "value");
        akzxVar.u();
        ahwh ahwhVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(nsvVar);
        ahwhVar2.h = nsvVar;
        ahwhVar2.b |= 64;
        aootVar.a = uzxVarC.aM();
        if (munVar != null) {
            uzx uzxVarC2 = ahus.C(((ahwh) aootVar.a).L());
            defpackage.akzx akzxVar2 = (defpackage.akzx) uzxVarC2.a;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVar2.b.c);
            defpackage.aooh.e(listUnmodifiableList, "getAudioFilesList(...)");
            new defpackage.alct(listUnmodifiableList);
            defpackage.akzx akzxVarM = ahwg.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            java.lang.String str4 = munVar.a;
            defpackage.aooh.f(str4, "value");
            akzxVarM.u();
            ahwg ahwgVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            ahwgVar.b |= 1;
            ahwgVar.c = str4;
            defpackage.akzc akzcVar = munVar.b;
            defpackage.aooh.f(akzcVar, "value");
            akzxVarM.u();
            ahwg ahwgVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            ahwgVar2.b |= 2;
            ahwgVar2.d = akzcVar;
            defpackage.alad aladVarR = akzxVarM.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            ahwg ahwgVar3 = (ahwg) aladVarR;
            defpackage.aooh.f(ahwgVar3, "value");
            akzxVar2.at(ahwgVar3);
            aootVar.a = uzxVarC2.aM();
        }
        defpackage.aolr aolrVar = this.e;
        defpackage.hcn hcnVar = new defpackage.hcn(this, str2, aootVar, (defpackage.aoln) null, 4);
        mulVar.c = 1;
        objAj = defpackage.aoov.aj(aolrVar, hcnVar, mulVar);
        if (objAj != apjbVar) {
        }
        return apjbVar;
        defpackage.aooh.e(objAj, "withContext(...)");
        mulVar.c = 2;
        objAj = defpackage.aosv.D((defpackage.ajcq) objAj, mulVar);
        if (objAj != apjbVar) {
            apjbVar = (apjb) objAj;
            if (apjbVar.n()) {
                ((defpackage.aimw) b.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyScottyUploadChannel", "upload", 81, "DobbyScottyUploadChannel.kt")).y("Dobby scotty send completed with exception %s", ((ammv) apjbVar.a).a);
            }
            if (apjbVar.m()) {
                ((defpackage.aimw) b.b().l("com/android/dialer/dobby/impl/feedback/upload/DobbyScottyUploadChannel", "upload", 89, "DobbyScottyUploadChannel.kt")).y("Dobby scotty send completed with response %s", ((amwp) apjbVar.b).c());
            }
            defpackage.aooh.c(apjbVar);
        }
        return apjbVar;
    }
}
