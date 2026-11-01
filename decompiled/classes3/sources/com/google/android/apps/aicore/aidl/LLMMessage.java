package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable, java.lang.AutoCloseable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(17);
    public final int a;
    public final java.lang.String b;
    public final android.graphics.Bitmap c;
    public final int d;
    public final android.os.ParcelFileDescriptor e;
    public final boolean f;
    public final com.google.android.apps.aicore.aidl.LLMAudio g;
    public final com.google.android.apps.aicore.aidl.LLMBlob h;
    public final android.os.ParcelFileDescriptor i;
    public final com.google.android.apps.aicore.aidl.FunctionCall j;
    public final com.google.android.apps.aicore.aidl.FunctionResponse k;
    public final com.google.android.apps.aicore.aidl.FunctionTools l;

    public LLMMessage(int i, java.lang.String str, android.graphics.Bitmap bitmap, int i2, android.os.ParcelFileDescriptor parcelFileDescriptor, boolean z, com.google.android.apps.aicore.aidl.LLMAudio lLMAudio, com.google.android.apps.aicore.aidl.LLMBlob lLMBlob, android.os.ParcelFileDescriptor parcelFileDescriptor2, com.google.android.apps.aicore.aidl.FunctionCall functionCall, com.google.android.apps.aicore.aidl.FunctionResponse functionResponse, com.google.android.apps.aicore.aidl.FunctionTools functionTools) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = i2;
        this.e = parcelFileDescriptor;
        this.f = z;
        this.g = lLMAudio;
        this.h = lLMBlob;
        this.i = parcelFileDescriptor2;
        this.j = functionCall;
        this.k = functionResponse;
        this.l = functionTools;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        java.lang.AutoCloseable[] autoCloseableArr = {this.e, this.i, this.g};
        for (int i = 0; i < 3; i++) {
            defpackage.xhp.s(autoCloseableArr[i]);
        }
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.l(parcel, 4, this.d);
        aais.z(parcel, 5, this.e, i);
        aais.h(parcel, 6, this.f);
        aais.z(parcel, 7, this.g, i);
        aais.z(parcel, 8, this.h, i);
        aais.z(parcel, 9, this.i, i);
        aais.z(parcel, 10, this.j, i);
        aais.z(parcel, 11, this.k, i);
        aais.z(parcel, 12, this.l, i);
        aais.g(parcel, iF);
    }
}
