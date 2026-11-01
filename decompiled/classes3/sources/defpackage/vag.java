package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vag implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vag(ajwr ajwrVar, com.google.android.material.button.MaterialButton materialButton, int i, int i2) {
        this.$cid = i2;
        this.c = ajwrVar;
        this.b = materialButton;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
            if (phoneAccountHandle.equals(this.b)) {
                return;
            }
            java.lang.Object obj2 = this.c;
            defpackage.vah.a.b().l("com/android/dialer/voicemail/dualsim/impl/SimPhoneAccountRecords", "replaceExistingPhoneAccount", 86, "SimPhoneAccountRecords.java").w("SIM at slot %d replaced", this.a);
            ((java.util.concurrent.atomic.AtomicReference) obj2).set(j$.util.Optional.of(phoneAccountHandle));
            return;
        }
        if (i != 1) {
            defpackage.vtt vttVar = ((defpackage.vtu) ((defpackage.vwq) obj).d.get(this.a)).c;
            if (vttVar == null) {
                vttVar = defpackage.vtt.a;
            }
            java.lang.Object obj3 = this.b;
            ((ajwr) this.c).g((android.view.View) obj3, new defpackage.vwr(vttVar));
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView = (androidx.compose.ui.platform.ComposeView) obj;
        composeView.setVisibility(0);
        java.util.List list = (java.util.List) j$.util.Collection.-EL.stream((java.util.Collection) this.c).map(new mig(4)).collect(aido.a);
        java.lang.Object obj4 = this.b;
        lvd lvdVar = new lvd(obj4, 6);
        kgq kgqVar = new kgq(obj4, 20);
        mtr mtrVar = new mtr(obj4, 1);
        aooh.f(composeView, "composeView");
        aooh.f(list, "entries");
        aais aaisVar = ((mli) obj4).C;
        aooh.f(aaisVar, "glideImageManager");
        composeView.k(dgi.a);
        composeView.a(new cja(-1823621253, true, new alh(aaisVar, list, this.a, lvdVar, kgqVar, mtrVar, 11)));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ vag(android.telecom.PhoneAccountHandle phoneAccountHandle, int i, java.util.concurrent.atomic.AtomicReference atomicReference, int i2) {
        this.$cid = i2;
        this.b = phoneAccountHandle;
        this.a = i;
        this.c = atomicReference;
    }

    public /* synthetic */ vag(mli mliVar, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.b = mliVar;
        this.c = list;
        this.a = i;
    }
}
