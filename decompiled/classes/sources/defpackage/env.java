package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class env {
    public static final defpackage.eop a = new defpackage.enu(1);
    public static final defpackage.eop b = new defpackage.enu(0);
    public static final defpackage.eop c = new defpackage.enu(2);

    public static final defpackage.enr a(defpackage.eoq eoqVar) {
        if (eoqVar == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Object objA = eoqVar.a(a);
        if (objA == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        defpackage.gii giiVar = (defpackage.gii) objA;
        java.lang.Object objA2 = eoqVar.a(defpackage.eog.a);
        if (objA2 == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        java.lang.String str = (java.lang.String) objA2;
        if (eoqVar.a(b) == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        defpackage.ent entVarA = defpackage.enn.a(giiVar);
        if (entVarA == null) {
            throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        android.os.Bundle bundle = (android.os.Bundle) eoqVar.a(c);
        java.util.Map map = entVarA.b().a;
        java.lang.Object enrVar = map.get(str);
        if (enrVar == null) {
            entVarA.c();
            android.os.Bundle bundle2 = entVarA.a;
            android.os.Bundle bundle3 = null;
            if (bundle2 != null && bundle2.containsKey(str)) {
                android.os.Bundle bundleB = defpackage.gie.b(bundle2, str);
                if (bundleB == null) {
                    bundleB = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(new defpackage.aoiu[0], 0));
                }
                bundle2.remove(str);
                if (bundle2.isEmpty()) {
                    entVarA.a = null;
                }
                bundle3 = bundleB;
            }
            if (bundle3 != null) {
                bundle = bundle3;
            }
            if (bundle == null) {
                enrVar = new defpackage.enr();
            } else {
                java.lang.ClassLoader classLoader = defpackage.enr.class.getClassLoader();
                if (classLoader == null) {
                    defpackage.aooh.g();
                }
                bundle.setClassLoader(classLoader);
                enrVar = new defpackage.enr(defpackage.gie.e(bundle));
            }
            map.put(str, enrVar);
        }
        return (defpackage.enr) enrVar;
    }

    public static final void b(defpackage.gii giiVar) {
        defpackage.emq emqVarA = giiVar.P().a();
        if (emqVarA != defpackage.emq.b && emqVarA != defpackage.emq.c) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(emqVarA, giiVar, "Failed to enable `SavedStateHandle` for `", "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."));
        }
        defpackage.enn.b(giiVar, (defpackage.eoi) giiVar);
    }
}
