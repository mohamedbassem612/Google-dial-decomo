package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PutDataRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(15);
    private static final long e;
    public final android.net.Uri a;
    public final android.os.Bundle b;
    public byte[] c;
    public long d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        e = 1800000L;
        new java.security.SecureRandom();
    }

    public PutDataRequest(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        java.lang.ClassLoader classLoader = com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader();
        ahvr.ci(classLoader);
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public static com.google.android.gms.wearable.PutDataRequest a(android.net.Uri uri) {
        ahvr.cj(uri, "uri must not be null");
        return new com.google.android.gms.wearable.PutDataRequest(uri, new android.os.Bundle(), null, e);
    }

    public final java.util.Map b() {
        java.util.HashMap map = new java.util.HashMap();
        android.os.Bundle bundle = this.b;
        for (java.lang.String str : bundle.keySet()) {
            map.put(str, (com.google.android.gms.wearable.Asset) bundle.getParcelable(str));
        }
        return j$.util.DesugarCollections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(java.lang.String str, com.google.android.gms.wearable.Asset asset) {
        ahvr.ci(str);
        ahvr.ci(asset);
        this.b.putParcelable(str, asset);
    }

    public final java.lang.String toString() {
        boolean zIsLoggable = android.util.Log.isLoggable("DataMap", 3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        sb.append("dataSz=".concat((bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length)).toString()));
        android.os.Bundle bundle = this.b;
        sb.append(", numAssets=" + bundle.size());
        sb.append(", uri=".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a))));
        sb.append(", syncDeadline=" + this.d);
        if (!zIsLoggable) {
            sb.append(']');
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (java.lang.String str : bundle.keySet()) {
            sb.append("\n    " + str + ": " + java.lang.String.valueOf(bundle.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        ahvr.cj(parcel, "dest must not be null");
        android.net.Uri uri = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, uri, i);
        aais.p(parcel, 4, this.b);
        aais.q(parcel, 5, this.c);
        aais.m(parcel, 6, this.d);
        aais.g(parcel, iF);
    }
}
