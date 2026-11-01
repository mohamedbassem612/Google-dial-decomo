package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aofr implements defpackage.aodv {
    private final /* synthetic */ int $cid;

    public aofr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aodv
    public final defpackage.aodu a(int i) {
        if (this.$cid != 0) {
            return new defpackage.anum(java.nio.ByteBuffer.allocateDirect(java.lang.Math.min(1048576, i)));
        }
        return new defpackage.aofq(new apoy(), java.lang.Math.min(1048576, ((i + 8191) / 8192) << 13));
    }
}
