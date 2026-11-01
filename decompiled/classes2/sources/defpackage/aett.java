package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aett implements aepy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final aify e;
    private final int f;

    public aett(aify aifyVar, int i) {
        this.a = 250;
        this.b = 250;
        this.c = 250;
        this.d = 10000;
        this.e = aifyVar;
        this.f = i;
    }

    public final /* synthetic */ int a() {
        return androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final boolean b() {
        int i = this.f;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aett) {
            defpackage.aett aettVar = (defpackage.aett) obj;
            if (this.a == aettVar.a && this.b == aettVar.b && this.c == aettVar.c && this.d == aettVar.d && ahvr.aP(this.e, aettVar.e)) {
                int i = this.f;
                int i2 = aettVar.f;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
        int i = this.f;
        anty.aJ(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        return "StallConfigurations{initialMonitoringDelayMs=" + this.a + ", checkForResponseIntervalMs=" + this.b + ", midStallCheckForResponseIntervalMs=" + this.c + ", postToMainIntervalMs=" + this.d + ", stallThresholdsMs=" + java.lang.String.valueOf(this.e) + ", enablement=" + aepz.a(this.f) + '}';
    }

    public aett() {
        throw null;
    }

    public final /* synthetic */ void c() {
    }
}
