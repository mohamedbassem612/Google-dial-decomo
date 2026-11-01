package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a {
    public java.util.HashSet a;
    public java.util.HashMap b;
    public boolean c;

    public final void a(java.lang.Object obj, java.lang.String str) {
        this.b.put(str, obj);
    }

    public final boolean b(java.lang.String str) {
        return this.c || this.a.contains(str);
    }
}
