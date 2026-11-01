package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class b extends ajyu {
    public final int a() {
        int iH = h(14);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public final int b() {
        int iH = h(10);
        if (iH != 0) {
            return j(iH);
        }
        return 0;
    }

    public final int c() {
        int iH = h(6);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public final ajyu d() {
        ajyu ajyuVar = new ajyu();
        int iH = h(8);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        ajyuVar.n(iG, byteBuffer);
        return ajyuVar;
    }

    public final ajyu e() {
        ajyu ajyuVar = new ajyu();
        int iH = h(12);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final ajyu f(int i) {
        ajyu ajyuVar = new ajyu();
        int iH = h(10);
        if (iH == 0) {
            return null;
        }
        int iG = g(i(iH) + (i << 2));
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }
}
