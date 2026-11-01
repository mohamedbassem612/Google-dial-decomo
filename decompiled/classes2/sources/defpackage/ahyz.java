package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ahyz implements ahze {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahyz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.util.Iterator a(ahzf ahzfVar, java.lang.CharSequence charSequence) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new defpackage.ahzb(ahzfVar, charSequence, (java.lang.String) obj) : new defpackage.ahzc(ahzfVar, charSequence, ((defpackage.ahxo) obj).a(charSequence));
    }
}
