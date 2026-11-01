package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mws implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mws(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                qjd qjdVar = (qjd) obj;
                aooh.c(qjdVar);
                return qjd.d(qjdVar, (qit) null, 2131231037, true, 201326527);
            case 1:
                return ((java.lang.CharSequence) obj).toString();
            case 2:
                return ((defpackage.mzs) ((apqr) obj).a(defpackage.mzs.class)).G();
            case 3:
                return ((defpackage.mzs) ((apqr) obj).a(defpackage.mzs.class)).D();
            case 4:
                return defpackage.mzb.DOBBY_BUTTON_STATE_ENABLED;
            case 5:
                defpackage.npj npjVar = (defpackage.npj) obj;
                aooh.f(npjVar, "it");
                int i2 = npjVar.a.d;
                tyv tyvVarB = tyv.b(i2);
                if (tyvVarB == null) {
                    tyvVarB = tyv.m;
                }
                if (tyvVarB != tyv.g) {
                    tyv tyvVarB2 = tyv.b(i2);
                    if (tyvVarB2 == null) {
                        tyvVarB2 = tyv.m;
                    }
                    if (tyvVarB2 == tyv.d) {
                        i = 1;
                    } else {
                        tyv tyvVarB3 = tyv.b(i2);
                        if (tyvVarB3 == null) {
                            tyvVarB3 = tyv.m;
                        }
                        if (tyvVarB3 == tyv.c) {
                            i = 1;
                        } else {
                            tyv tyvVarB4 = tyv.b(i2);
                            if (tyvVarB4 == null) {
                                tyvVarB4 = tyv.m;
                            }
                            if (tyvVarB4 == tyv.i) {
                                i = 1;
                            } else {
                                tyv tyvVarB5 = tyv.b(i2);
                                if (tyvVarB5 == null) {
                                    tyvVarB5 = tyv.m;
                                }
                                if (tyvVarB5 != tyv.k) {
                                    tyv tyvVarB6 = tyv.b(i2);
                                    if (tyvVarB6 == null) {
                                        tyvVarB6 = tyv.m;
                                    }
                                    if (tyvVarB6 == tyv.b) {
                                        i = 2;
                                    } else {
                                        tyv tyvVarB7 = tyv.b(i2);
                                        if (tyvVarB7 == null) {
                                            tyvVarB7 = tyv.m;
                                        }
                                        if (tyvVarB7 != tyv.h) {
                                            tyv tyvVarB8 = tyv.b(i2);
                                            if (tyvVarB8 == null) {
                                                tyvVarB8 = tyv.m;
                                            }
                                            i = tyvVarB8 == tyv.f ? 3 : 4;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                } else {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                return java.lang.Integer.valueOf(i);
            case 6:
                defpackage.npj npjVar2 = (defpackage.npj) obj;
                aooh.f(npjVar2, "it");
                return java.lang.Integer.valueOf(npjVar2.b.d);
            case 7:
                return ((defpackage.nzy) ((apqr) obj).a(defpackage.nzy.class)).kb().e();
            case 8:
                return ((defpackage.opc) obj).c;
            case 9:
                return ((defpackage.oad) obj).a;
            case 10:
                return ((defpackage.oad) obj).b;
            case 11:
                return ((defpackage.obi) obj).name();
            case 12:
                return defpackage.obi.SNACKBAR_TURN_ON_SPEAKER_OR_FOLD_DEVICE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.obe) ((apqr) obj).a(defpackage.obe.class)).Q();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((apqr) obj).b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((apqr) obj).b;
            case 16:
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.oid oidVar = (defpackage.oid) obj;
                aooh.f(oidVar, "it");
                java.lang.Class<?> cls = oidVar.getClass();
                aopu[] aopuVarArr = aoou.a;
                return new aooa(cls);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i3 = ojo.f;
                aooh.f((android.net.Uri) obj, "it");
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(((olv) obj).c);
                java.util.Objects.toString(mapUnmodifiableMap);
                return java.lang.String.valueOf(mapUnmodifiableMap).concat("\n");
            default:
                android.content.ContentResolver contentResolver = (android.content.ContentResolver) obj;
                java.lang.String str = defpackage.oov.a;
                aooh.f(contentResolver, "contentResolver");
                return java.lang.Boolean.valueOf(defpackage.oov.a(contentResolver, defpackage.oov.a) != 0);
        }
    }
}
