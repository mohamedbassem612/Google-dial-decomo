package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajxx implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ ajxx(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ajxo ajxoVar, defpackage.ajtc ajtcVar, com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, defpackage.ajwi ajwiVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = ajxoVar;
        this.d = ajtcVar;
        this.e = firebaseMessaging;
        this.f = ajwiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (this.$cid == 0) {
            ?? r5 = this.b;
            java.lang.Object obj = this.a;
            int i = defpackage.ajxy.d;
            android.content.Context context = (android.content.Context) obj;
            return new defpackage.ajxy((defpackage.ajxo) this.c, defpackage.ajxw.b(context, r5), new defpackage.aogc((defpackage.ajtc) this.d, (com.google.firebase.messaging.FirebaseMessaging) this.e, (defpackage.ajwi) this.f), context, r5);
        }
        ?? r0 = this.f;
        defpackage.ahvr.cc(r0.isDone(), "Future was expected to be done: %s", r0);
        j$.util.Optional optional = (j$.util.Optional) defpackage.a.h(r0);
        ?? r1 = this.e;
        defpackage.ahvr.cc(r1.isDone(), "Future was expected to be done: %s", r1);
        j$.util.Optional optional2 = (j$.util.Optional) defpackage.a.h(r1);
        ?? r3 = this.c;
        defpackage.ahvr.cc(r3.isDone(), "Future was expected to be done: %s", r3);
        j$.util.Optional optional3 = (j$.util.Optional) defpackage.a.h(r3);
        ?? r4 = this.b;
        defpackage.ahvr.cc(r4.isDone(), "Future was expected to be done: %s", r4);
        j$.util.Optional optional4 = (j$.util.Optional) defpackage.a.h(r4);
        if (!optional.isPresent() || !optional2.isPresent() || !optional4.isPresent()) {
            defpackage.vda.e(optional, optional2, optional4);
            return j$.util.Optional.empty();
        }
        defpackage.vda vdaVar = (defpackage.vda) this.d;
        if (!((java.lang.Boolean) vdaVar.f.a()).booleanValue()) {
            return j$.util.Optional.of(vdaVar.h.A((defpackage.vcg) optional2.orElseThrow(), optional3, (defpackage.vcc) optional4.orElseThrow()));
        }
        java.lang.Object obj2 = this.a;
        defpackage.rsr rsrVar = vdaVar.i;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj2;
        if (rsrVar.B(phoneAccountHandle) == null) {
            rsrVar.C(phoneAccountHandle, vdaVar.h.A((defpackage.vcg) optional2.orElseThrow(), vdaVar.g.r(phoneAccountHandle), (defpackage.vcc) optional4.orElseThrow()));
        }
        return j$.util.Optional.of(rsrVar.B(phoneAccountHandle));
    }

    public /* synthetic */ ajxx(defpackage.vda vdaVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, defpackage.ajcq ajcqVar3, defpackage.ajcq ajcqVar4, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.d = vdaVar;
        this.f = ajcqVar;
        this.e = ajcqVar2;
        this.c = ajcqVar3;
        this.b = ajcqVar4;
        this.a = phoneAccountHandle;
    }
}
