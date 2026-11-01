package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzl {
    public final java.lang.String a;
    public final java.nio.ByteBuffer b;

    public ajzl(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.a = str;
        this.b = byteBuffer;
    }

    public final java.lang.String toString() {
        java.nio.ByteBuffer byteBuffer = this.b;
        return super.toString() + ": contentType=" + this.a + ", data=" + java.lang.String.valueOf(byteBuffer);
    }
}
