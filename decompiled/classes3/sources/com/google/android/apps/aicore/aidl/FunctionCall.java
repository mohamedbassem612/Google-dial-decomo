package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FunctionCall extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR;
    public final java.lang.String a;
    public final android.os.Bundle b;
    public final java.lang.String c;
    private volatile transient aigf d = null;

    static {
        defpackage.ylz ylzVarA = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA.h = "FunctionCall";
        ylzVarA.b(6);
        ylzVarA.b = "The function call schema";
        defpackage.ylz ylzVarA2 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA2.b(1);
        ylzVarA2.b = "The function name";
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchemaA = ylzVarA2.a();
        defpackage.ylz ylzVarA3 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA3.b(5);
        ylzVarA3.b = "An array of function arguments in an OBJECT format, e.g. [{'argName': 'argName1', 'argValue': 'argValue1'}, {'argName': 'argName2', 'argValue': 123.0}]";
        defpackage.ylz ylzVarA4 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA4.b(6);
        ylzVarA4.b = "The function argument root schema, which contains the argument name and its value.";
        defpackage.ylz ylzVarA5 = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        ylzVarA5.b(1);
        ylzVarA5.b = "The argument name";
        ylzVarA4.i = aigf.l("argName", ylzVarA5.a(), "argValue", com.google.android.apps.aicore.aidl.FunctionArgsValue.a);
        ylzVarA4.g = aify.q("argName", "argValue");
        ylzVarA4.e = aify.q("argName", "argValue");
        ylzVarA3.d = ylzVarA4.a();
        ylzVarA.i = aigf.l("name", responseSchemaA, "args", ylzVarA3.a());
        ylzVarA.g = aify.q("name", "args");
        ylzVarA.e = aify.q("name", "args");
        ylzVarA.a();
        CREATOR = new defpackage.xfa(9);
    }

    public FunctionCall(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    public final aigf a() {
        android.os.Bundle bundle;
        aigf aigfVar = this.d;
        if (aigfVar != null || (bundle = this.b) == null) {
            return aigfVar;
        }
        aigf aigfVarU = defpackage.xhp.u(bundle);
        this.d = aigfVarU;
        return aigfVarU;
    }

    public final java.lang.String toString() {
        aigf aigfVarA = a();
        if (aigfVarA == null || aigfVarA.isEmpty()) {
            return java.lang.String.valueOf(this.a).concat("()");
        }
        return this.a + '(' + new apjb(new ahyj(", ")).x(aigfVarA) + ')';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.p(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
