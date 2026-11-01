package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class k0 implements java.nio.file.WatchEvent.Modifier {
    public final /* synthetic */ j$.nio.file.l0 a;

    public /* synthetic */ k0(j$.nio.file.l0 l0Var) {
        this.a = l0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.l0 l0Var = this.a;
        if (obj instanceof j$.nio.file.k0) {
            obj = ((j$.nio.file.k0) obj).a;
        }
        return l0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.j0) this.a).a();
    }
}
