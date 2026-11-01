package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oti implements zog, defpackage.zoi {
    public static final aimz a = aimz.i("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder");
    public final qba b;
    public final defpackage.otj c;
    public final mba d;
    public final java.lang.String e;
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public oti(qba qbaVar, defpackage.otj otjVar, mba mbaVar, java.lang.String str) {
        this.b = qbaVar;
        this.c = otjVar;
        this.d = mbaVar;
        this.e = str;
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        e();
    }

    public final java.lang.String d() {
        return java.lang.String.format("%s %s", "call scope", this.e);
    }

    public final void e() {
        j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(this.f, new defpackage.oth(this, 0));
    }

    @Override // defpackage.zoi
    public final void eh() {
        f();
    }

    public final void f() {
        j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(this.f, new defpackage.oth(this, 2));
    }
}
