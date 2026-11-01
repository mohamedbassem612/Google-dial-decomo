package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class esz implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ esz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x02cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [fct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [fct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [fma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        long jD;
        defpackage.fam famVar;
        int i2 = 6;
        int i3 = -1;
        boolean z2 = true;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                defpackage.etb etbVar = (defpackage.etb) this.b;
                if (etbVar.e == 0) {
                    etbVar.c(this.a);
                }
                break;
            case 1:
                defpackage.etb etbVar2 = (defpackage.etb) this.b;
                int i5 = etbVar2.e - 1;
                etbVar2.e = i5;
                if (i5 == 0) {
                    etbVar2.c(this.a);
                }
                break;
            case 2:
                try {
                    this.a.run();
                } catch (java.lang.RuntimeException e) {
                    java.lang.Object obj = this.b;
                    defpackage.eru eruVar = new defpackage.eru(e);
                    for (defpackage.fjt fjtVar : ((defpackage.fjw) ((defpackage.etj) obj).a.a).g) {
                        fjtVar.c.execute(new defpackage.ac(fjtVar, fjtVar.b, eruVar, 13));
                    }
                    return;
                }
                break;
            case 3:
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((android.content.Context) this.b).registerReceiver(new defpackage.etu((afpb) this.a), intentFilter);
                break;
            case 4:
                java.lang.Object obj2 = this.b;
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ((android.content.Context) obj2).getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        i2 = 4;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                        i2 = 5;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        i2 = 2;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                        i2 = 9;
                                        break;
                                }
                            } else if (type == 1) {
                                i2 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        i2 = 4;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                        i2 = 5;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        i2 = 2;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                        i2 = 9;
                                        break;
                                }
                            } else if (type != 6) {
                                i2 = type != 9 ? 8 : 7;
                            } else {
                                i2 = 5;
                            }
                        }
                    } catch (java.lang.SecurityException unused) {
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                java.lang.Object obj3 = this.a;
                int i6 = android.os.Build.VERSION.SDK_INT;
                afpb afpbVar = ((defpackage.etu) obj3).a;
                if (i6 < 31 || i2 != 5) {
                    afpbVar.h(i2);
                } else {
                    try {
                        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) ((android.content.Context) obj2).getSystemService("phone");
                        ahvr.ci(telephonyManager);
                        defpackage.ets etsVar = new defpackage.ets(afpbVar);
                        ac$.ExternalSyntheticApiModelOutline0.m(telephonyManager, (java.util.concurrent.Executor) afpbVar.e, etsVar);
                        ac$.ExternalSyntheticApiModelOutline0.m(telephonyManager, etsVar);
                    } catch (java.lang.RuntimeException unused2) {
                        afpbVar.h(5);
                        return;
                    }
                }
                break;
            case 5:
                java.lang.Object obj4 = this.a;
                if (((java.util.concurrent.atomic.AtomicBoolean) obj4).get()) {
                    new java.lang.Thread(new defpackage.esz(((defpackage.eup) this.b).c, obj4, i2), "ExoPlayer:WakeLockManager").start();
                }
                break;
            case 6:
                ((defpackage.hjx) this.b).m((java.util.concurrent.atomic.AtomicBoolean) this.a);
                break;
            case 7:
                defpackage.eyc eycVar = (defpackage.eyc) this.b;
                int i7 = eycVar.m;
                defpackage.eyh eyhVar = (defpackage.eyh) this.a;
                int i8 = i7 - eyhVar.c;
                eycVar.m = i8;
                if (eyhVar.d) {
                    eycVar.n = eyhVar.e;
                    eycVar.o = true;
                }
                if (i8 == 0) {
                    defpackage.erm ermVar = eyhVar.b.b;
                    if (!eycVar.w.b.n() && ermVar.n()) {
                        eycVar.x = -1;
                        eycVar.y = 0L;
                    }
                    if (!ermVar.n()) {
                        java.util.List listAsList = java.util.Arrays.asList(((defpackage.ewy) ermVar).c);
                        int size = listAsList.size();
                        java.util.List list = eycVar.i;
                        ahvr.bY(size == list.size());
                        for (int i9 = 0; i9 < listAsList.size(); i9++) {
                            ((defpackage.eya) list.get(i9)).a = (defpackage.erm) listAsList.get(i9);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (eycVar.o) {
                        boolean z3 = eyhVar.b.b.n() && eycVar.w.b.n();
                        boolean zB = eyhVar.b.c.b(eycVar.w.c);
                        long j2 = eyhVar.b.e;
                        long j3 = eycVar.w.u;
                        if (z3 || (zB && j2 == j3)) {
                            z2 = false;
                        }
                        if (z2) {
                            i3 = eycVar.i();
                            if (ermVar.n() || eyhVar.b.c.c()) {
                                jD = eyhVar.b.e;
                            } else {
                                defpackage.eza ezaVar = eyhVar.b;
                                jD = eycVar.D(ermVar, ezaVar.c, ezaVar.e);
                            }
                            j = jD;
                        }
                        i = i3;
                        z = z2;
                    } else {
                        i = -1;
                        z = false;
                    }
                    eycVar.o = false;
                    eycVar.M(eyhVar.b, 1, z, eycVar.n, j, i);
                }
                break;
            case 8:
                android.util.Pair pair = (android.util.Pair) this.b;
                ((defpackage.eyw) this.a).a.i.J(((java.lang.Integer) pair.first).intValue(), (defpackage.ffu) pair.second);
                break;
            case 9:
                android.util.Pair pair2 = (android.util.Pair) this.b;
                ((defpackage.eyw) this.a).a.i.e(((java.lang.Integer) pair2.first).intValue(), (defpackage.ffu) pair2.second);
                break;
            case 10:
                defpackage.fam famVar2 = ((defpackage.faj) this.b).a;
                android.media.AudioDeviceInfo audioDeviceInfo = famVar2.g;
                java.lang.String str = eum.a;
                android.media.AudioDeviceInfo[] audioDeviceInfoArr = (android.media.AudioDeviceInfo[]) this.a;
                int length = audioDeviceInfoArr.length;
                while (i4 < length) {
                    if (j$.util.Objects.equals(audioDeviceInfoArr[i4], audioDeviceInfo)) {
                        famVar2.g = null;
                        famVar2.d();
                    } else {
                        i4++;
                    }
                    break;
                }
                famVar2.d();
                break;
            case 11:
                java.lang.String str2 = eum.a;
                ((defpackage.exy) ((ils) this.a).a).a.A.i((defpackage.exa) this.b);
                break;
            case 12:
                ((defpackage.exc) this.b).a();
                java.lang.String str3 = eum.a;
                defpackage.ezv ezvVar = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar.F(ezvVar.D(), 1013, new defpackage.ezp(9));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.fbi fbiVar = (defpackage.fbi) this.a;
                if (fbiVar.c != null && (famVar = ((defpackage.fbp) fbiVar.d.a).c) != null) {
                    famVar.c((android.media.AudioDeviceInfo) this.b);
                    break;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj5 = this.a;
                defpackage.fcp fcpVar = (defpackage.fcp) obj5;
                defpackage.fcq fcqVar = fcpVar.c;
                if (fcqVar.e != 0 && !fcpVar.b) {
                    java.lang.Object obj6 = this.b;
                    android.os.Looper looper = fcqVar.h;
                    ahvr.ci(looper);
                    fcpVar.a = fcqVar.g(looper, fcpVar.d, (defpackage.eqg) obj6, false);
                    fcqVar.c.add(obj5);
                    break;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                this.a.J(0, (defpackage.ffu) ((alic) this.b).b);
                break;
            case 16:
                this.a.e(0, (defpackage.ffu) ((alic) this.b).b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.fgm) this.b).z(this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str4 = eum.a;
                ((defpackage.exy) ((defpackage.kvt) this.a).a).a.h.e(25, new defpackage.exq(this.b, 16));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.String str5 = eum.a;
                defpackage.eyc eycVar2 = ((defpackage.exy) ((defpackage.kvt) this.b).a).a;
                defpackage.ezv ezvVar2 = eycVar2.z;
                defpackage.ezm ezmVarE = ezvVar2.E();
                final java.lang.Object obj7 = this.a;
                ezvVar2.F(ezmVarE, 26, new defpackage.etl() { // from class: ezs
                    @Override // defpackage.etl
                    public final void a(java.lang.Object obj8) {
                    }
                });
                if (eycVar2.r == obj7) {
                    eycVar2.h.e(26, new defpackage.exv(i4));
                }
                break;
            default:
                java.lang.Object obj8 = this.b;
                ((defpackage.exc) obj8).a();
                java.lang.String str6 = eum.a;
                defpackage.ezv ezvVar3 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar3.F(ezvVar3.D(), 1020, new defpackage.exq(obj8, 19));
                break;
        }
    }

    public /* synthetic */ esz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
