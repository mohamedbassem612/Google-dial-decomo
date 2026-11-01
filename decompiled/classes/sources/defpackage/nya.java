package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nya implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nya(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v73, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v76, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v77, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        defpackage.ajcq ajcmVar;
        int i = 10;
        int i2 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                return ((defpackage.nwu) ((defpackage.aogc) this.a).c.a()).f();
            case 1:
                j$.util.Optional optional = ((defpackage.lkk) this.a).b;
                optional.isPresent();
                return ((defpackage.lkr) optional.orElseThrow()).e();
            case 2:
                java.lang.Object obj = this.a;
                return ((defpackage.soj) obj).c.schedule(new defpackage.guy(obj, 9), 200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            case 3:
                this.a.run();
                return defpackage.ajcm.a;
            case 4:
                android.content.Context context = (android.content.Context) ((defpackage.adae) ((defpackage.acwj) this.a).i.b()).a;
                java.lang.String strConcat = context.getPackageName().equals("com.google.android.gms") ? "com.google.android.gms.icing.mdd" : "com.google.android.gms.icing.mdd#".concat(java.lang.String.valueOf(context.getPackageName()));
                defpackage.acxg acxgVar = defpackage.aasr.a;
                return defpackage.aazc.e(new defpackage.aata(context).q(strConcat));
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.adqe.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessageFileManagerImpl", "asyncInit", 96, "AudioMessageFileManagerImpl.java")).v("asyncInit(): starting to initialize AudioMessageFileManagerImpl");
                java.lang.Object obj2 = this.a;
                defpackage.adqe adqeVar = (defpackage.adqe) obj2;
                java.lang.String str = adqeVar.e.d;
                android.content.Context context2 = adqeVar.b;
                adqeVar.g = new defpackage.adqj(context2, str);
                adqeVar.h = new defpackage.adqk(context2, adqeVar.e.e);
                defpackage.ajck ajckVarW = defpackage.ajck.w(adqeVar.c.b(adqeVar.d));
                if (adqeVar.e.f) {
                    ajckVarW = ajckVarW.y(new defpackage.vmn(obj2, 18), adqeVar.d);
                }
                return ajckVarW.x(new defpackage.vut(obj2, i), adqeVar.d);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aero aeroVar = (defpackage.aero) this.a;
                return (!aeroVar.m() || aeroVar.c.getAndSet(true)) ? defpackage.ajcm.a : aeroVar.p(6, (defpackage.aerg) aeroVar.b.a(), ((defpackage.aeri) aeroVar.e.a()).f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aero aeroVar2 = (defpackage.aero) this.a;
                if (aeroVar2.m()) {
                    defpackage.ahbv ahbvVar = aeroVar2.f;
                    if (((java.util.concurrent.atomic.AtomicBoolean) ahbvVar.d).getAndSet(false)) {
                        defpackage.aiql.E(new adbi(ahbvVar, 4), ahbvVar.a);
                    } else {
                        defpackage.ajcq ajcqVar = defpackage.ajcm.a;
                    }
                }
                return defpackage.ajcm.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj3 = this.a;
                return defpackage.abyl.d(((defpackage.aerx) obj3).b, new defpackage.aetv(obj3, i2));
            case 9:
                return defpackage.ajcm.a;
            case 10:
                java.lang.Object obj4 = this.a;
                defpackage.afgx afgxVar = (defpackage.afgx) obj4;
                return defpackage.ajan.f(defpackage.aiql.A(afgxVar.b), new defpackage.jtv(afgxVar.j, new defpackage.abqg(obj4, 15), 17), defpackage.ajbm.INSTANCE);
            case 11:
                java.lang.Object obj5 = this.a;
                defpackage.afgx afgxVar2 = (defpackage.afgx) obj5;
                android.net.Uri uri = (android.net.Uri) defpackage.aiql.H(afgxVar2.b);
                try {
                    return defpackage.aiql.z(((defpackage.afgx) obj5).i(uri));
                } catch (java.io.IOException e) {
                    defpackage.ahyn ahynVar = afgxVar2.d;
                    if (!ahynVar.f()) {
                        return defpackage.aiql.y(e);
                    }
                    if (defpackage.afgx.e(e)) {
                        return defpackage.aiql.y(e);
                    }
                    java.lang.Object objB = ahynVar.b();
                    defpackage.ajwr ajwrVar = afgxVar2.l;
                    defpackage.ajas ajasVarB = defpackage.ahqx.b(new adck(obj5, objB, 5));
                    java.util.concurrent.Executor executor = afgxVar2.c;
                    return defpackage.ajan.g(ajwrVar.e(ajasVarB, executor), defpackage.ahqx.c(new adot(obj5, uri, 10, (byte[]) null)), executor);
                }
            case 12:
                java.lang.Object obj6 = this.a;
                defpackage.afgz afgzVar = new defpackage.afgz(obj6, i3);
                long j = defpackage.ahqx.a;
                defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), afgzVar, 1);
                defpackage.afhc afhcVar = (defpackage.afhc) obj6;
                java.util.concurrent.Executor executor2 = afhcVar.b;
                int i4 = defpackage.ajan.c;
                defpackage.ajcq ajcqVar2 = afhcVar.a;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar2, ajaxVar);
                ajcqVar2.c(ajalVar, defpackage.aiql.t(executor2, ajalVar));
                return defpackage.aiql.A(ajalVar);
            case 13:
                java.lang.Object obj7 = this.a;
                defpackage.afhc afhcVar2 = (defpackage.afhc) obj7;
                defpackage.ajcq ajcqVar3 = afhcVar2.a;
                defpackage.ahvr.cc(ajcqVar3.isDone(), "Future was expected to be done: %s", ajcqVar3);
                try {
                    java.lang.Object objB2 = ((defpackage.afhc) obj7).b((android.net.Uri) defpackage.a.h(ajcqVar3));
                    return objB2 == null ? defpackage.ajcm.a : new defpackage.ajcm(objB2);
                } catch (java.io.IOException e2) {
                    defpackage.afge afhbVar = new afhb(afhcVar2);
                    defpackage.ahyn ahynVar2 = afhcVar2.c;
                    if (!ahynVar2.f()) {
                        return new defpackage.ajdd(e2);
                    }
                    if ((e2 instanceof afeo) || (e2.getCause() instanceof afeo)) {
                        return new defpackage.ajdd(e2);
                    }
                    defpackage.ajcq ajcqVarA = ((defpackage.afgd) ahynVar2.b()).a(e2, afhbVar);
                    defpackage.adfd adfdVar = new defpackage.adfd(obj7, 20);
                    long j2 = defpackage.ahqx.a;
                    defpackage.ajax ajaxVar2 = new defpackage.ajax(defpackage.ahns.c(false), adfdVar, 1);
                    java.util.concurrent.Executor executor3 = afhcVar2.b;
                    int i5 = defpackage.ajan.c;
                    defpackage.ajal ajalVar2 = new defpackage.ajal(ajcqVarA, ajaxVar2);
                    ajcqVarA.c(ajalVar2, defpackage.aiql.t(executor3, ajalVar2));
                    ajcmVar = ajalVar2;
                }
                break;
            case 14:
                return this.a;
            case 15:
                ajcmVar = new defpackage.ajcm(this.a);
                break;
            case 16:
                return this.a;
            case 17:
                return ((defpackage.ajas) this.a.a()).a();
            case 18:
                return defpackage.aiql.v(this.a);
            case 19:
                return ((defpackage.ahce) this.a).p.a();
            default:
                defpackage.ajcq ajcqVarB = ((defpackage.ahct) this.a).b();
                defpackage.agsm.i(1365, ajcqVarB, "Failed to update StorageInfos after registration", new java.lang.Object[0]);
                return ajcqVarB;
        }
        return ajcmVar;
    }
}
