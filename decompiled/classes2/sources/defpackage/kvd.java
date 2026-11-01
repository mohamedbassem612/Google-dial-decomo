package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kvd implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kvd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, lbi] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, lbi] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, lbi] */
    /* JADX WARN: Type inference failed for: r12v56, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        int i = 1;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                return this.a.j((aify) obj);
            case 1:
                return this.a.d((aigf) obj);
            case 2:
                return this.a.f((aigf) obj);
            case 3:
                java.lang.Object obj2 = this.a;
                return ((kvy) obj2).e.b(kvz.c());
            case 4:
                kwy kwyVar = (kwy) obj;
                defpackage.kun kunVarB = defpackage.kun.b(kwyVar.i);
                if (kunVarB == null) {
                    kunVarB = defpackage.kun.CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED;
                }
                if (!kunVarB.equals(defpackage.kun.CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED)) {
                    return aiql.z(kwyVar);
                }
                java.lang.Object obj3 = this.a;
                kvy kvyVar = (kvy) obj3;
                return ahrv.g(kvyVar.n.ba((defpackage.kun) kvyVar.i.p().get(0))).i(new defpackage.kvd(obj3, 6), kvyVar.f);
            case 5:
                return this.a.c((defpackage.hkd) obj);
            case 6:
                return ((kvy) this.a).n.aW();
            case 7:
                alat alatVar = ((kwy) obj).h;
                java.lang.Object obj4 = this.a;
                kvy kvyVar2 = (kvy) obj4;
                java.lang.String strA = rlt.a(kvyVar2.b, (android.telecom.PhoneAccountHandle) null);
                return ahvr.H(kvyVar2.j.o(aihd.o(alatVar), new defpackage.kwa(obj4, strA, i)), new defpackage.jvq(14), kvyVar2.f);
            case 8:
                aihd aihdVar = (aihd) obj;
                kvy.a.b().l("com/android/dialer/callrecording/impl/dataservice/CrosbySettingsDataService", "cleanStaleContactNumbers", 129, "CrosbySettingsDataService.java").w("cleaning %d stale numbers", aihdVar.size());
                return ((kvy) this.a).n.aV(aihdVar);
            case 9:
                kvy kvyVar3 = (kvy) ((defpackage.hwv) this.a).e;
                ajcq ajcqVarAY = kvyVar3.n.aY(false);
                kvyVar3.l.s(ajcqVarAY, defpackage.kzj.a);
                return ajcqVarAY;
            case 10:
                defpackage.hwv hwvVar = (defpackage.hwv) this.a;
                android.content.Context context = (android.content.Context) hwvVar.b;
                defpackage.dva dvaVar = new defpackage.dva(context, "phone_default");
                dvaVar.n(2131232042);
                dvaVar.h(context.getString(2132017315));
                dvaVar.g(context.getString(2132017314));
                defpackage.duz duzVar = new defpackage.duz();
                duzVar.c(context.getString(2132017314));
                dvaVar.o(duzVar);
                dvaVar.d(16, true);
                return ((rwi) hwvVar.d).h("auto_recording_geofence", 0, dvaVar.a());
            case 11:
                defpackage.kzh kzhVar = (defpackage.kzh) obj;
                if (!kzhVar.c && !kzhVar.e) {
                    return ajcm.a;
                }
                java.lang.Object obj5 = this.a;
                defpackage.hwv hwvVar2 = (defpackage.hwv) obj5;
                kvw kvwVar = (kvw) hwvVar2.c;
                if (kvwVar.a() && kvwVar.b.a()) {
                    hgb.c(kvw.a.b(), "Automatic call recording is available", "com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordAutomatically", (char) 130, "CanRecord.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                    return ajcm.a;
                }
                hgb.c(kvw.a.b(), "Automatic call recording is not available", "com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordAutomatically", (char) 133, "CanRecord.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                ahrv ahrvVarG = ahrv.g(((kvy) hwvVar2.e).d(false));
                defpackage.kvd kvdVar = new defpackage.kvd(obj5, 9);
                ?? r13 = hwvVar2.a;
                return ahrvVarG.i(kvdVar, (java.util.concurrent.Executor) r13).i(new defpackage.kvd(obj5, 10), (java.util.concurrent.Executor) r13);
            case 12:
                alat alatVar2 = ((kwy) obj).h;
                java.lang.Object obj6 = this.a;
                defpackage.kwc kwcVar = (defpackage.kwc) obj6;
                java.lang.String strA2 = rlt.a(kwcVar.a, (android.telecom.PhoneAccountHandle) null);
                return ahvr.H(kwcVar.i.o(aihd.o(alatVar2), new defpackage.kwa(obj6, strA2, i2)), new defpackage.iau(obj6, strA2, 12), kwcVar.e);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj7 = this.a;
                return ((defpackage.kwc) obj7).b.b(kwd.c());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((defpackage.kwc) this.a).m.aZ();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return this.a.c((defpackage.hkd) obj);
            case 16:
                defpackage.kwc kwcVar2 = (defpackage.kwc) this.a;
                java.lang.String strA3 = rlt.a(kwcVar2.a, (android.telecom.PhoneAccountHandle) null);
                return kwcVar2.j.v((java.lang.String) obj, strA3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj8 = this.a;
                return ((defpackage.kwc) obj8).b.b(kwd.c());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((defpackage.kwc) this.a).m.aZ();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj9 = this.a;
                return ((defpackage.kwc) obj9).b.b(kvz.c());
            default:
                return ((aogc) this.a).aU((java.lang.String) obj);
        }
    }
}
