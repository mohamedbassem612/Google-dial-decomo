package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibx extends amzm {
    private final amzg b;

    public ibx(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.ibx.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        if (((defpackage.icx) obj).a()) {
            z = true;
        } else {
            a.bI(defpackage.ibu.a.c().m(aioa.b), "missing audio system API interfaces", "com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceIsVoipSupported", 'd', "CallAttributesProducerModule.java", zct.b);
            z = false;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
