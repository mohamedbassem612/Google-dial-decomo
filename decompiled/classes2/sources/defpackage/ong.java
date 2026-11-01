package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ong extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ong(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.ong.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.omy omyVarA;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        zmy zmyVar = (zmy) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        if (optional.isPresent()) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            int iOrdinal = ((defpackage.aayy) optional.orElseThrow()).ordinal();
            if (iOrdinal == 2) {
                int iOrdinal2 = zmyVar.ordinal();
                if (iOrdinal2 == 0) {
                    optionalEmpty = j$.util.Optional.of(context.getText(2132018734));
                } else if (iOrdinal2 == 2) {
                    defpackage.onf.a.c().m(aioa.b).l("com/android/dialer/fides/impl/FidesInCallProducerModule", "produceContactGridInfo", 61, "FidesInCallProducerModule.java").w("Unknown call direction, fides call state %d", ((defpackage.aayy) optional.orElseThrow()).h);
                }
            } else if (iOrdinal == 3) {
                optionalEmpty = j$.util.Optional.of(context.getText(2132018732));
            } else if (iOrdinal == 5) {
                int iOrdinal3 = zmyVar.ordinal();
                if (iOrdinal3 == 0) {
                    defpackage.onf.a.c().m(aioa.b).l("com/android/dialer/fides/impl/FidesInCallProducerModule", "produceContactGridInfo", 78, "FidesInCallProducerModule.java").G("Unexpected call direction %s with fides call state %d", zmyVar, ((defpackage.aayy) optional.orElseThrow()).h);
                } else if (iOrdinal3 == 1) {
                    optionalEmpty = j$.util.Optional.of(context.getText(2132018735));
                } else if (iOrdinal3 == 2) {
                    defpackage.onf.a.c().m(aioa.b).l("com/android/dialer/fides/impl/FidesInCallProducerModule", "produceContactGridInfo", 78, "FidesInCallProducerModule.java").G("Unexpected call direction %s with fides call state %d", zmyVar, ((defpackage.aayy) optional.orElseThrow()).h);
                }
            }
            if (!optionalEmpty.isPresent() || android.text.TextUtils.isEmpty((java.lang.CharSequence) optionalEmpty.orElseThrow())) {
                omyVarA = defpackage.omy.a();
            } else {
                otm otmVar = new otm((byte[]) null);
                otmVar.b = j$.util.Optional.of((java.lang.CharSequence) optionalEmpty.orElseThrow());
                int iOrdinal4 = ((defpackage.aayy) optional.orElseThrow()).ordinal();
                if (iOrdinal4 != 2) {
                    if (iOrdinal4 == 3 || iOrdinal4 == 5) {
                        otmVar.d();
                    }
                } else if (zmyVar.ordinal() == 0) {
                    otmVar.d();
                }
                omyVarA = otmVar.c();
            }
        } else {
            omyVarA = defpackage.omy.a();
        }
        return aiql.z(omyVarA);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
