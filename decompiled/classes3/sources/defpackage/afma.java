package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afma {
    public final defpackage.amip a;
    public final com.google.android.libraries.surveys.internal.model.Answer b;
    public final boolean c;
    public final java.lang.Integer d;
    public final java.lang.String e;
    public final amje f;
    public final int g;
    public final java.lang.Integer h;
    public final defpackage.afiz i;
    public final boolean j;
    public final boolean k;
    public final defpackage.afjk l;
    public final android.os.Bundle m;
    public final int n;
    public final boolean o;

    public afma(defpackage.amip amipVar, com.google.android.libraries.surveys.internal.model.Answer answer, boolean z, java.lang.Integer num, java.lang.String str, amje amjeVar, int i, java.lang.Integer num2, defpackage.afiz afizVar, boolean z2, boolean z3, defpackage.afjk afjkVar, android.os.Bundle bundle, int i2, boolean z4) {
        this.a = amipVar;
        this.b = answer;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = amjeVar;
        this.g = i;
        this.h = num2;
        this.i = afizVar;
        this.j = z2;
        this.k = z3;
        this.l = afjkVar;
        this.m = bundle;
        this.n = i2;
        this.o = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afma) {
            defpackage.afma afmaVar = (defpackage.afma) obj;
            if (this.a.equals(afmaVar.a) && this.b.equals(afmaVar.b) && this.c == afmaVar.c && ((num = this.d) != null ? num.equals(afmaVar.d) : afmaVar.d == null) && this.e.equals(afmaVar.e) && this.f.equals(afmaVar.f) && this.g == afmaVar.g && ((num2 = this.h) != null ? num2.equals(afmaVar.h) : afmaVar.h == null) && this.i.equals(afmaVar.i) && this.j == afmaVar.j && this.k == afmaVar.k && this.l.equals(afmaVar.l) && this.m.equals(afmaVar.m) && this.n == afmaVar.n && this.o == afmaVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.Integer num = this.d;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        java.lang.Integer num2 = this.h;
        return ((((((((((((((iHashCode2 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ (true != this.o ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        android.os.Bundle bundle = this.m;
        defpackage.afjk afjkVar = this.l;
        defpackage.afiz afizVar = this.i;
        amje amjeVar = this.f;
        com.google.android.libraries.surveys.internal.model.Answer answer = this.b;
        return "SurveyQuestionsContainerViewArgs{surveyPayload=" + java.lang.String.valueOf(this.a) + ", answer=" + java.lang.String.valueOf(answer) + ", isSubmitting=" + this.c + ", ignoreFirstQuestion=false, logoResId=" + this.d + ", triggerId=" + this.e + ", surveySession=" + java.lang.String.valueOf(amjeVar) + ", startingQuestionIndex=" + this.g + ", currentItem=" + this.h + ", surveyCompletionStyle=" + java.lang.String.valueOf(afizVar) + ", hideCloseButton=" + this.j + ", keepNextButtonForLastQuestion=" + this.k + ", surveyStyle=" + java.lang.String.valueOf(afjkVar) + ", singleSelectOrdinalAnswerMappings=" + java.lang.String.valueOf(bundle) + ", embeddedThemeOverlay=" + this.n + ", embeddedCardElevationEnabled=" + this.o + '}';
    }

    public afma() {
        throw null;
    }
}
