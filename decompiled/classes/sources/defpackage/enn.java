package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class enn {
    public static final defpackage.ent a(defpackage.gii giiVar) {
        defpackage.gig gigVarD = giiVar.aT().d("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (gigVarD == null) {
            return null;
        }
        if (gigVarD instanceof defpackage.ent) {
            return (defpackage.ent) gigVarD;
        }
        throw new java.lang.IllegalStateException("The registered SavedStateProvider under SAVED_STATE_KEY is not of type SavedStateHandleController");
    }

    public static final void b(defpackage.gii giiVar, defpackage.eoi eoiVar) {
        defpackage.aoot aootVar = new defpackage.aoot();
        aootVar.a = a(giiVar);
        if (aootVar.a == null) {
            aootVar.a = new defpackage.ent(giiVar, eoiVar);
            giiVar.aT().e("androidx.lifecycle.internal.SavedStateHandlesProvider", (defpackage.gig) aootVar.a);
            if (giiVar.P().a().a(defpackage.emq.c)) {
                ((defpackage.ent) aootVar.a).c();
            } else {
                giiVar.P().c(new defpackage.mm(aootVar, 5, null));
            }
        }
    }

    public static defpackage.eoa c(defpackage.eoe eoeVar, defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
        if (cls == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return eoeVar.b(cls, eoqVar);
    }

    public static defpackage.eoa d(java.lang.Class cls) {
        defpackage.aooh.f(cls, "modelClass");
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static defpackage.eoa e(defpackage.eoe eoeVar, java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("modelClass");
        }
        return eoeVar.a(cls);
    }

    public static final defpackage.eog f(defpackage.eoh eohVar, defpackage.eoe eoeVar, defpackage.eoq eoqVar) {
        if (eohVar == null) {
            defpackage.aooh.i("store");
        }
        if (eoeVar == null) {
            defpackage.aooh.i("factory");
        }
        if (eoqVar == null) {
            defpackage.aooh.i("extras");
        }
        return new defpackage.eog(eohVar, eoeVar, eoqVar);
    }

    public static final defpackage.eog g(defpackage.eoi eoiVar, defpackage.eoe eoeVar, defpackage.eoq eoqVar) {
        if (eoeVar == null) {
            defpackage.aooh.i("factory");
        }
        if (eoqVar == null) {
            defpackage.aooh.i("extras");
        }
        return new defpackage.eog(eoiVar.S(), eoeVar, eoqVar);
    }
}
