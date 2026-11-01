package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uld extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public uld(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new defpackage.amzw(defpackage.uld.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(6)).booleanValue();
        defpackage.zmy zmyVar = (defpackage.zmy) list.get(7);
        defpackage.uji ujiVar = (defpackage.uji) list.get(8);
        aooh.f(optionalOfNullable, "rawNumber");
        aooh.f(optional, "wasMarkedAsSpamByUserDuringCallScreen");
        aooh.f(zmyVar, "callDirection");
        aooh.f(ujiVar, "spamCallHistoryStatus");
        if (zBooleanValue) {
            defpackage.taj tajVar = new defpackage.taj(new defpackage.skk(20), 6);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(a.k((aonj) tajVar.a, optionalOfNullable.get()));
            }
            aooh.e(optionalOfNullable, "map(...)");
            if (((java.lang.Boolean) aooh.p(optionalOfNullable, java.lang.Boolean.TRUE)).booleanValue()) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 78, "SpamProducerModule.kt").v("Empty rawNumber");
            } else if (zmyVar != defpackage.zmy.a) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 83, "SpamProducerModule.kt").v("Not an incoming call");
            } else if (!zBooleanValue2) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 88, "SpamProducerModule.kt").v("Duration less or equals to zero");
            } else if (zBooleanValue5) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 93, "SpamProducerModule.kt").v("Number found in lookup");
            } else if (aooh.n(ujiVar, defpackage.ujf.a)) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 98, "SpamProducerModule.kt").v("Present in call history");
            } else if (ujiVar instanceof defpackage.ujh) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 106, "SpamProducerModule.kt").y("history status unknown: %s", ((defpackage.ujh) ujiVar).a);
            } else if (!zBooleanValue3) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 111, "SpamProducerModule.kt").v("Call not hanged up");
            } else if (!zBooleanValue4) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 116, "SpamProducerModule.kt").v("Can't block number");
            } else if (((java.lang.Boolean) aooh.p(optional, java.lang.Boolean.FALSE)).booleanValue()) {
                defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 121, "SpamProducerModule.kt").v("Spam marked as spam");
            } else {
                z = true;
            }
        } else {
            defpackage.ukx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spamnotification/impl/service/SpamProducerModule", "produceShouldShowAfterCallSpamNotification", 73, "SpamProducerModule.kt").v("Spam notification disabled");
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
