package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ibv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.ibv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(1);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(2);
        if (optional3.isPresent() && ((java.lang.Boolean) optional3.orElseThrow()).booleanValue()) {
            optionalOf = j$.util.Optional.of(defpackage.hwy.e);
        } else if (!optional.isPresent()) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceAudioMode", 81, "CallAttributesProducerModule.java").v("isCarrierServicesVoipCall unknown");
            optionalOf = j$.util.Optional.empty();
        } else if (optional2.isPresent() && ((java.lang.Boolean) optional2.orElseThrow()).booleanValue()) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceAudioMode", 85, "CallAttributesProducerModule.java").v("some form of CallScreen");
            optionalOf = j$.util.Optional.of(((java.lang.Boolean) optional.orElseThrow()).booleanValue() ? defpackage.hwy.d : defpackage.hwy.c);
        } else {
            optionalOf = j$.util.Optional.of(((java.lang.Boolean) optional.orElseThrow()).booleanValue() ? defpackage.hwy.b : defpackage.hwy.a);
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
