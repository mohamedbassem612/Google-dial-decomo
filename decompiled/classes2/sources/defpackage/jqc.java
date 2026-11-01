package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqc extends amzm {
    private final amzg b;

    public jqc(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jqc.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optionalOfNullable, "dialerPhoneNumber");
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(12), 17);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.l((aonj) hvdVar.a, optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        java.lang.String strConcat = (java.lang.String) aooh.p(optionalOfNullable, "");
        if (android.text.TextUtils.isEmpty(strConcat)) {
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            java.util.Objects.toString(uuidRandomUUID);
            strConcat = "private-".concat(java.lang.String.valueOf(uuidRandomUUID));
        } else {
            aooh.c(strConcat);
        }
        return aiql.z(strConcat);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
