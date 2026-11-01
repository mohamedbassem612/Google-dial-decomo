package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class g0 implements j$.nio.file.i0 {
    public final /* synthetic */ java.nio.file.WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent.Kind kind = this.a;
        if (obj instanceof j$.nio.file.g0) {
            obj = ((j$.nio.file.g0) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.i0
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.i0
    public final /* synthetic */ java.lang.Class type() {
        return this.a.type();
    }
}
