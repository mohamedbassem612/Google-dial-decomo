package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c2 extends j$.util.stream.g2 {
    public final /* synthetic */ j$.util.stream.h2 c;
    public final /* synthetic */ java.util.function.Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(j$.util.stream.h2 h2Var, java.util.function.Predicate predicate) {
        super(h2Var);
        this.c = h2Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        j$.util.stream.h2 h2Var = this.c;
        if (zTest == h2Var.a) {
            this.a = true;
            this.b = h2Var.b;
        }
    }
}
