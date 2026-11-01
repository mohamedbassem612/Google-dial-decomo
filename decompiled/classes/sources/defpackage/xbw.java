package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class xbw implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public xbw(defpackage.acld acldVar, int i) {
        this.$cid = i;
        this.a = acldVar;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v73, types: [ajas, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                xbx xbxVar = (xbx) obj;
                xbxVar.m = j$.util.Optional.empty();
                xbxVar.j.set(false);
                if (!xbxVar.l.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) xbx.a.b()).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "stopReadingCallAudio", 229, "HoldForMeCallAudioReader.java")).v("already stopped reading call audio");
                    return defpackage.ajcm.a;
                }
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g((defpackage.ajcq) xbxVar.l.orElseThrow());
                xbh xbhVar = new xbh(obj, 8);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                return ahrvVarG.h(xbhVar, ajbmVar).e(java.lang.Throwable.class, new xbh(obj, 9), ajbmVar);
            case 1:
                java.lang.Object obj2 = this.a;
                xbx xbxVar2 = (xbx) obj2;
                if (!xbxVar2.m.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) xbx.a.b()).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "start", 129, "HoldForMeCallAudioReader.java")).v("start streaming audio for the first time or after the audio flow is stopped");
                    xbxVar2.m = j$.util.Optional.of(xbxVar2.a());
                    return (defpackage.ajcq) xbxVar2.m.orElseThrow();
                }
                ((defpackage.aimw) ((defpackage.aimw) xbx.a.b()).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "start", 135, "HoldForMeCallAudioReader.java")).v("already attempted to start streaming audio, checking status");
                defpackage.ahrv ahrvVarG2 = defpackage.ahrv.g((defpackage.ajcq) xbxVar2.m.orElseThrow());
                xbv xbvVar = new xbv(obj2, 0);
                defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                return ahrvVarG2.i(xbvVar, ajbmVar2).f(java.lang.Throwable.class, new xbv(obj2, 2), ajbmVar2);
            case 2:
                return ((xca) this.a).a(true);
            case 3:
                return ((xca) this.a).a(false);
            case 4:
                xcq xcqVar = (xcq) this.a;
                j$.util.Optional optional = (j$.util.Optional) xcqVar.h.get();
                ((defpackage.aimw) ((defpackage.aimw) xcq.a.b()).l("com/android/incallui/atlas/ui/impl/tidepods/session/AtlasSessionController", "fixActivationError", 209, "AtlasSessionController.java")).y("AtlasActivationError: %s", optional);
                xco xcoVar = (xco) optional.orElse((java.lang.Object) null);
                if (xcoVar == null) {
                    return defpackage.ajcm.a;
                }
                int iOrdinal = xcoVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return xcqVar.j.l();
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            return xcqVar.g.b(zmw.a);
                        }
                        if (iOrdinal != 4) {
                            throw new java.lang.RuntimeException(null, null);
                        }
                        xcqVar.i.set(java.lang.Boolean.TRUE);
                        xcqVar.g(alex.l);
                        return defpackage.ajcm.a;
                    }
                }
                throw new java.lang.AssertionError("unable to fix ".concat(java.lang.String.valueOf(xcoVar.name())));
            case 5:
                java.lang.Object obj3 = this.a;
                xcy xcyVar = (xcy) obj3;
                xcyVar.q.i(xcy.b);
                wys wysVar = xcyVar.d;
                long j = xcyVar.r;
                defpackage.agsm.i(1142, defpackage.ahvr.F(new jww(wysVar, j, 15), wysVar.c), "failed to attach to session for call %d", java.lang.Long.valueOf(j));
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                xbe xbeVar = xcyVar.m;
                defpackage.agsm.i(1152, xbeVar.h.d(defpackage.ahqx.i(new jww(xbeVar, epochMilli, 20)), xbeVar.d), "failed to record off hold detection activation time", new java.lang.Object[0]);
                xcyVar.e.b(j, alex.p);
                android.content.Context context = xcyVar.g;
                if (android.provider.Settings.Secure.getInt(context.getContentResolver(), "incall_power_button_behavior", 1) == 2) {
                    xcyVar.C = android.provider.Settings.Secure.putInt(context.getContentResolver(), "incall_power_button_behavior", 1);
                }
                defpackage.ahrv ahrvVarG3 = defpackage.ahrv.g(((afpl) xcyVar.s.a()).X());
                qgk qgkVar = new qgk(19);
                defpackage.ajct ajctVar = xcyVar.p;
                ahrvVarG3.i(qgkVar, ajctVar).k(new uwo(xcyVar, 4), ajctVar);
                xdh xdhVar = xcyVar.o;
                defpackage.akzx akzxVarM = wya.a.m();
                wxq wxqVar = wxq.a;
                akzxVarM.u();
                wya wyaVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(wxqVar);
                wyaVar.d = wxqVar;
                wyaVar.c = 4;
                akzxVarM.u();
                wya wyaVar2 = akzxVarM.b;
                wyaVar2.b |= 1;
                wyaVar2.e = j;
                return defpackage.ahrv.g(xdhVar.b(akzxVarM.r())).i(new xcv(obj3, 5), ajctVar).i(new xcv(obj3, 6), ajctVar).i(new xcv(obj3, 7), ajctVar).i(new xbv(obj3, 4), ajctVar).i(new xbv(obj3, 5), ajctVar).i(new xbv(obj3, 6), ajctVar).i(new xbv(obj3, 7), ajctVar).i(new xbv(obj3, 8), ajctVar).h(new xbh(obj3, 15), ajctVar).f(java.lang.Throwable.class, new xbv(obj3, 9), ajctVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.a.d();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.a.d();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return this.a.d();
            case 9:
                return this.a.d();
            case 10:
                return this.a.d();
            case 11:
                return this.a.d();
            case 12:
                return this.a.d();
            case 13:
                return this.a.d();
            case 14:
                return this.a.d();
            case 15:
                return defpackage.aiql.z((j$.util.Optional) this.a.call());
            case 16:
                ?? r0 = this.a;
                int i = defpackage.abyl.a;
                return defpackage.aiql.D(r0, defpackage.ajbm.INSTANCE);
            case 17:
                return ((defpackage.acld) this.a).a();
            case 18:
                int i2 = defpackage.adbe.a;
                java.lang.Object obj4 = this.a;
                defpackage.aczk aczkVar = (defpackage.aczk) obj4;
                adcs adcsVarE = adcs.e(aczkVar.e());
                acyq acyqVar = new acyq(obj4, 20);
                java.util.concurrent.Executor executor = aczkVar.i;
                return adcsVarE.g(acyqVar, executor).g(new aczi(obj4, 1), defpackage.ajbm.INSTANCE).g(new aczg(aczkVar), executor);
            case 19:
                return ((defpackage.adlt) this.a).g();
            default:
                return defpackage.ahvr.H(this.a.a(), new aczn(9), defpackage.ajbm.INSTANCE);
        }
    }

    public /* synthetic */ xbw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
