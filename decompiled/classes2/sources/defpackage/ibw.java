package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public ibw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.ibw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        java.lang.String str = (java.lang.String) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(5)).booleanValue();
        if (zBooleanValue) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceCallAttributesModel", 45, "CallAttributesProducerModule.java").v("generic conference");
            optionalOf = j$.util.Optional.empty();
        } else if (!optional.isPresent()) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceCallAttributesModel", 50, "CallAttributesProducerModule.java").v("cannot determine fi call is PSTN or VoIP");
            optionalOf = j$.util.Optional.empty();
        } else if (!optional2.isPresent()) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceCallAttributesModel", 55, "CallAttributesProducerModule.java").v("audio mode unknown");
            optionalOf = j$.util.Optional.empty();
        } else if (((defpackage.hwy) optional2.orElseThrow()).equals(defpackage.hwy.b) && !zBooleanValue2) {
            defpackage.ibu.a.b().l("com/android/dialer/audio/impl/tidepods/service/CallAttributesProducerModule", "produceCallAttributesModel", 60, "CallAttributesProducerModule.java").v("fi VoIP call not supported");
            optionalOf = j$.util.Optional.empty();
        } else {
            if (str == null) {
                throw new java.lang.NullPointerException("Null id");
            }
            defpackage.hwy hwyVar = (defpackage.hwy) optional2.orElseThrow();
            if (hwyVar == null) {
                throw new java.lang.NullPointerException("Null audioMode");
            }
            optionalOf = j$.util.Optional.of(new defpackage.hzc(str, hwyVar, zBooleanValue3));
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
