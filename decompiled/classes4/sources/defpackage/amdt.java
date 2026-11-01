package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amdt implements java.util.function.ToIntFunction {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object obj) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ((java.lang.String) obj).length() : ((java.lang.String) obj).length();
        }
        return ((java.lang.String) obj).length();
    }
}
