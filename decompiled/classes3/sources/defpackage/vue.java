package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vue extends agwz {
    final /* synthetic */ defpackage.vul a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vue(defpackage.vul vulVar, ahpz ahpzVar, java.util.concurrent.Executor executor) {
        super(ahpzVar, "VisualVoicemailDataServiceAsyncContentObserver", executor);
        j$.util.Objects.requireNonNull(vulVar);
        this.a = vulVar;
    }

    public final void a(boolean z, android.net.Uri uri) {
        defpackage.vul vulVar = this.a;
        if (((java.lang.Boolean) vulVar.k.a()).booleanValue()) {
            vulVar.b.b();
        }
        vulVar.o.t(aiql.z((java.lang.Object) null), new agxj("VisualVoicemailWithViews"));
    }
}
