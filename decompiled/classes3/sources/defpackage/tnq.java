package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tnq implements aood {
    public final /* synthetic */ defpackage.toj a;

    public tnq(defpackage.toj tojVar) {
        this.a = tojVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.tnq) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(2, this.a, defpackage.toj.class, "onAiCoreAvailabilityStatusChanged", "onAiCoreAvailabilityStatusChanged(Lcom/google/android/callcoreshared/aicore/availability/AiCoreAvailabilityStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
