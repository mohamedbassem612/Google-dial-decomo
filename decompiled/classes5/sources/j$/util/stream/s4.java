package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s4 extends j$.util.stream.n4 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object j;
    public final /* synthetic */ java.lang.Object k;

    public /* synthetic */ s4(j$.util.stream.w7 w7Var, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte b) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.n4
    public final j$.util.stream.i5 Q() {
        byte b = this.h;
        java.lang.Object obj = this.j;
        java.lang.Object obj2 = this.k;
        java.lang.Object obj3 = this.i;
        switch (b) {
            case 0:
                return new j$.util.stream.p4((java.util.function.Supplier) obj3, (java.util.function.ObjLongConsumer) obj2, (j$.util.stream.t) obj);
            case 1:
                return new j$.util.stream.v4((java.util.function.Supplier) obj3, (java.util.function.ObjDoubleConsumer) obj2, (j$.util.stream.t) obj);
            case 2:
                return new j$.util.stream.x4(obj3, (java.util.function.BiFunction) obj2, (java.util.function.BinaryOperator) obj);
            case 3:
                return new j$.util.stream.b5((java.util.function.Supplier) obj3, (java.util.function.BiConsumer) obj2, (java.util.function.BiConsumer) obj);
            default:
                return new j$.util.stream.f5((java.util.function.Supplier) obj3, (java.util.function.ObjIntConsumer) obj2, (j$.util.stream.t) obj);
        }
    }
}
