package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class tc implements defpackage.vf {
    public final defpackage.tt a;
    public final androidx.car.app.IAppManager.Stub b;
    public final defpackage.tw c;
    public final ems d;
    public final android.os.HandlerThread e = new android.os.HandlerThread("LocationUpdateThread");
    public final defpackage.sy f = new android.location.LocationListener() { // from class: sy
        @Override // android.location.LocationListener
        public final /* synthetic */ void onLocationChanged(java.util.List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((android.location.Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(final android.location.Location location) {
            this.a.c.b("sendLocation", new defpackage.tu() { // from class: ta
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.tu
                public final void a(java.lang.Object obj) {
                    obj.sendLocation(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(java.lang.String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(java.lang.String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [sy] */
    protected tc(defpackage.tt ttVar, defpackage.tw twVar, ems emsVar) {
        this.a = ttVar;
        this.c = twVar;
        this.d = emsVar;
        this.b = new androidx.car.app.AppManager$1(this, ttVar);
    }

    public final void a() {
        this.c.b("invalidate", new defpackage.sx());
    }

    public final void b() {
        ((android.location.LocationManager) this.a.getSystemService("location")).removeUpdates(this.f);
    }
}
