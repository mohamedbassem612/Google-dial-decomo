package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class amj extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(amk amkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = amkVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((defpackage.hgt) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r9v5, types: [aomy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.String str;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                amk amkVar = (amk) obj2;
                if (amkVar.f == null) {
                    avh avhVar = new avh();
                    kaw kawVar = amkVar.i;
                    if (kawVar != null) {
                        aoov.an(((cmv) obj2).M(), (aolr) null, 0, new defpackage.amg(kawVar, avhVar, (aoln) null, 0), 3);
                    }
                    amkVar.f = avhVar;
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                this.a.a();
                return aojh.a;
            case 2:
                aooc.af(obj);
                java.lang.Object obj3 = this.a;
                amk amkVar2 = (amk) obj3;
                avh avhVar2 = amkVar2.f;
                if (avhVar2 != null) {
                    defpackage.avi aviVar = new defpackage.avi(avhVar2);
                    kaw kawVar2 = amkVar2.i;
                    if (kawVar2 != null) {
                        aoov.an(((cmv) obj3).M(), (aolr) null, 0, new defpackage.amg(kawVar2, aviVar, (aoln) null, 2), 3);
                    }
                    amkVar2.f = null;
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((defpackage.ass) this.a).q();
                return aojh.a;
            case 4:
                aooc.af(obj);
                ((defpackage.ass) this.a).p();
                return aojh.a;
            case 5:
                aooc.af(obj);
                ((defpackage.ass) this.a).q();
                return aojh.a;
            case 6:
                aooc.af(obj);
                ((defpackage.ass) this.a).q();
                return aojh.a;
            case 7:
                aooc.af(obj);
                ((defpackage.ass) this.a).p();
                return aojh.a;
            case 8:
                aooc.af(obj);
                ((defpackage.ass) this.a).q();
                return aojh.a;
            case 9:
                aooc.af(obj);
                defpackage.bkj bkjVar = (defpackage.bkj) this.a;
                android.content.Context context = bkjVar.a;
                defpackage.bkm bkmVar = bkjVar.b;
                android.view.textclassifier.TextClassificationManager textClassificationManagerM = aa$.ExternalSyntheticApiModelOutline0.m(context.getSystemService(aa$.ExternalSyntheticApiModelOutline0.m$2()));
                int iOrdinal = bkmVar.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new aois();
                    }
                    str = "textview";
                }
                android.view.textclassifier.TextClassifier textClassifierM = ft$.ExternalSyntheticApiModelOutline0.m(textClassificationManagerM, ft$.ExternalSyntheticApiModelOutline0.m(new android.view.textclassifier.TextClassificationContext.Builder(context.getPackageName(), str)));
                bkjVar.c = textClassifierM;
                return textClassifierM;
            case 10:
                aooc.af(obj);
                ((defpackage.bwj) this.a).b();
                return aojh.a;
            case 11:
                aooc.af(obj);
                java.lang.String str2 = defpackage.gzb.a;
                gsh gshVarA = gsh.a();
                java.lang.Object obj4 = this.a;
                java.util.Objects.toString(obj4);
                gshVarA.c(str2, "Constraints changed for ".concat(java.lang.String.valueOf(obj4)));
                return aojh.a;
            case 12:
                aooc.af(obj);
                java.lang.Object obj5 = this.a;
                ahoq ahoqVarW = ahvr.W(34, "CarInCallController_createAndPushInCallScreen");
                try {
                    if (!((defpackage.hnm) obj5).k()) {
                        defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "createAndPushInCallScreen$<anonymous>$<anonymous>", 252, "CarInCallController.kt").v("Creating and pushing in call screen.");
                        ((defpackage.hnm) obj5).h.e(((defpackage.hnm) obj5).a());
                        break;
                    }
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                ((defpackage.ub) this.a).c();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "dismissAccountSelector$<anonymous>", 364, "CarInCallController.kt").v("Dismissing account selector screen");
                defpackage.uc ucVar = ((defpackage.hnm) this.a).h;
                if (ucVar.a() instanceof defpackage.hoy) {
                    ucVar.c();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "removeCallErrorScreen$<anonymous>", 331, "CarInCallController.kt").v("Removing call error screen.");
                aoqh aoqhVar = new aoqh(aooc.l(ajsz.ch(((defpackage.hnm) this.a).h.b()), new defpackage.guv(5)));
                while (aoqhVar.hasNext()) {
                    ((defpackage.ub) aoqhVar.next()).c();
                }
                return aojh.a;
            case 16:
                aooc.af(obj);
                java.lang.Object obj6 = this.a;
                ahoq ahoqVarW2 = ahvr.W(36, "CarInCallController_removeInCallScreens");
                try {
                    defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "removeInCallScreens$<anonymous>$<anonymous>", 283, "CarInCallController.kt").v("Removing in call screen.");
                    aoqh aoqhVar2 = new aoqh(aooc.l(ajsz.ch(((defpackage.hnm) obj6).h.b()), new defpackage.guv(6)));
                    while (aoqhVar2.hasNext()) {
                        ((defpackage.ub) aoqhVar2.next()).c();
                    }
                    ((defpackage.hnm) obj6).q.i((java.lang.String) null).b(mce.gF);
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahoqVarW2, th3);
                        throw th4;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "removePreCallScreens$<anonymous>", 300, "CarInCallController.kt").v("Removing pre call screen.");
                aoqh aoqhVar3 = new aoqh(aooc.l(ajsz.ch(((defpackage.hnm) this.a).h.b()), new defpackage.guv(7)));
                while (aoqhVar3.hasNext()) {
                    ((defpackage.ub) aoqhVar3.next()).c();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                defpackage.ub ubVar = (defpackage.ub) this.a;
                if (ubVar.b.d.a(emq.d)) {
                    ((defpackage.tc) ubVar.a.a(defpackage.tc.class)).a();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                java.lang.Object obj7 = this.a;
                try {
                    android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) aooh.q(((huc) obj7).c.a(((huc) obj7).b.a()));
                    if (persistableBundle != null && persistableBundle.getBoolean("disable_assisted_dialing_bool")) {
                        huc.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/assisteddialing/AssistedDialingEnabledFn", "isEnabledBlocking", 55, "AssistedDialingEnabledFn.kt").v("Dialer's assisted dialing feature disabled by carrier config.");
                    } else {
                        z = true;
                    }
                    break;
                } catch (java.lang.SecurityException unused) {
                    huc.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/assisteddialing/AssistedDialingEnabledFn", "isEnabledBlocking", 63, "AssistedDialingEnabledFn.kt").v("Ignoring carrier config check to disable assisted dialing feature because we don't have the `READ_PHONE_STATE` permission.");
                }
                return java.lang.Boolean.valueOf(z);
            default:
                aooc.af(obj);
                return ((hul) this.a).d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aomy, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.amj((amk) this.a, aolnVar, 0);
            case 1:
                return new defpackage.amj((aomy) this.a, aolnVar, 1);
            case 2:
                return new defpackage.amj((amk) this.a, aolnVar, 2, (byte[]) null);
            case 3:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 3);
            case 4:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 4, (byte[]) null);
            case 5:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 5, (char[]) null);
            case 6:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 6, (short[]) null);
            case 7:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 7, (int[]) null);
            case 8:
                return new defpackage.amj((defpackage.ass) this.a, aolnVar, 8, (boolean[]) null);
            case 9:
                return new defpackage.amj((defpackage.bkj) this.a, aolnVar, 9);
            case 10:
                return new defpackage.amj((defpackage.bwj) this.a, aolnVar, 10);
            case 11:
                return new defpackage.amj((gxl) this.a, aolnVar, 11);
            case 12:
                return new defpackage.amj((defpackage.hnm) this.a, aolnVar, 12);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.amj((defpackage.ub) this.a, aolnVar, 13);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.amj((defpackage.hnm) this.a, aolnVar, 14, (byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.amj((defpackage.hnm) this.a, aolnVar, 15, (char[]) null);
            case 16:
                return new defpackage.amj((defpackage.hnm) this.a, aolnVar, 16, (short[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.amj((defpackage.hnm) this.a, aolnVar, 17, (int[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.amj((defpackage.hqv) this.a, aolnVar, 18);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.amj((huc) this.a, aolnVar, 19);
            default:
                return new defpackage.amj((hul) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(amk amkVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = amkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(aomy aomyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aomyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ass assVar, aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = assVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.bkj bkjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = bkjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.bwj bwjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = bwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(gxl gxlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gxlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hnm hnmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hnm hnmVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hnm hnmVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hnm hnmVar, aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hnm hnmVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.hqv hqvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(huc hucVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hucVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(hul hulVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hulVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj(defpackage.ub ubVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ubVar;
    }
}
