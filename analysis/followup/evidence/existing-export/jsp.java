package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jsp implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jsp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, tev] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, tem] */
    /* JADX WARN: Type inference failed for: r6v29, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.Object khiVar;
        java.lang.Object lwvVar;
        int i;
        int i2;
        switch (this.$cid) {
            case 0:
                return (aguq) this.a.a();
            case 1:
                return (aguq) this.a.a();
            case 2:
                return (quq) this.a.a();
            case 3:
                return ((defpackage.jwd) this.a.a()).g;
            case 4:
                return this.a;
            case 5:
                return (aguq) this.a.a();
            case 6:
                khiVar = new defpackage.khi(this.a, 0);
                return khiVar;
            case 7:
                khiVar = new defpackage.khi(this.a, 1);
                return khiVar;
            case 8:
                return mni.bP((aoin) this.a);
            case 9:
                return mni.bP((aoin) this.a);
            case 10:
                return mni.bP((aoin) this.a);
            case 11:
                aopu[] aopuVarArr = aoou.a;
                aooa aooaVar = new aooa(defpackage.kks.class);
                aooa aooaVar2 = new aooa(defpackage.kkr.class);
                ?? r6 = this.a;
                lwvVar = new defpackage.lwv(new tep(((defpackage.kkq) r6).b, aooaVar, aooaVar2), (tev) r6, 1, (byte[]) null);
                break;
            case 12:
                aopu[] aopuVarArr2 = aoou.a;
                lwvVar = new defpackage.lwu((defpackage.tem) this.a, (aopu) new aooa(defpackage.kks.class), 1, (byte[]) null);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return (abwm) this.a.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object objA = this.a.a();
                aooh.e(objA, "get(...)");
                khiVar = new defpackage.kqk((kpa) objA, 218);
                return khiVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((rai) this.a).p(yse.k);
            case 16:
                java.lang.Object objA2 = this.a.a();
                aooh.e(objA2, "get(...)");
                khiVar = new defpackage.kqk((kpa) objA2, 217);
                return khiVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((rai) this.a).p(yse.l);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object objA3 = this.a.a();
                aooh.e(objA3, "get(...)");
                khiVar = new defpackage.kqk((kpa) objA3, 208);
                return khiVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((rai) this.a).p(yse.j);
            default:
                j$.util.Optional optionalA = ((kwt) this.a).a();
                aooh.e(optionalA, "getCurrentLocaleForBuiltInAudioFile(...)");
                java.lang.Object objQ = aooh.q(optionalA);
                if (objQ == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                java.util.Locale locale = (java.util.Locale) objQ;
                if (aooh.n(locale, java.util.Locale.forLanguageTag("ar-XA"))) {
                    i = 2131951708;
                } else {
                    if (!aooh.n(locale, java.util.Locale.forLanguageTag("my-MM"))) {
                        java.util.Objects.toString(locale);
                        throw new java.lang.IllegalArgumentException("unsupported locale: ".concat(locale.toString()));
                    }
                    i = 2131951710;
                }
                defpackage.hxy hxyVar = new defpackage.hxy(i);
                if (aooh.n(locale, java.util.Locale.forLanguageTag("ar-XA"))) {
                    i2 = 2131951678;
                } else {
                    if (!aooh.n(locale, java.util.Locale.forLanguageTag("my-MM"))) {
                        java.util.Objects.toString(locale);
                        throw new java.lang.IllegalArgumentException("unsupported locale: ".concat(locale.toString()));
                    }
                    i2 = 2131951680;
                }
                khiVar = new defpackage.kul(hxyVar, new defpackage.hxy(i2));
                return khiVar;
        }
        return lwvVar;
    }
}
