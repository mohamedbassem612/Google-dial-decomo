package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afji {
    public static final defpackage.afji a = new defpackage.afji();
    public final java.util.Map b = new java.util.HashMap();
    public final java.util.Map c = new java.util.HashMap();
    public final java.util.Map d = new java.util.HashMap();
    public final java.util.Map e = new java.util.HashMap();
    public final java.util.Map f = new java.util.HashMap();

    public final com.google.android.libraries.surveys.internal.model.SurveyDataImpl a(java.lang.String str) {
        return (com.google.android.libraries.surveys.internal.model.SurveyDataImpl) this.d.get(str);
    }

    public final void b(java.lang.String str) {
        this.f.remove(str);
    }

    public final gus c(java.lang.String str) {
        return (gus) this.f.get(str);
    }
}
