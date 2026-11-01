package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pvt implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ pvt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        boolean z = this.a;
        boolean z2 = true;
        if (i == 0) {
            if (!z) {
                return java.lang.Boolean.FALSE;
            }
            if (this.b) {
                return java.lang.Boolean.TRUE;
            }
            return java.lang.Boolean.valueOf(this.c && this.d && this.e);
        }
        if (!z) {
            return java.lang.Boolean.FALSE;
        }
        if (this.b || this.c) {
            return java.lang.Boolean.FALSE;
        }
        if (!this.d && !this.e) {
            z2 = false;
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
