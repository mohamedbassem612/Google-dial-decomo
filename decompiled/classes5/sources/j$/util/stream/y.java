package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y extends j$.util.stream.x1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(j$.util.stream.a aVar, int i, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        j$.util.stream.f6 wVar;
        switch (this.n) {
            case 0:
                wVar = new j$.util.stream.w(f6Var, (byte) 1);
                break;
            case 1:
                wVar = new j$.util.stream.n1(f6Var, (byte) 0);
                break;
            case 2:
                wVar = new j$.util.stream.n1(f6Var, (byte) 2);
                break;
            case 3:
                wVar = new j$.util.stream.u1(f6Var, (byte) 1);
                break;
            case 4:
                return f6Var;
            default:
                wVar = new j$.util.stream.u1(f6Var, (byte) 4);
                break;
        }
        return wVar;
    }
}
