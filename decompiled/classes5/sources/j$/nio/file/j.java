package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j implements java.security.PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        j$.nio.file.spi.c cVar = j$.adapter.b.a;
        java.lang.String property = java.lang.System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (java.lang.String str : property.split(",")) {
                try {
                    cVar = (j$.nio.file.spi.c) java.lang.Class.forName(str, true, java.lang.ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.c.class).newInstance(cVar);
                    if (!cVar.l().equals("file")) {
                        throw new java.lang.Error("Default provider must use scheme 'file'");
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.Error(e);
                }
            }
        }
        return cVar;
    }
}
