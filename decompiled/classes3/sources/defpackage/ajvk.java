package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajvk implements defpackage.ajvc {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ajuz
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            throw new defpackage.ajva("Couldn't find encoder for type ".concat(java.lang.String.valueOf(obj.getClass().getCanonicalName())));
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        defpackage.ajvj ajvjVar = (defpackage.ajvj) obj2;
        ajvjVar.c(defpackage.ajvj.a, entry.getKey(), true);
        ajvjVar.c(defpackage.ajvj.b, entry.getValue(), true);
    }
}
