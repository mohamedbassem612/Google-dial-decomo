package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DataItemParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements defpackage.aavy {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(14);
    public final android.net.Uri a;
    public byte[] b;
    private final java.util.Map c;

    public DataItemParcelable(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr) {
        this.a = uri;
        java.util.HashMap map = new java.util.HashMap();
        java.lang.ClassLoader classLoader = com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader();
        ahvr.ci(classLoader);
        bundle.setClassLoader(classLoader);
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object parcelable = bundle.getParcelable(str);
            ahvr.ci(parcelable);
            map.put(str, (com.google.android.gms.wearable.internal.DataItemAssetParcelable) parcelable);
        }
        this.c = map;
        this.b = bArr;
    }

    public final java.lang.String toString() {
        boolean zIsLoggable = android.util.Log.isLoggable("DataItem", 3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataItemParcelable[@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        sb.append(",dataSz=".concat((bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length)).toString()));
        java.util.Map map = this.c;
        sb.append(", numAssets=" + map.size());
        sb.append(", uri=".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a))));
        if (!zIsLoggable) {
            sb.append(']');
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (java.lang.String str : map.keySet()) {
            sb.append("\n    " + str + ": " + java.lang.String.valueOf(map.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.net.Uri uri = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, uri, i);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.ClassLoader classLoader = com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader();
        ahvr.ci(classLoader);
        bundle.setClassLoader(classLoader);
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((java.lang.String) entry.getKey(), new com.google.android.gms.wearable.internal.DataItemAssetParcelable((defpackage.aavz) entry.getValue()));
        }
        aais.p(parcel, 4, bundle);
        aais.q(parcel, 5, this.b);
        aais.g(parcel, iF);
    }
}
