package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u4 extends j$.util.stream.n4 {
    public final /* synthetic */ byte h;

    public /* synthetic */ u4(byte b) {
        this.h = b;
    }

    @Override // j$.util.stream.n4
    public final j$.util.stream.i5 Q() {
        switch (this.h) {
            case 0:
                return new j$.util.stream.m5();
            case 1:
                return new j$.util.stream.k5();
            case 2:
                return new j$.util.stream.n5();
            default:
                return new j$.util.stream.l5();
        }
    }

    @Override // j$.util.stream.n4, j$.util.stream.j9
    public final java.lang.Object a(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.a(aVar, spliterator);
            case 1:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.a(aVar, spliterator);
            case 2:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.a(aVar, spliterator);
            default:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.a(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.n4, j$.util.stream.j9
    public final java.lang.Object b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(aVar, spliterator);
            case 1:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(aVar, spliterator);
            case 2:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(aVar, spliterator);
            default:
                return j$.util.stream.v7.SIZED.p(aVar.f) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.n4, j$.util.stream.j9
    public final int c() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return j$.util.stream.v7.r;
    }
}
