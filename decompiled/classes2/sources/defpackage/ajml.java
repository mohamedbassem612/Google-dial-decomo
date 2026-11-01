package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajml {
    public final long a;
    public final java.lang.Object b;

    public ajml(aazc aazcVar) {
        aooh.f(aazcVar, "clock");
        this.a = aazc.b();
        akzx akzxVarM = akow.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.b = akzxVarM;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(java.lang.String str) {
        java.lang.Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final java.lang.Object b(java.lang.Object obj, aoln aolnVar) {
        return ((swa) this.b).c(this.a, obj, aolnVar);
    }

    public ajml(long j, tkl tklVar) {
        this.a = j;
        this.b = tklVar;
    }

    public ajml() {
        this.a = cfd.S();
        this.b = new java.util.LinkedHashMap();
    }

    public ajml(long j, java.lang.Object obj) {
        this.a = j;
        this.b = obj;
    }
}
