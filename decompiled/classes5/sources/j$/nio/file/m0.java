package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class m0 implements j$.nio.file.o0 {
    public final /* synthetic */ java.nio.file.WatchEvent a;

    public /* synthetic */ m0(java.nio.file.WatchEvent watchEvent) {
        this.a = watchEvent;
    }

    public final /* synthetic */ java.lang.Object a() {
        return j$.nio.file.a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ j$.nio.file.i0 c() {
        return j$.nio.file.a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent watchEvent = this.a;
        if (obj instanceof j$.nio.file.m0) {
            obj = ((j$.nio.file.m0) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
