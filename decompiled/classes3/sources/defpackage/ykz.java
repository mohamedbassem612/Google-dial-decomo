package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykz implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public ykz(defpackage.yla ylaVar, android.view.View view, android.view.ViewTreeObserver viewTreeObserver, int i) {
        this.$cid = i;
        this.a = view;
        this.b = viewTreeObserver;
        j$.util.Objects.requireNonNull(ylaVar);
        this.c = ylaVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aoss, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.$cid;
        android.view.View view = this.a;
        if (i != 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            aimz aimzVar = zih.a;
            aolr aolrVarPlus = zih.b.plus(aols.a);
            ?? r1 = this.c;
            aogc aogcVar = (aogc) this.b;
            aoov.al((aoss) aogcVar.a, aolrVarPlus, 1, new pzf((aoln) null, aogcVar, (java.lang.Runnable) r1, 3));
            return;
        }
        com.google.android.accessibility.utils.widget.TvSurveyPromptContainer tvSurveyPromptContainer = ((defpackage.yla) this.c).a;
        tvSurveyPromptContainer.a(view);
        if (tvSurveyPromptContainer.a) {
            android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) this.b;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public ykz(android.view.View view, aogc aogcVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = view;
        this.b = aogcVar;
        this.c = runnable;
    }
}
