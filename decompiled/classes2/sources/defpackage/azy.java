package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class azy extends cmv implements dcz {
    private final /* synthetic */ int $cid;
    public java.lang.Object a;

    public azy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [cmi, java.lang.Object] */
    public final /* synthetic */ java.lang.Object cW(dpf dpfVar, java.lang.Object obj) {
        azg azgVar;
        if (this.$cid != 0) {
            azgVar = obj instanceof azg ? (azg) obj : null;
            if (azgVar == null) {
                azgVar = new azg((byte[]) null);
            }
            azgVar.c = new defpackage.axc(this.a);
        } else {
            azgVar = obj instanceof azg ? (azg) obj : null;
            if (azgVar == null) {
                azgVar = new azg((byte[]) null);
            }
            azgVar.c = new defpackage.axd((cmn) this.a);
        }
        return azgVar;
    }
}
