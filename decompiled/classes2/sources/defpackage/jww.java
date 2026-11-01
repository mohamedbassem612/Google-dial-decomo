package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jww implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jww(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        j$.util.Optional optionalOf;
        dsd dsdVar;
        int i = 8;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                java.util.Set set = (java.util.Set) ((kgl) this.b).d.get(java.lang.Long.valueOf(this.a));
                if (set == null || set.isEmpty()) {
                    return new aile(ajcm.a);
                }
                aihd aihdVarO = aihd.o(set);
                set.clear();
                return aihdVarO;
            case 1:
                return ((akzx) j$.util.Map.-EL.getOrDefault((java.util.Map) ((kgl) this.b).c, java.lang.Long.valueOf(this.a), ampl.a.m())).p();
            case 2:
                ((kgl) this.b).c.remove(java.lang.Long.valueOf(this.a));
                return null;
            case 3:
                aimz aimzVar = defpackage.kww.a;
                aimzVar.b().l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logCallRecordingRunning", 184, "CallRecordingLogger.java").v("call recording is running");
                defpackage.kww kwwVar = (defpackage.kww) this.b;
                if (!kwwVar.g.isPresent()) {
                    a.bI(aimzVar.d(), "requestedRealtimeMillis is empty. CallRecordingLogger#logCallRecordingRequested() must be called before.", "com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logCallRecordingRunning", (char) 192, "CallRecordingLogger.java", zct.b);
                    return null;
                }
                long j = this.a;
                akzx akzxVar = kwwVar.k;
                long jLongValue = j - ((java.lang.Long) kwwVar.g.orElseThrow()).longValue();
                akzxVar.u();
                amoy amoyVar = akzxVar.b;
                amoy amoyVar2 = amoy.a;
                amoyVar.b |= 16;
                amoyVar.g = jLongValue;
                return null;
            case 4:
                defpackage.kww.a.b().l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logCallRecordingRequested", 172, "CallRecordingLogger.java").v("call recording is requested");
                ((defpackage.kww) this.b).g = j$.util.Optional.of(java.lang.Long.valueOf(this.a));
                return null;
            case 5:
                java.io.File file = new java.io.File(((lbl) this.b).b.getFilesDir(), "callrecording");
                if (file.listFiles() == null) {
                    return null;
                }
                j$.util.DesugarArrays.stream(file.listFiles()).filter(new defpackage.lyd(this.a, i2)).forEach(new defpackage.lct(i2));
                return null;
            case 6:
                return this.b != zpo.l ? j$.util.Optional.of(java.lang.Long.valueOf(this.a)) : j$.util.Optional.empty();
            case 7:
                rsr rsrVar = new rsr();
                rsr rsrVar2 = new rsr(new kaw("date").aH("IS NULL"));
                kaw kawVar = new kaw("date");
                long j2 = this.a;
                rsrVar2.aD(kawVar.aI("=", java.lang.Long.valueOf(j2)));
                rsrVar.aC(rsrVar2.aB());
                rsr rsrVarAB = rsrVar.aB();
                android.database.Cursor cursorB = ((syd) this.b).f.b(android.provider.CallLog.Calls.CONTENT_URI, syd.a, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, "date DESC");
                try {
                    if (cursorB == null) {
                        syd.b.d().i(zct.b).l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "getCallInfo", 251, "RevelioMissedCallNotifier.java").v("Null system calllog cursor");
                        throw new java.lang.IllegalStateException("Null system calllog cursor");
                    }
                    if (cursorB.moveToFirst()) {
                        optionalOf = j$.util.Optional.of(new syc(android.content.ContentUris.withAppendedId(android.provider.CallLog.Calls.CONTENT_URI, cursorB.getLong(0)), cursorB.getString(1)));
                    } else {
                        syd.b.d().i(zct.b).l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "getCallInfo", 259, "RevelioMissedCallNotifier.java").x("empty cursor, no system calllog entry for %s", j2);
                        optionalOf = j$.util.Optional.empty();
                    }
                    j$.util.Optional optional = optionalOf;
                    cursorB.close();
                    return optional;
                } catch (java.lang.Throwable th) {
                    if (cursorB == null) {
                        throw th;
                    }
                    try {
                        cursorB.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 8:
                return (amrc) j$.util.Map.-EL.computeIfAbsent(((tbm) this.b).b, java.lang.Long.valueOf(this.a), new rat(16));
            case 9:
                long j3 = this.a;
                wvq wvqVar = (wvq) this.b;
                wvqVar.g = j$.util.OptionalLong.of(j3);
                wvqVar.h.x();
                wvqVar.e.clear();
                wvqVar.i.x();
                wvqVar.f = true;
                return null;
            case 10:
                wvq wvqVar2 = (wvq) this.b;
                akzx akzxVar2 = wvqVar2.h;
                akzxVar2.u();
                wvi wviVar = akzxVar2.b;
                wvi wviVar2 = wvi.a;
                wviVar.b |= 4;
                wviVar.e = this.a;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVar2.u();
                wvi wviVar3 = akzxVar2.b;
                wviVar3.b |= 8;
                wviVar3.f = jElapsedRealtime;
                wvqVar2.e.add(wvqVar2.i.p());
                return null;
            case 11:
                wvq wvqVar3 = (wvq) this.b;
                akzx akzxVar3 = wvqVar3.h;
                akzxVar3.u();
                wvi wviVar4 = akzxVar3.b;
                wvi wviVar5 = wvi.a;
                wviVar4.b |= 2;
                long j4 = this.a;
                wviVar4.d = j4;
                akzx akzxVar4 = wvqVar3.i;
                akzxVar4.u();
                amob amobVar = akzxVar4.b;
                amob amobVar2 = amob.a;
                amobVar.b |= 1;
                amobVar.c = j4;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                akzxVar3.u();
                wvi wviVar6 = akzxVar3.b;
                wviVar6.b |= 8;
                wviVar6.f = jElapsedRealtime2;
                return null;
            case 12:
                return ((akzx) j$.util.Map.-EL.getOrDefault(((wxm) this.b).c, java.lang.Long.valueOf(this.a), amoc.a.m())).p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((wxm) this.b).c.remove(java.lang.Long.valueOf(this.a));
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                long j5 = this.a;
                java.lang.Object obj = this.b;
                java.lang.Long lValueOf = java.lang.Long.valueOf(j5);
                wys wysVar = (wys) obj;
                wysVar.g.remove(lValueOf);
                wxm.a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "clearMetricsForCall", 78, "AtlasCallMetricsLogger.java").v("clear hold for me in-memory metrics for the call");
                wxm wxmVar = wysVar.b;
                agsm.i(1139, ahvr.F(new defpackage.jww(wxmVar, j5, 13), wxmVar.b), "failed to clear metrics for call created at %d", new java.lang.Object[]{lValueOf});
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                long j6 = this.a;
                java.lang.Object obj2 = this.b;
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(j6);
                java.util.Map map = ((wys) obj2).g;
                if (map.containsKey(lValueOf2)) {
                    return null;
                }
                wyt wytVar = new wyt();
                wytVar.a = dff.m(new defpackage.hyd(wytVar, i));
                ajcq ajcqVar = wytVar.a;
                if (ajcqVar != null && (dsdVar = wytVar.b) != null) {
                    map.put(lValueOf2, new wyu(ajcqVar, dsdVar));
                    return null;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (wytVar.a == null) {
                    sb.append(" future");
                }
                if (wytVar.b == null) {
                    sb.append(" completer");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 16:
                wyr wyrVar = (wyr) ((wys) this.b).g.remove(java.lang.Long.valueOf(this.a));
                if (wyrVar == null) {
                    return null;
                }
                wyrVar.a().b((java.lang.Object) null);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (java.util.List) dez.m((gfy) ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) ((wzd) this.b).b.a()).x().a, true, false, new defpackage.bpd(this.a, 10));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((wzd) this.b).i(this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (java.util.List) dez.m((gfy) ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) ((wzd) this.b).b.a()).x().a, true, false, new defpackage.bpd(this.a, 9));
            default:
                ((xbe) this.b).e = this.a;
                return null;
        }
    }
}
