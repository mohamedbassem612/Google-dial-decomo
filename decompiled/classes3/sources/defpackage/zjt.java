package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zjt {
    private static final aimz a = aimz.i("com/google/android/dialershared/externals/logging/CallScopedExternalsLogging");
    private final mfz b;

    public zjt(mfz mfzVar) {
        this.b = mfzVar;
    }

    public final void a(mfy mfyVar) {
        aokc aokcVar = aokc.a;
        mhc mhcVar = mhc.a;
        aooh.e(mhcVar, "getDefaultInstance(...)");
        c(mfyVar, aokcVar, mhcVar);
    }

    public final void b(mfy mfyVar, java.util.List list) {
        mhc mhcVar = mhc.a;
        aooh.e(mhcVar, "getDefaultInstance(...)");
        c(mfyVar, list, mhcVar);
    }

    public final void c(mfy mfyVar, java.util.List list, mhc mhcVar) {
        aooh.f(mhcVar, "returnValue");
        a.b().l("com/google/android/dialershared/externals/logging/CallScopedExternalsLogging", "recordCallMethodInvocation", 37, "CallScopedExternalsLogging.kt").M("event: %s, function parameters: %s, return value: %s", mfyVar.name(), gus.aC(gus.ay(list)), gus.aC(mhcVar));
        this.b.a();
    }
}
