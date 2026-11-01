package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aanp {
    public boolean a;
    public boolean b;
    public android.os.WorkSource c;
    private int d;
    private long e;
    private final long f;
    private final long g;
    private final long h;
    private final int i;
    private final float j;
    private long k;
    private int l;
    private int m;
    private final com.google.android.gms.libs.identity.ClientIdentity n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public aanp(com.google.android.gms.location.LocationRequest locationRequest) {
        this(locationRequest.a());
        int i = locationRequest.a;
        d(i);
        long jC = locationRequest.c();
        aais.aj(jC == -1 || jC >= 0, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.f = jC;
        long j = locationRequest.b;
        aais.aj((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31), "maxUpdateDelayMillis must be greater than or equal to 0");
        this.g = j;
        long j2 = locationRequest.c;
        aais.aj(j2 > 0, "durationMillis must be greater than 0");
        this.h = j2;
        int i2 = locationRequest.d;
        aais.aj(i2 > 0, "maxUpdates must be greater than 0");
        this.i = i2;
        float f = locationRequest.e;
        aais.aj((boolean) (((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) ^ (-1)) >>> 31), "minUpdateDistanceMeters must be greater than or equal to 0");
        this.j = f;
        this.a = locationRequest.f;
        c(locationRequest.b());
        b(locationRequest.g);
        e(locationRequest.h);
        this.b = locationRequest.i;
        this.c = locationRequest.j;
        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = locationRequest.k;
        aais.ai(clientIdentity == null || !clientIdentity.a());
        this.n = clientIdentity;
    }

    public final com.google.android.gms.location.LocationRequest a() {
        int i = this.d;
        long j = this.e;
        long jMin = this.f;
        if (i != 105) {
            jMin = java.lang.Math.min(jMin, j);
        }
        return new com.google.android.gms.location.LocationRequest(i, j, jMin, java.lang.Math.max(this.g, this.e), Long.MAX_VALUE, this.h, this.i, this.j, this.a, this.k, this.l, this.m, this.b, new android.os.WorkSource(this.c), this.n);
    }

    public final void b(int i) {
        int i2;
        boolean z;
        if (i == 0 || i == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        }
        aais.ak(z, "granularity %d must be a Granularity.GRANULARITY_* constant", new java.lang.Object[]{java.lang.Integer.valueOf(i)});
        this.l = i2;
    }

    public final void c(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        aais.aj(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.k = j;
    }

    public final void d(int i) {
        boolean z;
        if (i == 100 || i == 102 || i == 104) {
            z = true;
        } else if (i == 105) {
            i = 105;
            z = true;
        } else {
            z = false;
        }
        aais.ak(z, "priority %d must be a Priority.PRIORITY_* constant", new java.lang.Object[]{java.lang.Integer.valueOf(i)});
        this.d = i;
    }

    public final void e(int i) {
        int i2;
        boolean z;
        if (i == 0 || i == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        }
        aais.ak(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new java.lang.Object[]{java.lang.Integer.valueOf(i)});
        this.m = i2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public aanp(long j) {
        this.d = 102;
        this.f = -1L;
        this.g = 0L;
        this.h = Long.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = 0.0f;
        this.a = true;
        this.k = -1L;
        this.l = 0;
        this.m = 0;
        this.b = false;
        this.c = null;
        this.n = null;
        aais.aj((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31), "intervalMillis must be greater than or equal to 0");
        this.e = j;
    }
}
