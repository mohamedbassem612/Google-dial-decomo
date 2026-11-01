package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h0 implements java.nio.file.WatchEvent.Kind {
    public final /* synthetic */ j$.nio.file.i0 a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.i0 i0Var = this.a;
        if (obj instanceof j$.nio.file.h0) {
            obj = ((j$.nio.file.h0) obj).a;
        }
        return i0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ java.lang.Class type() {
        return this.a.type();
    }
}
