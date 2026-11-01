package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qdo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker");
    public final android.hardware.SensorManager c;
    public final java.util.concurrent.Executor d;
    public final defpackage.ajcu e;
    public final defpackage.aoin g;
    public boolean i;
    public qdn j;
    public final java.util.concurrent.atomic.AtomicReference k;
    public final java.util.concurrent.atomic.AtomicBoolean l;
    public final defpackage.zpz m;
    public final android.hardware.SensorEventListener b = new qdm(this, 0);
    public final java.util.Set f = new java.util.HashSet();
    public j$.util.Optional h = j$.util.Optional.empty();

    public qdo(android.hardware.SensorManager sensorManager, defpackage.zpz zpzVar, defpackage.ajcu ajcuVar, defpackage.aoin aoinVar) {
        qdn qdnVar = qdn.a;
        this.j = qdnVar;
        this.k = new java.util.concurrent.atomic.AtomicReference(qdnVar);
        this.l = new java.util.concurrent.atomic.AtomicBoolean();
        this.c = sensorManager;
        this.m = zpzVar;
        this.d = new defpackage.ajdc(ajcuVar);
        this.e = ajcuVar;
        this.g = aoinVar;
    }

    public final defpackage.ajcq a() {
        return defpackage.ahvr.E(new pmx(this, 13), this.d);
    }

    public final defpackage.ajcq b() {
        return defpackage.ahvr.E(new pmx(this, 14), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ajcq, java.lang.Object] */
    public final void c() {
        j$.util.Optional optional = this.h;
        if (true == optional.isPresent()) {
            optional.get().cancel(false);
        }
        this.h = j$.util.Optional.empty();
    }
}
