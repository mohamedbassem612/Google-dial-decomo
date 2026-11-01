package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class accg implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ accg(defpackage.adqn adqnVar, java.util.concurrent.ExecutorService executorService, defpackage.adon adonVar, int i) {
        this.$cid = i;
        this.b = adqnVar;
        this.c = executorService;
        this.a = adonVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v61, types: [ahbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v23, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [adjl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v9, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.ahcz ahczVar;
        int i = this.$cid;
        defpackage.ahcz ahczVar2 = null;
        if (i == 0) {
            ?? r2 = this.b;
            defpackage.ahvr.cc(r2.isDone(), "Future was expected to be done: %s", r2);
            return !((java.lang.Boolean) defpackage.a.h(r2)).booleanValue() ? new defpackage.ajcm(new defpackage.adub(new defpackage.abzt(null))) : ((defpackage.acdo) ((defpackage.acch) this.a).b.a()).b((defpackage.akiq) this.c);
        }
        int i2 = 2;
        int i3 = 0;
        if (i == 1) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = this.c;
            if (zBooleanValue) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.xeh.a.b()).l("com/android/incallui/callscreen/impl/actions/ActionTextDownloader", "prepareAllTexts", 263, "ActionTextDownloader.java")).y("%s - text is already available", obj2);
                return defpackage.ajcm.a;
            }
            java.lang.Object obj3 = this.b;
            java.lang.Object obj4 = this.a;
            ((defpackage.aimw) ((defpackage.aimw) defpackage.xeh.a.b()).l("com/android/incallui/callscreen/impl/actions/ActionTextDownloader", "prepareAllTexts", 266, "ActionTextDownloader.java")).y("%s - text isn't available, preparing", obj2);
            defpackage.ajcq ajcqVarE = ((defpackage.xeh) obj4).h.e((defpackage.aihd) obj3);
            defpackage.low lowVar = new defpackage.low("ActionTextDownloader.prepareAllTexts$audioMessageFileManager.prepareAllTexts");
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            long j = defpackage.ahqx.a;
            ajcqVarE.c(new defpackage.ajcc(ajcqVarE, new defpackage.sqh(defpackage.ahns.c(false), lowVar, 2)), ajbmVar);
            return ajcqVarE;
        }
        int i4 = 5;
        if (i == 2) {
            java.util.Map map = (java.util.Map) obj;
            return new defpackage.anpu(false, defpackage.aify.j(map.values())).b(new defpackage.jio((defpackage.adlx) this.b, (defpackage.adjl) this.a, map, i4), this.c);
        }
        int i5 = 4;
        if (i == 3) {
            java.lang.Object obj5 = this.b;
            defpackage.adqn adqnVar = (defpackage.adqn) obj5;
            adqnVar.f = defpackage.aiql.r(this.c);
            adqnVar.g = new defpackage.adqu(adqnVar.f);
            java.lang.Object obj6 = this.a;
            try {
                defpackage.adqh adqhVar = new defpackage.adqh(((defpackage.adqn) obj5).d);
                java.io.File file = adqhVar.b;
                if (file.exists()) {
                    synchronized (adqhVar) {
                        java.io.File file2 = adqhVar.b;
                        byte[] bArrH = new defpackage.aisp(file2).h();
                        defpackage.alad aladVarE = defpackage.alad.E(defpackage.adqf.a, bArrH, 0, bArrH.length, defpackage.akzq.a);
                        defpackage.alad.V(aladVarE);
                        adqhVar.c = (defpackage.adqf) aladVarE;
                        file2.getPath();
                    }
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.adqh.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessagesConfiguration", "load", 71, "AudioMessagesConfiguration.java")).y("Configuration file does not exist at %s", file.getPath());
                }
                ((defpackage.adqn) obj5).e = adqhVar;
            } catch (java.io.IOException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.adqn.a.d()).k(e)).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "initInternal", '^', "PersistentVoiceFileManagerWrapper.java")).v("Failed to read audio message configuration from file, reset to default voice");
                adqnVar.e = new defpackage.adqh(adqnVar.d);
            }
            adqnVar.h = new defpackage.aogc((defpackage.adon) obj6, adqnVar.c.a());
            defpackage.aogc aogcVar = adqnVar.h;
            defpackage.adqh adqhVar2 = adqnVar.e;
            defpackage.aify aifyVar = (defpackage.aify) aogcVar.b;
            defpackage.ahvr.bZ(!aifyVar.isEmpty(), "No available voices to choose from");
            java.lang.String str = (java.lang.String) j$.util.stream.Stream.-CC.of(new java.util.function.Supplier[]{new defpackage.adqp(aogcVar, adqhVar2, i3), new defpackage.vmp(aogcVar, 17), new defpackage.adqp(aogcVar, adqhVar2, i2), new defpackage.vmp(aogcVar, 18)}).map(new defpackage.vaq(15)).filter(new defpackage.opv(11)).map(new defpackage.vaq(16)).findFirst().orElse(((defpackage.adsi) aifyVar.get(0)).a);
            ((defpackage.aimw) ((defpackage.aimw) defpackage.adqn.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "initInternal", 101, "PersistentVoiceFileManagerWrapper.java")).y("Preferred voice on init: %s", str);
            return adqnVar.g(str);
        }
        if (i == 4) {
            ?? r3 = this.b;
            defpackage.ahvr.cc(r3.isDone(), "Future was expected to be done: %s", r3);
            ?? r4 = this.c;
            java.lang.Object objH = defpackage.a.h(r3);
            defpackage.ahvr.cc(r4.isDone(), "Future was expected to be done: %s", r4);
            boolean zEquals = objH.equals(defpackage.a.h(r4));
            java.lang.Object obj7 = this.a;
            if (zEquals) {
                return obj == null ? defpackage.ajcm.a : new defpackage.ajcm(obj);
            }
            defpackage.adpx adpxVar = new defpackage.adpx(obj7, (java.lang.Object) r4, 7);
            long j2 = defpackage.ahqx.a;
            defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), adpxVar, 1);
            defpackage.afhc afhcVar = (defpackage.afhc) obj7;
            java.util.concurrent.Executor executor = afhcVar.b;
            defpackage.ajal ajalVar = new defpackage.ajal(r4, ajaxVar);
            r4.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
            synchronized (afhcVar.d) {
            }
            return ajalVar;
        }
        if (i == 5) {
            return ((defpackage.afhf) this.a).b.g(this.b, this.c);
        }
        defpackage.ahda ahdaVar = (defpackage.ahda) obj;
        defpackage.akzx akzxVarM = defpackage.aexf.a.m();
        defpackage.akzx akzxVarM2 = defpackage.aexe.a.m();
        akzxVarM2.u();
        defpackage.aexe aexeVar = (defpackage.aexe) akzxVarM2.b;
        aexeVar.c = defpackage.a.R(6);
        aexeVar.b |= 1;
        akzxVarM.u();
        defpackage.aexf aexfVar = (defpackage.aexf) akzxVarM.b;
        defpackage.aexe aexeVar2 = (defpackage.aexe) akzxVarM2.r();
        j$.util.Objects.requireNonNull(aexeVar2);
        aexfVar.d = aexeVar2;
        aexfVar.b |= 2;
        defpackage.ahce ahceVar = (defpackage.ahce) this.b;
        ahceVar.g(akzxVarM);
        defpackage.ahax ahaxVar = (defpackage.ahax) this.a;
        defpackage.ahcd ahcdVarAJ = defpackage.agab.aJ(ahaxVar, akzxVarM, ahceVar.a());
        ?? r0 = this.c;
        defpackage.aooh.f(r0, "newExperimentValues");
        do {
            atomicReference = (java.util.concurrent.atomic.AtomicReference) ahdaVar.a;
            ahczVar = (defpackage.ahcz) atomicReference.get();
            if (ahczVar.b) {
                return defpackage.aiql.z(new defpackage.ahbm(false));
            }
            if (ahczVar2 == null) {
                ahczVar2 = new defpackage.ahcz(r0, ahcdVarAJ, false);
            }
        } while (!defpackage.anty.Q(atomicReference, ahczVar, ahczVar2));
        return ((java.lang.Boolean) ahceVar.r.a()).booleanValue() ? defpackage.aiql.z(new defpackage.ahbm(true)) : defpackage.ahvr.H(ahceVar.l.a().b(ahaxVar.e, ahcdVarAJ.c), defpackage.ahqx.a(new defpackage.agqh(i5)), defpackage.ajbm.INSTANCE);
    }

    public /* synthetic */ accg(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ accg(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ accg(defpackage.xeh xehVar, java.lang.String str, defpackage.aihd aihdVar, int i) {
        this.$cid = i;
        this.a = xehVar;
        this.c = str;
        this.b = aihdVar;
    }
}
