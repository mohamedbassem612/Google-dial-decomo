package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aezj implements aezm {
    private static boolean b;
    public final ahzi a;
    private final ahzi c;
    private final int d;

    public aezj(ahzi ahziVar) {
        fed fedVar = new fed(13);
        this.c = ahziVar;
        this.d = 10;
        this.a = fedVar;
    }

    public final void a() {
        synchronized (defpackage.aezj.class) {
            if (!b) {
                aetv aetvVar = new aetv(this, 15);
                long j = this.d;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                ajcu ajcuVar = (ajcu) this.c.eZ();
                agab.aq(ajcuVar.b(new defpackage.ahiu(this, aetvVar, ajcuVar, j, timeUnit, 1), j, timeUnit));
                b = true;
            }
        }
    }
}
