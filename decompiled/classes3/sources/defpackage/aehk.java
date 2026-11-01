package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aehk extends defpackage.aehl {
    public static final aehj Companion = new aehj();
    public static final int NEXT_REQUEST_CODE = 10000;
    private final java.util.Set allowedResults;

    public aehk(java.util.Collection collection) {
        aooh.f(collection, "allowedResults");
        this.allowedResults = ajsz.cf(collection);
    }

    public static /* synthetic */ void finishAction$default(defpackage.aehk aehkVar, android.app.Activity activity, java.lang.Enum r2, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishAction");
        }
        if ((i & 4) != 0) {
            intent = null;
        }
        aehkVar.finishAction(activity, r2, intent);
    }

    public static /* synthetic */ void nextAction$default(defpackage.aehk aehkVar, android.app.Activity activity, java.lang.Enum r2, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextAction");
        }
        if ((i & 4) != 0) {
            intent = null;
        }
        aehkVar.nextAction(activity, r2, intent);
    }

    public static /* synthetic */ void setResult$default(defpackage.aehk aehkVar, android.app.Activity activity, java.lang.Enum r2, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResult");
        }
        if ((i & 4) != 0) {
            intent = null;
        }
        aehkVar.setResult(activity, r2, intent);
    }

    public final void finishAction(android.app.Activity activity, java.lang.Enum r8) {
        aooh.f(activity, "activity");
        aooh.f(r8, "result");
        finishAction$default(this, activity, r8, null, 4, null);
    }

    public /* synthetic */ java.lang.Enum fromResultCode(int i) {
        java.lang.Object next;
        java.util.Iterator it = getAllowedResults().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((defpackage.aehi) ((java.lang.Enum) next)).a() != i);
        if (next != null) {
            return (java.lang.Enum) next;
        }
        throw new java.lang.IllegalArgumentException("Result code " + i + " is not declared in " + getClass().getName() + ". Allowed: " + ajsz.cr(getAllowedResults(), (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.acsb(18), 31));
    }

    public final java.util.Set getAllowedResults() {
        return this.allowedResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nextAction(android.app.Activity activity, java.lang.Enum r4, android.content.Intent intent) {
        aooh.f(activity, "activity");
        aooh.f(r4, "result");
        defpackage.aehi aehiVar = (defpackage.aehi) r4;
        activity.setResult(aehiVar.a(), intent);
        android.content.Intent intent2 = activity.getIntent();
        int iA = aehiVar.a();
        android.content.Intent intent3 = new android.content.Intent("com.android.wizard.NEXT");
        defpackage.aftt.w(intent2, intent3);
        intent3.putExtra("com.android.setupwizard.ResultCode", iA);
        if (intent != null && intent.getExtras() != null) {
            intent3.putExtras(intent.getExtras());
        }
        intent3.putExtra("theme", intent2.getStringExtra("theme"));
        activity.startActivityForResult(intent3, NEXT_REQUEST_CODE);
    }

    public final void setResult(android.app.Activity activity, java.lang.Enum r8) {
        aooh.f(activity, "activity");
        aooh.f(r8, "result");
        setResult$default(this, activity, r8, null, 4, null);
    }

    public final void finishAction(android.app.Activity activity) {
        aooh.f(activity, "activity");
        activity.setResult(0);
        activity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setResult(android.app.Activity activity, java.lang.Enum r2, android.content.Intent intent) {
        aooh.f(activity, "activity");
        aooh.f(r2, "result");
        activity.setResult(((defpackage.aehi) r2).a(), intent);
    }

    public final void finishAction(android.app.Activity activity, java.lang.Enum r3, android.content.Intent intent) {
        aooh.f(activity, "activity");
        aooh.f(r3, "result");
        nextAction(activity, r3, intent);
        activity.finish();
    }

    public final void nextAction(android.app.Activity activity, java.lang.Enum r8) {
        aooh.f(activity, "activity");
        aooh.f(r8, "result");
        nextAction$default(this, activity, r8, null, 4, null);
    }
}
