package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmb {
    public final java.lang.String a;
    public final int b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public com.google.android.wizardmanager.WizardBranchArray i = new com.google.android.wizardmanager.WizardBranchArray();
    public com.google.android.wizardmanager.WizardActionDependency j;
    public com.google.android.wizardmanager.WizardActionDependency k;
    public com.android.onboarding.config.OnboardingConfig l;
    public boolean m;

    public agmb(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void a(com.google.android.wizardmanager.WizardActionDependency wizardActionDependency) {
        if (wizardActionDependency != null) {
            this.j = wizardActionDependency;
        }
    }

    public final void b(com.google.android.wizardmanager.WizardActionDependency wizardActionDependency) {
        if (wizardActionDependency != null) {
            this.k = wizardActionDependency;
        }
    }
}
