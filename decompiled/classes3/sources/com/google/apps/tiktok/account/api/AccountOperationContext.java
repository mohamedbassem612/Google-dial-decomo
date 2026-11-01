package com.google.apps.tiktok.account.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AccountOperationContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(0);
    public final java.util.concurrent.atomic.AtomicBoolean a;
    private final j$.util.concurrent.ConcurrentHashMap b;

    public AccountOperationContext(android.os.Parcel parcel) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.os.Bundle bundle = (android.os.Bundle) parcel.readParcelable(android.os.Bundle.class.getClassLoader());
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        for (java.lang.String str : bundle.keySet()) {
            this.b.put(str, bundle.getString(str));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            bundle.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        parcel.writeParcelable(bundle, 0);
    }

    public AccountOperationContext() {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }
}
