package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ljc implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ljc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        boolean zBooleanValue;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return aiql.z(this.a);
            case 1:
                return aiql.z(this.a);
            case 2:
                return ((ajzi) this.a).getMessage();
            case 3:
                return j$.util.Collection.-EL.stream((java.util.Collection) this.a).min(j$.util.Comparator.-CC.comparingInt(new qkr(pek.a, 1)));
            case 4:
                java.lang.Object obj = this.a;
                if (obj != null) {
                    android.os.Bundle bundle = (android.os.Bundle) obj;
                    if (bundle.getBundle("android.telecom.extra.ASSISTED_DIALING_EXTRAS") != null) {
                        return j$.util.Optional.of(defpackage.hue.b(bundle.getBundle("android.telecom.extra.ASSISTED_DIALING_EXTRAS")));
                    }
                }
                return j$.util.Optional.empty();
            case 5:
                java.lang.String string = ((android.os.Bundle) this.a).getString("sim_suggestion_reason");
                if (string == null) {
                    return j$.util.Optional.empty();
                }
                try {
                    return j$.util.Optional.of(java.lang.Enum.valueOf(svi.class, string));
                } catch (java.lang.IllegalArgumentException e) {
                    hgb.g(piz.a.c(), "unknown reason: %s", string, "com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceSimSuggestReason", (char) 1082, "CallInfoProducerModule.java", e, zct.b);
                    return j$.util.Optional.empty();
                }
            case 6:
                java.lang.Object objEmpty = this.a;
                j$.util.Optional optional = (j$.util.Optional) objEmpty;
                if (true == optional.isPresent()) {
                    objEmpty = j$.util.Optional.ofNullable(((android.telecom.PhoneAccount) optional.get()).getLabel());
                }
                j$.util.Optional optional2 = (j$.util.Optional) objEmpty;
                if (true == optional2.isPresent() && android.text.TextUtils.isEmpty((java.lang.CharSequence) optional2.get())) {
                    objEmpty = j$.util.Optional.empty();
                }
                j$.util.Optional optional3 = (j$.util.Optional) objEmpty;
                return true == optional3.isPresent() ? j$.util.Optional.ofNullable(((java.lang.CharSequence) optional3.get()).toString()) : objEmpty;
            case 7:
                try {
                    return abwc.c((android.os.Bundle) this.a);
                } catch (java.lang.IllegalArgumentException e2) {
                    piz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).k(e2).l("com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceCalleeId", 236, "CallInfoProducerModule.java").v("Failed to retrieve CalleeId");
                    return j$.util.Optional.empty();
                }
            case 8:
                java.lang.Object objOfNullable = this.a;
                j$.util.Optional optional4 = (j$.util.Optional) objOfNullable;
                if (true == optional4.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((android.telecom.PhoneAccount) optional4.get()).hasCapabilities(4096)));
                }
                return (java.lang.Boolean) ((j$.util.Optional) objOfNullable).orElse(java.lang.Boolean.FALSE);
            case 9:
                zmn zmnVar = (zmn) this.a;
                if (zmnVar.h.isPresent()) {
                    zBooleanValue = ((java.lang.Boolean) zmnVar.h.orElseThrow()).booleanValue();
                } else {
                    java.util.List listS = zmnVar.k.s();
                    if (listS != null && listS.size() > 1) {
                        z = true;
                    }
                    zmnVar.h = j$.util.Optional.of(java.lang.Boolean.valueOf(z));
                    zBooleanValue = ((java.lang.Boolean) zmnVar.h.orElseThrow()).booleanValue();
                }
                return java.lang.Boolean.valueOf(zBooleanValue);
            case 10:
                android.os.Bundle bundle2 = (android.os.Bundle) this.a;
                return !bundle2.containsKey("android.telecom.extra.CHILD_ADDRESS") ? j$.util.Optional.empty() : j$.util.Optional.ofNullable(bundle2.getString("android.telecom.extra.CHILD_ADDRESS"));
            case 11:
                android.telecom.Call call = (android.telecom.Call) this.a;
                return call.getCannedTextResponses() != null ? aify.n(call.getCannedTextResponses()) : aike.a;
            case 12:
                return java.lang.Boolean.valueOf(((android.os.Bundle) this.a).getInt("android.telecom.extra.CALL_NETWORK_TYPE", 0) == 4);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                int handlePresentation = ((android.telecom.Call) this.a).getDetails().getHandlePresentation();
                if (handlePresentation == 1) {
                    return zna.b;
                }
                if (handlePresentation != 2) {
                    return handlePresentation != 4 ? zna.a : zna.d;
                }
                return zna.c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return android.os.Build.VERSION.SDK_INT >= 33 ? j$.util.Optional.of(java.lang.Boolean.valueOf(((android.telecom.Call) this.a).getDetails().can(268435456))) : j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.telecom.Call call2 = (android.telecom.Call) this.a;
                if (call2.getDetails().can(1536)) {
                    return java.lang.Boolean.TRUE;
                }
                return call2.getDetails().can(2304) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            case 16:
                int i = ((android.os.Bundle) this.a).getInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 0);
                return java.lang.Boolean.valueOf(((i & 2) == 0 && (i & 1) == 0) ? false : true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object objOfNullable2 = this.a;
                j$.util.Optional optional5 = (j$.util.Optional) objOfNullable2;
                if (true == optional5.isPresent()) {
                    objOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zcy) optional5.get()).f()));
                }
                return (java.lang.Boolean) ((j$.util.Optional) objOfNullable2).orElse(java.lang.Boolean.FALSE);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object objOfNullable3 = this.a;
                j$.util.Optional optional6 = (j$.util.Optional) objOfNullable3;
                if (true == optional6.isPresent()) {
                    objOfNullable3 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zcy) optional6.get()).e()));
                }
                return (java.lang.Boolean) ((j$.util.Optional) objOfNullable3).orElse(java.lang.Boolean.FALSE);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Boolean.valueOf(((ptx) this.a).u());
            default:
                return zcy.a((android.telecom.Call) this.a);
        }
    }
}
