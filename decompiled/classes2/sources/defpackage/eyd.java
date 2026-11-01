package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class eyd implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public eyd(aaeo aaeoVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(aaeoVar);
        this.b = aaeoVar;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v40, types: [adsm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v41, types: [adsm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        qbc qbcVar;
        switch (this.$cid) {
            case 0:
                defpackage.eyj eyjVar = (defpackage.eyj) this.b;
                eyjVar.a[this.a].b();
                defpackage.ezv ezvVar = eyjVar.p;
                ezvVar.F(ezvVar.E(), 1033, new defpackage.ezp(4));
                return;
            case 1:
                ((defpackage.dvl) this.b).a(this.a);
                return;
            case 2:
                java.lang.String str2 = eum.a;
                final defpackage.etb etbVar = ((defpackage.exy) ((ils) this.b).a).a.l;
                int i = this.a;
                exw exwVar = new exw(i, 1);
                final exw exwVar2 = new exw(i, 0);
                ahvr.bY(android.os.Looper.myLooper() == etbVar.b.a());
                etbVar.e++;
                etbVar.a(new java.lang.Runnable() { // from class: eta
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.function.Function function = exwVar2;
                        defpackage.etb etbVar2 = etbVar;
                        etbVar2.d = aa$.ExternalSyntheticApiModelOutline1.m(function, etbVar2.d);
                        etbVar2.b(new defpackage.esz(etbVar2, etbVar2.d, 1));
                    }
                });
                etbVar.c(aa$.ExternalSyntheticApiModelOutline1.m(exwVar, etbVar.c));
                return;
            case 3:
                android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) this.b).getLayoutParams();
                aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.a;
                return;
            case 4:
                int i2 = lja.c;
                switch (this.a) {
                    case 1:
                        str = "SODA Error Network Timeout";
                        break;
                    case 2:
                        str = "SODA Error Network";
                        break;
                    case 3:
                        str = "SODA Error Audio";
                        break;
                    case 4:
                        str = "SODA Error Server";
                        break;
                    case 5:
                        str = "SODA Error Client";
                        break;
                    case 6:
                        str = "SODA Error Speech Timeout";
                        break;
                    case 7:
                        str = "SODA Error No Match";
                        break;
                    case 8:
                        str = "SODA Error Recognizer Busy";
                        break;
                    case 9:
                        str = "SODA Insufficient Permissions";
                        break;
                    default:
                        str = "SODA Unknown Error";
                        break;
                }
                this.b.m(new adro(str));
                return;
            case 5:
                aihd aihdVar = qtd.a;
                ((android.view.View) this.b).setVisibility(this.a);
                return;
            case 6:
                rap rapVar = (rap) this.b;
                rce rceVar = rapVar.l;
                int i3 = rceVar.c;
                rcd rcdVarB = rcd.b(i3);
                if (rcdVarB == null) {
                    rcdVarB = rcd.a;
                }
                rcd rcdVar = rcd.a;
                if (rcdVarB != rcdVar) {
                    rcd rcdVarB2 = rcd.b(i3);
                    if (rcdVarB2 == null) {
                        rcdVarB2 = rcdVar;
                    }
                    if (rcdVarB2 == rcd.d) {
                        agsm agsmVar = rapVar.h;
                        qtr qtrVarB = qtr.b(rceVar.d);
                        if (qtrVarB == null) {
                            qtrVarB = qtr.a;
                        }
                        agsmVar.g(rapVar.m(qtrVarB, this.a), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        return;
                    }
                    rcd rcdVarB3 = rcd.b(i3);
                    if (rcdVarB3 != null) {
                        rcdVar = rcdVarB3;
                    }
                    int iOrdinal = rcdVar.ordinal();
                    if (iOrdinal == 1) {
                        qbcVar = qbc.gj;
                    } else {
                        if (iOrdinal != 2) {
                            throw new java.lang.AssertionError(rcdVar.toString().concat(" is not expected here."));
                        }
                        qbcVar = qbc.gp;
                    }
                    rapVar.e(qbcVar);
                    rce rceVar2 = rcf.a;
                    rapVar.l = rcf.a;
                    rapVar.p.a(ajcm.a);
                    return;
                }
                return;
            case 7:
                ((rwi) this.b).i(this.a);
                return;
            case 8:
                ((veg) this.b).b.remove(java.lang.Integer.valueOf(this.a));
                return;
            case 9:
                vkt vktVar = (vkt) this.b;
                boolean zIsPresent = vktVar.c.isPresent();
                int i4 = this.a;
                if (zIsPresent) {
                    vktVar.a((dsd) vktVar.c.orElseThrow(), i4);
                    return;
                } else {
                    vktVar.b = j$.util.Optional.of(java.lang.Integer.valueOf(i4));
                    return;
                }
            case 10:
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                colorDrawable.setColor(this.a);
                ((android.view.View) this.b).setBackground(colorDrawable);
                return;
            case 11:
                ((aaeo) this.b).k(this.a);
                return;
            case 12:
                this.b.d(this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                this.b.c(this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((akvr) this.b).d(this.a - 1);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((adwx) this.b).a();
                aegx.a.b().l("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl$2", "run", 128, "GnpExecutorApiImpl.java").w("Finished Broadcast execution [%d].", this.a);
                return;
            case 16:
                aflh aflhVar = (aflh) this.b;
                aflg aflgVar = aflhVar.a;
                if (aflgVar != null) {
                    aflgVar.a(this.a);
                    aflhVar.a = null;
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aflh aflhVar2 = (aflh) this.b;
                aflg aflgVar2 = aflhVar2.a;
                if (aflgVar2 != null) {
                    aflgVar2.a(this.a);
                    aflhVar2.a = null;
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aflh aflhVar3 = (aflh) this.b;
                aflg aflgVar3 = aflhVar3.a;
                if (aflgVar3 != null) {
                    aflgVar3.a(this.a);
                    aflhVar3.a = null;
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((com.google.android.material.button.MaterialButton) this.b).o(this.a);
                return;
            default:
                ((defpackage.agsh) this.b).stopSelf(this.a);
                return;
        }
    }

    public eyd(defpackage.dvl dvlVar, int i, int i2) {
        this.$cid = i2;
        this.b = dvlVar;
        this.a = i;
    }

    public /* synthetic */ eyd(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    public /* synthetic */ eyd(int i, android.view.View view, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = view;
    }

    public eyd(aegx aegxVar, adwx adwxVar, int i, int i2) {
        this.$cid = i2;
        this.b = adwxVar;
        this.a = i;
        j$.util.Objects.requireNonNull(aegxVar);
    }
}
