package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class EmbeddedSurveyFragment extends aw implements defpackage.aflw, defpackage.afly {
    static final j$.time.Duration a = j$.time.Duration.ofMinutes(1);
    private defpackage.afjf ak;
    j$.time.Duration b;
    public defpackage.afma c;
    public boolean d;
    private final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final android.view.View M(android.view.LayoutInflater r36, android.view.ViewGroup r37, android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment.M(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.afls
    public final bo a() {
        return I();
    }

    @Override // defpackage.afly
    public final void aU(java.lang.String str) {
        defpackage.agby.q(H().getWindow().findViewById(android.R.id.content), str, -1).h();
    }

    @Override // defpackage.afls
    public final boolean aW() {
        return true;
    }

    @Override // defpackage.afls
    public final boolean aX() {
        return this.ak.l();
    }

    @Override // defpackage.afkl
    public final void aY() {
        this.ak.j(false);
    }

    public final void ai() {
        this.e.removeCallbacksAndMessages(null);
        super.ai();
    }

    @Override // defpackage.aflw
    public final /* bridge */ /* synthetic */ android.app.Activity b() {
        return super.G();
    }

    @Override // defpackage.afls
    public final void c() {
        if (this.b != null) {
            this.d = true;
            android.os.Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new aetv(this, 18), this.b.toMillis());
        }
    }

    @Override // defpackage.afls
    public final void f() {
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.ak.b(2131429155);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        android.os.Bundle bundle2 = ((aw) this).m;
        if (bundle2 == null || !bundle2.containsKey("EmbeddedSurveyAutoCloseDelay")) {
            return;
        }
        j$.time.Duration serializable = bundle2.getSerializable("EmbeddedSurveyAutoCloseDelay");
        if (serializable instanceof j$.time.Duration) {
            j$.time.Duration duration = serializable;
            if (duration.isNegative()) {
                return;
            }
            j$.time.Duration duration2 = a;
            if (duration.compareTo(duration2) > 0) {
                duration = duration2;
            }
            this.b = duration;
        }
    }

    public final void k(android.os.Bundle bundle) {
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.ak.e;
        bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? ((androidx.viewpager.widget.ViewPager) surveyViewPager).d : 0);
        bundle.putBoolean("IsSubmitting", this.ak.j);
        bundle.putParcelable("Answer", this.ak.f);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", this.ak.g);
        bundle.putBoolean("STATE_IS_AUTO_CLOSE_PENDING", this.d);
    }

    @Override // defpackage.afkl
    public final void p() {
        this.ak.g();
    }

    @Override // defpackage.afkm
    public final void q(boolean z, aw awVar) {
        defpackage.afjf afjfVar = this.ak;
        if (afjfVar.j || defpackage.afmc.k(awVar) != ((androidx.viewpager.widget.ViewPager) afjfVar.e).d || afjfVar.k.k) {
            return;
        }
        afjfVar.h(z);
    }

    @Override // defpackage.afkl
    public final void t(boolean z) {
        this.ak.h(z);
    }

    @Override // defpackage.afly
    public final void aV() {
    }

    @Override // defpackage.afly
    public final void r() {
    }

    @Override // defpackage.afly
    public final void s() {
    }
}
