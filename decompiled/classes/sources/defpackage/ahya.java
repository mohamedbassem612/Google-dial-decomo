package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahya implements defpackage.ahxx {
    private final /* synthetic */ int $cid;

    public ahya(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahxx
    public final java.lang.Class a() {
        if (this.$cid == 0) {
            if (defpackage.ahyb.b()) {
                return null;
            }
            try {
                java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (java.lang.ClassNotFoundException unused) {
                    return null;
                }
            } catch (java.lang.SecurityException unused2) {
                defpackage.ahyb.a.logp(java.util.logging.Level.INFO, "com.google.common.base.FinalizableReferenceQueue$SystemLoader", "loadFinalizer", "Not allowed to access system class loader.");
                return null;
            }
        }
        if (defpackage.ahyb.b()) {
            return null;
        }
        try {
            java.net.URL resource = getClass().getClassLoader().getResource("com/google/common/base/internal/Finalizer.class");
            if (resource == null) {
                throw new java.io.FileNotFoundException("com/google/common/base/internal/Finalizer.class");
            }
            java.lang.String string = resource.toString();
            if (string.endsWith("com/google/common/base/internal/Finalizer.class")) {
                return new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(resource, string.substring(0, string.length() - 47))}, null).loadClass("com.google.common.base.internal.Finalizer");
            }
            throw new java.io.IOException("Unsupported path style: ".concat(java.lang.String.valueOf(string)));
        } catch (java.lang.Exception e) {
            defpackage.ahyb.a.logp(java.util.logging.Level.WARNING, "com.google.common.base.FinalizableReferenceQueue$DecoupledLoader", "loadFinalizer", "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (java.lang.Throwable) e);
            return null;
        }
    }
}
