package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlo extends amzm {
    private final amzg b;

    public qlo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String str;
        defpackage.qix qixVar = (defpackage.qix) obj;
        aooh.f(qixVar, "notificationType");
        int iOrdinal = qixVar.ordinal();
        if (iOrdinal == 1) {
            str = "phone_ongoing_call";
        } else if (iOrdinal == 2) {
            str = "phone_incoming_call";
        } else if (iOrdinal != 3) {
            str = null;
        } else {
            str = "phone_ongoing_call";
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(str);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
