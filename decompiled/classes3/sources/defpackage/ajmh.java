package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajmh {
    public static final ajst a = ajst.b(new byte[0]);

    public static final ajst a(int i) {
        return ajst.b(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final ajst b(int i) {
        return ajst.b(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
