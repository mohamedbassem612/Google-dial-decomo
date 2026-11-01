package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbw extends amzm {
    private final amzg b;

    public rbw(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbw.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.pzp) optionalOfNullable.get()).equals(defpackage.pzp.VOICE_SCREEN)));
        }
        java.lang.Boolean bool = (java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE);
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
