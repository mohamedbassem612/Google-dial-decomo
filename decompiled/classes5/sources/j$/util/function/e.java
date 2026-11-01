package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class e implements java.util.function.Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Function b;
    public final /* synthetic */ java.util.function.Function c;

    public /* synthetic */ e(java.util.function.Function function, java.util.function.Function function2, byte b) {
        this.a = b;
        this.b = function;
        this.c = function2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }
}
