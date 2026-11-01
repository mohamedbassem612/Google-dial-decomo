package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fkn extends defpackage.ewz {
    private final defpackage.ewu k;
    private final defpackage.etx l;
    private long m;
    private defpackage.exz n;

    public fkn() {
        super(6);
        this.k = new defpackage.ewu(1);
        this.l = new defpackage.etx();
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ezf
    public final void V(long j, long j2) {
        while (!J() && this.m < 100000 + j) {
            defpackage.ewu ewuVar = this.k;
            ewuVar.dJ();
            if (S(T(), ewuVar, 0) != -4 || ewuVar.dL(4)) {
                return;
            }
            long j3 = ewuVar.f;
            this.m = j3;
            long j4 = this.e;
            if (this.n != null && j3 >= j4) {
                ewuVar.e();
                java.nio.ByteBuffer byteBuffer = ewuVar.d;
                java.lang.String str = eum.a;
                if (byteBuffer.remaining() == 16) {
                    defpackage.etx etxVar = this.l;
                    etxVar.O(byteBuffer.array(), byteBuffer.limit());
                    etxVar.Q(byteBuffer.arrayOffset() + 4);
                    float[] fArr = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr[i] = java.lang.Float.intBitsToFloat(etxVar.j());
                    }
                }
            }
        }
    }

    @Override // defpackage.ezf
    public final boolean W() {
        return J();
    }

    @Override // defpackage.ezf
    public final boolean X() {
        return true;
    }

    @Override // defpackage.ezg
    public final int Y(defpackage.eqg eqgVar) {
        return "application/x-camera-motion".equals(eqgVar.p) ? 132 : 128;
    }

    @Override // defpackage.ewz, defpackage.ezc
    public final void p(int i, java.lang.Object obj) {
        if (i == 8) {
            this.n = (defpackage.exz) obj;
        }
    }

    @Override // defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) {
        this.m = Long.MIN_VALUE;
    }

    @Override // defpackage.ewz
    protected final void s() {
    }
}
