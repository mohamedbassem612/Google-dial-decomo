package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afjo implements ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public afjo(oqi oqiVar, com.google.android.libraries.surveys.SurveyData surveyData, defpackage.oql oqlVar, int i) {
        this.$cid = i;
        this.a = surveyData;
        this.b = oqlVar;
        j$.util.Objects.requireNonNull(oqiVar);
        this.c = oqiVar;
    }

    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to record event.", th);
            ((afjq) this.c).e();
            return;
        }
        if (i == 1) {
            ((oqi) this.c).j.a(th);
            return;
        }
        if (i == 2) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to record event.", th);
            ((afjq) this.c).e();
            return;
        }
        if (i == 3) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
            afjq afjqVar = (afjq) this.c;
            afjqVar.b(afjd.b);
            afjqVar.e();
            return;
        }
        if (i != 4) {
            android.util.Log.e("ClientLoggingBackend", "Error while logging.", th);
            return;
        }
        android.util.Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        afjq afjqVar2 = (afjq) this.c;
        afjqVar2.b(afjd.b);
        afjqVar2.e();
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, oql] */
    public final /* synthetic */ void b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        amhl amhlVar;
        int i = this.$cid;
        if (i == 0) {
            afjq afjqVar = (afjq) this.c;
            afjqVar.e();
            afjqVar.i((amhi) this.a, (apdh) this.b);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                anam anamVar = (anam) obj;
                ((afjq) this.c).e();
                try {
                    alad.z(amhj.a, anamVar.f(), akzq.a());
                } catch (alaz e) {
                    android.util.Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e);
                }
                ((afjq) this.c).i((amhi) this.a, (apdh) this.b);
                return;
            }
            if (i == 3) {
                afjq afjqVar2 = (afjq) this.c;
                afjqVar2.e();
                afjqVar2.g((amhk) this.a, (amhl) obj, (apdh) this.b);
                return;
            }
            if (i != 4) {
                if (((java.lang.Boolean) obj).booleanValue()) {
                    aiql.I((ajcq) this.c, ahqx.f(new defpackage.kxp(this, (akdq) this.a, 15)), ((akdb) this.b).a);
                    return;
                }
                return;
            }
            anao anaoVar = (anao) obj;
            ((afjq) this.c).e();
            try {
                amhlVar = (amhl) alad.z(amhl.a, anaoVar.f(), akzq.a());
            } catch (alaz e2) {
                android.util.Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e2);
                amhlVar = null;
            }
            ((afjq) this.c).g((amhk) this.a, amhlVar, (apdh) this.b);
            return;
        }
        j$.util.Optional optional = ((oqi) this.c).l;
        defpackage.oqg oqgVar = new defpackage.oqg(this, (com.google.android.libraries.surveys.SurveyData) this.a, (defpackage.oql) this.b, (aify) obj, 0);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            java.lang.Object obj3 = oqgVar.a;
            ?? r11 = oqgVar.b;
            ?? r9 = oqgVar.c;
            java.lang.Object obj4 = oqgVar.d;
            aogc aogcVar = (aogc) obj2;
            if (j$.util.Collection.-EL.stream(((zzx) aogcVar.c).e()).allMatch(new defpackage.mif(5))) {
                java.lang.Object obj5 = aogcVar.a;
                defpackage.naa naaVar = new defpackage.naa(r9, 20);
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                arrayDeque.add(((android.app.Activity) obj5).findViewById(android.R.id.content));
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        optionalEmpty = j$.util.Optional.empty();
                        break;
                    }
                    android.view.View view = (android.view.View) arrayDeque.poll();
                    if (((java.lang.Boolean) aa$.ExternalSyntheticApiModelOutline1.m(naaVar, view)).booleanValue()) {
                        optionalEmpty = j$.util.Optional.of(view);
                        break;
                    } else if (view instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            arrayDeque.offer(viewGroup.getChildAt(i2));
                        }
                    }
                }
                defpackage.oqh oqhVar = new defpackage.oqh((defpackage.afjo) obj3, (defpackage.oql) r9, aogcVar, (com.google.android.libraries.surveys.SurveyData) r11, (aify) obj4, 0);
                if (true == optionalEmpty.isPresent()) {
                    java.lang.Object obj6 = optionalEmpty.get();
                    java.lang.Object obj7 = oqhVar.a;
                    ?? r2 = oqhVar.b;
                    java.lang.Object obj8 = oqhVar.c;
                    ?? r10 = oqhVar.d;
                    java.lang.Object obj9 = oqhVar.e;
                    oqi.a.b().l("com/android/dialer/hats/DialerHatsEventProcessor$3", "onSuccess", 364, "DialerHatsEventProcessor.java").y("Present HaTS survey with trigger ID = %s", r2.e());
                    defpackage.oqg oqgVar2 = new defpackage.oqg((aogc) obj8, (com.google.android.libraries.surveys.SurveyData) r10, (android.view.View) obj6, (aify) obj9, 2);
                    j$.util.Optional optional2 = ((oqi) ((defpackage.afjo) obj7).c).g;
                    optional2.isPresent();
                    java.lang.Object obj10 = oqgVar2.c;
                    ?? r14 = oqgVar2.b;
                    java.lang.Object obj11 = oqgVar2.a;
                    ?? r15 = oqgVar2.d;
                    boolean z = r14 != 0;
                    java.lang.Object obj12 = optional2.get();
                    ahvr.bN(z, "Survey data is null.");
                    afja afjaVar = afja.b;
                    afiz afizVar = afiz.a;
                    int id = ((android.view.View) obj11).getId();
                    java.lang.Integer num = 340;
                    num.getClass();
                    ((ipc) obj12).bl(new defpackage.afjb((android.app.Activity) ((aogc) obj10).a, id, num, oqi.o, r14, r15, afjaVar, afizVar));
                }
            }
        }
    }

    public afjo(afjq afjqVar, amhi amhiVar, apdh apdhVar, int i) {
        this.$cid = i;
        this.a = amhiVar;
        this.b = apdhVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.c = afjqVar;
    }

    public afjo(afjq afjqVar, amhi amhiVar, apdh apdhVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = amhiVar;
        this.b = apdhVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.c = afjqVar;
    }

    public afjo(afjq afjqVar, amhk amhkVar, apdh apdhVar, int i) {
        this.$cid = i;
        this.a = amhkVar;
        this.b = apdhVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.c = afjqVar;
    }

    public afjo(afjq afjqVar, amhk amhkVar, apdh apdhVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = amhkVar;
        this.b = apdhVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.c = afjqVar;
    }

    public afjo(akdb akdbVar, ajcq ajcqVar, akdq akdqVar, int i) {
        this.$cid = i;
        this.c = ajcqVar;
        this.a = akdqVar;
        j$.util.Objects.requireNonNull(akdbVar);
        this.b = akdbVar;
    }
}
