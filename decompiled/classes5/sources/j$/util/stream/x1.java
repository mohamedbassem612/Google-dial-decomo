package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class x1 extends j$.util.stream.y1 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(j$.util.stream.a aVar, int i, byte b) {
        super(aVar, i);
        this.m = b;
    }

    @Override // j$.util.stream.a
    public final boolean J() {
        switch (this.m) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.LongStream parallel() {
        switch (this.m) {
            case 0:
                this.a.l = true;
                return this;
            default:
                this.a.l = true;
                return this;
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.LongStream sequential() {
        switch (this.m) {
            case 0:
                this.a.l = false;
                return this;
            default:
                this.a.l = false;
                return this;
        }
    }
}
