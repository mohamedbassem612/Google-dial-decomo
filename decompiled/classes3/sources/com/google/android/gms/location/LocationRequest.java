package com.google.android.gms.location;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aanq();
    public int a;
    public long b;
    public long c;
    public int d;
    public float e;
    public boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    public final android.os.WorkSource j;
    public final com.google.android.gms.libs.identity.ClientIdentity k;
    private long l;
    private long m;
    private long n;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, android.os.WorkSource workSource, com.google.android.gms.libs.identity.ClientIdentity clientIdentity) {
        this.a = i;
        this.l = j;
        this.m = j2;
        this.b = j3;
        this.c = j4 != Long.MAX_VALUE ? java.lang.Math.min(java.lang.Math.max(1L, j4 - android.os.SystemClock.elapsedRealtime()), j5) : j5;
        this.d = i2;
        this.e = f;
        this.f = z;
        this.n = j6;
        this.g = i3;
        this.h = i4;
        this.i = z2;
        this.j = workSource;
        this.k = clientIdentity;
    }

    private static java.lang.String f(long j) {
        java.lang.String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        java.lang.StringBuilder sb = defpackage.aaoe.a;
        synchronized (sb) {
            sb.setLength(0);
            defpackage.aaoe.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final long a() {
        if (this.a == 105) {
            return Long.MAX_VALUE;
        }
        return this.l;
    }

    public final long b() {
        long j = this.n;
        return j == -1 ? this.l : j;
    }

    public final long c() {
        long j = this.m;
        return j == -1 ? this.l / 2 : j;
    }

    public final boolean d() {
        long j = this.b;
        return j > 0 && (j >> 1) >= a();
    }

    public final boolean e() {
        return this.a == 105;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationRequest)) {
            return false;
        }
        com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
        boolean zD = d();
        if (this.a != locationRequest.a) {
            return false;
        }
        if ((e() || this.l == locationRequest.l) && c() == locationRequest.c() && zD == locationRequest.d()) {
            return (!zD || this.b == locationRequest.b) && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.i == locationRequest.i && this.j.equals(locationRequest.j) && j$.util.Objects.equals(this.k, locationRequest.k);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(a()), java.lang.Long.valueOf(c()), this.j});
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.reflect.Method method;
        java.lang.Object objInvoke;
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        if (e()) {
            sb.append(aaoo.i(this.a));
            if (this.b > 0) {
                sb.append('/');
                defpackage.aaoe.a(this.b, sb);
            }
        } else {
            sb.append('@');
            if (d()) {
                defpackage.aaoe.a(a(), sb);
                sb.append('/');
                defpackage.aaoe.a(this.b, sb);
            } else {
                defpackage.aaoe.a(a(), sb);
            }
            sb.append(' ');
            sb.append(aaoo.i(this.a));
        }
        if (e() || this.m != -1) {
            sb.append(", minUpdateInterval=");
            sb.append(f(this.m));
        }
        if (this.e > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.e);
        }
        if (this.n != -1) {
            sb.append(", maxUpdateAge=");
            sb.append(f(this.n));
        }
        if (this.c != Long.MAX_VALUE) {
            sb.append(", duration=");
            defpackage.aaoe.a(this.c, sb);
        }
        if (this.d != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.d);
        }
        int i = this.h;
        if (i != 0) {
            sb.append(", ");
            if (i == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            sb.append(str2);
        }
        int i2 = this.g;
        if (i2 != 0) {
            sb.append(", ");
            if (i2 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i2 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.i) {
            sb.append(", bypass");
        }
        android.os.WorkSource workSource = this.j;
        java.lang.reflect.Method method2 = defpackage.aaiu.b;
        if (method2 != null) {
            try {
                java.lang.Object objInvoke2 = method2.invoke(workSource, null);
                aais.as(objInvoke2);
                if (!((java.lang.Boolean) objInvoke2).booleanValue()) {
                    sb.append(", ");
                    sb.append(this.j);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
                method = defpackage.aaiu.a;
                if (method != null) {
                    try {
                        objInvoke = method.invoke(workSource, null);
                        aais.as(objInvoke);
                        if (((java.lang.Integer) objInvoke).intValue() != 0) {
                            sb.append(", ");
                            sb.append(this.j);
                        }
                    } catch (java.lang.Exception e2) {
                        android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    }
                }
            }
        } else {
            method = defpackage.aaiu.a;
            if (method != null) {
                objInvoke = method.invoke(workSource, null);
                aais.as(objInvoke);
                if (((java.lang.Integer) objInvoke).intValue() != 0) {
                    sb.append(", ");
                    sb.append(this.j);
                }
            }
        }
        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = this.k;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.m(parcel, 2, a());
        aais.m(parcel, 3, c());
        aais.l(parcel, 6, this.d);
        aais.k(parcel, 7, this.e);
        aais.m(parcel, 8, this.b);
        aais.h(parcel, 9, this.f);
        aais.m(parcel, 10, this.c);
        aais.m(parcel, 11, b());
        aais.l(parcel, 12, this.g);
        aais.l(parcel, 13, this.h);
        aais.h(parcel, 15, this.i);
        aais.z(parcel, 16, this.j, i);
        aais.z(parcel, 17, this.k, i);
        aais.g(parcel, iF);
    }

    @java.lang.Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new android.os.WorkSource(), null);
    }
}
