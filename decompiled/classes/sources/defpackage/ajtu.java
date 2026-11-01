package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajtu implements defpackage.ajwe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ajtu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ajwe
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return defpackage.ajsz.o((java.lang.String) this.a);
        }
        java.lang.Object obj = defpackage.ajwh.a;
        return new ajwq((defpackage.ajtc) this.a);
    }
}
