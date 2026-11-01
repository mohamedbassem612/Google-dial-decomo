package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qkr implements java.util.function.ToIntFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aonj a;

    public /* synthetic */ qkr(aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((java.lang.Number) this.a.a(obj)).intValue();
        }
        aonj aonjVar = this.a;
        return i != 1 ? ((java.lang.Number) aonjVar.a(obj)).intValue() : ((java.lang.Number) aonjVar.a(obj)).intValue();
    }
}
