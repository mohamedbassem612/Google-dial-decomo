package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdo implements android.hardware.SensorEventListener {
    public static final aimz a = aimz.i("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl");
    public final android.content.Context b;
    public android.hardware.Sensor d;
    public android.hardware.SensorManager e;
    private final defpackage.agkk l = new defpackage.agkk((byte[]) null);
    private final defpackage.agkk m = new defpackage.agkk((byte[]) null);
    public final defpackage.abdn f = new defpackage.abdn(-8.8f, false);
    public final defpackage.abdn g = new defpackage.abdn(-1.5f, true);
    private float j = 0.0f;
    private float k = 0.0f;
    public boolean h = false;
    public boolean i = false;
    public final java.util.List c = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());

    public abdo(android.content.Context context) {
        this.b = context;
    }

    private final synchronized void b() {
        aimz aimzVar = a;
        aimzVar.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "reset", 138, "FlipObserverAccelerometerOnlyImpl.java").v("resetting flip observer");
        android.hardware.SensorManager sensorManager = this.e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this, this.d);
        } else {
            aimzVar.d().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "reset", 142, "FlipObserverAccelerometerOnlyImpl.java").v("sensorManager is null");
        }
        this.c.clear();
    }

    public final synchronized void a() {
        a.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "cancel", 76, "FlipObserverAccelerometerOnlyImpl.java").v("Cancelling flipObserver");
        b();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        defpackage.abdn abdnVar;
        if (sensorEvent.sensor.getType() == 1) {
            boolean z = false;
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            defpackage.agkk agkkVar = this.l;
            agkkVar.a((f * f) + (f2 * f2));
            defpackage.agkk agkkVar2 = this.m;
            agkkVar2.a(sensorEvent.values[2]);
            float f3 = sensorEvent.timestamp;
            if (java.lang.Math.abs(agkkVar.a - this.j) <= 0.2f) {
                if (f3 - this.k <= 2.0E8f) {
                }
                defpackage.abdn abdnVar2 = this.f;
                abdnVar2.b(agkkVar2, f3);
                if (!this.h) {
                    abdnVar = this.g;
                    abdnVar.b(agkkVar2, f3);
                    if (abdnVar.b) {
                        this.h = true;
                        a.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "onSensorChanged", 112, "FlipObserverAccelerometerOnlyImpl.java").v("Face up detected");
                    }
                }
                if (z && abdnVar2.b && !this.i && this.h) {
                    a.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "onSensorChanged", 120, "FlipObserverAccelerometerOnlyImpl.java").v("Flip has been detected");
                    this.i = true;
                    java.util.List list = this.c;
                    synchronized (list) {
                        java.util.Iterator it = new java.util.ArrayList(list).iterator();
                        while (it.hasNext()) {
                            ((java.lang.Runnable) it.next()).run();
                        }
                    }
                    b();
                    return;
                }
                return;
            }
            this.j = agkkVar.a;
            this.k = f3;
            z = true;
            defpackage.abdn abdnVar3 = this.f;
            abdnVar3.b(agkkVar2, f3);
            if (!this.h) {
                abdnVar = this.g;
                abdnVar.b(agkkVar2, f3);
                if (abdnVar.b) {
                    this.h = true;
                    a.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "onSensorChanged", 112, "FlipObserverAccelerometerOnlyImpl.java").v("Face up detected");
                }
            }
            if (z) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }
}
