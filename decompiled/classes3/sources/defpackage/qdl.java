package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdl {
    public static final aimz a = aimz.i("com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock");
    public final android.hardware.SensorManager b;
    public final ahpz c;
    public final zjv d;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final android.hardware.SensorEventListener g = new defpackage.qdm(this, 1);
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();
    public final zpz i;
    public final defpackage.qbe j;

    public qdl(android.hardware.SensorManager sensorManager, zpz zpzVar, ahpz ahpzVar, defpackage.qbe qbeVar, zjv zjvVar) {
        this.b = sensorManager;
        this.i = zpzVar;
        this.c = ahpzVar;
        this.j = qbeVar;
        this.d = zjvVar;
    }
}
