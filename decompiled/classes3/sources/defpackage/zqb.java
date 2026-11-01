package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zqb implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zqb(boolean z, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            return java.lang.Boolean.valueOf(z && this.b);
        }
        return java.lang.Boolean.valueOf(z && !this.b);
    }
}
