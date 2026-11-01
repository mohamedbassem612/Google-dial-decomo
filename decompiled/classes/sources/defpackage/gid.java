package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gid implements defpackage.emv {
    private final defpackage.gii a;

    public gid(defpackage.gii giiVar) {
        this.a = giiVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        if (empVar != defpackage.emp.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        emxVar.P().d(this);
        defpackage.gii giiVar = this.a;
        android.os.Bundle bundleC = giiVar.aT().c("androidx.savedstate.Restarter");
        if (bundleC != null) {
            java.util.ArrayList<java.lang.String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw new java.lang.IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            for (java.lang.String str : stringArrayList) {
                try {
                    java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str, false, defpackage.gid.class.getClassLoader()).asSubclass(gif.class);
                    if (clsAsSubclass == 0) {
                        defpackage.aooh.g();
                    }
                    try {
                        java.lang.reflect.Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        try {
                            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                            if (objNewInstance == null) {
                                defpackage.aooh.g();
                            }
                            ((gif) objNewInstance).a(giiVar);
                        } catch (java.lang.Exception e) {
                            throw new java.lang.RuntimeException("Failed to instantiate ".concat(java.lang.String.valueOf(str)), e);
                        }
                    } catch (java.lang.NoSuchMethodException e2) {
                        throw new java.lang.IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                    }
                } catch (java.lang.ClassNotFoundException e3) {
                    throw new java.lang.RuntimeException(defpackage.a.bk(str, "Class ", " wasn't found"), e3);
                }
            }
        }
    }
}
