package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ovr extends defpackage.ovn {
    private long b;
    private long c;
    private boolean d;

    public ovr() {
        super((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // defpackage.ovn
    public final void a(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 8) {
            int i = (sensorEvent.values[0] > sensorEvent.sensor.getMaximumRange() ? 1 : (sensorEvent.values[0] == sensorEvent.sensor.getMaximumRange() ? 0 : -1));
            ?? r1 = i >>> 31;
            long j = sensorEvent.timestamp;
            long j2 = this.b;
            if (j > j2) {
                if (this.d) {
                    this.c += j - j2;
                }
                if (i < 0) {
                    this.b = j;
                }
            }
            this.d = r1;
        }
    }
}
