package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FunctionArgsValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR;
    public static final com.google.android.apps.aicore.aidl.ResponseSchema a;
    private static final com.google.android.apps.aicore.aidl.ResponseSchema j;
    public final int b;
    public final java.lang.String c;
    public final boolean d;
    public final int e;
    public final double f;
    public final aify g;
    public final long h;
    public final android.os.Bundle i;
    private volatile transient aigf k = null;

    static {
        defpackage.ylz ylzVarA = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        defpackage.ylz ylzVarA2 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA2.b(1);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA = ylzVarA2.a();
        defpackage.ylz ylzVarA3 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA3.b(2);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA2 = ylzVarA3.a();
        defpackage.ylz ylzVarA4 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA4.b(3);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA3 = ylzVarA4.a();
        defpackage.ylz ylzVarA5 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA5.b(4);
        ylzVarA.f = aify.s(responseSchemaA, responseSchemaA2, responseSchemaA3, ylzVarA5.a());
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA4 = ylzVarA.a();
        j = responseSchemaA4;
        defpackage.ylz ylzVarA6 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        defpackage.ylz ylzVarA7 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA7.b(1);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA5 = ylzVarA7.a();
        defpackage.ylz ylzVarA8 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA8.b(2);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA6 = ylzVarA8.a();
        defpackage.ylz ylzVarA9 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA9.b(3);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA7 = ylzVarA9.a();
        defpackage.ylz ylzVarA10 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA10.b(4);
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA8 = ylzVarA10.a();
        defpackage.ylz ylzVarA11 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA11.b(5);
        ylzVarA11.d = responseSchemaA4;
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA9 = ylzVarA11.a();
        defpackage.ylz ylzVarA12 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA12.b(6);
        ylzVarA6.f = aify.u(responseSchemaA5, responseSchemaA6, responseSchemaA7, responseSchemaA8, responseSchemaA9, ylzVarA12.a());
        ylzVarA6.b = "The actual value of the argument";
        a = ylzVarA6.a();
        CREATOR = new defpackage.xfa(8);
    }

    public FunctionArgsValue(int i, java.lang.String str, boolean z, int i2, double d, java.util.List list, long j2, android.os.Bundle bundle) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = i2;
        this.f = d;
        this.g = aify.n(list);
        this.h = j2;
        this.i = bundle;
    }

    public final aigf a() {
        android.os.Bundle bundle;
        aigf aigfVar = this.k;
        if (aigfVar != null || (bundle = this.i) == null) {
            return aigfVar;
        }
        aigb aigbVar = new aigb(4);
        for (java.lang.String str : bundle.keySet()) {
            com.google.android.apps.aicore.aidl.FunctionArgsValue functionArgsValueT = defpackage.xhp.t(bundle, str);
            if (functionArgsValueT != null) {
                aigbVar.i(str, functionArgsValueT);
            }
        }
        aigf aigfVarE = aigbVar.e(true);
        this.k = aigfVarE;
        return aigfVarE;
    }

    public final java.lang.String toString() {
        int i = this.b;
        switch (i) {
            case 0:
                return this.c;
            case 1:
                return java.lang.String.valueOf(this.d);
            case 2:
                return java.lang.String.valueOf(this.e);
            case 3:
                return java.lang.String.valueOf(this.f);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.g.toString();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.String.valueOf(this.h);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aigf aigfVarA = a();
                return aigfVarA == null ? "{}" : ahvr.aF(aigfVarA);
            default:
                throw new java.lang.IllegalArgumentException(a.bj(i, "Unsupported kind: "));
        }
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.b;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.c);
        aais.h(parcel, 3, this.d);
        aais.l(parcel, 4, this.e);
        aais.j(parcel, 5, this.f);
        aais.E(parcel, 6, this.g);
        aais.m(parcel, 7, this.h);
        aais.p(parcel, 8, this.i);
        aais.g(parcel, iF);
    }
}
