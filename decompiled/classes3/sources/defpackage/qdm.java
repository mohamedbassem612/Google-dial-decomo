package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdm implements android.hardware.SensorEventListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public qdm(defpackage.qdl qdlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qdlVar);
        this.a = qdlVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        int i2 = this.$cid;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        aooh.f(sensor, "sensor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        int i = this.$cid;
        if (i == 0) {
            if (sensorEvent.sensor.getType() == 1) {
                java.lang.Object obj = this.a;
                double d = sensorEvent.values[0];
                double d2 = sensorEvent.values[1];
                double d3 = sensorEvent.values[2];
                if (d == 0.0d || d2 == 0.0d || d3 == 0.0d) {
                    return;
                }
                double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(java.lang.Math.hypot(d, d2), d3));
                agsm.i(584, ahvr.E(new defpackage.pmw(obj, (degrees <= 65.0d || degrees >= 115.0d) ? defpackage.qdn.c : defpackage.qdn.b, 10), ((qdo) obj).d), "Failed to set orientation.", new java.lang.Object[0]);
                return;
            }
            return;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.a;
            ahok ahokVarF = ((defpackage.qdl) obj2).c.f(582, "PseudoProximityWakeLock.sensorEventListener.onSensorChanged");
            try {
                if (sensorEvent.sensor.getType() != 8) {
                    defpackage.qdl.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock$1", "onSensorChanged", 61, "PseudoProximityWakeLock.java").v("PseudoProximityWakeLock only targets values from the proximity sensor.");
                } else {
                    int i2 = (sensorEvent.values[0] > sensorEvent.sensor.getMaximumRange() ? 1 : (sensorEvent.values[0] == sensorEvent.sensor.getMaximumRange() ? 0 : -1));
                    if (((defpackage.qdl) obj2).h.compareAndSet((i2 ^ (-1)) >>> 31, i2 >>> 31)) {
                        ((defpackage.qdl) obj2).i.a(ajcm.a);
                    }
                    if (i2 >= 0) {
                        defpackage.qdl.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock", "notifyStateChangeBasedOnSensorValue", 85, "PseudoProximityWakeLock.java").v("unregistering listener because near becomes false.");
                        ((defpackage.qdl) obj2).b.unregisterListener(((defpackage.qdl) obj2).g);
                    }
                }
                ahokVarF.close();
                return;
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        aooh.f(sensorEvent, "event");
        if (sensorEvent.sensor.getType() == 8) {
            java.lang.Object obj3 = this.a;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (sensorEvent.values[0] == 0.0f) {
                qed.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/ProximityTracker$sensorEventListener$<anonymous>", "onSensorChanged", 67, "ProximityTracker.kt").v("Proximity sensor event: NEAR");
                qed qedVar = (qed) obj3;
                mgw mgwVar = qedVar.f;
                gus.at(sensorEvent.values[0]);
                mgwVar.c();
                if (((java.lang.Boolean) qedVar.e.a()).booleanValue()) {
                    qedVar.k.i((java.lang.String) null).b(mce.fs);
                }
                if (qedVar.h == 3) {
                    qedVar.g = jElapsedRealtime;
                }
                qedVar.h = 2;
                return;
            }
            qed.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/ProximityTracker$sensorEventListener$<anonymous>", "onSensorChanged", 84, "ProximityTracker.kt").v("Proximity sensor event: FAR");
            qed qedVar2 = (qed) obj3;
            mgw mgwVar2 = qedVar2.f;
            gus.at(sensorEvent.values[0]);
            mgwVar2.c();
            if (!((java.lang.Boolean) qedVar2.j.e().orElse(java.lang.Boolean.FALSE)).booleanValue() && qedVar2.h == 2 && jElapsedRealtime - qedVar2.g < 1000) {
                qedVar2.d.o(rmx.vp);
            }
            qedVar2.h = 3;
        }
    }

    public qdm(qed qedVar, int i) {
        this.$cid = i;
        this.a = qedVar;
    }

    public qdm(qdo qdoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qdoVar);
        this.a = qdoVar;
    }
}
