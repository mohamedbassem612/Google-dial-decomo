package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptg implements zne, defpackage.zpn {
    private final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();
    private final android.telecom.Call b;
    private final zjl c;
    private final defpackage.pqm d;
    private final oko e;
    private boolean f;

    public ptg(android.telecom.Call call, zjl zjlVar, defpackage.pqm pqmVar, oko okoVar) {
        this.b = call;
        this.c = zjlVar;
        this.d = pqmVar;
        this.e = okoVar;
    }

    @Override // defpackage.zpn
    public final void a() {
        android.telecom.Call call = this.b;
        b(call, call.getState());
    }

    public final void b(android.telecom.Call call, int i) {
        int iOrdinal = defpackage.zpo.a(i).ordinal();
        if (iOrdinal == 3) {
            this.a.set(true);
            return;
        }
        if (iOrdinal != 5) {
            if (iOrdinal == 6) {
                ahvr.ci(call);
                android.net.Uri handle = call.getDetails().getHandle();
                java.lang.String schemeSpecificPart = handle == null ? "" : handle.getSchemeSpecificPart();
                if (this.f || !this.e.X(schemeSpecificPart)) {
                    return;
                }
                zjl zjlVar = this.c;
                if (zjlVar.d.m()) {
                    zjl.a.b().l("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier", "recordLastEmergencyCallTime", 38, "RecentEmergencyCallIdentifier.kt").v("Not recording last emergency call time, since it happened in Direct Boot.");
                } else {
                    aoov.an(zjlVar.c, (aolr) null, 0, new defpackage.xtn(zjlVar, (aoln) null, 11), 3);
                }
                this.f = true;
                return;
            }
            return;
        }
        defpackage.pqm pqmVar = this.d;
        if (pqmVar.x.i().equals(defpackage.zmx.b)) {
            pqmVar.v(20);
            agsm.i(504, pqmVar.j(pqmVar.g), "failed to reset answer completers", new java.lang.Object[0]);
        }
        j$.util.Optional optional = pqmVar.t;
        defpackage.pmv pmvVar = new defpackage.pmv(pqmVar, 13);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = pmvVar.a;
            aenj aenjVar = defpackage.zqm.a;
            defpackage.pqm pqmVar2 = (defpackage.pqm) obj2;
            da$.ExternalSyntheticApiModelOutline0.m(aenjVar.a, pqmVar2.b.hashCode());
            defpackage.pmv pmvVar2 = new defpackage.pmv(obj, 12);
            j$.util.Optional optional2 = pqmVar2.s;
            optional2.isPresent();
            ((ipc) optional2.get()).aM((aeun) pmvVar2.a, aenjVar);
            pqmVar2.t = j$.util.Optional.empty();
        }
    }
}
