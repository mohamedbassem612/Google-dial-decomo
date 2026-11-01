package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxq implements defpackage.xxk {
    private final /* synthetic */ int $cid;

    public xxq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xxk
    public final /* synthetic */ int a(java.lang.Object obj) {
        return this.$cid != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // defpackage.xxk
    public final int b() {
        return this.$cid != 0 ? 1 : 4;
    }

    @Override // defpackage.xxk
    public final /* synthetic */ java.lang.Object c(int i) {
        return this.$cid != 0 ? new byte[i] : new int[i];
    }

    @Override // defpackage.xxk
    public final java.lang.String d() {
        return this.$cid != 0 ? "ByteArrayPool" : "IntegerArrayPool";
    }
}
