package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fdw extends defpackage.ewu {
    public long h;
    public int i;
    public int j;

    public fdw() {
        super(2);
        this.j = 32;
    }

    @Override // defpackage.ewu, defpackage.ewp
    public final void dJ() {
        super.dJ();
        this.i = 0;
    }

    public final boolean g(defpackage.ewu ewuVar) {
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        ahvr.bM(!ewuVar.dL(1073741824));
        ahvr.bM(!ewuVar.dL(268435456));
        ahvr.bM(!ewuVar.dL(4));
        if (h() && (this.i >= this.j || ((byteBuffer = ewuVar.d) != null && (byteBuffer2 = this.d) != null && byteBuffer2.position() + byteBuffer.remaining() > 3072000))) {
            return false;
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.f = ewuVar.f;
            if (ewuVar.dL(1)) {
                this.a = 1;
            }
        }
        java.nio.ByteBuffer byteBuffer3 = ewuVar.d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = ewuVar.f;
        return true;
    }

    public final boolean h() {
        return this.i > 0;
    }
}
