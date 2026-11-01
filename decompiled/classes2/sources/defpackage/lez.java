package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lez implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.lang.Object i;

    public /* synthetic */ lez(ajcq ajcqVar, qbe qbeVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, ajcq ajcqVar5, defpackage.ley leyVar, defpackage.lee leeVar, android.content.Context context, int i) {
        this.$cid = i;
        this.a = ajcqVar;
        this.i = qbeVar;
        this.b = ajcqVar2;
        this.c = ajcqVar3;
        this.d = ajcqVar4;
        this.e = ajcqVar5;
        this.f = leyVar;
        this.g = leeVar;
        this.h = context;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v2, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [amzg, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (this.$cid != 0) {
            if (aiql.H(this.i.d()) != zpo.d || ((java.lang.Boolean) aiql.H(this.a.d())).booleanValue()) {
                return defpackage.lel.a;
            }
            java.lang.Object obj = this.f;
            j$.util.Optional optional = (j$.util.Optional) aiql.H(this.b.d());
            if (!optional.isPresent() || !((adnm) optional.orElseThrow()).e(adoa.a)) {
                ((qbe) obj).c(qbc.B);
                return defpackage.lel.a;
            }
            if (!((java.lang.Boolean) aiql.H(this.c.d())).booleanValue()) {
                ((qbe) obj).c(qbc.C);
                defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallScreenActionButtonType", 284, "CallScreenProducerModule.java").v("Call screen audio not downloaded.");
                return defpackage.lel.a;
            }
            if (!((java.lang.Boolean) aiql.H(this.d.d())).booleanValue()) {
                defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallScreenActionButtonType", 289, "CallScreenProducerModule.java").v("Failed to load disclosure or resume screening audio.");
                ((qbe) obj).c(qbc.F);
                return defpackage.lel.a;
            }
            if (!((java.lang.Boolean) aiql.H(this.e.d())).booleanValue()) {
                ((qbe) obj).c(qbc.D);
                return defpackage.lel.a;
            }
            if (!((defpackage.ley) this.g).a()) {
                ((qbe) obj).c(qbc.E);
                return defpackage.lel.a;
            }
            agsm.i(275, ((defpackage.lee) this.h).a(), "failed to update the timestamp of call screen button shown", new java.lang.Object[0]);
            ((qbe) obj).c(qbc.s);
            return defpackage.lel.b;
        }
        j$.util.Optional optional2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
        boolean zIsPresent = optional2.isPresent();
        java.lang.Object obj2 = this.i;
        if (!zIsPresent || !((adnm) optional2.orElseThrow()).e(adoa.a)) {
            ((qbe) obj2).c(qbc.w);
            return j$.util.Optional.empty();
        }
        if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
            ((qbe) obj2).c(qbc.x);
            return j$.util.Optional.empty();
        }
        if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()) {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallScreenChip", 176, "CallScreenProducerModule.java").v("Failed to loaded disclosure or resume screening audio.");
            return j$.util.Optional.empty();
        }
        if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.d)).booleanValue()) {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallScreenChip", 181, "CallScreenProducerModule.java").v("Call not eligible for CallScreen.");
            ((qbe) obj2).c(qbc.y);
            return j$.util.Optional.empty();
        }
        if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.e)).booleanValue()) {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallScreenChip", 188, "CallScreenProducerModule.java").v("Revelio is active");
            ((qbe) obj2).c(qbc.z);
            return j$.util.Optional.empty();
        }
        if (!((defpackage.ley) this.f).a()) {
            ((qbe) obj2).c(qbc.A);
            return j$.util.Optional.empty();
        }
        java.lang.Object obj3 = this.h;
        agsm.i(276, ((defpackage.lee) this.g).a(), "failed to update the timestamp of call screen button shown", new java.lang.Object[0]);
        ((qbe) obj2).c(qbc.r);
        oug ougVarA = oui.a();
        ougVarA.f(ouj.h);
        ougVarA.d(2131231550);
        ougVarA.h(false);
        ougVarA.e(((android.content.Context) obj3).getString(2132017811));
        ougVarA.b(j$.util.Optional.of("callscreen_default_manual_screen_chip"));
        return j$.util.Optional.of(ougVarA.a());
    }

    public /* synthetic */ lez(amzg amzgVar, amzg amzgVar2, amzg amzgVar3, qbe qbeVar, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, defpackage.ley leyVar, defpackage.lee leeVar, int i) {
        this.$cid = i;
        this.i = amzgVar;
        this.a = amzgVar2;
        this.b = amzgVar3;
        this.f = qbeVar;
        this.c = amzgVar4;
        this.d = amzgVar5;
        this.e = amzgVar6;
        this.g = leyVar;
        this.h = leeVar;
    }
}
