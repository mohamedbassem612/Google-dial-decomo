package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qay {
    public java.lang.String a;
    private final qba b;

    public qay(qba qbaVar, java.lang.String str) {
        this.b = qbaVar;
        this.a = str;
    }

    public final void a() {
        aimz aimzVar = qba.b;
        aimzVar.b().l("com/android/dialer/incall/lock/InCallUiLockRegistry", "release", 126, "InCallUiLockRegistry.java").y("releasing %s", this);
        qba qbaVar = this.b;
        java.util.Map map = qbaVar.c;
        map.remove(this);
        if (qbaVar.c()) {
            aimzVar.b().l("com/android/dialer/incall/lock/InCallUiLockRegistry", "release", 138, "InCallUiLockRegistry.java").y("Remaining UI lock(s): %s", j$.util.Collection.-EL.stream(map.keySet()).map(new defpackage.pvu(5)).collect(j$.util.stream.Collectors.joining(",")));
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/lock/InCallUiLockRegistry", "release", 129, "InCallUiLockRegistry.java").v("all locks released");
        if (!qbaVar.d.isEmpty()) {
            qbaVar.b();
        }
        qbaVar.f.s(aiql.z((java.lang.Object) null), qba.a);
        agsm.i(573, ahvr.F(new omj(qbaVar, 17), qbaVar.e), "failed notifying AllLocksReleasedListeners", new java.lang.Object[0]);
    }

    public final java.lang.String toString() {
        return "InCallUiLock[" + this.a + ']';
    }
}
