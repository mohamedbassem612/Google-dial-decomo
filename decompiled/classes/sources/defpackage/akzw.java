package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akzw {
    static defpackage.akzq b(java.lang.Class cls) {
        java.lang.ClassLoader classLoader = defpackage.akzw.class.getClassLoader();
        if (cls.equals(defpackage.akzq.class)) {
            try {
                try {
                    return (defpackage.akzq) cls.cast(((defpackage.akzw) java.lang.Class.forName("akys", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (java.lang.ReflectiveOperationException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        java.util.Iterator it = java.util.Collections.singletonList(defpackage.aldd.class.getDeclaredConstructor(null).newInstance(null)).iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((defpackage.akzq) cls.cast(((defpackage.akzw) it.next()).a()));
            } catch (java.util.ServiceConfigurationError e2) {
                java.util.logging.Logger.getLogger(defpackage.akzk.class.getName()).logp(java.util.logging.Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(cls.getSimpleName())), (java.lang.Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (defpackage.akzq) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (defpackage.akzq) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
        } catch (java.lang.ReflectiveOperationException e3) {
            throw new java.lang.IllegalStateException(e3);
        }
    }

    protected abstract defpackage.akzq a();
}
