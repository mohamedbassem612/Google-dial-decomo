package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpk {
    public final defpackage.anpj a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.anpi d;
    public final defpackage.anpi e;
    public final boolean f;

    public anpk(defpackage.anpj anpjVar, java.lang.String str, defpackage.anpi anpiVar, defpackage.anpi anpiVar2, boolean z) {
        new java.util.concurrent.atomic.AtomicReferenceArray(2);
        ahvr.cj(anpjVar, "type");
        this.a = anpjVar;
        ahvr.cj(str, "fullMethodName");
        this.b = str;
        ahvr.cj(str, "fullMethodName");
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        ahvr.cj(anpiVar, "requestMarshaller");
        this.d = anpiVar;
        ahvr.cj(anpiVar2, "responseMarshaller");
        this.e = anpiVar2;
        this.f = z;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        ahvr.cj(str, "fullServiceName");
        ahvr.cj(str2, "methodName");
        return str + '/' + str2;
    }

    public static defpackage.aal d() {
        defpackage.aal aalVar = new defpackage.aal();
        aalVar.e = null;
        aalVar.c = null;
        return aalVar;
    }

    public final java.io.InputStream a(java.lang.Object obj) {
        return this.d.a(obj);
    }

    public final java.lang.Object b(java.io.InputStream inputStream) {
        return this.d.b(inputStream);
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("fullMethodName", this.b);
        ahymVarL.b("type", this.a);
        ahymVarL.g("idempotent", false);
        ahymVarL.g("safe", false);
        ahymVarL.g("sampledToLocalTracing", this.f);
        ahymVarL.b("requestMarshaller", this.d);
        ahymVarL.b("responseMarshaller", this.e);
        ahymVarL.b("schemaDescriptor", (java.lang.Object) null);
        ahymVarL.c();
        return ahymVarL.toString();
    }
}
