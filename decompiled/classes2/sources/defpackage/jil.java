package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jil implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jil(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v58, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v60, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v62, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v64, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v66, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v68, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v70, types: [aoqa, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        ajcq ajcqVarZ;
        java.lang.String str;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return rd.e(mp$.ExternalSyntheticApiModelOutline0.m(obj), ((defpackage.re) this.a).a);
            case 2:
                return ((jvv) this.a).c((java.lang.String) obj);
            case 3:
                return ((jys) this.a).c.b(android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL.buildUpon().appendPath(((java.lang.Long) obj).toString()).build());
            case 4:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                long jLongValue = ((java.lang.Long) entry.getKey()).longValue();
                java.lang.Integer num = (java.lang.Integer) entry.getValue();
                int iIntValue = num.intValue();
                switch (iIntValue) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z = true;
                        break;
                    default:
                        kka.a.d().i(zct.b).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "isKnownCallType", 354, "SystemCallLogUpdater.java").w("unknown call_type %d", iIntValue);
                        break;
                }
                java.lang.Object obj2 = this.a;
                ahvr.bM(z);
                return android.content.ContentProviderOperation.newUpdate(android.content.ContentUris.withAppendedId(((kka) obj2).a(), jLongValue)).withValue("type", num).build();
            case 5:
                return ((android.content.Context) this.a).getString(((java.lang.Integer) obj).intValue());
            case 6:
                return this.a.a(obj);
            case 7:
                return (defpackage.lkq) ((aigf) this.a).get(java.lang.Long.valueOf(((defpackage.kdy) obj).b));
            case 8:
                defpackage.lkq lkqVar = (defpackage.lkq) obj;
                java.lang.Object obj3 = this.a;
                lcp lcpVar = (lcp) obj3;
                defpackage.lcl lclVar = lcpVar.f;
                int i = 5;
                if (lkqVar == null || (str = lkqVar.c) == null || str.isEmpty()) {
                    defpackage.lcl.a.b().l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "prepareAudioUploadForScotty", 102, "CallScreenDonationScottyUploader.java").v("empty audio file path");
                    ajcqVarZ = aiql.z(j$.util.Optional.empty());
                } else {
                    java.lang.String strValueOf = java.lang.String.valueOf(str.substring(0, str.lastIndexOf(".")));
                    ahrv ahrvVarG = ahrv.g(ahvr.F(new defpackage.gzk(lclVar, str, 18), lclVar.b));
                    defpackage.kwa kwaVar = new defpackage.kwa(lclVar, strValueOf.concat("_scotty.flac"), i);
                    ajct ajctVar = lclVar.c;
                    ajcqVarZ = ahvr.H(ahrvVarG.i(kwaVar, ajctVar).h(new defpackage.lbs(8), ajctVar).e(java.lang.Throwable.class, new defpackage.lbs(9), ajctVar), new defpackage.lbs(10), ajctVar);
                }
                ajcq ajcqVarZ2 = lkqVar == null ? aiql.z(defpackage.lcm.a) : ahvr.H(ahvr.F(new defpackage.jyr(lkqVar, 14), lclVar.b), new defpackage.kxn(lkqVar, 7), lclVar.c);
                return ahvr.I(ahvr.ak(new ajcq[]{ajcqVarZ, ajcqVarZ2}).p(new defpackage.jsr(lclVar, ajcqVarZ, ajcqVarZ2, i), lclVar.c), new defpackage.kwa(obj3, lkqVar, 6), lcpVar.d);
            case 9:
                return ((zpm) this.a).k((apqr) obj, defpackage.lqk.class, new defpackage.iry(4));
            case 10:
                return (kif) ((aoin) j$.util.Objects.requireNonNull((aoin) ((zzx) this.a).k().get((defpackage.kig) obj))).a();
            case 11:
                return ((kif) obj).b((defpackage.kip) this.a);
            case 12:
                java.lang.Object obj4 = this.a;
                defpackage.mhp mhpVar = (defpackage.mhp) obj;
                try {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    ajcq ajcqVarA = mhpVar.a((defpackage.mfu) obj4);
                    ajcqVarA.c(new qpl(mhpVar, epochMilli, 1), ajbm.a);
                    return ajcqVarA;
                } catch (java.lang.RuntimeException e) {
                    a.bq(defpackage.mfs.a.c(), "failed dumping feature into public dump", "com/android/dialer/debug/dump/dumptools/DebugDumper", "getPublicDumpMessageList", (char) 335, "DebugDumper.java", e, zct.b);
                    return aiql.z(new defpackage.mhk());
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.mln) ((aoin) ((java.util.Map.Entry) obj).getValue()).a()).c((java.lang.String) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 16:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            default:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
