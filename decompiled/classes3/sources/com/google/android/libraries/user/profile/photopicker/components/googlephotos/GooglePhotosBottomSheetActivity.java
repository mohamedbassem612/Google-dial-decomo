package com.google.android.libraries.user.profile.photopicker.components.googlephotos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GooglePhotosBottomSheetActivity extends defpackage.afnz {
    public static final aimz n = aimz.i("com/google/android/libraries/user/profile/photopicker/components/googlephotos/GooglePhotosBottomSheetActivity");
    public java.lang.String o;
    public defpackage.acmg p;
    public int q;
    public defpackage.vaa r;

    @Override // defpackage.afnz
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int iK = anar.k(getIntent().getIntExtra("com.google.profile.photopicker.HOST_SURFACE", -1));
        if (iK == 0) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.Object objC = dvh.c(getIntent(), "com.google.profile.photopicker.ACCOUNT", android.accounts.Account.class);
        if (objC == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        android.accounts.Account account = (android.accounts.Account) objC;
        if (!aooh.n(account.type, "com.google")) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        akzx akzxVarM = defpackage.akpg.a.m();
        int i = this.q;
        if (i == 0) {
            aooh.j("hostApp");
            i = 0;
        }
        akzxVarM.u();
        defpackage.akpg akpgVar = (defpackage.akpg) akzxVarM.b;
        int i2 = i - 1;
        java.lang.String str = null;
        if (i == 0) {
            throw null;
        }
        akpgVar.c = i2;
        akpgVar.b |= 1;
        akzxVarM.u();
        defpackage.akpg akpgVar2 = (defpackage.akpg) akzxVarM.b;
        akpgVar2.d = iK - 1;
        akpgVar2.b |= 4;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.akpg akpgVar3 = (defpackage.akpg) aladVarP;
        akzx akzxVarM2 = defpackage.akoq.a.m();
        java.lang.String str2 = this.o;
        if (str2 == null) {
            aooh.j("version");
        } else {
            str = str2;
        }
        akzxVarM2.u();
        defpackage.akoq akoqVar = (defpackage.akoq) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        akoqVar.b |= 1;
        akoqVar.c = str;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        nn.a(this, new cja(1512435812, true, new afnd(this, account, akpgVar3, (defpackage.akoq) aladVarP2)));
    }
}
