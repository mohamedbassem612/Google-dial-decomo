package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CloudMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(6);
    public final android.content.Intent a;

    public CloudMessage(android.content.Intent intent) {
        this.a = intent;
    }

    public final java.lang.Integer a() {
        android.content.Intent intent = this.a;
        if (intent.hasExtra("google.product_id")) {
            return java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final java.lang.String b() {
        android.content.Intent intent = this.a;
        java.lang.String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.g(parcel, iF);
    }
}
