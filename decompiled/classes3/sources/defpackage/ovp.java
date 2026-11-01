package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovp implements android.hardware.SensorEventListener {
    public final boolean a = false;
    private final defpackage.ovq b;

    public ovp(android.content.Context context) {
        this.b = new defpackage.ovq(context);
        ((android.os.PowerManager) context.getSystemService(android.os.PowerManager.class)).isInteractive();
    }

    @Override // android.hardware.SensorEventListener
    public final synchronized void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        defpackage.ovq ovqVar;
        int i = 0;
        while (true) {
            ovqVar = this.b;
            if (i >= 9) {
                break;
            }
            ovqVar.c[i].a(sensorEvent);
            i++;
        }
        defpackage.ovn[] ovnVarArr = ovqVar.b;
        for (int i2 = 0; i2 < 2; i2++) {
            ovnVarArr[i2].a(sensorEvent);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }
}
