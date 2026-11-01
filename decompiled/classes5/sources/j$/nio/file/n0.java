package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class n0 implements java.nio.file.WatchEvent {
    public final /* synthetic */ j$.nio.file.o0 a;

    public /* synthetic */ n0(j$.nio.file.o0 o0Var) {
        this.a = o0Var;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ java.lang.Object context() {
        return j$.nio.file.a.g(((j$.nio.file.m0) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((j$.nio.file.m0) this.a).b();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.o0 o0Var = this.a;
        if (obj instanceof j$.nio.file.n0) {
            obj = ((j$.nio.file.n0) obj).a;
        }
        return o0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ java.nio.file.WatchEvent.Kind kind() {
        return j$.nio.file.a.f(((j$.nio.file.m0) this.a).c());
    }
}
