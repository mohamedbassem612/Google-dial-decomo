package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oqh implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ oqh(defpackage.afjo afjoVar, defpackage.oql oqlVar, aogc aogcVar, com.google.android.libraries.surveys.SurveyData surveyData, aify aifyVar, int i) {
        this.$cid = i;
        this.a = afjoVar;
        this.b = oqlVar;
        this.c = aogcVar;
        this.d = surveyData;
        this.e = aifyVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.String string;
        if (this.$cid != 0) {
            java.lang.String str = (java.lang.String) obj;
            android.content.Context context = (android.content.Context) this.c;
            boolean zC = defpackage.mik.c(context);
            java.lang.Object obj2 = this.e;
            if (zC) {
                string = context.getString(2132019023, obj2);
            } else if (((java.lang.String) obj2).isEmpty()) {
                string = context.getResources().getString(2132019026);
            } else {
                string = ((defpackage.mij) this.d).h ? context.getResources().getString(2132019025, obj2) : context.getResources().getString(2132019024, obj2);
            }
            defpackage.mik.b(context, (android.view.ViewGroup) this.a, str, string, ((defpackage.mii) this.b).b, false);
            return;
        }
        oqi.a.b().l("com/android/dialer/hats/DialerHatsEventProcessor$3", "onSuccess", 364, "DialerHatsEventProcessor.java").y("Present HaTS survey with trigger ID = %s", this.b.e());
        defpackage.oqg oqgVar = new defpackage.oqg((aogc) this.c, (com.google.android.libraries.surveys.SurveyData) this.d, (android.view.View) obj, (aify) this.e, 2);
        j$.util.Optional optional = ((oqi) ((defpackage.afjo) this.a).c).g;
        optional.isPresent();
        java.lang.Object obj3 = oqgVar.c;
        ?? r9 = oqgVar.b;
        java.lang.Object obj4 = oqgVar.a;
        ?? r10 = oqgVar.d;
        java.lang.Object obj5 = optional.get();
        ahvr.bN(r9 != 0, "Survey data is null.");
        afja afjaVar = afja.b;
        afiz afizVar = afiz.a;
        int id = ((android.view.View) obj4).getId();
        java.lang.Integer num = 340;
        num.getClass();
        ((ipc) obj5).bl(new defpackage.afjb((android.app.Activity) ((aogc) obj3).a, id, num, oqi.o, r9, r10, afjaVar, afizVar));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ oqh(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, defpackage.mij mijVar, defpackage.mii miiVar, int i) {
        this.$cid = i;
        this.c = context;
        this.a = viewGroup;
        this.e = str;
        this.d = mijVar;
        this.b = miiVar;
    }
}
