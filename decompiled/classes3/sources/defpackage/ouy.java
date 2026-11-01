package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ouy extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public ouy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.ouy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final zpm zpmVar = (zpm) list.get(1);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final java.lang.String str = (java.lang.String) list.get(5);
        final j$.util.Optional optional = (j$.util.Optional) list.get(6);
        final ajct ajctVar = (ajct) list.get(7);
        return aiql.z(defpackage.uyg.J(new ajas() { // from class: ouv
            public final ajcq a() {
                final zpm zpmVar2 = zpmVar;
                final boolean z = zBooleanValue;
                final boolean z2 = zBooleanValue2;
                final boolean z3 = zBooleanValue3;
                final j$.util.Optional optional2 = optional;
                final java.lang.String str2 = str;
                final android.content.Context context2 = context;
                return ahvr.F(new java.util.concurrent.Callable() { // from class: ouw
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        zpm zpmVar3 = zpmVar2;
                        if (zpmVar3.a().size() == 1) {
                            defpackage.oux.a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseProducerModule", "produceAnswerAndReleaseChip", 47, "AnswerAndReleaseProducerModule.java").v("only one call exists");
                            return j$.util.Optional.empty();
                        }
                        if (zpmVar3.b(defpackage.zpo.f).g().isEmpty()) {
                            defpackage.oux.a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseProducerModule", "produceAnswerAndReleaseChip", 51, "AnswerAndReleaseProducerModule.java").v("no active calls");
                            return j$.util.Optional.empty();
                        }
                        if (z) {
                            defpackage.oux.a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseProducerModule", "produceAnswerAndReleaseChip", 55, "AnswerAndReleaseProducerModule.java").v("CDMA not supported");
                            return j$.util.Optional.empty();
                        }
                        if (z2 || z3) {
                            defpackage.oux.a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseProducerModule", "produceAnswerAndReleaseChip", 59, "AnswerAndReleaseProducerModule.java").v("video call");
                            return j$.util.Optional.empty();
                        }
                        if (optional2.isPresent()) {
                            defpackage.oux.a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseProducerModule", "produceAnswerAndReleaseChip", 65, "AnswerAndReleaseProducerModule.java").v("incoming call will disconnect foreground call; hiding answer and release chip");
                            return j$.util.Optional.empty();
                        }
                        android.content.Context context3 = context2;
                        java.lang.String str3 = str2;
                        defpackage.oug ougVarA = defpackage.oui.a();
                        ougVarA.f(defpackage.ouj.ANSWER_AND_END_ONGOING_CALL);
                        ougVarA.d(2131231060);
                        ougVarA.e(str3);
                        ougVarA.h(false);
                        ougVarA.g(j$.util.Optional.of(java.lang.Integer.valueOf(context3.getColor(2131099713))));
                        return j$.util.Optional.of(ougVarA.a());
                    }
                }, ajctVar);
            }
        }));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
