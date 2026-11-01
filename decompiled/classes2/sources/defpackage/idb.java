package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idb implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ idb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v48, types: [ahzi, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                ((defpackage.idh) obj).e.a(qbc.hr);
                return aiql.z(j$.util.Optional.empty());
            case 1:
                java.lang.Object obj2 = this.a;
                ((defpackage.idh) obj2).e.a(qbc.hr);
                return aiql.y(new defpackage.hxd("trying to mute upload of an inactive call"));
            case 2:
                java.lang.Object obj3 = this.a;
                ((defpackage.idh) obj3).e.a(qbc.hr);
                return aiql.z(j$.util.Optional.empty());
            case 3:
                java.lang.Object obj4 = this.a;
                ((defpackage.idh) obj4).e.a(qbc.hr);
                return aiql.y(new defpackage.hxd("trying to mute download of an inactive call"));
            case 4:
                java.lang.Object obj5 = this.a;
                ((defpackage.idh) obj5).e.a(qbc.hr);
                return aiql.z(j$.util.Optional.empty());
            case 5:
                return ((kwt) this.a).b();
            case 6:
                aimw aimwVarL = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 100, "CallScopeLockHolder.java");
                oti otiVar = (oti) this.a;
                aimwVarL.y("acquiring InCallUiLock for %s", otiVar.e);
                return j$.util.Optional.of(otiVar.b.a(otiVar.d()));
            case 7:
                return ((android.content.Context) this.a).getString(2132017465);
            case 8:
                return ((qtd) this.a).d.N().findViewById(2131429387);
            case 9:
                rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController", "onMultibindingProvidedBottomSheetFragmentHidden", 346, "VoiceController.java").y("Listener for key %s not injected to CallScopeComponent.", this.a);
                return ajcm.a;
            case 10:
                return ((uqp) this.a).h.b();
            default:
                return (java.lang.Integer) this.a.eZ();
        }
    }
}
