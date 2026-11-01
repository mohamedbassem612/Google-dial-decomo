package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aflu implements defpackage.afjw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aflu(java.lang.Object obj, java.lang.String str, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = str;
    }

    @Override // defpackage.afjw
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            apdh apdhVar = new apdh();
            com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment systemInfoDialogFragment = new com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment();
            android.os.Bundle bundle = new android.os.Bundle(2);
            java.lang.String str = this.a;
            bundle.putString("EXTRA_ACCOUNT_NAME", str);
            defpackage.aflv aflvVar = (defpackage.aflv) this.b;
            bundle.putBundle("EXTRA_PSD_BUNDLE", afjz.b(aflvVar.e.c));
            systemInfoDialogFragment.au(bundle);
            bo boVar = aflvVar.w;
            systemInfoDialogFragment.q(boVar, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            boVar.af();
            aehj.C(apdhVar, aflvVar.u, str);
            return;
        }
        if (i != 1) {
            apdh apdhVar2 = new apdh();
            com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment systemInfoDialogFragment2 = new com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment();
            android.os.Bundle bundle2 = new android.os.Bundle(2);
            java.lang.String str2 = this.a;
            bundle2.putString("EXTRA_ACCOUNT_NAME", str2);
            defpackage.afjf afjfVar = (defpackage.afjf) this.b;
            bundle2.putBundle("EXTRA_PSD_BUNDLE", afjz.b(afjfVar.f.c));
            systemInfoDialogFragment2.au(bundle2);
            bo boVar2 = afjfVar.m;
            systemInfoDialogFragment2.q(boVar2, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            boVar2.af();
            aehj.C(apdhVar2, afjfVar.a(), str2);
            return;
        }
        apdh apdhVar3 = new apdh();
        defpackage.afky afkyVar = (defpackage.afky) this.b;
        az azVar = afkyVar.e;
        boolean z = azVar instanceof az;
        java.lang.String str3 = this.a;
        if (z) {
            bo boVarA = azVar.a();
            com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment systemInfoDialogFragment3 = new com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment();
            android.os.Bundle bundle3 = new android.os.Bundle(2);
            bundle3.putString("EXTRA_ACCOUNT_NAME", str3);
            bundle3.putBundle("EXTRA_PSD_BUNDLE", afjz.b(afkyVar.c.c));
            systemInfoDialogFragment3.au(bundle3);
            systemInfoDialogFragment3.q(boVarA, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            boVarA.af();
        } else {
            android.app.FragmentTransaction fragmentTransactionBeginTransaction = azVar.getFragmentManager().beginTransaction();
            com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment platformSystemInfoDialogFragment = new com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment();
            android.os.Bundle bundle4 = new android.os.Bundle(2);
            bundle4.putString("EXTRA_ACCOUNT_NAME", str3);
            bundle4.putBundle("EXTRA_PSD_BUNDLE", afjz.b(afkyVar.c.c));
            platformSystemInfoDialogFragment.setArguments(bundle4);
            fragmentTransactionBeginTransaction.add(platformSystemInfoDialogFragment, "com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        aehj.C(apdhVar3, afkyVar.d, str3);
    }
}
