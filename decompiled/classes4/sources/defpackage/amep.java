package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amep implements java.util.function.IntFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.util.List b;

    public /* synthetic */ amep(java.lang.Object obj, java.util.List list, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        if (this.$cid == 0) {
            return java.lang.Boolean.valueOf(((java.lang.String) ((aify) this.a).get(i)).equals(this.b.get(i)));
        }
        int iAN = a.aN(((defpackage.alqo) this.b.get(i)).e);
        int i2 = 1;
        if (iAN == 0) {
            iAN = 1;
        }
        if (i == 0) {
            if (iAN != 2) {
                i2 = 0;
            }
        } else if (iAN != 1) {
            int i3 = iAN - 1;
            int i4 = ((defpackage.alty) this.a).c;
            if (i4 == 0) {
                throw null;
            }
            if (i3 > i4 - 1) {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return java.lang.Integer.valueOf(i2);
    }
}
