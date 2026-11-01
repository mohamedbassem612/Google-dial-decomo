package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class j0 implements j$.nio.file.l0 {
    public final /* synthetic */ java.nio.file.WatchEvent.Modifier a;

    public final /* synthetic */ java.lang.String a() {
        return this.a.name();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent.Modifier modifier = this.a;
        if (obj instanceof j$.nio.file.j0) {
            obj = ((j$.nio.file.j0) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
