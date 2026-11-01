package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class enw implements defpackage.eoe {
    public final defpackage.gii a;
    public final defpackage.eoi b;
    public final android.os.Bundle c;
    private final android.app.Application d;
    private final defpackage.eoe e;

    public enw(android.app.Application application, defpackage.gii giiVar, android.os.Bundle bundle) {
        defpackage.eod eodVar;
        if (!(giiVar instanceof defpackage.eoi)) {
            throw new java.lang.IllegalArgumentException("SavedStateRegistryOwner must implement ViewModelStoreOwner to support SavedStateHandles");
        }
        this.a = giiVar;
        this.b = (defpackage.eoi) giiVar;
        this.c = bundle;
        this.d = application;
        if (application != null) {
            if (defpackage.eod.a == null) {
                defpackage.eod.a = new defpackage.eod(application);
            }
            eodVar = defpackage.eod.a;
            if (eodVar == null) {
                defpackage.aooh.g();
            }
        } else {
            eodVar = new defpackage.eod(null);
        }
        this.e = eodVar;
    }

    @Override // defpackage.eoe
    public final defpackage.eoa a(java.lang.Class cls) {
        defpackage.aooh.f(cls, "modelClass");
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.eoe
    public final defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        defpackage.aooh.f(cls, "modelClass");
        java.lang.Object objA = eoqVar.a(defpackage.eog.a);
        if (objA == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        java.lang.String str = (java.lang.String) objA;
        if (eoqVar.a(defpackage.env.a) == null || eoqVar.a(defpackage.env.b) == null) {
            if (this.a != null) {
                return d(str, cls);
            }
            throw new java.lang.IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY and VIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras to successfully create a ViewModel.");
        }
        android.app.Application application = (android.app.Application) eoqVar.a(defpackage.eod.b);
        boolean zIsAssignableFrom = emf.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor constructorB = (!zIsAssignableFrom || application == null) ? enx.b(cls, enx.b) : enx.b(cls, enx.a);
        if (constructorB == null) {
            return this.e.b(cls, eoqVar);
        }
        defpackage.enr enrVarA = defpackage.env.a(eoqVar);
        return (!zIsAssignableFrom || application == null) ? enx.a(cls, constructorB, new java.lang.Object[]{enrVarA}) : enx.a(cls, constructorB, new java.lang.Object[]{application, enrVarA});
    }

    @Override // defpackage.eoe
    public final defpackage.eoa c(defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        return b(defpackage.aooc.I(aopuVar), eoqVar);
    }

    public final defpackage.eoa d(java.lang.String str, java.lang.Class cls) {
        defpackage.eoi eoiVar;
        defpackage.aooh.f(cls, "modelClass");
        defpackage.gii giiVar = this.a;
        if (giiVar == null || (eoiVar = this.b) == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = emf.class.isAssignableFrom(cls);
        android.app.Application application = this.d;
        boolean z = application != null;
        java.lang.reflect.Constructor constructorB = (zIsAssignableFrom && z) ? enx.b(cls, enx.a) : enx.b(cls, enx.b);
        if (constructorB == null) {
            if (z) {
                return this.e.a(cls);
            }
            if (defpackage.eof.c == null) {
                defpackage.eof.c = new defpackage.eof();
            }
            defpackage.eof eofVar = defpackage.eof.c;
            defpackage.aooh.c(eofVar);
            return eofVar.a(cls);
        }
        defpackage.enn.b(giiVar, eoiVar);
        avo.p(giiVar);
        defpackage.eoq eoqVarN = defpackage.dzo.n(eoiVar);
        defpackage.dpz dpzVar = new defpackage.dpz(this, str, 7, null);
        defpackage.aooh.f(eoqVarN, "initialExtras");
        defpackage.eos eosVar = new defpackage.eos(eoqVarN);
        dpzVar.a(eosVar);
        defpackage.enr enrVarA = defpackage.env.a(eosVar);
        return (zIsAssignableFrom && z) ? enx.a(cls, constructorB, new java.lang.Object[]{application, enrVarA}) : enx.a(cls, constructorB, new java.lang.Object[]{enrVarA});
    }

    public enw() {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new defpackage.eod(null);
    }
}
