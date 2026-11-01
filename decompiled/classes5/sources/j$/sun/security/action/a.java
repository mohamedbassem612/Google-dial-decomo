package j$.sun.security.action;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a implements java.security.PrivilegedAction {
    public final /* synthetic */ byte a;

    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        switch (this.a) {
            case 0:
                java.lang.String property = java.lang.System.getProperty("file.encoding");
                if (property == null) {
                    return null;
                }
                return property;
            case 1:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
