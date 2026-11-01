package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zpm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl");
    public final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final defpackage.aoin e;
    public final defpackage.ajct f;
    public final defpackage.zpz g;
    public final defpackage.zjm h;
    public final defpackage.aazc i;
    public final defpackage.zzx j;
    public final defpackage.zzx k;
    private final defpackage.zph l;
    private final defpackage.ajct m;

    public zpm(defpackage.aoin aoinVar, defpackage.zpz zpzVar, defpackage.zjm zjmVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zph zphVar, defpackage.ajct ajctVar, defpackage.aazc aazcVar, defpackage.ajct ajctVar2) {
        this.e = aoinVar;
        this.g = zpzVar;
        this.h = zjmVar;
        this.j = zzxVar;
        this.k = zzxVar2;
        this.l = zphVar;
        this.f = ajctVar;
        this.i = aazcVar;
        this.m = ajctVar2;
    }

    private static defpackage.aihd l(defpackage.aihd aihdVar, java.util.function.Predicate predicate) {
        return m(aihdVar, new zpi(predicate));
    }

    private static defpackage.aihd m(defpackage.aihd aihdVar, java.util.function.Predicate predicate) {
        return (defpackage.aihd) j$.util.Collection.-EL.stream(aihdVar).filter(new zpj(predicate)).collect(defpackage.aido.b);
    }

    public final defpackage.aihd a() {
        return defpackage.aihd.o(this.b.values());
    }

    public final defpackage.aihd b(zpo zpoVar) {
        return l(a(), new defpackage.vpl(zpoVar, 18));
    }

    public final defpackage.aihd c(zpo zpoVar) {
        return l(a(), new defpackage.vpl(zpoVar, 19));
    }

    public final defpackage.aihd d() {
        return (defpackage.aihd) j$.util.Collection.-EL.stream(this.b.values()).filter(new wrm(17)).sorted(j$.util.Comparator.-CC.comparingLong(new fhk(8))).collect(defpackage.aido.b);
    }

    public final j$.util.Optional e(java.lang.String str) {
        return j$.util.Optional.ofNullable((apqr) this.b.get(str));
    }

    public final j$.util.Optional f() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 213, "CallScopesImpl.java")).v("enter");
        defpackage.aihd aihdVarA = a();
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 220, "CallScopesImpl.java")).w("found %d call scopes", aihdVarA.size());
        defpackage.aihd aihdVarL = l(aihdVarA, new wrm(19));
        if (aihdVarL.size() == 1) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 226, "CallScopesImpl.java")).v("getAudioAvailableCallScope returning one ACTIVE call scope");
            return j$.util.Optional.of((apqr) aihdVarL.g().get(0));
        }
        defpackage.aihd aihdVarL2 = l(aihdVarA, new wrm(20));
        if (aihdVarL2.size() == 1) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 234, "CallScopesImpl.java")).v("getAudioAvailableCallScope returning one AUDIO_PROCESSING call scope");
            return j$.util.Optional.of((apqr) aihdVarL2.g().get(0));
        }
        defpackage.aihd aihdVarM = m(aihdVarA, new zun(1));
        if (aihdVarM.size() == 1) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 246, "CallScopesImpl.java")).v("getAudioAvailableCallScope returning one STATE_SIMULATED_RINGING call scope");
            return j$.util.Optional.of((apqr) aihdVarM.g().get(0));
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getAudioAvailableCallScope", 252, "CallScopesImpl.java")).v("getAudioAvailableCallScope returning empty optional");
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional g() {
        defpackage.aify aifyVarG = b(zpo.e).g();
        if (aifyVarG.isEmpty()) {
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalH = h();
        int size = aifyVarG.size();
        int i = 0;
        while (i < size) {
            apqr apqrVar = (apqr) aifyVarG.get(i);
            i++;
            if (!apqrVar.equals(optionalH.orElse((java.lang.Object) null))) {
                return j$.util.Optional.of(apqrVar);
            }
        }
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional h() {
        defpackage.aify aifyVarG = d().g();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.c;
        boolean zIsPresent = ((j$.util.Optional) atomicReference.get()).isPresent();
        defpackage.zph zphVar = this.l;
        if (!zIsPresent) {
            return zphVar.a(aifyVarG);
        }
        j$.util.Optional optionalA = zphVar.a(aifyVarG);
        if (!((j$.util.Optional) atomicReference.get()).equals(optionalA)) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "getPrimaryCallScope", 138, "CallScopesImpl.java");
            j$.util.Optional optionalOfNullable = (j$.util.Optional) atomicReference.get();
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(((apqr) optionalOfNullable.get()).b);
            }
            java.lang.Object objOrElse = optionalOfNullable.orElse("empty");
            if (true == optionalA.isPresent()) {
                optionalA = j$.util.Optional.ofNullable(((apqr) optionalA.get()).b);
            }
            aimwVar.I("legacy:%s tidepods: %s", objOrElse, optionalA.orElse("empty"));
        }
        return (j$.util.Optional) atomicReference.get();
    }

    public final j$.util.Optional i() {
        defpackage.aify aifyVarG = d().g();
        j$.util.Optional optionalH = h();
        defpackage.aooh.f(aifyVarG, "scopes");
        defpackage.aooh.f(optionalH, "ignore");
        if (aifyVarG.size() < 2) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        java.util.List<apqr> listB = this.l.b(aifyVarG);
        if (!optionalH.isPresent()) {
            j$.util.Optional optionalOf = j$.util.Optional.of(listB.get(1));
            defpackage.aooh.e(optionalOf, "of(...)");
            return optionalOf;
        }
        for (apqr apqrVar : listB) {
            if (!defpackage.aooh.n(apqrVar, optionalH.orElseThrow())) {
                j$.util.Optional optionalOf2 = j$.util.Optional.of(apqrVar);
                defpackage.aooh.e(optionalOf2, "of(...)");
                return optionalOf2;
            }
        }
        j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty2, "empty(...)");
        return optionalEmpty2;
    }

    public final void j(java.lang.String str) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopesImpl", "remove", 314, "CallScopesImpl.java")).y("remove called for: %s", str);
        defpackage.agsm.i(1233, defpackage.ahvr.E(new wdm(this, str, 11), this.m), "Error removing CallScope for %s", str);
    }

    public final defpackage.ajcq k(apqr apqrVar, java.lang.Class cls, zpf zpfVar) {
        return defpackage.aiql.A(zpfVar.a(defpackage.aooc.ar(((zpl) apqrVar.a(zpl.class)).lD().Y(), cls)));
    }
}
