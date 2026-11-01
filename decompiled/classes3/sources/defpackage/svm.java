package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svm {
    public static final aimz a = aimz.i("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider");
    public final android.content.Context c;
    public final ajct d;
    public final ajcu e;
    public final ojo g;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();
    public final ahzi f = ahvr.bI(new exm(this, 15));

    public svm(android.content.Context context, ajct ajctVar, ajcu ajcuVar, ojo ojoVar) {
        this.c = context;
        this.d = ajctVar;
        this.e = ajcuVar;
        this.g = ojoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final defpackage.svo a(boolean z, java.lang.String str, java.lang.String str2, android.content.ComponentName componentName) {
        defpackage.taq taqVar = (defpackage.taq) this.b.get();
        if (taqVar == null || !android.text.TextUtils.equals(str, taqVar.a)) {
            a.b().l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "constructUpspUpdateSimHistory", 376, "MotoSuggestionProvider.java").v("last suggestion not for reported number");
            return new defpackage.svo(z, str, str2, componentName, null, null, 0);
        }
        android.os.Bundle bundle = (android.os.Bundle) taqVar.b;
        return new defpackage.svo(z, str, str2, componentName, bundle.getString("suggested_phone_account_id"), (android.content.ComponentName) bundle.getParcelable("suggested_phone_account_component_name"), bundle.getInt("suggestion_rule"));
    }
}
